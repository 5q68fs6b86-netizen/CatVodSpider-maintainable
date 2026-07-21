package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.net.OkHttp;

import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 美剧天堂 meijutt。选择器来自 jar 反编译 MeijuTT。
 */
public class MeijuTT extends Spider {

    private static String host = "https://www.meijutt.cc";

    private static Map<String, String> headers() {
        Map<String, String> h = new HashMap<>();
        h.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        h.put("Referer", host + "/");
        return h;
    }

    private static String pic(String url) {
        try {
            JSONObject h = new JSONObject();
            h.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
            return url + "@Headers=" + h;
        } catch (Exception e) {
            return url;
        }
    }

    private Document get(String url) {
        if (!url.startsWith("http")) url = host + url;
        return Jsoup.parse(OkHttp.string(url, headers()), url);
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
        if (!TextUtils.isEmpty(extend)) host = extend;
    }

    @Override
    public String homeContent(boolean filter) {
        List<Class> classes = new ArrayList<>();
        List<String> ids = Arrays.asList("1", "2", "3", "4", "5", "6");
        List<String> names = Arrays.asList("魔幻科幻", "灵异惊悚", "都市情感", "犯罪历史", "选秀综艺", "动漫卡通");
        for (int i = 0; i < ids.size(); i++) classes.add(new Class(ids.get(i), names.get(i)));
        return Result.string(classes, new ArrayList<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            String url = host + "/mjtt/{cateId}-" + pg + ".html";
            if (filter && extend != null) {
                for (String k : extend.keySet()) {
                    String v = extend.get(k);
                    if (v != null && !v.isEmpty()) url = url.replace("{" + k + "}", v);
                }
            }
            url = url.replaceAll("\\{cateId\\}", tid);
            Document doc = get(url);
            List<Vod> list = new ArrayList<>();
            for (Element box : doc.select("div.list3_cn_box div.cn_box2")) {
                Element a = box.selectFirst("a");
                Element img = box.selectFirst("img");
                Elements lis = box.select(".list_20 li");
                String remarks = lis.size() > 1 ? lis.get(1).text() : "";
                if (a == null) continue;
                list.add(new Vod(a.attr("href"), a.attr("title"), pic(img != null ? img.attr("data-original") : ""), remarks));
            }
            return Result.get().vod(list).page(Integer.parseInt(pg), Integer.MAX_VALUE, list.size(), Integer.MAX_VALUE).string();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override
    public String detailContent(List<String> ids) {
        try {
            Document doc = get(ids.get(0));
            Element img = doc.selectFirst("div.o_big_img_bg_b>img");
            Element h1 = doc.selectFirst("div.info-title>h1");
            List<String> from = new ArrayList<>();
            List<String> play = new ArrayList<>();
            Elements downLists = doc.select("div.down_list");
            Elements tabs = doc.select("div.from-tabs .downcili-ico,.down-ico");
            for (int i = 0; i < downLists.size(); i++) {
                String tab = i < tabs.size() ? tabs.get(i).text() : ("线路" + (i + 1));
                for (int j = 0; j < from.size(); j++) {
                    if (tab.equals(from.get(j))) tab = tab + (i + 1);
                }
                List<String> eps = new ArrayList<>();
                for (Element li : downLists.get(i).select("li")) {
                    Element a = li.selectFirst("a");
                    if (a != null) eps.add(a.text() + "$" + a.attr("href"));
                }
                from.add(tab);
                play.add(TextUtils.join("#", eps));
            }
            Vod vod = new Vod();
            vod.setVodId(ids.get(0));
            vod.setVodName(h1 != null ? h1.text() : "");
            vod.setVodPic(pic(img != null ? img.attr("data-original") : ""));
            vod.setVodPlayFrom(TextUtils.join("$$$", from));
            vod.setVodPlayUrl(TextUtils.join("$$$", play));
            return Result.string(vod);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        try {
            if (id.startsWith("tvbox") || id.startsWith("ed2k") || id.startsWith("magnet")) {
                return Result.get().url(id).string();
            }
            Map<String, String> h = new HashMap<>();
            h.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
            return Result.get().parse().url(id).header(h).string();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override
    public String searchContent(String key, boolean quick) {
        try {
            String url = host + "/sousuo/index.asp?page=1&searchword=" + URLEncoder.encode(key, StandardCharsets.UTF_8) + "&searchtype=-1";
            Document doc = get(url);
            List<Vod> list = new ArrayList<>();
            for (Element box : doc.select("div.list3_cn_box div.cn_box2")) {
                Element a = box.selectFirst("a");
                Element img = box.selectFirst("img");
                Elements lis = box.select(".list_20 li");
                String remarks = lis.size() > 1 ? lis.get(1).text() : "";
                if (a == null) continue;
                list.add(new Vod(a.attr("href"), a.attr("title"), pic(img != null ? img.attr("data-original") : ""), remarks));
            }
            return Result.string(list);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
