package com.github.catvod.spider.support.p044FM.p091p;

import okhttp3.Call;
import okhttp3.Response;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p091p.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1888c<T> {

    /* JADX INFO: renamed from: a */
    private T f4350a = null;

    /* JADX INFO: renamed from: a */
    protected abstract void mo495a(Exception exc);

    /* JADX INFO: renamed from: b */
    protected abstract void mo496b(T t);

    /* JADX INFO: renamed from: c */
    protected final void m4583c(Call call, Response response) {
        T tOnParseResponse = onParseResponse(call, response);
        this.f4350a = tOnParseResponse;
        mo496b(tOnParseResponse);
    }

    /* JADX INFO: renamed from: d */
    protected final void m4584d() {
        this.f4350a = "";
    }

    public T getResult() {
        return this.f4350a;
    }

    protected void onError(Call call, Exception exc) {
        mo495a(exc);
    }

    protected abstract T onParseResponse(Call call, Response response);
}
