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

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 美剧迷 meijumi。选择器来自 jar 反编译 MeijuMi。
 */
public class MeijuMi extends Spider {

    private static String host = "https://www.meijumi.net";

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
        return Jsoup.parse(OkHttp.string(url, headers()), url);
    }

    private static String cleanName(String name) {
        if (name == null) return "";
        int a = name.indexOf('《');
        int b = name.indexOf('》', a + 1);
        if (a >= 0 && b > a) name = name.substring(a + 1, b);
        return name.replace("迅雷下载", "").trim();
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
        if (!TextUtils.isEmpty(extend)) host = extend;
    }

    @Override
    public String homeContent(boolean filter) {
        try {
            Document doc = get(host);
            List<Class> classes = new ArrayList<>();
            for (Element a : doc.select("ul.nav-menu a")) {
                String name = a.text();
                if (name.contains("更新") || name.contains("推荐") || name.contains("首页") || name.contains("韩剧") || name.contains("即将"))
                    continue;
                classes.add(new Class(a.attr("href"), name));
            }
            return Result.string(classes, new ArrayList<>());
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            String urlTpl = "1".equals(pg) ? "{cateId}" : "{cateId}page/" + pg + "/";
            if (filter && extend != null) {
                for (String k : extend.keySet()) {
                    String v = extend.get(k);
                    if (v != null && !v.isEmpty()) urlTpl = urlTpl.replace("{" + k + "}", v);
                }
            }
            String url = urlTpl.replaceAll("\\{cateId\\}", tid);
            if (!url.startsWith("http")) url = host + (url.startsWith("/") ? "" : "/") + url;
            Document doc = get(url);
            List<Vod> list = new ArrayList<>();
            for (Element art : doc.select("div#post_list_box article")) {
                Element a = art.selectFirst("a");
                Element img = art.selectFirst("img");
                Element rem = art.selectFirst(".gxts");
                if (a == null) continue;
                list.add(new Vod(a.attr("href"), cleanName(a.attr("title")), pic(img != null ? img.attr("src") : ""), rem != null ? rem.text() : ""));
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
            Element img = doc.selectFirst("div.single-content img");
            Element title = doc.selectFirst(".entry-title");
            List<String> plays = new ArrayList<>();
            for (Element a : doc.select("div.single-content a[href^=magnet],a[href^=ed2k]")) {
                String href = a.attr("href");
                String name = a.text();
                if (href.startsWith("ed2k:")) {
                    Matcher m = Pattern.compile("\\|file\\|(.*?)\\|").matcher(URLDecoder.decode(href));
                    if (m.find()) name = m.group(1);
                } else if (href.startsWith("magnet:")) {
                    Matcher m = Pattern.compile("(^|&)dn=([^&]*)(&|$)").matcher(URLDecoder.decode(href));
                    if (m.find()) name = m.group(2);
                }
                plays.add(name + "$" + href);
            }
            Vod vod = new Vod();
            vod.setVodId(ids.get(0));
            vod.setVodName(title != null ? cleanName(title.text()) : "");
            vod.setVodPic(pic(img != null ? img.attr("src") : ""));
            vod.setVodPlayFrom("美剧迷");
            vod.setVodPlayUrl(TextUtils.join("#", plays));
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
            Document doc = get(host + "/?s=" + URLEncoder.encode(key, StandardCharsets.UTF_8));
            List<Vod> list = new ArrayList<>();
            for (Element art : doc.select("ul.search-page article")) {
                Element a = art.selectFirst("a");
                Element img = art.selectFirst("img");
                Element rem = art.selectFirst(".gxts");
                if (a == null) continue;
                list.add(new Vod(a.attr("href"), cleanName(a.attr("title")), pic(img != null ? img.attr("src") : ""), rem != null ? rem.text() : ""));
            }
            return Result.string(list);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
