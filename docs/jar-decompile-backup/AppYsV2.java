package com.github.catvod.spider;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p002A0.AbstractC0405ku;
import com.github.catvod.spider.support.p002A0.AbstractC0771yi;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes.dex */
public class AppYsV2 extends Spider {

    /* JADX INFO: renamed from: a */
    public static final Pattern f134a = Pattern.compile("api\\.php/.*?/vod");

    /* JADX INFO: renamed from: b */
    public static final Pattern f135b;

    /* JADX INFO: renamed from: c */
    public static final Pattern f136c;

    /* JADX INFO: renamed from: d */
    public static final Pattern[] f137d;

    /* JADX INFO: renamed from: e */
    public final HashMap f138e = new HashMap();

    /* JADX INFO: renamed from: f */
    public String[] f139f = null;

    static {
        Pattern.compile("api\\.php/.+?\\.vod");
        Pattern.compile("/.+\\?.+=");
        f135b = Pattern.compile(".*(url|v|vid|php\\?id)=");
        f136c = Pattern.compile("https?://[^/]*");
        f137d = new Pattern[]{Pattern.compile("player=new"), Pattern.compile("<div id=\"video\""), Pattern.compile("<div id=\"[^\"]*?player\""), Pattern.compile("//视频链接"), Pattern.compile("HlsJsPlayer\\("), Pattern.compile("<iframe[\\s\\S]*?src=\"[^\"]+?\""), Pattern.compile("<video[\\s\\S]*?src=\"[^\"]+?\"")};
    }

    /* JADX INFO: renamed from: g */
    public static void m452g(JSONObject jSONObject, String str, ArrayList arrayList) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (next.equals(str) && (obj instanceof JSONArray)) {
                    arrayList.add((JSONArray) obj);
                }
                if (obj instanceof JSONObject) {
                    m452g((JSONObject) obj, str, arrayList);
                } else if (obj instanceof JSONArray) {
                    JSONArray jSONArray = (JSONArray) obj;
                    for (int i = 0; i < jSONArray.length(); i++) {
                        m452g(jSONArray.getJSONObject(i), str, arrayList);
                    }
                }
            } catch (JSONException e) {
                SpiderDebug.log(e);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static HashMap m453h(String str) {
        String str2;
        HashMap map = new HashMap();
        if (str.contains("api.php/app") || str.contains("xgapp") || str.contains("freekan")) {
            str2 = "Dart/2.14 (dart:io)";
        } else if (str.contains("zsb") || str.contains("fkxs") || str.contains("xays") || str.contains("xcys") || str.contains("szys") || str.contains("dxys") || str.contains("ytys") || str.contains("qnys")) {
            str2 = "Dart/2.15 (dart:io)";
        } else {
            str2 = str.contains(".vod") ? "okhttp/4.1.0" : "Dalvik/2.1.0";
        }
        map.put("User-Agent", str2);
        return map;
    }

    /* JADX INFO: renamed from: i */
    public static String m454i(String str, String str2) {
        if (str.contains(".vod")) {
            if (str.contains("iopenyun.com")) {
                return str + "/list?wd=" + str2 + "&page=";
            }
            return str + "?wd=" + str2 + "&page=";
        }
        if (str.contains("api.php/app") || str.contains("xgapp")) {
            return str + "search?text=" + str2 + "&pg=";
        }
        if (!f134a.matcher(str).find()) {
            return "";
        }
        if (str.contains("esellauto") || str.contains("1.14.63.101") || str.contains("zjys") || str.contains("dcd") || str.contains("lxue") || str.contains("weetai.cn") || str.contains("haokanju1") || str.contains("fit:8") || str.contains("zjj.life") || str.contains("love9989") || str.contains("8d8q") || str.contains("lk.pxun") || str.contains("hgyx") || str.contains("521x5") || str.contains("lxyyy") || str.contains("0818tv") || str.contains("diyoui") || str.contains("diliktv") || str.contains("ppzhu") || str.contains("aitesucai") || str.contains("zz.ci") || str.contains("chxjon") || str.contains("watchmi") || str.contains("vipbp") || str.contains("bhtv") || str.contains("xfykl")) {
            return str + "?ac=list&wd=" + str2 + "&page=";
        }
        return str + "?ac=list&zm=" + str2 + "&page=";
    }

    /* JADX INFO: renamed from: j */
    public static boolean m455j(String str) {
        return str.equals("伦理") || str.equals("情色") || str.equals("福利");
    }

    /* JADX INFO: renamed from: k */
    public static String m456k(JSONArray jSONArray) {
        try {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                arrayList.add(jSONArray.getString(i));
            }
            return TextUtils.join(",", arrayList);
        } catch (JSONException unused) {
            return "";
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String str3;
        String str4;
        int i;
        JSONArray jSONArray;
        try {
            String strM459n = m459n();
            str3 = "";
            try {
                StringBuilder sb = new StringBuilder();
                String str5 = "vod_id";
                sb.append(m460o(strM459n));
                sb.append(str);
                if (strM459n.contains("api.php/app") || strM459n.contains("xgapp")) {
                    str4 = "&class=筛选class&area=筛选area&lang=筛选lang&year=筛选year&limit=18&pg=#PN#";
                } else {
                    str4 = strM459n.contains(".vod") ? "&class=筛选class&area=筛选area&lang=筛选lang&year=筛选year&by=排序&limit=18&page=#PN#" : "&page=#PN#&area=筛选area&type=筛选class&start=筛选year";
                }
                sb.append(str4);
                String strReplace = sb.toString().replace("#PN#", str2).replace("筛选class", (map == null || !map.containsKey("class")) ? str3 : map.get("class")).replace("筛选area", (map == null || !map.containsKey("area")) ? str3 : map.get("area")).replace("筛选lang", (map == null || !map.containsKey("lang")) ? str3 : map.get("lang")).replace("筛选year", (map == null || !map.containsKey("year")) ? str3 : map.get("year")).replace("排序", (map == null || !map.containsKey("排序")) ? str3 : map.get("排序"));
                SpiderDebug.log(strReplace);
                String strM1889k = AbstractC0771yi.m1889k(strReplace, m453h(strReplace));
                m457l(strM1889k);
                JSONObject jSONObject = new JSONObject(strM1889k);
                try {
                    if (jSONObject.has("totalpage") && (jSONObject.get("totalpage") instanceof Integer)) {
                        i = jSONObject.getInt("totalpage");
                    } else if (jSONObject.has("pagecount") && (jSONObject.get("pagecount") instanceof Integer)) {
                        i = jSONObject.getInt("pagecount");
                    } else if (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONObject) && jSONObject.getJSONObject("data").has("total") && (jSONObject.getJSONObject("data").get("total") instanceof Integer) && jSONObject.getJSONObject("data").has("limit") && (jSONObject.getJSONObject("data").get("limit") instanceof Integer)) {
                        int i2 = jSONObject.getJSONObject("data").getInt("limit");
                        int i3 = jSONObject.getJSONObject("data").getInt("total");
                        i = i3 % i2 == 0 ? i3 / i2 : (i3 / i2) + 1;
                    } else {
                        i = Integer.MAX_VALUE;
                    }
                } catch (Exception e) {
                    SpiderDebug.log(e);
                }
                JSONArray jSONArray2 = new JSONArray();
                if (jSONObject.has("list") && (jSONObject.get("list") instanceof JSONArray)) {
                    jSONArray = jSONObject.getJSONArray("list");
                } else if (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONObject) && jSONObject.getJSONObject("data").has("list") && (jSONObject.getJSONObject("data").get("list") instanceof JSONArray)) {
                    jSONArray = jSONObject.getJSONObject("data").getJSONArray("list");
                } else {
                    jSONArray = (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONArray)) ? jSONObject.getJSONArray("data") : null;
                }
                if (jSONArray != null) {
                    int i4 = 0;
                    while (i4 < jSONArray.length()) {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                        String str6 = str5;
                        if (jSONObject2.has(str6)) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put(str6, jSONObject2.getString(str6));
                            jSONObject3.put("vod_name", jSONObject2.getString("vod_name"));
                            jSONObject3.put("vod_pic", jSONObject2.getString("vod_pic"));
                            jSONObject3.put("vod_remarks", jSONObject2.getString("vod_remarks"));
                            jSONArray2.put(jSONObject3);
                        } else {
                            JSONObject jSONObject4 = new JSONObject();
                            jSONObject4.put(str6, jSONObject2.getString("nextlink"));
                            jSONObject4.put("vod_name", jSONObject2.getString("title"));
                            jSONObject4.put("vod_pic", jSONObject2.getString("pic"));
                            jSONObject4.put("vod_remarks", jSONObject2.getString("state"));
                            jSONArray2.put(jSONObject4);
                        }
                        i4++;
                        str5 = str6;
                    }
                }
                JSONObject jSONObject5 = new JSONObject();
                jSONObject5.put("page", str2);
                jSONObject5.put("pagecount", i);
                jSONObject5.put("limit", 90);
                jSONObject5.put("total", Integer.MAX_VALUE);
                jSONObject5.put("list", jSONArray2);
                return jSONObject5.toString();
            } catch (Exception e2) {
                e = e2;
                SpiderDebug.log(e);
                return str3;
            }
        } catch (Exception e3) {
            e = e3;
            str3 = "";
        }
    }

    public String detailContent(List<String> list) {
        try {
            String strM459n = m459n();
            String str = m464s(strM459n) + list.get(0);
            SpiderDebug.log(str);
            String strM1889k = AbstractC0771yi.m1889k(str, m453h(str));
            m457l(strM1889k);
            JSONObject jSONObject = new JSONObject(strM1889k);
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            m458m(strM459n, jSONObject, jSONObject3, list.get(0));
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(jSONObject3);
            jSONObject2.put("list", jSONArray);
            String string = jSONObject2.toString();
            C2137a.parseJsonAndSave(string);
            return string;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object, org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, org.json.JSONArray] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    public String homeContent(boolean z) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        JSONArray jSONArray;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        AppYsV2 appYsV2 = this;
        String str14 = "";
        String str15 = "筛选";
        try {
            String strM461p = appYsV2.m461p(m459n());
            String str16 = "=";
            String str17 = "\\+";
            String str18 = "\n";
            JSONArray jSONArray2 = null;
            String str19 = "type_id";
            String str20 = "type_name";
            if (strM461p.isEmpty()) {
                String[] strArrSplit = appYsV2.m462q(strM461p, null).split("\n")[0].split("\\+");
                jSONArray2 = new JSONArray();
                for (int i = 1; i < strArrSplit.length; i++) {
                    String[] strArrSplit2 = strArrSplit[i].trim().split("=");
                    if (strArrSplit2.length >= 2) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("type_name", strArrSplit2[0].trim());
                        jSONObject.put("type_id", strArrSplit2[1].trim());
                        jSONArray2.put(jSONObject);
                    }
                }
            } else {
                SpiderDebug.log(strM461p);
                String strM1889k = AbstractC0771yi.m1889k(strM461p, m453h(strM461p));
                appYsV2.m457l(strM1889k);
                JSONObject jSONObject2 = new JSONObject(strM1889k);
                if (jSONObject2.has("list") && (jSONObject2.get("list") instanceof JSONArray)) {
                    jSONArray2 = jSONObject2.getJSONArray("list");
                } else if (jSONObject2.has("data") && (jSONObject2.get("data") instanceof JSONObject) && jSONObject2.getJSONObject("data").has("list") && (jSONObject2.getJSONObject("data").get("list") instanceof JSONArray)) {
                    jSONArray2 = jSONObject2.getJSONObject("data").getJSONArray("list");
                } else if (jSONObject2.has("data") && (jSONObject2.get("data") instanceof JSONArray)) {
                    jSONArray2 = jSONObject2.getJSONArray("data");
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            JSONArray jSONArray3 = new JSONArray();
            if (jSONArray2 != null) {
                int i2 = 0;
                while (i2 < jSONArray2.length()) {
                    JSONObject jSONObject4 = jSONArray2.getJSONObject(i2);
                    JSONArray jSONArray4 = jSONArray2;
                    String string = jSONObject4.getString(str20);
                    if (m455j(string)) {
                        str2 = str15;
                        str = str14;
                        jSONArray = jSONArray3;
                        strM461p = strM461p;
                        str3 = str16;
                        str4 = str17;
                        str5 = str18;
                        str6 = str19;
                        str7 = str20;
                    } else {
                        String string2 = jSONObject4.getString(str19);
                        JSONArray jSONArray5 = jSONArray3;
                        JSONObject jSONObject5 = new JSONObject();
                        jSONObject5.put(str19, string2);
                        jSONObject5.put(str20, string);
                        JSONObject jSONObjectOptJSONObject = jSONObject4.optJSONObject("type_extend");
                        if (z) {
                            String[] strArrSplit3 = appYsV2.m462q(strM461p, jSONObjectOptJSONObject).split(str18);
                            ?? jSONArray6 = new JSONArray();
                            for (?? IsEmpty = strM461p.isEmpty(); IsEmpty < strArrSplit3.length; IsEmpty++) {
                                String strTrim = strArrSplit3[IsEmpty].trim();
                                if (strTrim.isEmpty()) {
                                    str8 = str15;
                                    str10 = str14;
                                    str11 = str16;
                                    str18 = str18;
                                    str12 = str19;
                                    str13 = str20;
                                } else {
                                    String[] strArrSplit4 = strTrim.split(str17);
                                    String strTrim2 = strArrSplit4[0].trim();
                                    if (strTrim2.contains(str15)) {
                                        String strReplace = strTrim2.replace(str15, str14);
                                        if (strReplace.equals("class")) {
                                            strTrim2 = "类型";
                                            str8 = str15;
                                        } else {
                                            str8 = str15;
                                            if (strReplace.equals("area")) {
                                                strTrim2 = "地区";
                                            } else if (strReplace.equals("lang")) {
                                                strTrim2 = "语言";
                                            } else if (strReplace.equals("year")) {
                                                strTrim2 = "年份";
                                            }
                                        }
                                        str9 = strTrim2;
                                        strTrim2 = strReplace;
                                    } else {
                                        str8 = str15;
                                        str9 = strTrim2;
                                    }
                                    ?? jSONObject6 = new JSONObject();
                                    jSONObject6.put("key", strTrim2);
                                    jSONObject6.put("name", str9);
                                    JSONArray jSONArray7 = new JSONArray();
                                    int i3 = 1;
                                    while (i3 < strArrSplit4.length) {
                                        JSONObject jSONObject7 = new JSONObject();
                                        String[] strArr = strArrSplit4;
                                        String strTrim3 = strArrSplit4[i3].trim();
                                        String str21 = str19;
                                        int iIndexOf = strTrim3.indexOf(str16);
                                        String str22 = str16;
                                        String str23 = str20;
                                        String str24 = str14;
                                        if (iIndexOf != -1) {
                                            String strSubstring = strTrim3.substring(0, iIndexOf);
                                            if (!m455j(strSubstring)) {
                                                jSONObject7.put("n", strSubstring.trim());
                                                jSONObject7.put("v", strTrim3.substring(iIndexOf + 1).trim());
                                                jSONArray7.put(jSONObject7);
                                            }
                                        } else if (!m455j(strTrim3)) {
                                            jSONObject7.put("n", strTrim3);
                                            jSONObject7.put("v", strTrim3);
                                            jSONArray7.put(jSONObject7);
                                        }
                                        i3++;
                                        str19 = str21;
                                        strArrSplit4 = strArr;
                                        str16 = str22;
                                        str20 = str23;
                                        str14 = str24;
                                    }
                                    str10 = str14;
                                    str11 = str16;
                                    str12 = str19;
                                    str13 = str20;
                                    jSONObject6.put("value", jSONArray7);
                                    jSONArray6.put(jSONObject6);
                                }
                                str18 = str18;
                                str17 = str17;
                                str15 = str8;
                                strArrSplit3 = strArrSplit3;
                                str19 = str12;
                                str16 = str11;
                                str20 = str13;
                                str14 = str10;
                            }
                            str2 = str15;
                            str = str14;
                            str3 = str16;
                            str4 = str17;
                            str5 = str18;
                            str6 = str19;
                            str7 = str20;
                            if (!jSONObject3.has("filters")) {
                                jSONObject3.put("filters", new JSONObject());
                            }
                            jSONObject3.getJSONObject("filters").put(string2, jSONArray6);
                        } else {
                            str2 = str15;
                            str = str14;
                            str3 = str16;
                            str4 = str17;
                            str5 = str18;
                            str6 = str19;
                            str7 = str20;
                        }
                        jSONArray = jSONArray5;
                        jSONArray.put(jSONObject5);
                    }
                    try {
                        i2++;
                        appYsV2 = this;
                        jSONArray3 = jSONArray;
                        jSONArray2 = jSONArray4;
                        strM461p = strM461p;
                        str18 = str5;
                        str17 = str4;
                        str15 = str2;
                        str19 = str6;
                        str16 = str3;
                        str20 = str7;
                        str14 = str;
                    } catch (Exception e) {
                        e = e;
                        SpiderDebug.log(e);
                        return str;
                    }
                }
            }
            str = str14;
            jSONObject3.put("class", jSONArray3);
            return jSONObject3.toString();
        } catch (Exception e2) {
            e = e2;
            str = str14;
        }
    }

    public String homeVideoContent() {
        boolean z;
        try {
            String strM459n = m459n();
            String strConcat = (strM459n.contains("api.php/app") || strM459n.contains("xgapp")) ? strM459n.concat("index_video?token=") : strM459n.contains(".vod") ? strM459n.concat("/vodPhbAll") : "";
            if (strConcat.isEmpty()) {
                strConcat = m460o(strM459n) + "movie&page=1&area=&type=&start=";
                z = true;
            } else {
                z = false;
            }
            SpiderDebug.log(strConcat);
            String strM1889k = AbstractC0771yi.m1889k(strConcat, m453h(strConcat));
            m457l(strM1889k);
            JSONObject jSONObject = new JSONObject(strM1889k);
            JSONArray jSONArray = new JSONArray();
            if (z) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("data");
                for (int i = 0; i < jSONArray2.length(); i++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("vod_id", jSONObject2.getString("nextlink"));
                    jSONObject3.put("vod_name", jSONObject2.getString("title"));
                    jSONObject3.put("vod_pic", jSONObject2.getString("pic"));
                    jSONObject3.put("vod_remarks", jSONObject2.getString("state"));
                    jSONArray.put(jSONObject3);
                }
            } else {
                ArrayList<JSONArray> arrayList = new ArrayList();
                m452g(jSONObject, "vlist", arrayList);
                if (arrayList.isEmpty()) {
                    m452g(jSONObject, "vod_list", arrayList);
                }
                ArrayList arrayList2 = new ArrayList();
                for (JSONArray jSONArray3 : arrayList) {
                    for (int i2 = 0; i2 < jSONArray3.length(); i2++) {
                        JSONObject jSONObject4 = jSONArray3.getJSONObject(i2);
                        String string = jSONObject4.getString("vod_id");
                        if (!arrayList2.contains(string)) {
                            arrayList2.add(string);
                            JSONObject jSONObject5 = new JSONObject();
                            jSONObject5.put("vod_id", string);
                            jSONObject5.put("vod_name", jSONObject4.getString("vod_name"));
                            jSONObject5.put("vod_pic", jSONObject4.getString("vod_pic"));
                            jSONObject5.put("vod_remarks", jSONObject4.getString("vod_remarks"));
                            jSONArray.put(jSONObject5);
                        }
                    }
                }
            }
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("list", jSONArray);
            return jSONObject6.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        try {
            this.f139f = str.split("###");
        } catch (Throwable unused) {
        }
    }

    public boolean isVideoFormat(String str) {
        return AbstractC0405ku.m1361e(str);
    }

    /* JADX INFO: renamed from: l */
    public final void m457l(String str) {
        String[] strArr = this.f139f;
        if (strArr.length > 1) {
            strArr[1].equals("nftv");
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m458m(String str, JSONObject jSONObject, JSONObject jSONObject2, String str2) throws JSONException {
        ArrayList arrayList;
        ArrayList arrayList2;
        String str3;
        HashMap map;
        String str4;
        String str5;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        boolean zContains = str.contains("api.php/app/");
        String str6 = ",";
        HashMap map2 = this.f138e;
        String str7 = "parse_api";
        ArrayList arrayList5 = arrayList3;
        String str8 = "url";
        ArrayList arrayList6 = arrayList4;
        String str9 = "name";
        String str10 = "code";
        if (!zContains) {
            HashMap map3 = map2;
            String str11 = str7;
            String str12 = str8;
            if (str.contains("xgapp")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("data").getJSONObject("vod_info");
                jSONObject2.put("vod_id", jSONObject3.optString("vod_id", str2));
                jSONObject2.put("vod_name", jSONObject3.getString("vod_name"));
                jSONObject2.put("vod_pic", jSONObject3.getString("vod_pic"));
                jSONObject2.put("type_name", jSONObject3.optString("vod_class"));
                jSONObject2.put("vod_year", jSONObject3.optString("vod_year"));
                jSONObject2.put("vod_area", jSONObject3.optString("vod_area"));
                jSONObject2.put("vod_remarks", jSONObject3.optString("vod_remarks"));
                jSONObject2.put("vod_actor", jSONObject3.optString("vod_actor"));
                jSONObject2.put("vod_director", jSONObject3.optString("vod_director"));
                jSONObject2.put("vod_content", jSONObject3.optString("vod_content"));
                JSONArray jSONArray = jSONObject3.getJSONArray("vod_url_with_player");
                int i = 0;
                while (i < jSONArray.length()) {
                    JSONObject jSONObject4 = jSONArray.getJSONObject(i);
                    String str13 = str10;
                    String strTrim = jSONObject4.optString(str13).trim();
                    if (strTrim.isEmpty()) {
                        str4 = str9;
                        strTrim = jSONObject4.getString(str4).trim();
                    } else {
                        str4 = str9;
                    }
                    ArrayList arrayList7 = arrayList6;
                    arrayList7.add(strTrim);
                    String str14 = str12;
                    ArrayList arrayList8 = arrayList5;
                    arrayList8.add(jSONObject4.getString(str14));
                    String str15 = str11;
                    String strTrim2 = jSONObject4.optString(str15).trim();
                    HashMap map4 = map3;
                    ArrayList arrayList9 = (ArrayList) map4.get(strTrim);
                    if (arrayList9 == null) {
                        arrayList9 = new ArrayList();
                        map4.put(strTrim, arrayList9);
                    }
                    if (!strTrim2.isEmpty() && !arrayList9.contains(strTrim2)) {
                        arrayList9.add(strTrim2);
                    }
                    i++;
                    str10 = str13;
                    str9 = str4;
                    arrayList6 = arrayList7;
                    str12 = str14;
                    str11 = str15;
                    arrayList5 = arrayList8;
                    map3 = map4;
                }
            } else {
                ArrayList arrayList10 = arrayList5;
                ArrayList arrayList11 = arrayList6;
                HashMap map5 = map3;
                String str16 = str12;
                if (str.contains(".vod")) {
                    JSONObject jSONObject5 = jSONObject.getJSONObject("data");
                    jSONObject2.put("vod_id", jSONObject5.optString("vod_id", str2));
                    jSONObject2.put("vod_name", jSONObject5.getString("vod_name"));
                    jSONObject2.put("vod_pic", jSONObject5.getString("vod_pic"));
                    jSONObject2.put("type_name", jSONObject5.optString("vod_class"));
                    jSONObject2.put("vod_year", jSONObject5.optString("vod_year"));
                    jSONObject2.put("vod_area", jSONObject5.optString("vod_area"));
                    jSONObject2.put("vod_remarks", jSONObject5.optString("vod_remarks"));
                    jSONObject2.put("vod_actor", jSONObject5.optString("vod_actor"));
                    jSONObject2.put("vod_director", jSONObject5.optString("vod_director"));
                    jSONObject2.put("vod_content", jSONObject5.optString("vod_content"));
                    JSONArray jSONArray2 = jSONObject5.getJSONArray("vod_play_list");
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        JSONObject jSONObject6 = jSONArray2.getJSONObject(i2);
                        String strTrim3 = jSONObject6.getJSONObject("player_info").optString("from").trim();
                        if (strTrim3.isEmpty()) {
                            strTrim3 = jSONObject6.getJSONObject("player_info").optString("show").trim();
                        }
                        ArrayList arrayList12 = arrayList11;
                        arrayList12.add(strTrim3);
                        String str17 = str16;
                        ArrayList arrayList13 = arrayList10;
                        arrayList13.add(jSONObject6.getString(str17));
                        try {
                            ArrayList<String> arrayList14 = new ArrayList();
                            str3 = str6;
                            try {
                                String[] strArrSplit = jSONObject6.getJSONObject("player_info").optString("parse").split(str3);
                                String[] strArrSplit2 = jSONObject6.getJSONObject("player_info").optString("parse2").split(str3);
                                arrayList14.addAll(Arrays.asList(strArrSplit));
                                arrayList14.addAll(Arrays.asList(strArrSplit2));
                                map = map5;
                                try {
                                    ArrayList arrayList15 = (ArrayList) map.get(strTrim3);
                                    if (arrayList15 == null) {
                                        arrayList15 = new ArrayList();
                                        map.put(strTrim3, arrayList15);
                                    }
                                    for (String strGroup : arrayList14) {
                                        boolean zContains2 = strGroup.contains("http");
                                        Pattern pattern = f135b;
                                        if (zContains2) {
                                            Matcher matcher = pattern.matcher(strGroup);
                                            if (matcher.find()) {
                                                strGroup = matcher.group(0);
                                            }
                                        } else if (strGroup.contains("//")) {
                                            Matcher matcher2 = pattern.matcher(strGroup);
                                            if (matcher2.find()) {
                                                strGroup = "http:" + matcher2.group(0);
                                            }
                                        } else {
                                            Matcher matcher3 = f136c.matcher(str);
                                            if (matcher3.find()) {
                                                Matcher matcher4 = pattern.matcher(str);
                                                if (matcher4.find()) {
                                                    strGroup = matcher3.group(0) + matcher4.group(0);
                                                }
                                            }
                                        }
                                        String strTrim4 = strGroup.replace("..", ".").trim();
                                        if (!strTrim4.isEmpty() && !arrayList15.contains(strTrim4)) {
                                            arrayList15.add(strTrim4);
                                        }
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    SpiderDebug.log(e);
                                }
                            } catch (Exception e2) {
                                e = e2;
                                map = map5;
                                SpiderDebug.log(e);
                                i2++;
                                map5 = map;
                                arrayList10 = arrayList13;
                                str6 = str3;
                                arrayList11 = arrayList12;
                                str16 = str17;
                            }
                        } catch (Exception e3) {
                            e = e3;
                            str3 = str6;
                        }
                        i2++;
                        map5 = map;
                        arrayList10 = arrayList13;
                        str6 = str3;
                        arrayList11 = arrayList12;
                        str16 = str17;
                    }
                    arrayList2 = arrayList10;
                    arrayList = arrayList11;
                } else {
                    String str18 = str16;
                    if (f134a.matcher(str).find()) {
                        jSONObject2.put("vod_id", jSONObject.optString("vod_id", str2));
                        jSONObject2.put("vod_name", jSONObject.getString("title"));
                        jSONObject2.put("vod_pic", jSONObject.getString("img_url"));
                        jSONObject2.put("type_name", m456k(jSONObject.optJSONArray("type")));
                        jSONObject2.put("vod_year", jSONObject.optString("pubtime"));
                        jSONObject2.put("vod_area", m456k(jSONObject.optJSONArray("area")));
                        jSONObject2.put("vod_remarks", jSONObject.optString("trunk"));
                        jSONObject2.put("vod_actor", m456k(jSONObject.optJSONArray("actor")));
                        jSONObject2.put("vod_director", m456k(jSONObject.optJSONArray("director")));
                        jSONObject2.put("vod_content", jSONObject.optString("intro"));
                        JSONObject jSONObject7 = jSONObject.getJSONObject("videolist");
                        Iterator<String> itKeys = jSONObject7.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            ArrayList arrayList16 = (ArrayList) map5.get(next);
                            if (arrayList16 == null) {
                                arrayList16 = new ArrayList();
                                map5.put(next, arrayList16);
                            }
                            JSONArray jSONArray3 = jSONObject7.getJSONArray(next);
                            ArrayList arrayList17 = new ArrayList();
                            int i3 = 0;
                            while (i3 < jSONArray3.length()) {
                                JSONObject jSONObject8 = jSONArray3.getJSONObject(i3);
                                String str19 = str18;
                                String string = jSONObject8.getString(str19);
                                if (string.contains("url=")) {
                                    int iIndexOf = string.indexOf("url=") + 4;
                                    String strTrim5 = string.substring(0, iIndexOf).trim();
                                    if (!strTrim5.isEmpty() && !arrayList16.contains(strTrim5)) {
                                        arrayList16.add(strTrim5);
                                    }
                                    arrayList17.add(jSONObject8.getString("title") + "$" + string.substring(iIndexOf).trim());
                                } else {
                                    arrayList17.add(jSONObject8.getString("title") + "$" + string);
                                }
                                i3++;
                                str18 = str19;
                            }
                            arrayList11.add(next);
                            arrayList10.add(TextUtils.join("#", arrayList17));
                        }
                    }
                    arrayList = arrayList11;
                    arrayList2 = arrayList10;
                }
            }
            jSONObject2.put("vod_play_from", TextUtils.join("$$$", arrayList));
            jSONObject2.put("vod_play_url", TextUtils.join("$$$", arrayList2));
        }
        JSONObject jSONObject9 = jSONObject.getJSONObject("data");
        jSONObject2.put("vod_id", jSONObject9.optString("vod_id", str2));
        jSONObject2.put("vod_name", jSONObject9.getString("vod_name"));
        jSONObject2.put("vod_pic", jSONObject9.getString("vod_pic"));
        jSONObject2.put("type_name", jSONObject9.optString("vod_class"));
        jSONObject2.put("vod_year", jSONObject9.optString("vod_year"));
        jSONObject2.put("vod_area", jSONObject9.optString("vod_area"));
        jSONObject2.put("vod_remarks", jSONObject9.optString("vod_remarks"));
        jSONObject2.put("vod_actor", jSONObject9.optString("vod_actor"));
        jSONObject2.put("vod_director", jSONObject9.optString("vod_director"));
        jSONObject2.put("vod_content", jSONObject9.optString("vod_content"));
        JSONArray jSONArray4 = jSONObject9.getJSONArray("vod_url_with_player");
        int i4 = 0;
        while (i4 < jSONArray4.length()) {
            JSONObject jSONObject10 = jSONArray4.getJSONObject(i4);
            String str20 = str10;
            String strTrim6 = jSONObject10.optString(str20).trim();
            if (strTrim6.isEmpty()) {
                str5 = str9;
                strTrim6 = jSONObject10.getString(str5).trim();
            } else {
                str5 = str9;
            }
            ArrayList arrayList18 = arrayList6;
            arrayList18.add(strTrim6);
            String str21 = str8;
            ArrayList arrayList19 = arrayList5;
            arrayList19.add(jSONObject10.getString(str21));
            String str22 = str7;
            String strTrim7 = jSONObject10.optString(str22).trim();
            HashMap map6 = map2;
            ArrayList arrayList20 = (ArrayList) map6.get(strTrim6);
            if (arrayList20 == null) {
                arrayList20 = new ArrayList();
                map6.put(strTrim6, arrayList20);
            }
            if (!strTrim7.isEmpty() && !arrayList20.contains(strTrim7)) {
                arrayList20.add(strTrim7);
            }
            i4++;
            str10 = str20;
            str9 = str5;
            arrayList6 = arrayList18;
            str8 = str21;
            str7 = str22;
            arrayList5 = arrayList19;
            map2 = map6;
        }
        arrayList2 = arrayList5;
        arrayList = arrayList6;
        jSONObject2.put("vod_play_from", TextUtils.join("$$$", arrayList));
        jSONObject2.put("vod_play_url", TextUtils.join("$$$", arrayList2));
    }

    public boolean manualVideoCheck() {
        return true;
    }

    /* JADX INFO: renamed from: n */
    public final String m459n() {
        String[] strArr = this.f139f;
        return (strArr == null || strArr.length < 1) ? "" : strArr[0].trim();
    }

    /* JADX INFO: renamed from: o */
    public final String m460o(String str) {
        if (str.contains("api.php/app") || str.contains("xgapp")) {
            return str.contains("dijiaxia") ? "http://www.dijiaxia.com/api.php/app/video?tid=" : str.concat("video?tid=");
        }
        if (str.contains(".vod")) {
            return str.contains("iopenyun") ? str.concat("/list?type=") : str.concat("?type=");
        }
        return str.concat("?ac=list&class=");
    }

    /* JADX INFO: renamed from: p */
    public final String m461p(String str) {
        if (str.contains("api.php/app") || str.contains("xgapp")) {
            return str.concat("nav?token=");
        }
        if (str.contains(".vod")) {
            return str.contains("iopenyun.com") ? str.concat("/list?type") : str.concat("/types");
        }
        return "";
    }

    public String playerContent(String str, String str2, List<String> list) {
        JSONObject jSONObjectM463r;
        try {
            ArrayList arrayList = (ArrayList) this.f138e.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.isEmpty() && (jSONObjectM463r = m463r(arrayList, str2)) != null) {
                return C2137a.addDanmaku(jSONObjectM463r.toString());
            }
            if (AbstractC0405ku.m1361e(str2)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("parse", 0);
                jSONObject.put("playUrl", "");
                jSONObject.put("url", str2);
                return C2137a.addDanmaku(jSONObject.toString());
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("parse", 1);
            jSONObject2.put("jx", "1");
            jSONObject2.put("url", str2);
            return C2137a.addDanmaku(jSONObject2.toString());
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX INFO: renamed from: q */
    public final String m462q(String str, JSONObject jSONObject) {
        String str2 = "";
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next.equals("class") || next.equals("area") || next.equals("lang") || next.equals("year")) {
                    try {
                        str2 = str2 + "筛选" + next + "+全部=+" + jSONObject.getString(next).replace(",", Marker.ANY_NON_NULL_MARKER) + "\n";
                    } catch (JSONException unused) {
                    }
                }
            }
        }
        if (!str.contains(".vod")) {
            return (str.contains("api.php/app") || str.contains("xgapp")) ? str2 : "分类+全部=+电影=movie+连续剧=tvplay+综艺=tvshow+动漫=comic+4K=movie_4k+体育=tiyu\n筛选class+全部=+喜剧+爱情+恐怖+动作+科幻+剧情+战争+警匪+犯罪+动画+奇幻+武侠+冒险+枪战+恐怖+悬疑+惊悚+经典+青春+文艺+微电影+古装+历史+运动+农村+惊悚+惊悚+伦理+情色+福利+三级+儿童+网络电影\n筛选area+全部=+大陆+香港+台湾+美国+英国+法国+日本+韩国+德国+泰国+印度+西班牙+加拿大+其他\n筛选year+全部=+2022+2021+2020+2019+2018+2017+2016+2015+2014+2013+2012+2011+2010+2009+2008+2007+2006+2005+2004+2003+2002+2001+2000";
        }
        return str2 + "\n排序+全部=+最新=time+最热=hits+评分=score";
    }

    /* JADX INFO: renamed from: r */
    public final JSONObject m463r(ArrayList arrayList, String str) throws JSONException {
        Iterator it = arrayList.iterator();
        String str2 = "";
        while (true) {
            JSONObject jSONObjectM1363g = null;
            if (!it.hasNext()) {
                if (str2.isEmpty()) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("parse", 1);
                jSONObject.put("playUrl", str2);
                jSONObject.put("url", str);
                return jSONObject;
            }
            String str3 = (String) it.next();
            if (!str3.isEmpty() && !str3.equals("null")) {
                String strM1889k = AbstractC0771yi.m1889k(str3 + str, null);
                m457l(strM1889k);
                try {
                    jSONObjectM1363g = AbstractC0405ku.m1363g(str, strM1889k);
                } catch (Throwable unused) {
                }
                if (jSONObjectM1363g != null && jSONObjectM1363g.has("url") && jSONObjectM1363g.has("header")) {
                    jSONObjectM1363g.put("header", jSONObjectM1363g.getJSONObject("header").toString());
                    return jSONObjectM1363g;
                }
                if (strM1889k.contains("<html")) {
                    for (Pattern pattern : f137d) {
                        if (pattern.matcher(strM1889k).find()) {
                            str2 = str3;
                            break;
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final String m464s(String str) {
        if (str.contains("api.php/app") || str.contains("xgapp")) {
            if (str.contains("dijiaxia")) {
                return "https://www.dijiaxia.com/api.php/app/video_detail?id=";
            }
            return str.contains("1010dy") ? "http://www.1010dy.cc/api.php/app/video_detail?id=" : str.concat("video_detail?id=");
        }
        if (str.contains(".vod")) {
            return str.contains("iopenyun") ? str.concat("/detailID?vod_id=") : str.concat("/detail?vod_id=");
        }
        return "";
    }

    public String searchContent(String str, boolean z) {
        JSONArray jSONArray;
        try {
            String strM454i = m454i(m459n(), URLEncoder.encode(str));
            String strM1889k = AbstractC0771yi.m1889k(strM454i, m453h(strM454i));
            m457l(strM1889k);
            JSONObject jSONObject = new JSONObject(strM1889k);
            JSONArray jSONArray2 = new JSONArray();
            if (jSONObject.has("list") && (jSONObject.get("list") instanceof JSONArray)) {
                jSONArray = jSONObject.getJSONArray("list");
            } else if (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONObject) && jSONObject.getJSONObject("data").has("list") && (jSONObject.getJSONObject("data").get("list") instanceof JSONArray)) {
                jSONArray = jSONObject.getJSONObject("data").getJSONArray("list");
            } else {
                jSONArray = (jSONObject.has("data") && (jSONObject.get("data") instanceof JSONArray)) ? jSONObject.getJSONArray("data") : null;
            }
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    if (jSONObject2.has("vod_id")) {
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("vod_id", jSONObject2.getString("vod_id"));
                        jSONObject3.put("vod_name", jSONObject2.getString("vod_name"));
                        jSONObject3.put("vod_pic", jSONObject2.getString("vod_pic"));
                        jSONObject3.put("vod_remarks", jSONObject2.getString("vod_remarks"));
                        jSONArray2.put(jSONObject3);
                    } else {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("vod_id", jSONObject2.getString("nextlink"));
                        jSONObject4.put("vod_name", jSONObject2.getString("title"));
                        jSONObject4.put("vod_pic", jSONObject2.getString("pic"));
                        jSONObject4.put("vod_remarks", jSONObject2.getString("state"));
                        jSONArray2.put(jSONObject4);
                    }
                }
            }
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("list", jSONArray2);
            return jSONObject5.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
