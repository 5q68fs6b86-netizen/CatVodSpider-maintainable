package com.github.catvod.spider;

import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.AesCbc;
import com.github.catvod.utils.Util;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 球通体育。播放地址 Base64 编解码来自 jar C0082a.m808af/m811at。
 */
public class QiutongTY extends Spider {

    private static final String API = "https://aapi2.xbncs.com/api";

    private Map<String, String> headers() {
        Map<String, String> h = new HashMap<>();
        h.put("User-Agent", Util.CHROME);
        return h;
    }

    private static String opt(JSONObject o, String k) {
        if (o == null || !o.has(k)) return "";
        String v = o.optString(k);
        return "null".equals(v) ? "" : v;
    }

    @Override
    public String homeContent(boolean filter) {
        List<Class> classes = new ArrayList<>();
        classes.add(new Class("-1", "全部"));
        classes.add(new Class("1", "足球"));
        classes.add(new Class("2", "篮球"));
        return Result.string(classes, new ArrayList<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        if ("-1".equals(tid)) tid = "";
        String url = API + "/room/page?roomType=&navId=" + tid + "&roomId=&word=&page=" + pg + "&pageSize=30&channelId=3&platform=1";
        JSONObject data = new JSONObject(OkHttp.string(url, headers())).optJSONObject("data");
        JSONArray arr = data != null ? data.optJSONArray("list") : null;
        List<Vod> list = new ArrayList<>();
        if (arr != null) {
            for (int i = 0; i < arr.length(); i++) {
                JSONObject o = arr.getJSONObject(i);
                list.add(new Vod(opt(o, "roomId"), opt(o, "title"), opt(o, "cover"), opt(o, "navName")));
            }
        }
        int page = Integer.parseInt(pg);
        int pagecount = (int) Math.ceil(((double) Integer.MAX_VALUE) / 30d);
        return Result.get().vod(list).page(page, pagecount, 30, Integer.MAX_VALUE).string();
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String url = API + String.format("/room/info?roomId=%s&channelId=3&platform=1", ids.get(0));
        JSONObject data = new JSONObject(OkHttp.string(url, headers())).optJSONObject("data");
        if (data == null) return Result.error("Missing data field");
        List<String> plays = new ArrayList<>();
        String push = opt(data, "pushUrl");
        if (!TextUtils.isEmpty(push)) plays.add("flv$" + AesCbc.b64encode(push));
        String pull = opt(data, "pullUrl");
        if (!TextUtils.isEmpty(pull)) plays.add("m3u8$" + AesCbc.b64encode(pull));
        if (plays.isEmpty()) return Result.error("暂无播放数据");
        Vod vod = new Vod();
        vod.setVodName(opt(data, "title"));
        vod.setVodPic(opt(data, "cover"));
        vod.setVodContent(opt(data, "description"));
        vod.setTypeName(opt(data, "nickName"));
        vod.setVodPlayFrom("球通");
        vod.setVodPlayUrl(TextUtils.join("#", plays));
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        String url = AesCbc.b64decode(id);
        if (url == null) url = id;
        return Result.get().url(url).string();
    }
}
