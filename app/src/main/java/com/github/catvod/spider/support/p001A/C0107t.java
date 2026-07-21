package com.github.catvod.spider.support.p001A;

import android.text.TextUtils;
import com.github.catvod.crawler.SpiderDebug;
import java.io.IOException;
import java.util.HashMap;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p001A.t */
/* JADX INFO: loaded from: classes.dex */
public final class C0107t {

    /* JADX INFO: renamed from: a */
    public final Request f395a;

    /* JADX INFO: renamed from: b */
    public final String f396b;

    public C0107t(String str, String str2, byte[] bArr, HashMap map) {
        this.f396b = str2;
        Request.Builder builder = new Request.Builder();
        str.equals("GET");
        if (str.equals("POST")) {
            builder.post(bArr != null ? RequestBody.create(MediaType.get("application/x-protobuf"), bArr) : !TextUtils.isEmpty(null) ? RequestBody.create(MediaType.get("application/json; charset=utf-8"), (String) null) : new FormBody.Builder().build());
        }
        if (map != null) {
            for (String str3 : map.keySet()) {
                builder.addHeader(str3, (String) map.get(str3));
            }
        }
        this.f395a = builder.url(this.f396b).build();
    }

    /* JADX INFO: renamed from: a */
    public final C0108u m866a(OkHttpClient okHttpClient) {
        try {
            Response responseExecute = okHttpClient.newCall(this.f395a).execute();
            try {
                responseExecute.code();
                byte[] bArrBytes = responseExecute.body().bytes();
                responseExecute.headers().toMultimap();
                C0108u c0108u = new C0108u(bArrBytes);
                responseExecute.close();
                return c0108u;
            } catch (Throwable th) {
                if (responseExecute != null) {
                    try {
                        responseExecute.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IOException e) {
            SpiderDebug.log("error");
            return new C0108u();
        }
    }
}
