package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.tl */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0639tl implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicInteger f1539a;

    public ThreadFactoryC0639tl(AtomicInteger atomicInteger) {
        this.f1539a = atomicInteger;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "CommonPool-worker-" + this.f1539a.incrementAndGet());
        thread.setDaemon(true);
        return thread;
    }
}
