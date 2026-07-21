package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.sa */
/* JADX INFO: loaded from: classes.dex */
public class C0601sa extends acw implements InterfaceC0599rz, InterfaceC0785yw {

    /* JADX INFO: renamed from: d */
    public static final AtomicIntegerFieldUpdater f1462d = AtomicIntegerFieldUpdater.newUpdater(C0601sa.class, "_decision");

    /* JADX INFO: renamed from: e */
    public static final AtomicReferenceFieldUpdater f1463e = AtomicReferenceFieldUpdater.newUpdater(C0601sa.class, Object.class, "_state");
    private volatile int _decision;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: renamed from: f */
    public final InterfaceC0769yg f1464f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0747xl f1465g;

    public C0601sa(InterfaceC0747xl interfaceC0747xl) {
        super(1);
        this.f1465g = interfaceC0747xl;
        this.f1464f = interfaceC0747xl.getContext();
        this._decision = 0;
        this._state = C0532pm.f1368a;
        this._parentHandle = null;
    }

    /* JADX INFO: renamed from: h */
    public static void m1649h(InterfaceC0569qw interfaceC0569qw, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + interfaceC0569qw + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: i */
    public static void m1650i(C0601sa c0601sa, Object obj, int i) {
        Object c0645tr;
        while (true) {
            Object obj2 = c0601sa._state;
            if (!(obj2 instanceof InterfaceC0282gf)) {
                if (obj2 instanceof C0602sb) {
                    C0602sb c0602sb = (C0602sb) obj2;
                    c0602sb.getClass();
                    if (C0602sb.f1466a.compareAndSet(c0602sb, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            InterfaceC0282gf interfaceC0282gf = (InterfaceC0282gf) obj2;
            if (!(obj instanceof C0647tt) && AbstractC0314hk.m1277a(i) && (interfaceC0282gf instanceof adq)) {
                if (!(interfaceC0282gf instanceof adq)) {
                    interfaceC0282gf = null;
                }
                c0645tr = new C0645tr(obj, (adq) interfaceC0282gf, null, 16);
            } else {
                c0645tr = obj;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1463e;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c0601sa, obj2, c0645tr)) {
                    InterfaceC0747xl interfaceC0747xl = c0601sa.f1465g;
                    if (!(interfaceC0747xl instanceof acu) || !((acu) interfaceC0747xl).m957h(c0601sa)) {
                        c0601sa.m1654r();
                    }
                    c0601sa.m1655s(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c0601sa) == obj2);
        }
    }

    /* JADX INFO: renamed from: b */
    public Throwable mo1456b(InterfaceC0483nr interfaceC0483nr) {
        return ((C0150bi) interfaceC0483nr).m1044q();
    }

    /* JADX INFO: renamed from: c */
    public String mo1457c() {
        return "CancellableContinuation";
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0747xl
    public final InterfaceC0769yg getContext() {
        return this.f1464f;
    }

    @Override // com.github.catvod.spider.support.p002A0.acw
    /* JADX INFO: renamed from: j */
    public final void mo959j(Object obj, CancellationException cancellationException) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof InterfaceC0282gf) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof C0647tt) {
                return;
            }
            if (!(obj2 instanceof C0645tr)) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1463e;
                C0645tr c0645tr = new C0645tr(obj2, null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c0645tr)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            C0645tr c0645tr2 = (C0645tr) obj2;
            if (c0645tr2.f1562e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0645tr c0645trM1727f = C0645tr.m1727f(c0645tr2, null, cancellationException, 15);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1463e;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c0645trM1727f)) {
                    adq adqVar = c0645tr2.f1559b;
                    if (adqVar != null) {
                        m1651o(adqVar, cancellationException);
                    }
                    InterfaceC0569qw interfaceC0569qw = c0645tr2.f1560c;
                    if (interfaceC0569qw != null) {
                        try {
                            interfaceC0569qw.invoke(cancellationException);
                            return;
                        } catch (Throwable th) {
                            AbstractC0151bj.m1054a(this.f1464f, new C0649tv("Exception in resume onCancellation handler for " + this, th));
                            return;
                        }
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater2.get(this) == obj2);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.acw
    /* JADX INFO: renamed from: k */
    public final InterfaceC0747xl mo960k() {
        return this.f1465g;
    }

    @Override // com.github.catvod.spider.support.p002A0.acw
    /* JADX INFO: renamed from: l */
    public final Throwable mo965l(Object obj) {
        Throwable thMo965l = super.mo965l(obj);
        if (thMo965l != null) {
            return thMo965l;
        }
        return null;
    }

    @Override // com.github.catvod.spider.support.p002A0.acw
    /* JADX INFO: renamed from: m */
    public final Object mo966m(Object obj) {
        return obj instanceof C0645tr ? ((C0645tr) obj).f1558a : obj;
    }

    @Override // com.github.catvod.spider.support.p002A0.acw
    /* JADX INFO: renamed from: n */
    public final Object mo961n() {
        return this._state;
    }

    /* JADX INFO: renamed from: o */
    public final void m1651o(adq adqVar, Throwable th) {
        try {
            adqVar.m991c(th);
        } catch (Throwable th2) {
            AbstractC0151bj.m1054a(this.f1464f, new C0649tv("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m1652p(InterfaceC0569qw interfaceC0569qw, Throwable th) {
        try {
            interfaceC0569qw.invoke(th);
        } catch (Throwable th2) {
            AbstractC0151bj.m1054a(this.f1464f, new C0649tv("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m1653q(Throwable th) {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof InterfaceC0282gf)) {
                return;
            }
            boolean z = obj instanceof adq;
            C0602sb c0602sb = new C0602sb(this, th, z);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1463e;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0602sb)) {
                    if (!z) {
                        obj = null;
                    }
                    adq adqVar = (adq) obj;
                    if (adqVar != null) {
                        m1651o(adqVar, th);
                    }
                    InterfaceC0747xl interfaceC0747xl = this.f1465g;
                    if (!(interfaceC0747xl instanceof acu) || !((acu) interfaceC0747xl).m957h(this)) {
                        m1654r();
                    }
                    m1655s(this.f586x);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m1654r() {
        adh adhVar = (adh) this._parentHandle;
        if (adhVar != null) {
            adhVar.mo990b();
        }
        this._parentHandle = C0438m.f1211a;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0747xl
    public final void resumeWith(Object obj) {
        Throwable thM1752b = C0705vx.m1752b(obj);
        if (thM1752b != null) {
            obj = new C0647tt(thM1752b, false);
        }
        m1650i(this, obj, this.f586x);
    }

    /* JADX INFO: renamed from: s */
    public final void m1655s(int i) {
        do {
            int i2 = this._decision;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                InterfaceC0747xl interfaceC0747xl = this.f1465g;
                boolean z = i == 4;
                if (z || !(interfaceC0747xl instanceof acu) || AbstractC0314hk.m1277a(i) != AbstractC0314hk.m1277a(this.f586x)) {
                    AbstractC0314hk.m1278b(this, interfaceC0747xl, z);
                    return;
                }
                AbstractC0775ym abstractC0775ym = ((acu) interfaceC0747xl).f583d;
                InterfaceC0769yg context = ((acu) interfaceC0747xl).f584e.getContext();
                if (abstractC0775ym.mo1217g()) {
                    abstractC0775ym.mo1146e(context, this);
                    return;
                }
                AbstractC0240er abstractC0240erM917b = abk.m917b();
                if (abstractC0240erM917b.f789m >= 4294967296L) {
                    abstractC0240erM917b.m1200r(this);
                    return;
                }
                abstractC0240erM917b.m1201t(true);
                try {
                    AbstractC0314hk.m1278b(this, this.f1465g, true);
                    do {
                    } while (abstractC0240erM917b.m1202u());
                } catch (Throwable th) {
                    try {
                        m967y(th, null);
                    } finally {
                        abstractC0240erM917b.m1199q();
                    }
                }
                return;
            }
        } while (!f1462d.compareAndSet(this, 0, 2));
    }

    /* JADX INFO: renamed from: t */
    public final Object m1656t() throws Throwable {
        InterfaceC0483nr interfaceC0483nr;
        m1659w();
        do {
            int i = this._decision;
            if (i != 0) {
                if (i != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object obj = this._state;
                if (obj instanceof C0647tt) {
                    throw ((C0647tt) obj).f1565c;
                }
                if (!AbstractC0314hk.m1277a(this.f586x) || (interfaceC0483nr = (InterfaceC0483nr) this.f1464f.get(InterfaceC0483nr.f1290aj)) == null || interfaceC0483nr.mo1035f()) {
                    return mo966m(obj);
                }
                CancellationException cancellationExceptionM1044q = ((C0150bi) interfaceC0483nr).m1044q();
                mo959j(obj, cancellationExceptionM1044q);
                throw cancellationExceptionM1044q;
            }
        } while (!f1462d.compareAndSet(this, 0, 1));
        return EnumC0781ys.f1859a;
    }

    public final String toString() {
        return mo1457c() + '(' + AbstractC0592rs.m1648b(this.f1465g) + "){" + this._state + "}@" + AbstractC0592rs.m1647a(this);
    }

    /* JADX INFO: renamed from: u */
    public final void m1657u(InterfaceC0569qw interfaceC0569qw) {
        adq adqVar = interfaceC0569qw instanceof adq ? (adq) interfaceC0569qw : new adq(1, interfaceC0569qw);
        while (true) {
            Object obj = this._state;
            if (obj instanceof C0532pm) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1463e;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, adqVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            if (obj instanceof adq) {
                m1649h(interfaceC0569qw, obj);
                throw null;
            }
            if (obj instanceof C0647tt) {
                C0647tt c0647tt = (C0647tt) obj;
                c0647tt.getClass();
                if (!C0647tt.f1564b.compareAndSet(c0647tt, 0, 1)) {
                    m1649h(interfaceC0569qw, obj);
                    throw null;
                }
                if (obj instanceof C0602sb) {
                    if (!(obj instanceof C0647tt)) {
                        obj = null;
                    }
                    C0647tt c0647tt2 = (C0647tt) obj;
                    m1652p(interfaceC0569qw, c0647tt2 != null ? c0647tt2.f1565c : null);
                    return;
                }
                return;
            }
            if (!(obj instanceof C0645tr)) {
                C0645tr c0645tr = new C0645tr(obj, adqVar, null, 28);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f1463e;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj, c0645tr)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                    }
                }
                return;
            }
            C0645tr c0645tr2 = (C0645tr) obj;
            if (c0645tr2.f1559b != null) {
                m1649h(interfaceC0569qw, obj);
                throw null;
            }
            Throwable th = c0645tr2.f1562e;
            if (th != null) {
                m1652p(interfaceC0569qw, th);
                return;
            }
            C0645tr c0645trM1727f = C0645tr.m1727f(c0645tr2, adqVar, null, 29);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f1463e;
            while (!atomicReferenceFieldUpdater3.compareAndSet(this, obj, c0645trM1727f)) {
                if (atomicReferenceFieldUpdater3.get(this) != obj) {
                }
            }
            return;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m1658v(AbstractC0775ym abstractC0775ym) {
        C0372jo c0372jo = C0372jo.f1077i;
        InterfaceC0747xl interfaceC0747xl = this.f1465g;
        if (!(interfaceC0747xl instanceof acu)) {
            interfaceC0747xl = null;
        }
        acu acuVar = (acu) interfaceC0747xl;
        m1650i(this, c0372jo, (acuVar != null ? acuVar.f583d : null) == abstractC0775ym ? 4 : this.f586x);
    }

    /* JADX INFO: renamed from: w */
    public final void m1659w() {
        InterfaceC0483nr interfaceC0483nr;
        Throwable thM955f;
        boolean z = this._state instanceof InterfaceC0282gf;
        boolean z2 = !z;
        if (this.f586x == 2) {
            InterfaceC0747xl interfaceC0747xl = this.f1465g;
            if (!(interfaceC0747xl instanceof acu)) {
                interfaceC0747xl = null;
            }
            acu acuVar = (acu) interfaceC0747xl;
            if (acuVar != null && (thM955f = acuVar.m955f(this)) != null) {
                if (z) {
                    m1653q(thM955f);
                }
                z2 = true;
            }
        }
        if (z2 || ((adh) this._parentHandle) != null || (interfaceC0483nr = (InterfaceC0483nr) this.f1465g.getContext().get(InterfaceC0483nr.f1290aj)) == null) {
            return;
        }
        adh adhVarM1060a = AbstractC0156bo.m1060a(interfaceC0483nr, true, new C0608sh(interfaceC0483nr, this), 2);
        this._parentHandle = adhVarM1060a;
        if (this._state instanceof InterfaceC0282gf) {
            return;
        }
        InterfaceC0747xl interfaceC0747xl2 = this.f1465g;
        if ((interfaceC0747xl2 instanceof acu) && ((acu) interfaceC0747xl2).m957h(this)) {
            return;
        }
        adhVarM1060a.mo990b();
        this._parentHandle = C0438m.f1211a;
    }
}
