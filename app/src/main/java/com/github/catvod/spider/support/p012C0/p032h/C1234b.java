package com.github.catvod.spider.support.p012C0.p032h;

import com.github.catvod.crawler.Spider;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.h.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1234b {

    /* JADX INFO: renamed from: a */
    private final OkHttpClient f2905a;

    public C1234b() {
        Dns dns;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        try {
            dns = (Dns) Spider.class.getMethod("safeDns", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            dns = Dns.SYSTEM;
        }
        OkHttpClient.Builder builderDns = builder.dns(dns);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient.Builder builderConnectTimeout = builderDns.readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).connectTimeout(30L, timeUnit);
        X509TrustManager x509TrustManager = C1239g.f2917b;
        OkHttpClient okHttpClientBuild = builderConnectTimeout.hostnameVerifier(new HostnameVerifier() { // from class: com.github.catvod.spider.support.C0.h.e
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                X509TrustManager x509TrustManager2 = C1239g.f2917b;
                return true;
            }
        }).sslSocketFactory(new C1239g(), C1239g.f2917b).build();
        this.f2905a = okHttpClientBuild;
        okHttpClientBuild.newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    /* JADX INFO: renamed from: a */
    public static Response m3045a(String str) {
        return C1233a.f2904a.f2905a.newCall(new Request.Builder().url(str).build()).execute();
    }

    /* JADX INFO: renamed from: b */
    public static Response m3046b(String str, Map<String, String> map) {
        return C1233a.f2904a.f2905a.newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute();
    }

    /* JADX INFO: renamed from: c */
    public static String m3047c(String str, Map<String, String> map, Map<String, String> map2) {
        return m3053i(C1233a.f2904a.f2905a, "POST", str, map, map2, null);
    }

    /* JADX INFO: renamed from: d */
    public static String m3048d(String str, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        return m3053i(C1233a.f2904a.f2905a, "POST", str, map, map2, map3);
    }

    /* JADX INFO: renamed from: e */
    public static String m3049e(Map map) {
        return m3053i(C1233a.f2904a.f2905a, "POST", "https://passport.aliyundrive.com/newlogin/qrcode/query.do?appName=aliyun_drive&fromSite=52&_bx-v=2.2.3", map, null, null);
    }

    /* JADX INFO: renamed from: f */
    public static C1236d m3050f(String str, String str2, Map<String, String> map) {
        return new C1235c(str, str2, map).m3054a(C1233a.f2904a.f2905a);
    }

    /* JADX INFO: renamed from: g */
    public static String m3051g(String str, Map<String, String> map) {
        return m3052h(str, map, null);
    }

    /* JADX INFO: renamed from: h */
    public static String m3052h(String str, Map<String, String> map, Map<String, List<String>> map2) {
        return m3053i(C1233a.f2904a.f2905a, "GET", str, null, map, map2);
    }

    /* JADX INFO: renamed from: i */
    public static String m3053i(OkHttpClient okHttpClient, String str, String str2, Map map, Map map2, Map map3) {
        C1235c c1235c = new C1235c(str, str2, map, map2, map3);
        c1235c.m3055b();
        return c1235c.m3054a(okHttpClient).m3056a();
    }
}
