package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ik */
/* JADX INFO: loaded from: classes.dex */
public class C0341ik {

    /* JADX INFO: renamed from: g */
    public static final AtomicReferenceFieldUpdater f1010g = AtomicReferenceFieldUpdater.newUpdater(C0341ik.class, Object.class, "_next");

    /* JADX INFO: renamed from: h */
    public static final AtomicReferenceFieldUpdater f1011h = AtomicReferenceFieldUpdater.newUpdater(C0341ik.class, Object.class, "_prev");

    /* JADX INFO: renamed from: i */
    public static final AtomicReferenceFieldUpdater f1012i = AtomicReferenceFieldUpdater.newUpdater(C0341ik.class, Object.class, "_removedRef");
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef = null;

    /* JADX INFO: renamed from: j */
    public final C0341ik m1310j() {
        Object obj;
        while (true) {
            C0341ik c0341ik = (C0341ik) this._prev;
            C0341ik c0341ik2 = c0341ik;
            while (true) {
                C0341ik c0341ik3 = null;
                while (true) {
                    obj = c0341ik2._next;
                    if (obj == this) {
                        if (c0341ik == c0341ik2) {
                            return c0341ik2;
                        }
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1011h;
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, c0341ik, c0341ik2)) {
                            if (atomicReferenceFieldUpdater.get(this) != c0341ik) {
                                break;
                            }
                        }
                        return c0341ik2;
                    }
                    if (mo1315o()) {
                        return null;
                    }
                    if (obj == null) {
                        return c0341ik2;
                    }
                    if (obj instanceof AbstractC0755xt) {
                        ((AbstractC0755xt) obj).mo1574b(c0341ik2);
                        break;
                    }
                    if (obj instanceof C0299gw) {
                        if (c0341ik3 != null) {
                            break;
                        }
                        c0341ik2 = (C0341ik) c0341ik2._prev;
                    } else {
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                        c0341ik3 = c0341ik2;
                        c0341ik2 = (C0341ik) obj;
                    }
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1010g;
                C0341ik c0341ik4 = ((C0299gw) obj).f877a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(c0341ik3, c0341ik2, c0341ik4)) {
                    if (atomicReferenceFieldUpdater2.get(c0341ik3) != c0341ik2) {
                        break;
                    }
                }
                c0341ik2 = c0341ik3;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m1311k(C0341ik c0341ik) {
        while (true) {
            C0341ik c0341ik2 = (C0341ik) c0341ik._prev;
            if (m1312l() != c0341ik) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1011h;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c0341ik, c0341ik2, this)) {
                    if (mo1315o()) {
                        c0341ik.m1310j();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c0341ik) == c0341ik2);
        }
    }

    /* JADX INFO: renamed from: l */
    public final Object m1312l() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof AbstractC0755xt)) {
                return obj;
            }
            ((AbstractC0755xt) obj).mo1574b(this);
        }
    }

    /* JADX INFO: renamed from: m */
    public final C0341ik m1313m() {
        C0341ik c0341ik;
        Object objM1312l = m1312l();
        C0299gw c0299gw = (C0299gw) (!(objM1312l instanceof C0299gw) ? null : objM1312l);
        if (c0299gw != null && (c0341ik = c0299gw.f877a) != null) {
            return c0341ik;
        }
        if (objM1312l != null) {
            return (C0341ik) objM1312l;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
    }

    /* JADX INFO: renamed from: n */
    public final C0341ik m1314n() {
        C0341ik c0341ikM1310j = m1310j();
        if (c0341ikM1310j == null) {
            Object obj = this._prev;
            while (true) {
                c0341ikM1310j = (C0341ik) obj;
                if (!c0341ikM1310j.mo1315o()) {
                    break;
                }
                obj = c0341ikM1310j._prev;
            }
        }
        return c0341ikM1310j;
    }

    /* JADX INFO: renamed from: o */
    public boolean mo1315o() {
        return m1312l() instanceof C0299gw;
    }

    /* JADX INFO: renamed from: p */
    public final void m1316p() {
        while (true) {
            Object objM1312l = m1312l();
            if (objM1312l instanceof C0299gw) {
                C0341ik c0341ik = ((C0299gw) objM1312l).f877a;
                return;
            }
            if (objM1312l == this) {
                return;
            }
            if (objM1312l == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
            C0341ik c0341ik2 = (C0341ik) objM1312l;
            C0299gw c0299gw = (C0299gw) c0341ik2._removedRef;
            if (c0299gw == null) {
                c0299gw = new C0299gw(c0341ik2);
                f1012i.lazySet(c0341ik2, c0299gw);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1010g;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, objM1312l, c0299gw)) {
                    c0341ik2.m1310j();
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == objM1312l);
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }
}
