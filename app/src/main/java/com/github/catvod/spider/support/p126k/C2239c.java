package com.github.catvod.spider.support.p126k;

import android.text.TextUtils;
import com.github.catvod.spider.support.p117b.C2174h;
import com.github.catvod.spider.support.p128m.C2256I;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.k.c */
/* JADX INFO: loaded from: classes.dex */
final class C2239c {

    /* JADX INFO: renamed from: a */
    private final Map<String, String> f5586a;

    /* JADX INFO: renamed from: b */
    private final Map<String, String> f5587b;

    /* JADX INFO: renamed from: c */
    private final String f5588c;

    /* JADX INFO: renamed from: d */
    private final String f5589d;

    /* JADX INFO: renamed from: e */
    private Request f5590e;

    /* JADX INFO: renamed from: f */
    private String f5591f;

    /* JADX INFO: renamed from: g */
    private Object f5592g;

    private C2239c(String str, String str2, String str3, Map map, Map map2) {
        RequestBody requestBodyBuild;
        this.f5591f = str2;
        this.f5589d = str3;
        this.f5588c = str;
        this.f5587b = map;
        this.f5586a = map2;
        Request.Builder builder = new Request.Builder();
        if (str.equals("GET") && map != null) {
            this.f5591f = C2174h.m5657b(new StringBuilder(), this.f5591f, "?");
            for (String str4 : map.keySet()) {
                this.f5591f = this.f5591f.concat(str4 + "=" + this.f5587b.get(str4) + "&");
            }
            String strSubstring = this.f5591f;
            List<String> list = C2256I.f5633a;
            if (strSubstring != null && strSubstring.length() > 1) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            }
            this.f5591f = strSubstring;
        }
        if (this.f5588c.equals("POST")) {
            if (TextUtils.isEmpty(this.f5589d)) {
                FormBody.Builder builder2 = new FormBody.Builder();
                Map<String, String> map3 = this.f5587b;
                if (map3 != null) {
                    for (String str5 : map3.keySet()) {
                        builder2.add(str5, this.f5587b.get(str5));
                    }
                }
                requestBodyBuild = builder2.build();
            } else {
                requestBodyBuild = RequestBody.create(MediaType.get("application/json; charset=utf-8"), this.f5589d);
            }
            builder.post(requestBodyBuild);
        }
        Map<String, String> map4 = this.f5586a;
        if (map4 != null) {
            for (String str6 : map4.keySet()) {
                builder.addHeader(str6, this.f5586a.get(str6));
            }
        }
        Object obj = this.f5592g;
        if (obj != null) {
            builder.tag(obj);
        }
        this.f5590e = builder.url(this.f5591f).build();
    }

    C2239c(String str, String str2, Map map) {
        this("POST", str, str2, null, map);
    }

    C2239c(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        this(str, str2, null, map, map2);
    }

    C2239c(String str, Map map, Map map2, Map map3) {
        this("GET", str, null, map, map2);
    }

    /* JADX INFO: renamed from: a */
    public final C2240d m6074a(OkHttpClient okHttpClient) {
        try {
            Response responseExecute = okHttpClient.newCall(this.f5590e).execute();
            return new C2240d(responseExecute.code(), responseExecute.body().string(), responseExecute.headers().toMultimap());
        } catch (IOException unused) {
            return new C2240d();
        }
    }

    /* JADX INFO: renamed from: b */
    public final C2239c m6075b() {
        this.f5592g = "";
        return this;
    }
}
