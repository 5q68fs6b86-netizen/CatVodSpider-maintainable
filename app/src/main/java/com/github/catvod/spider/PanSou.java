package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.utils.Path;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * 自建 PanSou 聚合。URL 来自 TVBox config.json 的 pansouUrl（与 jar 一致）。
 */
public class PanSou extends Pan {

    private static final HashMap<String, JsonElement> CACHE = new HashMap<>();
    private String baseUrl = "";

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
        try {
            // 优先 extend 直接给 base；否则读本地 config.json
            if (!TextUtils.isEmpty(extend) && extend.startsWith("http")) {
                baseUrl = extend.replaceAll("/$", "");
            } else {
                File cfg = Path.tv("config.json");
                if (cfg.exists()) {
                    JsonObject o = JsonParser.parseString(Path.read(cfg)).getAsJsonObject();
                    if (o.has("pansouUrl")) baseUrl = o.get("pansouUrl").getAsString().replace("\\/", "/").replaceAll("/$", "");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void clearCache() {
        synchronized (CACHE) {
            CACHE.clear();
        }
    }

    private String searchPage1(String key) {
        try {
            clearCache();
            if (TextUtils.isEmpty(baseUrl)) return new JsonObject().toString();
            String url = baseUrl + "/api/search?kw=" + PanSearchSupport.encode(key)
                    + "&cloud_types=aliyun,quark,uc,baidu,tianyi,123,xunlei,mobile";
            JsonObject merged = JsonParser.parseString(PanSearchSupport.get(url)).getAsJsonObject()
                    .getAsJsonObject("data").getAsJsonObject("merged_by_type");
            JsonArray folders = new JsonArray();
            for (Object __en : merged.entrySet()) { Map.Entry e = (Map.Entry) __en;
                synchronized (CACHE) {
                    CACHE.put(e.getKey() + "_json", e.getValue());
                }
                JsonObject item = new JsonObject();
                item.addProperty("vod_id", e.getKey());
                int size = e.getValue().getAsJsonArray().size();
                item.addProperty("vod_name", PanSearchSupport.typeName(e.getKey()) + " (" + size + "个)");
                item.addProperty("vod_pic", PanSearchSupport.typePic(e.getKey()));
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
            // jar 字段：url / note / source / images
            if (src.has("url")) o.add("vod_id", src.get("url"));
            else if (src.has("link")) o.add("vod_id", src.get("link"));
            if (src.has("note")) o.add("vod_name", src.get("note"));
            else if (src.has("name")) o.add("vod_name", src.get("name"));
            if (src.has("source")) o.add("vod_remarks", src.get("source"));
            String pic = "";
            if (src.has("images") && src.get("images").isJsonArray() && src.getAsJsonArray("images").size() > 0) {
                pic = src.getAsJsonArray("images").get(0).getAsString();
            } else if (src.has("vod_pic")) {
                pic = src.get("vod_pic").getAsString();
            }
            o.addProperty("vod_pic", pic);
            list.add(o);
        }
        JsonObject out = new JsonObject();
        out.add("list", list);
        return out.toString();
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
