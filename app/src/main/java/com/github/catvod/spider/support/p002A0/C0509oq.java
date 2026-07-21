package com.github.catvod.spider.support.p002A0;

import com.github.catvod.crawler.SpiderDebug;
import java.io.IOException;
import java.util.AbstractMap;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.oq */
/* JADX INFO: loaded from: classes.dex */
public final class C0509oq extends AbstractC0743xh {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractMap f1348a;

    public C0509oq(AbstractMap abstractMap) {
        this.f1348a = abstractMap;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
    public final void onFailure(Call call, Exception exc) {
        this.f1803d = "";
        SpiderDebug.log(exc);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
    public final Object onParseResponse(Call call, Response response) {
        AbstractMap abstractMap = this.f1348a;
        if (abstractMap != null) {
            try {
                abstractMap.clear();
                abstractMap.putAll(response.headers().toMultimap());
            } catch (IOException unused) {
                return "";
            }
        }
        return response.body().string();
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
    public final /* bridge */ /* synthetic */ void onResponse(Object obj) {
    }
}
