package com.github.catvod.spider;

import com.github.catvod.spider.support.p118c.C2192c;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.support.p001A.C0082a;
import com.github.catvod.spider.support.p101G.C2034f;
import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p102H.C2051g;
import com.github.catvod.spider.support.p103I.C2060c;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Djlh extends Spider {

    /* JADX INFO: renamed from: a */
    public final String f165a = "https://www.dj92.cc";

    public static String extractToken(String str) {
        Matcher matcher = Pattern.compile("token:\\s*'([^']+)'").matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final String m500b(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f165a);
        sb.append("/search.html?key=" + URLEncoder.encode(str) + "&page=" + str2);
        String string = sb.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        C2060c c2060cM4896n0 = C2051g.m5074d(OkHttp.string(string, map)).m4896n0("div.layui-col-md8 > div > div.music-body > ul > li");
        ArrayList arrayList = new ArrayList();
        for (C2037i c2037i : c2060cM4896n0) {
            C2060c c2060cM4896n1 = c2037i.m4896n0("div.center > span.name > a");
            String strM5179a = c2060cM4896n1 != null ? c2060cM4896n1.m5179a("href") : "";
            C2060c c2060cM4896n2 = c2037i.m4896n0("div.user > a > img");
            String str3 = c2060cM4896n2 != null ? "https:" + c2060cM4896n2.m5179a("src") : "";
            C2060c c2060cM4896n3 = c2037i.m4896n0("div.center > span.name > a");
            String strM5179a2 = c2060cM4896n3 != null ? c2060cM4896n3.m5179a("title") : "";
            C2060c c2060cM4896n4 = c2037i.m4896n0("div.center > span.nickname > a");
            String strM5179a3 = c2060cM4896n4 != null ? c2060cM4896n4.m5179a("title") : "";
            if (!strM5179a.isEmpty() && !str3.isEmpty() && !strM5179a2.isEmpty() && !strM5179a3.isEmpty()) {
                C2177k.m5715b(strM5179a, strM5179a2, str3, strM5179a3, arrayList);
            }
        }
        return Result.string(arrayList);
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (map.get("cateId") != null) {
            str = map.get("cateId");
        }
        StringBuilder sb = new StringBuilder();
        StringBuilder sbM835f = C0082a.m835f(sb, this.f165a, "/djlist/", str, "/");
        sbM835f.append(str2);
        sbM835f.append(".html");
        sb.append(sbM835f.toString());
        String string = sb.toString();
        HashMap map2 = new HashMap();
        map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        C2034f c2034fM5074d = C2051g.m5074d(OkHttp.string(string, map2));
        int i = Integer.parseInt(str2);
        ArrayList arrayList = new ArrayList();
        for (C2037i c2037i : c2034fM5074d.m4896n0("div.layui-row.layui-col-space20 > div.layui-col-md8 > div > div.music-body > ul > li")) {
            C2060c c2060cM4896n0 = c2037i.m4896n0("div.center > span.name > a");
            String strM5179a = c2060cM4896n0 != null ? c2060cM4896n0.m5179a("href") : "";
            C2060c c2060cM4896n1 = c2037i.m4896n0("div.user > a > img");
            String str3 = c2060cM4896n1 != null ? "https:" + c2060cM4896n1.m5179a("src") : "";
            C2060c c2060cM4896n2 = c2037i.m4896n0("div.center > span.name > a");
            String strM5179a2 = c2060cM4896n2 != null ? c2060cM4896n2.m5179a("title") : "";
            C2060c c2060cM4896n3 = c2037i.m4896n0("div.center > span.nickname > a");
            String strM5179a3 = c2060cM4896n3 != null ? c2060cM4896n3.m5179a("title") : "";
            if (!strM5179a.isEmpty() && !str3.isEmpty() && !strM5179a2.isEmpty() && !strM5179a3.isEmpty()) {
                C2177k.m5715b(strM5179a, strM5179a2, str3, strM5179a3, arrayList);
            }
        }
        return C0082a.m830d(arrayList, i, arrayList.size() < 20 ? i : i + 1, 20, 0);
    }

    public String detailContent(List<String> list) throws JSONException {
        String str = list.get(0);
        String strM5657b = C2174h.m5657b(new StringBuilder(), this.f165a, str);
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        String strM6073l = OkHttp.string(strM5657b, map);
        C2034f c2034fM5074d = C2051g.m5074d(strM6073l);
        Vod c2194eM812b = C0082a.m812b(str);
        c2194eM812b.m5849k(c2034fM5074d.m4896n0("div.music-info-box > div.music-play-box > h3 > span.name").m5181c());
        c2194eM812b.m5850l("");
        c2194eM812b.m5846h("");
        c2194eM812b.m5851m("轮回DJ");
        HashMap mapM5756b = C2186v.m5756b("token", extractToken(strM6073l));
        HashMap map2 = new HashMap();
        map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/140.0.0.0 Safari/537.36");
        String string = new JSONObject(C2238b.m6067g("https://www.dj92.cc/ajax/info", mapM5756b, map2).m6076a()).getString("playurl");
        if (!string.contains("http")) {
            string = "https:".concat(string);
        }
        c2194eM812b.m5852n("点击播放$" + string);
        return Result.string(c2194eM812b);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("1", "2", "3", "4", "5", "7", "8");
        List listAsList2 = Arrays.asList("电音House", "中文舞曲", "外文舞曲", "酒吧风格", "串烧舞曲", "私改舞曲", "大赛作品");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new Class((String) listAsList.get(i), (String) listAsList2.get(i), null));
        }
        return C0082a.m802a("{}", arrayList);
    }

    public String playerContent(String str, String str2, List<String> list) {
        C2192c c2192c = new C2192c();
        c2192c.m5830w(str2);
        return c2192c.toString();
    }

    public String searchContent(String str, boolean z) {
        return m500b(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return m500b(str, str2);
    }
}
