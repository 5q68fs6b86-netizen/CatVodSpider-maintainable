package com.github.catvod.spider;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p116a.C2137a;

import android.content.Context;
import android.text.TextUtils;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p002A0.AbstractC0502oj;
import com.github.catvod.spider.support.p002A0.AbstractC0710wb;
import com.github.catvod.spider.support.p002A0.AbstractC0716wh;
import com.github.catvod.spider.support.p002A0.C0226ed;
import com.github.catvod.spider.support.p002A0.C0235em;
import com.github.catvod.spider.support.p002A0.C0589rp;
import com.github.catvod.net.OkHttp;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class New6v extends Spider {

    /* JADX INFO: renamed from: a */
    public static String f227a = "http://www.xb6v.com";

    /* JADX INFO: renamed from: b */
    public static String m607b(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
            return str + "@Headers=" + jSONObject.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    /* JADX INFO: renamed from: c */
    public static HashMap m608c() {
        HashMap mapM1762f = AbstractC0710wb.m1762f("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        mapM1762f.put("Referer", f227a.concat("/"));
        return mapM1762f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String strReplace = "{cateId}";
            if (!str2.equals("1")) {
                strReplace = "{cateId}index_" + str2 + ".html";
                if (str.contains(".html")) {
                    return "";
                }
            }
            if (z && map != null && map.size() > 0) {
                for (String str3 : map.keySet()) {
                    String str4 = map.get(str3);
                    if (str4.length() > 0) {
                        strReplace = strReplace.replace("{" + str3 + "}", str4);
                    }
                }
            }
            String strReplaceAll = strReplace.replaceAll("\\{cateId\\}", str);
            if (!str.contains("http")) {
                strReplaceAll = AbstractC0716wh.m1787g(f227a, strReplaceAll);
            }
            C0235em c0235emM1487a = AbstractC0502oj.m1487a(AbstractC0716wh.m1785e(strReplaceAll, "utf-8", m608c()));
            int i = 0;
            if (str.contains("/qian")) {
                C0589rp c0589rpM1166ah = c0235emM1487a.m1166ah("div#tab-content li");
                while (i < c0589rpM1166ah.size()) {
                    C0226ed c0226ed = (C0226ed) c0589rpM1166ah.get(i);
                    String strM1645f = c0226ed.m1166ah("a").m1645f();
                    if (strM1645f.contains("《") && strM1645f.contains("》")) {
                        strM1645f = strM1645f.substring(strM1645f.indexOf("《"));
                    }
                    String strM1640a = c0226ed.m1166ah("a").m1640a("href");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", strM1640a);
                    jSONObject2.put("vod_name", strM1645f);
                    jSONObject2.put("vod_pic", "");
                    jSONObject2.put("vod_remarks", "");
                    jSONArray.put(jSONObject2);
                    i++;
                }
            } else {
                C0589rp c0589rpM1166ah2 = c0235emM1487a.m1166ah("ul#post_container li");
                while (i < c0589rpM1166ah2.size()) {
                    C0226ed c0226ed2 = (C0226ed) c0589rpM1166ah2.get(i);
                    String strM1645f2 = c0226ed2.m1166ah("h2").m1645f();
                    String strM1640a2 = c0226ed2.m1166ah("img").m1640a("src");
                    String strM1645f3 = c0226ed2.m1166ah(".info_date").m1645f();
                    String strM1640a3 = c0226ed2.m1166ah("a").m1640a("href");
                    C0589rp c0589rp = c0589rpM1166ah2;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("vod_id", strM1640a3);
                    jSONObject3.put("vod_name", strM1645f2);
                    jSONObject3.put("vod_pic", m607b(strM1640a2));
                    jSONObject3.put("vod_remarks", strM1645f3);
                    jSONArray.put(jSONObject3);
                    i++;
                    c0589rpM1166ah2 = c0589rp;
                }
            }
            jSONObject.put("page", str2);
            jSONObject.put("pagecount", Integer.MAX_VALUE);
            jSONObject.put("limit", jSONArray.length());
            jSONObject.put("total", Integer.MAX_VALUE);
            jSONObject.put("list", jSONArray);
            return jSONObject.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String detailContent(List<String> list) {
        try {
            C0235em c0235emM1487a = AbstractC0502oj.m1487a(AbstractC0716wh.m1785e(AbstractC0716wh.m1787g(f227a, list.get(0)), "utf-8", m608c()));
            String strMo1228au = ((C0226ed) c0235emM1487a.m1166ah("div#post_content img").get(0)).mo1228au("src");
            String strM1645f = c0235emM1487a.m1166ah("div#content>div>h1").m1645f();
            ArrayList arrayList = new ArrayList();
            try {
                C0589rp c0589rpM1166ah = c0235emM1487a.m1166ah("div#post_content a[href^=magnet],a[href^=ed2k]");
                for (int i = 0; i < c0589rpM1166ah.size(); i++) {
                    C0226ed c0226ed = (C0226ed) c0589rpM1166ah.get(i);
                    String strM1645f2 = c0226ed.m1166ah("a").m1645f();
                    String strM1640a = c0226ed.m1166ah("a").m1640a("href");
                    if (strM1640a.startsWith("ed2k:")) {
                        Matcher matcher = Pattern.compile("\\|file\\|(.*?)\\|").matcher(URLDecoder.decode(strM1640a));
                        if (matcher.find()) {
                            strM1645f2 = matcher.group(1);
                        }
                    } else if (strM1640a.startsWith("magnet:")) {
                        Matcher matcher2 = Pattern.compile("(^|&)dn=([^&]*)(&|$)").matcher(URLDecoder.decode(strM1640a));
                        if (matcher2.find()) {
                            strM1645f2 = matcher2.group(2);
                        }
                    }
                    arrayList.add(strM1645f2 + "$" + strM1640a);
                }
            } catch (Exception e) {
                SpiderDebug.log(e);
            }
            String strJoin = arrayList.size() > 0 ? TextUtils.join("#", arrayList) : "";
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", strM1645f);
            jSONObject2.put("vod_pic", m607b(strMo1228au));
            jSONObject2.put("vod_content", "");
            jSONObject2.put("vod_play_from", "新6V");
            jSONObject2.put("vod_play_url", strJoin);
            jSONArray.put(jSONObject2);
            jSONObject.put("list", jSONArray);
            String string = jSONObject.toString();
            C2137a.parseJsonAndSave(string);
            return string;
        } catch (Exception e2) {
            SpiderDebug.log(e2);
            return "";
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (C0226ed c0226ed : AbstractC0502oj.m1487a(AbstractC0716wh.m1785e(f227a, "utf-8", m608c())).m1166ah("ul#menus a")) {
                String strM1169ak = c0226ed.m1169ak();
                if (!strM1169ak.contains("首页") && !strM1169ak.contains("最新") && !strM1169ak.contains("旧版")) {
                    String strMo1228au = c0226ed.mo1228au("href");
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("type_id", strMo1228au);
                    jSONObject.put("type_name", strM1169ak);
                    jSONArray.put(jSONObject);
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("class", jSONArray);
            if (z) {
                jSONObject2.put("filters", new JSONObject("{}"));
            }
            return jSONObject2.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public void init(Context context, String str) {
        super.init(context, str);
        if (str.isEmpty()) {
            return;
        }
        f227a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
            jSONObject.put("url", str2);
            if (str2.startsWith("tvbox") || str2.startsWith("ed2k")) {
                jSONObject.put("parse", 0);
            } else {
                jSONObject.put("header", jSONObject2.toString());
                jSONObject.put("parse", 1);
            }
            jSONObject.put("playUrl", "");
            return C2137a.addDanmaku(jSONObject.toString());
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String searchContent(String str, boolean z) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("show", "title");
        linkedHashMap.put("tempid", "1");
        linkedHashMap.put("tbname", "article");
        linkedHashMap.put("mid", "1");
        linkedHashMap.put("dopost", "search");
        linkedHashMap.put("submit", "");
        linkedHashMap.put("keyboard", str);
        String strM6076a = C2238b.m6067g("https://www.xb6v.org/e/search/11index.php", linkedHashMap, m608c()).m6076a();
        JSONArray jSONArray = new JSONArray();
        C0589rp c0589rpM1166ah = AbstractC0502oj.m1487a(strM6076a).m1166ah("ul#post_container li");
        for (int i = 0; i < c0589rpM1166ah.size(); i++) {
            C0226ed c0226ed = (C0226ed) c0589rpM1166ah.get(i);
            String strM1645f = c0226ed.m1166ah("h2").m1645f();
            if (strM1645f.contains("《") && strM1645f.contains("》")) {
                strM1645f = strM1645f.substring(strM1645f.indexOf("《"));
            }
            String strM1640a = c0226ed.m1166ah("img").m1640a("src");
            String strM1645f2 = c0226ed.m1166ah(".info_date").m1645f();
            String strM1640a2 = c0226ed.m1166ah("a").m1640a("href");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("vod_id", strM1640a2);
            jSONObject.put("vod_name", strM1645f);
            jSONObject.put("vod_pic", m607b(strM1640a));
            jSONObject.put("vod_remarks", strM1645f2);
            jSONArray.put(jSONObject);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("list", jSONArray);
        return jSONObject2.toString();
    }
}
