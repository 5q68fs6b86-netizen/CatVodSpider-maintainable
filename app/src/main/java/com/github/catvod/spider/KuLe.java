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
 * 夸克等盘搜索（kuleu action）。来自 jar 反编译 KuLe。
 */
public class KuLe extends Pan {

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
    }

    private static String search(String key) {
        try {
            String url = "https://api.kuleu.com/api/action?text=" + PanSearchSupport.encode(key);
            String body = PanSearchSupport.get(url);
            JsonObject root = JsonParser.parseString(body).getAsJsonObject();
            List<Vod> list = new ArrayList<>();
            if (root.get("code").getAsInt() != 200) return Result.string(list);
            JsonArray data = root.getAsJsonArray("data");
            for (JsonElement el : data) {
                JsonObject o = el.getAsJsonObject();
                list.add(new Vod(
                        o.get("viewlink").getAsString(),
                        o.get("name").getAsString(),
                        PanSearchSupport.PIC_QUARK,
                        o.get("addtime").getAsString()
                ));
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
