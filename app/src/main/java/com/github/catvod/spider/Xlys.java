package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p055K.C1388h;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p073b.C1751v;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import com.github.catvod.spider.support.p044FM.p089n.C1846b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Xlys extends Spider {

    /* JADX INFO: renamed from: a */
    private static String f360a = "https://www.xlysw.ggff.net";

    /* JADX INFO: renamed from: a */
    private Map<String, String> m768a() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        map.put("Accept-Language", "zh-CN,zh;q=0.9");
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        if (map.get("cateId") != null) {
            str = map.get("cateId");
        }
        C1388h c1388hM3222g = C1286l.m3222g(C1840c.m4479n(f360a + String.format("/search.php?searchtype=5&tid=%s&area=%s&year=%s&order=%s&page=%s", str, map.get("area") == null ? "" : map.get("area"), map.get("year") == null ? "" : map.get("year"), map.get("by") == null ? "" : map.get("by"), str2), m768a()));
        ArrayList arrayList = new ArrayList();
        for (C1393m c1393m : c1388hM3222g.m3478o0("li.col-lg-6")) {
            C1846b.m4486a(f360a + c1393m.m3478o0("a.myui-vodlist__thumb").m3784a("href"), c1393m.m3478o0("h4.title a").m3792i(), c1393m.m3478o0("a.myui-vodlist__thumb").m3784a("data-original"), c1393m.m3478o0(".pic-text.text-right").m3792i(), arrayList);
        }
        return Result.string(arrayList);
    }

    public String detailContent(List<String> list) {
        C1388h c1388hM3222g = C1286l.m3222g(C1840c.m4479n(list.get(0), m768a()));
        String strMo3511c = c1388hM3222g.m3479p0("div.myui-content__thumb img.lazyload").mo3511c("data-original");
        String strM3484v0 = c1388hM3222g.m3479p0("h1.title").m3484v0();
        String strReplaceAll = c1388hM3222g.m3478o0("#jq .tab-content.myui-panel_bd").m3792i().replaceAll("\\s+", "");
        C1551g c1551gM3478o0 = c1388hM3222g.m3478o0("p.data");
        int i = 0;
        String strJoin = "";
        String strM3484v1 = "";
        String strM3484v2 = "";
        String strM3484v3 = "";
        String strJoin2 = "";
        while (i < c1551gM3478o0.size()) {
            C1393m c1393m = c1551gM3478o0.get(i);
            String strM3484v4 = c1393m.m3479p0("span.text-muted").m3484v0();
            if (strM3484v4.contains("分类：")) {
                strM3484v1 = c1393m.m3479p0("a").m3484v0();
            } else if (strM3484v4.contains("地区：")) {
                strM3484v2 = c1393m.m3479p0("a").m3484v0();
            } else if (strM3484v4.contains("年份：")) {
                strM3484v3 = c1393m.m3479p0("a").m3484v0();
            } else if (strM3484v4.contains("主演：")) {
                ArrayList arrayList = new ArrayList();
                C1551g c1551gM3478o1 = c1393m.m3478o0("a");
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= c1551gM3478o1.size()) {
                        break;
                    }
                    arrayList.add(c1551gM3478o1.get(i3).m3484v0());
                    i2 = i3 + 1;
                }
                strJoin2 = TextUtils.join(",", arrayList);
            } else if (strM3484v4.contains("导演：")) {
                ArrayList arrayList2 = new ArrayList();
                C1551g c1551gM3478o2 = c1393m.m3478o0("a");
                int i4 = 0;
                while (true) {
                    int i5 = i4;
                    if (i5 >= c1551gM3478o2.size()) {
                        break;
                    }
                    arrayList2.add(c1551gM3478o2.get(i5).m3484v0());
                    i4 = i5 + 1;
                }
                strJoin = TextUtils.join(",", arrayList2);
            } else {
                i++;
            }
            i++;
        }
        String strM3484v5 = c1388hM3222g.m3479p0("h1.title font").m3484v0();
        C1551g c1551gM3478o3 = c1388hM3222g.m3478o0("ul.myui-content__list.sort-list a");
        ArrayList arrayList3 = new ArrayList();
        for (int i6 = 0; i6 < c1551gM3478o3.size(); i6++) {
            C1393m c1393m2 = c1551gM3478o3.get(i6);
            arrayList3.add(c1393m2.m3484v0() + "$" + c1393m2.mo3511c("href"));
        }
        String strJoin3 = arrayList3.size() > 0 ? TextUtils.join("#", arrayList3) : "";
        Vod c1768j = new Vod(list.get(0), strM3484v0, strMo3511c);
        c1768j.m4216b(strM3484v1);
        c1768j.m4228n(strM3484v3);
        c1768j.m4218d(strM3484v2);
        c1768j.m4217c(strJoin2);
        c1768j.m4220f(strJoin);
        c1768j.m4219e(strReplaceAll);
        c1768j.m4226l(strM3484v5);
        c1768j.m4217c(strJoin2);
        c1768j.m4224j("在线播放");
        c1768j.m4225k(strJoin3);
        String strM4188p = Result.string(c1768j);
        C2137a.parseJsonAndSave(strM4188p);
        return strM4188p;
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("1", "2", "3", "4");
        List listAsList2 = Arrays.asList("电影", "电视剧", "综艺", "动漫");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new Class((String) listAsList.get(i), (String) listAsList2.get(i)));
        }
        return C1765g.m4193u(arrayList, new ArrayList(), new JSONObject("{}"));
    }

    public void init(Context context, String str) {
        if (str.isEmpty()) {
            return;
        }
        f360a = str;
    }

    public String playerContent(String str, String str2, List list) {
        C1551g c1551gM3478o0 = C1286l.m3222g(C1840c.m4479n(C1751v.m4142b(new StringBuilder(), f360a, str2), m768a())).m3478o0("script");
        for (int i = 0; i < c1551gM3478o0.size(); i++) {
            String strMo3431t = c1551gM3478o0.get(i).mo3431t();
            if (strMo3431t != null && strMo3431t.contains("var now=")) {
                int iIndexOf = strMo3431t.indexOf("var now=\"") + 9;
                String str3 = "https://www.xlysw.ggff.net/js/player/videojs/ry.m3u8?url=" + strMo3431t.substring(iIndexOf, strMo3431t.indexOf("\"", iIndexOf));
                C1765g c1765g = Result.get()();
                c1765g.m4207x(str3);
                c1765g.m4198f(m768a());
                return C2137a.addDanmaku(c1765g.toString());
            }
        }
        return "";
    }

    public String searchContent(String str, boolean z) {
        C1388h c1388hM3222g = C1286l.m3222g(C1840c.m4479n(f360a + "/search.php?searchword=" + str, m768a()));
        ArrayList arrayList = new ArrayList();
        for (C1393m c1393m : c1388hM3222g.m3478o0("#searchList li")) {
            if (!c1393m.m3478o0("p").m3792i().contains("会员")) {
                C1846b.m4486a(f360a + c1393m.m3478o0("a.myui-vodlist__thumb").m3784a("href"), c1393m.m3478o0("h4.title a").m3792i(), c1393m.m3478o0("a.myui-vodlist__thumb").m3784a("data-original"), c1393m.m3478o0(".pic-text.text-right").m3792i(), arrayList);
            }
        }
        return Result.string(arrayList);
    }
}
