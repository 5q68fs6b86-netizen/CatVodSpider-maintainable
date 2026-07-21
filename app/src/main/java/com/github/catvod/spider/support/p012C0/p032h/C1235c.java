package com.github.catvod.spider.support.p012C0.p032h;

import android.text.TextUtils;
import com.github.catvod.spider.support.p012C0.p023b.C1030n;
import com.github.catvod.spider.support.p012C0.p035j.C1247o;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.h.c */
/* JADX INFO: loaded from: classes.dex */
final class C1235c {

    /* JADX INFO: renamed from: a */
    private final Map<String, List<String>> f2906a;

    /* JADX INFO: renamed from: b */
    private final Map<String, String> f2907b;

    /* JADX INFO: renamed from: c */
    private final Map<String, String> f2908c;

    /* JADX INFO: renamed from: d */
    private final String f2909d;

    /* JADX INFO: renamed from: e */
    private final String f2910e;

    /* JADX INFO: renamed from: f */
    private Request f2911f;

    /* JADX INFO: renamed from: g */
    private String f2912g;

    /* JADX INFO: renamed from: h */
    private Object f2913h;

    private C1235c(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        RequestBody requestBodyBuild;
        this.f2912g = str2;
        this.f2910e = str3;
        this.f2909d = str;
        this.f2908c = map;
        this.f2907b = map2;
        this.f2906a = map3;
        Request.Builder builder = new Request.Builder();
        if (str.equals("GET") && map != null) {
            this.f2912g = C1030n.m2554b(new StringBuilder(), this.f2912g, "?");
            for (String str4 : map.keySet()) {
                this.f2912g = this.f2912g.concat(str4 + "=" + this.f2908c.get(str4) + "&");
            }
            String strSubstring = this.f2912g;
            int i = C1247o.f2943a;
            if (strSubstring != null && strSubstring.length() > 1) {
                strSubstring = strSubstring.substring(0, strSubstring.length() - 1);
            }
            this.f2912g = strSubstring;
        }
        if (this.f2909d.equals("POST")) {
            if (TextUtils.isEmpty(this.f2910e)) {
                FormBody.Builder builder2 = new FormBody.Builder();
                Map<String, String> map4 = this.f2908c;
                if (map4 != null) {
                    for (String str5 : map4.keySet()) {
                        builder2.add(str5, this.f2908c.get(str5));
                    }
                }
                requestBodyBuild = builder2.build();
            } else {
                requestBodyBuild = RequestBody.create(MediaType.parse("application/json; charset=utf-8"), this.f2910e);
            }
            builder.post(requestBodyBuild);
        }
        Map<String, String> map5 = this.f2907b;
        if (map5 != null) {
            for (String str6 : map5.keySet()) {
                builder.addHeader(str6, this.f2907b.get(str6));
            }
        }
        Object obj = this.f2913h;
        if (obj != null) {
            builder.tag(obj);
        }
        this.f2911f = builder.url(this.f2912g).build();
    }

    C1235c(String str, String str2, Map map) {
        this("POST", str, str2, null, map, null);
    }

    C1235c(String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        this(str, str2, null, map, map2, map3);
    }

    /* JADX INFO: renamed from: a */
    public final C1236d m3054a(OkHttpClient okHttpClient) {
        try {
            Response responseExecute = okHttpClient.newCall(this.f2911f).execute();
            Map<String, List<String>> map = this.f2906a;
            if (map != null) {
                map.clear();
            }
            Map<String, List<String>> map2 = this.f2906a;
            if (map2 != null) {
                map2.putAll(responseExecute.headers().toMultimap());
            }
            return new C1236d(responseExecute.code(), responseExecute.body().string());
        } catch (IOException e) {
            return new C1236d();
        }
    }

    /* JADX INFO: renamed from: b */
    public final C1235c m3055b() {
        this.f2913h = null;
        return this;
    }
}
