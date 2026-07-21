package com.github.catvod.spider;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p117b.C2174h;
import com.github.catvod.spider.support.p116a.C2137a;

import com.github.catvod.spider.support.p118c.C2192c;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.bean.Class;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import com.github.catvod.spider.support.p128m.C2256I;
import com.google.gson.JsonObject;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AppSy extends Spider {

    /* JADX INFO: renamed from: a */
    private String f115a;

    /* JADX INFO: renamed from: b */
    private String f116b;

    /* JADX INFO: renamed from: c */
    private String f117c;

    /* JADX INFO: renamed from: d */
    private String f118d;

    /* JADX INFO: renamed from: e */
    private Map<String, String> f119e;

    /* JADX INFO: renamed from: f */
    private String f120f;

    /* JADX INFO: renamed from: g */
    private String f121g = "";

    /* JADX INFO: renamed from: h */
    private String f122h = "";

    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX INFO: renamed from: a */
    private void m433a() {
        try {
            JSONObject jSONObject = new JSONObject(C2137a.m5395a(OkHttp.string(this.f115a + "/shark/api.php?action=configs", m437e()), this.f117c));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("config");
            this.f121g = jSONObjectOptJSONObject.optString("versionName");
            this.f120f = jSONObjectOptJSONObject.optString("hulue").split("&")[0];
            this.f122h = jSONObjectOptJSONObject.optString("ua");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("playerinfos");
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject2.optString("playerjiekou");
                if (!TextUtils.isEmpty(strOptString)) {
                    String strOptString2 = jSONObjectOptJSONObject2.optString("playername");
                    String strM5395a = C2137a.m5395a(strOptString, this.f120f);
                    if (!TextUtils.isEmpty(strM5395a)) {
                        this.f119e.put(strOptString2, strM5395a);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    private String m434b(String str) {
        if (!str.startsWith("http")) {
            str = C2174h.m5657b(new StringBuilder(), this.f115a, str);
        }
        return C2137a.m5395a(OkHttp.string(str, m437e()), this.f117c);
    }

    /* JADX INFO: renamed from: c */
    private String m435c(String str, String str2) {
        Map<String, String> mapM437e = m437e();
        ((HashMap) mapM437e).put("Content-Type", "application/json; charset=utf-8");
        return C2137a.m5395a(C2238b.m6066f(this.f115a + str, str2, mapM437e).m6076a(), this.f117c);
    }

    /* JADX INFO: renamed from: d */
    private String m436d(String str, Map<String, String> map, String str2) {
        Map<String, String> mapM437e = m437e();
        ((HashMap) mapM437e).put("Content-Type", "application/json; charset=utf-8");
        return C2137a.m5395a(C2238b.m6067g(str, map, mapM437e).m6076a(), str2);
    }

    /* JADX INFO: renamed from: e */
    private Map<String, String> m437e() {
        String strM6109a = C2256I.m6109a(this.f122h);
        HashMap map = new HashMap();
        map.put("User-Agent", String.format("Dalvik/1.0.0 (Linux; U; Android 10; google Build/Pixel 3)", this.f121g));
        map.put("ua", strM6109a);
        map.put("version", this.f121g);
        return map;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        ArrayList arrayList = new ArrayList();
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("area", "");
            jsonObject.addProperty("rank", "按上新");
            jsonObject.addProperty("type", "");
            jsonObject.addProperty("year", "");
            jsonObject.addProperty("type_id", str);
            try {
                JSONArray jSONArrayOptJSONArray = new JSONObject(m435c("/api.php/v1.classify/content?page=" + str2, jsonObject.toString())).optJSONObject("data").optJSONArray("video_list");
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    arrayList.add(new Vod(jSONObjectOptJSONObject.optString("vod_id"), jSONObjectOptJSONObject.optString("vod_name"), jSONObjectOptJSONObject.optString("vod_pic"), jSONObjectOptJSONObject.optString("vod_remarks") + "|" + jSONObjectOptJSONObject.optString("vod_score")));
                }
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
            }
        } catch (Exception e2) { Exception /*e=e2*/
        }
        return Result.string(arrayList);
    }

    public String detailContent(List<String> list) {
        Vod c2194e = new Vod();
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(m434b("/api.php/v1.player/details?vod_id=" + list.get(0))).optJSONObject("data").optJSONObject("detail");
            SpiderDebug.log(jSONObjectOptJSONObject.toString());
            c2194e.m5848j(list.get(0));
            c2194e.m5849k(jSONObjectOptJSONObject.optString("vod_name"));
            c2194e.m5850l(jSONObjectOptJSONObject.optString("vod_pic"));
            c2194e.m5853o(jSONObjectOptJSONObject.optString("vod_remarks"));
            c2194e.m5846h(jSONObjectOptJSONObject.optString("vod_content"));
            c2194e.m5843f(jSONObjectOptJSONObject.optString("vod_actor"));
            c2194e.m5847i(jSONObjectOptJSONObject.optString("vod_director"));
            c2194e.m5842e(jSONObjectOptJSONObject.optString("vod_class"));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("play_url_list");
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject2.optString("from");
                String strReplaceAll = jSONObjectOptJSONObject2.optString("show").replaceAll("\\(.*?\\)|（.*?）", "");
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("urls");
                ArrayList arrayList3 = new ArrayList();
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i2);
                    arrayList3.add(jSONObjectOptJSONObject3.optString("name") + "$" + strOptString + "|" + jSONObjectOptJSONObject3.optString("url") + "|" + jSONObjectOptJSONObject3.optString("name") + "|" + jSONObjectOptJSONObject.optString("vod_name"));
                }
                arrayList2.add(strReplaceAll);
                arrayList.add(TextUtils.join("#", arrayList3));
            }
            c2194e.m5851m(TextUtils.join("$$$", arrayList2));
            c2194e.m5852n(TextUtils.join("$$$", arrayList));
        } catch (Exception e) {
            e.printStackTrace();
        }
        String strM5795m = Result.string(c2194e);
        C2137a.parseJsonAndSave(strM5795m);
        return strM5795m;
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(m434b("/api.php/v1.home/types")).optJSONObject("data").optJSONArray("types");
            for (int i = 1; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                arrayList.add(new Class(jSONObjectOptJSONObject.optString("type_id"), jSONObjectOptJSONObject.optString("type_name")));
            }
            String strOptString = "";
            for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                strOptString = jSONArrayOptJSONArray.optJSONObject(i2).optString("type_id");
                if (!strOptString.isEmpty()) {
                    break;
                }
            }
            JSONArray jSONArrayOptJSONArray2 = new JSONObject(m434b("/api.php/v1.home/data?type_id=" + strOptString)).optJSONObject("data").optJSONArray("banners");
            for (int i3 = 0; i3 < jSONArrayOptJSONArray2.length(); i3++) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i3);
                arrayList2.add(new Vod(jSONObjectOptJSONObject2.optString("vod_id"), jSONObjectOptJSONObject2.optString("vod_name"), jSONObjectOptJSONObject2.optString("vod_pic"), jSONObjectOptJSONObject2.optString("vod_remarks") + "|" + jSONObjectOptJSONObject2.optString("vod_score")));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.string(arrayList, arrayList2);
    }

    public void init(Context context, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            this.f116b = jSONObject.optString("siteKey");
            this.f117c = jSONObject.optString("listKey");
            this.f118d = jSONObject.optString("parsesKey");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObject.optString("site");
                if (!TextUtils.isEmpty(strOptString)) {
                    HashMap map = new HashMap();
                    map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/120.0.0.0 Safari/537.36");
                    map.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
                    strOptString = new JSONArray(C2137a.m5395a(OkHttp.string(strOptString, map), this.f116b)).getString(0);
                }
            }
            this.f115a = strOptString;
            this.f119e = new HashMap();
            m433a();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    public String playerContent(String str, String str2, List<String> list) {
        String strM436d;
        try {
            String[] strArrSplit = str2.split("\\|");
            String str3 = strArrSplit[0];
            String str4 = strArrSplit[1];
            String str5 = strArrSplit[2];
            String str6 = Proxy.getUrl() + "?do=appdanmu&vodName=" + strArrSplit[3] + "&vodIndex=" + str5 + "&vodUrl=";
            if (C2137a.m5397a(str4)) {
                C2192c c2192c = new C2192c();
                c2192c.m5827u(str4);
                c2192c.m5806a(str6);
                return c2192c.toString();
            }
            String str7 = (String) this.f119e.get(str3);
            if (TextUtils.isEmpty(str7)) {
                return C2192c.m5794l("解析失败");
            }
            if (str7.startsWith("http")) {
                strM436d = OkHttp.string(str7 + str4, null);
            } else {
                String str8 = this.f115a + "/shark/api.php?action=parsevod";
                HashMap map = new HashMap();
                map.put("parse", str7);
                map.put("url", str4);
                map.put("matching", "");
                strM436d = m436d(str8, map, this.f118d);
            }
            String strOptString = new JSONObject(strM436d).optString("url");
            if (TextUtils.isEmpty(strOptString)) {
                return C2192c.m5794l("获取视频失败");
            }
            Map<String, String> mapM437e = m437e();
            ((HashMap) mapM437e).remove("Content-Type");
            C2192c c2192c2 = new C2192c();
            c2192c2.m5827u(strOptString);
            c2192c2.m5806a(str6);
            c2192c2.m5811e(mapM437e);
            return c2192c2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        try {
            try {
                JSONArray jSONArrayOptJSONArray = new JSONObject(m434b("/api.php/v1.search/data?wd=" + URLEncoder.encode(str) + "&type_id=0&page=1")).optJSONObject("data").optJSONArray("search_data");
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    arrayList.add(new Vod(jSONObjectOptJSONObject.optString("vod_id"), jSONObjectOptJSONObject.optString("vod_name"), jSONObjectOptJSONObject.optString("vod_pic"), jSONObjectOptJSONObject.optString("vod_remarks") + "|" + jSONObjectOptJSONObject.optString("vod_score")));
                }
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
            }
        } catch (Exception e2) { Exception /*e=e2*/
        }
        return Result.string(arrayList);
    }
}
