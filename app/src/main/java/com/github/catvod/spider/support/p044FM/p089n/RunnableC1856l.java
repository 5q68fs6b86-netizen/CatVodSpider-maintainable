package com.github.catvod.spider.support.p044FM.p089n;

import com.github.catvod.spider.PanWebShare;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p089n.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1856l implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ PanWebShare f4268a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f4269b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AtomicReference f4270c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ CountDownLatch f4271d;

    public /* synthetic */ RunnableC1856l(PanWebShare panWebShare, String str, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.f4268a = panWebShare;
        this.f4269b = str;
        this.f4270c = atomicReference;
        this.f4271d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PanWebShare.e(this.f4268a, this.f4269b, this.f4270c, this.f4271d);
    }
}
