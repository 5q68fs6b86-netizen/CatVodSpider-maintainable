package com.github.catvod.spider.support.p044FM.p088m;

import com.github.catvod.crawler.Spider;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.m.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1840c {

    /* JADX INFO: renamed from: b */
    public static final String f4225b = "POST";

    /* JADX INFO: renamed from: c */
    public static final String f4226c = "GET";

    /* JADX INFO: renamed from: a */
    private OkHttpClient f4227a;

    /* JADX INFO: renamed from: a */
    public static OkHttpClient m4466a() {
        Dns dnsSafeDns;
        if (C1839b.f4224a.f4227a != null) {
            return C1839b.f4224a.f4227a;
        }
        C1840c c1840c = C1839b.f4224a;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        try {
            dnsSafeDns = Spider.safeDns();
            dnsSafeDns.getClass();
        } catch (Throwable unused) {
            dnsSafeDns = Dns.SYSTEM;
        }
        OkHttpClient.Builder builderDns = builder.dns(dnsSafeDns);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builderDns.connectTimeout(30L, timeUnit).readTimeout(30L, timeUnit).writeTimeout(30L, timeUnit).hostnameVerifier(new HostnameVerifier() { // from class: com.github.catvod.spider.support.FM.m.a
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                String str2 = C1840c.f4225b;
                return true;
            }
        }).sslSocketFactory(new C1844g(), C1844g.f4237d).build();
        c1840c.f4227a = okHttpClientBuild;
        return okHttpClientBuild;
    }

    /* JADX INFO: renamed from: b */
    public static C1842e m4467b(String str, Map<String, String> map) {
        return new C1841d(f4226c, str, (Map<String, String>) null, map).m4480a(m4466a());
    }

    /* JADX INFO: renamed from: c */
    public static String m4468c(String str, Map<String, String> map) {
        String str2;
        Map multimap = m4471f().newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute().headers().toMultimap();
        if (multimap != null) {
            if (!multimap.containsKey("location")) {
                str2 = multimap.containsKey("Location") ? "Location" : "location";
            }
            return (String) ((List) multimap.get(str2)).get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static Response m4469d(String str) {
        return m4466a().newCall(new Request.Builder().url(str).build()).execute();
    }

    /* JADX INFO: renamed from: e */
    public static Response m4470e(String str, Map<String, String> map) {
        return m4466a().newCall(new Request.Builder().url(str).headers(Headers.of(map)).build()).execute();
    }

    /* JADX INFO: renamed from: f */
    public static OkHttpClient m4471f() {
        return m4466a().newBuilder().followRedirects(false).followSslRedirects(false).build();
    }

    /* JADX INFO: renamed from: g */
    public static C1842e m4472g(String str, String str2, Map<String, String> map) {
        return new C1841d(f4225b, str, str2, map).m4480a(m4466a());
    }

    /* JADX INFO: renamed from: h */
    public static C1842e m4473h(String str, Map<String, String> map, Map<String, String> map2) {
        return new C1841d(f4225b, str, map, map2).m4480a(m4466a());
    }

    /* JADX INFO: renamed from: i */
    public static String m4474i(String str, Map<String, String> map) {
        return new C1841d(f4225b, str, map, (Map<String, String>) null).m4480a(m4466a()).m4481a();
    }

    /* JADX INFO: renamed from: j */
    public static Response m4475j(String str, String str2, Map<String, String> map) {
        OkHttpClient okHttpClientM4466a = m4466a();
        Request.Builder builderMethod = new Request.Builder().url(str).method(f4225b, RequestBody.create(MediaType.parse("application/x-www-form-urlencoded; charset=UTF-8"), str2));
        for (Map.Entry<String, String> entry : map.entrySet()) {
            builderMethod.addHeader(entry.getKey(), entry.getValue());
        }
        return okHttpClientM4466a.newCall(builderMethod.build()).execute();
    }

    /* JADX INFO: renamed from: k */
    public static Response m4476k(String str, String str2) {
        return m4466a().newCall(new Request.Builder().url(str).method(f4225b, RequestBody.create(MediaType.parse("text/plain"), str2)).addHeader("Content-Type", "text/plain").addHeader("Origin", "url").build()).execute();
    }

    /* JADX INFO: renamed from: l */
    public static C1842e m4477l(OkHttpClient okHttpClient, String str, Map map, Map map2) {
        return new C1841d(f4226c, str, (Map<String, String>) map, (Map<String, String>) map2).m4480a(okHttpClient);
    }

    /* JADX INFO: renamed from: m */
    public static String m4478m(String str) {
        return m4479n(str, null);
    }

    /* JADX INFO: renamed from: n */
    public static String m4479n(String str, Map<String, String> map) {
        return str.startsWith("http") ? new C1841d(f4226c, str, (Map<String, String>) null, map).m4480a(m4466a()).m4481a() : "";
    }
}
