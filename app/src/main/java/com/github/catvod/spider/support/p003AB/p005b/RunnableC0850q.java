package com.github.catvod.spider.support.p003AB.p005b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.b.q */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0850q implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f2006a;

    /* JADX INFO: renamed from: b */
    public final C0857x f2007b;

    public /* synthetic */ RunnableC0850q(C0857x c0857x, int i) {
        this.f2006a = i;
        this.f2007b = c0857x;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2006a;
        C0857x c0857x = this.f2007b;
        if (i != 0) {
            c0857x.m2085o();
        } else {
            C0857x.m2072b(c0857x);
        }
    }
}
