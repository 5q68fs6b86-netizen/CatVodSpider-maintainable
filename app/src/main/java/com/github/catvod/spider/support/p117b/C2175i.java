package com.github.catvod.spider.support.p117b;

import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Config;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p116a.C2139c;
import com.github.catvod.spider.support.p118c.C2192c;
import com.github.catvod.spider.support.p118c.C2194e;
import com.github.catvod.spider.support.p119d.C2198b;
import com.github.catvod.spider.support.p119d.C2199c;
import com.github.catvod.spider.support.p119d.C2201e;
import com.github.catvod.spider.support.p119d.C2202f;
import com.github.catvod.spider.support.p119d.C2203g;
import com.github.catvod.spider.support.p119d.C2204h;
import com.github.catvod.spider.support.p119d.C2205i;
import com.github.catvod.spider.support.p119d.C2206j;
import com.github.catvod.spider.support.p119d.C2207k;
import com.github.catvod.spider.support.p119d.C2208l;
import com.github.catvod.spider.support.p126k.C2238b;
import com.github.catvod.spider.support.p126k.C2240d;
import com.github.catvod.spider.support.p128m.C2256I;
import com.github.catvod.spider.support.p128m.C2268k;
import com.github.catvod.spider.support.p128m.C2269l;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2175i {

    /* JADX INFO: renamed from: a */
    private final List<String> f5204a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private C2207k f5205b;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.i$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        static volatile C2175i f5206a = new C2175i();
    }

    C2175i() {
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX INFO: renamed from: a */
    public static void m5659a(C2175i c2175i) {
        JSONObject jSONObjectOptJSONObject;
        c2175i.getClass();
        for (String str : new ArrayList(c2175i.f5204a)) {
            String strM5884a = c2175i.m5669g().m5868a().m5884a();
            JsonObject jsonObject = new JsonObject();
            JsonArray jsonArray = new JsonArray();
            JsonObject jsonObject2 = new JsonObject();
            JsonObject jsonObject3 = new JsonObject();
            jsonObject3.addProperty("drive_id", strM5884a);
            jsonObject3.addProperty("file_id", str);
            jsonObject2.add("body", jsonObject3);
            JsonObject jsonObject4 = new JsonObject();
            jsonObject4.addProperty("Content-Type", "application/json");
            jsonObject2.add("headers", jsonObject4);
            jsonObject2.addProperty("id", str);
            jsonObject2.addProperty("method", "POST");
            jsonObject2.addProperty("url", "/file/delete");
            jsonArray.add(jsonObject2);
            jsonObject.add("requests", jsonArray);
            jsonObject.addProperty("resource", "file");
            HashMap<String, String> mapM5667e = c2175i.m5667e();
            mapM5667e.put("authorization", c2175i.m5669g().m5870c().m5918a());
            mapM5667e.put("Referer", "https://www.aliyundrive.com/");
            mapM5667e.put("Content-Type", "application/json");
            JSONArray jSONArrayOptJSONArray = new JSONObject(C2238b.m6066f("https://api.aliyundrive.com/adrive/v2/batch", jsonObject.toString(), mapM5667e).m6076a()).optJSONArray("responses");
            boolean z = false;
            if (jSONArrayOptJSONArray != null && (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) != null && jSONObjectOptJSONObject.optInt("status") == 204) {
                z = true;
            }
            if (z) {
                c2175i.f5204a.remove(str);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private String m5660b(String str, String str2, boolean z) {
        try {
            if (!str.startsWith("https")) {
                str = "https://api.aliyundrive.com/" + str;
            }
            HashMap<String, String> mapM5667e = m5667e();
            mapM5667e.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
            C2207k c2207k = this.f5205b;
            if (!(c2207k == null)) {
                mapM5667e.put("x-share-token", c2207k.m5915c());
            }
            if (m5669g().m5870c().m5921d()) {
                mapM5667e.put("authorization", m5669g().m5870c().m5918a());
            }
            C2240d c2240dM6066f = C2238b.m6066f(str, str2, mapM5667e);
            if (z && c2240dM6066f.m6077b() == 401 && m5679s()) {
                return m5660b(str, str2, false);
            }
            return (z && c2240dM6066f.m6077b() == 429) ? m5660b(str, str2, false) : c2240dM6066f.m6076a();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: c */
    private String m5661c(String str, String str2) {
        if (TextUtils.isEmpty(m5669g().m5868a().m5884a())) {
            m5671i();
        }
        C2206j.a aVarM5908a = ((C2206j) new Gson().fromJson(m5660b("adrive/v2/batch", String.format("{\"requests\":[{\"body\":{\"file_id\":\"%s\",\"share_id\":\"%s\",\"auto_rename\":true,\"to_parent_file_id\":\"root\",\"to_drive_id\":\"%s\"},\"headers\":{\"Content-Type\":\"application/json\"},\"id\":\"0\",\"method\":\"POST\",\"url\":\"/file/copy\"}],\"resource\":\"file\"}", str2, str, m5669g().m5868a().m5884a()), true), C2206j.class)).m5909b().m5908a();
        String strM5910a = aVarM5908a.m5910a();
        if (!TextUtils.isEmpty(strM5910a)) {
            return strM5910a;
        }
        String strM5911b = aVarM5908a.m5911b();
        if (strM5911b.contains("limit")) {
            C2256I.m6113i(C2139c.m5408a("云盘空间不足，请手动删除部分文件\r\n", strM5911b));
        }
        SpiderDebug.log("");
        return "";
    }

    /* JADX INFO: renamed from: d */
    public static C2175i m5662d() {
        return a.f5206a;
    }

    /* JADX INFO: renamed from: n */
    private void m5663n(String str, C2203g c2203g, List<C2203g> list, String str2) {
        ArrayList arrayList = new ArrayList();
        C2203g c2203gM5674l = m5674l(str, c2203g, str2);
        for (C2203g c2203g2 : c2203gM5674l.m5889e()) {
            if (c2203g2.m5896k().equals("folder")) {
                arrayList.add(c2203g2);
            } else if (c2203g2.m5885a().equals("video") || c2203g2.m5885a().equals("audio")) {
                if (c2203g2.m5888d().doubleValue() >= 5242880.0d) {
                    c2203g2.m5898m(c2203g.m5890f());
                    list.add(c2203g2);
                }
            }
        }
        if (c2203gM5674l.m5892g().length() > 0) {
            m5663n(str, c2203g, list, c2203gM5674l.m5892g());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m5675m(str, (C2203g) it.next(), list);
        }
    }

    /* JADX INFO: renamed from: q */
    private String m5664q(String str, JsonObject jsonObject) {
        if (!str.startsWith("https")) {
            str = C2139c.m5408a("https://api.aliyundrive.com/", str);
        }
        return C2238b.m6066f(str, jsonObject.toString(), m5667e()).m6076a();
    }

    /* JADX INFO: renamed from: q */
    private boolean m5665q(String str) {
        if (!str.contains("Too Many Requests")) {
            return false;
        }
        C2256I.m6113i("授权频率超过限定数,请稍候再试!");
        m5669g().m5873f(C2204h.m5899d(""));
        return true;
    }

    /* JADX INFO: renamed from: r */
    private String m5666r(String str, JsonObject jsonObject, C2207k c2207k, Boolean bool) {
        if (!str.startsWith("https")) {
            str = C2139c.m5408a("https://api.aliyundrive.com/", str);
        }
        HashMap<String, String> mapM5667e = m5667e();
        mapM5667e.put("x-share-token", c2207k.m5915c());
        mapM5667e.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        C2240d c2240dM6066f = C2238b.m6066f(str, jsonObject.toString(), mapM5667e);
        return (bool.booleanValue() && c2240dM6066f.m6077b() == 429) ? m5666r(str, jsonObject, c2207k, Boolean.FALSE) : c2240dM6066f.m6076a();
    }

    /* JADX INFO: renamed from: e */
    public final HashMap<String, String> m5667e() {
        return C2174h.m5658c("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) aDrive/6.1.0 Chrome/112.0.5615.165 Electron/24.1.3.7 Safari/537.36", "Referer", "https://www.aliyundrive.com/");
    }

    /* JADX INFO: renamed from: f */
    public final File m5668f() {
        return C2268k.m6166b("aliyun");
    }

    /* JADX INFO: renamed from: g */
    public final C2198b m5669g() {
        C2198b c2198b = (C2198b) new Gson().fromJson(C2268k.m6164a(m5668f()), C2198b.class);
        return c2198b == null ? new C2198b() : c2198b;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX INFO: renamed from: h */
    public final String m5670h(String str, String str2) {
        final int i = 0;
        try {
            try {
                if (!TextUtils.isEmpty(str)) {
                    m5682u(str);
                    str2 = m5661c(str, str2);
                    this.f5204a.add(0, str2);
                }
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("file_id", str2);
                jsonObject.addProperty("expire_sec", 115200);
                jsonObject.addProperty("drive_id", m5669g().m5868a().m5884a());
                HashMap<String, String> mapM5667e = m5667e();
                mapM5667e.put("authorization", m5669g().m5870c().m5918a());
                mapM5667e.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36");
                mapM5667e.put("Referer", "https://www.aliyundrive.com/");
                mapM5667e.put("Content-Type", "application/json; charset=utf-8");
                String strM6076a = C2238b.m6066f("https://bj29.api.aliyunpds.com/v2/file/get_download_url", jsonObject.toString(), mapM5667e).m6076a();
                SpiderDebug.log("json:" + strM6076a);
                if (!strM6076a.contains("AccessTokenExpired") && !strM6076a.contains("TokenVerifyFailed") && !strM6076a.contains("AccessTokenInvalid")) {
                    String strM5883a = ((C2201e) new Gson().fromJson(strM6076a, C2201e.class)).m5883a();
                    if (!TextUtils.isEmpty(str)) {
                        Init.execute(new RunnableC2173g(this, i));
                    }
                    return strM5883a;
                }
                String strM5670h = m5677p() ? m5670h(str, str2) : "";
                if (!TextUtils.isEmpty(str)) {
                    Init.execute(new RunnableC2169c(this, i));
                }
                return strM5670h;
            } catch (Exception e) {
                e.printStackTrace();
                if (!TextUtils.isEmpty(str)) {
                    Init.execute(new RunnableC2170d(this, 0));
                }
                return "";
            }
        } catch (Throwable th) {
            if (!TextUtils.isEmpty(str)) {
                Init.execute(new Runnable() { // from class: com.github.catvod.spider.support.p117b.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i) {
                            case 0:
                                C2175i.m5659a((C2175i) this);
                                break;
                            default:
                                ((MainActivity) this).i();
                                break;
                        }
                    }
                });
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m5671i() {
        HashMap<String, String> mapM5667e = m5667e();
        mapM5667e.put("authorization", m5669g().m5870c().m5918a());
        mapM5667e.put("X-Canary", "client=Android,app=adrive,version=v4.3.1");
        C2202f c2202f = (C2202f) new Gson().fromJson(C2238b.m6066f("https://user.aliyundrive.com/v2/user/get", "{}", mapM5667e).m6076a(), C2202f.class);
        if (c2202f == null) {
            c2202f = new C2202f();
        }
        if (c2202f.m5884a().isEmpty()) {
            return false;
        }
        m5669g().m5872e(c2202f);
        return true;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX INFO: renamed from: j */
    public final List m5672j(String str, String str2) {
        List arrayList = new ArrayList();
        final int i = 0;
        int i2 = 1;
        try {
            try {
                if (!TextUtils.isEmpty(str)) {
                    m5682u(str);
                    str2 = m5661c(str, str2);
                    this.f5204a.add(0, str2);
                }
                JsonObject jsonObject = new JsonObject();
                jsonObject.addProperty("file_id", str2);
                jsonObject.addProperty("category", "live_transcoding");
                jsonObject.addProperty("drive_id", m5669g().m5868a().m5884a());
                HashMap<String, String> mapM5667e = m5667e();
                mapM5667e.put("authorization", m5669g().m5869b().m5900a());
                mapM5667e.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36");
                mapM5667e.put("Referer", "https://www.aliyundrive.com/");
                mapM5667e.put("Content-Type", "application/json; charset=utf-8");
                String strM6076a = C2238b.m6066f("https://open.aliyundrive.com/adrive/v1.0/openFile/getVideoPreviewPlayInfo", jsonObject.toString(), mapM5667e).m6076a();
                if (!strM6076a.contains("AccessTokenExpired") && !strM6076a.contains("TokenVerifyFailed") && !strM6076a.contains("AccessTokenInvalid")) {
                    List<C2205i.b> listM5905a = ((C2205i) new Gson().fromJson(strM6076a, C2205i.class)).m5904a().m5905a();
                    ArrayList arrayList2 = new ArrayList();
                    for (int size = listM5905a.size() - 1; size >= 0; size--) {
                        if (!TextUtils.isEmpty(listM5905a.get(size).m5907b())) {
                            arrayList2.add(listM5905a.get(size).m5906a());
                            arrayList2.add(listM5905a.get(size).m5907b());
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                        arrayList3.add((String) arrayList2.get(i3));
                    }
                    if (!TextUtils.isEmpty(str)) {
                        Init.execute(new RunnableC2172f(this, i));
                    }
                    return arrayList3;
                }
                if (m5677p()) {
                    arrayList = m5672j(str, str2);
                }
                if (!TextUtils.isEmpty(str)) {
                    Init.execute(new Runnable() { // from class: com.github.catvod.spider.support.p117b.e
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    C2175i.m5659a((C2175i) this);
                                    break;
                                default:
                                    ((MainActivity) this).getClass();
                                    try {
                                        MainActivity.q(Init.getConfigActivity());
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                        return;
                                    }
                                    break;
                            }
                        }
                    });
                }
                return arrayList;
            } catch (Exception e) {
                e.printStackTrace();
                if (!TextUtils.isEmpty(str)) {
                    Init.execute(new Runnable() { // from class: com.github.catvod.spider.support.p117b.b
                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i) {
                                case 0:
                                    C2175i.m5659a((C2175i) this);
                                    break;
                                default:
                                    ((MainActivity) this).n();
                                    break;
                            }
                        }
                    });
                }
                return arrayList;
            }
        } catch (Throwable th) {
            if (!TextUtils.isEmpty(str)) {
                Init.execute(new RunnableC2169c(this, i2));
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public final C2194e m5673k(String str, String str2) {
        m5682u(str);
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("share_id", str);
        C2207k c2207kM5912d = C2207k.m5912d(m5664q("adrive/v3/share_link/get_share_by_anonymous", jsonObject));
        ArrayList<C2203g> arrayList = new ArrayList();
        m5663n(str, new C2203g(TextUtils.isEmpty(str2) ? "root" : str2), arrayList, "");
        Collections.sort(arrayList);
        List<String> aliOptions = Config.getAliOptions();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (C2203g c2203g : arrayList) {
            arrayList2.add(c2203g.m5886b() + "$" + (c2203g.m5886b() + "_" + c2203g.m5887c()) + Marker.ANY_NON_NULL_MARKER + str);
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add("当前分享链接下无视频文件$0+" + str);
        }
        for (int i = 0; i < aliOptions.size(); i++) {
            arrayList3.add(TextUtils.join("#", arrayList2));
        }
        C2194e c2194e = new C2194e();
        c2194e.m5848j(str);
        c2194e.m5846h(str + "/" + str2);
        c2194e.m5850l("https://pic7.fukit.cn/autoupload/gE6Y0Af2tjXBCNig6CtNDI12_FRYNb81z6UPhMWD8iI/20260503/8Yr6/1200X800/aliyun.jpg/webp");
        c2194e.m5849k(c2207kM5912d.m5914b());
        c2194e.m5852n(TextUtils.join("$$$", arrayList3));
        c2194e.m5851m(TextUtils.join("$$$", aliOptions));
        return c2194e;
    }

    /* JADX INFO: renamed from: l */
    public final C2203g m5674l(String str, C2203g c2203g, String str2) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("limit", 200);
        jsonObject.addProperty("share_id", str);
        jsonObject.addProperty("parent_file_id", c2203g.m5887c());
        jsonObject.addProperty("order_by", "name");
        jsonObject.addProperty("order_direction", "ASC");
        if (str2.length() > 0) {
            jsonObject.addProperty("marker", str2);
        }
        return (C2203g) new Gson().fromJson(m5666r("adrive/v3/file/list", jsonObject, this.f5205b, Boolean.TRUE), C2203g.class);
    }

    /* JADX INFO: renamed from: m */
    public final void m5675m(String str, C2203g c2203g, List<C2203g> list) {
        m5663n(str, c2203g, list, "");
    }

    /* JADX INFO: renamed from: o */
    public final String m5676o(String str) {
        try {
            String strM5884a = m5669g().m5868a().m5884a();
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("drive_id", strM5884a);
            jsonObject.addProperty("file_id", str);
            HashMap map = new HashMap();
            map.put("Authorization", m5669g().m5870c().m5918a());
            String strM6076a = C2238b.m6066f("https://api.aliyundrive.com/adrive/v1/file/get_path", jsonObject.toString(), map).m6076a();
            if (!strM6076a.contains("AccessTokenExpired") && !strM6076a.contains("TokenVerifyFailed") && !strM6076a.contains("AccessTokenInvalid")) {
                return new JSONObject(strM6076a).getJSONArray("items").getJSONObject(0).optString("parent_file_id");
            }
            return m5680t() ? m5676o(str) : "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m5677p() {
        String strM5901b = m5669g().m5869b().m5901b();
        if (!strM5901b.isEmpty()) {
            try {
                HashMap map = new HashMap();
                map.put("Cookie", "driver_txt=alicloud_go; server_use=true");
                String strM6073l = C2238b.m6073l("https://api.oplist.org/alicloud/renewapi?client_uid=&client_key=&driver_txt=alicloud_go&server_use=true&refresh_ui=" + strM5901b, map);
                if (m5665q(strM6073l)) {
                    return true;
                }
                C2204h c2204hM5899d = C2204h.m5899d(strM6073l);
                if (c2204hM5899d.m5903d()) {
                    m5669g().m5873f(c2204hM5899d);
                }
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("authorize", 1);
        jsonObject.addProperty("scope", "user:base,file:all:read,file:all:write");
        try {
            String str = "https://api.oplist.org/alicloud/callback?code=" + ((C2199c) new Gson().fromJson(m5660b("https://open.aliyundrive.com/oauth/users/authorize?client_id=c78079b71f42427b8c899f81fbe36961&redirect_uri=https%3A%2F%2Fapi.oplist.org%2Falicloud%2Fcallback&scope=user:base,file:all:read,file:all:write&response_type=code", jsonObject.toString(), true), C2199c.class)).m5875a();
            HashMap map2 = new HashMap();
            map2.put("Cookie", "driver_txt=alicloud_go; server_use=true");
            String str2 = new String(Base64.decode(C2238b.m6059a(str, map2).split("#")[1], 2));
            if (m5665q(str2)) {
                return true;
            }
            C2204h c2204hM5899d2 = C2204h.m5899d(str2);
            if (c2204hM5899d2.m5903d()) {
                m5669g().m5873f(c2204hM5899d2);
            }
            return true;
        } catch (Exception e2) {
            return false;
        }
    }

    /* JADX INFO: renamed from: q */
    public String m5678q(String[] strArr, String str) {
        String str2 = strArr.length > 1 ? strArr[1] : "";
        String str3 = strArr[0];
        if (str3.contains("_")) {
            String[] strArrSplit = str3.split("_");
            C2269l.m6178c("danmuvodindex", strArrSplit[0]);
            str3 = strArrSplit[1];
        }
        int iLastIndexOf = str3.lastIndexOf("_");
        String strSubstring = iLastIndexOf > -1 ? str3.substring(iLastIndexOf + 1) : str3;
        if (strSubstring == null) {
            strSubstring = str3;
        }
        if (!m5669g().m5870c().m5921d()) {
            C2256I.m6113i("还未登录阿里账号,请前往【配置中心】登录");
            return C2192c.m5794l("还未登录阿里账号,请前往【配置中心】登录");
        }
        String str4 = str.split("#")[0];
        String str5 = Proxy.getUrl() + "?do=danmu&site=wangpan";
        if (str4.contains("原画")) {
            C2192c c2192cM5811e = new C2192c().m5827u(C1273a.m3159a("ali", str2, strSubstring, "")).m5815h().m5811e((Map<String, String>) m5667e());
            c2192cM5811e.m5806a(str5);
            return c2192cM5811e.toString();
        }
        C2192c c2192cM5811e2 = new C2192c().m5828v(m5672j(str2, strSubstring)).m5814g().m5811e((Map<String, String>) m5667e());
        c2192cM5811e2.m5806a(str5);
        return c2192cM5811e2.toString();
    }

    /* JADX INFO: renamed from: s */
    public final boolean m5679s() {
        String strM5920c = m5669g().m5870c().m5920c();
        if (TextUtils.isEmpty(strM5920c)) {
            return false;
        }
        return m5681t(strM5920c);
    }

    /* JADX INFO: renamed from: t */
    public final boolean m5680t() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("refresh_token", m5669g().m5870c().m5920c());
        jsonObject.addProperty("grant_type", "refresh_token");
        C2208l c2208l = (C2208l) new Gson().fromJson(m5664q("https://auth.aliyundrive.com/v2/account/token", jsonObject), C2208l.class);
        if (c2208l == null) {
            c2208l = new C2208l();
        }
        if (!c2208l.m5921d()) {
            return false;
        }
        m5669g().m5874g(c2208l);
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m5681t(String str) {
        JsonObject jsonObject = new JsonObject();
        if (str.startsWith("http")) {
            str = C2238b.m6073l(str, null).trim();
        }
        jsonObject.addProperty("refresh_token", str);
        jsonObject.addProperty("grant_type", "refresh_token");
        C2208l c2208l = (C2208l) new Gson().fromJson(m5664q("https://auth.aliyundrive.com/v2/account/token", jsonObject), C2208l.class);
        if (c2208l == null) {
            c2208l = new C2208l();
        }
        if (!c2208l.m5921d()) {
            return false;
        }
        m5669g().m5874g(c2208l);
        m5677p();
        m5671i();
        C2198b c2198bM5669g = m5669g();
        return c2198bM5669g.m5870c().m5921d() && c2198bM5669g.m5869b().m5902c() && !c2198bM5669g.m5868a().m5884a().isEmpty();
    }

    /* JADX INFO: renamed from: u */
    public final void m5682u(String str) {
        C2207k c2207k = this.f5205b;
        if (c2207k == null || !c2207k.m5913a(str)) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("share_id", str);
            jsonObject.addProperty("share_pwd", "");
            C2207k c2207kM5912d = C2207k.m5912d(m5664q("v2/share_link/get_share_token", jsonObject));
            c2207kM5912d.m5916e(str);
            c2207kM5912d.m5917f();
            this.f5205b = c2207kM5912d;
            if (c2207kM5912d.m5915c().isEmpty()) {
                C2256I.m6113i("来晚了，分享已经失效!");
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m5683v(String str, String str2) {
        C2207k c2207k = this.f5205b;
        if (c2207k == null || !c2207k.m5913a(str)) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("share_id", str);
            jsonObject.addProperty("share_pwd", str2);
            C2207k c2207kM5912d = C2207k.m5912d(m5664q("v2/share_link/get_share_token", jsonObject));
            c2207kM5912d.m5916e(str);
            c2207kM5912d.m5917f();
            this.f5205b = c2207kM5912d;
            if (c2207kM5912d.m5915c().isEmpty()) {
                C2256I.m6113i("来晚了，分享已经失效!");
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final String m5684w(String str, String str2) {
        try {
            m5682u(str);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("drive_id", "");
            jsonObject.addProperty("share_id", str);
            jsonObject.addProperty("file_id", str2);
            jsonObject.addProperty("fields", Marker.ANY_MARKER);
            return new JSONObject(m5666r("adrive/v2/file/get_by_share", jsonObject, this.f5205b, Boolean.TRUE)).optString("parent_file_id");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: x */
    public final boolean m5685x(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            File file = new File(new File(Environment.getExternalStorageDirectory(), "TVBox"), "diy_cookie.txt");
            if (!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
            JSONObject jSONObject = new JSONObject();
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "UTF-8");
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                }
                bufferedReader.close();
                inputStreamReader.close();
                fileInputStream.close();
                jSONObject = new JSONObject(sb.toString());
            }
            jSONObject.put("123panfx_cookie", str);
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "UTF-8");
            outputStreamWriter.write(jSONObject.toString());
            outputStreamWriter.close();
            fileOutputStream.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
