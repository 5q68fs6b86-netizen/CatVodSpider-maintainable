package com.github.catvod.spider.support.p012C0.p023b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p023b.i */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1025i implements Runnable {

    /* JADX INFO: renamed from: c */
    public final int f2492c;

    /* JADX INFO: renamed from: d */
    public final C1032p f2493d;

    public /* synthetic */ RunnableC1025i(C1032p c1032p, int i) {
        this.f2492c = i;
        this.f2493d = c1032p;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2492c) {
            case 0:
                C1032p.m2568d(this.f2493d);
                break;
            default:
                this.f2493d.m2563M();
                break;
        }
    }
}
