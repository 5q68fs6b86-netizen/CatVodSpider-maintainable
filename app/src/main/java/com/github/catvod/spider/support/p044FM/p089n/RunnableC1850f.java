package com.github.catvod.spider.support.p044FM.p089n;

import com.github.catvod.spider.support.p044FM.p073b.C1753x;
import com.github.catvod.spider.support.p044FM.p090o.C1885z;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p089n.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1850f implements Runnable {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ RunnableC1850f f4248b = new RunnableC1850f(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ RunnableC1850f f4249c = new RunnableC1850f(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4250a;

    public /* synthetic */ RunnableC1850f(int i) {
        this.f4250a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4250a) {
            case 0:
                C1753x.m4147e().getClass();
                C1885z.m4562b(".baidu");
                break;
            default:
                new Thread(RunnableC1851g.f4253d).start();
                break;
        }
    }
}
