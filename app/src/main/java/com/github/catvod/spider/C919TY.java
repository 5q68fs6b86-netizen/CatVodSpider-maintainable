package com.github.catvod.spider;

import android.content.Context;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 919 体育直播。DEX 原类名 {@code 919TY}（非法 Java 标识符），源码为 C919TY。
 * 接口来自 jar 反编译，未改 URL。
 */
public class C919TY extends Spider {

    private static final String HOST = "https://01cs01.fusk39cd.com";

    private Map<String, String> headers() {
        Map<String, String> h = new HashMap<>();
        h.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
        return h;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
    }

    @Override
    public String homeContent(boolean filter) {
        List<Class> classes = new ArrayList<>();
        classes.add(new Class("1", "全部"));
        classes.add(new Class("2", "足球"));
        classes.add(new Class("3", "篮球"));
        return Result.string(classes, new ArrayList<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            JSONObject root = new JSONObject(OkHttp.string(HOST + "/api/web/live_lists/" + tid, headers()));
            if (root.getInt("code") != 200) return empty(pg);
            JSONArray data = root.getJSONObject("data").getJSONArray("data");
            List<Vod> list = new ArrayList<>();
            for (int i = 0; i < data.length(); i++) {
                JSONObject o = data.getJSONObject(i);
                if (!o.has("tournament_id")) continue;
                String id = o.getString("type") + "|" + o.getString("tournament_id") + "|" + o.getString("member_id");
                String name = o.getString("home_team_zh") + " VS " + o.getString("away_team_zh");
                list.add(new Vod(id, name, o.optString("cover"), o.optString("league_name_zh")));
            }
            return Result.get().vod(list).page(Integer.parseInt(pg), 1, 20, list.size()).string();
        } catch (Exception e) {
            e.printStackTrace();
            return empty(pg);
        }
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            String id = ids.get(0);
            String[] p = id.split("\\|");
            if (p.length != 3) return Result.string(new ArrayList<>());
            String url = HOST + "/api/web/live_lists/" + p[0] + "/detail/" + p[1] + "?member_id=" + p[2];
            JSONObject root = new JSONObject(OkHttp.string(url, headers()));
            if (root.getInt("code") != 200) return Result.string(new ArrayList<>());
            JSONObject data = root.getJSONObject("data");
            JSONObject detail = data.getJSONObject("detail");
            JSONArray more = data.getJSONArray("more");
            StringBuilder from = new StringBuilder();
            StringBuilder play = new StringBuilder();
            for (int i = 0; i < more.length(); i++) {
                JSONObject m = more.getJSONObject(i);
                if (i > 0) {
                    from.append("$$$");
                    play.append("$$$");
                }
                from.append(m.getString("username"));
                play.append("线路一$").append(m.getString("screen_url"))
                        .append("#线路二$").append(m.getString("screen_url_m3u8"));
            }
            Vod vod = new Vod();
            vod.setVodId(id);
            vod.setVodName(detail.getString("home_team_zh") + " VS " + detail.getString("away_team_zh"));
            vod.setVodContent(detail.optString("room_notice"));
            vod.setVodPlayFrom(from.toString());
            vod.setVodPlayUrl(play.toString());
            return Result.string(vod);
        } catch (Exception e) {
            e.printStackTrace();
            return Result.string(new ArrayList<>());
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        return Result.get().url(id).header(headers()).string();
    }

    private static String empty(String pg) {
        try {
            return Result.get().vod(new ArrayList<>()).page(Integer.parseInt(pg), 1, 20, 0).string();
        } catch (Exception e) {
            return Result.string(new ArrayList<>());
        }
    }
}
