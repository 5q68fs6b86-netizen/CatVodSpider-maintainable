package com.github.catvod.spider.support.p003AB.p005b;

import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.b.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0843j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f1990a;

    /* JADX INFO: renamed from: b */
    public final Object f1991b;

    /* JADX INFO: renamed from: c */
    public final Object f1992c;

    public /* synthetic */ RunnableC0843j(Object obj, Object obj2, int i) {
        this.f1990a = i;
        this.f1991b = obj;
        this.f1992c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1990a != 0) {
            C0833Q.m2031m((C0833Q) this.f1991b, (JSONObject) this.f1992c);
        } else {
            C0857x.m2074d((C0857x) this.f1991b, (Map) this.f1992c);
        }
    }
}
