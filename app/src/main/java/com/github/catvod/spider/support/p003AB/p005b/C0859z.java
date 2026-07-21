package com.github.catvod.spider.support.p003AB.p005b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.AB.C.h;
import com.github.catvod.spider.support.AB.c.e;
import com.github.catvod.spider.support.AB.c.g;
import com.github.catvod.spider.support.AB.c.j;
import com.github.catvod.spider.support.AB.f.a;
import com.github.catvod.spider.support.AB.f.b;
import com.github.catvod.spider.support.p003AB.p004a.C0816a;
import com.github.catvod.spider.support.p003AB.p007m.C0869c;
import com.github.catvod.spider.support.p003AB.p009o.C0895E;
import com.github.catvod.spider.support.p003AB.p009o.C0898H;
import com.github.catvod.spider.support.p003AB.p009o.C0921c0;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.b.z */
/* JADX INFO: loaded from: classes.dex */
public final class C0859z {

    /* JADX INFO: renamed from: c */
    private static Bitmap f2022c = null;

    /* JADX INFO: renamed from: d */
    private static String f2023d = null;

    /* JADX INFO: renamed from: e */
    private static final String f2024e = "/tvtmp";

    /* JADX INFO: renamed from: a */
    private String f2025a;

    /* JADX INFO: renamed from: b */
    private final Map<String, Map<String, String>> f2026b = new HashMap();

    /* JADX INFO: renamed from: a */
    private e<String> m2102a(String str, boolean z) {
        e<String> eVar = new e<>();
        eVar.e(0);
        try {
            m2103b(true);
            String str2 = "https://pan.baidu.com/share/transfer?shareid=" + m2109m(this.f2025a, "shareid") + "&from=" + m2109m(this.f2025a, "uk") + "&sekey=" + m2109m(this.f2025a, "sekey") + "&ondup=newcopy&async=1&channel=chunlei&web=1&app_id=250528";
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            map.put("fsidlist", arrayList.toString());
            map.put("path", f2024e);
            JSONObject jSONObject = new JSONObject(C0869c.m2128h(str2, map, m2106f()).m2134a());
            if (jSONObject.optInt("errno") == 0) {
                String strOptString = jSONObject.optJSONObject("extra").optJSONArray("list").optJSONObject(0).optString("to");
                if (TextUtils.isEmpty(strOptString) && z) {
                    return m2102a(str, false);
                }
                eVar.f(strOptString);
            } else if (jSONObject.optInt("errno") == 2) {
                eVar.g(jSONObject.optString("show_msg"));
                if (jSONObject.optString("show_msg").equals("文件已存在")) {
                    eVar.g("不支持看自己的分享");
                }
                eVar.e(2);
            } else {
                eVar.e(jSONObject.optInt("errno"));
                eVar.g(jSONObject.optString("show_msg"));
            }
        } catch (Exception e) {
            eVar.e(500);
            eVar.g(e.getMessage());
            SpiderDebug.log("copy err" + e.getMessage());
        }
        return eVar;
    }

    /* JADX INFO: renamed from: b */
    private boolean m2103b(boolean z) {
        try {
            m2110n();
            b bVarE = b.e(C0869c.m2132l("https://pan.baidu.com/api/list?clienttype=0&app_id=250528&web=1&dp-logid=&order=time&desc=1&dir=/tvtmp&num=100&page=1", m2106f()));
            ArrayList arrayList = new ArrayList();
            if (bVarE.a() == 0) {
                Iterator it = bVarE.b().iterator();
                while (it.hasNext()) {
                    arrayList.add(((a) it.next()).c());
                }
            }
            if (!arrayList.isEmpty() && arrayList.size() >= 3) {
                HashMap map = new HashMap();
                map.put("filelist", new JSONArray((Collection) arrayList).toString());
                if (TextUtils.isEmpty(new JSONObject(C0869c.m2128h("https://pan.baidu.com/api/filemanager?async=2&onnest=fail&opera=delete&bdstoken=", map, m2106f()).m2134a()).optString("taskid")) && z) {
                    return m2103b(false);
                }
            }
            return true;
        } catch (Exception e) {
            SpiderDebug.log("delete err: " + e);
            return false;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m2104c(String str, String str2, String str3, String str4, List<a> list, String str5) {
        try {
            String str6 = "https://pan.baidu.com/share/list?is_from_web=true&sekey=" + str + "&uk=" + str2 + "&shareid=" + str3 + "&order=other&desc=1&showempty=0&view_mode=1&web=1&page=1&num=100&dir=" + URLEncoder.encode(str4) + "&t=0.6675001943649936&channel=chunlei&web=1&app_id=250528&bdstoken=";
            Map<String, String> mapM2106f = m2106f();
            ((HashMap) mapM2106f).put("Cookie", "BDCLND=" + str);
            b bVarE = b.e(C0869c.m2132l(str6, mapM2106f));
            if (bVarE.a() == 0) {
                List listB = bVarE.b();
                ArrayList arrayList = new ArrayList();
                for (int size = listB.size() - 1; size >= 0; size--) {
                    a aVar = (a) listB.get(size);
                    if (aVar.g()) {
                        aVar.j(str5);
                        list.add(aVar);
                    } else if (aVar.b() == 1) {
                        arrayList.add(aVar);
                    }
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    m2104c(str, str2, str3, ((a) listB.get(size2)).c(), list, "");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: e */
    public static C0859z m2105e() {
        return C0858y.f2021a;
    }

    /* JADX INFO: renamed from: f */
    private Map<String, String> m2106f() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36 Edg/134.0.0.0");
        map.put("Accept", "application/json;charset=UTF-8");
        if (!TextUtils.isEmpty(m2114g())) {
            map.put("Cookie", m2114g());
        }
        map.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        map.put("Referer", "https://pan.baidu.com");
        return map;
    }

    /* JADX INFO: renamed from: i */
    private String m2107i(String str) {
        if (str != null) {
            try {
                if (!str.isEmpty()) {
                    ArrayList arrayList = new ArrayList(Arrays.asList(str.split("/+")));
                    boolean z = !arrayList.isEmpty() && ((String) arrayList.get(0)).isEmpty();
                    if (arrayList.isEmpty()) {
                        return "";
                    }
                    int size = arrayList.size() - 1;
                    if (size >= 0) {
                        arrayList.remove(size);
                    }
                    if (z && arrayList.size() == 1 && ((String) arrayList.get(0)).isEmpty()) {
                        return "/";
                    }
                    StringBuilder sb = new StringBuilder();
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        while (true) {
                            sb.append((CharSequence) it.next());
                            if (!it.hasNext()) {
                                break;
                            }
                            sb.append((CharSequence) "/");
                        }
                    }
                    String string = sb.toString();
                    return (z && string.isEmpty()) ? "/" : string;
                }
            } catch (Exception unused) {
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m2108k() {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
            map.put("Referer", "https://pan.baidu.com/");
            JSONObject jSONObject = new JSONObject(C0869c.m2132l("https://passport.baidu.com/v2/api/getqrcode?lp=pc&qrloginfrom=pc", map));
            SpiderDebug.log(jSONObject.toString());
            String str = "https://" + jSONObject.optString("imgurl") + "&logPage=traceId%3Apc_loginv5_1742970205%2ClogPage%3Aloginv5";
            f2023d = jSONObject.optString("sign");
            byte[] bArrBytes = C0869c.m2124d(str).body().bytes();
            f2022c = BitmapFactory.decodeByteArray(bArrBytes, 0, bArrBytes.length);
            return !TextUtils.isEmpty(f2023d);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    /* JADX INFO: renamed from: m */
    private String m2109m(String str, String str2) {
        try {
            return (String) ((Map) this.f2026b.get(str)).get(str2);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    private a m2110n() {
        try {
            b bVarE = b.e(C0869c.m2132l("https://pan.baidu.com/api/list?clienttype=0&app_id=250528&web=1&dp-logid=&order=time&desc=1&dir=%2F&num=100&page=1", m2106f()));
            if (bVarE.a() == 0) {
                for (a aVar : bVarE.b()) {
                    if (aVar.c().equals(f2024e)) {
                        return aVar;
                    }
                }
            }
            String str = "https://pan.baidu.com/api/create?a=commit&bdstoken=" + new JSONObject(C0869c.m2132l("https://pan.baidu.com/api/gettemplatevariable?clienttype=0&app_id=250528&web=1&fields=[\"bdstoken\",\"token\",\"uk\",\"isdocuser\",\"servertime\"]", m2106f())).optJSONObject("result").optString("bdstoken") + "&clienttype=0&app_id=250528&web=1&dp-logid=";
            HashMap map = new HashMap();
            String str2 = f2024e;
            map.put("path", str2);
            map.put("isdir", "1");
            map.put("block_list", "[]");
            JSONObject jSONObject = new JSONObject(C0869c.m2128h(str, map, m2106f()).m2134a());
            a aVar2 = new a();
            aVar2.h(jSONObject.optLong("fs_id"));
            aVar2.i(str2);
            return aVar2;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: r */
    private void m2111r(String str, String str2, String str3) {
        try {
            Map<String, String> map = this.f2026b.get(str);
            if (map == null) {
                map = new HashMap<>();
            }
            map.put(str2, str3);
            this.f2026b.put(str, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m2112s() {
        try {
            String str = "https://passport.baidu.com/channel/unicast?channel_id=" + f2023d;
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
            map.put("Referer", "https://pan.baidu.com/");
            JSONObject jSONObject = new JSONObject(C0869c.m2132l(str, map));
            SpiderDebug.log(jSONObject.toString());
            if (jSONObject.optInt("errno") == 0) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("channel_v"));
                SpiderDebug.log(jSONObject2.toString());
                if (jSONObject2.optInt("status") == 0) {
                    String str2 = "https://passport.baidu.com/v3/login/main/qrbdusslogin?v=" + System.currentTimeMillis() + "&bduss=" + jSONObject2.optString("v");
                    new HashMap();
                    String str3 = "";
                    String str4 = "";
                    for (String str5 : C0869c.m2122b(str2, map).m2136c().get("set-cookie")) {
                        str3 = TextUtils.isEmpty(str3) ? str5.split(";")[0] : str3 + ";" + str5.split(";")[0];
                        if (str5.contains("BDUSS=")) {
                            str4 = str5.split(";")[0];
                        }
                    }
                    SpiderDebug.log("tempCookies: " + str3);
                    map.put("Cookie", str3);
                    for (String str6 : C0869c.m2130j(C0869c.m2126f(), C0869c.m2123c(C0869c.m2123c("https://pan.baidu.com/disk/main?from=homeFlow", map), map), new HashMap(), map).m2136c().get("set-cookie")) {
                        if (str6.contains("STOKEN=")) {
                            str4 = str4 + ";" + str6.split(";")[0];
                            break;
                        }
                    }
                    C0921c0.m2238u(".baidu", str4);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m2113d(String str, String str2, List<a> list) {
        try {
            String strM2117l = m2117l(str, str2);
            if (TextUtils.isEmpty(strM2117l)) {
                return;
            }
            m2111r(str, "sekey", strM2117l);
            Map<String, String> mapM2106f = m2106f();
            ((HashMap) mapM2106f).put("Cookie", "BDCLND=" + strM2117l);
            b bVarE = b.e(C0869c.m2132l("https://pan.baidu.com/share/list?web=5&app_id=250528&desc=1&showempty=0&page=1&num=20&order=time&shorturl=" + str + "&root=1&view_mode=1&channel=chunlei&web=1&bdstoken=", mapM2106f));
            if (bVarE.a() != 0) {
                C0895E.m2152b("");
                return;
            }
            m2111r(str, "shareid", bVarE.c());
            m2111r(str, "uk", bVarE.d());
            List listB = bVarE.b();
            for (int size = listB.size() - 1; size >= 0; size--) {
                a aVar = (a) listB.get(size);
                if (aVar.g()) {
                    list.add(aVar);
                }
                if (aVar.b() == 1) {
                    byte[] bArr = new byte[8];
                    bArr[0] = 87;
                    bArr[1] = -4;
                    bArr[2] = 48;
                    bArr[3] = 121;
                    bArr[4] = -63;
                    bArr[5] = -10;
                    bArr[6] = -45;
                    bArr[7] = -44;
                    String strM2109m = m2109m(str, C0816a.m1965a(new byte[]{34, -105}, bArr));
                    byte[] bArr2 = new byte[7];
                    bArr2[0] = -14;
                    bArr2[1] = -70;
                    bArr2[2] = 111;
                    bArr2[3] = -5;
                    bArr2[4] = 65;
                    bArr2[5] = -103;
                    bArr2[6] = -120;
                    byte[] bArr3 = new byte[8];
                    bArr3[0] = -127;
                    bArr3[1] = -46;
                    bArr3[2] = 14;
                    bArr3[3] = -119;
                    bArr3[4] = 36;
                    bArr3[5] = -16;
                    bArr3[6] = -20;
                    bArr3[7] = 55;
                    String strM2109m2 = m2109m(str, C0816a.m1965a(bArr2, bArr3));
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr4 = new byte[10];
                    bArr4[0] = 74;
                    bArr4[1] = 15;
                    bArr4[2] = 30;
                    bArr4[3] = -106;
                    bArr4[4] = -73;
                    bArr4[5] = 17;
                    bArr4[6] = 61;
                    bArr4[7] = 26;
                    bArr4[8] = 11;
                    bArr4[9] = 23;
                    sb.append(C0816a.m1965a(bArr4, new byte[]{101, 124, 118, -9, -59, 116, 81, 115}));
                    sb.append(strM2109m2);
                    sb.append("-");
                    sb.append(aVar.a());
                    sb.append("/");
                    sb.append(aVar.e());
                    m2104c(strM2117l, strM2109m, strM2109m2, sb.toString(), list, aVar.e());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m2114g() {
        return C0921c0.m2234q(".baidu");
    }

    /* JADX INFO: renamed from: h */
    public final e<String> m2115h(String str) {
        e<String> eVar = new e<>();
        try {
            eVar = m2102a(str, true);
            if (eVar.b() == 0 && !h.c((CharSequence) eVar.c())) {
                String str2 = (String) eVar.c();
                SpiderDebug.log("getDownLoadUrl copy res: " + str2);
                String str3 = "https://pan.baidu.com/api/mediainfo?type=M3U8_FLV_264_480&path=" + URLEncoder.encode(str2) + "&clienttype=80&origin=dlna";
                HashMap map = new HashMap();
                map.put("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
                map.put("Cookie", m2114g());
                JSONObject jSONObject = new JSONObject(C0869c.m2132l(str3, map));
                String strOptString = jSONObject.optJSONObject("info").optString("dlink");
                SpiderDebug.log("getDownLoadUrl dlink res: " + strOptString);
                if (TextUtils.isEmpty(strOptString)) {
                    eVar.e(jSONObject.optInt("errno"));
                    eVar.f("dlink 为空");
                }
                eVar.f(C0869c.m2123c(strOptString, map));
                return eVar;
            }
            return eVar;
        } catch (Exception e) {
            eVar.e(500);
            eVar.f(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: j */
    public final Bitmap m2116j() {
        return f2022c;
    }

    /* JADX INFO: renamed from: l */
    public final String m2117l(String str, String str2) {
        try {
            String str3 = "https://pan.baidu.com/share/verify?t=" + System.currentTimeMillis() + "&surl=" + str + "&channel=chunlei&web=1&app_id=250528&bdstoken=";
            HashMap map = new HashMap();
            map.put("pwd", str2);
            JSONObject jSONObject = new JSONObject(C0869c.m2128h(str3, map, m2106f()).m2134a());
            if (jSONObject.optInt("errno") == 0) {
                return jSONObject.optString("randsk");
            }
            jSONObject.optInt("err_msg");
            C0895E.m2152b("");
            return "";
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: o */
    public final j m2118o(String str, String str2, String str3) {
        j jVar = new j();
        try {
            ArrayList arrayList = new ArrayList();
            m2113d(str, str2, arrayList);
            List listSingletonList = Collections.singletonList("B度原画");
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                String str4 = "";
                if (!it.hasNext()) {
                    break;
                }
                a aVar = (a) it.next();
                if (!TextUtils.isEmpty(aVar.d())) {
                    str4 = "[" + aVar.d().trim() + "]";
                }
                String str5 = str4 + aVar.e() + aVar.f() + "$" + str + Marker.ANY_NON_NULL_MARKER + aVar.a();
                if (!TextUtils.isEmpty(str3) && !str3.contains("http")) {
                    str5 = str5 + Marker.ANY_NON_NULL_MARKER + str3 + Marker.ANY_NON_NULL_MARKER + aVar.e();
                }
                arrayList2.add(str5);
            }
            if (arrayList2.isEmpty()) {
                arrayList2.add("分享链接解析失败$0");
            }
            for (int i = 0; i < listSingletonList.size(); i++) {
                arrayList3.add(TextUtils.join("#", arrayList2));
            }
            jVar.g(str);
            jVar.e(str);
            jVar.i("");
            jVar.h(m2107i(((a) arrayList.get(0)).c()));
            jVar.k(TextUtils.join("$$$", arrayList3));
            jVar.j(TextUtils.join("$$$", listSingletonList));
        } catch (Exception unused) {
        }
        return jVar;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m2119p() {
        return !TextUtils.isEmpty(C0921c0.m2234q(".baidu"));
    }

    /* JADX INFO: renamed from: q */
    public final String m2120q(String[] strArr) {
        try {
            if (!m2119p()) {
                C0895E.m2152b("未登录, 请去配置中心设置");
                return g.n("未登录, 请去配置中心设置");
            }
            this.f2025a = strArr[0];
            e<String> eVarM2115h = m2115h(strArr[1]);
            if (eVarM2115h.b() != 0) {
                return g.n(eVarM2115h.d());
            }
            String str = (String) eVarM2115h.c();
            SpiderDebug.log("downloadUrl: " + str);
            Map<String, String> mapM2106f = m2106f();
            ((HashMap) mapM2106f).put("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
            if (C0898H.m2164b(5).booleanValue()) {
                String strM2166d = C0898H.m2166d(str, 12, 400);
                if (strArr.length <= 3) {
                    g gVarE = g.e();
                    gVarE.y(strM2166d);
                    gVarE.j();
                    gVarE.f(mapM2106f);
                    return gVarE.o();
                }
                String str2 = Proxy.getUrl() + "?do=danmu&vodName=" + strArr[2] + "&vodIndex=" + strArr[3] + "&vodUrl=";
                g gVarE2 = g.e();
                gVarE2.y(strM2166d);
                gVarE2.a(str2);
                gVarE2.j();
                gVarE2.f(mapM2106f);
                return gVarE2.o();
            }
            if (TextUtils.isEmpty(C0898H.m2169g())) {
                return "";
            }
            if (strArr.length <= 2) {
                g gVarE3 = g.e();
                gVarE3.y(C0898H.m2167e(str));
                gVarE3.j();
                gVarE3.f(mapM2106f);
                return gVarE3.o();
            }
            String str3 = Proxy.getUrl() + "?do=danmu&vodName=" + strArr[1] + "&vodIndex=" + strArr[2] + "&vodUrl=";
            g gVarE4 = g.e();
            gVarE4.y(C0898H.m2167e(str));
            gVarE4.a(str3);
            gVarE4.j();
            gVarE4.f(mapM2106f);
            return gVarE4.o();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
