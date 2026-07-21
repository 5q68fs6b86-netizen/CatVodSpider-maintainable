package com.github.catvod.spider.support.p044FM.p091p;

import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.OkHttpClient;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p091p.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1891f {

    /* JADX INFO: renamed from: a */
    public static final String f4359a = "GET";

    /* JADX INFO: renamed from: b */
    public static final String f4360b = "POST";

    /* JADX INFO: renamed from: c */
    private static final Object f4361c = new Object();

    /* JADX INFO: renamed from: d */
    private static OkHttpClient f4362d = null;

    /* JADX INFO: renamed from: a */
    public static void m4587a(Object obj) {
        OkHttpClient okHttpClientM4588b = m4588b();
        if (okHttpClientM4588b == null || obj == null) {
            return;
        }
        for (Call call : okHttpClientM4588b.dispatcher().queuedCalls()) {
            if (obj.equals(call.request().tag())) {
                call.cancel();
            }
        }
        for (Call call2 : okHttpClientM4588b.dispatcher().runningCalls()) {
            if (obj.equals(call2.request().tag())) {
                call2.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static OkHttpClient m4588b() {
        OkHttpClient okHttpClient;
        synchronized (f4361c) {
            if (f4362d == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                OkHttpClient.Builder builderRetryOnConnectionFailure = builder.readTimeout(15L, timeUnit).writeTimeout(15L, timeUnit).connectTimeout(15L, timeUnit).retryOnConnectionFailure(true);
                X509TrustManager x509TrustManager = C1893h.f4365d;
                f4362d = builderRetryOnConnectionFailure.sslSocketFactory(new C1893h(x509TrustManager), x509TrustManager).build();
            }
            okHttpClient = f4362d;
        }
        return okHttpClient;
    }

    /* JADX INFO: renamed from: c */
    public static void m4589c(OkHttpClient okHttpClient, String str, Map map, AbstractC1888c abstractC1888c) {
        new C1889d(f4359a, str, (Map<String, String>) null, (Map<String, String>) map, abstractC1888c).m4585a(okHttpClient);
    }

    /* JADX INFO: renamed from: d */
    public static void m4590d(OkHttpClient okHttpClient, String str, Map<String, String> map, Map<String, String> map2, AbstractC1888c abstractC1888c) {
        new C1889d(f4360b, str, map, map2, abstractC1888c).m4585a(okHttpClient);
    }

    /* JADX INFO: renamed from: e */
    public static void m4591e(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, AbstractC1888c abstractC1888c) {
        new C1889d(f4360b, str, str2, map, abstractC1888c).m4585a(okHttpClient);
    }

    /* JADX INFO: renamed from: f */
    public static String m4592f(String str, Map<String, String> map) {
        return m4593g(m4588b(), str, null, map, null);
    }

    /* JADX INFO: renamed from: g */
    public static String m4593g(OkHttpClient okHttpClient, String str, String str2, Map map, Map map2) {
        C1890e c1890e = new C1890e(map2);
        C1889d c1889d = new C1889d(f4359a, str, (Map<String, String>) null, (Map<String, String>) map, c1890e);
        c1889d.m4586b(str2);
        c1889d.m4585a(okHttpClient);
        return c1890e.getResult();
    }
}
