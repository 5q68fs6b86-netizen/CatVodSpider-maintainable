package com.github.catvod.spider;
import com.github.catvod.spider.support.p116a.C2137a;

import com.github.catvod.spider.support.p044FM.p075c.C1765g;

import com.github.catvod.spider.support.p118c.C2192c;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.support.p001A.C0082a;
import com.github.catvod.bean.Class;
import com.github.catvod.spider.support.p044FM.p075c.C1760b;
import com.github.catvod.spider.support.p044FM.p075c.C1761c;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import com.github.catvod.spider.support.p044FM.p090o.C1860a;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AppMuou extends Spider {

    /* JADX INFO: renamed from: a */
    private String f97a;

    /* JADX INFO: renamed from: b */
    private String f98b;

    /* JADX INFO: renamed from: d */
    private String f100d;

    /* JADX INFO: renamed from: e */
    private String f101e;

    /* JADX INFO: renamed from: f */
    private String f102f;

    /* JADX INFO: renamed from: c */
    private Map<String, String> f99c = new HashMap();

    /* JADX INFO: renamed from: g */
    private String f103g = "";

    /* JADX INFO: renamed from: h */
    private String f104h = "";

    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX INFO: renamed from: a */
    private void m423a(String str, String str2) {
        try {
            String str3 = (System.currentTimeMillis() / 1000) + "";
            String strM839i = C0082a.m839i(str3 + str2);
            String strM839i2 = C0082a.m839i(str3 + strM839i + "muouapp");
            HashMap map = new HashMap();
            map.put("t", str3);
            map.put("n", strM839i);
            map.put("m", strM839i2);
            JSONObject jSONObject = new JSONObject(C1840c.m4474i(str + "/app_info.php", map));
            String strOptString = jSONObject.optString("a");
            int iOptInt = jSONObject.optInt("s");
            int iOptInt2 = jSONObject.optInt("e");
            String strOptString2 = jSONObject.optString("data");
            String strSubstring = strOptString2.substring(iOptInt, strOptString2.length() - iOptInt2);
            JSONObject jSONObject2 = new JSONObject(C1860a.m4489a(strSubstring, C1885z.m4560a(strOptString).substring(0, 16), C1885z.m4560a(strM839i2).substring(0, 16)));
            this.f100d = C1885z.m4560a(jSONObject2.optString("key")).substring(0, 16);
            this.f101e = C1885z.m4560a(jSONObject2.optString("iv")).substring(0, 16);
            this.f98b = jSONObject2.optString("HBqq");
            this.f104h = jSONObject2.optString("HBrjjg");
            JSONArray jSONArrayOptJSONArray = new JSONObject(C1860a.m4489a(C1840c.m4479n(this.f97a + "/api.php?action=playerinfo", m427e()), this.f100d, this.f101e)).optJSONObject("data").optJSONArray("playerinfo");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject3 = jSONArrayOptJSONArray.getJSONObject(i);
                this.f99c.put(jSONObject3.optString("playername"), jSONObject3.optString("playerjiekou"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    private String m424b(String str) {
        return new JSONObject(str).optString("url");
    }

    /* JADX INFO: renamed from: c */
    private String m425c(String str) {
        try {
            String strM4479n = C1840c.m4479n(this.f98b + str, m426d());
            String strM4489a = C1860a.m4489a(strM4479n, this.f100d, this.f101e);
            return strM4489a != null ? strM4489a : new JSONObject(strM4479n).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: d */
    private Map<String, String> m426d() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Linux; Android 10; SM-G975F) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.120 Mobile Safari/537.36");
        map.put("app-version", "4.2.0");
        map.put("app-device", "nodata");
        map.put("sys-version", "12");
        map.put("brand-model", "SM-E5658");
        map.put("os", "Android");
        map.put("Cookie", "X_CACHE_KEY=16ad0ae42479c326edfc7436e7ea2f46");
        return map;
    }

    /* JADX INFO: renamed from: e */
    private Map<String, String> m427e() {
        HashMap map = new HashMap();
        map.put("User-Agent", "okhttp/3.14.9");
        return map;
    }

    private boolean isUrlValid(String str) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestMethod("HEAD");
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            int responseCode = httpURLConnection.getResponseCode();
            return responseCode == 200 || responseCode == 302 || responseCode == 301;
        } catch (Exception e) {
            Log.e("AppMuou", "URL validation failed: ", e);
            return false;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3;
        String str4;
        String str5;
        String str6 = "/api.php/v1.vod?type=" + str + "&page=" + str2;
        String str7 = "";
        if (map == null || !map.containsKey("area")) {
            str3 = "";
        } else {
            str3 = "&area=" + map.get("area");
        }
        if (map == null || !map.containsKey("year")) {
            str4 = "";
        } else {
            str4 = "&year=" + map.get("year");
        }
        if (map == null || !map.containsKey("by")) {
            str5 = "";
        } else {
            str5 = "&by=" + map.get("sort");
        }
        if (map != null && map.containsKey("class")) {
            str7 = "&class=" + map.get("class");
        }
        new ArrayList();
        List<Vod> vodList = parseVodList(new JSONObject(m425c(str6 + str3 + str4 + str5 + str7)).optJSONObject("data").optJSONArray("list"));
        C1765g c1765g = new C1765g();
        c1765g.m4202k(Integer.valueOf(str2).intValue(), 0, 0, 0);
        c1765g.m4209z(vodList);
        return c1765g.toString();
    }

    public String detailContent(List<String> list) {
        String str = "/api.php/v1.vod/detail?vod_id=" + list.get(0);
        Vod c1768j = new Vod();
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(m425c(str)).optJSONObject("data");
            c1768j.m4221g(list.get(0));
            String strOptString = jSONObjectOptJSONObject.optString("vod_name");
            this.f103g = strOptString;
            c1768j.m4222h(strOptString);
            c1768j.m4223i(jSONObjectOptJSONObject.optString("vod_pic"));
            c1768j.m4216b(jSONObjectOptJSONObject.optString("vod_class"));
            c1768j.m4226l(jSONObjectOptJSONObject.optString("vod_remarks"));
            c1768j.m4219e(jSONObjectOptJSONObject.optString("vod_content"));
            c1768j.m4217c(jSONObjectOptJSONObject.optString("vod_actor"));
            c1768j.m4220f(jSONObjectOptJSONObject.optString("vod_director"));
            c1768j.m4218d(jSONObjectOptJSONObject.optString("vod_area"));
            c1768j.m4228n(jSONObjectOptJSONObject.optString("vod_year"));
            LinkedList linkedList = new LinkedList();
            LinkedList linkedList2 = new LinkedList();
            JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("vod_play_list");
            Iterator<String> itKeys = jSONObjectOptJSONObject2.keys();
            while (itKeys.hasNext()) {
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(itKeys.next());
                linkedList2.add(jSONObjectOptJSONObject3.optJSONObject("player_info").optString("show"));
                ArrayList arrayList = new ArrayList();
                JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("urls");
                Iterator<String> itKeys2 = jSONObjectOptJSONObject4.keys();
                while (itKeys2.hasNext()) {
                    JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject4.optJSONObject(itKeys2.next());
                    arrayList.add(jSONObjectOptJSONObject5.optString("name") + "$" + jSONObjectOptJSONObject5.toString());
                }
                linkedList.add(TextUtils.join("#", arrayList));
            }
            c1768j.m4224j(TextUtils.join("$$$", linkedList2));
            c1768j.m4225k(TextUtils.join("$$$", linkedList));
            return Result.string(c1768j);
        } catch (Exception e) {
            e.printStackTrace();
            String strM4188p = Result.string(c1768j);
            C2137a.parseJsonAndSave(strM4188p);
            return strM4188p;
        }
    }

    public String homeContent(boolean z) throws JSONException {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = new JSONObject(m425c("/api.php/v1.vod/types")).optJSONObject("data").optJSONArray("typelist");
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
            String strOptString = jSONObject.optString("type_name");
            String strOptString2 = jSONObject.optString("type_id");
            if (!"伦理片".equals(strOptString)) {
                arrayList.add(new Class(strOptString2, strOptString));
                ArrayList arrayList3 = new ArrayList();
                Iterator<String> itKeys = jSONObject.optJSONObject("type_extend").keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next.equals("class")) {
                        str = "类型";
                    } else if (next.equals("area")) {
                        str = "地区";
                    } else if (next.equals("year")) {
                        str = "年份";
                    } else {
                        str = next.equals("lang") ? "语言" : "";
                    }
                    if (!TextUtils.isEmpty(str)) {
                        String[] strArrSplit = jSONObject.optJSONObject("type_extend").optString(next).split(",");
                        ArrayList arrayList4 = new ArrayList();
                        ArrayList arrayList5 = arrayList2;
                        JSONArray jSONArray = jSONArrayOptJSONArray;
                        int i2 = 0;
                        while (i2 < strArrSplit.length) {
                            if (!TextUtils.isEmpty(strArrSplit[i2])) {
                                String str2 = strArrSplit[i2];
                                arrayList4.add(new C1760b(str2, str2));
                            }
                            i2++;
                            jSONObject = jSONObject;
                        }
                        JSONObject jSONObject2 = jSONObject;
                        if (arrayList4.size() > 1) {
                            arrayList3.add(new C1761c(next, str, arrayList4));
                        }
                        arrayList2 = arrayList5;
                        jSONArrayOptJSONArray = jSONArray;
                        jSONObject = jSONObject2;
                    }
                }
                linkedHashMap.put(strOptString2, arrayList3);
            }
        }
        ArrayList arrayList6 = arrayList2;
        JSONArray jSONArrayOptJSONArray2 = new JSONObject(m425c("/api.php/v1.vod/HomeIndex?page=&limit=6")).optJSONArray("data").optJSONObject(1).optJSONArray("vod_list");
        return Result.string(arrayList, (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) ? arrayList6 : parseVodList(jSONArrayOptJSONArray2), linkedHashMap);
    }

    public void init(Context context, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url", "");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = C1840c.m4479n(jSONObject.optString("site"), new HashMap());
                if (TextUtils.isEmpty(strOptString)) {
                    Log.e("AppMuou", "Both host and site are invalid!");
                } else {
                    for (String str2 : strOptString.split("\n")) {
                        String strTrim = str2.trim();
                        if (!TextUtils.isEmpty(strTrim) && isUrlValid(strTrim)) {
                            Log.i("AppMuou", "Using valid URL: " + strTrim);
                            strOptString = strTrim;
                            break;
                        }
                    }
                }
            }
            this.f97a = strOptString;
            this.f102f = jSONObject.optString("name", "");
            m423a(this.f97a, this.f102f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Vod> parseVodList(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            try {
                jSONArray.getClass();
                if (i >= jSONArray.length()) {
                    break;
                }
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                arrayList.add(new Vod(jSONObject.optString("vod_id"), jSONObject.optString("vod_name"), jSONObject.optString("vod_pic"), jSONObject.optString("vod_remarks")));
                i++;
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0098 A[Catch: Exception -> 0x00b0, TryCatch #0 {Exception -> 0x00b0, blocks: (B:2:0x0000, B:4:0x004c, B:6:0x0057, B:8:0x005f, B:9:0x006a, B:10:0x006f, B:12:0x008e, B:15:0x00a4, B:14:0x0098, B:5:0x004f), top: B:20:0x0000 }] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public String playerContent(String str, String str2, List<String> list) {
        String strM424b;
        C1765g c1765g;
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String strOptString = jSONObject.optString("url");
            String strOptString2 = jSONObject.optString("from");
            String str3 = Proxy.getUrl() + "?do=appdanmu&vodName=" + this.f103g + "&vodIndex=" + jSONObject.optString("nid") + "&vodUrl=";
            String str4 = TextUtils.isEmpty((CharSequence) this.f99c.get(strOptString2)) ? this.f104h : (String) this.f99c.get(strOptString2);
            if (strOptString.matches(".*(m3u8|mp4).*")) {
                c1765g = new C2192c();
                c1765g.m4207x(strOptString);
                c1765g.m4195a(str3);
            } else {
                String strM4479n = C1840c.m4479n(str4 + strOptString, m427e());
                if (strM4479n.startsWith("{")) {
                    strM424b = m424b(strM4479n);
                    if (strM424b.isEmpty()) {
                        strM424b = m424b(C1860a.m4489a(strM4479n, this.f100d, this.f101e));
                    }
                } else {
                    strM424b = m424b(C1860a.m4489a(strM4479n, this.f100d, this.f101e));
                }
                c1765g = new C2192c();
                c1765g.m4207x(strM424b);
                c1765g.m4195a(str3);
            }
            return c1765g.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "{\"parse\":0,\"url\":\"\",\"msg\":\"播放链接解析失败,请更换其他源播放\",\"errMsg\":\"播放链接解析失败,请更换其他源播放\"}";
        }
    }

    public String searchContent(String str, boolean z) {
        JSONArray jSONArrayOptJSONArray = new JSONObject(m425c("/api.php/v1.vod?wd= " + URLEncoder.encode(str) + "&limit=18&page=1")).optJSONObject("data").optJSONArray("list");
        new ArrayList();
        return Result.string(parseVodList(jSONArrayOptJSONArray));
    }
}
}

