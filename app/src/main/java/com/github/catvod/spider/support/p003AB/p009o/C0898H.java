package com.github.catvod.spider.support.p003AB.p009o;

import android.os.SystemClock;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.p003AB.p007m.C0869c;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.H */
/* JADX INFO: loaded from: classes.dex */
public final class C0898H {

    /* JADX INFO: renamed from: a */
    private static final String f2115a = "http://127.0.0.1:7777/";

    /* JADX INFO: renamed from: b */
    private static final String f2116b = "http://127.0.0.1:7989";

    /* JADX INFO: renamed from: a */
    public static String m2163a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", str);
            return C0869c.m2127g("http://127.0.0.1:7989/api/decode", jSONObject.toString(), null).m2134a();
        } catch (Exception e) {
            SpiderDebug.log("DecodeByGo Exception:  " + e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m2164b(int i) {
        if (i <= 0) {
            i = 1;
        }
        int i2 = 0;
        while (i2 < i) {
            try {
                if ("ok".equals(C0869c.m2132l("http://127.0.0.1:7989/api/ping", null))) {
                    return Boolean.TRUE;
                }
            } catch (Exception e) {
                SpiderDebug.log("goVer Exception: " + e.getMessage());
            }
            i2++;
            if (i2 < i) {
                try {
                    Thread.sleep(3000L);
                } catch (InterruptedException e2) {
                    SpiderDebug.log("Sleep interrupted: " + e2.getMessage());
                }
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: c */
    public static String m2165c() {
        return f2116b;
    }

    /* JADX INFO: renamed from: d */
    public static String m2166d(String str, int i, int i2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        Pattern pattern = C0921c0.f2162a;
        return String.format(Locale.getDefault(), "%s?url=%s&thread=%d&chunk=%d&key=quark&type=quark&timestamp=%d&sign=%s", f2116b, URLEncoder.encode(str), Integer.valueOf(i), Integer.valueOf(i2), Long.valueOf(jCurrentTimeMillis), C0921c0.m2218a(String.format("%d%s", Long.valueOf(jCurrentTimeMillis), C0897G.m2161b("jarmd5"))).substring(0, 10));
    }

    /* JADX INFO: renamed from: e */
    public static String m2167e(String str) {
        return String.format(Locale.getDefault(), "%s?url=%s&thread=%d", f2115a, URLEncoder.encode(str), 10);
    }

    /* JADX INFO: renamed from: f */
    public static void m2168f() {
        boolean zIsEmpty = C0869c.m2132l(f2115a, null).isEmpty();
        if (zIsEmpty) {
            C0869c.m2131k("http://127.0.0.1:" + Proxy.getPort() + "/go");
        }
        if (zIsEmpty) {
            for (int i = 0; C0869c.m2132l(f2115a, null).isEmpty() && i < 3; i++) {
                SystemClock.sleep(20L);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m2169g() {
        try {
            m2168f();
            return new JSONObject(C0869c.m2132l("http://127.0.0.1:7777/version", null)).optString("version");
        } catch (Exception e) {
            SpiderDebug.log("goVer Exception:  " + e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: h */
    public static Object[] m2170h(String str, Map<String, String> map) {
        Response responseM2125e = C0869c.m2125e(str, map);
        HashMap map2 = new HashMap();
        for (String str2 : responseM2125e.headers().names()) {
            map2.put(str2, responseM2125e.headers().get(str2));
        }
        return new Object[]{206, "application/oct-stream", responseM2125e.body().byteStream(), map2};
    }
}
