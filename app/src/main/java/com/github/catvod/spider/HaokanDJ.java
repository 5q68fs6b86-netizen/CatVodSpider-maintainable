package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * 好看短剧。接口/请求头来自单线路 jar 反编译 HaokanDJ。
 */
public class HaokanDJ extends Spider {

    private static final String UA = "Mozilla/5.0 (Linux; Android 11; M2012K10C Build/RP1A.200720.011; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/87.0.4280.141 Mobile Safari/537.36 haokan/7.80.0.18 (Baidu; P1 11)/imoaiX_03_11_C01K2102M/1043677m/5ACDB023CFB9D64743B08E51953F7C76%7CVSAJ32AVA/1/7.80.0.18/780001/1/immersiveMode/modeV4PlusWhite/isFirstInstall/bbqMode/bbqModeV2/blackStyle/isPlaylet Talos/1.8.7";

    private static Map<String, String> headers() {
        Map<String, String> h = new HashMap<>();
        h.put("User-Agent", UA);
        h.put("Content-Type", "application/x-www-form-urlencoded; charset=utf-8");
        h.put("Cookie", "BAIDUCUID=giHCu0azv80G8SfQ0avU8gaaH8jfiv86ju2MugiR2i8-k3a35avAa1_mA");
        h.put("Talos-Module-Version", "1.0.71.1");
        h.put("Talos-Module-Name", "shortDrama");
        return h;
    }

    private static String pickUrl(JSONArray clarity, String key) throws Exception {
        for (int i = 0; i < clarity.length(); i++) {
            JSONObject o = clarity.getJSONObject(i);
            if (key.equals(o.getString("key"))) return o.getString("url");
        }
        return "";
    }

    public static String extractVideoUrl(JSONArray clarity) throws Exception {
        if (clarity == null || clarity.length() == 0) return "";
        String u = pickUrl(clarity, "1080p");
        if (!u.isEmpty()) return u;
        u = pickUrl(clarity, "sc");
        if (!u.isEmpty()) return u;
        return clarity.getJSONObject(0).getString("url");
    }

    private static String postForm(String url, Map<String, String> form) {
        return OkHttp.post(url, form, headers()).getBody();
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        Map<String, String> form = new HashMap<>();
        form.put("from", "feed");
        String body = postForm("https://sv.baidu.com/haokan/ui-feed/playletShelfFeed?osbranch=a0", form);
        JSONArray panels = new JSONObject(body).getJSONObject("data").getJSONArray("playlet_shelf_filter_panel");
        List<Class> classes = new ArrayList<>();
        for (int i = 0; i < panels.length(); i++) {
            JSONArray tags = panels.getJSONObject(i).getJSONArray("tag_list");
            for (int j = 0; j < tags.length(); j++) {
                JSONObject t = tags.getJSONObject(j);
                classes.add(new Class(t.getString("tag_id"), t.getString("name")));
            }
        }
        return Result.string(classes, new ArrayList<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        if (extend != null && extend.get("cateId") != null) tid = extend.get("cateId");
        Map<String, String> form = new HashMap<>();
        form.put("tag_id", tid);
        form.put("rn", "9");
        form.put("pn", pg);
        String body = postForm("https://sv.baidu.com/haokan/ui-feed/playletTagsFeed?osbranch=a0", form);
        JSONArray arr = new JSONObject(body).getJSONObject("data").getJSONArray("list");
        List<Vod> list = new ArrayList<>();
        for (int i = 0; i < arr.length(); i++) {
            JSONObject o = arr.getJSONObject(i);
            list.add(new Vod(o.getString("playlet_id"), o.getString("playlet_title"), o.getString("playlet_poster"), o.optString("episodes_num_text")));
        }
        int page = Integer.parseInt(pg);
        int pagecount = (int) Math.ceil(((double) Integer.MAX_VALUE) / 9d);
        return Result.get().vod(list).page(page, pagecount, 9, Integer.MAX_VALUE).string();
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String playletId = ids.get(0);
        long ts = System.currentTimeMillis();
        Map<String, String> listForm = new HashMap<>();
        listForm.put("video/commonlist", String.format(
                "enable_enter_playlet=0&seek_time=0&hotspot=0&auto_show_hot_point_panel=0&type=playlet&commonlist_id=%s&scene=&vid=&enable_atlas=0&mark_pn=&uk=&ctime=0&from=playlet_new&id=%s&rn=10&pn=1&direction=3",
                ts, playletId));
        String listBody = postForm("https://sv.baidu.com/appui/api?osbranch=a0", listForm);
        String vid = new JSONObject(listBody)
                .getJSONObject("video/commonlist").getJSONObject("data")
                .getJSONArray("results").getJSONObject(0)
                .getJSONObject("content").getString("vid");

        Map<String, String> detailForm = new HashMap<>();
        detailForm.put("vid", vid);
        detailForm.put("playlet_id", playletId);
        String detailBody = postForm("https://sv.baidu.com/haokan/ui-video/playlet/rec/detail?osbranch=a0", detailForm);
        JSONObject data = new JSONObject(detailBody).getJSONObject("data");

        JSONArray vidList = data.getJSONArray("vid_list");
        List<String> eps = new ArrayList<>();
        for (int i = 0; i < vidList.length(); i++) {
            eps.add("第" + (i + 1) + "集$" + vidList.getString(i) + "|||" + playletId);
        }
        Vod vod = new Vod();
        vod.setVodId(playletId);
        vod.setVodName(data.getString("playlet_title"));
        vod.setVodPic(data.getString("playlet_poster"));
        vod.setVodContent(data.optString("description"));
        vod.setVodPlayFrom("短剧");
        vod.setVodPlayUrl(TextUtils.join("#", eps));
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        String[] parts = id.split("\\|\\|\\|");
        String vid = parts[0];
        String setId = parts.length > 1 ? parts[1] : "";
        Map<String, String> form = new HashMap<>();
        form.put("video/relate", "method=post&vid=" + vid + "&immersive_mode=v4_5&tplname=feed_small_video&tag=playlet_talos&tab=detail&external_from=&is_dp_video=0&immersive_square_type=3&video_set_id=" + setId + "&play_screen_type=1&play_volume_type=2&play_external_device_type=1");
        String body = postForm("https://sv.baidu.com/appui/api?osbranch=a0", form);
        JSONArray clarity = new JSONObject(body).getJSONObject("video/relate").getJSONObject("data").getJSONObject("cur_video").getJSONArray("clarityUrl");
        String play = extractVideoUrl(clarity);
        Map<String, String> h = new HashMap<>();
        h.put("User-Agent", UA);
        return Result.get().url(play).header(h).string();
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        return searchContent(key, quick, "1");
    }

    @Override
    public String searchContent(String key, boolean quick, String pg) throws Exception {
        Map<String, String> form = new HashMap<>();
        form.put("search_word", key);
        String body = postForm("https://sv.baidu.com/haokan/ui-interact/playlet/search/sugs?osbranch=a0", form);
        JSONArray arr = new JSONObject(body).getJSONArray("data");
        List<Vod> list = new ArrayList<>();
        for (int i = 0; i < arr.length(); i++) {
            JSONObject o = arr.getJSONObject(i);
            list.add(new Vod(o.getString("id"), o.getString("title"), o.optString("cover_url"), o.optString("tag")));
        }
        return Result.string(list);
    }
}
