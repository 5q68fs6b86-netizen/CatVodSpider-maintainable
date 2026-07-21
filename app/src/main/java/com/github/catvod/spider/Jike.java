package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * uuuka 盘搜/内容。来自 jar 反编译 Jike。
 */
public class Jike extends Pan {

    private static final String API = "https://api.uuuka.com/api";

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
    }

    @Override
    public String homeContent(boolean filter) {
        List<Class> classes = new ArrayList<>();
        List<String> ids = Arrays.asList("movie", "tv", "dongman", "post");
        List<String> names = Arrays.asList("电影", "电视剧", "动漫", "短剧");
        for (int i = 0; i < ids.size(); i++) classes.add(new Class(ids.get(i), names.get(i)));
        return Result.string(classes, new ArrayList<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        JSONObject root = new JSONObject(PanSearchSupport.get(API + "/contents/" + tid + "?page=" + pg + "&limit=20"));
        if (!root.getBoolean("success")) {
            return Result.get().vod(new ArrayList<>()).page(1, 1, 20, 0).string();
        }
        JSONObject data = root.getJSONObject("data");
        JSONArray items = data.getJSONArray("items");
        List<Vod> list = new ArrayList<>();
        for (int i = 0; i < items.length(); i++) {
            JSONObject o = items.getJSONObject(i);
            String link = o.getString("source_link");
            list.add(new Vod(link, PanSearchSupport.cleanTitle(o.getString("title")), PanSearchSupport.picForUrl(link), o.optString("update_time")));
        }
        return Result.get().vod(list)
                .page(data.getInt("page"), data.getInt("total_pages"), 20, data.getInt("total"))
                .string();
    }

    private static String search(String key) {
        try {
            JSONObject root = new JSONObject(PanSearchSupport.get(API + "/search?keyword=" + PanSearchSupport.encode(key) + "&page=1&limit=20"));
            if (!root.getBoolean("success")) return Result.string(new ArrayList<>());
            JSONArray items = root.getJSONObject("data").getJSONArray("items");
            List<Vod> list = new ArrayList<>();
            for (int i = 0; i < items.length(); i++) {
                JSONObject o = items.getJSONObject(i);
                String link = o.getString("source_link");
                list.add(new Vod(link, PanSearchSupport.cleanTitle(o.getString("title")), PanSearchSupport.picForUrl(link), o.optString("update_time")));
            }
            return Result.string(list);
        } catch (Exception e) {
            return Result.string(new ArrayList<>());
        }
    }

    @Override
    public String searchContent(String key, boolean quick) {
        return search(key);
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) {
        return search(key);
    }
}
