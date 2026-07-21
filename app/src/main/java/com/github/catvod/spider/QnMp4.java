package com.github.catvod.spider;

import com.github.catvod.spider.support.p116a.C2137a;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.support.p002A0.AbstractC0502oj;
import com.github.catvod.spider.support.p002A0.AbstractC0710wb;
import com.github.catvod.spider.support.p002A0.AbstractC0716wh;
import com.github.catvod.spider.support.p002A0.AbstractC0771yi;
import com.github.catvod.spider.support.p002A0.C0226ed;
import com.github.catvod.spider.support.p002A0.C0235em;
import com.github.catvod.spider.support.p002A0.C0589rp;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class QnMp4 extends Spider {

    /* JADX INFO: renamed from: a */
    public String f268a;

    /* JADX INFO: renamed from: b */
    public final HashMap m642b() {
        HashMap mapM1762f = AbstractC0710wb.m1762f("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/94.0.4606.54 Safari/537.36");
        mapM1762f.put("Referer", this.f268a + "/");
        return mapM1762f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            String strReplace = this.f268a + "/ms/{cateId}--------" + str2 + "---.html";
            if (z && map != null && map.size() > 0) {
                for (String str3 : map.keySet()) {
                    String str4 = map.get(str3);
                    if (str4.length() > 0) {
                        strReplace = strReplace.replace("{" + str3 + "}", str4);
                    }
                }
            }
            C0589rp c0589rpM1166ah = AbstractC0502oj.m1487a(AbstractC0771yi.m1889k(strReplace.replaceAll("\\{cateId\\}", str), m642b())).m1166ah("ul.content-list li");
            for (int i = 0; i < c0589rpM1166ah.size(); i++) {
                C0226ed c0226ed = (C0226ed) c0589rpM1166ah.get(i);
                String strM1645f = c0226ed.m1166ah("h3").m1645f();
                String strM1787g = AbstractC0716wh.m1787g(this.f268a, c0226ed.m1166ah("img").m1640a("src"));
                String strM1645f2 = c0226ed.m1166ah(".bottom2").m1645f();
                String strM1640a = c0226ed.m1166ah("a").m1640a("href");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("vod_id", strM1640a);
                jSONObject2.put("vod_name", strM1645f);
                jSONObject2.put("vod_pic", strM1787g);
                jSONObject2.put("vod_remarks", strM1645f2);
                jSONArray.put(jSONObject2);
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

    /* JADX WARN: Code duplicated, block: B:32:0x010a A[Catch: Exception -> 0x017a, TryCatch #4 {Exception -> 0x017a, blocks: (B:30:0x0102, B:32:0x010a, B:33:0x0117, B:35:0x011d, B:36:0x0139, B:38:0x013f, B:41:0x017c), top: B:62:0x0102, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x011d A[Catch: Exception -> 0x017a, TryCatch #4 {Exception -> 0x017a, blocks: (B:30:0x0102, B:32:0x010a, B:33:0x0117, B:35:0x011d, B:36:0x0139, B:38:0x013f, B:41:0x017c), top: B:62:0x0102, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x013f A[Catch: Exception -> 0x017a, LOOP:3: B:36:0x0139->B:38:0x013f, LOOP_END, TryCatch #4 {Exception -> 0x017a, blocks: (B:30:0x0102, B:32:0x010a, B:33:0x0117, B:35:0x011d, B:36:0x0139, B:38:0x013f, B:41:0x017c), top: B:62:0x0102, outer: #1 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x013f, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public String detailContent(List<String> list) {
        String str;
        String str2;
        String str3;
        C0589rp c0589rpM1166ah;
        C0589rp c0589rpM1166ah2;
        int i;
        C0589rp c0589rpM1166ah3;
        ArrayList arrayList;
        int i2;
        String str4 = "";
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f268a);
            int i3 = 0;
            sb.append(list.get(0));
            String strM1889k = AbstractC0771yi.m1889k(sb.toString(), m642b());
            C0235em c0235emM1487a = AbstractC0502oj.m1487a(strM1889k);
            String strM1787g = AbstractC0716wh.m1787g(this.f268a, c0235emM1487a.m1166ah("div.img>img").m1640a("src"));
            String strM1645f = c0235emM1487a.m1166ah("div.main-ui-meta>h1").m1645f();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            try {
                if (strM1889k.contains("class=\"down-list")) {
                    C0589rp c0589rpM1166ah4 = c0235emM1487a.m1166ah("div.down-list");
                    str = "";
                    while (i3 < c0589rpM1166ah4.size()) {
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            str2 = strM1787g;
                            try {
                                sb2.append("磁力播列表");
                                int i4 = i3 + 1;
                                sb2.append(i4);
                                String string = sb2.toString();
                                C0589rp c0589rp = c0589rpM1166ah4;
                                C0589rp c0589rpM1166ah5 = ((C0226ed) c0589rpM1166ah4.get(i3)).m1166ah("li:has(a[href^=ed2k],a[href^=magnet],a[href^=ftp])");
                                ArrayList arrayList4 = new ArrayList();
                                str3 = strM1645f;
                                int i5 = 0;
                                while (i5 < c0589rpM1166ah5.size()) {
                                    try {
                                        C0226ed c0226ed = (C0226ed) c0589rpM1166ah5.get(i5);
                                        C0589rp c0589rp2 = c0589rpM1166ah5;
                                        arrayList4.add(c0226ed.m1166ah("a").m1645f() + "$" + c0226ed.m1166ah("a").m1640a("href"));
                                        i5++;
                                        c0589rpM1166ah5 = c0589rp2;
                                    } catch (Exception e) {
                                        e = e;
                                        try {
                                            SpiderDebug.log(e);
                                            if (strM1889k.contains("class=\"player")) {
                                                c0589rpM1166ah = c0235emM1487a.m1166ah("ul.player");
                                                c0589rpM1166ah2 = c0235emM1487a.m1166ah("ul.py-tabs li");
                                                i = 0;
                                                while (i < c0589rpM1166ah.size()) {
                                                    String strM1169ak = ((C0226ed) c0589rpM1166ah2.get(i)).m1169ak();
                                                    c0589rpM1166ah3 = ((C0226ed) c0589rpM1166ah.get(i)).m1166ah("li");
                                                    arrayList = new ArrayList();
                                                    i2 = 0;
                                                    while (i2 < c0589rpM1166ah3.size()) {
                                                        C0226ed c0226ed2 = (C0226ed) c0589rpM1166ah3.get(i2);
                                                        C0589rp c0589rp3 = c0589rpM1166ah;
                                                        arrayList.add(c0226ed2.m1166ah("a").m1645f() + "$" + this.f268a + c0226ed2.m1166ah("a").m1640a("href"));
                                                        i2++;
                                                        c0589rpM1166ah2 = c0589rpM1166ah2;
                                                        c0589rpM1166ah = c0589rp3;
                                                    }
                                                    C0589rp c0589rp4 = c0589rpM1166ah;
                                                    C0589rp c0589rp5 = c0589rpM1166ah2;
                                                    arrayList3.add(TextUtils.join("#", arrayList));
                                                    arrayList2.add(strM1169ak);
                                                    i++;
                                                    c0589rpM1166ah2 = c0589rp5;
                                                    c0589rpM1166ah = c0589rp4;
                                                }
                                            }
                                            String strJoin = TextUtils.join("$$$", arrayList2);
                                            String strJoin2 = TextUtils.join("$$$", arrayList3);
                                            JSONObject jSONObject = new JSONObject();
                                            JSONArray jSONArray = new JSONArray();
                                            JSONObject jSONObject2 = new JSONObject();
                                            jSONObject2.put("vod_id", list.get(0));
                                            jSONObject2.put("vod_name", str3);
                                            jSONObject2.put("vod_pic", str2);
                                            str4 = str;
                                            jSONObject2.put("vod_content", str4);
                                            jSONObject2.put("type_name", str4);
                                            jSONObject2.put("vod_play_from", strJoin);
                                            jSONObject2.put("vod_play_url", strJoin2);
                                            jSONArray.put(jSONObject2);
                                            jSONObject.put("list", jSONArray);
                                            String string2 = jSONObject.toString();
                                            C2137a.parseJsonAndSave(string2);
                                            return string2;
                                        } catch (Exception e2) {
                                            Exception e = e2;
                                            str4 = str;
                                            SpiderDebug.log(e);
                                            return str4;
                                        }
                                    }
                                }
                                arrayList3.add(TextUtils.join("#", arrayList4));
                                arrayList2.add(string);
                                strM1787g = str2;
                                c0589rpM1166ah4 = c0589rp;
                                i3 = i4;
                                strM1645f = str3;
                            } catch (Exception e3) {
                                Exception e = e3;
                                str3 = strM1645f;
                                SpiderDebug.log(e);
                                if (strM1889k.contains("class=\"player")) {
                                    c0589rpM1166ah = c0235emM1487a.m1166ah("ul.player");
                                    c0589rpM1166ah2 = c0235emM1487a.m1166ah("ul.py-tabs li");
                                    i = 0;
                                    while (i < c0589rpM1166ah.size()) {
                                        String strM1169ak2 = ((C0226ed) c0589rpM1166ah2.get(i)).m1169ak();
                                        c0589rpM1166ah3 = ((C0226ed) c0589rpM1166ah.get(i)).m1166ah("li");
                                        arrayList = new ArrayList();
                                        i2 = 0;
                                        while (i2 < c0589rpM1166ah3.size()) {
                                            C0226ed c0226ed3 = (C0226ed) c0589rpM1166ah3.get(i2);
                                            C0589rp c0589rp6 = c0589rpM1166ah;
                                            arrayList.add(c0226ed3.m1166ah("a").m1645f() + "$" + this.f268a + c0226ed3.m1166ah("a").m1640a("href"));
                                            i2++;
                                            c0589rpM1166ah2 = c0589rpM1166ah2;
                                            c0589rpM1166ah = c0589rp6;
                                        }
                                        C0589rp c0589rp7 = c0589rpM1166ah;
                                        C0589rp c0589rp8 = c0589rpM1166ah2;
                                        arrayList3.add(TextUtils.join("#", arrayList));
                                        arrayList2.add(strM1169ak2);
                                        i++;
                                        c0589rpM1166ah2 = c0589rp8;
                                        c0589rpM1166ah = c0589rp7;
                                    }
                                }
                                String strJoin3 = TextUtils.join("$$$", arrayList2);
                                String strJoin4 = TextUtils.join("$$$", arrayList3);
                                JSONObject jSONObject3 = new JSONObject();
                                JSONArray jSONArray2 = new JSONArray();
                                JSONObject jSONObject4 = new JSONObject();
                                jSONObject4.put("vod_id", list.get(0));
                                jSONObject4.put("vod_name", str3);
                                jSONObject4.put("vod_pic", str2);
                                str4 = str;
                                jSONObject4.put("vod_content", str4);
                                jSONObject4.put("type_name", str4);
                                jSONObject4.put("vod_play_from", strJoin3);
                                jSONObject4.put("vod_play_url", strJoin4);
                                jSONArray2.put(jSONObject4);
                                jSONObject3.put("list", jSONArray2);
                                String string3 = jSONObject3.toString();
                                C2137a.parseJsonAndSave(string3);
                                return string3;
                            }
                        } catch (Exception e4) {
                            Exception e = e4;
                            str2 = strM1787g;
                            str3 = strM1645f;
                            SpiderDebug.log(e);
                            if (strM1889k.contains("class=\"player")) {
                                c0589rpM1166ah = c0235emM1487a.m1166ah("ul.player");
                                c0589rpM1166ah2 = c0235emM1487a.m1166ah("ul.py-tabs li");
                                i = 0;
                                while (i < c0589rpM1166ah.size()) {
                                    String strM1169ak3 = ((C0226ed) c0589rpM1166ah2.get(i)).m1169ak();
                                    c0589rpM1166ah3 = ((C0226ed) c0589rpM1166ah.get(i)).m1166ah("li");
                                    arrayList = new ArrayList();
                                    i2 = 0;
                                    while (i2 < c0589rpM1166ah3.size()) {
                                        C0226ed c0226ed4 = (C0226ed) c0589rpM1166ah3.get(i2);
                                        C0589rp c0589rp9 = c0589rpM1166ah;
                                        arrayList.add(c0226ed4.m1166ah("a").m1645f() + "$" + this.f268a + c0226ed4.m1166ah("a").m1640a("href"));
                                        i2++;
                                        c0589rpM1166ah2 = c0589rpM1166ah2;
                                        c0589rpM1166ah = c0589rp9;
                                    }
                                    C0589rp c0589rp10 = c0589rpM1166ah;
                                    C0589rp c0589rp11 = c0589rpM1166ah2;
                                    arrayList3.add(TextUtils.join("#", arrayList));
                                    arrayList2.add(strM1169ak3);
                                    i++;
                                    c0589rpM1166ah2 = c0589rp11;
                                    c0589rpM1166ah = c0589rp10;
                                }
                            }
                            String strJoin5 = TextUtils.join("$$$", arrayList2);
                            String strJoin6 = TextUtils.join("$$$", arrayList3);
                            JSONObject jSONObject5 = new JSONObject();
                            JSONArray jSONArray3 = new JSONArray();
                            JSONObject jSONObject6 = new JSONObject();
                            jSONObject6.put("vod_id", list.get(0));
                            jSONObject6.put("vod_name", str3);
                            jSONObject6.put("vod_pic", str2);
                            str4 = str;
                            jSONObject6.put("vod_content", str4);
                            jSONObject6.put("type_name", str4);
                            jSONObject6.put("vod_play_from", strJoin5);
                            jSONObject6.put("vod_play_url", strJoin6);
                            jSONArray3.put(jSONObject6);
                            jSONObject5.put("list", jSONArray3);
                            String string4 = jSONObject5.toString();
                            C2137a.parseJsonAndSave(string4);
                            return string4;
                        }
                    }
                } else {
                    str = "";
                }
                str2 = strM1787g;
                str3 = strM1645f;
            } catch (Exception e5) {
                Exception e = e5;
                str = "";
            }
            try {
                if (strM1889k.contains("class=\"player")) {
                    c0589rpM1166ah = c0235emM1487a.m1166ah("ul.player");
                    c0589rpM1166ah2 = c0235emM1487a.m1166ah("ul.py-tabs li");
                    i = 0;
                    while (i < c0589rpM1166ah.size()) {
                        String strM1169ak4 = ((C0226ed) c0589rpM1166ah2.get(i)).m1169ak();
                        c0589rpM1166ah3 = ((C0226ed) c0589rpM1166ah.get(i)).m1166ah("li");
                        arrayList = new ArrayList();
                        i2 = 0;
                        while (i2 < c0589rpM1166ah3.size()) {
                            C0226ed c0226ed5 = (C0226ed) c0589rpM1166ah3.get(i2);
                            C0589rp c0589rp12 = c0589rpM1166ah;
                            arrayList.add(c0226ed5.m1166ah("a").m1645f() + "$" + this.f268a + c0226ed5.m1166ah("a").m1640a("href"));
                            i2++;
                            c0589rpM1166ah2 = c0589rpM1166ah2;
                            c0589rpM1166ah = c0589rp12;
                        }
                        C0589rp c0589rp13 = c0589rpM1166ah;
                        C0589rp c0589rp14 = c0589rpM1166ah2;
                        arrayList3.add(TextUtils.join("#", arrayList));
                        arrayList2.add(strM1169ak4);
                        i++;
                        c0589rpM1166ah2 = c0589rp14;
                        c0589rpM1166ah = c0589rp13;
                    }
                }
            } catch (Exception e6) {
                SpiderDebug.log(e6);
            }
            String strJoin7 = TextUtils.join("$$$", arrayList2);
            String strJoin8 = TextUtils.join("$$$", arrayList3);
            JSONObject jSONObject7 = new JSONObject();
            JSONArray jSONArray4 = new JSONArray();
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("vod_id", list.get(0));
            jSONObject8.put("vod_name", str3);
            jSONObject8.put("vod_pic", str2);
            str4 = str;
            jSONObject8.put("vod_content", str4);
            jSONObject8.put("type_name", str4);
            jSONObject8.put("vod_play_from", strJoin7);
            jSONObject8.put("vod_play_url", strJoin8);
            jSONArray4.put(jSONObject8);
            jSONObject7.put("list", jSONArray4);
            String string5 = jSONObject7.toString();
            C2137a.parseJsonAndSave(string5);
            return string5;
        } catch (Exception e7) {
            Exception e = e7;
        }
    }

    public String homeContent(boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            String[] strArrSplit = "电影&电视剧&综艺&动漫&短剧".split("&");
            String[] strArrSplit2 = "1&2&3&4&30".split("&");
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
        try {
            for (String str2 : str.split(",")) {
                String strTrim = str2.trim();
                if (!TextUtils.isEmpty(strTrim)) {
                    HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(strTrim).openConnection();
                    httpURLConnection.setConnectTimeout(5000);
                    httpURLConnection.setReadTimeout(5000);
                    httpURLConnection.setRequestMethod("HEAD");
                    httpURLConnection.setInstanceFollowRedirects(true);
                    int responseCode = httpURLConnection.getResponseCode();
                    httpURLConnection.disconnect();
                    if (responseCode >= 200 && responseCode < 400) {
                        this.f268a = strTrim;
                        return;
                    }
                }
            }
            this.f268a = str;
        } catch (Exception e) {
            Log.e("QnMp4", "init error", e);
            this.f268a = str;
        }
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

    public String searchContent(String str, boolean z) {
        try {
            JSONArray jSONArray = new JSONArray();
            JSONObject jSONObject = new JSONObject(AbstractC0771yi.m1889k(this.f268a + "/index.php/ajax/suggest?mid=1&limit=20&wd=" + URLEncoder.encode(str, "UTF-8"), m642b()));
            if (jSONObject.optInt("code") == 1) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("list");
                for (int i = 0; i < jSONArray2.length(); i++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i);
                    String strOptString = jSONObject2.optString("name");
                    String strOptString2 = jSONObject2.optString("id");
                    String strOptString3 = jSONObject2.optString("pic");
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("vod_id", "/mv/" + strOptString2 + ".html");
                    jSONObject3.put("vod_name", strOptString);
                    jSONObject3.put("vod_pic", strOptString3);
                    jSONObject3.put("vod_remarks", "");
                    jSONArray.put(jSONObject3);
                }
            }
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("list", jSONArray);
            return jSONObject4.toString();
        } catch (Exception e) {
            SpiderDebug.log(e);
            return "";
        }
    }
}
