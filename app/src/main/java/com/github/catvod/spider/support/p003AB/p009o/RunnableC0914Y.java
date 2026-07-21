package com.github.catvod.spider.support.p003AB.p009o;

import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.Y */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0914Y implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f2153a;

    /* JADX INFO: renamed from: b */
    public final C0915Z f2154b;

    /* JADX INFO: renamed from: c */
    public final Map f2155c;

    public /* synthetic */ RunnableC0914Y(C0915Z c0915z, Map map, int i) {
        this.f2153a = i;
        this.f2154b = c0915z;
        this.f2155c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f2153a != 0) {
            this.f2154b.m2210x(this.f2155c);
        } else {
            this.f2154b.m2208y(this.f2155c);
        }
    }
}
