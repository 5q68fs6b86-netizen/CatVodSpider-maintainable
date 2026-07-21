package com.github.catvod.spider.support.p044FM.p091p;

import com.github.catvod.crawler.SpiderDebug;
import java.io.IOException;
import java.util.Map;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.p.e */
/* JADX INFO: loaded from: classes.dex */
final class C1890e extends AbstractC1888c<String> {

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Map f4358b;

    C1890e(Map map) {
        this.f4358b = map;
    }

    @Override // com.github.catvod.spider.support.p044FM.p091p.AbstractC1888c
    /* JADX INFO: renamed from: a */
    public final void mo495a(Exception exc) {
        m4584d();
        SpiderDebug.log(exc);
    }

    @Override // com.github.catvod.spider.support.p044FM.p091p.AbstractC1888c
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ void mo496b(String str) {
    }

    @Override // com.github.catvod.spider.support.p044FM.p091p.AbstractC1888c
    public final String onParseResponse(Call call, Response response) {
        try {
            Map map = this.f4358b;
            if (map != null) {
                map.clear();
                this.f4358b.putAll(response.headers().toMultimap());
            }
            return response.body().string();
        } catch (IOException unused) {
            return "";
        }
    }
}
