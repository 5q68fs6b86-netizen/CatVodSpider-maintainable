package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * 鬼鬼短剧搜索。来自 jar 反编译 GuiGui。
 */
public class GuiGui extends Pan {

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
    }

    private static String search(String key) {
        try {
            String url = "https://api.guiguiya.com/api/video/duanju?act=search&name=" + PanSearchSupport.encode(key);
            JSONObject root = new JSONObject(PanSearchSupport.get(url));
            if (!"200".equals(root.getString("code"))) return Result.string(new ArrayList<>());
            JSONArray data = root.getJSONArray("data");
            List<Vod> list = new ArrayList<>();
            for (int i = 0; i < data.length(); i++) {
                JSONObject o = data.getJSONObject(i);
                String name = o.getString("name");
                if (!name.contains(key)) continue;
                list.add(new Vod(o.getString("url"), name, o.optString("cover"), "共" + o.optString("episodes") + "集"));
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
