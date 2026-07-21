package com.github.catvod.spider;

import android.content.Context;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 养生堂（北京时间 btime）
 * 从单线路 spider.jar 逆向后按 FongMi 风格重写。
 */
public class YST extends Spider {

    private static final String LIST_API = "https://pc.api.btime.com/btimeweb/infoFlow";
    private static final String PLAY_API = "https://app.api.btime.com/video/play";
    private static final String PREFIX = "btv_08da67cea600bf3c78973427bfaba12d_s0_";

    private Map<String, String> headers() {
        Map<String, String> h = new HashMap<>();
        h.put("User-Agent", Util.CHROME);
        h.put("Referer", "https://www.btime.com/");
        return h;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        int year = 2026;
        for (int y = year; y >= 2018; y--) {
            classes.add(new Class(PREFIX + y, String.valueOf(y)));
        }
        return Result.string(classes, new ArrayList<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        String url = LIST_API + "?list_id=" + tid + "&refresh=1&count=2000&expands=pageinfo";
        JSONObject root = new JSONObject(OkHttp.string(url, headers()));
        if (root.optInt("errno") != 0) return Result.string(new ArrayList<>());
        JSONObject data = root.optJSONObject("data");
        if (data == null) return Result.string(new ArrayList<>());
        JSONArray list = data.optJSONArray("list");
        if (list == null) return Result.string(new ArrayList<>());

        List<Vod> vods = new ArrayList<>();
        for (int i = 0; i < list.length(); i++) {
            JSONObject item = list.optJSONObject(i);
            if (item == null) continue;
            String id = item.optString("gid");
            JSONObject body = item.optJSONObject("data");
            if (body == null || TextUtils.isEmpty(id)) continue;
            String name = body.optString("title");
            String pic = "";
            JSONArray covers = body.optJSONArray("covers");
            if (covers != null && covers.length() > 0) pic = covers.optString(0);
            String remarks = "";
            JSONArray corner = body.optJSONArray("corner");
            if (corner != null && corner.length() > 0) {
                JSONObject c0 = corner.optJSONObject(0);
                if (c0 != null) remarks = c0.optString("text");
            }
            vods.add(new Vod(id, name, pic, remarks));
        }
        return Result.get().vod(vods).page(1, 1, vods.size(), vods.size()).string();
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String id = ids.get(0);
        String url = PLAY_API + "?id=" + id;
        JSONObject root = new JSONObject(OkHttp.string(url, headers()));
        if (root.optInt("errno") != 0) return Result.string(new ArrayList<>());
        JSONObject data = root.optJSONObject("data");
        if (data == null) return Result.string(new ArrayList<>());

        String pic = data.optString("video_covers");
        String play = "";
        JSONArray streams = data.optJSONArray("video_stream");
        if (streams != null && streams.length() > 0) {
            JSONObject s0 = streams.optJSONObject(0);
            if (s0 != null) play = s0.optString("stream_url");
        }

        Vod vod = new Vod();
        vod.setVodId(id);
        vod.setVodName("");
        vod.setVodPic(pic);
        vod.setVodPlayFrom("养生堂");
        vod.setVodPlayUrl("养生堂$" + play);
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        if (TextUtils.isEmpty(id)) return Result.get().url("").string();
        return Result.get().url(id).string();
    }
}
