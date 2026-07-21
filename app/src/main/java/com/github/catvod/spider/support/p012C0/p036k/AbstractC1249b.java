package com.github.catvod.spider.support.p012C0.p036k;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p036k.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1249b extends AbstractC1250c<String> {
    @Override // com.github.catvod.spider.support.p012C0.p036k.AbstractC1250c
    public void onError(Call call, Exception exc) {
        m3117b();
        onFailure(call, exc);
    }

    @Override // com.github.catvod.spider.support.p012C0.p036k.AbstractC1250c
    public String onParseResponse(Call call, Response response) {
        try {
            return response.body().string();
        } catch (IOException e) {
            return "";
        }
    }
}
