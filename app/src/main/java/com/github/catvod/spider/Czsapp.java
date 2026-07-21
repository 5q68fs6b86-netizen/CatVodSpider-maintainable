package com.github.catvod.spider;
import com.github.catvod.spider.support.p116a.C2137a;

import com.github.catvod.spider.support.p044FM.p075c.C1765g;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p049E.C1317a;
import com.github.catvod.spider.support.p044FM.p055K.C1388h;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import com.github.catvod.spider.support.p044FM.p090o.C1860a;
import com.github.catvod.spider.support.p044FM.p091p.AbstractC1886a;
import com.github.catvod.spider.support.p044FM.p091p.C1891f;
import com.github.catvod.net.OkHttp;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Czsapp extends Spider {

    /* JADX INFO: renamed from: a */
    private static final Pattern f161a = Pattern.compile("\"([^\"]+)\";var [\\d\\w]+=function dncry.*md5.enc.Utf8.parse\\(\"([\\d\\w]+)\".*md5.enc.Utf8.parse\\(([\\d]+)\\)");

    /* JADX INFO: renamed from: b */
    private static final Pattern f162b = Pattern.compile("video: \\{url: \"([^\"]+)\"");

    /* JADX INFO: renamed from: c */
    private static final Pattern f163c = Pattern.compile("subtitle: \\{url:\"([^\"]+\\.vtt)\"");

    /* JADX INFO: renamed from: d */
    private static String f164d;

    /* JADX INFO: renamed from: b */
    private Map<String, String> m492b() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Linux; Android 15; PJZ110 Build/AP3A.240617.008; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/136.0.7103.127 Mobile Safari/537.36");
        map.put("Referer", f164d);
        map.put("Accept-Language", "zh-CN,zh;q=0.9");
        return map;
    }

    /* JADX INFO: renamed from: c */
    private void m493c(List<Vod> list, C1388h c1388h) {
        for (C1393m c1393m : c1388h.m3478o0(".bt_img.mi_ne_kd > ul >li")) {
            list.add(new Vod(c1393m.m3478o0("a").m3784a("href"), c1393m.m3478o0(".dytit > a").m3792i(), c1393m.m3478o0("img").m3784a("data-original"), c1393m.m3478o0(".jidi span").m3792i()));
        }
    }

    /* JADX INFO: renamed from: d */
    private void m494d(List<Vod> list, C1388h c1388h) {
        for (C1393m c1393m : c1388h.m3478o0(".bt_img.mi_ne_kd > ul >li")) {
            String strM3784a = c1393m.m3478o0("a").m3784a("href");
            list.add(new Vod(f164d + strM3784a, c1393m.m3478o0(".dytit > a").m3792i(), c1393m.m3478o0("img").m3784a("src"), c1393m.m3478o0(".jidi span").m3792i()));
        }
    }

    public static Object[] loadSub(Map<String, String> map) {
        int i;
        String str = map.get("url");
        try {
            AbstractC1886a abstractC1886a = new AbstractC1886a() { // from class: com.github.catvod.spider.Czsapp.1
                @Override // com.github.catvod.spider.support.p044FM.p091p.AbstractC1888c
                /* JADX INFO: renamed from: a */
                protected final void mo495a(Exception exc) {
                }

                @Override // com.github.catvod.spider.support.p044FM.p091p.AbstractC1888c
                /* JADX INFO: renamed from: b */
                protected final /* bridge */ /* synthetic */ void mo496b(Response response) {
                }
            };
            C1891f.m4589c(C1891f.m4588b(), str, m492b(), abstractC1886a);
            Response result = abstractC1886a.getResult();
            if (result.code() == 404) {
                return new Object[]{200, "application/octet-stream", new ByteArrayInputStream("WEBVTT".getBytes())};
            }
            byte[] bArrBytes = result.body().bytes();
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrBytes, 0, 16);
            BufferedReader bufferedReader = new BufferedReader(new StringReader(C1317a.m3300a(C1860a.m4491c(Arrays.copyOfRange(bArrBytes, 16, bArrBytes.length), bArrCopyOfRange, bArrCopyOfRange, "AES/CBC/PKCS7Padding")).replaceAll("(\\d{2}:\\d{2}:\\d{2}.\\d{3}.+\\d{2}:\\d{2}:\\d{2}.\\d{3}).*", "$1").replaceAll("(\\d{2}:\\d{2}.\\d{3}).*?( --> )(\\d{2}:\\d{2}.\\d{3}).*", "00:$1$200:$3").replaceAll("<.*><.*>(.*)<.*><.*>", "$1").replaceAll("&(.*);", "").replaceAll(".*NOTE.*", "")));
            ArrayList arrayList = new ArrayList();
            int i2 = 1;
            String line = bufferedReader.readLine();
            while (line != null) {
                if (line.matches("\\d{2}:\\d{2}:\\d{2}.\\d{3}.+\\d{2}:\\d{2}:\\d{2}.\\d{3}") && ((String) arrayList.get(arrayList.size() - 1)).trim().isEmpty()) {
                    arrayList.add(String.valueOf(i2));
                    i = i2 + 1;
                } else {
                    i = i2;
                }
                arrayList.add(line);
                line = bufferedReader.readLine();
                i2 = i;
            }
            return new Object[]{200, "application/octet-stream", new ByteArrayInputStream(TextUtils.join("\n", arrayList).getBytes())};
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(e);
            return null;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        String str3 = f164d + String.format("/%s/page/%s", str, str2);
        HashMap map2 = new HashMap();
        map2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.81 Safari/537.36");
        map2.put("Referer", f164d);
        m493c(arrayList, C1286l.m3222g(C1840c.m4479n(str3, map2)));
        return Result.string(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x00d0  */
    public String detailContent(List<String> list) {
        String str;
        String str2;
        byte b;
        C1388h c1388hM3222g = C1286l.m3222g(C1840c.m4479n(list.get(0), m492b()));
        C1551g c1551gM3478o0 = c1388hM3222g.m3478o0(".paly_list_btn a");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= c1551gM3478o0.size()) {
                break;
            }
            C1393m c1393m = c1551gM3478o0.get(i2);
            arrayList.add(c1393m.m3478o0("a").m3792i() + "$" + c1393m.m3478o0("a").m3784a("href"));
            i = i2 + 1;
        }
        String strM3792i = c1388hM3222g.m3478o0("div.moviedteail_tt > h1").m3792i();
        String strM3784a = c1388hM3222g.m3478o0("div.dyimg > img").m3784a("src");
        String strM3792i2 = c1388hM3222g.m3478o0("div.yp_context").m3792i();
        String strM3792i3 = c1388hM3222g.m3478o0(".moviedteail_list > li:nth-child(6)  > a").m3792i();
        String strM3792i4 = c1388hM3222g.m3478o0(".moviedteail_list > li:nth-child(8)  > a").m3792i();
        Iterator<C1393m> it = c1388hM3222g.m3478o0("ul.moviedteail_list > li").iterator();
        String str3 = "";
        String str4 = "";
        String str5 = "";
        String str6 = "";
        while (it.hasNext()) {
            String strTrim = it.next().m3484v0().trim();
            if (strTrim.length() >= 4) {
                try {
                    String strSubstring = strTrim.substring(0, 2);
                    String strSubstring2 = strTrim.substring(3);
                    switch (strSubstring) {
                        case "地区":
                            b = 1;
                            break;
                        case "年份":
                            b = 2;
                            break;
                        case "类型":
                            b = 0;
                            break;
                        case "豆瓣":
                            b = 3;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    if (b == 0) {
                        str6 = strSubstring2;
                        str = str5;
                        str2 = str3;
                    } else if (b == 1) {
                        str = str5;
                        str4 = strSubstring2;
                        str2 = str3;
                    } else if (b == 2) {
                        str = str5;
                        str2 = strSubstring2;
                    } else if (b != 3) {
                        str = str5;
                        str2 = str3;
                    } else {
                        str = strSubstring2;
                        str2 = str3;
                    }
                } catch (Exception e) {
                    SpiderDebug.log(e);
                    str = str5;
                    str2 = str3;
                }
            } else {
                str = str5;
                str2 = str3;
            }
            str3 = str2;
            str5 = str;
        }
        Vod c1768j = new Vod();
        c1768j.m4221g(list.get(0));
        c1768j.m4223i(strM3784a);
        c1768j.m4222h(strM3792i);
        c1768j.m4228n(str3);
        c1768j.m4218d(str4);
        c1768j.m4217c(strM3792i4);
        c1768j.m4226l(str5);
        c1768j.m4219e(strM3792i2);
        c1768j.m4220f(strM3792i3);
        c1768j.m4224j("厂长资源");
        c1768j.m4225k(TextUtils.join("#", arrayList));
        c1768j.m4216b(str6);
        String strM4188p = Result.string(c1768j);
        C2137a.parseJsonAndSave(strM4188p);
        return strM4188p;
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        new LinkedHashMap();
        String str = f164d;
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.81 Safari/537.36");
        map.put("Referer", str);
        C1388h c1388hM3222g = C1286l.m3222g(C1840c.m4479n(str, map));
        for (C1393m c1393m : c1388hM3222g.m3478o0(".navlist > li")) {
            String strM3784a = c1393m.m3478o0("a").m3784a("href");
            String strM3792i = c1393m.m3478o0("a").m3792i();
            if (!strM3792i.equals("首页")) {
                arrayList2.add(new Class(strM3784a, strM3792i));
            }
        }
        m493c(arrayList, c1388hM3222g);
        return Result.string(arrayList2, arrayList);
    }

    public void init(Context context, String str) {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
        map.put("Referer", str);
        String strM6073l = OkHttp.string(str, map);
        int iIndexOf = strM6073l.indexOf("推荐访问<a href=\"");
        if (iIndexOf == -1) {
            f164d = "";
            return;
        }
        int i = iIndexOf + 13;
        f164d = "https:" + strM6073l.substring(i, strM6073l.indexOf("\"", i));
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strGroup;
        String strM4495g;
        try {
            String strM4479n = C1840c.m4479n(str2, m492b());
            C1388h c1388hM3222g = C1286l.m3222g(strM4479n);
            Matcher matcher = f161a.matcher(strM4479n);
            if (matcher.find()) {
                String strM4492d = C1860a.m4492d(Base64.decode(matcher.group(1), 0), matcher.group(2).getBytes(), matcher.group(3).getBytes(), "AES/CBC/PKCS7Padding");
                Matcher matcher2 = f162b.matcher(strM4492d);
                strM4495g = matcher2.find() ? matcher2.group(1) : "";
                Matcher matcher3 = f163c.matcher(strM4492d);
                strGroup = matcher3.find() ? matcher3.group(1) : "";
            } else {
                strGroup = "";
                strM4495g = "";
            }
            if (TextUtils.isEmpty(strM4495g)) {
                String strM3784a = c1388hM3222g.m3478o0("div.videoplay > iframe").m3784a("src");
                HashMap map = new HashMap();
                map.put("User-Agent", "Mozilla/5.0 (Linux; Android 15; PJZ110 Build/AP3A.240617.008; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/136.0.7103.127 Mobile Safari/537.36");
                map.put("Upgrade-Insecure-Requests", "1");
                map.put("Sec-Fetch-Dest", "iframe");
                map.put("Referer", f164d);
                map.put("Sec-Fetch-Site", "cross-site");
                map.put("Sec-Fetch-Mode", "navigate");
                new JSONObject(map);
                Matcher matcher4 = Pattern.compile("var result_v2 = (\\{.*?\\});", 32).matcher(C1840c.m4479n(strM3784a, map));
                strM4495g = C1860a.m4495g(new StringBuilder(new JSONObject(matcher4.find() ? matcher4.group(1) : "").getString("data")).reverse().toString());
            }
            JSONObject jSONObject = new JSONObject(m492b());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("parse", "0");
            jSONObject2.put("playUrl", "");
            jSONObject2.put("url", strM4495g);
            jSONObject2.put("header", jSONObject.toString());
            if (!TextUtils.isEmpty(strGroup)) {
                jSONObject2.put("subf", "/vtt/utf-8");
                jSONObject2.put("subt", Proxy.getUrl() + "?do=czspp&url=" + URLEncoder.encode(strGroup));
            }
            return jSONObject2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log(e);
            C1765g c1765gM4185e = C1765g.m4185e();
            c1765gM4185e.m4207x(str2);
            c1765gM4185e.m4203l();
            c1765gM4185e.m4198f(m492b());
            return C2137a.addDanmaku(c1765gM4185e.m4205o());
        }
    }

    public String searchContent(String str, boolean z) {
        String str2 = (f164d + "/boss1O1?q=") + str;
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.81 Safari/537.36");
        map.put("Referer", f164d);
        C1388h c1388hM3222g = C1286l.m3222g(C1840c.m4479n(str2, map));
        ArrayList arrayList = new ArrayList();
        m494d(arrayList, c1388hM3222g);
        return Result.string(arrayList);
    }
}
