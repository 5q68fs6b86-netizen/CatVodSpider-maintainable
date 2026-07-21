package com.github.catvod.spider;

import com.github.catvod.spider.support.p044FM.p075c.C1765g;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p071a.C1711a;
import com.github.catvod.spider.support.p044FM.p073b.C1747r;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import com.github.catvod.spider.support.p044FM.p089n.C1846b;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Jpys extends Spider {

    /* JADX INFO: renamed from: d */
    private static Map<String, Boolean> f210d = new HashMap();

    /* JADX INFO: renamed from: a */
    private String f211a = "https://www.hkybqufgh.com";

    /* JADX INFO: renamed from: b */
    private String f212b = "";

    /* JADX INFO: renamed from: c */
    private String f213c;

    private boolean checkDomainValid(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestMethod("HEAD");
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            int responseCode = httpURLConnection.getResponseCode();
            boolean z = responseCode >= 200 && responseCode <= 399;
            try {
                httpURLConnection.disconnect();
                return z;
            } catch (Exception e) {
                return z;
            }
        } catch (Exception e2) {
            return false;
        }
    }

    public static String getUUID() {
        return UUID.randomUUID().toString();
    }

    public static String sha1(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("SHA-1").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r7v4, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Boolean>] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Boolean>] */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (map.get("by") == null || map.get("by").equals("全部")) {
            map.put("by", "");
        }
        if (map.get("year") == null || map.get("year").equals("全部")) {
            map.put("year", "");
        }
        if (map.get("area") == null || map.get("area").equals("全部")) {
            map.put("area", "");
        }
        map.get("by");
        String str3 = map.get("year");
        String str4 = map.get("area");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String strSha1 = sha1(C1885z.m4560a("area=" + str4 + "&pageNum=" + str2 + "&type1=" + str + "&year=" + str3 + "&key=" + this.f213c + "&t=" + strValueOf));
        HashMap map2 = new HashMap();
        map2.put("sign", strSha1);
        map2.put("T", strValueOf);
        map2.put("Deviceid", "Deviceid");
        StringBuilder sb = new StringBuilder();
        sb.append(this.f211a);
        sb.append("/api/mw-movie/anonymous/video/list?type1=%s&pageNum=%s&area=%s&year=%s");
        String strM4479n = C1840c.m4479n(String.format(sb.toString(), str, str2, str4, str3), map2);
        PrintStream printStream = System.out;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ddyy");
        sb2.append(strM4479n);
        printStream.println(sb2.toString());
        JSONArray jSONArray = new JSONObject(strM4479n).getJSONObject("data").getJSONArray("list");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("vodPic");
            String string2 = jSONObject.getString("vodName");
            String string3 = jSONObject.getString("vodVersion");
            String string4 = jSONObject.getString("vodId");
            if (f210d.isEmpty() || !f210d.containsKey(string2)) {
                C1846b.m4486a(string4, string2, string, string3, arrayList);
            }
        }
        return Result.string(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x020d  */
    /* JADX WARN: Code duplicated, block: B:19:0x021e  */
    /* JADX WARN: Code duplicated, block: B:9:0x01b0 A[LOOP:0: B:7:0x01aa->B:9:0x01b0, LOOP_END] */
    public String detailContent(List<String> list) throws JSONException {
        String string;
        String str;
        Vod c1768j;
        LinkedHashMap linkedHashMap;
        JSONArray jSONArray;
        ArrayList arrayList;
        int i;
        String str2 = this.f211a + "/api/mw-movie/anonymous/video/detail?id=" + list.get(0);
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String strSha1 = sha1(C1885z.m4560a("id=" + list.get(0) + String.format("&key=%s&t=%s", this.f213c, strValueOf)));
        HashMap map = new HashMap();
        map.put("sign", strSha1);
        map.put("T", strValueOf);
        map.put("Deviceid", "Deviceid");
        String strM4479n = C1840c.m4479n(str2, map);
        System.out.println("ddyy" + strM4479n);
        JSONObject jSONObject = new JSONObject(strM4479n).getJSONObject("data");
        C1286l.m3222g(strM4479n);
        String string2 = jSONObject.getString("vodName");
        System.out.println("remm" + string2);
        String string3 = jSONObject.getString("vodRemarks");
        System.out.println("remm" + string3);
        String string4 = jSONObject.getString("vodPic");
        System.out.println("remm" + string4);
        String string5 = jSONObject.getString("vodArea");
        String string6 = jSONObject.getString("vodYear");
        System.out.println("ar" + string5);
        System.out.println("ye" + string6);
        String string7 = jSONObject.getString("vodClass");
        String string8 = jSONObject.getString("vodActor");
        System.out.println("acc" + string8);
        String string9 = jSONObject.getString("vodDirector");
        if (!jSONObject.has("vodBlurb")) {
            if (jSONObject.has("vodContent")) {
                str = "vodContent";
            } else {
                string = "";
            }
            c1768j = new Vod();
            c1768j.m4221g(list.get(0));
            c1768j.m4223i(string4);
            c1768j.m4228n(string6);
            c1768j.m4222h(string2);
            c1768j.m4218d(string5);
            c1768j.m4217c(string8);
            c1768j.m4226l(string3);
            c1768j.m4219e(string);
            c1768j.m4220f(string9);
            c1768j.m4216b(string7);
            linkedHashMap = new LinkedHashMap();
            jSONArray = jSONObject.getJSONArray("episodeList");
            System.out.println("sorr在线播放");
            arrayList = new ArrayList();
            for (i = 0; i < jSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String string10 = jSONObject2.getString("name");
                String string11 = jSONObject2.getString("nid");
                StringBuilder sb = new StringBuilder();
                sb.append(list.get(0));
                String strM4094b = C1747r.m4094b(new byte[]{95}, new byte[]{31, 96, 15, 77, 7, -79, -64, 52}, sb, string11);
                StringBuilder sbM3589b = C1434P.m3589b(string10);
                sbM3589b.append("$");
                sbM3589b.append(strM4094b);
                arrayList.add(sbM3589b.toString());
            }
            if (arrayList.size() > 0) {
                linkedHashMap.put("在线播放", TextUtils.join("#", arrayList));
            }
            if (linkedHashMap.size() > 0) {
                c1768j.m4224j(TextUtils.join("$$$", linkedHashMap.keySet()));
                c1768j.m4225k(TextUtils.join("$$$", linkedHashMap.values()));
            }
            String strM4188p = Result.string(c1768j);
            C2137a.parseJsonAndSave(strM4188p);
            return strM4188p;
        }
        str = "vodBlurb";
        string = jSONObject.getString(str);
        c1768j = new Vod();
        c1768j.m4221g(list.get(0));
        c1768j.m4223i(string4);
        c1768j.m4228n(string6);
        c1768j.m4222h(string2);
        c1768j.m4218d(string5);
        c1768j.m4217c(string8);
        c1768j.m4226l(string3);
        c1768j.m4219e(string);
        c1768j.m4220f(string9);
        c1768j.m4216b(string7);
        linkedHashMap = new LinkedHashMap();
        jSONArray = jSONObject.getJSONArray("episodeList");
        System.out.println("sorr在线播放");
        arrayList = new ArrayList();
        while (i < jSONArray.length()) {
            JSONObject jSONObject3 = jSONArray.getJSONObject(i);
            String string12 = jSONObject3.getString("name");
            String string13 = jSONObject3.getString("nid");
            StringBuilder sb2 = new StringBuilder();
            sb2.append(list.get(0));
            String strM4094b2 = C1747r.m4094b(new byte[]{95}, new byte[]{31, 96, 15, 77, 7, -79, -64, 52}, sb2, string13);
            StringBuilder sbM3589b2 = C1434P.m3589b(string12);
            sbM3589b2.append("$");
            sbM3589b2.append(strM4094b2);
            arrayList.add(sbM3589b2.toString());
        }
        if (arrayList.size() > 0) {
            linkedHashMap.put("在线播放", TextUtils.join("#", arrayList));
        }
        if (linkedHashMap.size() > 0) {
            c1768j.m4224j(TextUtils.join("$$$", linkedHashMap.keySet()));
            c1768j.m4225k(TextUtils.join("$$$", linkedHashMap.values()));
        }
        String strM4188p2 = Result.string(c1768j);
        C2137a.parseJsonAndSave(strM4188p2);
        return strM4188p2;
    }

    public String homeContent(boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        new LinkedHashMap();
        arrayList2.add(new Class(C1711a.m3992b(new byte[]{0}, new byte[]{49, -128, -107, -84, 109, 92, 73, 53}), "电影"));
        arrayList2.add(new Class("2", "电视剧"));
        arrayList2.add(new Class("4", "动漫"));
        arrayList2.add(new Class("3", "综艺"));
        JSONObject jSONObject = new JSONObject("{\"1\":[{\"name\":\"地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009~2000\",\"v\":\"2009~2000\"},{\"n\":\"90年代\",\"v\":\"90年代\"},{\"n\":\"80年代\",\"v\":\"80年代\"}]}],\"2\":[{\"name\":\"地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009~2000\",\"v\":\"2009~2000\"},{\"n\":\"90年代\",\"v\":\"90年代\"},{\"n\":\"80年代\",\"v\":\"80年代\"}]}],\"3\":[{\"name\":\"地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"中国香港\",\"v\":\"中国香港\"},{\"n\":\"中国台湾\",\"v\":\"中国台湾\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"韩国\",\"v\":\"韩国\"},{\"n\":\"泰国\",\"v\":\"泰国\"},{\"n\":\"印度\",\"v\":\"印度\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"更早\",\"v\":\"更早\"}]}],\"4\":[{\"name\":\"地区\",\"key\":\"area\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"中国大陆\",\"v\":\"中国大陆\"},{\"n\":\"美国\",\"v\":\"美国\"},{\"n\":\"日本\",\"v\":\"日本\"},{\"n\":\"其他\",\"v\":\"其他\"}]},{\"name\":\"年份\",\"key\":\"year\",\"value\":[{\"n\":\"全部\",\"v\":\"\"},{\"n\":\"2026\",\"v\":\"2026\"},{\"n\":\"2025\",\"v\":\"2025\"},{\"n\":\"2024\",\"v\":\"2024\"},{\"n\":\"2023\",\"v\":\"2023\"},{\"n\":\"2022\",\"v\":\"2022\"},{\"n\":\"2021\",\"v\":\"2021\"},{\"n\":\"2020\",\"v\":\"2020\"},{\"n\":\"2019\",\"v\":\"2019\"},{\"n\":\"2018\",\"v\":\"2018\"},{\"n\":\"2017\",\"v\":\"2017\"},{\"n\":\"2016\",\"v\":\"2016\"},{\"n\":\"2015\",\"v\":\"2015\"},{\"n\":\"2014\",\"v\":\"2014\"},{\"n\":\"2013\",\"v\":\"2013\"},{\"n\":\"2012\",\"v\":\"2012\"},{\"n\":\"2011\",\"v\":\"2011\"},{\"n\":\"2010\",\"v\":\"2010\"},{\"n\":\"2009~2000\",\"v\":\"2009~2000\"},{\"n\":\"90年代\",\"v\":\"90年代\"},{\"n\":\"80年代\",\"v\":\"80年代\"},{\"n\":\"更早\",\"v\":\"更早\"}]}]}");
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String strSha1 = sha1(C1885z.m4560a(String.format("key=%s&t=%s", this.f213c, strValueOf)));
        HashMap map = new HashMap();
        map.put("sign", strSha1);
        map.put("T", strValueOf);
        map.put("Deviceid", "Deviceid");
        JSONArray jSONArray = new JSONObject(C1840c.m4479n(this.f211a + "/api/mw-movie/anonymous/home/hotSearch", map)).getJSONArray("data");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            arrayList.add(new Vod(jSONObject2.getString("vodId"), jSONObject2.getString("vodName"), jSONObject2.getString("vodPic"), jSONObject2.getString("vodVersion")));
        }
        return C1765g.m4193u(arrayList2, arrayList, jSONObject);
    }

    public void init(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (String str2 : str.split(",")) {
            if (checkDomainValid(str2)) {
                this.f211a = str2.trim();
                break;
            }
        }
        this.f213c = "cb808529bae6b6be45ecfab29a4889bc";
        this.f212b = getUUID();
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            String[] strArrSplit = str2.split("@");
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            String str5 = this.f211a + "/api/mw-movie/anonymous/v2/video/episode/url?id=" + str3 + "&nid=" + str4;
            String strValueOf = String.valueOf(System.currentTimeMillis());
            String strSha1 = sha1(C1885z.m4560a("id=" + str3 + "&nid=" + str4 + String.format("&key=%s&t=%s", this.f213c, strValueOf)));
            HashMap map = new HashMap();
            map.put("sign", strSha1);
            map.put("T", strValueOf);
            map.put("Deviceid", "Deviceid");
            String strM4479n = C1840c.m4479n(str5, map);
            JSONObject jSONObject = new JSONObject();
            String string = new JSONObject(strM4479n).getJSONObject("data").getJSONArray("list").getJSONObject(0).getString("url");
            System.out.println("ssss" + string);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
            jSONObject2.put("Origin", this.f211a);
            jSONObject2.put("Referer", this.f211a);
            jSONObject.put("url", string);
            jSONObject.put("parse", "0");
            jSONObject.put("playUrl", "");
            jSONObject.put("header", jSONObject2.toString());
            return C2137a.addDanmaku(jSONObject.toString());
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) throws JSONException {
        ArrayList arrayList = new ArrayList();
        String str2 = this.f211a + "/api/mw-movie/anonymous/video/searchByWord?keyword=" + URLEncoder.encode(str) + "&pageNum=1&pageSize=8";
        String strValueOf = String.valueOf(System.currentTimeMillis());
        String strSha1 = sha1(C1885z.m4560a("keyword=" + str + "&pageNum=1&pageSize=8" + String.format("&key=%s&t=%s", this.f213c, strValueOf)));
        HashMap map = new HashMap();
        map.put("sign", strSha1);
        map.put("T", strValueOf);
        map.put("Deviceid", "Deviceid");
        JSONArray jSONArray = new JSONObject(C1840c.m4479n(str2, map)).getJSONObject("data").getJSONObject("result").getJSONArray("list");
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (!jSONObject.getString("vodClass").equals("伦理")) {
                C1846b.m4486a(jSONObject.getString("vodId"), jSONObject.getString("vodName"), jSONObject.getString("vodPic"), jSONObject.getString("vodRemarks"), arrayList);
            }
        }
        return Result.string(arrayList);
    }
}
