package com.github.catvod.spider;

import com.github.catvod.spider.support.p044FM.p075c.C1765g;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p055K.C1388h;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p073b.C1747r;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import com.github.catvod.spider.support.p044FM.p088m.C1842e;
import com.github.catvod.spider.support.p044FM.p089n.C1845a;
import com.github.catvod.spider.support.p044FM.p089n.C1846b;
import com.github.catvod.spider.support.p044FM.p089n.C1855k;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class SaoHuo extends Spider {

    /* JADX INFO: renamed from: a */
    private String f274a;

    /* JADX INFO: renamed from: b */
    String f275b = "";

    /* JADX INFO: renamed from: a */
    private HashMap<String, String> m650a() {
        HashMap<String, String> map = new HashMap<>();
        map.put("User-Agent", "Mozilla/5.0 (Linux; Android 9; ALN-AL00 Build/PQ3B.190801.05281406; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/91.0.4472.114 Safari/537.36");
        map.put("accept-language", "zh-CN,zh;q=0.9,en-US;q=0.8,en;q=0.7");
        if (!TextUtils.isEmpty(this.f275b)) {
            map.put("Cookie", this.f275b);
        }
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        C1388h c1388hM3222g = C1286l.m3222g(C1840c.m4479n(this.f274a + String.format("/list/%s-%s.html", str, str2), m650a()));
        ArrayList arrayList = new ArrayList();
        Iterator itM4095c = C1747r.m4095c(new byte[]{0, -38, 31, 41, -50, -61, -14, -17, 0, -38, 31, 44, -54, -41}, new byte[]{46, -84, 64, 69, -89, -80, -122, -49}, c1388hM3222g);
        while (itM4095c.hasNext()) {
            C1393m c1393m = (C1393m) itM4095c.next();
            C1846b.m4486a(this.f274a + c1393m.m3478o0("a").m3784a("href"), c1393m.m3478o0("a").m3784a("title"), c1393m.m3478o0("img").m3784a("data-original"), C1845a.m4485a(new byte[]{-69, -2, 108, -24, 41, 14, -115}, new byte[]{-107, -120, 51, -122, 70, 122, -24, -13}, c1393m), arrayList);
        }
        return Result.string(arrayList);
    }

    public String detailContent(List<String> list) {
        C1388h c1388hM3222g = C1286l.m3222g(C1840c.m4479n(list.get(0), m650a()));
        C1551g c1551gM3478o0 = c1388hM3222g.m3478o0("#play_link li");
        C1551g c1551gM3478o1 = c1388hM3222g.m3478o0(".play_from ul.from_list li");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= c1551gM3478o0.size()) {
                String strM4488a = C1855k.m4488a(new byte[]{104, 51, 18, 23, 55, -121, -16, 88, 108, 103}, new byte[]{0, 2, 60, 97, 104, -13, -103, 44}, c1388hM3222g);
                StringBuilder sbM3589b = C1434P.m3589b(URLDecoder.decode(new String(Base64.getDecoder().decode("566A5LuL77ya")), "UTF-8"));
                sbM3589b.append(c1388hM3222g.m3478o0("p.p_txt").m3792i());
                String string = sbM3589b.toString();
                String[] strArrSplit = C1855k.m4488a(new byte[]{-128, -4, 43, 98, 100, 112, -79, 87, -52, -27, 12, 43, 122}, new byte[]{-82, -118, 116, 11, 10, 22, -34, 8}, c1388hM3222g).split(" / 导演:| / 主演:");
                String str = strArrSplit[0];
                String str2 = strArrSplit[1];
                String str3 = strArrSplit[2];
                Vod c1768j = new Vod();
                c1768j.m4221g(list.get(0));
                c1768j.m4222h(strM4488a);
                c1768j.m4216b(str);
                c1768j.m4217c(str3);
                c1768j.m4219e(string);
                c1768j.m4220f(str2);
                c1768j.m4224j(TextUtils.join("$$$", linkedHashMap.keySet()));
                c1768j.m4225k(TextUtils.join("$$$", linkedHashMap.values()));
                String strM4188p = Result.string(c1768j);
                C2137a.parseJsonAndSave(strM4188p);
                return strM4188p;
            }
            String strM3484v0 = c1551gM3478o1.get(i2).m3484v0();
            ArrayList arrayList = new ArrayList();
            C1551g c1551gM3478o2 = c1551gM3478o0.get(i2).m3478o0("a");
            for (int size = c1551gM3478o2.size() - 1; size >= 0; size--) {
                String strMo3511c = c1551gM3478o2.get(size).mo3511c("href");
                StringBuilder sbM3589b2 = C1434P.m3589b(c1551gM3478o2.get(size).m3484v0());
                sbM3589b2.append("$");
                sbM3589b2.append(strMo3511c);
                arrayList.add(sbM3589b2.toString());
            }
            if (arrayList.size() > 0) {
                linkedHashMap.put(strM3484v0, TextUtils.join("#", arrayList));
            }
            i = i2 + 1;
        }
    }

    public String homeContent(boolean z) {
        HashMap<String, String> mapM650a = m650a();
        mapM650a.put("User-Agent", "Mozilla/5.0 (Linux; Android 9; ALN-AL00 Build/PQ3B.190801.05281406; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/91.0.4472.114 Safari/537.36");
        ArrayList arrayList = new ArrayList();
        List listAsList = Arrays.asList("1", "2", "20", "4");
        List listAsList2 = Arrays.asList("电影", "电视剧", "国产剧", "动漫");
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList.add(new Class((String) listAsList.get(i), (String) listAsList2.get(i)));
        }
        JSONObject jSONObject = new JSONObject("{\"1\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"全部\", \"v\": \"1\"}, {\"n\": \"喜剧\", \"v\": \"6\"}, {\"n\": \"爱情\", \"v\": \"7\"}, {\"n\": \"恐怖\", \"v\": \"8\"}, {\"n\": \"动作\", \"v\": \"9\"}, {\"n\": \"科幻\", \"v\": \"10\"}, {\"n\": \"战争\", \"v\": \"11\"}, {\"n\": \"犯罪\", \"v\": \"12\"}, {\"n\": \"动画\", \"v\": \"13\"}, {\"n\": \"奇幻\", \"v\": \"14\"}, {\"n\": \"剧情\", \"v\": \"15\"}, {\"n\": \"冒险\", \"v\": \"16\"}, {\"n\": \"悬疑\", \"v\": \"17\"}, {\"n\": \"惊悚\", \"v\": \"18\"}, {\"n\": \"其他\", \"v\": \"20\"}]}],\"2\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"全部\", \"v\": \"2\"}, {\"n\": \"国产剧\", \"v\": \"20\"}, {\"n\": \"TVB\", \"v\": \"21\"}, {\"n\": \"韩剧\", \"v\": \"22\"}, {\"n\": \"美剧\", \"v\": \"23\"}, {\"n\": \"日剧\", \"v\": \"24\"}, {\"n\": \"英剧\", \"v\": \"25\"}, {\"n\": \"台剧\", \"v\": \"26\"}, {\"n\": \"其他\", \"v\": \"27\"}]}],\"3\": [{\"key\": \"cateId\", \"name\": \"类型\", \"value\": [{\"n\": \"全部\", \"v\": \"4\"}, {\"n\": \"搞笑\", \"v\": \"38\"}, {\"n\": \"恋爱\", \"v\": \"39\"}, {\"n\": \"热血\", \"v\": \"40\"}, {\"n\": \"格斗\", \"v\": \"41\"}, {\"n\": \"美少女\", \"v\": \"42\"}, {\"n\": \"魔法\", \"v\": \"43\"}, {\"n\": \"机战\", \"v\": \"44\"}, {\"n\": \"校园\", \"v\": \"45\"}, {\"n\": \"亲子\", \"v\": \"46\"}, {\"n\": \"童话\", \"v\": \"47\"}, {\"n\": \"冒险\", \"v\": \"48\"}, {\"n\": \"真人\", \"v\": \"49\"}, {\"n\": \"LOLI\", \"v\": \"50\"}, {\"n\": \"其他\", \"v\": \"51\"}]}]}");
        C1842e c1842eM4467b = C1840c.m4467b(this.f274a, mapM650a);
        List<String> list = c1842eM4467b.m4483c().get("set-cookie");
        if (!(list == null) && !list.isEmpty()) {
            this.f275b = list.get(0);
        }
        C1388h c1388hM3222g = C1286l.m3222g(c1842eM4467b.m4481a());
        ArrayList arrayList2 = new ArrayList();
        Iterator itM4095c = C1747r.m4095c(new byte[]{-15, -24, 22, 14, 84, -57, 72, 61, -15, -24, 22, 11, 80, -45}, new byte[]{-33, -98, 73, 98, 61, -76, 60, 29}, c1388hM3222g);
        while (itM4095c.hasNext()) {
            C1393m c1393m = (C1393m) itM4095c.next();
            if (arrayList2.size() > 5) {
                break;
            }
            C1846b.m4486a(this.f274a + c1393m.m3478o0("a").m3784a("href"), c1393m.m3478o0("a").m3784a("title"), c1393m.m3478o0("img").m3784a("data-original"), C1845a.m4485a(new byte[]{-71, 81, 65, 64, -95, 63, -117}, new byte[]{-105, 39, 30, 46, -50, 75, -18, -53}, c1393m), arrayList2);
        }
        return C1765g.m4193u(arrayList, arrayList2, jSONObject);
    }

    public void init(Context context, String str) {
        HashMap<String, String> mapM650a = m650a();
        mapM650a.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
        super.init(context, str);
        C1551g c1551gM3478o0 = C1286l.m3222g(C1840c.m4479n("http://shapp.us/", mapM650a)).m3478o0(".content-top a");
        String strMo3511c = c1551gM3478o0.isEmpty() ? "" : c1551gM3478o0.get(0).mo3511c("href");
        if (!strMo3511c.isEmpty()) {
            str = strMo3511c;
        }
        this.f274a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        String strM3784a = C1286l.m3222g(C1840c.m4479n(this.f274a.concat(str2), m650a())).m3478o0("iframe").m3784a("src");
        C1765g c1765g = new C1765g();
        c1765g.m4207x(strM3784a);
        c1765g.m4203l();
        c1765g.m4198f(m650a());
        String string = c1765g.toString();
        try {
            JSONObject jSONObject = new JSONObject(string);
            String strOptString = jSONObject.optString("url");
            String strOptString2 = jSONObject.optString("header");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("url", strOptString);
            jSONObject2.put("header", strOptString2);
            jSONObject2.put("parse", 1);
            jSONObject2.put("jx", 0);
            return C2137a.addDanmaku(jSONObject2.toString());
        } catch (Exception e) {
            return string;
        }
    }

    public String searchContent(String str, boolean z) {
        C1388h c1388hM3222g = C1286l.m3222g(C1840c.m4479n(this.f274a + "/s----------.html?wd=" + URLEncoder.encode(str), m650a()));
        ArrayList arrayList = new ArrayList();
        Iterator itM4095c = C1747r.m4095c(new byte[]{-109, 91, -53, 72, -13, -15, -114, 28, -109, 91, -53, 77, -9, -27}, new byte[]{-67, 45, -108, 36, -102, -126, -6, 60}, c1388hM3222g);
        while (itM4095c.hasNext()) {
            C1393m c1393m = (C1393m) itM4095c.next();
            C1846b.m4486a(this.f274a + c1393m.m3478o0("a").m3784a("href"), c1393m.m3478o0("a").m3784a("title"), c1393m.m3478o0("img").m3784a("data-original"), C1845a.m4485a(new byte[]{40, -102, -85, 109, 99, -36, 116}, new byte[]{6, -20, -12, 3, 12, -88, 17, -57}, c1393m), arrayList);
        }
        return Result.string(arrayList);
    }
}
