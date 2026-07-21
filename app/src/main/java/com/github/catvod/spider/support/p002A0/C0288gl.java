package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.gl */
/* JADX INFO: loaded from: classes.dex */
public final class C0288gl {

    /* JADX INFO: renamed from: a */
    public static final AtomicReferenceFieldUpdater f860a = AtomicReferenceFieldUpdater.newUpdater(C0288gl.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: b */
    public static final AtomicIntegerFieldUpdater f861b = AtomicIntegerFieldUpdater.newUpdater(C0288gl.class, "producerIndex");

    /* JADX INFO: renamed from: c */
    public static final AtomicIntegerFieldUpdater f862c = AtomicIntegerFieldUpdater.newUpdater(C0288gl.class, "consumerIndex");

    /* JADX INFO: renamed from: d */
    public static final AtomicIntegerFieldUpdater f863d = AtomicIntegerFieldUpdater.newUpdater(C0288gl.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceArray f864e = new AtomicReferenceArray(128);
    private volatile Object lastScheduledTask = null;
    private volatile int producerIndex = 0;
    private volatile int consumerIndex = 0;
    private volatile int blockingTasksInBuffer = 0;

    /* JADX INFO: renamed from: f */
    public final adf m1251f(adf adfVar) {
        if (adfVar.f603aa.mo1340o() == 1) {
            f863d.incrementAndGet(this);
        }
        if (this.producerIndex - this.consumerIndex == 127) {
            return adfVar;
        }
        int i = this.producerIndex & 127;
        while (this.f864e.get(i) != null) {
            Thread.yield();
        }
        this.f864e.lazySet(i, adfVar);
        f861b.incrementAndGet(this);
        return null;
    }

    /* JADX INFO: renamed from: g */
    public final int m1252g() {
        return this.lastScheduledTask != null ? (this.producerIndex - this.consumerIndex) + 1 : this.producerIndex - this.consumerIndex;
    }

    /* JADX INFO: renamed from: h */
    public final adf m1253h() {
        adf adfVar;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (f862c.compareAndSet(this, i, i + 1) && (adfVar = (adf) this.f864e.getAndSet(i2, null)) != null) {
                if (adfVar.f603aa.mo1340o() == 1) {
                    f863d.decrementAndGet(this);
                }
                return adfVar;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final long m1254i(C0288gl c0288gl) {
        int i = c0288gl.producerIndex;
        AtomicReferenceArray atomicReferenceArray = c0288gl.f864e;
        for (int i2 = c0288gl.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (c0288gl.blockingTasksInBuffer == 0) {
                break;
            }
            adf adfVar = (adf) atomicReferenceArray.get(i3);
            if (adfVar != null && adfVar.f603aa.mo1340o() == 1) {
                do {
                    if (atomicReferenceArray.compareAndSet(i3, adfVar, null)) {
                        f863d.decrementAndGet(c0288gl);
                        adf adfVar2 = (adf) f860a.getAndSet(this, adfVar);
                        if (adfVar2 == null) {
                            return -1L;
                        }
                        m1251f(adfVar2);
                        return -1L;
                    }
                } while (atomicReferenceArray.get(i3) == adfVar);
            }
        }
        return m1255j(c0288gl, true);
    }

    /* JADX INFO: renamed from: j */
    public final long m1255j(C0288gl c0288gl, boolean z) {
        while (true) {
            adf adfVar = (adf) c0288gl.lastScheduledTask;
            if (adfVar == null) {
                return -2L;
            }
            if (z && adfVar.f603aa.mo1340o() != 1) {
                return -2L;
            }
            AbstractC0125ak.f656e.getClass();
            long jNanoTime = System.nanoTime() - adfVar.f604z;
            long j = AbstractC0125ak.f652a;
            if (jNanoTime < j) {
                return j - jNanoTime;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f860a;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c0288gl, adfVar, null)) {
                    adf adfVar2 = (adf) f860a.getAndSet(this, adfVar);
                    if (adfVar2 == null) {
                        return -1L;
                    }
                    m1251f(adfVar2);
                    return -1L;
                }
            } while (atomicReferenceFieldUpdater.get(c0288gl) == adfVar);
        }
    }
}
