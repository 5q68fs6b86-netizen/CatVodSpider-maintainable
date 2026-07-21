package com.github.catvod.spider.support.p003AB.p009o;

import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.X */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0913X implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f2150a;

    /* JADX INFO: renamed from: b */
    public final C0915Z f2151b;

    /* JADX INFO: renamed from: c */
    public final Map f2152c;

    public /* synthetic */ RunnableC0913X(C0915Z c0915z, Map map, int i) {
        this.f2150a = i;
        this.f2151b = c0915z;
        this.f2152c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2150a != 0) {
            this.f2151b.m2210x(this.f2152c);
        } else {
            this.f2151b.m2198n(this.f2152c);
        }
    }
}
