package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * funletu 盘搜。来自 jar 反编译 QuPanSo（jadx 失败方法已按字符串常量还原）。
 */
public class QuPanSo extends Pan {

    private static final String API = "https://b.funletu.com/search";

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
    }

    private static String search(String key, String page) {
        try {
            String json = "{\"keyword\":\"" + key + "\",\"categoryid\":0,\"filetypeid\":1,\"courseid\":1,\"page\":"
                    + page + ",\"pageSize\":15,\"sortBy\":\"sort\",\"order\":\"desc\",\"offset\":0}";
            Map<String, String> h = new HashMap<>();
            h.put("content-type", "application/json");
            h.put("Origin", "https://b.funletu.com");
            h.put("Referer", API);
            JSONObject root = new JSONObject(OkHttp.post(API, json, h).getBody());
            if (root.getInt("code") != 200) return Result.string(new ArrayList<>());
            JSONArray arr = root.getJSONObject("data").getJSONArray("list");
            List<Vod> list = new ArrayList<>();
            for (int i = 0; i < arr.length(); i++) {
                JSONObject o = arr.getJSONObject(i);
                String url = o.getString("url");
                String title = o.getString("title").replace("<em>", "").replace("</em>", "");
                String remarks = o.optString("updatetime");
                list.add(new Vod(url, title, PanSearchSupport.picForUrl(url), remarks));
            }
            return Result.string(list);
        } catch (Exception e) {
            return Result.string(new ArrayList<>());
        }
    }

    @Override
    public String searchContent(String key, boolean quick) {
        return search(key, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) {
        return search(key, pg);
    }
}
