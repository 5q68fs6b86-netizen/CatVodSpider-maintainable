package com.github.catvod.spider.support.p003AB.p005b;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p005b.N */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0830N implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f1953a;

    /* JADX INFO: renamed from: b */
    public final C0833Q f1954b;

    /* JADX INFO: renamed from: c */
    public final JSONObject f1955c;

    public /* synthetic */ RunnableC0830N(C0833Q c0833q, JSONObject jSONObject, int i) {
        this.f1953a = i;
        this.f1954b = c0833q;
        this.f1955c = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1953a != 0) {
            C0833Q.m2027i(this.f1954b, this.f1955c);
        } else {
            C0833Q.m2028j(this.f1954b, this.f1955c);
        }
    }
}
