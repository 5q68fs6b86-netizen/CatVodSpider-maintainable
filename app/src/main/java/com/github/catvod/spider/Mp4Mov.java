package com.github.catvod.spider;
import com.github.catvod.spider.support.p116a.C2137a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p002A0.AbstractC0502oj;
import com.github.catvod.spider.support.p002A0.AbstractC0710wb;
import com.github.catvod.spider.support.p002A0.AbstractC0716wh;
import com.github.catvod.spider.support.p002A0.AbstractC0771yi;
import com.github.catvod.spider.support.p002A0.C0226ed;
import com.github.catvod.spider.support.p002A0.C0235em;
import com.github.catvod.spider.support.p002A0.C0589rp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class Mp4Mov extends Spider {

    /* JADX INFO: renamed from: a */
    public String f226a = "https://mp4.z6.net.cn";

    /* JADX INFO: renamed from: b */
    public final HashMap m604b() {
        HashMap mapM1762f = AbstractC0710wb.m1762f("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36");
        mapM1762f.put("Referer", this.f226a + "/");
        return mapM1762f;
    }

    /* JADX INFO: renamed from: c */
    public final HashMap m605c() {
        HashMap mapM1762f = AbstractC0710wb.m1762f("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36");
        mapM1762f.put("Referer", this.f226a + "/search/");
        mapM1762f.put("Content-Type", "application/x-www-form-urlencoded");
        return mapM1762f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            C0235em c0235emM1487a = AbstractC0502oj.m1487a(AbstractC0771yi.m1889k(this.f226a + "/list/" + str + "-" + str2 + ".html", m604b()));
            String str3 = "href";
            if (str.equals("99")) {
                C0589rp c0589rpM1166ah = c0235emM1487a.m1166ah("div#list_dy ul>li");
                int i = 0;
                while (i < c0589rpM1166ah.size()) {
                    C0226ed c0226ed = (C0226ed) c0589rpM1166ah.get(i);
                    C0589rp c0589rp = c0589rpM1166ah;
                    String strM1645f = c0226ed.m1166ah("a").m1645f();
                    String strM1645f2 = c0226ed.m1166ah(".time").m1645f();
                    if (strM1645f.contains("《") && strM1645f.contains("》")) {
                        strM1645f2 = strM1645f.split("》")[1];
                        strM1645f = strM1645f.split("《")[1].split("》")[0];
                    }
                    String strM1640a = c0226ed.m1166ah("a").m1640a("href");
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("vod_id", strM1640a);
                    jSONObject2.put("vod_name", strM1645f);
                    jSONObject2.put("vod_pic", "");
                    jSONObject2.put("vod_remarks", strM1645f2);
                    jSONArray.put(jSONObject2);
                    i++;
                    c0589rpM1166ah = c0589rp;
                }
            } else {
                C0589rp c0589rpM1166ah2 = c0235emM1487a.m1166ah("div#list_all ul>li");
                int i2 = 0;
                while (i2 < c0589rpM1166ah2.size()) {
                    C0226ed c0226ed2 = (C0226ed) c0589rpM1166ah2.get(i2);
                    String strM1645f3 = c0226ed2.m1166ah("h2").m1645f();
                    C0589rp c0589rp2 = c0589rpM1166ah2;
                    String strM1640a2 = c0226ed2.m1166ah("img").m1640a("data-original");
                    String strM1645f4 = c0226ed2.m1166ah(".update_time").m1645f();
                    if (strM1645f3.contains("《") && strM1645f3.contains("》")) {
                        strM1645f4 = strM1645f3.split("》")[1];
                        strM1645f3 = strM1645f3.split("《")[1].split("》")[0];
                    }
                    String strM1640a3 = c0226ed2.m1166ah("a").m1640a(str3);
                    String str4 = str3;
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("vod_id", strM1640a3);
                    jSONObject3.put("vod_name", strM1645f3);
                    jSONObject3.put("vod_pic", strM1640a2);
                    jSONObject3.put("vod_remarks", strM1645f4);
                    jSONArray.put(jSONObject3);
                    i2++;
                    str3 = str4;
                    c0589rpM1166ah2 = c0589rp2;
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
    /* JADX INFO: renamed from: d */
    public final String m606d(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray();
            String strValueOf = String.valueOf(System.currentTimeMillis() / 1000);
            String str3 = this.f226a + "/search/";
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("wd", str);
            linkedHashMap.put("p", str2);
            linkedHashMap.put("t", encrypt(strValueOf, "7230789078907890"));
            C0589rp c0589rpM1166ah = AbstractC0502oj.m1487a(AbstractC0716wh.m1786f(str3, linkedHashMap, m605c())).m1166ah("div#list_all ul>li");
            for (int i = 0; i < c0589rpM1166ah.size(); i++) {
                C0226ed c0226ed = (C0226ed) c0589rpM1166ah.get(i);
                String strM1645f = c0226ed.m1166ah("h2").m1645f();
                String strM1640a = c0226ed.m1166ah("img").m1640a("data-original");
                String strM1645f2 = c0226ed.m1166ah(".update_time").m1645f();
                if (strM1645f.contains("《") && strM1645f.contains("》")) {
                    strM1645f2 = strM1645f.split("》")[1];
                    strM1645f = strM1645f.split("《")[1].split("》")[0];
                }
                String strM1640a2 = c0226ed.m1166ah("a").m1640a("href");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("vod_id", strM1640a2);
                jSONObject.put("vod_name", strM1645f);
                jSONObject.put("vod_pic", strM1640a);
                jSONObject.put("vod_remarks", strM1645f2);
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("list", jSONArray);
            return jSONObject2.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String detailContent(List<String> list) {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f226a);
            int i = 0;
            sb.append(list.get(0));
            C0235em c0235emM1487a = AbstractC0502oj.m1487a(AbstractC0771yi.m1889k(sb.toString(), m604b()));
            String strM1640a = c0235emM1487a.m1166ah("div.pic>img").m1640a("src");
            String strM1645f = c0235emM1487a.m1166ah("div.article-header>h1").m1645f();
            String strM1169ak = ((C0226ed) c0235emM1487a.m1166ah("ul.breadcrumb li").get(1)).m1169ak();
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            C0589rp c0589rpM1166ah = c0235emM1487a.m1166ah("ul.down-list");
            int i2 = 0;
            while (i2 < c0589rpM1166ah.size()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("列表");
                int i3 = i2 + 1;
                sb2.append(i3);
                String string = sb2.toString();
                C0589rp c0589rpM1166ah2 = ((C0226ed) c0589rpM1166ah.get(i2)).m1166ah("li:has(a[href^=ed2k],a[href^=magnet])");
                if (strM1169ak.contains("电视剧")) {
                    Collections.reverse(c0589rpM1166ah2);
                }
                ArrayList arrayList3 = new ArrayList();
                C0589rp c0589rp = c0589rpM1166ah;
                while (i < c0589rpM1166ah2.size()) {
                    C0226ed c0226ed = (C0226ed) c0589rpM1166ah2.get(i);
                    arrayList3.add(c0226ed.m1166ah("a").m1640a("title") + "$" + c0226ed.m1166ah("a").m1640a("href"));
                    i++;
                    strM1169ak = strM1169ak;
                }
                arrayList2.add(TextUtils.join("#", arrayList3));
                arrayList.add(string);
                i2 = i3;
                c0589rpM1166ah = c0589rp;
                strM1169ak = strM1169ak;
                i = 0;
            }
            String strJoin = TextUtils.join("$$$", arrayList);
            String strJoin2 = TextUtils.join("$$$", arrayList2);
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("vod_id", list.get(0));
            jSONObject2.put("vod_name", strM1645f);
            jSONObject2.put("vod_pic", strM1640a);
            jSONObject2.put("type_name", "");
            jSONObject2.put("vod_content", "");
            jSONObject2.put("vod_play_from", strJoin);
            jSONObject2.put("vod_play_url", strJoin2);
            jSONArray.put(jSONObject2);
            jSONObject.put("list", jSONArray);
            String string2 = jSONObject.toString();
            C2137a.parseJsonAndSave(string2);
            return string2;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String encrypt(String str, String str2) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
            cipher.init(1, secretKeySpec);
            return Base64.encodeToString(cipher.doFinal(bytes), 2);
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            String[] strArrSplit = "电视剧&动作片&科幻片&爱情片&喜剧片&恐怖片&战争片&剧情片&纪录片&动画片".split("&");
            String[] strArrSplit2 = "10&1&2&3&4&5&6&7&8&9".split("&");
            for (int i = 0; i < strArrSplit.length; i++) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type_id", strArrSplit2[i]);
                jSONObject.put("type_name", strArrSplit[i]);
                jSONArray.put(jSONObject);
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
        this.f226a = str;
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", str2);
            jSONObject.put("parse", 0);
            jSONObject.put("playUrl", "");
            return C2137a.addDanmaku(jSONObject.toString());
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }

    public String searchContent(String str, boolean z) {
        return m606d(str, "1");
    }

    public String searchContent(String str, boolean z, String str2) {
        return m606d(str, str2);
    }
}
