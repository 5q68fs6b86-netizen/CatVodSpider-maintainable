package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class acu extends acw implements InterfaceC0785yw, InterfaceC0747xl {

    /* JADX INFO: renamed from: a */
    public static final AtomicReferenceFieldUpdater f580a = AtomicReferenceFieldUpdater.newUpdater(acu.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: b */
    public Object f581b;

    /* JADX INFO: renamed from: c */
    public final Object f582c;

    /* JADX INFO: renamed from: d */
    public final AbstractC0775ym f583d;

    /* JADX INFO: renamed from: e */
    public final AbstractC0748xm f584e;

    public acu(AbstractC0775ym abstractC0775ym, AbstractC0748xm abstractC0748xm) {
        super(-1);
        this.f583d = abstractC0775ym;
        this.f584e = abstractC0748xm;
        this.f581b = AbstractC0552qf.f1400a;
        Object objFold = abstractC0748xm.getContext().fold(0, C0632te.f1528c);
        AbstractC0399ko.m1348c(objFold);
        this.f582c = objFold;
        this._reusableCancellableContinuation = null;
    }

    /* JADX INFO: renamed from: f */
    public final Throwable m955f(C0601sa c0601sa) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C0737xb c0737xb = AbstractC0552qf.f1401b;
            if (obj == c0737xb) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f580a;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c0737xb, c0601sa)) {
                    if (atomicReferenceFieldUpdater.get(this) != c0737xb) {
                    }
                }
                return null;
            }
            if (obj == null) {
                return null;
            }
            if (!(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f580a;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
            }
            return (Throwable) obj;
        }
    }

    /* JADX INFO: renamed from: g */
    public final C0601sa m956g() {
        Object obj = this._reusableCancellableContinuation;
        if (!(obj instanceof C0601sa)) {
            obj = null;
        }
        return (C0601sa) obj;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0747xl
    public final InterfaceC0769yg getContext() {
        return this.f584e.getContext();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m957h(C0601sa c0601sa) {
        Object obj = this._reusableCancellableContinuation;
        if (obj != null) {
            return !(obj instanceof C0601sa) || obj == c0601sa;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m958i(Throwable th) {
        while (true) {
            Object obj = this._reusableCancellableContinuation;
            C0737xb c0737xb = AbstractC0552qf.f1401b;
            if (AbstractC0399ko.m1347b(obj, c0737xb)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f580a;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, c0737xb, th)) {
                    if (atomicReferenceFieldUpdater.get(this) != c0737xb) {
                    }
                }
                return true;
            }
            if (obj instanceof Throwable) {
                return true;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f580a;
            while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                if (atomicReferenceFieldUpdater2.get(this) != obj) {
                }
            }
            return false;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.acw
    /* JADX INFO: renamed from: j */
    public final void mo959j(Object obj, CancellationException cancellationException) {
        if (obj instanceof AbstractC0648tu) {
            ((AbstractC0648tu) obj).getClass();
            throw null;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.acw
    /* JADX INFO: renamed from: k */
    public final InterfaceC0747xl mo960k() {
        return this;
    }

    @Override // com.github.catvod.spider.support.p002A0.acw
    /* JADX INFO: renamed from: n */
    public final Object mo961n() {
        Object obj = this.f581b;
        this.f581b = AbstractC0552qf.f1400a;
        return obj;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0747xl
    public final void resumeWith(Object obj) {
        AbstractC0748xm abstractC0748xm = this.f584e;
        InterfaceC0769yg context = abstractC0748xm.getContext();
        Throwable thM1752b = C0705vx.m1752b(obj);
        Object c0647tt = thM1752b == null ? obj : new C0647tt(thM1752b, false);
        AbstractC0775ym abstractC0775ym = this.f583d;
        if (abstractC0775ym.mo1217g()) {
            this.f581b = c0647tt;
            this.f586x = 0;
            abstractC0775ym.mo1146e(context, this);
            return;
        }
        AbstractC0240er abstractC0240erM917b = abk.m917b();
        if (abstractC0240erM917b.f789m >= 4294967296L) {
            this.f581b = c0647tt;
            this.f586x = 0;
            abstractC0240erM917b.m1200r(this);
            return;
        }
        abstractC0240erM917b.m1201t(true);
        try {
            InterfaceC0769yg context2 = abstractC0748xm.getContext();
            Object objM1957d = AbstractC0807zr.m1957d(context2, this.f582c);
            try {
                abstractC0748xm.resumeWith(obj);
                AbstractC0807zr.m1956c(context2, objM1957d);
                while (abstractC0240erM917b.m1202u()) {
                }
            } catch (Throwable th) {
                AbstractC0807zr.m1956c(context2, objM1957d);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                m967y(th2, null);
            } finally {
                abstractC0240erM917b.m1199q();
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f583d + ", " + AbstractC0592rs.m1648b(this.f584e) + ']';
    }
}
