package com.github.catvod.spider.support.p012C0.p036k;

import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p036k.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1250c<T> {

    /* JADX INFO: renamed from: a */
    private T f2944a = null;

    /* JADX INFO: renamed from: a */
    protected final void m3116a(Call call, Response response) {
        T tOnParseResponse = onParseResponse(call, response);
        this.f2944a = tOnParseResponse;
        onResponse(tOnParseResponse);
    }

    /* JADX INFO: renamed from: b */
    protected final void m3117b() {
        this.f2944a = "";
    }

    public T getResult() {
        return this.f2944a;
    }

    protected void onError(Call call, Exception exc) {
        onFailure(call, exc);
    }

    protected abstract void onFailure(Call call, Exception exc);

    protected abstract T onParseResponse(Call call, Response response);

    protected abstract void onResponse(T t);
}
