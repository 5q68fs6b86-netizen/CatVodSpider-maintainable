package com.github.catvod.spider.support.p003AB.p008n;

import com.github.catvod.spider.PanWebShare;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.n.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0888o implements Runnable {

    /* JADX INFO: renamed from: a */
    public final PanWebShare f2088a;

    /* JADX INFO: renamed from: b */
    public final String f2089b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference f2090c;

    /* JADX INFO: renamed from: d */
    public final CountDownLatch f2091d;

    public /* synthetic */ RunnableC0888o(PanWebShare panWebShare, String str, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.f2088a = panWebShare;
        this.f2089b = str;
        this.f2090c = atomicReference;
        this.f2091d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        PanWebShare.d(this.f2088a, this.f2089b, this.f2090c, this.f2091d);
    }
}
