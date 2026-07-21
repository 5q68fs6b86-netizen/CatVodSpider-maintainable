package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.bi */
/* JADX INFO: loaded from: classes.dex */
public class C0150bi implements InterfaceC0483nr, InterfaceC0678ux {

    /* JADX INFO: renamed from: c */
    public static final AtomicReferenceFieldUpdater f686c = AtomicReferenceFieldUpdater.newUpdater(C0150bi.class, Object.class, "_state");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public C0150bi(boolean z) {
        this._state = z ? AbstractC0745xj.f1810g : AbstractC0745xj.f1809f;
        this._parentHandle = null;
    }

    /* JADX INFO: renamed from: d */
    public static C0610sj m1025d(C0341ik c0341ik) {
        while (c0341ik.mo1315o()) {
            c0341ik = c0341ik.m1314n();
        }
        while (true) {
            c0341ik = c0341ik.m1313m();
            if (!c0341ik.mo1315o()) {
                if (c0341ik instanceof C0610sj) {
                    return (C0610sj) c0341ik;
                }
                if (c0341ik instanceof C0804zo) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m1026e(Object obj) {
        if (!(obj instanceof C0424lm)) {
            if (obj instanceof InterfaceC0681v) {
                return ((InterfaceC0681v) obj).mo1153d() ? "Active" : "New";
            }
            return obj instanceof C0647tt ? "Cancelled" : "Completed";
        }
        C0424lm c0424lm = (C0424lm) obj;
        if (c0424lm.m1400f()) {
            return "Cancelling";
        }
        return c0424lm.m1401g() ? "Completing" : "Active";
    }

    /* JADX INFO: renamed from: aa */
    public final Object m1027aa(Object obj) throws IllegalAccessException, InvocationTargetException {
        Object objM1034ah;
        do {
            objM1034ah = m1034ah(m1049v(), obj);
            if (objM1034ah == AbstractC0745xj.f1804a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                if (!(obj instanceof C0647tt)) {
                    obj = null;
                }
                C0647tt c0647tt = (C0647tt) obj;
                throw new IllegalStateException(str, c0647tt != null ? c0647tt.f1565c : null);
            }
        } while (objM1034ah == AbstractC0745xj.f1806c);
        return objM1034ah;
    }

    /* JADX INFO: renamed from: ab */
    public final AbstractC0465n m1028ab(AbstractC0465n abstractC0465n, boolean z) {
        if (!z) {
            return abstractC0465n;
        }
        AbstractC0465n c0597rx = (AbstractC0455mq) (!(abstractC0465n instanceof AbstractC0455mq) ? null : abstractC0465n);
        if (c0597rx == null) {
            c0597rx = new C0597rx(this, abstractC0465n);
        }
        return c0597rx;
    }

    /* JADX INFO: renamed from: ac */
    public final void m1029ac(C0804zo c0804zo, Throwable th) throws IllegalAccessException, InvocationTargetException {
        Object objM1312l = c0804zo.m1312l();
        if (objM1312l == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
        }
        C0649tv c0649tv = null;
        for (C0341ik c0341ikM1313m = (C0341ik) objM1312l; !c0341ikM1313m.equals(c0804zo); c0341ikM1313m = c0341ikM1313m.m1313m()) {
            if (c0341ikM1313m instanceof AbstractC0455mq) {
                AbstractC0465n abstractC0465n = (AbstractC0465n) c0341ikM1313m;
                try {
                    abstractC0465n.mo992f(th);
                } catch (Throwable th2) {
                    if (c0649tv != null) {
                        AbstractC0180cl.m1087a(c0649tv, th2);
                    } else {
                        c0649tv = new C0649tv("Exception in completion handler " + abstractC0465n + " for " + this, th2);
                    }
                }
            }
        }
        if (c0649tv != null) {
            mo1050w(c0649tv);
        }
        m1038k(th);
    }

    /* JADX INFO: renamed from: ad */
    public void mo1030ad(Object obj) {
    }

    /* JADX INFO: renamed from: ae */
    public void mo1031ae() {
    }

    /* JADX INFO: renamed from: af */
    public final void m1032af(AbstractC0465n abstractC0465n) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C0804zo c0804zo = new C0804zo();
        abstractC0465n.getClass();
        C0341ik.f1011h.lazySet(c0804zo, abstractC0465n);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0341ik.f1010g;
        atomicReferenceFieldUpdater2.lazySet(c0804zo, abstractC0465n);
        loop0: while (abstractC0465n.m1312l() == abstractC0465n) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(abstractC0465n, abstractC0465n, c0804zo)) {
                    c0804zo.m1311k(abstractC0465n);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(abstractC0465n) == abstractC0465n);
        }
        C0341ik c0341ikM1313m = abstractC0465n.m1313m();
        do {
            atomicReferenceFieldUpdater = f686c;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0465n, c0341ikM1313m)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC0465n);
    }

    /* JADX INFO: renamed from: ag */
    public final int m1033ag(Object obj) {
        boolean z = obj instanceof C0224eb;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f686c;
        if (z) {
            if (((C0224eb) obj).f763a) {
                return 0;
            }
            C0224eb c0224eb = AbstractC0745xj.f1810g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0224eb)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            mo1031ae();
            return 1;
        }
        if (!(obj instanceof C0345io)) {
            return 0;
        }
        C0804zo c0804zo = ((C0345io) obj).f1016a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0804zo)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        mo1031ae();
        return 1;
    }

    /* JADX INFO: renamed from: ah */
    public final Object m1034ah(Object obj, Object obj2) throws IllegalAccessException, InvocationTargetException {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        if (!(obj instanceof InterfaceC0681v)) {
            return AbstractC0745xj.f1804a;
        }
        if (((obj instanceof C0224eb) || (obj instanceof AbstractC0465n)) && !(obj instanceof C0610sj) && !(obj2 instanceof C0647tt)) {
            InterfaceC0681v interfaceC0681v = (InterfaceC0681v) obj;
            Object c0262fm = obj2 instanceof InterfaceC0681v ? new C0262fm((InterfaceC0681v) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f686c;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0681v, c0262fm)) {
                    mo1030ad(obj2);
                    m1041n(interfaceC0681v, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC0681v);
            return AbstractC0745xj.f1806c;
        }
        InterfaceC0681v interfaceC0681v2 = (InterfaceC0681v) obj;
        C0804zo c0804zoM1047t = m1047t(interfaceC0681v2);
        if (c0804zoM1047t == null) {
            return AbstractC0745xj.f1806c;
        }
        C0610sj c0610sjM1025d = null;
        C0424lm c0424lm = (C0424lm) (!(interfaceC0681v2 instanceof C0424lm) ? null : interfaceC0681v2);
        if (c0424lm == null) {
            c0424lm = new C0424lm(c0804zoM1047t, null);
        }
        synchronized (c0424lm) {
            if (c0424lm.m1401g()) {
                return AbstractC0745xj.f1804a;
            }
            c0424lm.m1404j();
            if (c0424lm != interfaceC0681v2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f686c;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0681v2, c0424lm)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC0681v2) {
                        return AbstractC0745xj.f1806c;
                    }
                }
            }
            boolean zM1400f = c0424lm.m1400f();
            C0647tt c0647tt = (C0647tt) (!(obj2 instanceof C0647tt) ? null : obj2);
            if (c0647tt != null) {
                c0424lm.m1398b(c0647tt.f1565c);
            }
            Throwable thM1399c = c0424lm.m1399c();
            if (zM1400f) {
                thM1399c = null;
            }
            if (thM1399c != null) {
                m1029ac(c0804zoM1047t, thM1399c);
            }
            C0610sj c0610sj = (C0610sj) (!(interfaceC0681v2 instanceof C0610sj) ? null : interfaceC0681v2);
            if (c0610sj != null) {
                c0610sjM1025d = c0610sj;
            } else {
                C0804zo c0804zoMo1154e = interfaceC0681v2.mo1154e();
                if (c0804zoMo1154e != null) {
                    c0610sjM1025d = m1025d(c0804zoMo1154e);
                }
            }
            if (c0610sjM1025d != null) {
                while (AbstractC0156bo.m1060a(c0610sjM1025d.f1492q, false, new C0410kz(this, c0424lm, c0610sjM1025d, obj2), 1) == C0438m.f1211a) {
                    c0610sjM1025d = m1025d(c0610sjM1025d);
                    if (c0610sjM1025d != null) {
                    }
                }
                return AbstractC0745xj.f1805b;
            }
            return m1043p(c0424lm, obj2);
        }
    }

    /* JADX INFO: renamed from: b */
    public String mo1021b() {
        return getClass().getSimpleName();
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0483nr
    /* JADX INFO: renamed from: f */
    public boolean mo1035f() {
        Object objM1049v = m1049v();
        return (objM1049v instanceof InterfaceC0681v) && ((InterfaceC0681v) objM1049v).mo1153d();
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0769yg
    public final Object fold(Object obj, InterfaceC0304ha interfaceC0304ha) {
        return interfaceC0304ha.invoke(obj, this);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m1036g(InterfaceC0681v interfaceC0681v, C0804zo c0804zo, AbstractC0465n abstractC0465n) {
        char c;
        C0808zs c0808zs = new C0808zs(abstractC0465n, this, interfaceC0681v);
        do {
            C0341ik c0341ikM1314n = c0804zo.m1314n();
            C0341ik.f1011h.lazySet(abstractC0465n, c0341ikM1314n);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0341ik.f1010g;
            atomicReferenceFieldUpdater.lazySet(abstractC0465n, c0804zo);
            c0808zs.f1916e = c0804zo;
            while (true) {
                if (atomicReferenceFieldUpdater.compareAndSet(c0341ikM1314n, c0804zo, c0808zs)) {
                    if (c0808zs.mo1574b(c0341ikM1314n) != null) {
                        c = 2;
                        break;
                    }
                    c = 1;
                    break;
                }
                if (atomicReferenceFieldUpdater.get(c0341ikM1314n) != c0804zo) {
                    c = 0;
                    break;
                }
            }
            if (c == 1) {
                return true;
            }
        } while (c != 2);
        return false;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0769yg
    public final InterfaceC0750xo get(InterfaceC0751xp interfaceC0751xp) {
        return AbstractC0513ou.m1508a(this, interfaceC0751xp);
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0750xo
    public final InterfaceC0751xp getKey() {
        return InterfaceC0483nr.f1290aj;
    }

    /* JADX INFO: renamed from: h */
    public void mo963h(Object obj) {
    }

    /* JADX INFO: renamed from: i */
    public void mo964i(Object obj) {
        mo963h(obj);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m1037j(Object obj) throws IllegalAccessException, InvocationTargetException {
        C0737xb c0737xb;
        Object objM1034ah = AbstractC0745xj.f1804a;
        if (this instanceof C0666ul) {
            do {
                Object objM1049v = m1049v();
                if (!(objM1049v instanceof InterfaceC0681v) || ((objM1049v instanceof C0424lm) && ((C0424lm) objM1049v).m1401g())) {
                    objM1034ah = AbstractC0745xj.f1804a;
                    break;
                }
                objM1034ah = m1034ah(objM1049v, new C0647tt(m1042o(obj), false));
            } while (objM1034ah == AbstractC0745xj.f1806c);
            if (objM1034ah == AbstractC0745xj.f1805b) {
                return true;
            }
        }
        if (objM1034ah == AbstractC0745xj.f1804a) {
            Throwable thM1042o = null;
            loop1: while (true) {
                Object objM1049v2 = m1049v();
                if (objM1049v2 instanceof C0424lm) {
                    synchronized (objM1049v2) {
                        if (((C0424lm) objM1049v2).m1402h()) {
                            c0737xb = AbstractC0745xj.f1807d;
                        } else {
                            boolean zM1400f = ((C0424lm) objM1049v2).m1400f();
                            if (obj != null || !zM1400f) {
                                if (thM1042o == null) {
                                    thM1042o = m1042o(obj);
                                }
                                ((C0424lm) objM1049v2).m1398b(thM1042o);
                            }
                            Throwable thM1399c = zM1400f ? null : ((C0424lm) objM1049v2).m1399c();
                            if (thM1399c != null) {
                                m1029ac(((C0424lm) objM1049v2).f1159a, thM1399c);
                            }
                            c0737xb = AbstractC0745xj.f1804a;
                        }
                    }
                } else if (objM1049v2 instanceof InterfaceC0681v) {
                    if (thM1042o == null) {
                        thM1042o = m1042o(obj);
                    }
                    InterfaceC0681v interfaceC0681v = (InterfaceC0681v) objM1049v2;
                    if (interfaceC0681v.mo1153d()) {
                        C0804zo c0804zoM1047t = m1047t(interfaceC0681v);
                        if (c0804zoM1047t != null) {
                            C0424lm c0424lm = new C0424lm(c0804zoM1047t, thM1042o);
                            while (true) {
                                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f686c;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0681v, c0424lm)) {
                                    m1029ac(c0804zoM1047t, thM1042o);
                                    c0737xb = AbstractC0745xj.f1804a;
                                } else if (atomicReferenceFieldUpdater.get(this) != interfaceC0681v) {
                                }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        Object objM1034ah2 = m1034ah(objM1049v2, new C0647tt(thM1042o, false));
                        if (objM1034ah2 == AbstractC0745xj.f1804a) {
                            throw new IllegalStateException(("Cannot happen in " + objM1049v2).toString());
                        }
                        if (objM1034ah2 != AbstractC0745xj.f1806c) {
                            objM1034ah = objM1034ah2;
                            break;
                        }
                    }
                } else {
                    c0737xb = AbstractC0745xj.f1807d;
                }
                objM1034ah = c0737xb;
                break;
            }
        }
        if (objM1034ah != AbstractC0745xj.f1804a && objM1034ah != AbstractC0745xj.f1805b) {
            if (objM1034ah == AbstractC0745xj.f1807d) {
                return false;
            }
            mo963h(objM1034ah);
        }
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1038k(Throwable th) {
        if (mo1053z()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC0609si interfaceC0609si = (InterfaceC0609si) this._parentHandle;
        if (interfaceC0609si == null || interfaceC0609si == C0438m.f1211a) {
            return z;
        }
        return interfaceC0609si.mo1421c(th) || z;
    }

    /* JADX INFO: renamed from: l */
    public String mo1039l() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: m */
    public boolean mo1040m(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m1037j(th) && mo1046s();
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0769yg
    public final InterfaceC0769yg minusKey(InterfaceC0751xp interfaceC0751xp) {
        return AbstractC0513ou.m1509b(this, interfaceC0751xp);
    }

    /* JADX INFO: renamed from: n */
    public final void m1041n(InterfaceC0681v interfaceC0681v, Object obj) throws IllegalAccessException, InvocationTargetException {
        InterfaceC0609si interfaceC0609si = (InterfaceC0609si) this._parentHandle;
        if (interfaceC0609si != null) {
            interfaceC0609si.mo990b();
            this._parentHandle = C0438m.f1211a;
        }
        C0649tv c0649tv = null;
        if (!(obj instanceof C0647tt)) {
            obj = null;
        }
        C0647tt c0647tt = (C0647tt) obj;
        Throwable th = c0647tt != null ? c0647tt.f1565c : null;
        if (interfaceC0681v instanceof AbstractC0465n) {
            try {
                ((AbstractC0465n) interfaceC0681v).mo992f(th);
                return;
            } catch (Throwable th2) {
                mo1050w(new C0649tv("Exception in completion handler " + interfaceC0681v + " for " + this, th2));
                return;
            }
        }
        C0804zo c0804zoMo1154e = interfaceC0681v.mo1154e();
        if (c0804zoMo1154e != null) {
            Object objM1312l = c0804zoMo1154e.m1312l();
            if (objM1312l == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
            for (C0341ik c0341ikM1313m = (C0341ik) objM1312l; !c0341ikM1313m.equals(c0804zoMo1154e); c0341ikM1313m = c0341ikM1313m.m1313m()) {
                if (c0341ikM1313m instanceof AbstractC0465n) {
                    AbstractC0465n abstractC0465n = (AbstractC0465n) c0341ikM1313m;
                    try {
                        abstractC0465n.mo992f(th);
                    } catch (Throwable th3) {
                        if (c0649tv != null) {
                            AbstractC0180cl.m1087a(c0649tv, th3);
                        } else {
                            c0649tv = new C0649tv("Exception in completion handler " + abstractC0465n + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0649tv != null) {
                mo1050w(c0649tv);
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final Throwable m1042o(Object obj) {
        Throwable thM1399c;
        if (obj != null ? obj instanceof Throwable : true) {
            return obj != null ? (Throwable) obj : new C0758xw(mo1039l(), null, this);
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        }
        C0150bi c0150bi = (C0150bi) ((InterfaceC0678ux) obj);
        Object objM1049v = c0150bi.m1049v();
        if (objM1049v instanceof C0424lm) {
            thM1399c = ((C0424lm) objM1049v).m1399c();
        } else if (objM1049v instanceof C0647tt) {
            thM1399c = ((C0647tt) objM1049v).f1565c;
        } else {
            if (objM1049v instanceof InterfaceC0681v) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objM1049v).toString());
            }
            thM1399c = null;
        }
        Throwable c0758xw = (CancellationException) (thM1399c instanceof CancellationException ? thM1399c : null);
        if (c0758xw == null) {
            c0758xw = new C0758xw("Parent job is ".concat(m1026e(objM1049v)), thM1399c, c0150bi);
        }
        return c0758xw;
    }

    /* JADX INFO: renamed from: p */
    public final Object m1043p(C0424lm c0424lm, Object obj) throws IllegalAccessException, InvocationTargetException {
        Throwable thM1045r;
        C0647tt c0647tt = (C0647tt) (!(obj instanceof C0647tt) ? null : obj);
        Throwable th = c0647tt != null ? c0647tt.f1565c : null;
        synchronized (c0424lm) {
            c0424lm.m1400f();
            ArrayList<Throwable> arrayListM1403i = c0424lm.m1403i(th);
            thM1045r = m1045r(c0424lm, arrayListM1403i);
            if (thM1045r != null && arrayListM1403i.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM1403i.size()));
                for (Throwable th2 : arrayListM1403i) {
                    if (th2 != thM1045r && th2 != thM1045r && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        AbstractC0180cl.m1087a(thM1045r, th2);
                    }
                }
            }
        }
        if (thM1045r != null && thM1045r != th) {
            obj = new C0647tt(thM1045r, false);
        }
        if (thM1045r != null && m1038k(thM1045r)) {
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            }
            C0647tt.f1564b.compareAndSet((C0647tt) obj, 0, 1);
        }
        mo1030ad(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f686c;
        Object c0262fm = obj instanceof InterfaceC0681v ? new C0262fm((InterfaceC0681v) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c0424lm, c0262fm) && atomicReferenceFieldUpdater.get(this) == c0424lm) {
        }
        m1041n(c0424lm, obj);
        return obj;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0769yg
    public final InterfaceC0769yg plus(InterfaceC0769yg interfaceC0769yg) {
        AbstractC0399ko.m1351f("context", interfaceC0769yg);
        return interfaceC0769yg == C0233ek.f781a ? this : (InterfaceC0769yg) interfaceC0769yg.fold(this, C0632te.f1527b);
    }

    /* JADX INFO: renamed from: q */
    public final CancellationException m1044q() {
        Object objM1049v = m1049v();
        if (!(objM1049v instanceof C0424lm)) {
            if (objM1049v instanceof InterfaceC0681v) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objM1049v instanceof C0647tt)) {
                return new C0758xw(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0647tt) objM1049v).f1565c;
            CancellationException cancellationException = (CancellationException) (th instanceof CancellationException ? th : null);
            return cancellationException != null ? cancellationException : new C0758xw(mo1039l(), th, this);
        }
        Throwable thM1399c = ((C0424lm) objM1049v).m1399c();
        if (thM1399c == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException2 = (CancellationException) (thM1399c instanceof CancellationException ? thM1399c : null);
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        if (strConcat == null) {
            strConcat = mo1039l();
        }
        return new C0758xw(strConcat, thM1399c, this);
    }

    /* JADX INFO: renamed from: r */
    public final Throwable m1045r(C0424lm c0424lm, ArrayList arrayList) {
        Object next;
        Object obj = null;
        if (arrayList.isEmpty()) {
            if (c0424lm.m1400f()) {
                return new C0758xw(mo1039l(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof C0563qq) {
            for (Object obj2 : arrayList) {
                Throwable th3 = (Throwable) obj2;
                if (th3 != th2 && (th3 instanceof C0563qq)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo1046s() {
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final C0804zo m1047t(InterfaceC0681v interfaceC0681v) {
        C0804zo c0804zoMo1154e = interfaceC0681v.mo1154e();
        if (c0804zoMo1154e != null) {
            return c0804zoMo1154e;
        }
        if (interfaceC0681v instanceof C0224eb) {
            return new C0804zo();
        }
        if (interfaceC0681v instanceof AbstractC0465n) {
            m1032af((AbstractC0465n) interfaceC0681v);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0681v).toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(mo1021b() + '{' + m1026e(m1049v()) + '}');
        sb.append('@');
        sb.append(AbstractC0592rs.m1647a(this));
        return sb.toString();
    }

    /* JADX INFO: renamed from: u */
    public final InterfaceC0609si m1048u() {
        return (InterfaceC0609si) this._parentHandle;
    }

    /* JADX INFO: renamed from: v */
    public final Object m1049v() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof AbstractC0755xt)) {
                return obj;
            }
            ((AbstractC0755xt) obj).mo1574b(this);
        }
    }

    /* JADX INFO: renamed from: w */
    public void mo1050w(C0649tv c0649tv) {
        throw c0649tv;
    }

    /* JADX INFO: renamed from: x */
    public final void m1051x(InterfaceC0483nr interfaceC0483nr) {
        int iM1033ag;
        C0438m c0438m = C0438m.f1211a;
        if (interfaceC0483nr == null) {
            this._parentHandle = c0438m;
            return;
        }
        C0150bi c0150bi = (C0150bi) interfaceC0483nr;
        do {
            iM1033ag = c0150bi.m1033ag(c0150bi.m1049v());
            if (iM1033ag == 0) {
                break;
            }
        } while (iM1033ag != 1);
        InterfaceC0609si interfaceC0609si = (InterfaceC0609si) AbstractC0156bo.m1060a(c0150bi, true, new C0610sj(c0150bi, this), 2);
        this._parentHandle = interfaceC0609si;
        if (m1049v() instanceof InterfaceC0681v) {
            return;
        }
        interfaceC0609si.mo990b();
        this._parentHandle = c0438m;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0002 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:69:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:95:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00be A[SYNTHETIC] */
    /* JADX INFO: renamed from: y */
    public final adh m1052y(boolean z, boolean z2, AbstractC0465n abstractC0465n) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Throwable thM1399c;
        AbstractC0465n abstractC0465nM1028ab = null;
        while (true) {
            Object objM1049v = m1049v();
            if (objM1049v instanceof C0224eb) {
                C0224eb c0224eb = (C0224eb) objM1049v;
                if (c0224eb.f763a) {
                    if (abstractC0465nM1028ab == null) {
                        abstractC0465nM1028ab = m1028ab(abstractC0465n, z);
                    }
                    AbstractC0465n abstractC0465n2 = abstractC0465nM1028ab;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f686c;
                    while (!atomicReferenceFieldUpdater2.compareAndSet(this, objM1049v, abstractC0465n2)) {
                        if (atomicReferenceFieldUpdater2.get(this) != objM1049v) {
                            abstractC0465nM1028ab = abstractC0465n2;
                        }
                    }
                    return abstractC0465n2;
                }
                C0804zo c0804zo = new C0804zo();
                Object c0345io = c0224eb.f763a ? c0804zo : new C0345io(c0804zo);
                do {
                    atomicReferenceFieldUpdater = f686c;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, c0224eb, c0345io)) {
                        break;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == c0224eb);
            } else {
                if (!(objM1049v instanceof InterfaceC0681v)) {
                    if (z2) {
                        if (!(objM1049v instanceof C0647tt)) {
                            objM1049v = null;
                        }
                        C0647tt c0647tt = (C0647tt) objM1049v;
                        abstractC0465n.invoke(c0647tt != null ? c0647tt.f1565c : null);
                    }
                    return C0438m.f1211a;
                }
                C0804zo c0804zoMo1154e = ((InterfaceC0681v) objM1049v).mo1154e();
                if (c0804zoMo1154e != null) {
                    adh adhVar = C0438m.f1211a;
                    if (z && (objM1049v instanceof C0424lm)) {
                        synchronized (objM1049v) {
                            try {
                                thM1399c = ((C0424lm) objM1049v).m1399c();
                                if (thM1399c == null || ((abstractC0465n instanceof C0610sj) && !((C0424lm) objM1049v).m1401g())) {
                                    if (abstractC0465nM1028ab == null) {
                                        abstractC0465nM1028ab = m1028ab(abstractC0465n, z);
                                    }
                                    if (m1036g((InterfaceC0681v) objM1049v, c0804zoMo1154e, abstractC0465nM1028ab)) {
                                        if (thM1399c == null) {
                                            return abstractC0465nM1028ab;
                                        }
                                        adhVar = abstractC0465nM1028ab;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (thM1399c != null) {
                            if (z2) {
                                abstractC0465n.invoke(thM1399c);
                            }
                            return adhVar;
                        }
                        if (abstractC0465nM1028ab == null) {
                            abstractC0465nM1028ab = m1028ab(abstractC0465n, z);
                        }
                        if (m1036g((InterfaceC0681v) objM1049v, c0804zoMo1154e, abstractC0465nM1028ab)) {
                            return abstractC0465nM1028ab;
                        }
                    } else {
                        thM1399c = null;
                        if (thM1399c != null) {
                            if (z2) {
                                abstractC0465n.invoke(thM1399c);
                            }
                            return adhVar;
                        }
                        if (abstractC0465nM1028ab == null) {
                            abstractC0465nM1028ab = m1028ab(abstractC0465n, z);
                        }
                        if (m1036g((InterfaceC0681v) objM1049v, c0804zoMo1154e, abstractC0465nM1028ab)) {
                            return abstractC0465nM1028ab;
                        }
                    }
                } else {
                    if (objM1049v == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobNode<*>");
                    }
                    m1032af((AbstractC0465n) objM1049v);
                }
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public boolean mo1053z() {
        return false;
    }
}
