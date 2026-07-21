package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;

import org.json.JSONArray;
import org.json.JSONObject;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 米搜盘搜索。site 列表来自 extend JSON。逻辑来自 jar 反编译 MiSou。
 */
public class MiSou extends Pan {

    private String site;

    private Map<String, String> headers() {
        Map<String, String> h = new HashMap<>();
        h.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        if (site != null) h.put("Referer", site);
        return h;
    }

    private static String pic(String type) {
        if ("QUARK".equals(type)) return PanSearchSupport.PIC_QUARK;
        if ("BDY".equals(type)) return PanSearchSupport.PIC_BAIDU;
        if ("UC".equals(type)) return PanSearchSupport.PIC_UC;
        return "";
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
        if (extend == null || extend.isEmpty()) return;
        JSONArray sites = new JSONObject(extend).getJSONArray("site");
        for (int i = 0; i < sites.length(); i++) {
            String candidate = sites.getString(i).trim();
            if (candidate.isEmpty()) continue;
            try {
                HttpURLConnection conn = (HttpURLConnection) new URL(candidate).openConnection();
                conn.setInstanceFollowRedirects(true);
                conn.setConnectTimeout(10000);
                conn.setReadTimeout(10000);
                conn.setRequestMethod("HEAD");
                int code = conn.getResponseCode();
                conn.disconnect();
                if (code >= 200 && code < 400) {
                    this.site = candidate;
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private String search(String key) {
        try {
            if (site == null || site.isEmpty()) return Result.string(new ArrayList<>());
            String url = site + "/api/disks/search?keyword=" + PanSearchSupport.encode(key) + "&last_weight=0&last_id=0";
            JSONArray data = new JSONObject(OkHttp.string(url, headers())).optJSONArray("data");
            List<Vod> list = new ArrayList<>();
            if (data == null) return Result.string(list);
            for (int i = 0; i < data.length(); i++) {
                JSONObject o = data.optJSONObject(i);
                if (o == null) continue;
                String type = o.optString("disk_type", "");
                list.add(new Vod(o.optString("disk_url"), o.optString("disk_name"), pic(type), type + "网盘"));
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
