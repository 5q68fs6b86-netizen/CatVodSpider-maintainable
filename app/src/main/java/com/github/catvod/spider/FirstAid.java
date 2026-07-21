package com.github.catvod.spider;

import android.text.TextUtils;

import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.crawler.Spider;
import com.github.catvod.net.OkHttp;
import com.github.catvod.utils.Util;

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
 * 有来医生急救课堂
 * 从单线路 spider.jar 逆向后按 FongMi 风格重写（Jsoup 替代混淆 HTML 解析器）。
 */
public class FirstAid extends Spider {

    private static final String HOST = "https://m.youlai.cn";

    private Map<String, String> headers() {
        Map<String, String> h = new HashMap<>();
        h.put("User-Agent", Util.CHROME);
        return h;
    }

    private Document get(String url) {
        return Jsoup.parse(OkHttp.string(url, headers()), url);
    }

    @Override
    public String homeContent(boolean filter) {
        List<String> ids = Arrays.asList(
                "jijiu|0", "jijiu|1", "jijiu|2", "jijiu|3",
                "jijiu|4", "jijiu|5", "jijiu|6", "jijiu|7"
        );
        List<String> names = Arrays.asList(
                "急救技能", "家庭生活", "急危重症", "常见损伤",
                "动物致伤", "海洋急救", "中毒急救", "意外事故"
        );
        List<Class> classes = new ArrayList<>();
        for (int i = 0; i < ids.size(); i++) {
            classes.add(new Class(ids.get(i), names.get(i)));
        }
        return Result.string(classes, new ArrayList<>());
    }

    @Override
    public String categoryContent(String tid, String pg, boolean filter, HashMap<String, String> extend) {
        String[] parts = tid.split("\\|");
        String cate = parts[0];
        int index = Integer.parseInt(parts[1]);
        if (extend != null && extend.get("cateId") != null) cate = extend.get("cateId");

        Document doc = get(HOST + "/" + cate);
        Elements blocks = doc.select(".block100");
        String pic = blocks.size() > index ? blocks.get(index).attr("src") : "";
        Elements sections = doc.select(".jj-title-li");
        Element section = sections.size() > index ? sections.get(index) : null;
        Elements items = section == null ? new Elements() : section.select(".list-br3");

        List<Vod> list = new ArrayList<>();
        for (Element el : items) {
            Element a = el.selectFirst("a");
            if (a == null) continue;
            String href = a.attr("href");
            String name = a.text();
            String id = href.startsWith("http") ? href : HOST + href;
            list.add(new Vod(id, name, pic));
        }
        return Result.get().vod(list).page(1, 1, 0, list.size()).string();
    }

    @Override
    public String detailContent(List<String> ids) {
        String url = ids.get(0);
        Document doc = get(url);
        String name = text(doc, ".video-title.h1-title");
        String pic = attr(doc, ".video-cover.list-flex-in img", "src");
        String actor = text(doc, "span.doc-name");
        String content = text(doc, ".img-text-con");
        String play = attr(doc, "#video source", "src");
        if (TextUtils.isEmpty(play)) play = attr(doc, "#video", "src");

        Vod vod = new Vod();
        vod.setVodId(url);
        vod.setVodName(name);
        vod.setVodPic(pic);
        vod.setVodActor(actor);
        vod.setVodArea("中国");
        vod.setVodContent(content);
        vod.setVodPlayFrom("Qile");
        vod.setVodPlayUrl(name + "$" + play);
        return Result.string(vod);
    }

    @Override
    public String searchContent(String key, boolean quick) {
        String url = HOST + "/cse/search?q=" + URLEncoder.encode(key, StandardCharsets.UTF_8);
        Document doc = get(url);
        List<Vod> list = new ArrayList<>();
        for (Element el : doc.select(".search-video-li.list-br2")) {
            Element a = el.selectFirst("a");
            if (a == null) continue;
            String href = a.attr("href");
            String id = href.startsWith("http") ? href : HOST + href;
            String name = text(el, "h5.line-clamp1");
            String pic = attr(el, "dt.logo-bg img", "src");
            if (!TextUtils.isEmpty(pic) && !pic.startsWith("http")) pic = "https:" + pic;
            list.add(new Vod(id, name, pic));
        }
        return Result.string(list);
    }

    @Override
    public String playerContent(String flag, String id, List<String> vipFlags) {
        return Result.get().url(id).header(headers()).string();
    }

    private static String text(Element root, String css) {
        Element el = root.selectFirst(css);
        return el == null ? "" : el.text();
    }

    private static String attr(Element root, String css, String key) {
        Element el = root.selectFirst(css);
        return el == null ? "" : el.attr(key);
    }
}
