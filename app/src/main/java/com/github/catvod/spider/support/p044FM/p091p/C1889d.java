package com.github.catvod.spider.support.p044FM.p091p;

import android.text.TextUtils;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p091p.d */
/* JADX INFO: loaded from: classes.dex */
final class C1889d {

    /* JADX INFO: renamed from: a */
    private String f4351a;

    /* JADX INFO: renamed from: b */
    private Object f4352b;

    /* JADX INFO: renamed from: c */
    private final Map<String, String> f4353c;

    /* JADX INFO: renamed from: d */
    private final Map<String, String> f4354d;

    /* JADX INFO: renamed from: e */
    private final AbstractC1888c f4355e;

    /* JADX INFO: renamed from: f */
    private Request f4356f;

    /* JADX INFO: renamed from: g */
    private Request.Builder f4357g;

    C1889d(String str, String str2, String str3, Map<String, String> map, AbstractC1888c abstractC1888c) {
        this(str, str2, str3, null, map, abstractC1888c);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    private C1889d(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, AbstractC1888c abstractC1888c) {
        byte b;
        RequestBody requestBodyBuild;
        this.f4352b = null;
        this.f4351a = str2;
        this.f4353c = map;
        this.f4354d = map2;
        this.f4355e = abstractC1888c;
        this.f4357g = new Request.Builder();
        int iHashCode = str.hashCode();
        if (iHashCode != 70454) {
            if (iHashCode == 2461856 && str.equals("POST")) {
                b = 1;
            } else {
                b = -1;
            }
        } else if (str.equals("GET")) {
            b = 0;
        } else {
            b = -1;
        }
        if (b != 0) {
            if (b == 1) {
                Request.Builder builder = this.f4357g;
                if (TextUtils.isEmpty(str3)) {
                    FormBody.Builder builder2 = new FormBody.Builder();
                    if (map != null) {
                        for (String str4 : map.keySet()) {
                            builder2.add(str4, this.f4353c.get(str4));
                        }
                    }
                    requestBodyBuild = builder2.build();
                } else {
                    requestBodyBuild = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), str3);
                }
                builder.post(requestBodyBuild);
            }
        } else if (map != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4351a);
            this.f4351a = C1434P.m3588a(new byte[]{37}, new byte[]{26, -65, 41, -57, 49, -9, -42, 31}, sb);
            for (String str5 : map.keySet()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.f4351a);
                sb2.append(str5);
                sb2.append("=");
                sb2.append(this.f4353c.get(str5));
                this.f4351a = C1434P.m3588a(new byte[]{111}, new byte[]{73, 35, 62, -107, 3, 92, -39, 116}, sb2);
            }
            String str6 = this.f4351a;
            this.f4351a = str6.substring(0, str6.length() - 1);
        }
        this.f4357g.url(this.f4351a);
        Object obj = this.f4352b;
        if (obj != null) {
            this.f4357g.tag(obj);
        }
        Map<String, String> map3 = this.f4354d;
        if (map3 != null) {
            for (String str7 : map3.keySet()) {
                this.f4357g.addHeader(str7, this.f4354d.get(str7));
            }
        }
        this.f4356f = this.f4357g.build();
    }

    C1889d(String str, String str2, Map<String, String> map, Map<String, String> map2, AbstractC1888c abstractC1888c) {
        this(str, str2, null, map, map2, abstractC1888c);
    }

    /* JADX INFO: renamed from: a */
    final void m4585a(OkHttpClient okHttpClient) {
        Call callNewCall = okHttpClient.newCall(this.f4356f);
        try {
            Response responseExecute = callNewCall.execute();
            AbstractC1888c abstractC1888c = this.f4355e;
            if (abstractC1888c != null) {
                abstractC1888c.m4583c(callNewCall, responseExecute);
            }
        } catch (IOException e) {
            AbstractC1888c abstractC1888c2 = this.f4355e;
            if (abstractC1888c2 != null) {
                abstractC1888c2.onError(callNewCall, e);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m4586b(Object obj) {
        this.f4352b = obj;
    }
}
