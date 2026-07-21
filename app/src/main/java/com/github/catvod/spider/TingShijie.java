package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Digest;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 世界听书。base URL 拉取与双重 MD5 签名来自 jar 反编译 TingShijie。
 */
public class TingShijie extends Spider {

    private static String base = "https://app.365ting.com/listen/Apitzg2025/";
    private static final String SALT = "J9gSpfUlzYxE8Hn5IXiGaD2jVMrwAm0K";

    private static Map<String, String> headers() {
        Map<String, String> h = new HashMap<>();
        h.put("User-Agent", "TingShiJie/1.8.8 (m.i275.com)");
        return h;
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
        try {
            String remote = OkHttp.string("http://101.43.48.231:8090/config/tingchina2025.txt", headers());
            if (!TextUtils.isEmpty(remote)) base = remote;
            else base = "https://app.365ting.com/listen/Apitzg2025/";
        } catch (Exception e) {
            e.printStackTrace();
            base = "https://app.365ting.com/listen/Apitzg2025/";
        }
    }

    @Override
    public String homeContent(boolean filter) {
        List<String> ids = Arrays.asList("6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "49");
        List<String> names = Arrays.asList("玄幻奇幻", "都市言情", "宫斗女频", "官场商战", "武侠仙侠", "刑侦推理", "探险科幻", "重生穿越", "恐怖惊悚", "文学历史", "两性情感");
        List<Class> classes = new ArrayList<>();
        for (int i = 0; i < ids.size(); i++) classes.add(new Class(ids.get(i), names.get(i)));
        return Result.string(classes, new ArrayList<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) throws Exception {
        if (TextUtils.isEmpty(pg)) pg = "1";
        JSONObject root = new JSONObject(OkHttp.string(base + "appHomeByCategory?categoryId=" + tid + "&page=" + pg + "&size=120", headers()));
        if (root.getInt("status") != 0) return emptyPage(pg);
        JSONArray data = root.getJSONArray("data");
        List<Vod> list = new ArrayList<>();
        for (int i = 0; i < data.length(); i++) {
            JSONObject o = data.getJSONObject(i);
            list.add(new Vod(o.optString("id"), o.optString("bookTitle"), o.optString("bookImage"), o.optString("bookAnchor")));
        }
        return Result.get().vod(list).page(Integer.parseInt(pg), 100, 20, 2000).string();
    }

    @Override
    public String detailContent(List<String> ids) throws Exception {
        String id = ids.get(0);
        JSONObject root = new JSONObject(OkHttp.string(base + "book?bookId=" + id, headers()));
        if (root.getInt("status") != 0) return Result.string(new ArrayList<>());
        JSONObject book = root.getJSONObject("data").getJSONObject("bookData");
        int count = book.getInt("count");
        int pages = (count + 999) / 1000; // DescriptorProtos.Edition.EDITION_2023_VALUE == 1000 in jar
        StringBuilder play = new StringBuilder();
        for (int p = 1; p <= pages; p++) {
            JSONObject chRoot = new JSONObject(OkHttp.string(base + "chapter?size=1000&page=" + p + "&sort=asc&bookId=" + id, headers()));
            if (chRoot.getInt("status") != 0) continue;
            JSONArray list = chRoot.getJSONObject("data").getJSONArray("list");
            for (int i = 0; i < list.length(); i++) {
                JSONObject c = list.getJSONObject(i);
                if (play.length() > 0) play.append("#");
                play.append(c.getInt("position")).append("$").append(id).append("|").append(c.getString("chapterId"));
            }
        }
        Vod vod = new Vod();
        vod.setVodId(id);
        vod.setVodName(book.getString("bookTitle"));
        vod.setVodPic(book.getString("bookImage"));
        vod.setVodContent(book.optString("bookDesc"));
        vod.setVodPlayFrom("世界听书");
        vod.setVodPlayUrl(play.toString());
        return Result.string(vod);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) throws Exception {
        String[] parts = id.split("\\|");
        if (parts.length >= 2) {
            String bookId = parts[0];
            String chapterId = parts[1];
            String ts = String.valueOf(System.currentTimeMillis());
            String sign = Digest.md5(Digest.md5(ts + SALT) + SALT);
            String url = base + "AppGetChapterUrl2023?timeStamp=" + ts + "&uid=&chapterId=" + chapterId
                    + "&addItParapet=" + sign + "&bookId=" + bookId;
            JSONObject root = new JSONObject(OkHttp.string(url, headers()));
            if (root.getInt("status") == 0) {
                String src = root.optString("src");
                if (!TextUtils.isEmpty(src)) return Result.get().url(src).string();
            }
        }
        return Result.get().url("").string();
    }

    @Override
    public String searchContent(String key, boolean quick) throws Exception {
        JSONObject root = new JSONObject(OkHttp.string(base + "appSearch?client=babala-android&search=" + key + "&app_token=abcSEARCH-2025", headers()));
        if (root.getInt("status") != 0) return emptyPage("1");
        JSONArray data = root.getJSONObject("data").getJSONArray("bookData");
        List<Vod> list = new ArrayList<>();
        for (int i = 0; i < data.length(); i++) {
            JSONObject o = data.getJSONObject(i);
            list.add(new Vod(o.optString("id"), o.optString("bookTitle"), o.optString("bookImage"), o.optString("bookAnchor")));
        }
        return Result.get().vod(list).page(1, 100, 20, 2000).string();
    }

    private static String emptyPage(String pg) {
        try {
            return Result.get().vod(new ArrayList<>()).page(Integer.parseInt(pg), 1, 20, 0).string();
        } catch (Exception e) {
            return Result.string(new ArrayList<>());
        }
    }
}
