package com.github.catvod.spider.support.p117b;

import android.text.TextUtils;
import android.util.Log;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.p118c.C2192c;
import com.github.catvod.spider.support.p118c.C2194e;
import com.github.catvod.spider.support.p123h.C2221a;
import com.github.catvod.spider.support.p123h.C2222b;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p128m.C2256I;
import com.github.catvod.spider.support.p128m.C2268k;
import com.google.gson.Gson;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2179m {

    /* JADX INFO: renamed from: a */
    private String f5232a;

    /* JADX INFO: renamed from: b */
    private String f5233b;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.m$a */
    private static final class a {

        /* JADX INFO: renamed from: a */
        static volatile C2179m f5234a = new C2179m();
    }

    /* JADX INFO: renamed from: a */
    public static C2179m m5742a() {
        return a.f5234a;
    }

    /* JADX INFO: renamed from: d */
    private String m5743d(String str, String str2, String str3, String str4, String str5) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("fileId", str);
            jSONObject.put("fileName", str2);
            jSONObject.put("etag", str3);
            jSONObject.put("s3keyFlag", str4);
            jSONObject.put("size", str5);
            jSONObject.put("driveId", (Object) 0);
            JSONObject jSONObject2 = new JSONObject(C2238b.m6066f("https://www.123pan.cn/b/api/file/download_info", jSONObject.toString(), m5745e(true)).m6076a());
            return jSONObject2.getInt("code") != 0 ? "" : jSONObject2.getJSONObject("data").getString("DownloadUrl");
        } catch (Exception e) {
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    private Map m5744e() {
        HashMap map = new HashMap();
        map.put("referer", "https://www.123pan.com");
        map.put("origin", "https://www.123pan.com");
        map.put("platform", "open_platform");
        map.put("user-agent", "Dart/2.19(dart:io)");
        map.put("app-version", "3");
        return map;
    }

    /* JADX INFO: renamed from: e */
    private Map m5745e(boolean z) {
        HashMap map = new HashMap();
        map.put("referer", "https://www.123pan.com");
        map.put("origin", "https://www.123pan.com");
        map.put("platform", "android");
        map.put("user-agent", "Dart/2.19(dart:io)");
        map.put("app-version", "3");
        if (z) {
            map.put("Authorization", "Bearer " + m5751j());
        }
        return map;
    }

    /* JADX INFO: renamed from: i */
    private void m5746i(String str, String str2, String str3, List<C2221a> list) {
        try {
            List<C2221a> listM6025a = ((C2222b) new Gson().fromJson(C2238b.m6073l("https://www.123pan.cn/b/api/share/get?limit=100&Page=1&next=-1&orderBy=file_name&orderDirection=asc&parentFileId=" + str3 + "&shareKey=" + str + "&SharePwd=" + str2, m5745e(false)), C2222b.class)).m6023a().m6025a();
            if (listM6025a.isEmpty()) {
                return;
            }
            for (C2221a c2221a : listM6025a) {
                if (c2221a.m6021g()) {
                    list.add(c2221a);
                } else {
                    String strM6017c = c2221a.m6017c();
                    if (TextUtils.isEmpty(this.f5233b)) {
                        this.f5233b = strM6017c;
                    }
                    m5746i(str, str2, c2221a.m6016b(), list);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: r */
    private String m5747r(String str) {
        try {
            return new JSONObject(C2268k.m6164a(a.f5234a.m5748c())).optString(str);
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public final File m5748c() {
        return C2268k.m6166b("/cloud123.txt");
    }

    /* JADX INFO: renamed from: f */
    public final String m5749f() {
        return this.f5232a;
    }

    /* JADX INFO: renamed from: h */
    public final C2194e m5750h(String str, String str2) {
        ArrayList<C2221a> arrayList = new ArrayList();
        String str3 = this.f5233b;
        this.f5233b = null;
        m5746i(str, str2, "0", arrayList);
        Collections.sort(arrayList);
        List<String> list = Config.get123Options();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C2221a c2221a : arrayList) {
            arrayList2.add(c2221a.m6017c() + c2221a.m6020f() + "$" + c2221a.m6016b() + Marker.ANY_NON_NULL_MARKER + c2221a.m6017c() + Marker.ANY_NON_NULL_MARKER + c2221a.m6015a() + Marker.ANY_NON_NULL_MARKER + c2221a.m6018d() + Marker.ANY_NON_NULL_MARKER + String.valueOf(c2221a.m6019e()) + Marker.ANY_NON_NULL_MARKER + c2221a.getDownloadUrl());
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add("分享文件夹为空$0+0+0+0+0+0");
        }
        for (int i = 0; i < list.size(); i++) {
            arrayList3.add(TextUtils.join("#", arrayList2));
        }
        C2194e c2194e = new C2194e();
        c2194e.m5848j(str);
        c2194e.m5846h(TextUtils.join("$$$", arrayList3));
        c2194e.m5850l("https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/N1l5/1200X800/123.jpg/webp");
        String str4 = this.f5233b;
        c2194e.m5849k(!TextUtils.isEmpty(str4) ? str4 : "获取视频名称失败");
        c2194e.m5852n(TextUtils.join("$$$", arrayList3));
        c2194e.m5851m(TextUtils.join("$$$", list));
        return c2194e;
    }

    /* JADX INFO: renamed from: j */
    public final String m5751j() {
        return m5747r("AccessToken");
    }

    /* JADX INFO: renamed from: j */
    public final boolean m5752j(String str, String str2) throws JSONException {
        boolean z;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("passport", str);
        jSONObject.put("password", str2);
        jSONObject.put("remember", true);
        try {
            JSONObject jSONObject2 = new JSONObject(C2238b.m6066f("https://login.123pan.com/api/user/sign_in", jSONObject.toString(), m5744e()).m6076a());
            String strOptString = jSONObject2.optString("message");
            if (strOptString.equals("success")) {
                String string = jSONObject2.getJSONObject("data").getString("token");
                Log.d("Token", string);
                Map mapM5744e = m5744e();
                mapM5744e.put("Authorization", "Bearer " + string);
                String strM6073l = C2238b.m6073l("https://open-api.123pan.com/api/v1/user/info", mapM5744e);
                Log.d("UserInfo", strM6073l);
                JSONObject jSONObject3 = new JSONObject(strM6073l);
                String strOptString2 = jSONObject3.optString("message");
                if (strOptString2.equals("ok")) {
                    JSONObject jSONObject4 = jSONObject3.getJSONObject("data");
                    jSONObject4.put("AccessToken", string);
                    C2268k.m6168c(C2268k.m6166b("/cloud123.txt"), jSONObject4.toString());
                    z = true;
                } else {
                    this.f5232a = strOptString2;
                    z = false;
                }
            } else {
                this.f5232a = strOptString;
                z = false;
            }
            return z;
        } catch (Exception e) {
            Log.e("LoginError", e.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public final String m5753k(String[] strArr, String str) {
        if (TextUtils.isEmpty(m5742a().m5751j())) {
            C2256I.m6113i("还未登录123账号,请前往【配置中心】登录");
            return C2192c.m5794l("还未登录123账号,请前往【配置中心】登录");
        }
        String str2 = strArr[0];
        String str3 = strArr[1];
        String str4 = strArr[2];
        String str5 = strArr[3];
        String str6 = strArr[4];
        String str7 = strArr[5];
        String str8 = Proxy.getUrl() + "?do=danmu&site=wangpan";
        String strReplace = (!str.contains("原画") && str.contains("无限")) ? str7.replace("_24_24", "").replace("&cache_type=1&w=24&h=24&trade_key=123pan-thumbnail&type=video", "") : m5743d(str2, str3, str4, str5, str6);
        C2192c c2192c = new C2192c();
        c2192c.m5827u(strReplace);
        c2192c.m5815h();
        c2192c.m5811e(m5745e(false));
        c2192c.m5806a(str8);
        return c2192c.toString();
    }
}
