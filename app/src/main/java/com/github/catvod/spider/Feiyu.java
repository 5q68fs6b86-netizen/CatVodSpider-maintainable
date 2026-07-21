package com.github.catvod.spider;
import com.github.catvod.spider.support.p116a.C2137a;

import android.content.Context;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.Feiyu;
import com.github.catvod.spider.support.p116a.C2139c;
import com.github.catvod.spider.support.p117b.C2185u;
import com.github.catvod.net.OkHttp;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Feiyu extends Spider {

    /* JADX INFO: renamed from: a */
    private String f169a = "";

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ int m511a(Feiyu feiyu, JSONObject jSONObject, JSONObject jSONObject2) {
        feiyu.getClass();
        int iM512c = feiyu.m512c(jSONObject.optString("name", jSONObject.optString("code", "")));
        int iM512c2 = feiyu.m512c(jSONObject2.optString("name", jSONObject2.optString("code", "")));
        if (iM512c2 == iM512c) {
            return 0;
        }
        return iM512c2 < iM512c ? -1 : 1;
    }

    /* JADX INFO: renamed from: c */
    private int m512c(String str) {
        String lowerCase = str.toLowerCase();
        if (lowerCase.contains("4k")) {
            return 100;
        }
        if (lowerCase.contains("藍光") || lowerCase.contains("2k")) {
            return 90;
        }
        if (lowerCase.contains("高清") || lowerCase.contains("hd")) {
            return 80;
        }
        return (lowerCase.contains("m3u8") || lowerCase.contains("採集") || lowerCase.contains("資源") || lowerCase.contains("zy")) ? 10 : 50;
    }

    /* JADX INFO: renamed from: d */
    private String m513d(String str, String str2) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(str2.getBytes(StandardCharsets.UTF_8), "HmacSHA256"));
            byte[] bArrDoFinal = mac.doFinal(str.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder(bArrDoFinal.length * 2);
            for (byte b : bArrDoFinal) {
                sb.append(String.format("%02x", Byte.valueOf(b)));
            }
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    private JSONObject m514e(String str, Map map, boolean z) {
        String str2;
        String string;
        String string2;
        try {
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            StringBuilder sb = new StringBuilder();
            Random random = new Random();
            for (int i = 0; i < 16; i++) {
                sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(62)));
            }
            String strEncodeToString = Base64.encodeToString(sb.toString().getBytes(StandardCharsets.UTF_8), 2);
            String str3 = "";
            if (map == null || map.isEmpty()) {
                str2 = "";
                string = str2;
                string2 = string;
            } else {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    String str4 = (String) entry.getValue();
                    String strEncode = URLEncoder.encode(str4, "UTF-8");
                    StringBuilder sb2 = new StringBuilder();
                    String str5 = str3;
                    sb2.append((String) entry.getKey());
                    sb2.append("=");
                    if (!z) {
                        str4 = strEncode;
                    }
                    sb2.append(str4);
                    arrayList.add(sb2.toString());
                    arrayList2.add(((String) entry.getKey()) + "=" + strEncode);
                    str3 = str5;
                }
                str2 = str3;
                StringBuilder sb3 = new StringBuilder();
                Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    while (true) {
                        sb3.append((CharSequence) it.next());
                        if (!it.hasNext()) {
                            break;
                        }
                        sb3.append((CharSequence) "&");
                    }
                }
                string = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    while (true) {
                        sb4.append((CharSequence) it2.next());
                        if (!it2.hasNext()) {
                            break;
                        }
                        sb4.append((CharSequence) "&");
                    }
                }
                string2 = sb4.toString();
            }
            CharSequence[] charSequenceArr = {"GET".toUpperCase(), str, string, strValueOf, strEncodeToString, "2.6.8+1"};
            StringBuilder sb5 = new StringBuilder();
            sb5.append(charSequenceArr[0]);
            for (int i2 = 1; i2 < 6; i2++) {
                sb5.append((CharSequence) "\n");
                sb5.append(charSequenceArr[i2]);
            }
            String strM513d = m513d(sb5.toString(), this.f169a);
            HashMap map2 = new HashMap();
            map2.put("x-signature", strM513d);
            map2.put("user-agent", "Dart/3.10 (dart:io)");
            map2.put("x-nonce", strEncodeToString);
            map2.put("accept", "application/json");
            map2.put("x-timestamp", strValueOf);
            map2.put("host", "4kyszx.top");
            map2.put("x-device-id", "f45a775875e2e004adbcea78e3312218");
            map2.put("content-type", "application/json");
            map2.put("x-app-version", "2.6.8+1");
            map2.put("x-platform", "android");
            StringBuilder sb6 = new StringBuilder();
            sb6.append("https://4kyszx.top");
            sb6.append(str);
            sb6.append(string2.isEmpty() ? str2 : "?" + string2);
            return new JSONObject(OkHttp.string(sb6.toString(), map2));
        } catch (Exception unused) {
            return new JSONObject();
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str2 == null) {
            str2 = "1";
        }
        linkedHashMap.put("page", str2);
        linkedHashMap.put("page_size", "20");
        if (map != null) {
            if (map.containsKey("class")) {
                linkedHashMap.put("class", map.get("class"));
            }
            if (map.containsKey("year")) {
                linkedHashMap.put("year", map.get("year"));
            }
            if (map.containsKey("area")) {
                linkedHashMap.put("area", map.get("area"));
            }
            if (map.containsKey("lang")) {
                linkedHashMap.put("lang", map.get("lang"));
            }
        }
        JSONObject jSONObjectM514e = m514e(C2185u.m5754a("/api/app/categories/", str, "/videos"), linkedHashMap, true);
        JSONArray jSONArray = new JSONArray();
        if (jSONObjectM514e.has("data")) {
            Object obj = jSONObjectM514e.get("data");
            JSONArray jSONArrayOptJSONArray = null;
            if (obj instanceof JSONArray) {
                jSONArrayOptJSONArray = (JSONArray) obj;
            } else if (obj instanceof JSONObject) {
                jSONArrayOptJSONArray = ((JSONObject) obj).optJSONArray("list");
            }
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", String.valueOf(jSONObject.optInt("id")));
                    jSONObject2.put("vod_name", jSONObject.optString("name", jSONObject.optString("title", "")));
                    jSONObject2.put("vod_pic", jSONObject.optString("pic", jSONObject.optString("cover", "")));
                    jSONObject2.put("vod_remarks", jSONObject.optString("remarks", jSONObject.optString("subTitle", "")));
                    jSONArray.put(jSONObject2);
                }
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("page", Integer.parseInt((String) linkedHashMap.get("page")));
        jSONObject3.put("pagecount", 999);
        jSONObject3.put("list", jSONArray);
        return jSONObject3.toString();
    }

    public String detailContent(List<String> list) throws JSONException {
        JSONObject jSONObjectM514e = m514e(C2139c.m5408a("/api/app/videos/", list.get(0)), null, false);
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        if (jSONObjectM514e.has("data")) {
            JSONObject jSONObjectOptJSONObject = jSONObjectM514e.optJSONObject("data");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vod_id", String.valueOf(jSONObjectOptJSONObject.optInt("id")));
            jSONObject2.put("vod_name", jSONObjectOptJSONObject.optString("name", ""));
            jSONObject2.put("vod_pic", jSONObjectOptJSONObject.optString("pic", ""));
            jSONObject2.put("type_name", jSONObjectOptJSONObject.optString("categoryName", ""));
            jSONObject2.put("vod_year", jSONObjectOptJSONObject.optString("year", ""));
            jSONObject2.put("vod_area", jSONObjectOptJSONObject.optString("area", ""));
            jSONObject2.put("vod_actor", jSONObjectOptJSONObject.optString("actor", ""));
            jSONObject2.put("vod_director", jSONObjectOptJSONObject.optString("director", ""));
            jSONObject2.put("vod_content", jSONObjectOptJSONObject.optString("content", ""));
            jSONObject2.put("vod_remarks", jSONObjectOptJSONObject.optString("remarks", jSONObjectOptJSONObject.optString("subTitle", "")));
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("playGroups");
            if (jSONArrayOptJSONArray != null) {
                ArrayList<JSONObject> arrayList = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    arrayList.add(jSONArrayOptJSONArray.getJSONObject(i));
                }
                arrayList.sort(new Comparator() { // from class: com.github.catvod.spider.support.p001A.a0
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        return Feiyu.m511a(this.f377a, (JSONObject) obj, (JSONObject) obj2);
                    }
                });
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (JSONObject jSONObject3 : arrayList) {
                    arrayList2.add(jSONObject3.optString("name", jSONObject3.optString("code", "")));
                    String strOptString = jSONObject3.optString("parseApi", "");
                    JSONArray jSONArrayOptJSONArray2 = jSONObject3.optJSONArray("playUrls");
                    ArrayList arrayList4 = new ArrayList();
                    if (jSONArrayOptJSONArray2 != null) {
                        for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                            JSONObject jSONObject4 = jSONArrayOptJSONArray2.getJSONObject(i2);
                            arrayList4.add(jSONObject4.optString("name") + "$" + strOptString + "||" + jSONObject4.optString("url"));
                        }
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList4.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb.append((CharSequence) it.next());
                            if (it.hasNext()) {
                                sb.append((CharSequence) "#");
                            }
                        }
                    }
                    arrayList3.add(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder();
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    while (true) {
                        sb2.append((CharSequence) it2.next());
                        if (!it2.hasNext()) {
                            break;
                        }
                        sb2.append((CharSequence) "$$$");
                    }
                }
                jSONObject2.put("vod_play_from", sb2.toString());
                StringBuilder sb3 = new StringBuilder();
                Iterator it3 = arrayList3.iterator();
                if (it3.hasNext()) {
                    while (true) {
                        sb3.append((CharSequence) it3.next());
                        if (!it3.hasNext()) {
                            break;
                        }
                        sb3.append((CharSequence) "$$$");
                    }
                }
                jSONObject2.put("vod_play_url", sb3.toString());
            }
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("list", jSONArray);
        return jSONObject.toString();
    }

    public String homeContent(boolean z) throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectM514e = m514e("/api/app/categories", null, false);
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject = new JSONObject();
        if (jSONObjectM514e.has("data") && (jSONArrayOptJSONArray = jSONObjectM514e.optJSONArray("data")) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                String strValueOf = String.valueOf(jSONObject2.optInt("id"));
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("type_id", strValueOf);
                jSONObject3.put("type_name", jSONObject2.optString("name"));
                jSONArray.put(jSONObject3);
            }
        }
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("class", jSONArray);
        jSONObject4.put("filters", jSONObject);
        return jSONObject4.toString();
    }

    public String homeVideoContent() throws JSONException {
        JSONArray jSONArrayOptJSONArray;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("category", "1");
        JSONObject jSONObjectM514e = m514e("/api/app/ranking/list", linkedHashMap, false);
        JSONArray jSONArray = new JSONArray();
        if (jSONObjectM514e.has("data") && (jSONArrayOptJSONArray = jSONObjectM514e.optJSONArray("data")) != null) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", String.valueOf(jSONObject.optInt("id")));
                jSONObject2.put("vod_name", jSONObject.optString("title", jSONObject.optString("name", "")));
                jSONObject2.put("vod_pic", jSONObject.optString("cover", jSONObject.optString("pic", "")));
                jSONObject2.put("vod_remarks", jSONObject.optString("subtitle", jSONObject.optString("remarks", "")));
                jSONArray.put(jSONObject2);
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("list", jSONArray);
        return jSONObject3.toString();
    }

    public void init(Context context, String str) {
        super.init(context, str);
        this.f169a = m513d("f45a775875e2e004adbcea78e3312218", "cms_device_salt_v1_2024cms_app_sign_key_v1_2024_secure");
    }

    public String playerContent(String str, String str2, List<String> list) throws JSONException {
        String[] strArrSplit = str2.split("\\|\\|");
        String str3 = strArrSplit[0];
        String str4 = strArrSplit.length > 1 ? strArrSplit[1] : "";
        JSONObject jSONObject = new JSONObject();
        if ((str3.isEmpty() && (str4.contains(".m3u8") || str4.contains(".mp4"))) || str3.isEmpty()) {
            jSONObject.put("parse", 0);
            jSONObject.put("url", str4);
            jSONObject.put("jx", 0);
        } else {
            if (str3.contains("json") || str3.contains("api")) {
                try {
                    HashMap map = new HashMap();
                    map.put("User-Agent", "Mozilla/5.0");
                    JSONObject jSONObject2 = new JSONObject(OkHttp.string(str3 + str4, map));
                    if (jSONObject2.has("url")) {
                        jSONObject.put("parse", 0);
                        jSONObject.put("url", jSONObject2.optString("url"));
                        jSONObject.put("jx", 0);
                        return C2137a.addDanmaku(jSONObject.toString());
                    }
                } catch (Exception unused) {
                }
            }
            jSONObject.put("parse", 1);
            jSONObject.put("url", str3 + str4);
            jSONObject.put("jx", 1);
        }
        return C2137a.addDanmaku(jSONObject.toString());
    }

    public String searchContent(String str, boolean z) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("keyword", str);
        linkedHashMap.put("page", "1");
        linkedHashMap.put("page_size", "20");
        JSONObject jSONObjectM514e = m514e("/api/app/videos/search", linkedHashMap, true);
        JSONArray jSONArray = new JSONArray();
        if (jSONObjectM514e.has("data")) {
            Object obj = jSONObjectM514e.get("data");
            JSONArray jSONArrayOptJSONArray = null;
            if (obj instanceof JSONArray) {
                jSONArrayOptJSONArray = (JSONArray) obj;
            } else if (obj instanceof JSONObject) {
                jSONArrayOptJSONArray = ((JSONObject) obj).optJSONArray("list");
            }
            if (jSONArrayOptJSONArray != null) {
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", String.valueOf(jSONObject.optInt("id")));
                    jSONObject2.put("vod_name", jSONObject.optString("name", jSONObject.optString("title", "")));
                    jSONObject2.put("vod_pic", jSONObject.optString("pic", jSONObject.optString("cover", "")));
                    jSONObject2.put("vod_remarks", jSONObject.optString("remarks", jSONObject.optString("subTitle", "")));
                    jSONArray.put(jSONObject2);
                }
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("list", jSONArray);
        return jSONObject3.toString();
    }
}
