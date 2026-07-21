package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 聚合盘搜 iyuns。来自 jar 反编译 JuheSo。
 */
public class JuheSo extends Pan {

    private static final HashMap<String, JsonElement> CACHE = new HashMap<>();

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
    }

    private static void clearCache() {
        synchronized (CACHE) {
            CACHE.clear();
        }
    }

    private static String searchPage1(String key) {
        try {
            clearCache();
            String url = "https://api.iyuns.com/api/wpysso?kw=" + PanSearchSupport.encode(key)
                    + "&cloud_types=aliyun,quark,uc,baidu,xunlei,tianyi,123,mobile";
            JsonObject root = JsonParser.parseString(PanSearchSupport.get(url)).getAsJsonObject();
            if (root.get("code").getAsInt() != 0) return new JsonObject().toString();
            JsonObject merged = root.getAsJsonObject("data").getAsJsonObject("merged_by_type");
            JsonArray folders = new JsonArray();
            for (Object __en_e : merged.entrySet()) { Map.Entry e = (Map.Entry) __en_e;
                synchronized (CACHE) {
                    CACHE.put(String.valueOf(e.getKey()) + "_json", (com.google.gson.JsonElement) e.getValue());
                }
                JsonObject item = new JsonObject();
                item.addProperty("vod_id", String.valueOf(e.getKey()));
                int size = ((com.google.gson.JsonElement) e.getValue()).getAsJsonArray().size();
                item.addProperty("vod_name", PanSearchSupport.typeName(String.valueOf(e.getKey())) + " (" + size + "个)");
                item.addProperty("vod_pic", PanSearchSupport.typePic(String.valueOf(e.getKey())));
                item.addProperty("vod_tag", "folder");
                JsonObject style = new JsonObject();
                style.addProperty("type", "list");
                item.add("style", style);
                folders.add(item);
            }
            JsonObject out = new JsonObject();
            out.add("list", folders);
            return out.toString();
        } catch (Exception e) {
            return new JsonObject().toString();
        }
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        if (!TextUtils.isEmpty(pg) && Integer.parseInt(pg) > 1) return "{\"list\":[]}";
        JsonElement cached;
        synchronized (CACHE) {
            cached = CACHE.get(tid + "_json");
        }
        if (cached == null) return "{\"list\":[]}";
        JsonArray arr = cached.getAsJsonArray();
        JsonArray list = new JsonArray();
        for (int i = 0; i < arr.size(); i++) {
            JsonObject src = arr.get(i).getAsJsonObject();
            JsonObject o = new JsonObject();
            o.add("vod_id", src.get("url"));
            o.add("vod_name", src.get("note"));
            o.add("vod_remarks", src.get("source"));
            String pic = "";
            JsonElement images = src.get("images");
            if (images != null && images.isJsonArray() && images.getAsJsonArray().size() > 0) {
                pic = images.getAsJsonArray().get(0).getAsString();
            }
            o.addProperty("vod_pic", pic);
            list.add(o);
        }
        JsonObject out = new JsonObject();
        out.add("list", list);
        return out.toString();
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        return super.detailContent(Collections.singletonList(ids.get(0)));
    }

    @Override
    public String searchContent(String key, boolean quick) {
        return searchPage1(key);
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) {
        if (!"1".equals(pg)) return new JsonObject().toString();
        return searchPage1(key);
    }
}
