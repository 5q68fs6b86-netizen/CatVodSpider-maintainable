package com.github.catvod.spider;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p116a.C2137a;

import com.github.catvod.spider.support.p118c.C2192c;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.github.catvod.crawler.Spider;
import com.github.catvod.bean.Class;
import com.github.catvod.spider.support.p118c.C2191b;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.spider.support.p118c.C2195f;
import com.github.catvod.spider.support.p118c.C2196g;
import com.github.catvod.net.OkHttp;
import com.github.catvod.spider.support.p128m.C2258a;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AppGet extends Spider {

    /* JADX INFO: renamed from: f */
    private static Map<String, Boolean> f81f = new HashMap();

    /* JADX INFO: renamed from: a */
    private String f82a;

    /* JADX INFO: renamed from: b */
    private String f83b;

    /* JADX INFO: renamed from: c */
    private String f84c;

    /* JADX INFO: renamed from: d */
    private String f85d;

    /* JADX INFO: renamed from: e */
    private String f86e;

    /* JADX INFO: renamed from: f */
    private String f87f;

    /* JADX INFO: renamed from: g */
    private String f88g;

    static {
        Pattern.compile("data=([^&]*)");
    }

    /* JADX INFO: renamed from: a */
    private String m416a(String str, String str2) {
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            Map<String, String> mapM417b = m417b();
            HashMap map = (HashMap) mapM417b;
            map.put("Content-Type", "application/x-www-form-urlencoded");
            map.put("app-user-device-id", this.f85d);
            map.put("app-version-code", this.f86e);
            if (!TextUtils.isEmpty(this.f88g)) {
                map.put("app-user-token", this.f88g);
            }
            map.put("app-api-verify-time", strValueOf);
            map.put("app-ui-mode", "light");
            return C2258a.m6125a(new JSONObject(C2238b.m6066f(this.f82a + "/api.php" + str, str2, mapM417b).m6076a()).getString("data"), this.f83b, this.f84c);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    private Map<String, String> m417b() {
        HashMap map = new HashMap();
        map.put("User-Agent", TextUtils.isEmpty(this.f87f) ? "okhttp/3.14.9" : this.f87f);
        return map;
    }

    /* JADX INFO: renamed from: c */
    private String m418c(String str) {
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            String strEncodeToString = Base64.encodeToString(C2258a.m6136l(strValueOf, this.f83b, this.f84c), 2);
            String str2 = this.f82a + "/api.php/getappapi.index/vodParse";
            OkHttpClient okHttpClientM6060a = C2238b.m6060a();
            Request.Builder builderAddHeader = new Request.Builder().url(str2).method("POST", RequestBody.create(MediaType.parse("application/x-www-form-urlencoded"), str)).addHeader("User-Agent", this.f87f).addHeader("Connection", "Keep-Alive").addHeader("Content-Type", "application/x-www-form-urlencoded").addHeader("app-version-code", this.f86e);
            if (!TextUtils.isEmpty(this.f88g)) {
                builderAddHeader.addHeader("app-user-token", this.f88g);
            }
            return new JSONObject((String) ((Map) new Gson().fromJson(C2258a.m6125a(new JSONObject(okHttpClientM6060a.newCall(builderAddHeader.addHeader("app-ui-mode", "light").addHeader("app-user-device-id", this.f85d).addHeader("app-api-verify-time", strValueOf).addHeader("app-api-verify-sign", strEncodeToString).build()).execute().body().string()).getString("data"), this.f83b, this.f84c), Map.class)).get("json")).getString("url");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private C2196g createFilterItem(String str, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            C2195f c2195f = new C2195f();
            c2195f.m5859c(strOptString);
            c2195f.m5860d(strOptString);
            arrayList.add(c2195f);
        }
        C2196g c2196g = new C2196g();
        if ("sort".equals(str)) {
            str = "by";
        }
        c2196g.m5863a(str);
        if ("class".equals(str)) {
            c2196g.m5865b("类型");
        } else if ("lang".equals(str)) {
            c2196g.m5865b("语言");
        } else if ("area".equals(str)) {
            c2196g.m5865b("地区");
        } else if ("year".equals(str)) {
            c2196g.m5865b("年份");
        }
        if ("sort".equals(str)) {
            c2196g.m5865b("排序");
        }
        c2196g.m5864a(arrayList);
        return c2196g;
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
            Log.e("AppGet", "URL validation failed: ", e);
            return false;
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        List<Vod> arrayList = new ArrayList<>();
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("type_id", str);
            if (map != null) {
                if (map.containsKey("class")) {
                    String str3 = map.get("class");
                    if (!str3.isEmpty()) {
                        jsonObject.addProperty("class", str3);
                    }
                }
                if (map.containsKey("lang")) {
                    String str4 = map.get("lang");
                    if (!str4.isEmpty()) {
                        jsonObject.addProperty("lang", str4);
                    }
                }
                if (map.containsKey("area")) {
                    String str5 = map.get("area");
                    if (!str5.isEmpty()) {
                        jsonObject.addProperty("area", str5);
                    }
                }
                if (map.containsKey("year")) {
                    String str6 = map.get("year");
                    if (!str6.isEmpty()) {
                        jsonObject.addProperty("year", str6);
                    }
                }
                if (map.containsKey("by")) {
                    String str7 = map.get("by");
                    if (!str7.isEmpty()) {
                        jsonObject.addProperty("sort", str7);
                    }
                }
            }
            jsonObject.addProperty("page", str2);
            arrayList = parseVodList(new JSONObject(m416a("/getappapi.index/typeFilterVodList?page=" + jsonObject.get("page").getAsString(), jsonObject.toString())).optJSONArray("recommend_list"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.string(arrayList);
    }

    public String detailContent(List<String> list) {
        Vod c2194e;
        Vod c2194e2;
        String str;
        String str2 = "player_info";
        String str3 = "$$$";
        Vod c2194e3 = new Vod();
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("vod_id", list.get(0));
            JSONObject jSONObject = new JSONObject(m416a("/getappapi.index/vodDetail", jsonObject.toString()));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("vod");
            c2194e3.m5848j(list.get(0));
            c2194e3.m5849k(jSONObjectOptJSONObject.optString("vod_name"));
            c2194e3.m5850l(jSONObjectOptJSONObject.optString("vod_pic"));
            c2194e3.m5853o(jSONObjectOptJSONObject.optString("vod_remarks"));
            c2194e3.m5846h(jSONObjectOptJSONObject.optString("vod_content"));
            c2194e3.m5843f(jSONObjectOptJSONObject.optString("vod_actor"));
            c2194e3.m5847i(jSONObjectOptJSONObject.optString("vod_director"));
            c2194e3.m5842e(jSONObjectOptJSONObject.optString("vod_class"));
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("vod_play_list");
            jSONArrayOptJSONArray.length();
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
                String strOptString = jSONObjectOptJSONObject2.optJSONObject(str2).optString("show");
                String strOptString2 = jSONObjectOptJSONObject2.optJSONObject(str2).optString("parse");
                JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("urls");
                ArrayList arrayList3 = new ArrayList();
                int i2 = 0;
                while (i2 < jSONArrayOptJSONArray2.length()) {
                    JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i2);
                    String str4 = str2;
                    String strOptString3 = jSONObjectOptJSONObject3.optString("url");
                    JSONArray jSONArray = jSONArrayOptJSONArray;
                    String strOptString4 = jSONObjectOptJSONObject3.optString("parse_api_url");
                    JSONArray jSONArray2 = jSONArrayOptJSONArray2;
                    String strOptString5 = jSONObjectOptJSONObject3.optString("token");
                    c2194e2 = c2194e3;
                    try {
                        String strOptString6 = jSONObjectOptJSONObject3.optString("name");
                        String str5 = str3;
                        int i3 = i;
                        ArrayList arrayList4 = arrayList;
                        if (strOptString4.matches("^https?://.*")) {
                            str = strOptString6 + "$" + strOptString4 + "|" + jSONObjectOptJSONObject.optString("vod_name") + "|" + jSONObjectOptJSONObject3.optString("nid");
                        } else {
                            str = strOptString6 + "$parse_api=" + strOptString2 + "&url=" + Base64.encodeToString(C2258a.m6136l(strOptString3, this.f83b, this.f84c), 2) + "&token=" + strOptString5 + "|" + jSONObjectOptJSONObject.optString("vod_name") + "|" + jSONObjectOptJSONObject3.optString("nid");
                        }
                        arrayList3.add(str);
                        i2++;
                        jSONArrayOptJSONArray = jSONArray;
                        str2 = str4;
                        jSONArrayOptJSONArray2 = jSONArray2;
                        c2194e3 = c2194e2;
                        str3 = str5;
                        i = i3;
                        arrayList = arrayList4;
                    } catch (Exception e) {
                        e = e;
                        c2194e = c2194e2;
                        e.printStackTrace();
                        String strM5795m = Result.string(c2194e);
                        C2137a.parseJsonAndSave(strM5795m);
                        return strM5795m;
                    }
                }
                ArrayList arrayList5 = arrayList;
                arrayList2.add(strOptString);
                arrayList5.add(TextUtils.join("#", arrayList3));
                i++;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                arrayList = arrayList5;
                str2 = str2;
                c2194e3 = c2194e3;
                str3 = str3;
            }
            ArrayList arrayList6 = arrayList;
            c2194e2 = c2194e3;
            String str6 = str3;
            c2194e = c2194e2;
            try {
                c2194e.m5851m(TextUtils.join(str6, arrayList2));
                c2194e.m5852n(TextUtils.join(str6, arrayList6));
            } catch (Exception e2) {
                e = e2;
                e.printStackTrace();
            }
        } catch (Exception e3) {
            e = e3;
            c2194e = c2194e3;
        }
        String strM5795m2 = Result.string(c2194e);
        C2137a.parseJsonAndSave(strM5795m2);
        return strM5795m2;
    }

    public String edu(String str) {
        Matcher matcher = Pattern.compile("(url=)(.*?)(?=&token)(&token)").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            try {
                matcher.appendReplacement(stringBuffer, matcher.group(1) + URLEncoder.encode(matcher.group(2), "UTF-8") + matcher.group(3));
            } catch (Exception e) {
                e.printStackTrace();
                return str;
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public String eduAesDecode(String str) {
        Matcher matcher = Pattern.compile("(&url=)(.*?)(?=&token)(&token)").matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            try {
                matcher.appendReplacement(stringBuffer, matcher.group(1) + C2258a.m6125a(matcher.group(2), this.f83b, this.f84c) + matcher.group(3));
            } catch (Exception e) {
                e.printStackTrace();
                return str;
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public String homeContent(boolean z) {
        JSONArray jSONArrayOptJSONArray;
        ArrayList arrayList = new ArrayList();
        List<Vod> arrayList2 = new ArrayList<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            JSONObject jSONObject = new JSONObject(m416a("/getappapi.index/initV119", new JsonObject().toString()));
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("recommend_list");
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("type_list");
            for (int i = 0; i < jSONArrayOptJSONArray3.length(); i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray3.getJSONObject(i);
                String string = jSONObject2.getString("type_id");
                String string2 = jSONObject2.getString("type_name");
                if (!string2.contains("正版QQ群") && !"伦理".equals(string2) && !"福利".equals(string2) && !"小影院".equals(string2)) {
                    arrayList.add(new Class(string, string2));
                    JSONArray jSONArrayOptJSONArray4 = jSONObject2.optJSONArray("filter_type_list");
                    if (jSONArrayOptJSONArray4 != null) {
                        ArrayList arrayList3 = new ArrayList();
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray4.length(); i2++) {
                            JSONObject jSONObject3 = jSONArrayOptJSONArray4.getJSONObject(i2);
                            String strOptString = jSONObject3.optString("name");
                            if (("class".equals(strOptString) || "area".equals(strOptString) || "lang".equals(strOptString) || "year".equals(strOptString) || "sort".equals(strOptString)) && (jSONArrayOptJSONArray = jSONObject3.optJSONArray("list")) != null) {
                                arrayList3.add(createFilterItem(strOptString, jSONArrayOptJSONArray));
                            }
                        }
                        linkedHashMap.put(string, arrayList3);
                    }
                }
            }
            arrayList2 = parseVodList(jSONArrayOptJSONArray2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return C2192c.m5802q((List<Class>) arrayList, arrayList2, (LinkedHashMap<String, List<C2191b>>) linkedHashMap);
    }

    public void init(Context context, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url", "");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = OkHttp.string(jSONObject.optString("site"), new HashMap());
                if (TextUtils.isEmpty(strOptString)) {
                    Log.e("AppGet", "Both url and site are invalid!");
                } else {
                    for (String str2 : strOptString.split("\n")) {
                        String strTrim = str2.trim();
                        if (!TextUtils.isEmpty(strTrim) && isUrlValid(strTrim)) {
                            Log.i("AppGet", "Using valid URL: " + strTrim);
                            strOptString = strTrim;
                            break;
                        }
                    }
                }
            }
            this.f82a = strOptString;
            this.f83b = jSONObject.optString("dataKey");
            this.f84c = jSONObject.optString("dataIv");
            this.f85d = jSONObject.optString("deviceId");
            this.f86e = jSONObject.optString("version");
            this.f87f = jSONObject.optString("ua");
            this.f88g = jSONObject.optString("token");
            f81f = Init.getKeywordsMap();
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
                String strOptString = jSONObject.optString("vod_name");
                if (f81f.isEmpty() || !f81f.containsKey(strOptString)) {
                    arrayList.add(new Vod(jSONObject.optString("vod_id"), strOptString, jSONObject.optString("vod_pic"), jSONObject.optString("vod_remarks")));
                }
                i++;
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            String[] strArrSplit = str2.split("\\|");
            if (strArrSplit.length == 4) {
                strArrSplit = (strArrSplit[0] + "|" + strArrSplit[2] + "|" + strArrSplit[3]).split("\\|");
            }
            String strEduAesDecode = strArrSplit[0];
            String str3 = Proxy.getUrl() + "?do=appdanmu&vodName=" + strArrSplit[1] + "&vodIndex=" + strArrSplit[2] + "&vodUrl=";
            Map<String, String> mapM417b = m417b();
            ((HashMap) mapM417b).put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
            if (strEduAesDecode.matches("^https?://.*") && (strEduAesDecode.contains("?url=") || strEduAesDecode.contains("?key="))) {
                String strM6073l = OkHttp.string(strEduAesDecode, m417b());
                if (strM6073l.startsWith("{")) {
                    strEduAesDecode = new JSONObject(strM6073l).optString("url");
                } else {
                    Matcher matcher = Pattern.compile("\"url\"\\s*:\\s*\"([^\"]+)\"").matcher(strM6073l);
                    if (matcher.find()) {
                        strEduAesDecode = matcher.group(1);
                    }
                }
                C2192c c2192c = new C2192c();
                c2192c.m5827u(strEduAesDecode);
                if (strEduAesDecode.contains("url=")) {
                    c2192c.m5820j();
                }
                c2192c.m5806a(str3);
                c2192c.m5811e(mapM417b);
                return c2192c.toString();
            }
            if (strEduAesDecode.matches(".*(m3u8|mp4|mkv).*")) {
                C2192c c2192c2 = new C2192c();
                c2192c2.m5827u(strEduAesDecode);
                c2192c2.m5806a(str3);
                c2192c2.m5811e(m417b());
                return c2192c2.toString();
            }
            if (strEduAesDecode.contains("?url=") || strEduAesDecode.contains("?key=") || strEduAesDecode.contains("html")) {
                strEduAesDecode = eduAesDecode(strEduAesDecode);
                Matcher matcher2 = Pattern.compile("(parse_api=)(.*?)(?=&token)(&token)").matcher(strEduAesDecode);
                if (matcher2.find()) {
                    String strOptString = new JSONObject(OkHttp.string(matcher2.group(2), null)).optJSONObject("data").optString("url");
                    if (!strOptString.isEmpty()) {
                        C2192c c2192c3 = new C2192c();
                        c2192c3.m5827u(strOptString);
                        c2192c3.m5806a(str3);
                        c2192c3.m5811e(mapM417b);
                        return c2192c3.toString();
                    }
                    String strM6062b = C2238b.m6062b(strOptString, m417b());
                    C2192c c2192c4 = new C2192c();
                    c2192c4.m5827u(strM6062b);
                    c2192c4.m5806a(str3);
                    c2192c4.m5811e(mapM417b);
                    return c2192c4.toString();
                }
            }
            String strM418c = m418c(edu(strEduAesDecode));
            if (!strM418c.isEmpty()) {
                C2192c c2192c5 = new C2192c();
                c2192c5.m5827u(strM418c);
                c2192c5.m5806a(str3);
                c2192c5.m5811e(mapM417b);
                return c2192c5.toString();
            }
            String strM6062b2 = C2238b.m6062b(strM418c, m417b());
            C2192c c2192c6 = new C2192c();
            c2192c6.m5827u(strM6062b2);
            c2192c6.m5806a(str3);
            c2192c6.m5811e(mapM417b);
            return c2192c6.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        List<Vod> arrayList = new ArrayList<>();
        try {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("type_id", 0);
            jsonObject.addProperty("keywords", str);
            jsonObject.addProperty("page", 1);
            arrayList = parseVodList(new JSONObject(m416a("/getappapi.index/searchList", jsonObject.toString())).optJSONArray("search_list"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Result.string(arrayList);
    }
}
