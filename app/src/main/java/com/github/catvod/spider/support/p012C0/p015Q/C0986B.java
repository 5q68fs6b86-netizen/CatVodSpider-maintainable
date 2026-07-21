package com.github.catvod.spider.support.p012C0.p015Q;

import com.github.catvod.spider.support.C0.Q.A;
import com.github.catvod.spider.support.C0.Q.Q;
import com.github.catvod.spider.support.C0.Q.X;
import com.github.catvod.spider.support.C0.Q.b;
import com.github.catvod.spider.support.C0.Q.e0;
import com.github.catvod.spider.support.C0.Q.f0;
import com.github.catvod.spider.support.C0.Q.m;
import com.github.catvod.spider.support.C0.Q.n0;
import com.github.catvod.spider.support.C0.Q.o;
import com.github.catvod.spider.support.C0.Q.t0;
import com.github.catvod.spider.support.C0.Q.w;
import com.github.catvod.spider.support.C0.Q.z;
import com.github.catvod.spider.support.p012C0.p014P.AbstractC0979s;
import com.github.catvod.spider.support.p012C0.p014P.C0980t;
import com.github.catvod.spider.support.p012C0.p014P.InterfaceC0972d;
import com.github.catvod.spider.support.p012C0.p016R.C0997b;
import com.github.catvod.spider.support.p012C0.p016R.C0999e;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.Q.B */
/* JADX INFO: loaded from: classes.dex */
public final class C0986B extends AbstractC0993l {

    /* JADX INFO: renamed from: d */
    protected final AbstractC0979s f2398d;

    /* JADX INFO: renamed from: e */
    protected int f2399e;

    /* JADX INFO: renamed from: f */
    protected int f2400f;

    /* JADX INFO: renamed from: g */
    protected int f2401g;

    /* JADX INFO: renamed from: h */
    public final C0997b[] f2402h;

    /* JADX INFO: renamed from: i */
    protected int f2403i;

    /* JADX INFO: renamed from: j */
    protected final A f2404j;

    public C0986B(AbstractC0979s abstractC0979s, C0990a c0990a, C0997b[] c0997bArr, C0989Y c0989y) {
        super(c0990a, c0989y);
        this.f2399e = -1;
        this.f2400f = 1;
        this.f2401g = 0;
        this.f2403i = 0;
        this.f2404j = new A();
        this.f2402h = c0997bArr;
        this.f2398d = abstractC0979s;
    }

    @Override // com.github.catvod.spider.support.p012C0.p015Q.AbstractC0993l
    /* JADX INFO: renamed from: a */
    public final void mo2463a() {
        A a = this.f2404j;
        a.a = -1;
        a.b = 0;
        a.c = -1;
        a.d = null;
        this.f2399e = -1;
        this.f2400f = 1;
        this.f2401g = 0;
        this.f2403i = 0;
    }

    /* JADX INFO: renamed from: b */
    protected final void m2464b(C0999e c0999e, int i, C0999e c0999e2) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (c0999e) {
            if (c0999e.f2457c == null) {
                c0999e.f2457c = new C0999e[128];
            }
            c0999e.f2457c[i + 0] = c0999e2;
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.C0.R.e, com.github.catvod.spider.support.C0.R.e>] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.C0.R.e, com.github.catvod.spider.support.C0.R.e>] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.C0.R.e, com.github.catvod.spider.support.C0.R.e>] */
    /* JADX INFO: renamed from: c */
    protected final C0999e m2465c(C0991f c0991f) {
        b bVar = null;
        C0999e c0999e = new C0999e(c0991f);
        for (b bVar2 : c0991f) {
            if (bVar2.a instanceof e0) {
                bVar = bVar2;
                break;
            }
        }
        if (bVar != null) {
            c0999e.f2458d = true;
            c0999e.f2460f = ((z) bVar).e();
            c0999e.f2459e = this.f2441a.f2422g[bVar.a.c];
        }
        C0997b c0997b = this.f2402h[this.f2403i];
        synchronized (c0997b.f2448a) {
            C0999e c0999e2 = (C0999e) c0997b.f2448a.get(c0999e);
            if (c0999e2 != null) {
                return c0999e2;
            }
            c0999e.f2455a = c0997b.f2448a.size();
            c0991f.f2425c = true;
            c0991f.f2426d = null;
            c0999e.f2456b = c0991f;
            c0997b.f2448a.put(c0999e, c0999e);
            return c0999e;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:39:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:77:0x00af A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v48, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX INFO: renamed from: d */
    protected final boolean m2466d(InterfaceC0972d interfaceC0972d, z zVar, C0991f c0991f, boolean z, boolean z2, boolean z3) {
        z zVar2;
        z zVar3;
        m mVar = ((b) zVar).a;
        if (mVar instanceof e0) {
            X x = ((b) zVar).c;
            if (x == null || x.e()) {
                X x2 = ((b) zVar).c;
                if (x2 == null || x2.f()) {
                    c0991f.m2499a(zVar, null);
                    return true;
                }
                c0991f.m2499a(new z(zVar, ((b) zVar).a, X.b), null);
                z = true;
            }
            X x3 = ((b) zVar).c;
            if (x3 == null || x3.f()) {
                return z;
            }
            boolean zM2466d = z;
            for (int i = 0; i < ((b) zVar).c.h(); i++) {
                if (((b) zVar).c.d(i) != Integer.MAX_VALUE) {
                    zM2466d = m2466d(interfaceC0972d, new z(zVar, (m) this.f2441a.f2416a.get(((b) zVar).c.d(i)), ((b) zVar).c.c(i)), c0991f, zM2466d, z2, z3);
                }
            }
            return zM2466d;
        }
        if (!mVar.d && (!z || !zVar.f())) {
            c0991f.m2499a(zVar, null);
        }
        m mVar2 = ((b) zVar).a;
        int i2 = 0;
        boolean zM2466d2 = z;
        while (true) {
            int i3 = i2;
            if (i3 >= mVar2.b()) {
                return zM2466d2;
            }
            o oVarD = mVar2.d(i3);
            int iA = oVarD.a();
            if (iA == 10) {
                throw new UnsupportedOperationException("Precedence predicates are not supported in lexers.");
            }
            switch (iA) {
                case 1:
                    zVar2 = new z(zVar, ((t0) oVarD).a);
                    zVar3 = zVar2;
                    if (zVar3 != null) {
                        zM2466d2 = m2466d(interfaceC0972d, zVar3, c0991f, zM2466d2, z2, z3);
                    }
                    i2 = i3 + 1;
                    break;
                case 2:
                case 5:
                case 7:
                    if (z3 && oVarD.d(-1, 1114111)) {
                        zVar2 = new z(zVar, ((t0) oVarD).a);
                        zVar3 = zVar2;
                    } else {
                        zVar3 = null;
                    }
                    if (zVar3 != null) {
                        zM2466d2 = m2466d(interfaceC0972d, zVar3, c0991f, zM2466d2, z2, z3);
                    }
                    i2 = i3 + 1;
                    break;
                case 3:
                    zVar3 = new z(zVar, ((t0) oVarD).a, n0.i(((b) zVar).c, ((f0) oVarD).c.b));
                    if (zVar3 != null) {
                        zM2466d2 = m2466d(interfaceC0972d, zVar3, c0991f, zM2466d2, z2, z3);
                    }
                    i2 = i3 + 1;
                    break;
                case 4:
                    c0991f.f2430h = true;
                    if (this.f2398d != null && z2) {
                        int i4 = this.f2401g;
                        int i5 = this.f2400f;
                        int iMo2422i = interfaceC0972d.mo2422i();
                        interfaceC0972d.mo2421g();
                        try {
                            m2467e(interfaceC0972d);
                            this.f2398d.getClass();
                            this.f2401g = i4;
                            this.f2400f = i5;
                            interfaceC0972d.mo2420d(iMo2422i);
                            interfaceC0972d.mo2419a();
                        } catch (Throwable th) {
                            this.f2401g = i4;
                            this.f2400f = i5;
                            interfaceC0972d.mo2420d(iMo2422i);
                            interfaceC0972d.mo2419a();
                            throw th;
                        }
                    }
                    zVar2 = new z(zVar, ((t0) oVarD).a);
                    zVar3 = zVar2;
                    if (zVar3 != null) {
                        zM2466d2 = m2466d(interfaceC0972d, zVar3, c0991f, zM2466d2, z2, z3);
                    }
                    i2 = i3 + 1;
                    break;
                case 6:
                    X x4 = ((b) zVar).c;
                    if (x4 == null || x4.e()) {
                        zVar3 = new z(zVar, ((t0) oVarD).a, C0987D.m2473a(zVar.e(), this.f2441a.f2423h[oVarD.c]));
                    } else {
                        zVar2 = new z(zVar, ((t0) oVarD).a);
                        zVar3 = zVar2;
                    }
                    if (zVar3 != null) {
                        zM2466d2 = m2466d(interfaceC0972d, zVar3, c0991f, zM2466d2, z2, z3);
                    }
                    i2 = i3 + 1;
                    break;
                default:
                    zVar3 = null;
                    if (zVar3 != null) {
                        zM2466d2 = m2466d(interfaceC0972d, zVar3, c0991f, zM2466d2, z2, z3);
                    }
                    i2 = i3 + 1;
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m2467e(InterfaceC0972d interfaceC0972d) {
        if (interfaceC0972d.m2428f(1) == 10) {
            this.f2400f++;
            this.f2401g = 0;
        } else {
            this.f2401g++;
        }
        interfaceC0972d.mo2423j();
    }

    /* JADX INFO: renamed from: f */
    protected final int m2468f(InterfaceC0972d interfaceC0972d, C0999e c0999e) throws Throwable {
        int i;
        AbstractC0979s abstractC0979s;
        int i2;
        if (c0999e.f2458d) {
            A a = this.f2404j;
            a.a = interfaceC0972d.mo2422i();
            a.b = this.f2400f;
            a.c = this.f2401g;
            a.d = c0999e;
        }
        int iM2428f = interfaceC0972d.m2428f(1);
        while (true) {
            i = iM2428f;
            C0999e[] c0999eArr = c0999e.f2457c;
            C0999e c0999e2 = (c0999eArr == null || i < 0 || i > 127) ? null : c0999eArr[i + 0];
            if (c0999e2 == null) {
                Q q = new Q();
                int i3 = 0;
                for (z zVar : c0999e.f2456b) {
                    boolean z = ((b) zVar).b == i3;
                    if (z && zVar.f()) {
                        i2 = i3;
                    } else {
                        int iB = ((b) zVar).a.b();
                        int i4 = 0;
                        while (true) {
                            if (i4 >= iB) {
                                i2 = i3;
                                break;
                            }
                            t0 t0VarD = ((b) zVar).a.d(i4);
                            m mVar = t0VarD.d(i, 1114111) ? t0VarD.a : null;
                            if (mVar != null) {
                                z zVar2 = zVar;
                                C0987D c0987dE = zVar2.e();
                                if (c0987dE != null) {
                                    c0987dE = c0987dE.m2475c(interfaceC0972d.mo2422i() - this.f2399e);
                                }
                                if (m2466d(interfaceC0972d, new z(zVar2, mVar, c0987dE), q, z, true, i == -1)) {
                                    i2 = ((b) zVar).b;
                                    break;
                                }
                            }
                            i4++;
                        }
                    }
                    i3 = i2;
                }
                if (q.isEmpty()) {
                    if (!q.f2430h) {
                        m2464b(c0999e, i, AbstractC0993l.f2440c);
                    }
                    c0999e = AbstractC0993l.f2440c;
                } else {
                    boolean z2 = q.f2430h;
                    q.f2430h = false;
                    C0999e c0999eM2465c = m2465c(q);
                    if (!z2) {
                        m2464b(c0999e, i, c0999eM2465c);
                    }
                    c0999e = c0999eM2465c;
                }
            } else {
                c0999e = c0999e2;
            }
            if (c0999e == AbstractC0993l.f2440c) {
                break;
            }
            if (i != -1) {
                m2467e(interfaceC0972d);
            }
            if (c0999e.f2458d) {
                A a2 = this.f2404j;
                a2.a = interfaceC0972d.mo2422i();
                a2.b = this.f2400f;
                a2.c = this.f2401g;
                a2.d = c0999e;
                if (i == -1) {
                    break;
                }
            }
            iM2428f = interfaceC0972d.m2428f(1);
        }
        A a3 = this.f2404j;
        C0999e c0999e3 = a3.d;
        if (c0999e3 == null) {
            if (i == -1 && interfaceC0972d.mo2422i() == this.f2399e) {
                return -1;
            }
            throw new C0980t(this.f2398d, interfaceC0972d, this.f2399e);
        }
        C0987D c0987d = c0999e3.f2460f;
        int i5 = this.f2399e;
        int i6 = a3.a;
        int i7 = a3.b;
        int i8 = a3.c;
        interfaceC0972d.mo2420d(i6);
        this.f2400f = i7;
        this.f2401g = i8;
        if (c0987d != null && (abstractC0979s = this.f2398d) != null) {
            c0987d.m2474b(abstractC0979s, interfaceC0972d, i5);
        }
        return a3.d.f2459e;
    }

    /* JADX INFO: renamed from: g */
    public final int m2469g() {
        return this.f2401g;
    }

    /* JADX INFO: renamed from: h */
    public final int m2470h() {
        return this.f2400f;
    }

    /* JADX INFO: renamed from: i */
    public final int m2471i(InterfaceC0972d interfaceC0972d, int i) {
        this.f2403i = i;
        interfaceC0972d.mo2421g();
        try {
            this.f2399e = interfaceC0972d.mo2422i();
            A a = this.f2404j;
            a.a = -1;
            a.b = 0;
            a.c = -1;
            a.d = null;
            C0997b c0997b = this.f2402h[i];
            return c0997b.f2449b == null ? m2472j(interfaceC0972d) : m2468f(interfaceC0972d, c0997b.f2449b);
        } finally {
            interfaceC0972d.mo2419a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.r0>] */
    /* JADX INFO: renamed from: j */
    protected final int m2472j(InterfaceC0972d interfaceC0972d) {
        m mVar = (m) this.f2441a.f2424i.get(this.f2403i);
        w wVar = X.b;
        Q q = new Q();
        int i = 0;
        while (i < mVar.b()) {
            int i2 = i + 1;
            m2466d(interfaceC0972d, new z(mVar.d(i).a, i2, wVar), q, false, false, false);
            i = i2;
        }
        boolean z = q.f2430h;
        q.f2430h = false;
        C0999e c0999eM2465c = m2465c(q);
        if (!z) {
            this.f2402h[this.f2403i].f2449b = c0999eM2465c;
        }
        return m2468f(interfaceC0972d, c0999eM2465c);
    }
}
