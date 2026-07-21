package com.github.catvod.spider.support.p003AB.p009o;

import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.W */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0912W implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f2147a;

    /* JADX INFO: renamed from: b */
    public final C0915Z f2148b;

    /* JADX INFO: renamed from: c */
    public final Map f2149c;

    public /* synthetic */ RunnableC0912W(C0915Z c0915z, Map map, int i) {
        this.f2147a = i;
        this.f2148b = c0915z;
        this.f2149c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2147a;
        if (i == 0) {
            this.f2148b.m2208y(this.f2149c);
        } else if (i != 1) {
            this.f2148b.m2210x(this.f2149c);
        } else {
            this.f2148b.m2210x(this.f2149c);
        }
    }
}
