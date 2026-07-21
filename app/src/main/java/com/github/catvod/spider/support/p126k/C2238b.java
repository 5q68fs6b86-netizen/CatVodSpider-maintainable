package com.github.catvod.spider.support.p126k;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.support.p001A.C0107t;
import com.github.catvod.spider.support.p001A.C0108u;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p126k.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2238b {

    /* JADX INFO: renamed from: a */
    private OkHttpClient f5584a;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p126k.b$a */
    private static class a {

        /* JADX INFO: renamed from: a */
        static volatile C2238b f5585a = new C2238b();
    }

    /* JADX INFO: renamed from: a */
    public static String m6059a(String str, Map<String, String> map) {
        String str2 = m6060a().newBuilder().followRedirects(false).followSslRedirects(false).build().newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute().headers().get("Location");
        if (str2 == null) {
            return null;
        }
        return str2;
    }

    /* JADX INFO: renamed from: a */
    public static OkHttpClient m6060a() {
        if (a.f5585a.f5584a != null) {
            return a.f5585a.f5584a;
        }
        C2238b c2238b = a.f5585a;
        OkHttpClient.Builder builderDns = new OkHttpClient.Builder().addInterceptor(new C2241e()).dns(Spider.safeDns());
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builderDns.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).hostnameVerifier(new HostnameVerifier() { // from class: com.github.catvod.spider.support.p126k.a
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                return true;
            }
        }).sslSocketFactory(new C2242f(), C2242f.f5598d).build();
        c2238b.f5584a = okHttpClientBuild;
        return okHttpClientBuild;
    }

    /* JADX INFO: renamed from: b */
    public static C0108u m6061b(String str, byte[] bArr, HashMap map) {
        return new C0107t("POST", str, bArr, map).m866a(m6060a());
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if (r2.containsKey("Location") != false) goto L10;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String m6062b(String str, Map<String, String> map) {
        Map multimap = m6065e().newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute().headers().toMultimap();
        if (multimap != null) {
            String str2 = multimap.containsKey("location") ? "location" : "Location";
            return (String) ((List) multimap.get(str2)).get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static Response m6063c(String str) {
        return m6060a().newCall(new Request.Builder().url(str).build()).execute();
    }

    /* JADX INFO: renamed from: d */
    public static Response m6064d(String str, Map<String, String> map) {
        return m6060a().newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute();
    }

    /* JADX INFO: renamed from: e */
    public static OkHttpClient m6065e() {
        return m6060a().newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    /* JADX INFO: renamed from: f */
    public static C2240d m6066f(String str, String str2, Map<String, String> map) {
        return new C2239c(str, str2, map).m6074a(m6060a());
    }

    /* JADX INFO: renamed from: g */
    public static C2240d m6067g(String str, Map<String, String> map, Map<String, String> map2) {
        return new C2239c("POST", str, map, map2).m6074a(m6060a());
    }

    /* JADX INFO: renamed from: h */
    public static String m6068h(String str, String str2) {
        return m6066f(str, str2, null).m6076a();
    }

    /* JADX INFO: renamed from: h */
    public static String m6069h(String str, String str2, Map<String, String> map) {
        return m6066f(str, str2, map).m6076a();
    }

    /* JADX INFO: renamed from: i */
    public static String m6070i(Map map) {
        return new C2239c("POST", "https://passport.aliyundrive.com/newlogin/qrcode/query.do?appName=aliyun_drive&fromSite=52&_bx-v=2.2.3", (Map<String, String>) map, (Map<String, String>) null).m6074a(m6060a()).m6076a();
    }

    /* JADX INFO: renamed from: j */
    public static C2240d m6071j(OkHttpClient okHttpClient, String str, Map map, Map map2, Map map3) {
        C2239c c2239c = new C2239c(str, map, map2, map3);
        c2239c.m6075b();
        return c2239c.m6074a(okHttpClient);
    }

    /* JADX INFO: renamed from: k */
    public static String m6072k(String str) {
        return m6073l(str, null);
    }

    /* JADX INFO: renamed from: l */
    public static String m6073l(String str, Map<String, String> map) {
        return str.startsWith("http") ? new C2239c("GET", str, (Map<String, String>) null, map).m6074a(m6060a()).m6076a() : "";
    }
}
