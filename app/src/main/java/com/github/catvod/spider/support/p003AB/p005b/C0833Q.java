package com.github.catvod.spider.support.p003AB.p005b;

import android.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.AB.c.g;
import com.github.catvod.spider.support.AB.c.j;
import com.github.catvod.spider.support.AB.k.a;
import com.github.catvod.spider.support.AB.k.c;
import com.github.catvod.spider.support.AB.k.e;
import com.github.catvod.spider.support.p003AB.p007m.C0869c;
import com.github.catvod.spider.support.p003AB.p007m.C0871e;
import com.github.catvod.spider.support.p003AB.p009o.C0895E;
import com.github.catvod.spider.support.p003AB.p009o.C0898H;
import com.github.catvod.spider.support.p003AB.p009o.C0899I;
import com.github.catvod.spider.support.p003AB.p009o.C0921c0;
import com.github.catvod.spider.support.p003AB.p009o.DialogInterfaceOnClickListenerC0906P;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.b.Q */
/* JADX INFO: loaded from: classes.dex */
public final class C0833Q {

    /* JADX INFO: renamed from: i */
    private static final String f1959i = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) uc-cloud-drive/1.8.5 Chrome/100.0.4896.160 Electron/18.3.5.16-b62cf9c50d Safari/537.36 Channel/ucpan_other_ch";

    /* JADX INFO: renamed from: j */
    private static Map<String, e> f1960j;

    /* JADX INFO: renamed from: a */
    private String f1961a;

    /* JADX INFO: renamed from: b */
    private JSONObject f1962b;

    /* JADX INFO: renamed from: c */
    private ScheduledExecutorService f1963c;

    /* JADX INFO: renamed from: d */
    private String f1964d;

    /* JADX INFO: renamed from: e */
    private e f1965e;

    /* JADX INFO: renamed from: f */
    private AlertDialog f1966f;

    /* JADX INFO: renamed from: g */
    private final Map<String, String> f1967g;

    /* JADX INFO: renamed from: h */
    String f1968h;

    C0833Q() {
        Init.checkPermission();
        new ArrayList();
        HashMap map = new HashMap();
        this.f1967g = map;
        map.put("4k", "4K");
        map.put("2k", "2K");
        map.put("super", "超清");
        map.put("high", "高清");
        map.put("low", "流畅");
        map.put("normal", "一般");
        f1960j = new HashMap();
        m2010E();
        SpiderDebug.log("UcYun Init");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public void m2009B() {
        try {
            this.f1968h = System.currentTimeMillis() + "";
            String str = "https://api.open.uc.cn/cas/ajax/getTokenForQrcodeLogin?__dt=641254&__t=" + this.f1968h;
            HashMap map = new HashMap();
            map.put("Accept", "application/json, text/plain, */*");
            map.put("Content-Type", "application/x-www-form-urlencoded");
            map.put("User-Agent", f1959i);
            map.put("Referer", "https://broccoli.uc.cn/");
            HashMap map2 = new HashMap();
            map2.put("client_id", "381");
            map2.put("v", "1.2");
            map2.put("request_id", this.f1968h);
            String strOptString = new JSONObject(C0869c.m2128h(str, map2, map).m2134a()).optJSONObject("data").optJSONObject("members").optString("token");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", "https://su.uc.cn/1_n0ZCv?uc_param_str=dsdnfrpfbivesscpgimibtbmnijblauputogpintnwktprchmt&token=" + strOptString + "&client_id=381&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix");
            jSONObject.put("token", strOptString);
            Init.run(new RunnableC0822F(this, jSONObject, 1));
        } catch (Exception e) {
            SpiderDebug.log("getQRCode e: " + e);
        }
    }

    /* JADX INFO: renamed from: E */
    private String m2010E() {
        return C0869c.m2122b("https://pc-api.uc.cn/1/clouddrive/file", m2039y()).m2134a();
    }

    /* JADX INFO: renamed from: G */
    private void m2011G(String str, String str2, String str3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("req_id", str);
            jSONObject.put("app_ver", "1.6.8");
            jSONObject.put("device_id", str2);
            jSONObject.put("device_brand", "vivo");
            jSONObject.put("platform", "tv");
            jSONObject.put("device_name", "V2238A");
            jSONObject.put("device_model", "V2238A");
            jSONObject.put("build_device", "V2238A");
            jSONObject.put("build_product", "V2238A");
            jSONObject.put("device_gpu", "Adreno (TM) 640");
            jSONObject.put("activity_rect", "{}");
            jSONObject.put("channel", "UCTVOFFICIALWEB");
            if (TextUtils.isEmpty(str3)) {
                jSONObject.put("refresh_token", this.f1962b.optString("refresh_token"));
            } else {
                jSONObject.put("code", str3);
            }
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Linux; U; Android 12; zh-cn; V2238A Build/V417IR) AppleWebKit/533.1 (KHTML, like Gecko) Mobile Safari/533.1");
            map.put("Content-Type", "application/json; charset=utf-8");
            JSONObject jSONObject2 = new JSONObject(C0869c.m2127g("http://api.extscreen.com/ucdrive/token", jSONObject.toString(), map).m2134a());
            if (jSONObject2.optInt("code") == 200) {
                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("data");
                jSONObjectOptJSONObject.put("start_time", System.currentTimeMillis() / 1000);
                jSONObjectOptJSONObject.put("device_id", str2);
                C0921c0.m2238u(".uctv", jSONObjectOptJSONObject.toString());
            }
        } catch (Exception e) {
            SpiderDebug.log("getRefreshTokenByTV e:" + e);
        }
    }

    /* JADX INFO: renamed from: H */
    private JSONObject m2012H(JSONObject jSONObject, String str, String str2, Map<String, Object> map) {
        String strF;
        try {
            if (jSONObject.getInt("code") == 32003) {
                C0895E.m2152b("夸克容量已经用完, 请手动删除");
                return null;
            }
            f1960j = new HashMap();
            if (!TextUtils.isEmpty(m2047N(str))) {
                m2016O(str);
                for (a aVar : this.f1965e.c()) {
                    String strB = aVar.b();
                    if (strB == str2 || (strB != null && strB.equals(str2))) {
                        strF = aVar.f();
                        map.put("stoken", this.f1965e.b().a());
                        map.put("fid_token_list", Collections.singletonList(strF));
                        return new JSONObject(m2015L("https://pc-api.uc.cn/1/clouddrive/share/sharepage/save?pr=ucpro&fr=pc&uc_param_str=&__t=" + System.currentTimeMillis(), map));
                    }
                }
                strF = "";
                map.put("stoken", this.f1965e.b().a());
                map.put("fid_token_list", Collections.singletonList(strF));
                return new JSONObject(m2015L("https://pc-api.uc.cn/1/clouddrive/share/sharepage/save?pr=ucpro&fr=pc&uc_param_str=&__t=" + System.currentTimeMillis(), map));
            }
            return null;
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /* JADX INFO: renamed from: I */
    private boolean m2013I() {
        try {
            JSONObject jSONObject = new JSONObject(C0869c.m2132l("https://pc-api.uc.cn/1/clouddrive/member?pr=UCBrowser&fr=pc&fetch_subscribe=true&_ch=home", m2039y()));
            if (!"200".equals(jSONObject.optString("status"))) {
                throw new Exception();
            }
            jSONObject.optJSONObject("data").optString("member_type");
            if (!TextUtils.isEmpty(C0921c0.m2234q(".uc"))) {
                return true;
            }
            C0921c0.m2238u(".uc", this.f1961a);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: J */
    private void m2014J(String str, a aVar, List<a> list) {
        if (this.f1965e.b() == null) {
            return;
        }
        String strB = aVar.b();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 1;
        while (true) {
            StringBuilder sb = new StringBuilder();
            C0855v.m2060a(new byte[]{40, -103, 16, 5, -119, -128, 49, 24, 48, -114, 73, 20, -118, -45, 48, 66, 35, -61, 7, 27, -43, -117, 49, 84, 44, -126, 17, 17, -98, -56, 119, 65, 37, -62, 23, 29, -101, -56, 123, 24, 51, -123, 5, 7, -97, -54, 127, 80, 37, -62, 0, 16, -114, -37, 119, 91, 127, -99, 22, 72, -81, -7, 92, 69, 47, -102, 23, 16, -120, -100, 120, 69, 125, -99, 7, 83, -118, -51, 122, 104, 41, -119, 89}, new byte[]{64, -19, 100, 117, -6, -70, 30, 55}, sb, str);
            sb.append("&stoken=");
            sb.append(URLEncoder.encode(this.f1965e.b().a()));
            C0855v.m2060a(new byte[]{43, -11, -95, -112, -6, -35, 63, 82, 105, -72}, new byte[]{13, -123, -59, -7, -120, -126, 89, 59}, sb, strB);
            sb.append("&force=0&_page=");
            sb.append(i);
            sb.append("&_size=");
            sb.append(100);
            String strM2037u = m2037u(C0853t.m2057b(new byte[]{115, -102, 124, 83, -86, 61, 108, 28, 55, -92, 116, 88, -69, 44, 57, 115, 115, -102, 124, 83, -86, 61, 108, 28, 38, -83, 123, 68, -69, 99, 52, 101, 10, -93, 127, 66, -67, 54, 91, 55, 58, -79, 123, 90, -29, 111, 34, 28, 38, -86, 104, 66, -29, 56, 109, 47, 48, -102, 110, 79, -82, 59, 62, 34, 38, -90, 54, 80, -73, 50, 97, 28, 59, -92, 119, 83, -28, 63, 119, 32}, new byte[]{85, -59, 26, 54, -34, 94, 4, 67}, sb));
            for (a aVar2 : ((c) C0852s.m2054a(strM2037u, c.class)).a().a()) {
                if (aVar2.h()) {
                    arrayList.add(aVar2);
                } else if ((aVar2.i() && aVar2.a() == 1) || (aVar2.i() && C0921c0.m2229l().contains(aVar2.d()))) {
                    if (!this.f1965e.b().b().equals(aVar.c())) {
                        aVar2.k(aVar.c());
                    }
                    arrayList2.add(aVar2);
                }
            }
            if (!arrayList2.isEmpty()) {
                list.addAll(arrayList2);
                arrayList2 = new ArrayList();
            }
            try {
                JSONObject jSONObject = new JSONObject(strM2037u).getJSONObject("metadata");
                int i2 = jSONObject.getInt("_total");
                int i3 = jSONObject.getInt("_count");
                if (i2 <= 100 || i * 100 == i2 || i3 != 100) {
                    break;
                } else {
                    i++;
                }
            } catch (Exception unused) {
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m2014J(str, (a) it.next(), list);
        }
    }

    /* JADX INFO: renamed from: L */
    private String m2015L(String str, Map<String, Object> map) {
        String str2 = "";
        C0871e c0871eM2127g = C0869c.m2127g(str, new JSONObject(map).toString(), m2039y());
        List<String> list = c0871eM2127g.m2136c().get("set-cookie");
        this.f1964d = this.f1961a;
        if (!(list == null) && list.size() > 0) {
            String str3 = this.f1964d;
            try {
                String str4 = list.get(0).split(";")[0];
                String str5 = str4.split("=")[0];
                String str6 = str4.split("=")[1];
                String[] strArrSplit = str3.split(";");
                String string = "";
                for (String str7 : strArrSplit) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(string);
                    sb.append(str7.indexOf(str5) > 0 ? str4 : str7 + ";");
                    string = sb.toString();
                }
                str2 = string.contains(str5) ? string : string + str4;
            } catch (Exception unused) {
            }
            this.f1964d = str2;
        }
        SpiderDebug.log("playCookie1: " + this.f1964d);
        return c0871eM2127g.m2134a();
    }

    /* JADX INFO: renamed from: O */
    private void m2016O(String str) {
        ArrayList arrayList = new ArrayList();
        a aVar = new a();
        aVar.j("");
        m2014J(str, aVar, arrayList);
        this.f1965e.d(arrayList);
    }

    /* JADX INFO: renamed from: P */
    private void m2017P(String str) {
        this.f1961a = str;
        C0921c0.m2238u(".uc", str);
        m2013I();
        m2018S();
    }

    /* JADX INFO: renamed from: S */
    private void m2018S() {
        ScheduledExecutorService scheduledExecutorService = this.f1963c;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        Init.run(new RunnableC0839f(this, 2));
    }

    /* JADX INFO: renamed from: a */
    public static void m2019a(C0833Q c0833q) {
        c0833q.m2018S();
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2020b(C0833Q c0833q, JSONObject jSONObject) {
        c0833q.getClass();
        String str = System.currentTimeMillis() + "";
        String strOptString = jSONObject.optString("client_id");
        String strOptString2 = jSONObject.optString("token");
        String strOptString3 = jSONObject.optString("device_id");
        String strM2218a = C0921c0.m2218a(strOptString3 + str);
        StringBuilder sb = new StringBuilder();
        C0855v.m2060a(new byte[]{-45, -23, 15, -124, -87, 17, -38, 90, -44, -19, 30, -102, -9, 74, -123, 28, -106, -7, 9, -99, -84, 78, -37, 0, -40, -77, 24, -102, -11, 68, -108, 0, -49, -11, 84, -105, -75, 79, -112, 74, -55, -8, 10, -85, -77, 79, -56}, new byte[]{-69, -99, 123, -12, -38, 43, -11, 117}, sb, strM2218a);
        C0855v.m2060a(new byte[]{103, 15, 50, 40, 16, -19, -34, 93, 53, 1, 58, 46, 27, -93, -117, 99, 49, 30, 14, 61, 16, -20, -112, 51, 111, 88, 127, 115, 83, -6, -56, 116, 40, 13, 52, 20, 28, -6, -112}, new byte[]{65, 110, 81, 75, 117, -98, -83, 2}, sb, strOptString3);
        C0855v.m2060a(new byte[]{-66, -57, -5, -29, 60, -3, -98, -41, -6, -47, -1, -5, 49, -93, -115, -31, -18, -52, -72, -27, 57, -1, -113, -18, -9, -47, -13, -88, 33, -24, -35, -20, -3, -43, -9, -10, 48, -63, -107, -23, -11, -58, -93, -61, 103, -84, -56, -80, -39, -123, -6, -16, 35, -9, -104, -19, -57, -50, -15, -15, 48, -14, -58, -34, -86, -111, -83, -83, 20, -72, -103, -3, -15, -49, -6, -54, 49, -5, -115, -31, -5, -58, -93, -61, 103, -84, -56, -80, -39, -123, -4, -32, 60, -14, -97, -41, -24, -47, -15, -15, 32, -3, -113, -75, -50, -111, -84, -90, 109, -33, -35, -20, -3, -43, -9, -10, 48, -63, -100, -8, -19, -98, -33, -15, 39, -5, -107, -25, -67, -111, -82, -67, 1, -45, -46, -83, -86, -109, -88, -95, 101, -72, -102, -21, -20, -54, -24, -4, 33, -25, -92, -6, -3, -64, -22, -88, 112, -87, -71, -83, -81, -25, -72, -10, 61, -1, -107, -26, -3, -49, -93, -64, 22, -54, -83, -57, -34, -27, -41, -42, 28, -33, -73, -33, -35, -31, -72, -10, 57, -9, -98, -26, -20, -4, -9, -15, 104}, new byte[]{-104, -93, -98, -107, 85, -98, -5, -120}, sb, strOptString);
        String strM2059b = C0854u.m2059b(new byte[]{-54, 69, -44, 118, 54, -67, 115, -51, -119, 66, -45, 112, 53, -77, 104, -46, -103, 83, -59, 96, 25, -84, 33, -56, -119, 88, -118}, new byte[]{-20, 54, -73, 25, 70, -40, 78, -93}, sb, strOptString2);
        String strM2219b = C0921c0.m2219b(String.format("GET&/oauth/code&%s&l3srvtd7p42l0d0x1u8d7yc8ye9kki4d", str));
        HashMap map = new HashMap();
        map.put("User-Agent", "Mozilla/5.0 (Linux; U; Android 12; zh-cn; V2238A Build/V417IR) AppleWebKit/533.1 (KHTML, like Gecko) Mobile Safari/533.1");
        map.put("x-pan-tm", str);
        map.put("host", "open-api-drive.uc.cn");
        map.put("x-pan-token", strM2219b);
        map.put("x-pan-client-id", strOptString);
        try {
            JSONObject jSONObject2 = new JSONObject(C0869c.m2132l(strM2059b, map));
            if (jSONObject2.optInt("status") == 0) {
                c0833q.m2011G(strM2218a, strOptString3, jSONObject2.optString("code"));
                c0833q.m2018S();
            }
        } catch (Exception e) {
            SpiderDebug.log("e1: " + e);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m2022d(C0833Q c0833q, String str) {
        c0833q.getClass();
        if (str.startsWith("http")) {
            str = C0869c.m2132l(str, null);
        }
        c0833q.m2017P(str);
    }

    /* JADX INFO: renamed from: e */
    public static void m2023e(C0833Q c0833q, EditText editText) {
        c0833q.getClass();
        String string = editText.getText().toString();
        c0833q.m2035s();
        Init.execute(new RunnableC0844k(c0833q, string, 1));
    }

    /* JADX INFO: renamed from: f */
    public static void m2024f(C0833Q c0833q) {
        c0833q.m2035s();
        Init.execute(new RunnableC0835b(c0833q, 2));
    }

    /* JADX INFO: renamed from: g */
    public static void m2025g(C0833Q c0833q) {
        c0833q.m2018S();
    }

    /* JADX INFO: renamed from: i */
    public static void m2027i(C0833Q c0833q, JSONObject jSONObject) {
        c0833q.getClass();
        String strOptString = jSONObject.optString("token");
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        c0833q.f1963c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new RunnableC0841h(c0833q, strOptString, 2), 1L, 1L, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: j */
    public static void m2028j(final C0833Q c0833q, JSONObject jSONObject) {
        c0833q.getClass();
        try {
            int iA = com.github.catvod.spider.support.AB.J.a.a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C0899I.m2172b(jSONObject.optString("url"), iA));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterface.OnCancelListener(c0833q) { // from class: com.github.catvod.spider.support.AB.b.K

                /* JADX INFO: renamed from: a */
                public final C0833Q f1950a;

                {
                    this.f1950a = c0833q;
                }

                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    C0833Q.m2025g(this.f1950a);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener(c0833q) { // from class: com.github.catvod.spider.support.AB.b.M

                /* JADX INFO: renamed from: a */
                public final C0833Q f1952a;

                {
                    this.f1952a = c0833q;
                }

                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    C0833Q.m2019a(this.f1952a);
                }
            }).show();
            c0833q.f1966f = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            Init.execute(new RunnableC0843j(c0833q, jSONObject, 1));
            C0895E.m2152b("请使用UC App 扫描二维码");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m2029k(C0833Q c0833q, String str) {
        c0833q.getClass();
        HashMap map = new HashMap();
        map.put("client_id", "381");
        map.put("v", "1.2");
        map.put("request_id", c0833q.f1968h);
        map.put("token", str);
        try {
            JSONObject jSONObject = new JSONObject(C0869c.m2128h("https://api.open.uc.cn/cas/ajax/getServiceTicketByQrcodeToken?__dt=97123&_t=" + c0833q.f1968h, map, c0833q.m2039y()).m2134a());
            if ("ok".equals(jSONObject.optString("message"))) {
                String strOptString = jSONObject.optJSONObject("data").optJSONObject("members").optString("service_ticket");
                HashMap map2 = new HashMap();
                map2.put("Accept", "application/json, text/plain, */*");
                map2.put("Referer", "https://drive.uc.cn/");
                Iterator it = C0869c.m2125e("https://drive.uc.cn/account/info?st=" + strOptString, map2).headers("set-cookie").iterator();
                String str2 = "";
                while (it.hasNext()) {
                    str2 = str2 + ((String) it.next()).split(";")[0] + ";";
                }
                c0833q.m2017P(str2);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: l */
    public static void m2030l(C0833Q c0833q, JSONObject jSONObject) {
        c0833q.getClass();
        try {
            int iA = com.github.catvod.spider.support.AB.J.a.a(240);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iA, iA);
            ImageView imageView = new ImageView(Init.context());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageBitmap(C0899I.m2172b(jSONObject.optString("url"), iA));
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.gravity = 17;
            frameLayout.addView(imageView, layoutParams);
            AlertDialog alertDialogShow = new AlertDialog.Builder(Init.getActivity()).setView(frameLayout).setOnCancelListener(new DialogInterfaceOnCancelListenerC0818B(c0833q, 1)).setOnDismissListener(new DialogInterfaceOnDismissListenerC0821E(c0833q, 1)).show();
            c0833q.f1966f = alertDialogShow;
            alertDialogShow.getWindow().setBackgroundDrawable(new ColorDrawable(0));
            Init.execute(new RunnableC0830N(c0833q, jSONObject, 1));
            C0895E.m2152b("请使用UC App 扫描二维码");
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m2031m(C0833Q c0833q, JSONObject jSONObject) {
        c0833q.getClass();
        ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
        c0833q.f1963c = scheduledExecutorServiceNewScheduledThreadPool;
        scheduledExecutorServiceNewScheduledThreadPool.scheduleWithFixedDelay(new RunnableC0823G(c0833q, jSONObject, 1), 1L, 1L, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: n */
    private boolean m2032n(List list) {
        String strOptString = "";
        for (int i = 0; i < 3; i++) {
            try {
                HashMap map = new HashMap();
                map.put("filelist", list);
                map.put("exclude_fids", new ArrayList());
                map.put("action_type", 2);
                String strM2015L = m2015L("https://pc-api.uc.cn/1/clouddrive/file/delete?pr=UCBrowser&fr=pc", map);
                SpiderDebug.log("deleteResult:" + strM2015L);
                strOptString = new JSONObject(strM2015L).optJSONObject("data").optString("task_id");
                if (!TextUtils.isEmpty(strOptString)) {
                    break;
                }
            } catch (Exception e) {
                SpiderDebug.log("delete:" + e);
                return true;
            }
        }
        return !TextUtils.isEmpty(strOptString) || m2032n(list);
    }

    /* JADX INFO: renamed from: q */
    private String m2033q(String str, String str2, String str3, Boolean bool) {
        String strF;
        try {
            List listC = this.f1965e.c();
            if (listC == null || listC.size() == 0) {
                m2047N(str);
                m2016O(str);
                listC = this.f1965e.c();
            }
            if (listC == null || listC.size() <= 0) {
                strF = "";
                break;
            }
            Iterator it = listC.iterator();
            while (true) {
                if (!it.hasNext()) {
                    strF = "";
                    break;
                }
                a aVar = (a) it.next();
                if (C0817A.m1966a(aVar.b(), str2)) {
                    strF = aVar.f();
                    break;
                }
            }
            if (strF.isEmpty()) {
                return "";
            }
            String strM2038v = m2038v();
            HashMap map = new HashMap();
            map.put("scene", "link");
            map.put("pdir_fid", "0");
            map.put("pwd_id", str);
            map.put("stoken", this.f1965e.b().a());
            map.put("to_pdir_fid", strM2038v);
            map.put("fid_list", Collections.singletonList(str2));
            map.put("fid_token_list", Collections.singletonList(strF));
            JSONObject jSONObject = new JSONObject(m2015L("https://pc-api.uc.cn/1/clouddrive/share/sharepage/save?pr=UCBrowser&fr=pc&sys=win32&ve=1.5.2", map));
            if (jSONObject.getInt("code") == 41017) {
                return str2;
            }
            if (jSONObject.getInt("status") != 200 || jSONObject.getInt("code") != 0) {
                jSONObject = m2012H(jSONObject, str, str2, map);
                if (jSONObject == null) {
                    return "";
                }
                if (jSONObject.getInt("code") == 41017) {
                    return str2;
                }
                jSONObject.getInt("status");
            }
            String strOptString = jSONObject.optJSONObject("data").optString("task_id");
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < 5; i++) {
                jSONArray = new JSONObject(m2037u("https://pc-api.uc.cn/1/clouddrive/task?pr=UCBrowser&fr=pc&sys=win32&task_id=" + strOptString + "&retry_index=" + i + "1&__t=" + System.currentTimeMillis())).optJSONObject("data").optJSONObject("save_as").optJSONArray("save_as_top_fids");
                if (jSONArray.length() > 0) {
                    break;
                }
                TimeUnit.SECONDS.sleep(1L);
            }
            return (bool.booleanValue() && jSONArray.length() == 0) ? m2033q(str, str2, str3, Boolean.FALSE) : jSONArray.optString(0);
        } catch (Exception e) {
            SpiderDebug.log("uc copy e" + e);
            return "";
        }
    }

    /* JADX INFO: renamed from: r */
    private void m2034r(String str) {
        int i;
        List listSingletonList = Collections.singletonList(str);
        ArrayList arrayList = new ArrayList();
        try {
            String strM2038v = m2038v();
            if (strM2038v.equals("0")) {
                return;
            }
            m2042C();
            int i2 = 1;
            while (true) {
                JSONObject jSONObject = new JSONObject(m2037u(String.format("https://pc-api.uc.cn/1/clouddrive/file/sort?pr=UCBrowser&fr=pc&pdir_fid=%s&_page=%s&_size=%s&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,updated_at:desc", strM2038v, Integer.valueOf(i2), 100)));
                JSONArray jSONArray = jSONObject.getJSONObject("data").getJSONArray("list");
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    arrayList.add(jSONArray.getJSONObject(i3).getString("fid"));
                }
                JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
                if (jSONObject2.getInt("_size") != jSONObject2.getInt("_count") || jSONObject2.getInt("_count") == 0) {
                    break;
                } else {
                    i2++;
                }
            }
            if (arrayList.size() == 0) {
                return;
            }
            String str2 = (String) listSingletonList.get(0);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (C0817A.m1966a(str2, (String) it.next())) {
                    it.remove();
                }
            }
            int size = arrayList.size();
            double d = size;
            double d2 = 50;
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            Double.isNaN(d);
            Double.isNaN(d2);
            int iCeil = (int) Math.ceil(d / d2);
            for (i = 0; i < iCeil; i++) {
                int i4 = i * 50;
                m2032n(new ArrayList(arrayList.subList(i4, Math.min(i4 + 50, size))));
            }
        } catch (Exception e) {
            SpiderDebug.log("delete pdir list err:" + e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m2035s() {
        try {
            AlertDialog alertDialog = this.f1966f;
            if (alertDialog != null) {
                alertDialog.dismiss();
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: t */
    public static C0833Q m2036t() {
        return C0832P.f1958a;
    }

    /* JADX INFO: renamed from: u */
    private String m2037u(String str) {
        return C0869c.m2132l(str, m2039y());
    }

    /* JADX INFO: renamed from: v */
    private String m2038v() {
        String string;
        try {
            JSONArray jSONArray = new JSONObject(m2037u("https://pc-api.uc.cn/1/clouddrive/file/sort?pr=UCBrowser&fr=pc&pdir_fid=0&_page=1&_size=50&_fetch_total=1&_fetch_sub_dirs=0&_sort=file_type:asc,updated_at:desc")).getJSONObject("data").getJSONArray("list");
            int i = 0;
            while (true) {
                if (i >= jSONArray.length()) {
                    string = "";
                    break;
                }
                JSONObject jSONObject = (JSONObject) jSONArray.get(i);
                if (jSONObject.getBoolean("dir") && jSONObject.getString("file_name").equals("tvtemp")) {
                    string = jSONObject.getString("fid");
                    break;
                }
                i++;
            }
            if (!string.equals("")) {
                return string;
            }
            HashMap map = new HashMap();
            map.put("pdir_fid", "0");
            map.put("file_name", "tvtemp");
            map.put("dir_path", "");
            map.put("dir_init_lock", Boolean.FALSE);
            return new JSONObject(m2015L("https://pc-api.uc.cn/1/clouddrive/file?pr=UCBrowser&fr=pc", map)).getJSONObject("data").getString("fid");
        } catch (Exception e) {
            SpiderDebug.log("getCopyPdir ex: " + e);
            return "0";
        }
    }

    /* JADX INFO: renamed from: y */
    private Map<String, String> m2039y() {
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.f1961a)) {
            map.put("Cookie", this.f1961a);
        }
        map.put("Referer", "https://drive.uc.cn");
        map.put("User-Agent", f1959i);
        return map;
    }

    /* JADX INFO: renamed from: z */
    private Map<String, String> m2040z() {
        String str;
        HashMap map = new HashMap();
        if (TextUtils.isEmpty(this.f1964d)) {
            str = this.f1961a;
        } else {
            str = this.f1961a + ";" + this.f1964d;
        }
        map.put("Cookie", str);
        map.put("Referer", "https://drive.uc.cn/");
        map.put("User-Agent", f1959i);
        return map;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX INFO: renamed from: A */
    public final List<String> m2041A(String str, String str2, String str3, Boolean bool) {
        try {
            try {
                m2047N(str);
                String strM2033q = m2033q(str, str2, str3, Boolean.TRUE);
                HashMap map = new HashMap();
                map.put("fid", strM2033q);
                map.put("resolutions", "normal,low,high,super,2k,4k");
                map.put("supports", "fmp4,m3u8");
                JSONObject jSONObject = new JSONObject(m2015L("https://pc-api.uc.cn/1/clouddrive/file/v2/play?pr=UCBrowser&fr=pc", map));
                if (jSONObject.optString("message").contains("file not found")) {
                    ArrayList arrayList = new ArrayList();
                    if (!TextUtils.isEmpty(str)) {
                        m2034r(strM2033q);
                    }
                    return arrayList;
                }
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject("data").optJSONArray("video_list");
                ArrayList arrayList2 = new ArrayList();
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                    if (jSONObjectOptJSONObject.optBoolean("accessable")) {
                        arrayList2.add((String) this.f1967g.get(jSONObjectOptJSONObject.optString("resolution")));
                        arrayList2.add(jSONObjectOptJSONObject.optJSONObject("video_info").optString("url"));
                    }
                }
                List<String> listM2041A = arrayList2;
                if (bool.booleanValue() && arrayList2.size() == 0) {
                    listM2041A = arrayList2;
                    listM2041A = m2041A(str, strM2033q, str3, Boolean.FALSE);
                }
                listM2041A = arrayList2;
                if (!TextUtils.isEmpty(str)) {
                    m2034r(strM2033q);
                }
                return listM2041A;
            } catch (Exception e) {
                e.printStackTrace();
                ArrayList arrayList3 = new ArrayList();
                if (!TextUtils.isEmpty(str)) {
                    m2034r(str2);
                }
                return arrayList3;
            }
        } catch (Throwable th) {
            if (!TextUtils.isEmpty(str)) {
                m2034r(str2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: C */
    public final long m2042C() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    /* JADX INFO: renamed from: D */
    public final void m2043D() {
        try {
            Init.checkPermission();
            String str = System.currentTimeMillis() + "";
            String strM2218a = C0921c0.m2218a(str);
            String str2 = String.format("https://open-api-drive.uc.cn/oauth/authorize?req_id=%s&access_token=&app_ver=1.6.8&device_id=%s&device_brand=vivo&platform=tv&device_name=V2238A&device_model=V2238A&build_device=V2238A&build_product=V2238A&device_gpu=Adreno(TM)640&activity_rect=7D&channel=UCTVOFFICIALWEB&auth_type=code&client_id=%s7&scope=netdisk&qrcode=1&qr_width=460&qr_height=460", C0921c0.m2218a(strM2218a + str), strM2218a, "5acf882d27b74502b7040b0c65519aa7");
            String strM2219b = C0921c0.m2219b(String.format("GET&/oauth/authorize&%s&l3srvtd7p42l0d0x1u8d7yc8ye9kki4d", str));
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Linux; U; Android 12; zh-cn; V2238A Build/V417IR) AppleWebKit/533.1 (KHTML, like Gecko) Mobile Safari/533.1");
            map.put("x-pan-tm", str);
            map.put("x-pan-token", strM2219b);
            map.put("content-type", "text/plain;charset=UTF-8");
            map.put("x-pan-client-id", "5acf882d27b74502b7040b0c65519aa7");
            String string = new JSONObject(C0869c.m2132l(str2, map)).getString("query_token");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", "https://su.uc.cn/9_iCI3h?uc_param_str=&token=" + string + "&uc_biz_str=S%3Acustom%7CC%3Atitlebar_fix");
            jSONObject.put("token", string);
            jSONObject.put("device_id", strM2218a);
            jSONObject.put("client_id", "5acf882d27b74502b7040b0c65519aa7");
            Init.run(new RunnableC0830N(this, jSONObject, 0));
        } catch (Exception e) {
            SpiderDebug.log("getQRCode e: " + e);
        }
    }

    /* JADX INFO: renamed from: F */
    public final j m2044F(String str, String str2, String str3) {
        if (TextUtils.isEmpty(m2047N(str))) {
            return C0921c0.m2222e();
        }
        ArrayList arrayList = new ArrayList();
        a aVar = new a();
        aVar.j(str2);
        m2014J(str, aVar, arrayList);
        if (arrayList.size() < 1) {
            return C0921c0.m2222e();
        }
        this.f1965e.d(arrayList);
        List listAsList = Arrays.asList("UC原画", "UC普画");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String strM2057b = "";
            if (!it.hasNext()) {
                break;
            }
            a aVar2 = (a) it.next();
            if (aVar2.e() != null && !aVar2.e().isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                sb.append(aVar2.e().trim());
                strM2057b = C0853t.m2057b(new byte[]{-4}, new byte[]{-95, -109, -107, 53, -86, 26, 51, -66}, sb);
            }
            StringBuilder sbM1967a = C0824H.m1967a(strM2057b);
            sbM1967a.append(aVar2.c());
            sbM1967a.append(aVar2.g());
            C0855v.m2060a(new byte[]{8}, new byte[]{44, 64, -117, -79, 54, -98, -35, 127}, sbM1967a, str);
            sbM1967a.append(Marker.ANY_NON_NULL_MARKER);
            sbM1967a.append(aVar2.b());
            sbM1967a.append(Marker.ANY_NON_NULL_MARKER);
            sbM1967a.append(aVar2.f());
            String string = sbM1967a.toString();
            if (!TextUtils.isEmpty(str3) && !str3.contains("http")) {
                StringBuilder sbM1967a2 = C0824H.m1967a(string);
                C0855v.m2060a(new byte[]{30}, new byte[]{53, 78, -13, 97, 106, 43, 103, -111}, sbM1967a2, str3);
                sbM1967a2.append(Marker.ANY_NON_NULL_MARKER);
                sbM1967a2.append(aVar2.c());
                string = sbM1967a2.toString();
            }
            arrayList2.add(string);
        }
        for (int i = 0; i < listAsList.size(); i++) {
            arrayList3.add(TextUtils.join("#", arrayList2));
        }
        j jVar = new j();
        jVar.g(str);
        jVar.e(str);
        jVar.i("");
        jVar.h(this.f1965e.b() == null ? "获取视频名称失败" : this.f1965e.b().b());
        jVar.k(TextUtils.join("$$$", arrayList3));
        jVar.j(TextUtils.join("$$$", listAsList));
        jVar.b("UC网盘");
        return jVar;
    }

    /* JADX INFO: renamed from: K */
    public final String m2045K(String[] strArr, String str) {
        List<String> listM2041A;
        if (TextUtils.isEmpty(this.f1961a)) {
            m2050o();
        }
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(this.f1964d)) {
            map.put("Cookie", this.f1964d);
        }
        map.put("Referer", "https://drive.uc.cn");
        map.put("User-Agent", f1959i);
        if (str.split("#")[0].contains("原画")) {
            if (C0898H.m2164b(5).booleanValue()) {
                String strM2166d = C0898H.m2166d(m2052w(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : ""), 55, 100);
                if (strArr.length <= 4) {
                    g gVar = new g();
                    gVar.y(strM2166d);
                    gVar.j();
                    gVar.f(m2040z());
                    return gVar.toString();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(Proxy.getUrl());
                sb.append("?do=danmu&vodName=");
                sb.append(strArr[3]);
                sb.append("&vodIndex=");
                sb.append(strArr[4]);
                String strM2057b = C0853t.m2057b(new byte[]{104, -42, 43, -84, 110, 8, 69, 82}, new byte[]{78, -96, 68, -56, 59, 122, 41, 111}, sb);
                g gVar2 = new g();
                gVar2.y(strM2166d);
                gVar2.a(strM2057b);
                gVar2.j();
                gVar2.f(m2040z());
                return gVar2.toString();
            }
            if (!TextUtils.isEmpty(C0898H.m2169g())) {
                String strM2052w = m2052w(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "");
                if (strArr.length <= 4) {
                    g gVar3 = new g();
                    gVar3.y(C0898H.m2167e(strM2052w));
                    gVar3.j();
                    gVar3.f(m2040z());
                    return gVar3.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Proxy.getUrl());
                sb2.append("?do=danmu&vodName=");
                sb2.append(strArr[3]);
                sb2.append("&vodIndex=");
                sb2.append(strArr[4]);
                String strM2057b2 = C0853t.m2057b(new byte[]{48, 14, 91, 7, -52, -1, -39, -96}, new byte[]{22, 120, 52, 99, -103, -115, -75, -99}, sb2);
                g gVar4 = new g();
                gVar4.y(C0898H.m2167e(strM2052w));
                gVar4.a(strM2057b2);
                gVar4.j();
                gVar4.f(m2040z());
                return gVar4.toString();
            }
        }
        if (m2048Q()) {
            listM2041A = m2053x(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "");
            map.remove("Cookie");
            map.remove("Referer");
        } else {
            listM2041A = m2041A(strArr[0], strArr[1], strArr.length > 2 ? strArr[2] : "", Boolean.TRUE);
        }
        if (!C0898H.m2164b(5).booleanValue() || strArr.length <= 4) {
            g gVar5 = new g();
            gVar5.z(listM2041A);
            gVar5.j();
            gVar5.f(map);
            return gVar5.toString();
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Proxy.getUrl());
        sb3.append("?do=danmu&vodName=");
        sb3.append(strArr[3]);
        sb3.append("&vodIndex=");
        sb3.append(strArr[4]);
        String strM2057b3 = C0853t.m2057b(new byte[]{-71, 96, 48, -82, -60, 26, 66, -112}, new byte[]{-97, 22, 95, -54, -111, 104, 46, -83}, sb3);
        g gVar6 = new g();
        gVar6.z(listM2041A);
        gVar6.a(strM2057b3);
        gVar6.j();
        gVar6.f(map);
        return gVar6.toString();
    }

    /* JADX INFO: renamed from: M */
    public final Object[] m2046M(Map<String, String> map) {
        try {
            AlertDialog alertDialog = this.f1966f;
            if (alertDialog != null && alertDialog.isShowing()) {
                return null;
            }
            map.get("templateId");
            map.get("shareId");
            map.get("mediaId");
            map.get("fileId");
            String str = map.get("cate");
            map.get("tokenId");
            String str2 = map.get("url");
            if (!"down".equals(str)) {
                str2 = "";
            }
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            List listAsList = Arrays.asList("referer", "icy-metadata", "range", "connection", "accept-encoding", "user-agent", "cookie");
            for (String str3 : map.keySet()) {
                if (listAsList.contains(str3)) {
                    treeMap.put(str3, map.get(str3));
                }
            }
            return C0898H.m2170h(str2, treeMap);
        } catch (Exception unused) {
            return new Object[0];
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.AB.k.e>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.AB.k.e>] */
    /* JADX INFO: renamed from: N */
    public final String m2047N(String str) {
        e eVar = (e) f1960j.get(str);
        this.f1965e = eVar;
        if (eVar != null && eVar.a(str)) {
            SpiderDebug.log("uc shareToken:" + this.f1965e.toString());
        }
        e eVar2 = this.f1965e;
        if (eVar2 != null && eVar2.a(str)) {
            return this.f1965e.b().a();
        }
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("pwd_id", str);
        jsonObject.addProperty("passcode", "");
        String strM2134a = C0869c.m2127g("https://pc-api.uc.cn/1/clouddrive/share/sharepage/token?pr=UCBrowser&fr=pc", jsonObject.toString(), m2039y()).m2134a();
        StringBuilder sb = new StringBuilder();
        C0855v.m2060a(new byte[]{-102, 38, 18, -29, 21, 116, -109, -83, -68, 13, 97, -7, 17, 96, -124, -100, -96, 14, 87, -1, 43}, new byte[]{-49, 101, 50, -111, 112, 18, -31, -56}, sb, str);
        sb.append("]...");
        sb.append(strM2134a);
        SpiderDebug.log(sb.toString());
        try {
            e eVar3 = (e) new Gson().fromJson(strM2134a, e.class);
            this.f1965e = eVar3;
            eVar3.e(str);
            eVar3.f();
            f1960j.put(str, this.f1965e);
            if (this.f1965e.b() == null) {
                return "";
            }
            SpiderDebug.log("uc stToken:" + this.f1965e.b().a());
            return this.f1965e.b().a();
        } catch (Exception e) {
            SpiderDebug.log("refreshShareToken Uc:" + e);
            return "";
        }
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m2048Q() {
        try {
            JSONObject jSONObject = this.f1962b;
            if (jSONObject != null && jSONObject.optInt("status") == 0) {
                return true;
            }
            String strM2234q = C0921c0.m2234q(".uctv");
            if (TextUtils.isEmpty(strM2234q)) {
                throw new Exception("empty tvuc");
            }
            JSONObject jSONObject2 = new JSONObject(strM2234q);
            this.f1962b = jSONObject2;
            if ((jSONObject2.optLong("start_time") + this.f1962b.optLong("expires_in")) - (System.currentTimeMillis() / 1000) > 7200) {
                return true;
            }
            try {
                String str = System.currentTimeMillis() + "";
                String strOptString = this.f1962b.optString("device_id");
                m2011G(C0921c0.m2218a(strOptString + str), strOptString, "");
            } catch (Exception unused) {
            }
            return true;
        } catch (Exception e) {
            SpiderDebug.log("setTvObject e:" + e);
            return false;
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m2049R() {
        try {
            int iA = com.github.catvod.spider.support.AB.J.a.a(16);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            FrameLayout frameLayout = new FrameLayout(Init.context());
            layoutParams.setMargins(iA, iA, iA, iA);
            EditText editText = new EditText(Init.context());
            frameLayout.addView(editText, layoutParams);
            this.f1966f = new AlertDialog.Builder(Init.getActivity()).setTitle("请输入UC Cookie【支持字符串和Http】").setView(frameLayout).setNeutralButton("点我，使用UC APP扫码", new DialogInterface.OnClickListener(this) { // from class: com.github.catvod.spider.support.AB.b.L

                /* JADX INFO: renamed from: a */
                public final C0833Q f1951a;

                {
                    this.f1951a = this;
                }

                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    C0833Q.m2024f(this.f1951a);
                }
            }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC0906P(this, editText, 2)).show();
        } catch (Exception e) {
            e.printStackTrace();
            SpiderDebug.log("showInput2 ex: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m2050o() {
        try {
            try {
                String strM2234q = TextUtils.isEmpty(this.f1961a) ? C0921c0.m2234q(".uc") : this.f1961a;
                this.f1961a = strM2234q;
                if (TextUtils.isEmpty(strM2234q)) {
                    throw new Exception("empty cookie");
                }
                if (!m2013I()) {
                    throw new Exception("invalid cookie");
                }
                while (this.f1961a.isEmpty()) {
                    SystemClock.sleep(300L);
                }
            } catch (Exception e) {
                this.f1961a = "";
                C0921c0.m2238u(".uc", "");
                SystemClock.sleep(400L);
                SpiderDebug.log("checkCookie: " + e.getMessage());
                m2018S();
                Init.run(new RunnableC0831O(this, 0));
                while (this.f1961a.isEmpty()) {
                    SystemClock.sleep(300L);
                }
            }
        } catch (Throwable th) {
            while (this.f1961a.isEmpty()) {
                SystemClock.sleep(300L);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2051p() {
        this.f1961a = "";
        this.f1962b = null;
        C0921c0.m2221d(".uc");
        C0921c0.m2221d(".uctv");
    }

    /* JADX INFO: renamed from: w */
    public final String m2052w(String str, String str2, String str3) {
        try {
            String strM2010E = m2010E();
            m2047N(str);
            str2 = m2033q(str, str2, str3, Boolean.TRUE);
            if (TextUtils.isEmpty(str2)) {
                return "";
            }
            String str4 = "https://pc-api.uc.cn/1/clouddrive/file/download?pr=UCBrowser&fr=pc&sys=win32&ve=1.8.5&ut=" + strM2010E;
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            map.put("fids", arrayList);
            JSONObject jSONObject = new JSONObject(m2015L(str4, map));
            if (jSONObject.getInt("status") == 200 && jSONObject.getInt("code") == 0) {
                return jSONObject.optJSONArray("data").optJSONObject(0).optString("download_url");
            }
            return "";
        } catch (Exception unused) {
            return "";
        } finally {
            if (!TextUtils.isEmpty(str)) {
                m2034r(str2);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX INFO: renamed from: x */
    public final List<String> m2053x(String str, String str2, String str3) {
        try {
            m2047N(str);
            String strM2033q = m2033q(str, str2, str3, Boolean.TRUE);
            if (TextUtils.isEmpty(strM2033q)) {
                return new ArrayList();
            }
            String str4 = System.currentTimeMillis() + "";
            String strOptString = this.f1962b.optString("device_id");
            String strM2218a = C0921c0.m2218a(strOptString + str4);
            String strOptString2 = this.f1962b.optString("access_token");
            String strM2219b = C0921c0.m2219b(String.format("GET&/file&%s&l3srvtd7p42l0d0x1u8d7yc8ye9kki4d", str4));
            String str5 = "https://open-api-drive.uc.cn/file?req_id=" + strM2218a + "&access_token=" + strOptString2 + "&app_ver=1.6.8&device_id=" + strOptString + "&device_brand=vivo&platform=tv&device_name=V2238A&device_model=V2238A&build_device=V2238A&build_product=V2238A&device_gpu=Adreno%20(TM)%20640&activity_rect=%7B%7D&channel=UCTVOFFICIALWEB&method=streaming&group_by=source&fid=" + strM2033q + "&resolution=low,normal,high,super,2k,4k&support=dolby_vision";
            HashMap map = new HashMap();
            map.put("User-Agent", "Mozilla/5.0 (Linux; U; Android 12; zh-cn; V2238A Build/V417IR) AppleWebKit/533.1 (KHTML, like Gecko) Mobile Safari/533.1");
            map.put("x-pan-tm", str4);
            map.put("x-pan-token", strM2219b);
            map.put("content-type", "text/plain;charset=UTF-8");
            map.put("x-pan-client-id", "5acf882d27b74502b7040b0c65519aa7");
            JSONObject jSONObject = new JSONObject(C0869c.m2132l(str5, map));
            if (jSONObject.optInt("status") != 0) {
                return new ArrayList();
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONObject("data").optJSONArray("video_info");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject.optInt("accessable") == 1) {
                    arrayList.add((String) this.f1967g.get(jSONObjectOptJSONObject.optString("resolution")));
                    arrayList.add(jSONObjectOptJSONObject.optString("url"));
                }
            }
            return arrayList;
        } catch (Exception unused) {
            return new ArrayList();
        }
    }
}
