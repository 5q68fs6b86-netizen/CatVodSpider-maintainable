package com.github.catvod.spider.support.p002A0;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.yi */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0771yi {

    /* JADX INFO: renamed from: b */
    public static OkHttpClient f1832b;

    /* JADX INFO: renamed from: a */
    public static final Object f1831a = new Object();

    /* JADX INFO: renamed from: c */
    public static final HashMap f1833c = new HashMap();

    /* JADX INFO: renamed from: d */
    public static OkHttpClient f1834d = null;

    /* JADX INFO: renamed from: e */
    public static void m1883e() {
        OkHttpClient okHttpClientM1884f = m1884f();
        if (okHttpClientM1884f != null) {
            for (Call call : okHttpClientM1884f.dispatcher().queuedCalls()) {
                if ("p_json_parse".equals(call.request().tag())) {
                    call.cancel();
                }
            }
            for (Call call2 : okHttpClientM1884f.dispatcher().runningCalls()) {
                if ("p_json_parse".equals(call2.request().tag())) {
                    call2.cancel();
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static OkHttpClient m1884f() {
        OkHttpClient okHttpClient;
        synchronized (f1831a) {
            try {
                if (f1832b == null) {
                    OkHttpClient.Builder builderCookieJar = new OkHttpClient.Builder().cookieJar(new C0372jo(21));
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    OkHttpClient.Builder builderRetryOnConnectionFailure = builderCookieJar.readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).connectTimeout(10L, timeUnit).retryOnConnectionFailure(true);
                    C0182cn c0182cn = abr.f536b;
                    f1832b = builderRetryOnConnectionFailure.sslSocketFactory(new abr(c0182cn), c0182cn).build();
                }
                okHttpClient = f1832b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return okHttpClient;
    }

    /* JADX INFO: renamed from: g */
    public static void m1885g(OkHttpClient okHttpClient, String str, HashMap map, AbstractC0763ya abstractC0763ya) {
        new C0210do("GET", str, null, null, map, abstractC0763ya).m1138f(okHttpClient);
    }

    /* JADX INFO: renamed from: h */
    public static String m1886h(AbstractMap abstractMap) {
        if (abstractMap.containsKey("location")) {
            return (String) ((List) abstractMap.get("location")).get(0);
        }
        if (abstractMap.containsKey("Location")) {
            return (String) ((List) abstractMap.get("Location")).get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public static void m1887i(OkHttpClient okHttpClient, String str, HashMap map, HashMap map2, AbstractC0743xh abstractC0743xh) {
        new C0210do("POST", str, null, map, map2, abstractC0743xh).m1138f(okHttpClient);
    }

    /* JADX INFO: renamed from: j */
    public static void m1888j(OkHttpClient okHttpClient, String str, String str2, HashMap map, AbstractC0743xh abstractC0743xh) {
        new C0210do("POST", str, str2, null, map, abstractC0743xh).m1138f(okHttpClient);
    }

    /* JADX INFO: renamed from: k */
    public static String m1889k(String str, HashMap map) {
        return m1891m(m1884f(), str, null, map, null);
    }

    /* JADX INFO: renamed from: l */
    public static String m1890l(String str, HashMap map, HashMap map2) {
        return m1891m(m1884f(), str, null, map, map2);
    }

    /* JADX INFO: renamed from: m */
    public static String m1891m(OkHttpClient okHttpClient, String str, String str2, HashMap map, AbstractMap abstractMap) {
        C0509oq c0509oq = new C0509oq(abstractMap);
        C0210do c0210do = new C0210do("GET", str, null, null, map, c0509oq);
        c0210do.f743b = str2;
        c0210do.m1138f(okHttpClient);
        return (String) c0509oq.getResult();
    }

    /* JADX INFO: renamed from: n */
    public static String m1892n(String str, HashMap map, AbstractMap abstractMap) {
        OkHttpClient okHttpClient;
        synchronized (f1831a) {
            try {
                if (f1834d == null) {
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    OkHttpClient.Builder builderRetryOnConnectionFailure = builder.readTimeout(10L, timeUnit).writeTimeout(10L, timeUnit).connectTimeout(10L, timeUnit).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(true);
                    C0182cn c0182cn = abr.f536b;
                    f1834d = builderRetryOnConnectionFailure.sslSocketFactory(new abr(c0182cn), c0182cn).build();
                }
                okHttpClient = f1834d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return m1891m(okHttpClient, str, null, map, abstractMap);
    }
}
