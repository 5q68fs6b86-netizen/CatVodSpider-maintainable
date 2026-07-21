package com.github.catvod.spider;

import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.AesCbc;

import org.json.JSONArray;
import org.json.JSONObject;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/**
 * 瓜子体育。AES key/iv 与 API 来自 jar 反编译 GuaziTY。
 */
public class GuaziTY extends Spider {

    private static final String KEY = "KANGEQIU@8868!~.";
    private static final String IV = "0200010900030207";
    private static final String API = "https://api.46d5umpk.com";

    private static Map<String, String> headers() {
        Map<String, String> h = new HashMap<>();
        h.put("User-Agent", "okhttp/3.12.0");
        h.put("content-type", "application/x-www-form-urlencoded");
        h.put("user-platform", "null");
        h.put("client-version", "3.0.1.1");
        h.put("client-channel", "");
        h.put("token", "");
        return h;
    }

    private static String postEnc(String path, String plainJson) throws Exception {
        Map<String, String> form = new HashMap<>();
        form.put("parameter", AesCbc.encryptBase64(plainJson, KEY, IV));
        String body = OkHttp.post(API + path + "?parameter=key", form, headers()).getBody();
        String data = new JSONObject(body).getString("data");
        return AesCbc.decryptBase64(data, KEY, IV);
    }

    @Override
    public String homeContent(boolean filter) {
        List<Class> classes = new ArrayList<>();
        List<String> ids = Arrays.asList("hot", "nba", "football", "basketball");
        List<String> names = Arrays.asList("热门", "NBA", "足球", "篮球");
        for (int i = 0; i < ids.size(); i++) classes.add(new Class(ids.get(i), names.get(i)));
        return Result.string(classes, new ArrayList<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        if (!"1".equals(pg)) return "";
        Map<String, String> params = new HashMap<>();
        params.put("hot", "{\"frame\":\"0\",\"hot\":\"1\",\"tag\":\"0\",\"type\":\"0\"}");
        params.put("nba", "{\"frame\":\"0\",\"hot\":\"0\",\"tag\":\"37\",\"type\":\"0\"}");
        params.put("football", "{\"frame\":\"0\",\"hot\":\"0\",\"tag\":\"0\",\"type\":\"1\"}");
        params.put("basketball", "{\"frame\":\"0\",\"hot\":\"0\",\"tag\":\"0\",\"type\":\"2\"}");
        if (!params.containsKey(tid)) tid = "all";
        // jar: if not in map uses "all" but map has no "all" → null risk; keep same keys only
        String plain = params.get(tid);
        if (plain == null) plain = params.get("hot");
        JSONArray arr = new JSONArray(postEnc("/gz/live/sports", plain));
        List<Vod> list = new ArrayList<>();
        long min = System.currentTimeMillis() - 86400000L;
        SimpleDateFormat fmt = new SimpleDateFormat("MM-dd HH:mm", Locale.CHINA);
        for (int i = 0; i < arr.length(); i++) {
            JSONObject o = arr.getJSONObject(i);
            long t = o.getLong("match_time") * 1000L;
            if (t < min) continue;
            if (o.getInt("m_status") >= 2) continue;
            String remarks = o.getString("event_name") + " " + fmt.format(new Date(t)) + " " + o.getString("match_status_info");
            int hs = o.getJSONObject("home").getInt("score");
            int vs = o.getJSONObject("visiting").getInt("score");
            if (hs > 0 || vs > 0) remarks = remarks + " 比分" + hs + "-" + vs;
            String name = o.getJSONObject("home").getString("name") + " vs " + o.getJSONObject("visiting").getString("name");
            list.add(new Vod(String.valueOf(o.getInt("mid")), name, o.getJSONObject("home").getString("logo"), remarks));
        }
        return Result.string(list);
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String mid = ids.get(0);
        JSONObject o = new JSONObject(postEnc("/gz/live/detail", "{\"mid\":\"" + mid + "\"}"));
        String name = o.getJSONObject("home").getString("name") + " vs " + o.getJSONObject("visiting").getString("name");
        String remarks = o.getString("match_status_info");
        int hs = o.getJSONObject("home").getInt("score");
        int vs = o.getJSONObject("visiting").getInt("score");
        if (hs > 0 || vs > 0) remarks = remarks + " 比分" + hs + "-" + vs;
        JSONArray lines = o.getJSONArray("live_line");
        List<String> plays = new ArrayList<>();
        for (int i = 0; i < lines.length(); i++) {
            JSONObject l = lines.getJSONObject(i);
            plays.add(l.getString("name") + "$" + l.getString("m3u8"));
        }
        Vod vod = new Vod(mid, name, o.getJSONObject("home").getString("logo"), remarks);
        vod.setVodContent(remarks);
        vod.setVodPlayFrom(" 瓜子 ");
        vod.setVodPlayUrl(TextUtils.join("#", plays));
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        Map<String, String> h = new HashMap<>();
        h.put("User-Agent", "Lavf/57.83.100");
        h.put("Referer", "http://WJiZxLXA2.com/");
        return Result.get().url(id).header(h).string();
    }
}
