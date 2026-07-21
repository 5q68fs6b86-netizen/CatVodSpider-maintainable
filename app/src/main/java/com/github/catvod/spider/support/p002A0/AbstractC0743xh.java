package com.github.catvod.spider.support.p002A0;

import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.xh */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0743xh {

    /* JADX INFO: renamed from: d */
    public Object f1803d = null;

    public Object getResult() {
        return this.f1803d;
    }

    public void onError(Call call, Exception exc) {
        onFailure(call, exc);
    }

    public abstract void onFailure(Call call, Exception exc);

    public abstract Object onParseResponse(Call call, Response response);

    public abstract void onResponse(Object obj);
}
