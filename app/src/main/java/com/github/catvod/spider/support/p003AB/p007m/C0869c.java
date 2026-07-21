package com.github.catvod.spider.support.p003AB.p007m;

import com.github.catvod.crawler.Spider;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.m.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0869c {

    /* JADX INFO: renamed from: b */
    public static final String f2041b = "POST";

    /* JADX INFO: renamed from: c */
    public static final String f2042c = "GET";

    /* JADX INFO: renamed from: a */
    private OkHttpClient f2043a;

    /* JADX INFO: renamed from: a */
    public static OkHttpClient m2121a() {
        Dns dnsSafeDns;
        if (C0868b.f2040a.f2043a != null) {
            return C0868b.f2040a.f2043a;
        }
        C0869c c0869c = C0868b.f2040a;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        try {
            dnsSafeDns = Spider.safeDns();
            dnsSafeDns.getClass();
        } catch (Throwable unused) {
            dnsSafeDns = Dns.SYSTEM;
        }
        OkHttpClient.Builder builderDns = builder.dns(dnsSafeDns);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builderDns.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).hostnameVerifier(new HostnameVerifier() { // from class: com.github.catvod.spider.support.AB.m.a
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                String str2 = C0869c.f2041b;
                return true;
            }
        }).sslSocketFactory(new C0873g(), C0873g.f2053d).build();
        c0869c.f2043a = okHttpClientBuild;
        return okHttpClientBuild;
    }

    /* JADX INFO: renamed from: b */
    public static C0871e m2122b(String str, Map<String, String> map) {
        return new C0870d(f2042c, str, (Map<String, String>) null, map).m2133a(m2121a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003b, code lost:
    
        if (r2.containsKey("Location") != false) goto L10;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m2123c(String str, Map<String, String> map) {
        Map multimap = m2126f().newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute().headers().toMultimap();
        if (multimap != null) {
            String str2 = multimap.containsKey("location") ? "location" : "Location";
            return (String) ((List) multimap.get(str2)).get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Response m2124d(String str) {
        return m2121a().newCall(new Request.Builder().url(str).build()).execute();
    }

    /* JADX INFO: renamed from: e */
    public static Response m2125e(String str, Map<String, String> map) {
        return m2121a().newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute();
    }

    /* JADX INFO: renamed from: f */
    public static OkHttpClient m2126f() {
        return m2121a().newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    /* JADX INFO: renamed from: g */
    public static C0871e m2127g(String str, String str2, Map<String, String> map) {
        return new C0870d(f2041b, str, str2, map).m2133a(m2121a());
    }

    /* JADX INFO: renamed from: h */
    public static C0871e m2128h(String str, Map<String, String> map, Map<String, String> map2) {
        return new C0870d(f2041b, str, map, map2).m2133a(m2121a());
    }

    /* JADX INFO: renamed from: i */
    public static String m2129i(String str, Map<String, String> map) {
        return new C0870d(f2041b, str, map, (Map<String, String>) null).m2133a(m2121a()).m2134a();
    }

    /* JADX INFO: renamed from: j */
    public static C0871e m2130j(OkHttpClient okHttpClient, String str, Map map, Map map2) {
        return new C0870d(f2042c, str, (Map<String, String>) map, (Map<String, String>) map2).m2133a(okHttpClient);
    }

    /* JADX INFO: renamed from: k */
    public static String m2131k(String str) {
        return m2132l(str, null);
    }

    /* JADX INFO: renamed from: l */
    public static String m2132l(String str, Map<String, String> map) {
        return str.startsWith("http") ? new C0870d(f2042c, str, (Map<String, String>) null, map).m2133a(m2121a()).m2134a() : "";
    }
}
