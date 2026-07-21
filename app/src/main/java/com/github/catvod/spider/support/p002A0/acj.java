package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes.dex */
public final class acj extends AbstractC0219dx implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: v */
    public static final long f561v;

    /* JADX INFO: renamed from: x */
    public static final acj f562x;

    static {
        Long l;
        acj acjVar = new acj();
        f562x = acjVar;
        acjVar.m1201t(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        f561v = timeUnit.toNanos(l.longValue());
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0219dx, com.github.catvod.spider.support.p002A0.acp
    /* JADX INFO: renamed from: c */
    public final adh mo947c(long j, RunnableC0140az runnableC0140az, InterfaceC0769yg interfaceC0769yg) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 >= 4611686018427387903L) {
            return C0438m.f1211a;
        }
        long jNanoTime = System.nanoTime();
        adp adpVar = new adp(j2 + jNanoTime, runnableC0140az);
        m1152l(jNanoTime, adpVar);
        return adpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        abk.f523a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    m949y();
                    if (m1149i()) {
                        return;
                    }
                    mo948s();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jM1150j = m1150j();
                    if (jM1150j == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j == Long.MAX_VALUE) {
                            j = f561v + jNanoTime;
                        }
                        long j2 = j - jNanoTime;
                        if (j2 <= 0) {
                            _thread = null;
                            m949y();
                            if (m1149i()) {
                                return;
                            }
                            mo948s();
                            return;
                        }
                        if (jM1150j > j2) {
                            jM1150j = j2;
                        }
                    } else {
                        j = Long.MAX_VALUE;
                    }
                    if (jM1150j > 0) {
                        int i2 = debugStatus;
                        if (i2 == 2 || i2 == 3) {
                            _thread = null;
                            m949y();
                            if (m1149i()) {
                                return;
                            }
                            mo948s();
                            return;
                        }
                        LockSupport.parkNanos(this, jM1150j);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            m949y();
            if (!m1149i()) {
                mo948s();
            }
            throw th;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0240er
    /* JADX INFO: renamed from: s */
    public final Thread mo948s() {
        Thread thread = _thread;
        if (thread == null) {
            synchronized (this) {
                thread = _thread;
                if (thread == null) {
                    thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                    _thread = thread;
                    thread.setDaemon(true);
                    thread.start();
                }
            }
        }
        return thread;
    }

    /* JADX INFO: renamed from: y */
    public final synchronized void m949y() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            m1151k();
            notifyAll();
        }
    }
}
