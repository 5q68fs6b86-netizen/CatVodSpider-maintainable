package com.github.catvod.spider.support.p012C0.p036k;

import com.github.catvod.crawler.SpiderDebug;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.k.f */
/* JADX INFO: loaded from: classes.dex */
final class C1253f extends AbstractC1250c<String> {

    /* JADX INFO: renamed from: b */
    final Map f2952b;

    C1253f(Map map) {
        this.f2952b = map;
    }

    @Override // com.github.catvod.spider.support.p012C0.p036k.AbstractC1250c
    public final void onFailure(Call call, Exception exc) {
        m3117b();
        SpiderDebug.log(exc);
    }

    @Override // com.github.catvod.spider.support.p012C0.p036k.AbstractC1250c
    public final String onParseResponse(Call call, Response response) {
        try {
            Map map = this.f2952b;
            if (map != null) {
                map.clear();
                this.f2952b.putAll(response.headers().toMultimap());
            }
            return response.body().string();
        } catch (IOException e) {
            return "";
        }
    }

    @Override // com.github.catvod.spider.support.p012C0.p036k.AbstractC1250c
    public final /* bridge */ /* synthetic */ void onResponse(String str) {
    }
}
