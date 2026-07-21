package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.oi */
/* JADX INFO: loaded from: classes.dex */
public final class C0501oi {
    private volatile Object _next = null;
    private volatile long _state = 0;

    /* JADX INFO: renamed from: d */
    public final int f1330d;

    /* JADX INFO: renamed from: e */
    public final AtomicReferenceArray f1331e;

    /* JADX INFO: renamed from: f */
    public final int f1332f;

    /* JADX INFO: renamed from: g */
    public final boolean f1333g;

    /* JADX INFO: renamed from: c */
    public static final C0737xb f1329c = new C0737xb("REMOVE_FROZEN", 3);

    /* JADX INFO: renamed from: a */
    public static final AtomicReferenceFieldUpdater f1327a = AtomicReferenceFieldUpdater.newUpdater(C0501oi.class, Object.class, "_next");

    /* JADX INFO: renamed from: b */
    public static final AtomicLongFieldUpdater f1328b = AtomicLongFieldUpdater.newUpdater(C0501oi.class, "_state");

    public C0501oi(int i, boolean z) {
        this.f1332f = i;
        this.f1333g = z;
        int i2 = i - 1;
        this.f1330d = i2;
        this.f1331e = new AtomicReferenceArray(i);
        if (!(i2 <= 1073741823)) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i2) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    /* JADX INFO: renamed from: h */
    public final int m1481h(Object obj) {
        while (true) {
            long j = this._state;
            if ((3458764513820540928L & j) != 0) {
                return (2305843009213693952L & j) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f1330d;
            if (((i2 + 2) & i3) == (i & i3)) {
                return 1;
            }
            if (!this.f1333g && this.f1331e.get(i2 & i3) != null) {
                int i4 = this.f1332f;
                if (i4 < 1024 || ((i2 - i) & 1073741823) > (i4 >> 1)) {
                    return 1;
                }
            } else if (f1328b.compareAndSet(this, j, ((-1152921503533105153L) & j) | (((long) ((i2 + 1) & 1073741823)) << 30))) {
                this.f1331e.set(i2 & i3, obj);
                C0501oi c0501oiM1485l = this;
                while ((c0501oiM1485l._state & 1152921504606846976L) != 0) {
                    c0501oiM1485l = c0501oiM1485l.m1485l();
                    AtomicReferenceArray atomicReferenceArray = c0501oiM1485l.f1331e;
                    int i5 = c0501oiM1485l.f1330d & i2;
                    Object obj2 = atomicReferenceArray.get(i5);
                    if ((obj2 instanceof C0322hs) && ((C0322hs) obj2).f930a == i2) {
                        atomicReferenceArray.set(i5, obj);
                    } else {
                        c0501oiM1485l = null;
                    }
                    if (c0501oiM1485l == null) {
                        return 0;
                    }
                }
                return 0;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1482i() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f1328b.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* JADX INFO: renamed from: j */
    public final int m1483j() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1484k() {
        long j = this._state;
        return ((int) (1073741823 & j)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* JADX INFO: renamed from: l */
    public final C0501oi m1485l() {
        long j;
        while (true) {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                break;
            }
            long j2 = j | 1152921504606846976L;
            if (f1328b.compareAndSet(this, j, j2)) {
                j = j2;
                break;
            }
        }
        while (true) {
            C0501oi c0501oi = (C0501oi) this._next;
            if (c0501oi != null) {
                return c0501oi;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1327a;
            C0501oi c0501oi2 = new C0501oi(this.f1332f * 2, this.f1333g);
            int i = (int) (1073741823 & j);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            while (true) {
                int i3 = this.f1330d;
                int i4 = i & i3;
                if (i4 == (i3 & i2)) {
                    break;
                }
                Object c0322hs = this.f1331e.get(i4);
                if (c0322hs == null) {
                    c0322hs = new C0322hs(i);
                }
                c0501oi2.f1331e.set(c0501oi2.f1330d & i, c0322hs);
                i++;
            }
            c0501oi2._state = (-1152921504606846977L) & j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c0501oi2) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final Object m1486m() {
        while (true) {
            long j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return f1329c;
            }
            int i = (int) (j & 1073741823);
            int i2 = this.f1330d;
            int i3 = ((int) ((1152921503533105152L & j) >> 30)) & i2;
            int i4 = i2 & i;
            if (i3 == i4) {
                return null;
            }
            Object obj = this.f1331e.get(i4);
            if (obj == null) {
                if (this.f1333g) {
                    return null;
                }
            } else {
                if (obj instanceof C0322hs) {
                    return null;
                }
                long j2 = (i + 1) & 1073741823;
                if (f1328b.compareAndSet(this, j, (j & (-1073741824)) | j2)) {
                    this.f1331e.set(this.f1330d & i, null);
                    return obj;
                }
                if (this.f1333g) {
                    C0501oi c0501oiM1485l = this;
                    while (true) {
                        long j3 = c0501oiM1485l._state;
                        int i5 = (int) (j3 & 1073741823);
                        if ((j3 & 1152921504606846976L) != 0) {
                            c0501oiM1485l = c0501oiM1485l.m1485l();
                        } else {
                            if (f1328b.compareAndSet(c0501oiM1485l, j3, (j3 & (-1073741824)) | j2)) {
                                c0501oiM1485l.f1331e.set(c0501oiM1485l.f1330d & i5, null);
                                c0501oiM1485l = null;
                            } else {
                                continue;
                            }
                        }
                        if (c0501oiM1485l == null) {
                            return obj;
                        }
                    }
                }
            }
        }
    }
}
