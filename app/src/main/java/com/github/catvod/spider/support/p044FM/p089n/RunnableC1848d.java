package com.github.catvod.spider.support.p044FM.p089n;

import com.github.catvod.spider.support.p044FM.p073b.C1722J;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p089n.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1848d implements Runnable {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ RunnableC1848d f4242b = new RunnableC1848d(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ RunnableC1848d f4243c = new RunnableC1848d(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4244a;

    public /* synthetic */ RunnableC1848d(int i) {
        this.f4244a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4244a) {
            case 0:
                C1722J.m4037p().m4050k();
                break;
            default:
                new Thread(RunnableC1852h.f4256c).start();
                break;
        }
    }
}
