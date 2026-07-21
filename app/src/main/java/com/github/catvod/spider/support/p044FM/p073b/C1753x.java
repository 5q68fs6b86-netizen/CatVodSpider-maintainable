package com.github.catvod.spider.support.p044FM.p073b;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.p044FM.p047C.C1305h;
import com.github.catvod.spider.support.p044FM.p071a.C1711a;
import com.github.catvod.spider.support.p044FM.p075c.C1763e;
import com.github.catvod.spider.support.p044FM.p075c.C1765g;
import com.github.catvod.spider.support.p044FM.p075c.C1768j;
import com.github.catvod.spider.support.p044FM.p081f.C1801a;
import com.github.catvod.spider.support.p044FM.p081f.C1802b;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import com.github.catvod.spider.support.p044FM.p090o.C1869j;
import com.github.catvod.spider.support.p044FM.p090o.C1871l;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p073b.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1753x {

    /* JADX INFO: renamed from: c */
    private static Bitmap f3856c;

    /* JADX INFO: renamed from: d */
    private static String f3857d;

    /* JADX INFO: renamed from: e */
    private static String f3858e = "/tvtmp";

    /* JADX INFO: renamed from: a */
    private String f3859a;

    /* JADX INFO: renamed from: b */
    private Map<String, Map<String, String>> f3860b = new HashMap();

    /* JADX INFO: renamed from: a */
    private C1763e<String> m4144a(String str, boolean z) {
        C1763e<String> c1763e = new C1763e<>();
        c1763e.m4181d(0);
        try {
            m4145b(true);
            String str2 = "https://pan.baidu.com/share/transfer?shareid=" + m4151m(this.f3859a, C1711a.m3992b(new byte[]{-89, -82, -67, -26, 124, 119, 28}, new byte[]{-44, -58, -36, -108, 25, 30, 120, 7})) + "&from=" + m4151m(this.f3859a, "uk") + "&sekey=" + m4151m(this.f3859a, "sekey") + "&ondup=newcopy&async=1&channel=chunlei&web=1&app_id=250528";
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            map.put("fsidlist", arrayList.toString());
            map.put("path", f3858e);
            JSONObject jSONObject = new JSONObject(C1840c.m4473h(str2, map, m4148f()).m4481a());
            if (jSONObject.optInt("errno") == 0) {
                String strOptString = jSONObject.optJSONObject("extra").optJSONArray("list").optJSONObject(0).optString("to");
                if (TextUtils.isEmpty(strOptString) && z) {
                    return m4144a(str, false);
                }
                c1763e.m4182e(strOptString);
            } else if (jSONObject.optInt("errno") == 2) {
                c1763e.m4183f(jSONObject.optString("show_msg"));
                if (jSONObject.optString("show_msg").equals("文件已存在")) {
                    c1763e.m4183f("不支持看自己的分享");
                }
                c1763e.m4181d(2);
            } else {
                c1763e.m4181d(jSONObject.optInt("errno"));
                c1763e.m4183f(jSONObject.optString("show_msg"));
            }
        } catch (Exception e) {
            c1763e.m4181d(500);
            c1763e.m4183f(e.getMessage());
            SpiderDebug.log("copy err" + e.getMessage());
        }
        return c1763e;
    }

    /* JADX INFO: renamed from: b */
    private boolean m4145b(boolean z) {
        try {
            m4152n();
            C1802b c1802bM4349e = C1802b.m4349e(C1840c.m4479n("https://pan.baidu.com/api/list?clienttype=0&app_id=250528&web=1&dp-logid=&order=time&desc=1&dir=" + f3858e + "&num=100&page=1", m4148f()));
            ArrayList arrayList = new ArrayList();
            if (c1802bM4349e.m4350a() == 0) {
                Iterator<C1801a> it = c1802bM4349e.m4351b().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().m4341c());
                }
            }
            if (!arrayList.isEmpty() && arrayList.size() >= 3) {
                HashMap map = new HashMap();
                map.put("filelist", new JSONArray((Collection) arrayList).toString());
                if (!TextUtils.isEmpty(new JSONObject(C1840c.m4473h("https://pan.baidu.com/api/filemanager?async=2&onnest=fail&opera=delete&bdstoken=", map, m4148f()).m4481a()).optString("taskid")) || !z) {
                    return true;
                }
                try {
                    return m4145b(false);
                } catch (Exception e) {
                    e = e;
                    C1751v.m4143c(new byte[]{80, 63, -89, 83, -56, 97, -94, -60, 70, 40, -15, 22}, new byte[]{52, 90, -53, 54, -68, 4, -126, -95}, new StringBuilder(), e);
                    return false;
                }
            }
            return true;
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: c */
    private void m4146c(String str, String str2, String str3, String str4, List<C1801a> list, String str5) {
        try {
            String str6 = "https://pan.baidu.com/share/list?is_from_web=true&sekey=" + str + "&uk=" + str2 + "&shareid=" + str3 + "&order=other&desc=1&showempty=0&view_mode=1&web=1&page=1&num=100&dir=" + URLEncoder.encode(str4) + "&t=0.6675001943649936&channel=chunlei&web=1&app_id=250528&bdstoken=";
            Map<String, String> mapM4148f = m4148f();
            ((HashMap) mapM4148f).put(C1711a.m3992b(new byte[]{-76, 53, 96, 66, 109, 25}, new byte[]{-9, 90, 15, 41, 4, 124, 17, 75}), "BDCLND=" + str);
            C1802b c1802bM4349e = C1802b.m4349e(C1840c.m4479n(str6, mapM4148f));
            if (c1802bM4349e.m4350a() == 0) {
                List<C1801a> listM4351b = c1802bM4349e.m4351b();
                ArrayList arrayList = new ArrayList();
                for (int size = listM4351b.size() - 1; size >= 0; size--) {
                    C1801a c1801a = listM4351b.get(size);
                    if (c1801a.m4345g()) {
                        c1801a.m4348j(str5);
                        list.add(c1801a);
                    } else if (c1801a.m4340b() == 1) {
                        arrayList.add(c1801a);
                    }
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    m4146c(str, str2, str3, listM4351b.get(size2).m4341c(), list, "");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: e */
    public static C1753x m4147e() {
        return C1752w.f3855a;
    }

    /* JADX INFO: renamed from: f */
    private Map<String, String> m4148f() {
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/134.0.0.0 Safari/537.36 Edg/134.0.0.0");
        map.put("Accept", "application/json;charset=UTF-8");
        if (!TextUtils.isEmpty(m4156g())) {
            map.put("Cookie", m4156g());
        }
        map.put("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        map.put("Referer", "https://pan.baidu.com");
        return map;
    }

    /* JADX INFO: renamed from: i */
    private String m4149i(String str) {
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
    public static boolean m4150k() {
        try {
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
            map.put("Referer", "https://pan.baidu.com/");
            JSONObject jSONObject = new JSONObject(C1840c.m4479n("https://passport.baidu.com/v2/api/getqrcode?lp=pc&qrloginfrom=pc", map));
            SpiderDebug.log(jSONObject.toString());
            String str = "https://" + jSONObject.optString("imgurl") + "&logPage=traceId%3Apc_loginv5_1742970205%2ClogPage%3Aloginv5";
            f3857d = jSONObject.optString("sign");
            byte[] bArrBytes = C1840c.m4469d(str).body().bytes();
            f3856c = BitmapFactory.decodeByteArray(bArrBytes, 0, bArrBytes.length);
            return !TextUtils.isEmpty(f3857d);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.String>>] */
    /* JADX INFO: renamed from: m */
    private String m4151m(String str, String str2) {
        try {
            return (String) ((Map) this.f3860b.get(str)).get(str2);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    /* JADX INFO: renamed from: n */
    private C1801a m4152n() {
        try {
            C1802b c1802bM4349e = C1802b.m4349e(C1840c.m4479n("https://pan.baidu.com/api/list?clienttype=0&app_id=250528&web=1&dp-logid=&order=time&desc=1&dir=%2F&num=100&page=1", m4148f()));
            if (c1802bM4349e.m4350a() == 0) {
                for (C1801a c1801a : c1802bM4349e.m4351b()) {
                    if (c1801a.m4341c().equals(f3858e)) {
                        return c1801a;
                    }
                }
            }
            String str = "https://pan.baidu.com/api/create?a=commit&bdstoken=" + new JSONObject(C1840c.m4479n("https://pan.baidu.com/api/gettemplatevariable?clienttype=0&app_id=250528&web=1&fields=[\"bdstoken\",\"token\",\"uk\",\"isdocuser\",\"servertime\"]", m4148f())).optJSONObject("result").optString("bdstoken") + "&clienttype=0&app_id=250528&web=1&dp-logid=";
            HashMap map = new HashMap();
            map.put("path", f3858e);
            map.put("isdir", "1");
            map.put("block_list", "[]");
            JSONObject jSONObject = new JSONObject(C1840c.m4473h(str, map, m4148f()).m4481a());
            C1801a c1801a2 = new C1801a();
            c1801a2.m4346h(jSONObject.optLong("fs_id"));
            c1801a2.m4347i(f3858e);
            return c1801a2;
        } catch (Exception e) {
            SpiderDebug.log(e);
            return null;
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /* JADX INFO: renamed from: r */
    private void m4153r(String str, String str2, String str3) {
        try {
            Map<String, String> map = this.f3860b.get(str);
            if (map == null) {
                map = new HashMap<>();
            }
            map.put(str2, str3);
            this.f3860b.put(str, map);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m4154s() {
        try {
            String str = "https://passport.baidu.com/channel/unicast?channel_id=" + f3857d;
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/117.0.0.0 Safari/537.36");
            map.put("Referer", "https://pan.baidu.com/");
            JSONObject jSONObject = new JSONObject(C1840c.m4479n(str, map));
            SpiderDebug.log(jSONObject.toString());
            if (jSONObject.optInt("errno") == 0) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("channel_v"));
                SpiderDebug.log(jSONObject2.toString());
                if (jSONObject2.optInt("status") == 0) {
                    String str2 = "https://passport.baidu.com/v3/login/main/qrbdusslogin?v=" + System.currentTimeMillis() + "&bduss=" + jSONObject2.optString("v");
                    new HashMap();
                    String str3 = "";
                    String str4 = "";
                    for (String str5 : C1840c.m4467b(str2, map).m4483c().get("set-cookie")) {
                        str4 = TextUtils.isEmpty(str4) ? str5.split(";")[0] : str4 + ";" + str5.split(";")[0];
                        if (str5.contains("BDUSS=")) {
                            str3 = str5.split(";")[0];
                        }
                    }
                    SpiderDebug.log("tempCookies: " + str4);
                    map.put("Cookie", str4);
                    for (String str6 : C1840c.m4477l(C1840c.m4471f(), C1840c.m4468c(C1840c.m4468c("https://pan.baidu.com/disk/main?from=homeFlow", map), map), new HashMap(), map).m4483c().get("set-cookie")) {
                        if (str6.contains("STOKEN=")) {
                            str3 = str3 + ";" + str6.split(";")[0];
                            break;
                        }
                    }
                    C1885z.m4580s(".baidu", str3);
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
    public final void m4155d(String str, String str2, List<C1801a> list) {
        try {
            String strM4159l = m4159l(str, str2);
            if (TextUtils.isEmpty(strM4159l)) {
                return;
            }
            char c = 5;
            char c2 = 0;
            int i = 8;
            char c3 = 6;
            int i2 = 7;
            m4153r(str, "sekey", strM4159l);
            Map<String, String> mapM4148f = m4148f();
            ((HashMap) mapM4148f).put("Cookie", "BDCLND=" + strM4159l);
            C1802b c1802bM4349e = C1802b.m4349e(C1840c.m4479n("https://pan.baidu.com/share/list?web=5&app_id=250528&desc=1&showempty=0&page=1&num=20&order=time&shorturl=" + str + "&root=1&view_mode=1&channel=chunlei&web=1&bdstoken=", mapM4148f));
            if (c1802bM4349e.m4350a() != 0) {
                C1869j.m4522b("");
                return;
            }
            m4153r(str, "shareid", c1802bM4349e.m4352c());
            m4153r(str, "uk", c1802bM4349e.m4353d());
            List<C1801a> listM4351b = c1802bM4349e.m4351b();
            int size = listM4351b.size() - 1;
            while (size >= 0) {
                C1801a c1801a = listM4351b.get(size);
                if (c1801a.m4345g()) {
                    list.add(c1801a);
                }
                if (c1801a.m4340b() == 1) {
                    byte[] bArr = new byte[2];
                    bArr[c2] = 98;
                    bArr[1] = 112;
                    byte[] bArr2 = new byte[i];
                    bArr2[c2] = 23;
                    bArr2[1] = 27;
                    bArr2[2] = -52;
                    bArr2[3] = 46;
                    bArr2[4] = 15;
                    bArr2[c] = -24;
                    bArr2[c3] = -92;
                    bArr2[i2] = -73;
                    String strM4151m = m4151m(str, C1711a.m3992b(bArr, bArr2));
                    byte[] bArr3 = new byte[i2];
                    bArr3[c2] = -128;
                    bArr3[1] = -24;
                    bArr3[2] = -65;
                    bArr3[3] = 3;
                    bArr3[4] = 59;
                    bArr3[c] = -100;
                    bArr3[c3] = -96;
                    byte[] bArr4 = new byte[i];
                    bArr4[c2] = -13;
                    bArr4[1] = -128;
                    bArr4[2] = -34;
                    bArr4[3] = 113;
                    bArr4[4] = 94;
                    bArr4[c] = -11;
                    bArr4[c3] = -60;
                    bArr4[7] = -67;
                    String strM4151m2 = m4151m(str, C1711a.m3992b(bArr3, bArr4));
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr5 = new byte[10];
                    bArr5[c2] = -85;
                    bArr5[1] = -79;
                    bArr5[2] = 57;
                    bArr5[3] = -70;
                    bArr5[4] = 45;
                    bArr5[c] = -89;
                    bArr5[c3] = 113;
                    bArr5[7] = -99;
                    bArr5[8] = -22;
                    bArr5[9] = -87;
                    byte[] bArr6 = new byte[8];
                    bArr6[c2] = -124;
                    bArr6[1] = -62;
                    bArr6[2] = 81;
                    bArr6[3] = -37;
                    bArr6[4] = 95;
                    bArr6[5] = -62;
                    bArr6[6] = 29;
                    bArr6[7] = -12;
                    sb.append(C1711a.m3992b(bArr5, bArr6));
                    sb.append(strM4151m2);
                    byte[] bArr7 = new byte[1];
                    bArr7[c2] = -73;
                    byte[] bArr8 = new byte[8];
                    bArr8[c2] = -102;
                    bArr8[1] = 85;
                    bArr8[2] = -106;
                    bArr8[3] = 71;
                    bArr8[4] = -86;
                    bArr8[5] = -6;
                    bArr8[6] = 6;
                    bArr8[7] = -31;
                    sb.append(C1711a.m3992b(bArr7, bArr8));
                    sb.append(c1801a.m4339a());
                    sb.append("/");
                    sb.append(c1801a.m4343e());
                    m4146c(strM4159l, strM4151m, strM4151m2, sb.toString(), list, c1801a.m4343e());
                }
                size--;
                i2 = 7;
                i = 8;
                c = 5;
                c2 = 0;
                c3 = 6;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g */
    public final String m4156g() {
        return C1885z.m4576o("baidu.txt");
    }

    /* JADX INFO: renamed from: h */
    public final C1763e<String> m4157h(String str) {
        C1763e<String> c1763e = new C1763e<>();
        try {
            c1763e = m4144a(str, true);
            if (c1763e.m4178a() == 0 && !C1305h.m3249c(c1763e.m4179b())) {
                String strM4179b = c1763e.m4179b();
                SpiderDebug.log("getDownLoadUrl copy res: " + strM4179b);
                String str2 = "https://pan.baidu.com/api/mediainfo?type=M3U8_FLV_264_480&path=" + URLEncoder.encode(strM4179b) + "&clienttype=80&origin=dlna";
                HashMap map = new HashMap();
                map.put("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
                map.put("Cookie", m4156g());
                JSONObject jSONObject = new JSONObject(C1840c.m4479n(str2, map));
                String strOptString = jSONObject.optJSONObject("info").optString("dlink");
                SpiderDebug.log("getDownLoadUrl dlink res: " + strOptString);
                if (TextUtils.isEmpty(strOptString)) {
                    c1763e.m4181d(jSONObject.optInt("errno"));
                    c1763e.m4182e("dlink 为空");
                }
                c1763e.m4182e(C1840c.m4468c(strOptString, map));
                return c1763e;
            }
            return c1763e;
        } catch (Exception e) {
            c1763e.m4181d(500);
            c1763e.m4182e(e.getMessage());
        }
    }

    /* JADX INFO: renamed from: j */
    public final Bitmap m4158j() {
        return f3856c;
    }

    /* JADX INFO: renamed from: l */
    public final String m4159l(String str, String str2) {
        try {
            String str3 = "https://pan.baidu.com/share/verify?t=" + System.currentTimeMillis() + "&surl=" + str + "&channel=chunlei&web=1&app_id=250528&bdstoken=";
            HashMap map = new HashMap();
            map.put("pwd", str2);
            JSONObject jSONObject = new JSONObject(C1840c.m4473h(str3, map, m4148f()).m4481a());
            if (jSONObject.optInt("errno") == 0) {
                return jSONObject.optString("randsk");
            }
            jSONObject.optInt("err_msg");
            C1869j.m4522b("");
            return "";
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: o */
    public final C1768j m4160o(String str, String str2, String str3) {
        C1768j c1768j = new C1768j();
        try {
            ArrayList arrayList = new ArrayList();
            m4155d(str, str2, arrayList);
            char c = 3;
            List listAsList = Arrays.asList("百度原画");
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                String string = "";
                if (!it.hasNext()) {
                    break;
                }
                C1801a c1801a = (C1801a) it.next();
                if (!TextUtils.isEmpty(c1801a.m4342d())) {
                    StringBuilder sb = new StringBuilder();
                    byte[] bArr = new byte[8];
                    bArr[0] = 41;
                    bArr[1] = -64;
                    bArr[2] = -84;
                    bArr[c] = -82;
                    bArr[4] = 48;
                    bArr[5] = 123;
                    bArr[6] = 0;
                    bArr[7] = -106;
                    sb.append(C1711a.m3992b(new byte[]{114}, bArr));
                    sb.append(c1801a.m4342d().trim());
                    byte[] bArr2 = new byte[8];
                    bArr2[0] = 46;
                    bArr2[1] = -34;
                    bArr2[2] = -16;
                    bArr2[c] = 31;
                    bArr2[4] = -83;
                    bArr2[5] = -49;
                    bArr2[6] = 59;
                    bArr2[7] = 45;
                    sb.append(C1711a.m3992b(new byte[]{115}, bArr2));
                    string = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string);
                sb2.append(c1801a.m4343e());
                sb2.append(c1801a.m4344f());
                byte[] bArr3 = new byte[8];
                bArr3[0] = -88;
                bArr3[1] = -102;
                bArr3[2] = 15;
                bArr3[c] = -71;
                bArr3[4] = -105;
                bArr3[5] = 99;
                bArr3[6] = 119;
                bArr3[7] = 80;
                sb2.append(C1711a.m3992b(new byte[]{-116}, bArr3));
                sb2.append(str);
                byte[] bArr4 = new byte[8];
                bArr4[0] = -47;
                bArr4[1] = -99;
                bArr4[2] = 116;
                bArr4[c] = -50;
                bArr4[4] = -1;
                bArr4[5] = -51;
                bArr4[6] = -94;
                bArr4[7] = 75;
                sb2.append(C1711a.m3992b(new byte[]{-6}, bArr4));
                sb2.append(c1801a.m4339a());
                String string2 = sb2.toString();
                if (!TextUtils.isEmpty(str3) && !str3.contains("http")) {
                    string2 = string2 + Marker.ANY_NON_NULL_MARKER + str3 + Marker.ANY_NON_NULL_MARKER + c1801a.m4343e();
                }
                arrayList2.add(string2);
                c = 3;
            }
            byte b = 16;
            if (arrayList2.isEmpty()) {
                arrayList2.add("分享链接解析失败$0");
            }
            int i = 0;
            while (i < listAsList.size()) {
                arrayList3.add(TextUtils.join(C1711a.m3992b(new byte[]{b}, new byte[]{51, 50, -91, 112, 82, -38, -23, -28}), arrayList2));
                i++;
                b = 16;
            }
            c1768j.m4221g(str);
            c1768j.m4219e(str);
            c1768j.m4223i("");
            c1768j.m4222h(m4149i(((C1801a) arrayList.get(0)).m4341c()));
            c1768j.m4225k(TextUtils.join("$$$", arrayList3));
            c1768j.m4224j(TextUtils.join("$$$", listAsList));
        } catch (Exception unused) {
        }
        return c1768j;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m4161p() {
        return !TextUtils.isEmpty(C1885z.m4576o("baidu.txt"));
    }

    /* JADX INFO: renamed from: q */
    public final String m4162q(String[] strArr) {
        try {
            if (!m4161p()) {
                C1869j.m4522b("还未登录百度账号,请前往【配置中心】登录");
                return C1765g.m4187n("还未登录百度账号,请前往【配置中心】登录");
            }
            this.f3859a = strArr[0];
            C1763e<String> c1763eM4157h = m4157h(strArr[1]);
            if (c1763eM4157h.m4178a() != 0) {
                return C1765g.m4187n(c1763eM4157h.m4180c());
            }
            String strM4179b = c1763eM4157h.m4179b();
            SpiderDebug.log("downloadUrl: " + strM4179b);
            Map<String, String> mapM4148f = m4148f();
            ((HashMap) mapM4148f).put("User-Agent", "netdisk;1.4.2;22021211RC;android-android;12;JSbridge4.4.0;jointBridge;1.1.0;");
            if (C1871l.m4525b(1).booleanValue()) {
                String strM4526c = C1871l.m4526c(strM4179b, 10, 500);
                if (strArr.length <= 3) {
                    C1765g c1765gM4185e = C1765g.m4185e();
                    c1765gM4185e.m4207x(strM4526c);
                    c1765gM4185e.m4201j();
                    c1765gM4185e.m4198f(mapM4148f);
                    return c1765gM4185e.m4205o();
                }
                String str = Proxy.getUrl() + "?do=appdanmu&vodName=" + strArr[2] + "&vodIndex=" + strArr[3] + "&vodUrl=";
                C1765g c1765gM4185e2 = C1765g.m4185e();
                c1765gM4185e2.m4207x(strM4526c);
                c1765gM4185e2.m4195a(str);
                c1765gM4185e2.m4201j();
                c1765gM4185e2.m4198f(mapM4148f);
                return c1765gM4185e2.m4205o();
            }
            if (TextUtils.isEmpty(C1871l.m4529f())) {
                return "";
            }
            if (strArr.length <= 2) {
                C1765g c1765gM4185e3 = C1765g.m4185e();
                c1765gM4185e3.m4207x(C1871l.m4527d(strM4179b));
                c1765gM4185e3.m4201j();
                c1765gM4185e3.m4198f(mapM4148f);
                return c1765gM4185e3.m4205o();
            }
            String str2 = Proxy.getUrl() + "?do=appdanmu&vodName=" + strArr[1] + "&vodIndex=" + strArr[2] + "&vodUrl=";
            C1765g c1765gM4185e4 = C1765g.m4185e();
            c1765gM4185e4.m4207x(C1871l.m4527d(strM4179b));
            c1765gM4185e4.m4195a(str2);
            c1765gM4185e4.m4201j();
            c1765gM4185e4.m4198f(mapM4148f);
            return c1765gM4185e4.m4205o();
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
