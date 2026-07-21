package com.github.catvod.spider;

import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Util;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 蜻蜓 FM。接口来自单线路 jar 反编译 QingtingFM。
 */
public class QingtingFM extends Spider {

    private static final String HOST = "https://www.qtfm.cn";
    private static final String BFF = "https://webbff.qtfm.cn/www";
    private static final String API = "https://webapi.qtfm.cn/api/pc/radio/";
    private static final String LIVE = "https://lhttp-hw.qtfm.cn/live/";

    private Map<String, String> headers() {
        Map<String, String> h = new HashMap<>();
        h.put("User-Agent", Util.CHROME);
        h.put("Referer", HOST);
        return h;
    }

    private String postGraph(String queryJson) {
        return OkHttp.post(BFF, queryJson, headers()).getBody();
    }

    @Override
    public String homeContent(boolean filter) {
        List<String> ids = Arrays.asList(
                "217", "99", "3", "5", "7", "83", "19", "31", "44", "59", "69", "85",
                "111", "129", "139", "151", "169", "187", "202", "239", "254", "257",
                "259", "281", "291", "316", "327", "351", "357", "308", "342", "433",
                "442", "429", "439", "432", "441", "430", "431", "440", "438", "435",
                "436", "434"
        );
        List<String> names = Arrays.asList(
                "广东", "浙江", "北京", "天津", "河北", "上海", "山西", "内蒙古", "辽宁", "吉林",
                "黑龙江", "江苏", "安徽", "福建", "江西", "山东", "河南", "湖北", "湖南", "广西",
                "海南", "重庆", "四川", "贵州", "云南", "陕西", "甘肃", "宁夏", "新疆", "西藏",
                "青海", "资讯", "音乐", "交通", "经济", "文艺", "都市", "体育", "双语", "综合",
                "生活", "旅游", "曲艺", "方言"
        );
        List<Class> classes = new ArrayList<>();
        for (int i = 0; i < ids.size(); i++) classes.add(new Class(ids.get(i), names.get(i)));
        return Result.string(classes, new ArrayList<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        if (extend != null && extend.get("cateId") != null) tid = extend.get("cateId");
        String body = "{\"query\":\"{\\n    radioPage(cid:" + tid + ", page:" + pg + "){\\n      contents\\n    }\\n  }\"}";
        JSONObject root = new JSONObject(postGraph(body));
        JSONArray items = root.getJSONObject("data").getJSONObject("radioPage").getJSONObject("contents").getJSONArray("items");
        List<Vod> list = new ArrayList<>();
        for (int i = 0; i < items.length(); i++) {
            JSONObject o = items.getJSONObject(i);
            String pic = o.optString("imgUrl");
            if (!pic.contains("https")) pic = "https:" + pic;
            list.add(new Vod(o.optString("id"), o.optString("title"), pic, o.optString("desc")));
        }
        int page = Integer.parseInt(pg);
        int pagecount = list.size() < 12 ? page : page + 1;
        return Result.get().vod(list).page(page, pagecount, 12, 0).string();
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String id = ids.get(0);
        JSONObject album = new JSONObject(OkHttp.string(API + id, headers())).getJSONObject("album");
        Vod vod = new Vod();
        vod.setVodId(id);
        vod.setVodName(album.getString("title"));
        vod.setVodPic(album.getString("cover"));
        vod.setVodContent(album.optString("description"));
        vod.setVodPlayFrom("蜻蜓FM");
        vod.setVodPlayUrl(album.getString("title") + "$" + album.getString("id"));
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        String url = LIVE + id + "/64k.mp3";
        return Result.get().url(url).header(headers()).string();
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return searchContent(key, quick, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        String body = "{\"query\":\"{\\n        searchResultsPage(keyword:\\\"" + key + "\\\", page:" + pg + ", include:\\\"channel_live\\\" ) {\\n          tdk,\\n          searchData,\\n          numFound\\n        }\\n      }\"}";
        JSONArray arr = new JSONObject(postGraph(body)).getJSONObject("data").getJSONObject("searchResultsPage").getJSONArray("searchData");
        List<Vod> list = new ArrayList<>();
        for (int i = 0; i < arr.length(); i++) {
            JSONObject o = arr.getJSONObject(i);
            list.add(new Vod(o.optString("id"), o.optString("title"), o.optString("cover"), o.optString("description")));
        }
        return Result.string(list);
    }
}
