package com.github.catvod.spider.support.p003AB.p007m;

import android.text.TextUtils;
import com.github.catvod.spider.support.p003AB.p005b.C0824H;
import com.github.catvod.spider.support.p003AB.p005b.C0853t;
import com.github.catvod.spider.support.p003AB.p009o.C0921c0;
import java.io.IOException;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p007m.d */
/* JADX INFO: loaded from: classes.dex */
final class C0870d {

    /* JADX INFO: renamed from: a */
    private final Map<String, String> f2044a;

    /* JADX INFO: renamed from: b */
    private final Map<String, String> f2045b;

    /* JADX INFO: renamed from: c */
    private final String f2046c;

    /* JADX INFO: renamed from: d */
    private final String f2047d;

    /* JADX INFO: renamed from: e */
    private Request f2048e;

    /* JADX INFO: renamed from: f */
    private String f2049f;

    C0870d(String str, String str2, String str3, Map<String, String> map) {
        this(str, str2, str3, null, map);
    }

    private C0870d(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2) {
        RequestBody requestBodyBuild;
        this.f2049f = str2;
        this.f2047d = str3;
        this.f2046c = str;
        this.f2045b = map;
        this.f2044a = map2;
        Request.Builder builder = new Request.Builder();
        if (str.equals("GET") && map != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f2049f);
            this.f2049f = C0853t.m2057b(new byte[]{53}, new byte[]{10, 68, -107, -78, 109, -127, 65, 88}, sb);
            for (String str4 : map.keySet()) {
                String str5 = this.f2049f;
                StringBuilder sbM1967a = C0824H.m1967a(str4);
                sbM1967a.append("=");
                sbM1967a.append(this.f2045b.get(str4));
                sbM1967a.append("&");
                this.f2049f = str5.concat(sbM1967a.toString());
            }
            this.f2049f = C0921c0.m2236s(this.f2049f);
        }
        if (this.f2046c.equals("POST")) {
            if (TextUtils.isEmpty(this.f2047d)) {
                FormBody.Builder builder2 = new FormBody.Builder();
                Map<String, String> map3 = this.f2045b;
                if (map3 != null) {
                    for (String str6 : map3.keySet()) {
                        builder2.add(str6, this.f2045b.get(str6));
                    }
                }
                requestBodyBuild = builder2.build();
            } else {
                requestBodyBuild = RequestBody.create(MediaType.get("application/json; charset=utf-8"), this.f2047d);
            }
            builder.post(requestBodyBuild);
        }
        Map<String, String> map4 = this.f2044a;
        if (map4 != null) {
            for (String str7 : map4.keySet()) {
                builder.addHeader(str7, this.f2044a.get(str7));
            }
        }
        this.f2048e = builder.url(this.f2049f).build();
    }

    C0870d(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        this(str, str2, null, map, map2);
    }

    /* JADX INFO: renamed from: a */
    public final C0871e m2133a(OkHttpClient okHttpClient) {
        try {
            Response responseExecute = okHttpClient.newCall(this.f2048e).execute();
            return new C0871e(responseExecute.code(), responseExecute.body().string(), responseExecute.headers().toMultimap());
        } catch (IOException unused) {
            return new C0871e();
        }
    }
}
