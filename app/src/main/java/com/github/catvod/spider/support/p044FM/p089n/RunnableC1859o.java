package com.github.catvod.spider.support.p044FM.p089n;

import com.github.catvod.spider.Wogg;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.n.o */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1859o implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f4275a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AtomicReference f4276b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CountDownLatch f4277c;

    public /* synthetic */ RunnableC1859o(String str, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.f4275a = str;
        this.f4276b = atomicReference;
        this.f4277c = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Wogg.e(this.f4275a, this.f4276b, this.f4277c);
    }
}
