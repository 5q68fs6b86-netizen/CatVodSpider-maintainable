package com.github.catvod.spider.support.p003AB.p005b;

import com.github.catvod.spider.Wogg;
import com.github.catvod.spider.support.AB.d.d;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.b.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0845l implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f1996a = 0;

    /* JADX INFO: renamed from: b */
    public final String f1997b;

    /* JADX INFO: renamed from: c */
    public final Object f1998c;

    /* JADX INFO: renamed from: d */
    public final Object f1999d;

    public /* synthetic */ RunnableC0845l(C0857x c0857x, String str, d dVar) {
        this.f1998c = c0857x;
        this.f1997b = str;
        this.f1999d = dVar;
    }

    public /* synthetic */ RunnableC0845l(String str, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.f1997b = str;
        this.f1998c = atomicReference;
        this.f1999d = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f1996a != 0) {
            Wogg.d(this.f1997b, (AtomicReference) this.f1998c, (CountDownLatch) this.f1999d);
        } else {
            C0857x.m2080j((C0857x) this.f1998c, this.f1997b, (d) this.f1999d);
        }
    }
}
