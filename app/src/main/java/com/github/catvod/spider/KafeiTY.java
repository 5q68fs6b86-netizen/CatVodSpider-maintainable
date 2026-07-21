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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 咖啡体育。接口来自单线路 jar 反编译 KafeiTY。
 */
public class KafeiTY extends Spider {

    private static final String HOST = "https://kafeizhibo.cc";

    private Map<String, String> headers() {
        Map<String, String> h = new HashMap<>();
        h.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
        h.put("Accept", "application/json");
        return h;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
    }

    @Override
    public String homeContent(boolean filter) {
        List<Class> classes = new ArrayList<>();
        List<String> ids = Arrays.asList("hot", "1", "2");
        List<String> names = Arrays.asList("热门", "足球", "篮球");
        for (int i = 0; i < ids.size(); i++) classes.add(new Class(ids.get(i), names.get(i)));
        return Result.string(classes, new ArrayList<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            if (TextUtils.isEmpty(pg)) pg = "1";
            String url = HOST + "/api/v1/schedule?type=" + tid + "&page=" + pg + "&size=30";
            JSONObject root = new JSONObject(OkHttp.string(url, headers()));
            if (root.optInt("code") != 200) return emptyPage(pg);
            JSONArray data = root.getJSONArray("data");
            if (data.length() == 0) return emptyPage(pg);
            List<Vod> list = new ArrayList<>();
            for (int i = 0; i < data.length(); i++) {
                JSONObject item = data.getJSONObject(i);
                JSONObject archor = item.optJSONObject("archor");
                String id = archor != null ? archor.optString("room_id") : "";
                String name = item.optString("home_team") + " VS " + item.optString("away_team");
                list.add(new Vod(id, name, item.optString("home_team_logo"), item.optString("league_name")));
            }
            return Result.get().vod(list).page(Integer.parseInt(pg), 100, 30, 6000).string();
        } catch (Exception e) {
            return emptyPage(TextUtils.isEmpty(pg) ? "1" : pg);
        }
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            String url = HOST + "/api/v1/room/" + ids.get(0);
            JSONObject root = new JSONObject(OkHttp.string(url, headers()));
            if (root.optInt("code") != 200) return Result.string(new ArrayList<>());
            JSONObject data = root.getJSONObject("data");
            JSONObject room = data.getJSONObject("room_info");
            JSONArray signals = data.getJSONArray("signals");
            StringBuilder play = new StringBuilder();
            for (int i = 0; i < signals.length(); i++) {
                JSONObject s = signals.getJSONObject(i);
                if (i > 0) play.append("#");
                play.append(s.getString("name")).append("$").append(s.getString("stream_url"));
            }
            Vod vod = new Vod();
            vod.setVodId(room.getString("room_id"));
            vod.setVodName(room.getString("title"));
            vod.setVodDirector(room.optString("league"));
            vod.setVodActor(room.optString("home_team") + " VS " + room.optString("away_team"));
            vod.setVodPlayFrom("咖啡体育");
            vod.setVodPlayUrl(play.toString());
            return Result.string(vod);
        } catch (Exception e) {
            return Result.string(new ArrayList<>());
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        return Result.get().url(id).string();
    }

    private static String emptyPage(String pg) {
        try {
            return Result.get().vod(new ArrayList<>()).page(Integer.parseInt(pg), 1, 30, 0).string();
        } catch (Exception e) {
            return Result.string(new ArrayList<>());
        }
    }
}
