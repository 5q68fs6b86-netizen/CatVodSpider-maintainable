package com.github.catvod.spider.support.p126k;

import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.Okio;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p126k.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2241e implements Interceptor {

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p126k.e$a */
    final class a extends ResponseBody {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Response f5596a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InflaterInputStream f5597b;

        a(Response response, InflaterInputStream inflaterInputStream) {
            this.f5596a = response;
            this.f5597b = inflaterInputStream;
        }

        public final long contentLength() {
            return this.f5596a.body().contentLength();
        }

        public final MediaType contentType() {
            return this.f5596a.body().contentType();
        }

        public final BufferedSource source() {
            return Okio.buffer(Okio.source(this.f5597b));
        }
    }

    public final Response intercept(Interceptor.Chain chain) {
        Request request = chain.request();
        if (request.url().host().equals("gitcode.net")) {
            request = request.newBuilder().addHeader("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/109.0.0.0 Safari/537.36").build();
        }
        Response responseProceed = chain.proceed(request);
        String strHeader = responseProceed.header("Content-Encoding");
        if (responseProceed.body() == null || strHeader == null || !strHeader.equals("deflate")) {
            return responseProceed;
        }
        return responseProceed.newBuilder().headers(responseProceed.headers()).body(new a(responseProceed, new InflaterInputStream(responseProceed.body().byteStream(), new Inflater(true)))).build();
    }
}
