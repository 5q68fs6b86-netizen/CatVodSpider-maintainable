package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.util.ArrayList;
import java.util.List;

/**
 * 百度盘搜索（kuleu bddj）。来自 jar 反编译 Baiku。
 */
public class Baiku extends Pan {

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
    }

    private static String search(String key) {
        try {
            String url = "https://api.kuleu.com/api/bddj?text=" + PanSearchSupport.encode(key);
            String body = PanSearchSupport.get(url);
            JsonArray data = JsonParser.parseString(body).getAsJsonObject().getAsJsonArray("data");
            List<Vod> list = new ArrayList<>();
            for (JsonElement el : data) {
                JsonObject o = el.getAsJsonObject();
                String name = o.get("name").getAsString();
                if (!name.contains(key)) continue;
                list.add(new Vod(o.get("viewlink").getAsString(), name, PanSearchSupport.PIC_BAIDU, o.get("addtime").getAsString()));
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
