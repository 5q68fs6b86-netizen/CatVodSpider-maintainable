package com.github.catvod.spider;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Util;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

public class Jable extends Spider {

    private static final String siteUrl = "https://jable.tv";
    private static final String cateUrl = siteUrl + "/categories/";
    private static final String detailUrl = siteUrl + "/videos/";
    private static final String searchUrl = siteUrl + "/search/";

    private HashMap<String, String> getHeaders() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("User-Agent", Util.CHROME);
        headers.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8");
        headers.put("Accept-Language", "zh-TW,zh;q=0.9,en-US;q=0.8,en;q=0.7");
        headers.put("Referer", siteUrl + "/");
        return headers;
    }

    @Override
    public String homeContent(boolean filter) {
        Document doc = Jsoup.parse(OkHttp.string(siteUrl, getHeaders()));
        List<Class> classes = parseClasses(doc);
        List<Vod> list = parseVods(doc);
        for (Class item : parseClasses(Jsoup.parse(OkHttp.string(cateUrl, getHeaders())))) {
            if (!classes.contains(item)) classes.add(item);
        }
        if (list.isEmpty() && !classes.isEmpty()) {
            list = parseVods(Jsoup.parse(OkHttp.string(getCategoryUrl(classes.get(0).getTypeId(), "1"), getHeaders())));
        }
        return Result.string(classes, list);
    }

    List<Class> parseClasses(Document doc) {
        List<Class> classes = new ArrayList<>();
        for (Element element : doc.select("div.img-box > a, div.horizontal-img-box > a")) {
            String typeId = getLastPathSegment(element.attr("href"));
            String typeName = element.select("div.absolute-center > h4").text();
            if (typeName.isEmpty()) typeName = element.select("div.detail > h6.title").text();
            if (typeId.isEmpty() || typeName.isEmpty()) continue;
            classes.add(new Class(typeId, typeName));
        }
        return classes;
    }

    List<Vod> parseVods(Document doc) {
        List<Vod> list = new ArrayList<>();
        for (Element element : doc.select("div.video-img-box")) {
            String pic = element.select("img").attr("data-src");
            if (pic.isEmpty()) pic = element.select("img").attr("src");
            String url = element.select("a").attr("href");
            String name = element.select("div.detail > h6").text();
            String id = getLastPathSegment(url);
            if (pic.endsWith(".gif") || name.isEmpty() || id.isEmpty()) continue;
            list.add(new Vod(id, name, pic));
        }
        return list;
    }

    String getLastPathSegment(String url) {
        int query = url.indexOf('?');
        if (query >= 0) url = url.substring(0, query);
        String[] segments = url.split("/");
        for (int i = segments.length - 1; i >= 0; i--) {
            if (!segments[i].isEmpty()) return segments[i];
        }
        return "";
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        Document doc = Jsoup.parse(OkHttp.string(getCategoryUrl(tid, pg), getHeaders()));
        return Result.string(parseVods(doc));
    }

    private String getCategoryUrl(String tid, String pg) {
        return cateUrl + tid + "/?mode=async&function=get_block&block_id=list_videos_common_videos_list&sort_by=post_date&from=" + String.format(Locale.getDefault(), "%02d", Integer.parseInt(pg)) + "&_=" + System.currentTimeMillis();
    }

    @Override
    public String detailContent(List<String> ids) {
        Document doc = Jsoup.parse(OkHttp.string(detailUrl.concat(ids.get(0)).concat("/"), getHeaders()));
        return Result.string(parseDetail(doc, ids.get(0)));
    }

    Vod parseDetail(Document doc, String id) {
        String name = doc.select("meta[property=og:title]").attr("content");
        String pic = doc.select("meta[property=og:image]").attr("content");
        Element yearElement = doc.selectFirst("span.inactive-color");
        String year = yearElement == null ? "" : yearElement.text();
        Vod vod = new Vod();
        vod.setVodId(id);
        vod.setVodPic(pic);
        vod.setVodYear(year.replace("上市於 ", ""));
        vod.setVodName(name);
        vod.setVodPlayFrom("Jable");
        vod.setVodPlayUrl("播放$" + Util.getVar(doc.html(), "hlsUrl"));
        return vod;
    }

    @Override
    public String searchContent(String key, boolean quick) {
        Document doc = Jsoup.parse(OkHttp.string(searchUrl.concat(URLEncoder.encode(key)).concat("/"), getHeaders()));
        return Result.string(parseVods(doc));
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        return Result.get().url(id).header(getHeaders()).string();
    }
}
