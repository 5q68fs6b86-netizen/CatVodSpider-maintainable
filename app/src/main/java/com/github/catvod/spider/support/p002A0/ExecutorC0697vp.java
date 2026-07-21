package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.vp */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0697vp extends AbstractC0448mj implements InterfaceC0394kj, Executor {

    /* JADX INFO: renamed from: a */
    public static final AtomicIntegerFieldUpdater f1597a = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0697vp.class, "inFlightTasks");

    /* JADX INFO: renamed from: c */
    public final acl f1599c;

    /* JADX INFO: renamed from: d */
    public final int f1600d;

    /* JADX INFO: renamed from: f */
    public final String f1601f = "Dispatchers.IO";

    /* JADX INFO: renamed from: h */
    public final int f1602h = 1;

    /* JADX INFO: renamed from: b */
    public final ConcurrentLinkedQueue f1598b = new ConcurrentLinkedQueue();
    private volatile int inFlightTasks = 0;

    public ExecutorC0697vp(acl aclVar, int i) {
        this.f1599c = aclVar;
        this.f1600d = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on LimitingBlockingDispatcher");
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0775ym
    /* JADX INFO: renamed from: e */
    public final void mo1146e(InterfaceC0769yg interfaceC0769yg, acw acwVar) {
        m1750i(acwVar, false);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m1750i(runnable, false);
    }

    /* JADX INFO: renamed from: i */
    public final void m1750i(Runnable runnable, boolean z) {
        adf c0124aj;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1597a;
            int iIncrementAndGet = atomicIntegerFieldUpdater.incrementAndGet(this);
            int i = this.f1600d;
            if (iIncrementAndGet <= i) {
                ExecutorC0778yp executorC0778yp = this.f1599c.f1354a;
                try {
                    executorC0778yp.m1904l(runnable, this, z);
                    return;
                } catch (RejectedExecutionException unused) {
                    acj acjVar = acj.f562x;
                    executorC0778yp.getClass();
                    AbstractC0125ak.f656e.getClass();
                    long jNanoTime = System.nanoTime();
                    if (runnable instanceof adf) {
                        c0124aj = (adf) runnable;
                        c0124aj.f604z = jNanoTime;
                        c0124aj.f603aa = this;
                    } else {
                        c0124aj = new C0124aj(runnable, jNanoTime, this);
                    }
                    acjVar.m1145_a(c0124aj);
                    return;
                }
            }
            ConcurrentLinkedQueue concurrentLinkedQueue = this.f1598b;
            concurrentLinkedQueue.add(runnable);
            if (atomicIntegerFieldUpdater.decrementAndGet(this) >= i) {
                return;
            } else {
                runnable = (Runnable) concurrentLinkedQueue.poll();
            }
        } while (runnable != null);
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0394kj
    /* JADX INFO: renamed from: o */
    public final int mo1340o() {
        return this.f1602h;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0394kj
    /* JADX INFO: renamed from: p */
    public final void mo1341p() {
        adf c0124aj;
        ConcurrentLinkedQueue concurrentLinkedQueue = this.f1598b;
        Runnable runnable = (Runnable) concurrentLinkedQueue.poll();
        if (runnable == null) {
            f1597a.decrementAndGet(this);
            Runnable runnable2 = (Runnable) concurrentLinkedQueue.poll();
            if (runnable2 != null) {
                m1750i(runnable2, true);
                return;
            }
            return;
        }
        ExecutorC0778yp executorC0778yp = this.f1599c.f1354a;
        try {
            executorC0778yp.m1904l(runnable, this, true);
        } catch (RejectedExecutionException unused) {
            acj acjVar = acj.f562x;
            executorC0778yp.getClass();
            AbstractC0125ak.f656e.getClass();
            long jNanoTime = System.nanoTime();
            if (runnable instanceof adf) {
                c0124aj = (adf) runnable;
                c0124aj.f604z = jNanoTime;
                c0124aj.f603aa = this;
            } else {
                c0124aj = new C0124aj(runnable, jNanoTime, this);
            }
            acjVar.m1145_a(c0124aj);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0775ym
    public final String toString() {
        String str = this.f1601f;
        if (str != null) {
            return str;
        }
        return super.toString() + "[dispatcher = " + this.f1599c + ']';
    }
}
