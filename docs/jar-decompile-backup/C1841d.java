package com.github.catvod.spider.support.p044FM.p088m;

import android.text.TextUtils;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;
import java.io.IOException;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p088m.d */
/* JADX INFO: loaded from: classes.dex */
final class C1841d {

    /* JADX INFO: renamed from: a */
    private final Map<String, String> f4228a;

    /* JADX INFO: renamed from: b */
    private final Map<String, String> f4229b;

    /* JADX INFO: renamed from: c */
    private final String f4230c;

    /* JADX INFO: renamed from: d */
    private final String f4231d;

    /* JADX INFO: renamed from: e */
    private Request f4232e;

    /* JADX INFO: renamed from: f */
    private String f4233f;

    C1841d(String str, String str2, String str3, Map<String, String> map) {
        this(str, str2, str3, null, map);
    }

    private C1841d(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2) {
        RequestBody requestBodyBuild;
        this.f4233f = str2;
        this.f4231d = str3;
        this.f4230c = str;
        this.f4229b = map;
        this.f4228a = map2;
        Request.Builder builder = new Request.Builder();
        if (str.equals("GET") && map != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f4233f);
            this.f4233f = C1434P.m3588a(new byte[]{-40}, new byte[]{-25, 82, -28, -2, 36, -80, -73, -10}, sb);
            for (String str4 : map.keySet()) {
                String str5 = this.f4233f;
                StringBuilder sbM3589b = C1434P.m3589b(str4);
                sbM3589b.append("=");
                sbM3589b.append(this.f4229b.get(str4));
                sbM3589b.append("&");
                this.f4233f = str5.concat(sbM3589b.toString());
            }
            this.f4233f = C1885z.m4578q(this.f4233f);
        }
        if (this.f4230c.equals("POST")) {
            if (TextUtils.isEmpty(this.f4231d)) {
                FormBody.Builder builder2 = new FormBody.Builder();
                Map<String, String> map3 = this.f4229b;
                if (map3 != null) {
                    for (String str6 : map3.keySet()) {
                        builder2.add(str6, this.f4229b.get(str6));
                    }
                }
                requestBodyBuild = builder2.build();
            } else {
                requestBodyBuild = RequestBody.create(MediaType.get("application/json; charset=utf-8"), this.f4231d);
            }
            builder.post(requestBodyBuild);
        }
        Map<String, String> map4 = this.f4228a;
        if (map4 != null) {
            for (String str7 : map4.keySet()) {
                builder.addHeader(str7, this.f4228a.get(str7));
            }
        }
        this.f4232e = builder.url(this.f4233f).build();
    }

    C1841d(String str, String str2, Map<String, String> map, Map<String, String> map2) {
        this(str, str2, null, map, map2);
    }

    /* JADX INFO: renamed from: a */
    public final C1842e m4480a(OkHttpClient okHttpClient) {
        try {
            Response responseExecute = okHttpClient.newCall(this.f4232e).execute();
            return new C1842e(responseExecute.code(), responseExecute.body().string(), responseExecute.headers().toMultimap());
        } catch (IOException unused) {
            return new C1842e();
        }
    }
}
