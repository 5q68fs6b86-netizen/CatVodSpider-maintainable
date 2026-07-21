package com.github.catvod.spider.support.p128m;

import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.m.r */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2275r implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5679a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2253G f5680b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f5681c;

    public /* synthetic */ RunnableC2275r(C2253G c2253g, Map map, int i) {
        this.f5679a = i;
        this.f5680b = c2253g;
        this.f5681c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5679a) {
            case 0:
                C2253G.m6086d(this.f5680b, this.f5681c);
                break;
            case 1:
                this.f5680b.m6108z(this.f5681c);
                break;
            default:
                this.f5680b.m6108z(this.f5681c);
                break;
        }
    }
}
