package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p055K.C1388h;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p073b.C1747r;
import com.github.catvod.spider.support.p044FM.p073b.C1751v;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.spider.support.p044FM.p082g.C1812j;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import com.github.catvod.spider.support.p044FM.p089n.C1845a;
import com.github.catvod.spider.support.p044FM.p089n.C1846b;
import com.github.catvod.spider.support.p044FM.p089n.C1855k;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Wwys extends Spider {

    /* JADX INFO: renamed from: a */
    private static String f284a;

    /* JADX INFO: renamed from: a */
    private HashMap<String, String> m663a() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Linux; Android 13; SM-A037U) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Mobile Safari/537.36  uacq");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        if (map.get("cateId") != null) {
            str = map.get("cateId");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(f284a);
        for (C1393m c1393m : C1286l.m3222g(C1840c.m4479n(C1751v.m4141a("/vod-list-id-%s-pg-%s-order--by-time-class-0-year-0-letter--area--lang-.html", new Object[]{str, str2}, sb), m663a())).m3478o0(".resize_list > li")) {
            C1846b.m4486a(c1393m.m3478o0("a").m3784a("href").replaceAll("\\D+", ""), c1393m.m3478o0("a[title]").m3784a("title"), c1393m.m3478o0("div > img").m3784a("src"), C1845a.m4485a(new byte[]{69, 7, 57, -13, 81, 114, -13, -85, 66, 3, 55, -16}, new byte[]{54, 119, 88, -99, 127, 1, -79, -60}, c1393m), arrayList);
        }
        return Result.string(arrayList);
    }

    public String detailContent(List<String> list) {
        C1388h c1388hM3222g = C1286l.m3222g(C1840c.m4479n(f284a.concat("/vod-detail-id-").concat(list.get(0)).concat(".html"), m663a()));
        String strM3784a = c1388hM3222g.m3478o0(".title > a:nth-child(1)").m3784a("title");
        String strM4488a = C1855k.m4488a(new byte[]{-81, -73, 43, -119, 63, -29, 40, 115, -108, -73, 41, -62, 54, -68, 53, 100, -93, -13, 62, -49, 50, -22, 63, 56, -7, -9, 125, -103, 123, -32, 52, 126, -65, -28, 51, -45, 51, -85, 56, 120, -94, -78, 57, -113, 105, -81}, new byte[]{-53, -34, 93, -89, 91, -122, 91, 16}, c1388hM3222g);
        String strM3784a2 = c1388hM3222g.m3478o0(".page-hd > a:nth-child(1) > img:nth-child(1)").m3784a("src");
        String strM4488a2 = C1855k.m4488a(new byte[]{56, -71, 62, -34, -23, 62, 36, 92, 3, -71, 60, -107, -32, 97, 57, 75, 52, -3, 43, -104, -28, 55, 51, 23, 111, -7, 104, -50, -83, 58}, new byte[]{92, -48, 72, -16, -115, 91, 87, 63}, c1388hM3222g);
        String strM4488a3 = C1855k.m4488a(new byte[]{60, 70, 89, -66, -74, -113, 92, 81, 113, 77, 82, -22, -23, -58, 64, 70, 124, 86, 84, -25, -76, -114, 89, 16, 118, 10, 15, -29}, new byte[]{18, 34, 60, -54, -41, -26, 48, 124}, c1388hM3222g);
        String strM4488a4 = C1855k.m4488a(new byte[]{-82, -62, -77, -82, -108, 13, 79, -59, -107, -62, -79, -27, -99, 82, 82, -46, -94, -122, -90, -24, -103, 4, 88, -114, -2, -126, -27, -66, -48, 9}, new byte[]{-54, -85, -59, -128, -16, 104, 60, -90}, c1388hM3222g);
        Matcher matcher = Pattern.compile("mac_url='([^']*)'").matcher(C1286l.m3222g(C1840c.m4479n(f284a.concat("/vod-play-id-").concat(list.get(0)).concat("-src-1-num-1.html"), m663a())).m3462c0());
        if (!matcher.find()) {
            return "";
        }
        String strGroup = matcher.group(1);
        Vod c1768j = new Vod();
        c1768j.m4221g(list.get(0));
        c1768j.m4223i(strM3784a2);
        c1768j.m4222h(strM3784a);
        c1768j.m4217c(strM4488a2);
        c1768j.m4226l(strM4488a);
        c1768j.m4219e(strM4488a3);
        c1768j.m4220f(strM4488a4);
        c1768j.m4224j("在线播放");
        c1768j.m4225k(strGroup);
        String strM4188p = Result.string(c1768j);
        C2137a.parseJsonAndSave(strM4188p);
        return strM4188p;
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject("{\"1\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"全部\", \"v\": \"1\"}, {\"n\": \"动作片\", \"v\": \"5\"}, {\"n\": \"喜剧片\", \"v\": \"6\"}, {\"n\": \"爱情片\", \"v\": \"7\"}, {\"n\": \"科幻片\", \"v\": \"8\"}, {\"n\": \"恐怖片\", \"v\": \"9\"}, {\"n\": \"剧情片\", \"v\": \"10\"}, {\"n\": \"战争片\", \"v\": \"11\"}, {\"n\": \"惊悚片\", \"v\": \"16\"}, {\"n\": \"奇幻片\", \"v\": \"17\"}]}], \"2\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"全部\", \"v\": \"2\"}, {\"n\": \"国产剧\", \"v\": \"12\"}, {\"n\": \"港台剧\", \"v\": \"13\"}, {\"n\": \"日韩剧\", \"v\": \"14\"}, {\"n\": \"欧美剧\", \"v\": \"15\"}]}]}");
        C1388h c1388hM3222g = C1286l.m3222g(C1840c.m4479n(f284a, m663a()));
        for (C1393m c1393m : c1388hM3222g.m3478o0("#topnav > ul:nth-child(1) li")) {
            arrayList2.add(new Class(c1393m.m3478o0("a").m3784a("href").split("-")[3], c1393m.m3478o0("a").m3792i()));
        }
        for (C1393m c1393m2 : c1388hM3222g.m3478o0("section.mod:nth-child(3) > div:nth-child(2) ul.resize_list")) {
            String strM3784a = c1393m2.m3478o0("a div.pic img").m3784a("data-src");
            C1846b.m4486a(c1393m2.m3478o0("a").m3784a("href").replaceAll("\\D+", ""), c1393m2.m3478o0("a").m3784a("title"), strM3784a, c1393m2.m3478o0("a > div > span > span").m3792i(), arrayList);
        }
        return C1765g.m4193u(arrayList2, arrayList, jSONObject);
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        f284a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        Matcher matcher = Pattern.compile("src=\"(.*?)'").matcher(C1840c.m4479n(f284a + "/player/wwgz.js", m663a()));
        Matcher matcher2 = Pattern.compile("src\\s*=\\s*'([^']+)'\\s*\\+\\s*videoUrl").matcher(C1840c.m4479n(C1812j.m4399b(matcher.find() ? matcher.group(1) : "", str2), m663a()));
        Matcher matcher3 = Pattern.compile("url: '([^']*)'").matcher(C1840c.m4479n(C1812j.m4399b(matcher2.find() ? matcher2.group(1) : "", str2), m663a()));
        String strGroup = matcher3.find() ? matcher3.group(1) : "";
        if (strGroup.isEmpty()) {
            Matcher matcher4 = Pattern.compile("src=\"(.*?)'").matcher(C1840c.m4479n(f284a + "/player/lzm3u8.js", m663a()));
            Matcher matcher5 = Pattern.compile("\"url\":\\s*\"([^\"]+)\"").matcher(C1840c.m4479n(C1812j.m4399b(matcher4.find() ? matcher4.group(1) : "", str2), m663a()));
            strGroup = matcher5.find() ? matcher5.group(1) : "";
        }
        C1765g c1765g = Result.get()();
        c1765g.m4207x(strGroup);
        c1765g.m4198f(m663a());
        return C2137a.addDanmaku(c1765g.toString());
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator itM4095c = C1747r.m4095c(new byte[]{-9, -27, -11, -19, -78, 113, -70, 8, -89, -11, -76, -89, -13, 66, -65}, new byte[]{-44, -127, -108, -103, -45, 46, -42, 97}, C1286l.m3222g(C1840c.m4479n(f284a.concat("/index.php?m=vod-search&wd=").concat(str), m663a())));
        while (itM4095c.hasNext()) {
            C1393m c1393m = (C1393m) itM4095c.next();
            String strM3784a = c1393m.m3478o0("div:nth-child(1) > a:nth-child(1) > img:nth-child(1)").m3784a("data-src");
            C1846b.m4486a(c1393m.m3478o0("div:nth-child(1) > a:nth-child(1)").m3784a("href").replaceAll("\\D+", ""), C1845a.m4485a(new byte[]{-93, -44, 47, -29, -37, -90, -54, 100, -92, -43, 48, -75, -47, -6, -112, 96, -25, -125, 121, -86, -59, -77, -52, 115, -87, -55, 49, -12, -42, -70, -53, 37, -93, -107, 104, -16}, new byte[]{-57, -67, 89, -39, -75, -46, -94, 73}, c1393m), strM3784a, C1845a.m4485a(new byte[]{51, -55, 12, -122, -95, -31, 0, 45, 52, -56, 19, -48, -85, -67, 90, 41, 119, -98, 90, -49, -65, -12, 6, 58, 57, -44, 18, -111, -84, -3, 1, 108, 51, -120, 73, -107}, new byte[]{87, -96, 122, -68, -49, -107, 104, 0}, c1393m), arrayList);
        }
        return Result.string(arrayList);
    }
}
