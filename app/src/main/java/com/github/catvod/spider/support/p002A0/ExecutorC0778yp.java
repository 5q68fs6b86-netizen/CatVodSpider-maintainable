package com.github.catvod.spider.support.p002A0;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.yp */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0778yp implements Executor, Closeable {
    private volatile int _isTerminated;
    volatile long controlState;

    /* JADX INFO: renamed from: e */
    public final C0186cr f1853e;

    /* JADX INFO: renamed from: f */
    public final C0186cr f1854f;

    /* JADX INFO: renamed from: g */
    public final AtomicReferenceArray f1855g;

    /* JADX INFO: renamed from: h */
    public final int f1856h;

    /* JADX INFO: renamed from: i */
    public final int f1857i;

    /* JADX INFO: renamed from: j */
    public final long f1858j;
    private volatile long parkedWorkersStack;

    /* JADX INFO: renamed from: d */
    public static final C0737xb f1852d = new C0737xb("NOT_IN_STACK", 3);

    /* JADX INFO: renamed from: a */
    public static final AtomicLongFieldUpdater f1849a = AtomicLongFieldUpdater.newUpdater(ExecutorC0778yp.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: b */
    public static final AtomicLongFieldUpdater f1850b = AtomicLongFieldUpdater.newUpdater(ExecutorC0778yp.class, "controlState");

    /* JADX INFO: renamed from: c */
    public static final AtomicIntegerFieldUpdater f1851c = AtomicIntegerFieldUpdater.newUpdater(ExecutorC0778yp.class, "_isTerminated");

    public ExecutorC0778yp(int i, int i2, long j) {
        this.f1856h = i;
        this.f1857i = i2;
        this.f1858j = j;
        if (i < 1) {
            throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
        }
        if (!(i2 >= i)) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        if (i2 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
        }
        this.f1853e = new C0186cr();
        this.f1854f = new C0186cr();
        this.parkedWorkersStack = 0L;
        this.f1855g = new AtomicReferenceArray(i2 + 1);
        this.controlState = ((long) i) << 42;
        this._isTerminated = 0;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0084  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        adf adfVarM1894i;
        if (f1851c.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            if (!(threadCurrentThread instanceof C0777yo)) {
                threadCurrentThread = null;
            }
            C0777yo c0777yo = (C0777yo) threadCurrentThread;
            if (c0777yo == null || !AbstractC0399ko.m1347b(c0777yo.f1848h, this)) {
                c0777yo = null;
            }
            synchronized (this.f1855g) {
                i = (int) (this.controlState & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    Object obj = this.f1855g.get(i2);
                    AbstractC0399ko.m1348c(obj);
                    C0777yo c0777yo2 = (C0777yo) obj;
                    if (c0777yo2 != c0777yo) {
                        while (c0777yo2.isAlive()) {
                            LockSupport.unpark(c0777yo2);
                            c0777yo2.join(10000L);
                        }
                        C0288gl c0288gl = c0777yo2.f1842b;
                        C0186cr c0186cr = this.f1854f;
                        c0288gl.getClass();
                        adf adfVar = (adf) C0288gl.f860a.getAndSet(c0288gl, null);
                        if (adfVar != null) {
                            c0186cr.m1958b(adfVar);
                        }
                        while (true) {
                            adf adfVarM1253h = c0288gl.m1253h();
                            if (adfVarM1253h == null) {
                                break;
                            } else {
                                c0186cr.m1958b(adfVarM1253h);
                            }
                        }
                    }
                    if (i2 == i) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.f1854f.m1959c();
            this.f1853e.m1959c();
            while (true) {
                if (c0777yo == null) {
                    adfVarM1894i = (adf) this.f1853e.m1961e();
                } else {
                    adfVarM1894i = c0777yo.m1894i(true);
                    if (adfVarM1894i == null) {
                        adfVarM1894i = (adf) this.f1853e.m1961e();
                    }
                }
                if (adfVarM1894i == null) {
                    adfVarM1894i = (adf) this.f1854f.m1961e();
                }
                if (adfVarM1894i == null) {
                    break;
                }
                try {
                    adfVarM1894i.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (c0777yo != null) {
                c0777yo.m1901p(5);
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        m1904l(runnable, C0372jo.f1075g, false);
    }

    /* JADX INFO: renamed from: k */
    public final int m1903k() {
        synchronized (this.f1855g) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j = this.controlState;
            int i = (int) (j & 2097151);
            int i2 = i - ((int) ((j & 4398044413952L) >> 21));
            if (i2 < 0) {
                i2 = 0;
            }
            if (i2 >= this.f1856h) {
                return 0;
            }
            if (i >= this.f1857i) {
                return 0;
            }
            int i3 = ((int) (this.controlState & 2097151)) + 1;
            if (i3 <= 0 || this.f1855g.get(i3) != null) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            C0777yo c0777yo = new C0777yo(this, i3);
            this.f1855g.set(i3, c0777yo);
            if (i3 != ((int) (2097151 & f1850b.incrementAndGet(this)))) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            c0777yo.start();
            return i2 + 1;
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1904l(Runnable runnable, InterfaceC0394kj interfaceC0394kj, boolean z) {
        adf c0124aj;
        AbstractC0125ak.f656e.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof adf) {
            c0124aj = (adf) runnable;
            c0124aj.f604z = jNanoTime;
            c0124aj.f603aa = interfaceC0394kj;
        } else {
            c0124aj = new C0124aj(runnable, jNanoTime, interfaceC0394kj);
        }
        Thread threadCurrentThread = Thread.currentThread();
        adf adfVarM1251f = null;
        if (!(threadCurrentThread instanceof C0777yo)) {
            threadCurrentThread = null;
        }
        C0777yo c0777yo = (C0777yo) threadCurrentThread;
        if (c0777yo == null || !AbstractC0399ko.m1347b(c0777yo.f1848h, this)) {
            c0777yo = null;
        }
        if (c0777yo == null || c0777yo.f1843c == 5 || (c0124aj.f603aa.mo1340o() == 0 && c0777yo.f1843c == 2)) {
            adfVarM1251f = c0124aj;
        } else {
            c0777yo.f1847g = true;
            C0288gl c0288gl = c0777yo.f1842b;
            if (z) {
                adfVarM1251f = c0288gl.m1251f(c0124aj);
            } else {
                c0288gl.getClass();
                adf adfVar = (adf) C0288gl.f860a.getAndSet(c0288gl, c0124aj);
                if (adfVar != null) {
                    adfVarM1251f = c0288gl.m1251f(adfVar);
                }
            }
        }
        if (adfVarM1251f != null) {
            if (!(adfVarM1251f.f603aa.mo1340o() == 1 ? this.f1854f.m1958b(adfVarM1251f) : this.f1853e.m1958b(adfVarM1251f))) {
                throw new RejectedExecutionException("DefaultDispatcher was terminated");
            }
        }
        boolean z2 = z && c0777yo != null;
        if (c0124aj.f603aa.mo1340o() == 0) {
            if (z2 || m1909q() || m1908p(this.controlState)) {
                return;
            }
            m1909q();
            return;
        }
        long jAddAndGet = f1850b.addAndGet(this, 2097152L);
        if (z2 || m1909q() || m1908p(jAddAndGet)) {
            return;
        }
        m1909q();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    /* JADX INFO: renamed from: m */
    public final boolean m1905m() {
        return this._isTerminated;
    }

    /* JADX INFO: renamed from: n */
    public final void m1906n(C0777yo c0777yo) {
        long j;
        int iM1895j;
        if (c0777yo.m1896k() != f1852d) {
            return;
        }
        do {
            j = this.parkedWorkersStack;
            iM1895j = c0777yo.m1895j();
            c0777yo.m1900o(this.f1855g.get((int) (2097151 & j)));
        } while (!f1849a.compareAndSet(this, j, ((long) iM1895j) | ((2097152 + j) & (-2097152))));
    }

    /* JADX INFO: renamed from: o */
    public final void m1907o(C0777yo c0777yo, int i, int i2) {
        while (true) {
            long j = this.parkedWorkersStack;
            int iM1895j = (int) (2097151 & j);
            long j2 = (2097152 + j) & (-2097152);
            if (iM1895j == i) {
                if (i2 == 0) {
                    Object objM1896k = c0777yo.m1896k();
                    while (true) {
                        if (objM1896k == f1852d) {
                            iM1895j = -1;
                            break;
                        }
                        if (objM1896k == null) {
                            iM1895j = 0;
                            break;
                        }
                        C0777yo c0777yo2 = (C0777yo) objM1896k;
                        iM1895j = c0777yo2.m1895j();
                        if (iM1895j != 0) {
                            break;
                        } else {
                            objM1896k = c0777yo2.m1896k();
                        }
                    }
                } else {
                    iM1895j = i2;
                }
            }
            if (iM1895j >= 0 && f1849a.compareAndSet(this, j, j2 | ((long) iM1895j))) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m1908p(long j) {
        int i = ((int) (2097151 & j)) - ((int) ((j & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i2 = this.f1856h;
        if (i < i2) {
            int iM1903k = m1903k();
            if (iM1903k == 1 && i2 > 1) {
                m1903k();
            }
            if (iM1903k > 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public final boolean m1909q() {
        C0737xb c0737xb;
        int iM1895j;
        while (true) {
            long j = this.parkedWorkersStack;
            C0777yo c0777yo = (C0777yo) this.f1855g.get((int) (2097151 & j));
            if (c0777yo != null) {
                long j2 = (2097152 + j) & (-2097152);
                Object objM1896k = c0777yo.m1896k();
                while (true) {
                    c0737xb = f1852d;
                    if (objM1896k == c0737xb) {
                        iM1895j = -1;
                        break;
                    }
                    if (objM1896k == null) {
                        iM1895j = 0;
                        break;
                    }
                    C0777yo c0777yo2 = (C0777yo) objM1896k;
                    iM1895j = c0777yo2.m1895j();
                    if (iM1895j != 0) {
                        break;
                    }
                    objM1896k = c0777yo2.m1896k();
                }
                if (iM1895j >= 0 && f1849a.compareAndSet(this, j, ((long) iM1895j) | j2)) {
                    c0777yo.m1900o(c0737xb);
                }
            } else {
                c0777yo = null;
            }
            if (c0777yo == null) {
                return false;
            }
            if (C0777yo.f1841a.compareAndSet(c0777yo, -1, 0)) {
                LockSupport.unpark(c0777yo);
                return true;
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        int length = this.f1855g.length();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < length; i6++) {
            C0777yo c0777yo = (C0777yo) this.f1855g.get(i6);
            if (c0777yo != null) {
                int iM1252g = c0777yo.f1842b.m1252g();
                int iM1764h = AbstractC0710wb.m1764h(c0777yo.f1843c);
                if (iM1764h == 0) {
                    i++;
                    arrayList.add(String.valueOf(iM1252g) + "c");
                } else if (iM1764h == 1) {
                    i2++;
                    arrayList.add(String.valueOf(iM1252g) + "b");
                } else if (iM1764h == 2) {
                    i3++;
                } else if (iM1764h == 3) {
                    i4++;
                    if (iM1252g > 0) {
                        arrayList.add(String.valueOf(iM1252g) + "d");
                    }
                } else if (iM1764h == 4) {
                    i5++;
                }
            }
        }
        long j = this.controlState;
        return "DefaultDispatcher@" + AbstractC0592rs.m1647a(this) + "[Pool Size {core = " + this.f1856h + ", max = " + this.f1857i + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f1853e.m1960d() + ", global blocking queue size = " + this.f1854f.m1960d() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((4398044413952L & j) >> 21)) + ", CPUs acquired = " + (this.f1856h - ((int) ((9223367638808264704L & j) >> 42))) + "}]";
    }
}
