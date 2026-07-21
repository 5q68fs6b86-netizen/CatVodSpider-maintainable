package com.github.catvod.spider.support.p012C0.p036k;

import android.text.TextUtils;
import com.github.catvod.spider.support.p012C0.p023b.C1030n;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.k.d */
/* JADX INFO: loaded from: classes.dex */
final class C1251d {

    /* JADX INFO: renamed from: a */
    private String f2945a;

    /* JADX INFO: renamed from: b */
    private Object f2946b;

    /* JADX INFO: renamed from: c */
    private final Map<String, String> f2947c;

    /* JADX INFO: renamed from: d */
    private final Map<String, String> f2948d;

    /* JADX INFO: renamed from: e */
    private final AbstractC1250c f2949e;

    /* JADX INFO: renamed from: f */
    private Request f2950f;

    /* JADX INFO: renamed from: g */
    private Request.Builder f2951g;

    private C1251d(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, AbstractC1250c abstractC1250c) {
        RequestBody requestBodyBuild;
        this.f2946b = null;
        this.f2945a = str2;
        this.f2947c = map;
        this.f2948d = map2;
        this.f2949e = abstractC1250c;
        this.f2951g = new Request.Builder();
        if (str.equals("GET")) {
            if (map != null) {
                this.f2945a = C1030n.m2554b(new StringBuilder(), this.f2945a, "?");
                for (String str4 : map.keySet()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f2945a);
                    sb.append(str4);
                    sb.append("=");
                    this.f2945a = C1030n.m2554b(sb, this.f2947c.get(str4), "&");
                }
                String str5 = this.f2945a;
                this.f2945a = str5.substring(0, str5.length() - 1);
            }
        } else if (str.equals("POST")) {
            Request.Builder builder = this.f2951g;
            if (TextUtils.isEmpty(str3)) {
                FormBody.Builder builder2 = new FormBody.Builder();
                if (map != null) {
                    for (String str6 : map.keySet()) {
                        builder2.add(str6, this.f2947c.get(str6));
                    }
                }
                requestBodyBuild = builder2.build();
            } else {
                requestBodyBuild = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str3);
            }
            builder.post(requestBodyBuild);
        }
        this.f2951g.url(this.f2945a);
        Object obj = this.f2946b;
        if (obj != null) {
            this.f2951g.tag(obj);
        }
        Map<String, String> map3 = this.f2948d;
        if (map3 != null) {
            for (String str7 : map3.keySet()) {
                this.f2951g.addHeader(str7, this.f2948d.get(str7));
            }
        }
        this.f2950f = this.f2951g.build();
    }

    C1251d(String str, String str2, Map map, AbstractC1250c abstractC1250c) {
        this("POST", str, str2, null, map, abstractC1250c);
    }

    C1251d(String str, String str2, Map<String, String> map, Map<String, String> map2, AbstractC1250c abstractC1250c) {
        this(str, str2, null, map, map2, abstractC1250c);
    }

    /* JADX INFO: renamed from: a */
    final void m3118a(OkHttpClient okHttpClient) {
        Call callNewCall = okHttpClient.newCall(this.f2950f);
        try {
            Response responseExecute = callNewCall.execute();
            AbstractC1250c abstractC1250c = this.f2949e;
            if (abstractC1250c != null) {
                abstractC1250c.m3116a(callNewCall, responseExecute);
            }
        } catch (IOException e) {
            AbstractC1250c abstractC1250c2 = this.f2949e;
            if (abstractC1250c2 != null) {
                abstractC1250c2.onError(callNewCall, e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m3119b(Object obj) {
        this.f2946b = obj;
    }
}
