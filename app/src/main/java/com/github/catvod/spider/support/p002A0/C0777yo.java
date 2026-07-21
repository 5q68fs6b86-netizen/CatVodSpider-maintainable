package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.yo */
/* JADX INFO: loaded from: classes.dex */
public final class C0777yo extends Thread {

    /* JADX INFO: renamed from: a */
    public static final AtomicIntegerFieldUpdater f1841a = AtomicIntegerFieldUpdater.newUpdater(C0777yo.class, "workerCtl");

    /* JADX INFO: renamed from: b */
    public final C0288gl f1842b;

    /* JADX INFO: renamed from: c */
    public int f1843c;

    /* JADX INFO: renamed from: d */
    public long f1844d;

    /* JADX INFO: renamed from: e */
    public long f1845e;

    /* JADX INFO: renamed from: f */
    public int f1846f;

    /* JADX INFO: renamed from: g */
    public boolean f1847g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ExecutorC0778yp f1848h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    volatile int workerCtl;

    public C0777yo(ExecutorC0778yp executorC0778yp, int i) {
        this.f1848h = executorC0778yp;
        setDaemon(true);
        this.f1842b = new C0288gl();
        this.f1843c = 4;
        this.workerCtl = 0;
        this.nextParkedWorker = ExecutorC0778yp.f1852d;
        AbstractC0189cu.f717a.getClass();
        this.f1846f = AbstractC0189cu.f718b.mo898d().nextInt();
        m1899n(i);
    }

    /* JADX INFO: renamed from: i */
    public final adf m1894i(boolean z) {
        adf adfVarM1898m;
        adf adfVarM1898m2;
        long j;
        adf adfVarM1253h;
        if (this.f1843c != 1) {
            ExecutorC0778yp executorC0778yp = this.f1848h;
            do {
                j = executorC0778yp.controlState;
                if (((int) ((9223367638808264704L & j) >> 42)) == 0) {
                    if (z) {
                        C0288gl c0288gl = this.f1842b;
                        c0288gl.getClass();
                        adfVarM1253h = (adf) C0288gl.f860a.getAndSet(c0288gl, null);
                        if (adfVarM1253h == null) {
                            adfVarM1253h = c0288gl.m1253h();
                        }
                        if (adfVarM1253h == null) {
                            adfVarM1253h = (adf) this.f1848h.f1854f.m1961e();
                        }
                    } else {
                        adfVarM1253h = (adf) this.f1848h.f1854f.m1961e();
                    }
                    return adfVarM1253h != null ? adfVarM1253h : m1902q(true);
                }
            } while (!ExecutorC0778yp.f1850b.compareAndSet(executorC0778yp, j, j - 4398046511104L));
            this.f1843c = 1;
        }
        if (z) {
            boolean z2 = m1897l(this.f1848h.f1856h * 2) == 0;
            if (z2 && (adfVarM1898m2 = m1898m()) != null) {
                return adfVarM1898m2;
            }
            C0288gl c0288gl2 = this.f1842b;
            c0288gl2.getClass();
            adf adfVar = (adf) C0288gl.f860a.getAndSet(c0288gl2, null);
            adf adfVarM1253h2 = adfVar != null ? adfVar : c0288gl2.m1253h();
            if (adfVarM1253h2 != null) {
                return adfVarM1253h2;
            }
            if (!z2 && (adfVarM1898m = m1898m()) != null) {
                return adfVarM1898m;
            }
        } else {
            adf adfVarM1898m3 = m1898m();
            if (adfVarM1898m3 != null) {
                return adfVarM1898m3;
            }
        }
        return m1902q(false);
    }

    /* JADX INFO: renamed from: j */
    public final int m1895j() {
        return this.indexInArray;
    }

    /* JADX INFO: renamed from: k */
    public final Object m1896k() {
        return this.nextParkedWorker;
    }

    /* JADX INFO: renamed from: l */
    public final int m1897l(int i) {
        int i2 = this.f1846f;
        int i3 = i2 ^ (i2 << 13);
        int i4 = i3 ^ (i3 >> 17);
        int i5 = i4 ^ (i4 << 5);
        this.f1846f = i5;
        int i6 = i - 1;
        return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
    }

    /* JADX INFO: renamed from: m */
    public final adf m1898m() {
        int iM1897l = m1897l(2);
        ExecutorC0778yp executorC0778yp = this.f1848h;
        if (iM1897l == 0) {
            adf adfVar = (adf) executorC0778yp.f1853e.m1961e();
            return adfVar != null ? adfVar : (adf) executorC0778yp.f1854f.m1961e();
        }
        adf adfVar2 = (adf) executorC0778yp.f1854f.m1961e();
        return adfVar2 != null ? adfVar2 : (adf) executorC0778yp.f1853e.m1961e();
    }

    /* JADX INFO: renamed from: n */
    public final void m1899n(int i) {
        StringBuilder sb = new StringBuilder("DefaultDispatcher-worker-");
        this.f1848h.getClass();
        sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb.toString());
        this.indexInArray = i;
    }

    /* JADX INFO: renamed from: o */
    public final void m1900o(Object obj) {
        this.nextParkedWorker = obj;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m1901p(int i) {
        int i2 = this.f1843c;
        boolean z = i2 == 1;
        if (z) {
            ExecutorC0778yp.f1850b.addAndGet(this.f1848h, 4398046511104L);
        }
        if (i2 != i) {
            this.f1843c = i;
        }
        return z;
    }

    /* JADX INFO: renamed from: q */
    public final adf m1902q(boolean z) {
        long jM1255j;
        ExecutorC0778yp executorC0778yp = this.f1848h;
        int i = (int) (executorC0778yp.controlState & 2097151);
        if (i < 2) {
            return null;
        }
        int iM1897l = m1897l(i);
        long jMin = Long.MAX_VALUE;
        for (int i2 = 0; i2 < i; i2++) {
            iM1897l++;
            if (iM1897l > i) {
                iM1897l = 1;
            }
            C0777yo c0777yo = (C0777yo) executorC0778yp.f1855g.get(iM1897l);
            if (c0777yo != null && c0777yo != this) {
                C0288gl c0288gl = this.f1842b;
                C0288gl c0288gl2 = c0777yo.f1842b;
                if (z) {
                    jM1255j = c0288gl.m1254i(c0288gl2);
                } else {
                    c0288gl.getClass();
                    adf adfVarM1253h = c0288gl2.m1253h();
                    if (adfVarM1253h != null) {
                        adf adfVar = (adf) C0288gl.f860a.getAndSet(c0288gl, adfVarM1253h);
                        if (adfVar != null) {
                            c0288gl.m1251f(adfVar);
                        }
                        jM1255j = -1;
                    } else {
                        jM1255j = c0288gl.m1255j(c0288gl2, false);
                    }
                }
                if (jM1255j == -1) {
                    c0288gl.getClass();
                    adf adfVar2 = (adf) C0288gl.f860a.getAndSet(c0288gl, null);
                    return adfVar2 != null ? adfVar2 : c0288gl.m1253h();
                }
                if (jM1255j > 0) {
                    jMin = Math.min(jMin, jM1255j);
                }
            }
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.f1845e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (this.f1848h.m1905m() || this.f1843c == 5) {
                    break loop0;
                }
                adf adfVarM1894i = m1894i(this.f1847g);
                if (adfVarM1894i != null) {
                    this.f1845e = 0L;
                    int iMo1340o = adfVarM1894i.f603aa.mo1340o();
                    this.f1844d = 0L;
                    if (this.f1843c == 3) {
                        this.f1843c = 2;
                    }
                    ExecutorC0778yp executorC0778yp = this.f1848h;
                    if (iMo1340o != 0 && m1901p(2) && !executorC0778yp.m1909q() && !executorC0778yp.m1908p(executorC0778yp.controlState)) {
                        executorC0778yp.m1909q();
                    }
                    executorC0778yp.getClass();
                    try {
                        adfVarM1894i.run();
                    } catch (Throwable th) {
                        Thread threadCurrentThread = Thread.currentThread();
                        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                    }
                    if (iMo1340o != 0) {
                        ExecutorC0778yp.f1850b.addAndGet(executorC0778yp, -2097152L);
                        if (this.f1843c == 5) {
                            break;
                        }
                        this.f1843c = 4;
                        break;
                    }
                    break;
                }
                this.f1847g = false;
                if (this.f1845e != 0) {
                    if (z) {
                        m1901p(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.f1845e);
                        this.f1845e = 0L;
                        break;
                    }
                    z = true;
                } else if (this.nextParkedWorker != ExecutorC0778yp.f1852d) {
                    this.workerCtl = -1;
                    while (this.nextParkedWorker != ExecutorC0778yp.f1852d && this.workerCtl == -1 && !this.f1848h.m1905m() && this.f1843c != 5) {
                        m1901p(3);
                        Thread.interrupted();
                        if (this.f1844d == 0) {
                            this.f1844d = System.nanoTime() + this.f1848h.f1858j;
                        }
                        LockSupport.parkNanos(this.f1848h.f1858j);
                        if (System.nanoTime() - this.f1844d >= 0) {
                            this.f1844d = 0L;
                            synchronized (this.f1848h.f1855g) {
                                try {
                                    if (!this.f1848h.m1905m()) {
                                        if (((int) (this.f1848h.controlState & 2097151)) > this.f1848h.f1856h) {
                                            if (f1841a.compareAndSet(this, -1, 1)) {
                                                int i = this.indexInArray;
                                                m1899n(0);
                                                this.f1848h.m1907o(this, i, 0);
                                                int andDecrement = (int) (ExecutorC0778yp.f1850b.getAndDecrement(this.f1848h) & 2097151);
                                                if (andDecrement != i) {
                                                    Object obj = this.f1848h.f1855g.get(andDecrement);
                                                    AbstractC0399ko.m1348c(obj);
                                                    C0777yo c0777yo = (C0777yo) obj;
                                                    this.f1848h.f1855g.set(i, c0777yo);
                                                    c0777yo.m1899n(i);
                                                    this.f1848h.m1907o(c0777yo, andDecrement, i);
                                                }
                                                this.f1848h.f1855g.set(andDecrement, null);
                                                this.f1843c = 5;
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    throw th2;
                                }
                            }
                        }
                    }
                } else {
                    this.f1848h.m1906n(this);
                }
            }
        }
        m1901p(5);
    }
}
