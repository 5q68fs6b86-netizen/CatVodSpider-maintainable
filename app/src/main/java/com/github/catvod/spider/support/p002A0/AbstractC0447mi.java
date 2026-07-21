package com.github.catvod.spider.support.p002A0;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.mi */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0447mi extends AbstractC0743xh {
    @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
    public void onError(Call call, Exception exc) {
        this.f1803d = "";
        onFailure(call, exc);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0743xh
    public String onParseResponse(Call call, Response response) {
        try {
            return response.body().string();
        } catch (IOException unused) {
            return "";
        }
    }
}
