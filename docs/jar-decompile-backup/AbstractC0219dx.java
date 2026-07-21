package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.dx */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0219dx extends AbstractC0240er implements acp {

    /* JADX INFO: renamed from: a */
    public static final AtomicReferenceFieldUpdater f758a = AtomicReferenceFieldUpdater.newUpdater(AbstractC0219dx.class, Object.class, "_queue");

    /* JADX INFO: renamed from: b */
    public static final AtomicReferenceFieldUpdater f759b = AtomicReferenceFieldUpdater.newUpdater(AbstractC0219dx.class, Object.class, "_delayed");
    private volatile Object _queue = null;
    private volatile Object _delayed = null;
    private volatile int _isCompleted = 0;

    /* JADX INFO: renamed from: _a */
    public final void m1145_a(adf adfVar) {
        if (!m1148h(adfVar)) {
            acj.f562x.m1145_a(adfVar);
            return;
        }
        Thread threadMo948s = mo948s();
        if (Thread.currentThread() != threadMo948s) {
            LockSupport.unpark(threadMo948s);
        }
    }

    /* JADX INFO: renamed from: c */
    public adh mo947c(long j, RunnableC0140az runnableC0140az, InterfaceC0769yg interfaceC0769yg) {
        return ack.f563a.mo947c(j, runnableC0140az, interfaceC0769yg);
    }

    @Override // com.github.catvod.spider.support.p002A0.acp
    /* JADX INFO: renamed from: d */
    public final void mo951d(long j, C0601sa c0601sa) {
        long j2 = 0;
        if (j > 0) {
            j2 = j >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j;
        }
        if (j2 < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            C0217dv c0217dv = new C0217dv(this, j2 + jNanoTime, c0601sa);
            c0601sa.m1657u(new adq(0, c0217dv));
            m1152l(jNanoTime, c0217dv);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0775ym
    /* JADX INFO: renamed from: e */
    public final void mo1146e(InterfaceC0769yg interfaceC0769yg, acw acwVar) {
        m1145_a(acwVar);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0240er
    /* JADX INFO: renamed from: f */
    public final void mo1147f() {
        AbstractRunnableC0494ob abstractRunnableC0494obM1248g;
        abk.f523a.set(null);
        this._isCompleted = 1;
        loop0: while (true) {
            Object obj = this._queue;
            C0737xb c0737xb = AbstractC0611sk.f1494b;
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f758a;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, c0737xb)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else {
                if (obj instanceof C0501oi) {
                    ((C0501oi) obj).m1482i();
                    break;
                }
                if (obj == c0737xb) {
                    break;
                }
                C0501oi c0501oi = new C0501oi(8, true);
                c0501oi.m1481h((Runnable) obj);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f758a;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, c0501oi)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
        }
        while (m1150j() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            C0419lh c0419lh = (C0419lh) this._delayed;
            if (c0419lh == null || (abstractRunnableC0494obM1248g = c0419lh.m1248g()) == null) {
                return;
            } else {
                AbstractC0240er.m1198p(jNanoTime, abstractRunnableC0494obM1248g);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m1148h(Runnable runnable) {
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f758a;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof C0501oi)) {
                if (obj == AbstractC0611sk.f1494b) {
                    return false;
                }
                C0501oi c0501oi = new C0501oi(8, true);
                c0501oi.m1481h((Runnable) obj);
                c0501oi.m1481h(runnable);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f758a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c0501oi)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    }
                }
                return true;
            }
            C0501oi c0501oi2 = (C0501oi) obj;
            int iM1481h = c0501oi2.m1481h(runnable);
            if (iM1481h == 0) {
                return true;
            }
            if (iM1481h == 1) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f758a;
                C0501oi c0501oiM1485l = c0501oi2.m1485l();
                while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, c0501oiM1485l) && atomicReferenceFieldUpdater3.get(this) == obj) {
                }
            } else if (iM1481h == 2) {
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1149i() {
        C0544py c0544py = this.f791o;
        if (!(c0544py == null || c0544py.f1387b == c0544py.f1388c)) {
            return false;
        }
        C0419lh c0419lh = (C0419lh) this._delayed;
        if (c0419lh != null && !c0419lh.m1244c()) {
            return false;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (obj instanceof C0501oi) {
                return ((C0501oi) obj).m1484k();
            }
            if (obj != AbstractC0611sk.f1494b) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x009e  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ce  */
    /* JADX INFO: renamed from: j */
    public final long m1150j() {
        long j;
        C0419lh c0419lh;
        AbstractRunnableC0494ob abstractRunnableC0494obM1245d;
        long jNanoTime;
        AbstractRunnableC0494ob abstractRunnableC0494obM1247f;
        if (m1202u()) {
            return 0L;
        }
        C0419lh c0419lh2 = (C0419lh) this._delayed;
        Runnable runnable = null;
        if (c0419lh2 != null && !c0419lh2.m1244c()) {
            long jNanoTime2 = System.nanoTime();
            do {
                synchronized (c0419lh2) {
                    try {
                        AbstractRunnableC0494ob[] abstractRunnableC0494obArr = c0419lh2.f856a;
                        AbstractRunnableC0494ob abstractRunnableC0494ob = abstractRunnableC0494obArr != null ? abstractRunnableC0494obArr[0] : null;
                        if (abstractRunnableC0494ob != null) {
                            abstractRunnableC0494obM1247f = ((jNanoTime2 - abstractRunnableC0494ob.f1323f) > 0L ? 1 : ((jNanoTime2 - abstractRunnableC0494ob.f1323f) == 0L ? 0 : -1)) >= 0 ? m1148h(abstractRunnableC0494ob) : false ? c0419lh2.m1247f(0) : null;
                        } else {
                            abstractRunnableC0494obM1247f = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } while (abstractRunnableC0494obM1247f != null);
        }
        loop1: while (true) {
            Object obj = this._queue;
            if (obj == null) {
                break;
            }
            if (obj instanceof C0501oi) {
                C0501oi c0501oi = (C0501oi) obj;
                Object objM1486m = c0501oi.m1486m();
                if (objM1486m != C0501oi.f1329c) {
                    runnable = (Runnable) objM1486m;
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f758a;
                C0501oi c0501oiM1485l = c0501oi.m1485l();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0501oiM1485l) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else {
                if (obj == AbstractC0611sk.f1494b) {
                    break;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f758a;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                        runnable = (Runnable) obj;
                        break loop1;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        C0544py c0544py = this.f791o;
        if (c0544py == null) {
            j = Long.MAX_VALUE;
        } else {
            if (c0544py.f1387b == c0544py.f1388c) {
                j = Long.MAX_VALUE;
            } else {
                j = 0;
            }
        }
        if (j == 0) {
            return 0L;
        }
        Object obj2 = this._queue;
        if (obj2 == null) {
            c0419lh = (C0419lh) this._delayed;
            if (c0419lh != null) {
                jNanoTime = abstractRunnableC0494obM1245d.f1323f - System.nanoTime();
                if (jNanoTime < 0) {
                    return 0L;
                }
                return jNanoTime;
            }
        } else if (obj2 instanceof C0501oi) {
            if (!((C0501oi) obj2).m1484k()) {
                return 0L;
            }
            c0419lh = (C0419lh) this._delayed;
            if (c0419lh != null && (abstractRunnableC0494obM1245d = c0419lh.m1245d()) != null) {
                jNanoTime = abstractRunnableC0494obM1245d.f1323f - System.nanoTime();
                if (jNanoTime < 0) {
                    return 0L;
                }
                return jNanoTime;
            }
        } else if (obj2 != AbstractC0611sk.f1494b) {
            return 0L;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: k */
    public final void m1151k() {
        this._queue = null;
        this._delayed = null;
    }

    /* JADX INFO: renamed from: l */
    public final void m1152l(long j, AbstractRunnableC0494ob abstractRunnableC0494ob) {
        char c;
        Thread threadMo948s;
        if (this._isCompleted == 0) {
            C0419lh c0419lh = (C0419lh) this._delayed;
            if (c0419lh == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f759b;
                C0419lh c0419lh2 = new C0419lh();
                c0419lh2.f1153j = j;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0419lh2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = this._delayed;
                AbstractC0399ko.m1348c(obj);
                c0419lh = (C0419lh) obj;
            }
            synchronized (abstractRunnableC0494ob) {
                if (abstractRunnableC0494ob.f1321d == AbstractC0611sk.f1493a) {
                    c = 2;
                } else {
                    synchronized (c0419lh) {
                        try {
                            AbstractRunnableC0494ob[] abstractRunnableC0494obArr = c0419lh.f856a;
                            c = 0;
                            AbstractRunnableC0494ob abstractRunnableC0494ob2 = abstractRunnableC0494obArr != null ? abstractRunnableC0494obArr[0] : null;
                            if (this._isCompleted != 0) {
                                c = 1;
                            } else {
                                if (abstractRunnableC0494ob2 == null) {
                                    c0419lh.f1153j = j;
                                } else {
                                    long j2 = abstractRunnableC0494ob2.f1323f;
                                    if (j2 - j >= 0) {
                                        j2 = j;
                                    }
                                    if (j2 - c0419lh.f1153j > 0) {
                                        c0419lh.f1153j = j2;
                                    }
                                }
                                long j3 = abstractRunnableC0494ob.f1323f;
                                long j4 = c0419lh.f1153j;
                                if (j3 - j4 < 0) {
                                    abstractRunnableC0494ob.f1323f = j4;
                                }
                                c0419lh.m1243b(abstractRunnableC0494ob);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        } else {
            c = 1;
        }
        if (c != 0) {
            if (c == 1) {
                AbstractC0240er.m1198p(j, abstractRunnableC0494ob);
                return;
            } else {
                if (c != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        C0419lh c0419lh3 = (C0419lh) this._delayed;
        if ((c0419lh3 != null ? c0419lh3.m1245d() : null) != abstractRunnableC0494ob || Thread.currentThread() == (threadMo948s = mo948s())) {
            return;
        }
        LockSupport.unpark(threadMo948s);
    }
}
