package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.bean.Class;
import com.github.catvod.spider.support.p118c.C2191b;
import com.github.catvod.bean.Result;
import com.github.catvod.bean.Vod;
import com.github.catvod.net.OkHttp;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.MultipartBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class AppRJ extends Spider {

    /* JADX INFO: renamed from: a */
    private String f114a;

    /* JADX INFO: renamed from: a */
    public static String m431a(String str) {
        try {
            StringBuilder sb = new StringBuilder(new BigInteger(1, MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"))).toString(16));
            while (sb.length() < 32) {
                sb.insert(0, "0");
            }
            return sb.toString().toLowerCase();
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private String m432a(String str, Map<String, String> map) {
        try {
            String str2 = this.f114a + str;
            MultipartBody.Builder type = new MultipartBody.Builder().setType(MultipartBody.FORM);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                type.addFormDataPart(entry.getKey(), entry.getValue());
            }
            Response responseExecute = new OkHttpClient().newCall(new Request.Builder().url(str2).post(type.build()).addHeader("User-Agent", "okhttp-okgo/jeasonlzy").build()).execute();
            if (!responseExecute.isSuccessful()) {
                return "";
            }
            String strString = responseExecute.body().string();
            SpiderDebug.log("result\r\n" + strString);
            return strString;
        } catch (Exception e) {
            SpiderDebug.log(e.toString());
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3 = (System.currentTimeMillis() / 1000) + "";
        HashMap mapM5658c = C2174h.m5658c("timestamp", str3, "sign", m431a("7gp0bnd2sr85ydii2j32pcypscoc4w6c7g5spl" + str3));
        mapM5658c.put("type_id", str);
        mapM5658c.put("limit", "12");
        mapM5658c.put("page", str2);
        if (map != null && map.containsKey("area")) {
            mapM5658c.put("area", map.get("area"));
        }
        if (map != null && map.containsKey("class")) {
            mapM5658c.put("class", map.get("class"));
        }
        if (map != null && map.containsKey("lang")) {
            mapM5658c.put("lang", map.get("lang"));
        }
        if (map != null && map.containsKey("year")) {
            mapM5658c.put("year", map.get("year"));
        }
        JSONArray jSONArrayOptJSONArray = new JSONObject(m432a("/v3/home/type_search", mapM5658c)).optJSONObject("data").optJSONArray("list");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString("vod_pic");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObjectOptJSONObject.optString("vod_pic_thumb");
            }
            arrayList.add(new Vod(jSONObjectOptJSONObject.optString("vod_id"), jSONObjectOptJSONObject.optString("vod_name"), strOptString, jSONObjectOptJSONObject.optString("vod_remarks")));
        }
        C2192c c2192c = Result.get()();
        c2192c.m5817i(Integer.valueOf(str2).intValue(), 0, 0, 0);
        c2192c.m5829w(arrayList);
        return c2192c.toString();
    }

    public String detailContent(List<String> list) throws JSONException {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis() / 1000);
        String str = "";
        sb.append("");
        String string = sb.toString();
        HashMap mapM5658c = C2174h.m5658c("timestamp", string, "sign", m431a("7gp0bnd2sr85ydii2j32pcypscoc4w6c7g5spl" + string));
        mapM5658c.put("vod_id", list.get(0));
        JSONObject jSONObjectOptJSONObject = new JSONObject(m432a("/v3/home/vod_details", mapM5658c)).optJSONObject("data");
        Vod c2194e = new Vod();
        c2194e.m5848j(list.get(0));
        c2194e.m5849k(jSONObjectOptJSONObject.optString("vod_name"));
        String strOptString = jSONObjectOptJSONObject.optString("vod_pic");
        if (TextUtils.isEmpty(strOptString)) {
            strOptString = jSONObjectOptJSONObject.optString("vod_pic_thumb");
        }
        c2194e.m5850l(strOptString);
        c2194e.m5853o(jSONObjectOptJSONObject.optString("vod_remarks"));
        c2194e.m5846h(jSONObjectOptJSONObject.optString("vod_content"));
        c2194e.m5855q(jSONObjectOptJSONObject.optString("vod_year"));
        c2194e.m5843f(jSONObjectOptJSONObject.optString("vod_actor"));
        c2194e.m5847i(jSONObjectOptJSONObject.optString("vod_director"));
        c2194e.m5854p(jSONObjectOptJSONObject.optString("vod_class"));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("vod_play_list");
        int i = 0;
        while (i < jSONArrayOptJSONArray.length()) {
            ArrayList arrayList3 = new ArrayList();
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i);
            String str2 = "name";
            String string2 = jSONObjectOptJSONObject2.getString("name");
            String strOptString2 = jSONObjectOptJSONObject2.optString("ua");
            JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONArray("urls");
            JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("parse_urls");
            int i2 = 0;
            String string3 = str;
            while (i2 < jSONArrayOptJSONArray3.length()) {
                StringBuilder sbM5396a = C2137a.m5396a(string3);
                sbM5396a.append(jSONArrayOptJSONArray3.optString(i2));
                sbM5396a.append("@");
                i2++;
                string3 = sbM5396a.toString();
            }
            int i3 = 0;
            while (i3 < jSONArrayOptJSONArray2.length()) {
                JSONObject jSONObjectOptJSONObject3 = jSONArrayOptJSONArray2.optJSONObject(i3);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(jSONObjectOptJSONObject3.optString(str2));
                sb2.append("$");
                String str3 = string3;
                sb2.append(str3);
                sb2.append("|");
                sb2.append(jSONObjectOptJSONObject3.optString("url"));
                sb2.append("|");
                sb2.append(strOptString2);
                sb2.append("|");
                sb2.append(jSONObjectOptJSONObject.optString("vod_name"));
                sb2.append("|");
                sb2.append(jSONObjectOptJSONObject3.optString("nid"));
                arrayList3.add(sb2.toString());
                i3++;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
                string3 = str3;
                str2 = str2;
            }
            arrayList2.add(string2);
            arrayList.add(TextUtils.join("#", arrayList3));
            i++;
            str = string3;
        }
        c2194e.m5851m(TextUtils.join("$$$", arrayList2));
        c2194e.m5852n(TextUtils.join("$$$", arrayList));
        String strM5795m = Result.string(c2194e);
        C2137a.parseJsonAndSave(strM5795m);
        return strM5795m;
    }

    public String homeContent(boolean z) {
        String str;
        try {
            ArrayList arrayList = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String str2 = (System.currentTimeMillis() / 1000) + "";
            String strM431a = m431a("7gp0bnd2sr85ydii2j32pcypscoc4w6c7g5spl" + str2);
            HashMap map = new HashMap();
            map.put("timestamp", str2);
            map.put("sign", strM431a);
            JSONArray jSONArrayOptJSONArray = new JSONObject(m432a("/v3/type/top_type", map)).optJSONObject("data").optJSONArray("list");
            int i = 0;
            while (i < jSONArrayOptJSONArray.length()) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                arrayList.add(new Class(jSONObjectOptJSONObject.optString("type_id"), jSONObjectOptJSONObject.optString("type_name")));
                ArrayList arrayList2 = new ArrayList();
                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next.equals("extend")) {
                        str = "类型";
                    } else if (next.equals("area")) {
                        str = "地区";
                    } else if (next.equals("year")) {
                        str = "年份";
                    } else {
                        str = next.equals("lang") ? "语言" : "";
                    }
                    if (!TextUtils.isEmpty(str)) {
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray(next);
                        ArrayList arrayList3 = new ArrayList();
                        JSONArray jSONArray = jSONArrayOptJSONArray;
                        int i2 = 0;
                        while (i2 < jSONArrayOptJSONArray2.length()) {
                            if (jSONArrayOptJSONArray2.optString(i2).length() > 1) {
                                arrayList3.add(new C2191b.a(jSONArrayOptJSONArray2.optString(i2), jSONArrayOptJSONArray2.optString(i2)));
                            }
                            i2++;
                            itKeys = itKeys;
                        }
                        Iterator<String> it = itKeys;
                        if (arrayList3.size() > 1) {
                            arrayList2.add(new C2191b(next.replace("extend", "class"), str, arrayList3));
                        }
                        jSONArrayOptJSONArray = jSONArray;
                        itKeys = it;
                    }
                }
                linkedHashMap.put(jSONObjectOptJSONObject.optString("type_id"), arrayList2);
                i++;
                jSONArrayOptJSONArray = jSONArrayOptJSONArray;
            }
            return C2192c.m5802q((List<Class>) arrayList, (List<Vod>) new ArrayList(), (LinkedHashMap<String, List<C2191b>>) linkedHashMap);
        } catch (Exception e) {
            SpiderDebug.log(e.toString());
            return "";
        }
    }

    public void init(Context context, String str) {
        try {
            this.f114a = new JSONObject(str).getString("url");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            String[] strArrSplit = str2.split("\\|");
            if (strArrSplit.length == 5) {
                strArrSplit = (strArrSplit[0] + "|" + strArrSplit[1] + "|" + strArrSplit[2] + "||" + strArrSplit[3] + "|" + strArrSplit[4]).split("\\|");
            }
            String str3 = strArrSplit[0];
            String strOptString = strArrSplit[1];
            String strOptString2 = strArrSplit[2];
            String str4 = strArrSplit[3];
            String str5 = strArrSplit[4];
            String str6 = strArrSplit[5];
            if (!TextUtils.isEmpty(str3)) {
                for (String str7 : str3.split("@")) {
                    if (!TextUtils.isEmpty(str7)) {
                        HashMap map = new HashMap();
                        map.put("Referer", "");
                        String str8 = (System.currentTimeMillis() / 1000) + "";
                        JSONObject jSONObject = new JSONObject(OkHttp.string(str7 + strOptString + "&sign=" + m431a("7gp0bnd2sr85ydii2j32pcypscoc4w6c7g5spl" + str8) + "&timestamp=" + str8, map));
                        strOptString = jSONObject.optString("url");
                        strOptString2 = jSONObject.optString("UA", strOptString2);
                        if (C2137a.m5397a(strOptString)) {
                            break;
                        }
                    }
                }
            }
            if (!strOptString.startsWith("http")) {
                return "";
            }
            String str9 = Proxy.getUrl() + "?do=appdanmu&vodName=" + str5 + "&vodIndex=" + str6 + "&vodUrl=";
            HashMap map2 = new HashMap();
            if (!TextUtils.isEmpty(strOptString2)) {
                map2.put("User-Agent", strOptString2);
            }
            C2192c c2192c = Result.get()();
            c2192c.m5820j();
            c2192c.m5827u(strOptString);
            c2192c.m5806a(str9);
            return c2192c.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        String str2 = (System.currentTimeMillis() / 1000) + "";
        HashMap mapM5658c = C2174h.m5658c("timestamp", str2, "sign", m431a("7gp0bnd2sr85ydii2j32pcypscoc4w6c7g5spl" + str2));
        mapM5658c.put("keyword", str);
        mapM5658c.put("limit", "12");
        mapM5658c.put("page", "1");
        JSONArray jSONArrayOptJSONArray = new JSONObject(m432a("/v3/home/search", mapM5658c)).optJSONObject("data").optJSONArray("list");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
            String strOptString = jSONObjectOptJSONObject.optString("vod_pic");
            if (TextUtils.isEmpty(strOptString)) {
                strOptString = jSONObjectOptJSONObject.optString("vod_pic_thumb");
            }
            arrayList.add(new Vod(jSONObjectOptJSONObject.optString("vod_id"), jSONObjectOptJSONObject.optString("vod_name"), strOptString, jSONObjectOptJSONObject.optString("vod_remarks")));
        }
        return Result.string(arrayList);
    }
}
