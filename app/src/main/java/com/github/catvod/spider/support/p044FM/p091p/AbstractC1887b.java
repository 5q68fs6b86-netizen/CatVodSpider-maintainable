package com.github.catvod.spider.support.p044FM.p091p;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p091p.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1887b extends AbstractC1888c<String> {
    @Override // com.github.catvod.spider.support.p044FM.p091p.AbstractC1888c
    public void onError(Call call, Exception exc) {
        m4584d();
        mo495a(exc);
    }

    @Override // com.github.catvod.spider.support.p044FM.p091p.AbstractC1888c
    public String onParseResponse(Call call, Response response) {
        try {
            return response.body().string();
        } catch (IOException unused) {
            return "";
        }
    }
}
