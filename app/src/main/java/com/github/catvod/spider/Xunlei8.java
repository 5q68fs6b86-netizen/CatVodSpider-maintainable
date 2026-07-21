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

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 迅雷电影天堂 xunlei8。HTML 选择器来自 jar 反编译，Jsoup 替代混淆解析器。
 */
public class Xunlei8 extends Spider {

    private static String host = "https://xunlei8.cc";

    private static Map<String, String> headers() {
        Map<String, String> h = new HashMap<>();
        h.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
        h.put("Referer", host + "/");
        return h;
    }

    private static String picWithHeaders(String url) {
        try {
            JSONObject h = new JSONObject();
            h.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
            h.put("Referer", host);
            return url + "@Headers=" + h;
        } catch (Exception e) {
            return url;
        }
    }

    private Document get(String url) {
        if (!url.startsWith("http")) url = host + (url.startsWith("/") ? url : "/" + url);
        return Jsoup.parse(OkHttp.string(url, headers()), url);
    }

    @Override
    public void init(Context context, String extend) throws Exception {
        super.init(context, extend);
        if (!TextUtils.isEmpty(extend)) host = extend;
    }

    @Override
    public String homeContent(boolean filter) throws Exception {
        List<Class> classes = new ArrayList<>();
        classes.add(new Class("list", "电影"));
        classes.add(new Class("tv", "电视剧"));
        // filters JSON 原样来自 jar 字符串（过长则仅返回 class；需要筛选时可再贴回）
        if (!filter) return Result.string(classes, new ArrayList<>());
        String filters = "{\"tv\":[{\"name\":\"类型\",\"value\":[{\"v\":\"0\",\"n\":\"全部\"}],\"key\":\"1\"}],\"list\":[{\"name\":\"类型\",\"value\":[{\"v\":\"0\",\"n\":\"全部\"}],\"key\":\"1\"}]}";
        return Result.string(classes, new ArrayList<>(), new JSONObject(filters));
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        try {
            String[] arr = {"", "0", "0", "0", "date", ""};
            arr[0] = tid;
            arr[5] = pg;
            if (extend != null) {
                for (String k : extend.keySet()) {
                    arr[Integer.parseInt(k)] = extend.get(k);
                }
            }
            String path = host + "/" + TextUtils.join("-", arr) + "-30.html";
            Document doc = get(path);
            List<Vod> list = new ArrayList<>();
            for (Element el : doc.select("div.bc3ba")) {
                Element a = el.selectFirst("a");
                Element img = el.selectFirst("img");
                Element rem = el.selectFirst(".b9b4a");
                if (a == null) continue;
                list.add(new Vod(a.attr("href"), a.attr("title"), picWithHeaders(img != null ? img.attr("src") : ""), rem != null ? rem.text() : ""));
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
            Element img = doc.selectFirst("div.ba330 img");
            Element h1 = doc.selectFirst("div.b586afc9>h1");
            List<String> plays = new ArrayList<>();
            Elements lis = doc.select("div.bf8243b9 li");
            List<Element> rev = new ArrayList<>(lis);
            Collections.reverse(rev);
            for (Element li : rev) {
                Element a = li.selectFirst("a");
                if (a == null) continue;
                String href = a.attr("href");
                String name = a.text();
                if (href.isEmpty() || href.startsWith("http")) continue;
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
            vod.setVodName(h1 != null ? h1.text() : "");
            vod.setVodPic(picWithHeaders(img != null ? img.attr("src") : ""));
            vod.setVodPlayFrom("迅雷电影天堂");
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
            if (id.startsWith("tvbox") || id.startsWith("ed2k") || id.startsWith("thunder") || id.startsWith("magnet")) {
                return Result.get().url(id).string();
            }
            Map<String, String> h = new HashMap<>();
            h.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Safari/537.36");
            return Result.get().parse().url(id).header(h).string();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    @Override
    public String searchContent(String key, boolean quick) {
        try {
            Document doc = get(host + "/s/" + key + ".html");
            List<Vod> list = new ArrayList<>();
            for (Element el : doc.select("div.b59a2b64df1")) {
                Element h2 = el.selectFirst("h2");
                Element img = el.selectFirst("img");
                Element a = el.selectFirst("a");
                if (a == null) continue;
                list.add(new Vod(a.attr("href"), h2 != null ? h2.text() : a.text(), picWithHeaders(img != null ? img.attr("src") : "")));
            }
            return Result.string(list);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
