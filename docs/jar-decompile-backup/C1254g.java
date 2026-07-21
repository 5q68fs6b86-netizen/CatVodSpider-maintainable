package com.github.catvod.spider.support.p012C0.p036k;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Cookie;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p036k.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1254g {

    /* JADX INFO: renamed from: b */
    private static OkHttpClient f2954b;

    /* JADX INFO: renamed from: c */
    private static OkHttpClient f2955c;

    /* JADX INFO: renamed from: a */
    private static final Object f2953a = new Object();

    /* JADX INFO: renamed from: d */
    public static HashMap<String, List<Cookie>> f2956d = new HashMap<>();

    /* JADX INFO: renamed from: a */
    public static void m3120a() {
        OkHttpClient okHttpClientM3121b = m3121b();
        if (okHttpClientM3121b != null) {
            for (Call call : okHttpClientM3121b.dispatcher().queuedCalls()) {
                if ("p_json_parse".equals(call.request().tag())) {
                    call.cancel();
                }
            }
            for (Call call2 : okHttpClientM3121b.dispatcher().runningCalls()) {
                if ("p_json_parse".equals(call2.request().tag())) {
                    call2.cancel();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static OkHttpClient m3121b() {
        OkHttpClient okHttpClient;
        synchronized (f2953a) {
            if (f2954b == null) {
                OkHttpClient.Builder builderCookieJar = new OkHttpClient.Builder().cookieJar(new C1252e());
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder builderRetryOnConnectionFailure = builderCookieJar.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = C1256i.f2959d;
                f2954b = builderRetryOnConnectionFailure.sslSocketFactory(new C1256i(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = f2954b;
        }
        return okHttpClient;
    }

    /* JADX INFO: renamed from: c */
    public static void m3122c(OkHttpClient okHttpClient, String str, Map map, AbstractC1250c abstractC1250c) {
        new C1251d("GET", str, null, map, abstractC1250c).m3118a(okHttpClient);
    }

    /* JADX INFO: renamed from: d */
    public static String m3123d(Map<String, List<String>> map) {
        String str = "location";
        if (!map.containsKey("location")) {
            str = "Location";
            if (!map.containsKey("Location")) {
                return null;
            }
        }
        return map.get(str).get(0);
    }

    /* JADX INFO: renamed from: e */
    public static void m3124e(OkHttpClient okHttpClient, String str, Map<String, String> map, Map<String, String> map2, AbstractC1250c abstractC1250c) {
        new C1251d("POST", str, map, map2, abstractC1250c).m3118a(okHttpClient);
    }

    /* JADX INFO: renamed from: f */
    public static void m3125f(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, AbstractC1250c abstractC1250c) {
        new C1251d(str, str2, map, abstractC1250c).m3118a(okHttpClient);
    }

    /* JADX INFO: renamed from: g */
    public static String m3126g(String str, Map<String, String> map) {
        return m3128i(m3121b(), str, null, map, null);
    }

    /* JADX INFO: renamed from: h */
    public static String m3127h(String str, Map<String, String> map, Map<String, List<String>> map2) {
        return m3128i(m3121b(), str, null, map, map2);
    }

    /* JADX INFO: renamed from: i */
    public static String m3128i(OkHttpClient okHttpClient, String str, String str2, Map map, Map map2) {
        C1253f c1253f = new C1253f(map2);
        C1251d c1251d = new C1251d("GET", str, null, map, c1253f);
        c1251d.m3119b(str2);
        c1251d.m3118a(okHttpClient);
        return c1253f.getResult();
    }

    /* JADX INFO: renamed from: j */
    public static String m3129j(String str, Map<String, String> map, Map<String, List<String>> map2) {
        OkHttpClient okHttpClient;
        synchronized (f2953a) {
            if (f2955c == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder builderRetryOnConnectionFailure = builder.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).followRedirects(false).followSslRedirects(false).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = C1256i.f2959d;
                f2955c = builderRetryOnConnectionFailure.sslSocketFactory(new C1256i(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = f2955c;
        }
        return m3128i(okHttpClient, str, null, map, map2);
    }
}
