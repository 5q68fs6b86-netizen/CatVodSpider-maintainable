package com.github.catvod.spider.support.p044FM.p090o;

import android.os.SystemClock;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.Proxy;
import com.github.catvod.spider.support.p044FM.p088m.C1840c;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import okhttp3.Response;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.o.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1871l {

    /* JADX INFO: renamed from: a */
    private static final String f4310a = "http://127.0.0.1:7777/";

    /* JADX INFO: renamed from: b */
    private static final String f4311b = "http://127.0.0.1:1314";

    /* JADX INFO: renamed from: a */
    public static String m4524a(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", str);
            return C1840c.m4472g("http://127.0.0.1:1314/api/decode", jSONObject.toString(), null).m4481a();
        } catch (Exception e) {
            SpiderDebug.log("DecodeByGo Exception:  " + e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static Boolean m4525b(int i) {
        int i2 = i <= 0 ? 1 : i;
        int i3 = 0;
        while (i3 < i2) {
            try {
                if ("ok".equals(C1840c.m4479n("http://127.0.0.1:1314/api/ping", null))) {
                    return Boolean.TRUE;
                }
            } catch (Exception e) {
                SpiderDebug.log("goVer Exception: " + e.getMessage());
            }
            i3++;
            if (i3 < i2) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException e2) {
                    SpiderDebug.log("Sleep interrupted: " + e2.getMessage());
                }
            }
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: renamed from: c */
    public static String m4526c(String str, int i, int i2) {
        return String.format(Locale.getDefault(), "%s?url=%s&thread=%d&chunk=%d&key=quark&type=quark", f4311b, URLEncoder.encode(str), Integer.valueOf(i), Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: d */
    public static String m4527d(String str) {
        return String.format(Locale.getDefault(), "%s?url=%s&thread=%d", f4310a, URLEncoder.encode(str), 10);
    }

    /* JADX INFO: renamed from: e */
    public static void m4528e() {
        boolean zIsEmpty = C1840c.m4479n(f4310a, null).isEmpty();
        if (zIsEmpty) {
            C1840c.m4478m("http://127.0.0.1:" + Proxy.getPort() + "/go");
        }
        if (zIsEmpty) {
            for (int i = 0; C1840c.m4479n(f4310a, null).isEmpty() && i < 3; i++) {
                SystemClock.sleep(20L);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m4529f() {
        try {
            m4528e();
            return new JSONObject(C1840c.m4479n("http://127.0.0.1:7777/version", null)).optString("version");
        } catch (Exception e) {
            SpiderDebug.log("goVer Exception:  " + e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: g */
    public static Object[] m4530g(String str, Map<String, String> map) {
        Response responseM4470e = C1840c.m4470e(str, map);
        HashMap map2 = new HashMap();
        for (String str2 : responseM4470e.headers().names()) {
            map2.put(str2, responseM4470e.headers().get(str2));
        }
        return new Object[]{206, "application/oct-stream", responseM4470e.body().byteStream(), map2};
    }
}
