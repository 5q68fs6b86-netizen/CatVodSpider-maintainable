package com.github.catvod.spider.support.p012C0.p015Q;

import com.github.catvod.spider.support.C0.Q.V;
import com.github.catvod.spider.support.C0.Q.W;
import com.github.catvod.spider.support.C0.Q.X;
import com.github.catvod.spider.support.C0.Q.b;
import com.github.catvod.spider.support.C0.Q.b0;
import com.github.catvod.spider.support.C0.Q.e0;
import com.github.catvod.spider.support.C0.Q.f0;
import com.github.catvod.spider.support.C0.Q.j0;
import com.github.catvod.spider.support.C0.Q.k0;
import com.github.catvod.spider.support.C0.Q.m;
import com.github.catvod.spider.support.C0.Q.n0;
import com.github.catvod.spider.support.C0.Q.o;
import com.github.catvod.spider.support.C0.Q.t;
import com.github.catvod.spider.support.C0.Q.t0;
import com.github.catvod.spider.support.C0.Q.x;
import com.github.catvod.spider.support.p012C0.p014P.AbstractC0982w;
import com.github.catvod.spider.support.p012C0.p014P.C0968C;
import com.github.catvod.spider.support.p012C0.p014P.C0981u;
import com.github.catvod.spider.support.p012C0.p014P.C0983x;
import com.github.catvod.spider.support.p012C0.p014P.C0984y;
import com.github.catvod.spider.support.p012C0.p014P.InterfaceC0970G;
import com.github.catvod.spider.support.p012C0.p016R.C0997b;
import com.github.catvod.spider.support.p012C0.p016R.C0998d;
import com.github.catvod.spider.support.p012C0.p016R.C0999e;
import com.github.catvod.spider.support.p012C0.p017S.C1000c;
import com.github.catvod.spider.support.p012C0.p017S.C1003j;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.Q.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0988S extends AbstractC0993l {

    /* JADX INFO: renamed from: k */
    public static final boolean f2407k;

    /* JADX INFO: renamed from: d */
    protected final AbstractC0982w f2408d;

    /* JADX INFO: renamed from: e */
    public final C0997b[] f2409e;

    /* JADX INFO: renamed from: f */
    protected C1000c<X, X, X> f2410f;

    /* JADX INFO: renamed from: g */
    protected InterfaceC0970G f2411g;

    /* JADX INFO: renamed from: h */
    protected int f2412h;

    /* JADX INFO: renamed from: i */
    protected C0983x f2413i;

    /* JADX INFO: renamed from: j */
    protected C0997b f2414j;

    static {
        String str;
        try {
            str = System.getenv("TURN_OFF_LR_LOOP_ENTRY_BRANCH_OPT");
        } catch (SecurityException e) {
            str = null;
        }
        f2407k = Boolean.parseBoolean(str);
    }

    public C0988S(AbstractC0982w abstractC0982w, C0990a c0990a, C0997b[] c0997bArr, C0989Y c0989y) {
        super(c0990a, c0989y);
        this.f2408d = abstractC0982w;
        this.f2409e = c0997bArr;
    }

    /* JADX INFO: renamed from: o */
    protected static int m2476o(C0991f c0991f) {
        int i = 0;
        for (b bVar : c0991f) {
            if (i == 0) {
                i = bVar.b;
            } else if (bVar.b != i) {
                return 0;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.support.p012C0.p015Q.AbstractC0993l
    /* JADX INFO: renamed from: a */
    public final void mo2463a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final int m2477b(InterfaceC0970G interfaceC0970G, int i, C0983x c0983x) {
        C0983x c0983x2;
        this.f2411g = interfaceC0970G;
        this.f2412h = interfaceC0970G.mo2422i();
        this.f2413i = c0983x;
        C0997b c0997b = this.f2409e[i];
        this.f2414j = c0997b;
        interfaceC0970G.mo2421g();
        int i2 = this.f2412h;
        try {
            C0999e c0999eM2513a = c0997b.m2514b() ? c0997b.m2513a(this.f2408d.m2443r()) : c0997b.f2449b;
            if (c0999eM2513a == null) {
                c0983x2 = c0983x == null ? C0968C.f2352c : c0983x;
                C0991f c0991fM2484i = m2484i(c0997b.f2451d, C0968C.f2352c, false);
                if (c0997b.m2514b()) {
                    c0997b.f2449b.f2456b = c0991fM2484i;
                    c0999eM2513a = m2479d(c0997b, new C0999e(m2480e(c0991fM2484i)));
                    c0997b.m2515c(this.f2408d.m2443r(), c0999eM2513a);
                } else {
                    c0999eM2513a = m2479d(c0997b, new C0999e(c0991fM2484i));
                    c0997b.f2449b = c0999eM2513a;
                }
            } else {
                c0983x2 = c0983x;
            }
            return m2487l(c0997b, c0999eM2513a, interfaceC0970G, i2, c0983x2);
        } finally {
            this.f2410f = null;
            this.f2414j = null;
            interfaceC0970G.mo2420d(i2);
            interfaceC0970G.mo2419a();
        }
    }

    /* JADX INFO: renamed from: c */
    protected final C0999e m2478c(C0997b c0997b, C0999e c0999e, int i, C0999e c0999e2) {
        if (c0999e2 == null) {
            return null;
        }
        C0999e c0999eM2479d = m2479d(c0997b, c0999e2);
        if (i < -1 || i > this.f2441a.f2421f) {
            return c0999eM2479d;
        }
        synchronized (c0999e) {
            if (c0999e.f2457c == null) {
                c0999e.f2457c = new C0999e[this.f2441a.f2421f + 1 + 1];
            }
            c0999e.f2457c[i + 1] = c0999eM2479d;
        }
        return c0999eM2479d;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.C0.R.e, com.github.catvod.spider.support.C0.R.e>] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.C0.R.e, com.github.catvod.spider.support.C0.R.e>] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.C0.R.e, com.github.catvod.spider.support.C0.R.e>] */
    /* JADX INFO: renamed from: d */
    protected final C0999e m2479d(C0997b c0997b, C0999e c0999e) {
        if (c0999e == AbstractC0993l.f2440c) {
            return c0999e;
        }
        synchronized (c0997b.f2448a) {
            C0999e c0999e2 = (C0999e) c0997b.f2448a.get(c0999e);
            if (c0999e2 != null) {
                return c0999e2;
            }
            c0999e.f2455a = c0997b.f2448a.size();
            C0991f c0991f = c0999e.f2456b;
            if (!c0991f.f2425c) {
                c0991f.m2500b(this);
                C0991f c0991f2 = c0999e.f2456b;
                c0991f2.f2425c = true;
                c0991f2.f2426d = null;
            }
            c0997b.f2448a.put(c0999e, c0999e);
            return c0999e;
        }
    }

    /* JADX INFO: renamed from: e */
    protected final C0991f m2480e(C0991f c0991f) {
        X x;
        AbstractC0994l0 abstractC0994l0M2511d;
        HashMap map = new HashMap();
        C0991f c0991f2 = new C0991f(c0991f.f2432j);
        for (b bVar : c0991f) {
            if (bVar.b == 1 && (abstractC0994l0M2511d = bVar.e.m2511d(this.f2408d, this.f2413i)) != null) {
                map.put(Integer.valueOf(bVar.a.b), bVar.c);
                if (abstractC0994l0M2511d != bVar.e) {
                    c0991f2.m2499a(new b(bVar, bVar.a, bVar.c, abstractC0994l0M2511d), this.f2410f);
                } else {
                    c0991f2.m2499a(bVar, this.f2410f);
                }
            }
        }
        for (b bVar2 : c0991f) {
            if (bVar2.b != 1 && (bVar2.c() || (x = (X) map.get(Integer.valueOf(bVar2.a.b))) == null || !x.equals(bVar2.c))) {
                c0991f2.m2499a(bVar2, this.f2410f);
            }
        }
        return c0991f2;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX INFO: renamed from: f */
    protected final void m2481f(b bVar, C0991f c0991f, Set<b> set, boolean z, boolean z2, int i, boolean z3) {
        if (bVar.a instanceof e0) {
            if (!bVar.c.f()) {
                int i2 = 0;
                while (true) {
                    int i3 = i2;
                    if (i3 >= bVar.c.h()) {
                        return;
                    }
                    if (bVar.c.d(i3) != Integer.MAX_VALUE) {
                        b bVar2 = new b((m) this.f2441a.f2416a.get(bVar.c.d(i3)), bVar.b, bVar.c.c(i3), bVar.e);
                        bVar2.d = bVar.d;
                        m2481f(bVar2, c0991f, set, z, z2, i - 1, z3);
                    } else if (z2) {
                        c0991f.m2499a(new b(bVar, bVar.a, X.b, bVar.e), this.f2410f);
                    } else {
                        m2482g(bVar, c0991f, set, z, z2, i, z3);
                    }
                    i2 = i3 + 1;
                }
            } else if (z2) {
                c0991f.m2499a(bVar, this.f2410f);
                return;
            }
        }
        m2482g(bVar, c0991f, set, z, z2, i, z3);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0237  */
    /* JADX WARN: Code duplicated, block: B:103:0x0244  */
    /* JADX WARN: Code duplicated, block: B:113:0x025f  */
    /* JADX WARN: Code duplicated, block: B:116:0x001c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x001c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:11:0x0019  */
    /* JADX WARN: Code duplicated, block: B:49:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:57:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:61:0x0101  */
    /* JADX WARN: Code duplicated, block: B:63:0x0107  */
    /* JADX WARN: Code duplicated, block: B:72:0x0132  */
    /* JADX WARN: Code duplicated, block: B:75:0x0143  */
    /* JADX WARN: Code duplicated, block: B:76:0x0145  */
    /* JADX WARN: Code duplicated, block: B:77:0x0148  */
    /* JADX WARN: Code duplicated, block: B:78:0x0157  */
    /* JADX WARN: Code duplicated, block: B:87:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:89:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ed  */
    /* JADX WARN: Type inference failed for: r0v71, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX WARN: Type inference failed for: r5v19, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.Q.m>] */
    /* JADX INFO: renamed from: g */
    protected final void m2482g(b bVar, C0991f c0991f, Set<b> set, boolean z, boolean z2, int i, boolean z3) {
        o oVarD;
        boolean z4;
        boolean z5;
        int iA;
        V v;
        b bVar2;
        b bVar3;
        int i2;
        int i3;
        C0997b c0997b;
        W w;
        boolean z6;
        boolean z7;
        m mVar = bVar.a;
        if (!mVar.d) {
            c0991f.m2499a(bVar, this.f2410f);
        }
        int i4 = 0;
        while (true) {
            int i5 = i4;
            if (i5 >= mVar.b()) {
                return;
            }
            if (i5 != 0) {
                oVarD = mVar.d(i5);
                if ((oVarD instanceof o) && z) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                iA = oVarD.a();
                if (iA != 10) {
                    switch (iA) {
                        case 1:
                            bVar2 = new b(bVar, ((t0) oVarD).a, bVar.c, bVar.e);
                            break;
                        case 2:
                        case 5:
                        case 7:
                            if (!z3 && oVarD.d(-1, 1)) {
                                bVar2 = new b(bVar, ((t0) oVarD).a, bVar.c, bVar.e);
                            } else {
                                bVar3 = null;
                                bVar2 = bVar3;
                            }
                            break;
                        case 3:
                            f0 f0Var = (f0) oVarD;
                            bVar3 = new b(bVar, ((t0) f0Var).a, n0.i(bVar.c, f0Var.c.b), bVar.e);
                            bVar2 = bVar3;
                            break;
                        case 4:
                            w = (W) oVarD;
                            if (!z4 || ((z6 = w.d) && (!z6 || !z5))) {
                                bVar2 = new b(bVar, ((t0) w).a, bVar.c, bVar.e);
                            } else if (!z2) {
                                bVar3 = new b(bVar, ((t0) w).a, bVar.c, AbstractC0994l0.m2508b(bVar.e, new k0(w.b, w.c, z6)));
                                bVar2 = bVar3;
                            } else {
                                int iMo2422i = this.f2411g.mo2422i();
                                this.f2411g.mo2420d(this.f2412h);
                                this.f2408d.getClass();
                                this.f2411g.mo2420d(iMo2422i);
                                bVar2 = new b(bVar, ((t0) w).a, bVar.c, bVar.e);
                            }
                            break;
                        case 6:
                            bVar2 = new b(bVar, ((t0) oVarD).a, bVar.c, bVar.e);
                            break;
                        default:
                            bVar3 = null;
                            bVar2 = bVar3;
                            break;
                    }
                } else {
                    v = (V) oVarD;
                    if (z4 || !z5) {
                        bVar2 = new b(bVar, ((t0) v).a, bVar.c, bVar.e);
                    } else if (z2) {
                        int iMo2422i2 = this.f2411g.mo2422i();
                        this.f2411g.mo2420d(this.f2412h);
                        boolean zMo2387j = this.f2408d.mo2387j(v.b);
                        this.f2411g.mo2420d(iMo2422i2);
                        if (zMo2387j) {
                            bVar2 = new b(bVar, ((t0) v).a, bVar.c, bVar.e);
                        } else {
                            bVar3 = null;
                            bVar2 = bVar3;
                        }
                    } else {
                        bVar3 = new b(bVar, ((t0) v).a, bVar.c, AbstractC0994l0.m2508b(bVar.e, new j0(v.b)));
                        bVar2 = bVar3;
                    }
                }
                if (bVar2 == null) {
                    if (bVar.a instanceof e0) {
                        c0997b = this.f2414j;
                        if (c0997b != null && c0997b.m2514b() && ((x) oVarD).e() == ((m) this.f2414j.f2451d).c) {
                            bVar2.d |= 1073741824;
                        }
                        bVar2.d++;
                        if (set.add(bVar2)) {
                            c0991f.f2431i = true;
                            i3 = i - 1;
                            i2 = i3;
                            m2481f(bVar2, c0991f, set, z4, z2, i2, z3);
                        }
                    } else if (!oVarD.b() || set.add(bVar2)) {
                        if ((oVarD instanceof f0) || i < 0) {
                            i2 = i;
                        } else {
                            i3 = i + 1;
                            i2 = i3;
                        }
                        m2481f(bVar2, c0991f, set, z4, z2, i2, z3);
                    }
                }
            } else {
                if (f2407k) {
                    z7 = false;
                } else {
                    m mVar2 = bVar.a;
                    if (mVar2.c() != 10 || !((C0995p0) mVar2).f2445j || bVar.c.f() || bVar.c.e()) {
                        z7 = false;
                    } else {
                        int iH = bVar.c.h();
                        int i6 = 0;
                        while (true) {
                            if (i6 >= iH) {
                                m mVar3 = (t) this.f2441a.f2416a.get(((m) mVar2.d(0).a.i).b);
                                int i7 = 0;
                                while (true) {
                                    if (i7 < iH) {
                                        m mVar4 = (m) this.f2441a.f2416a.get(bVar.c.d(i7));
                                        if (mVar4.b() == 1 && mVar4.d(0).b()) {
                                            m mVar5 = mVar4.d(0).a;
                                            if ((mVar4.c() == 8 && mVar5 == mVar2) || mVar4 == mVar3 || mVar5 == mVar3 || (mVar5.c() == 8 && mVar5.b() == 1 && mVar5.d(0).b() && mVar5.d(0).a == mVar2)) {
                                                i7++;
                                            }
                                        }
                                    } else {
                                        z7 = true;
                                    }
                                }
                            } else if (((m) this.f2441a.f2416a.get(bVar.c.d(i6))).c == mVar2.c) {
                                i6++;
                            }
                            z7 = false;
                        }
                    }
                }
                if (!z7) {
                    oVarD = mVar.d(i5);
                    if (oVarD instanceof o) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (i == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iA = oVarD.a();
                    if (iA != 10) {
                        switch (iA) {
                            case 1:
                                bVar2 = new b(bVar, ((t0) oVarD).a, bVar.c, bVar.e);
                                break;
                            case 2:
                            case 5:
                            case 7:
                                if (!z3) {
                                }
                                bVar3 = null;
                                bVar2 = bVar3;
                                break;
                            case 3:
                                f0 f0Var2 = (f0) oVarD;
                                bVar3 = new b(bVar, ((t0) f0Var2).a, n0.i(bVar.c, f0Var2.c.b), bVar.e);
                                bVar2 = bVar3;
                                break;
                            case 4:
                                w = (W) oVarD;
                                if (!z4) {
                                    bVar2 = new b(bVar, ((t0) w).a, bVar.c, bVar.e);
                                } else {
                                    bVar2 = new b(bVar, ((t0) w).a, bVar.c, bVar.e);
                                }
                                break;
                            case 6:
                                bVar2 = new b(bVar, ((t0) oVarD).a, bVar.c, bVar.e);
                                break;
                            default:
                                bVar3 = null;
                                bVar2 = bVar3;
                                break;
                        }
                    } else {
                        v = (V) oVarD;
                        if (z4) {
                            bVar2 = new b(bVar, ((t0) v).a, bVar.c, bVar.e);
                        } else {
                            bVar2 = new b(bVar, ((t0) v).a, bVar.c, bVar.e);
                        }
                    }
                    if (bVar2 == null) {
                        if (bVar.a instanceof e0) {
                            c0997b = this.f2414j;
                            if (c0997b != null) {
                                bVar2.d |= 1073741824;
                            }
                            bVar2.d++;
                            if (set.add(bVar2)) {
                                c0991f.f2431i = true;
                                i3 = i - 1;
                                i2 = i3;
                                m2481f(bVar2, c0991f, set, z4, z2, i2, z3);
                            }
                        } else {
                            if (!oVarD.b()) {
                            }
                            if (oVarD instanceof f0) {
                            }
                            i2 = i;
                            m2481f(bVar2, c0991f, set, z4, z2, i2, z3);
                        }
                    }
                }
            }
            i4 = i5 + 1;
        }
    }

    /* JADX WARN: Code duplicated, block: B:59:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dc A[LOOP:4: B:60:0x00d6->B:62:0x00dc, LOOP_END] */
    /* JADX INFO: renamed from: h */
    protected final C0991f m2483h(C0991f c0991f, int i, boolean z) {
        C0991f c0991f2;
        Iterator it;
        boolean z2;
        if (this.f2410f == null) {
            this.f2410f = new C1000c<>();
        }
        C0991f c0991f3 = new C0991f(z);
        Iterator<b> it2 = c0991f.iterator();
        ArrayList arrayList = null;
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            b next = it2.next();
            m mVar = next.a;
            if (!(mVar instanceof e0)) {
                int iB = mVar.b();
                for (int i2 = 0; i2 < iB; i2++) {
                    t0 t0VarD = next.a.d(i2);
                    m mVar2 = t0VarD.d(i, this.f2441a.f2421f) ? t0VarD.a : null;
                    if (mVar2 != null) {
                        c0991f3.m2499a(new b(next, mVar2, next.c, next.e), this.f2410f);
                    }
                }
            } else if (z || i == -1) {
                ArrayList arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                arrayList2.add(next);
                arrayList = arrayList2;
            }
        }
        C0991f c0991f4 = (arrayList != null || i == -1 || (c0991f3.size() != 1 && m2476o(c0991f3) == 0)) ? null : c0991f3;
        if (c0991f4 == null) {
            c0991f4 = new C0991f(z);
            HashSet hashSet = new HashSet();
            boolean z3 = i == -1;
            Iterator<b> it3 = c0991f3.iterator();
            while (it3.hasNext()) {
                m2481f(it3.next(), c0991f4, hashSet, false, z, 0, z3);
            }
        }
        if (i == -1) {
            boolean z4 = c0991f4 == c0991f3;
            if (b0.a(c0991f4)) {
                c0991f2 = c0991f4;
            } else {
                C0991f c0991f5 = new C0991f(c0991f4.f2432j);
                for (b bVar : c0991f4) {
                    m mVar3 = bVar.a;
                    if (mVar3 instanceof e0) {
                        c0991f5.m2499a(bVar, this.f2410f);
                    } else if (z4 && mVar3.d && this.f2441a.m2497e(mVar3).m2526d(-2)) {
                        c0991f5.m2499a(new b(bVar, this.f2441a.f2419d[bVar.a.c], bVar.c, bVar.e), this.f2410f);
                    }
                }
                c0991f2 = c0991f5;
            }
        } else {
            c0991f2 = c0991f4;
        }
        if (arrayList != null) {
            if (z) {
                Iterator<b> it4 = c0991f2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        z2 = false;
                        break;
                    }
                    if (it4.next().a instanceof e0) {
                        z2 = true;
                        break;
                    }
                }
                if (!z2) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        c0991f2.m2499a((b) it.next(), this.f2410f);
                    }
                }
            } else {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    c0991f2.m2499a((b) it.next(), this.f2410f);
                }
            }
        }
        if (c0991f2.isEmpty()) {
            return null;
        }
        return c0991f2;
    }

    /* JADX INFO: renamed from: i */
    protected final C0991f m2484i(m mVar, C0968C c0968c, boolean z) {
        X xA = X.a(this.f2441a, c0968c);
        C0991f c0991f = new C0991f(z);
        int i = 0;
        while (i < mVar.b()) {
            int i2 = i + 1;
            m2481f(new b(mVar.d(i).a, i2, xA, AbstractC0994l0.f2443c), c0991f, new HashSet(), true, z, 0, false);
            i = i2;
        }
        return c0991f;
    }

    /* JADX INFO: renamed from: j */
    protected final BitSet m2485j(C0998d[] c0998dArr, C0983x c0983x) {
        BitSet bitSet = new BitSet();
        for (C0998d c0998d : c0998dArr) {
            k0 k0Var = c0998d.f2453a;
            if (k0Var == AbstractC0994l0.f2443c || m2486k(k0Var, c0983x)) {
                bitSet.set(c0998d.f2454b);
            }
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: k */
    protected final boolean m2486k(AbstractC0994l0 abstractC0994l0, C0983x c0983x) {
        return abstractC0994l0.m2510c(this.f2408d, c0983x);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00c9  */
    /* JADX INFO: renamed from: l */
    protected final int m2487l(C0997b c0997b, C0999e c0999e, InterfaceC0970G interfaceC0970G, int i, C0983x c0983x) {
        C0991f c0991fM2483h;
        int iM2476o;
        int iM2428f;
        boolean z;
        boolean z2;
        boolean z3;
        BitSet bitSet;
        int i2;
        int iM2428f2 = interfaceC0970G.m2428f(1);
        while (true) {
            C0999e[] c0999eArr = c0999e.f2457c;
            C0999e c0999eM2478c = (c0999eArr == null || (i2 = iM2428f2 + 1) < 0 || i2 >= c0999eArr.length) ? null : c0999eArr[i2];
            if (c0999eM2478c == null) {
                C0991f c0991fM2483h2 = m2483h(c0999e.f2456b, iM2428f2, false);
                if (c0991fM2483h2 == null) {
                    c0999eM2478c = AbstractC0993l.f2440c;
                    m2478c(c0997b, c0999e, iM2428f2, c0999eM2478c);
                } else {
                    C0999e c0999e2 = new C0999e(c0991fM2483h2);
                    int iM2476o2 = m2476o(c0991fM2483h2);
                    if (iM2476o2 != 0) {
                        c0999e2.f2458d = true;
                        c0999e2.f2456b.f2428f = iM2476o2;
                        c0999e2.f2459e = iM2476o2;
                    } else {
                        if (b0.a(c0991fM2483h2)) {
                            z2 = true;
                        } else {
                            Iterator it = ((ArrayList) b0.b(c0991fM2483h2)).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                if (((BitSet) it.next()).cardinality() > 1) {
                                    z = true;
                                    break;
                                }
                            }
                            if (z) {
                                HashMap map = new HashMap();
                                for (b bVar : c0991fM2483h2) {
                                    BitSet bitSet2 = (BitSet) map.get(bVar.a);
                                    if (bitSet2 == null) {
                                        bitSet2 = new BitSet();
                                        map.put(bVar.a, bitSet2);
                                    }
                                    bitSet2.set(bVar.b);
                                }
                                Iterator it2 = map.values().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z3 = false;
                                        break;
                                    }
                                    if (((BitSet) it2.next()).cardinality() == 1) {
                                        z3 = true;
                                        break;
                                    }
                                }
                                if (!z3) {
                                    z2 = true;
                                }
                            }
                            z2 = false;
                        }
                        if (z2) {
                            C0991f c0991f = c0999e2.f2456b;
                            Collection collectionB = b0.b(c0991fM2483h2);
                            BitSet bitSet3 = new BitSet();
                            Iterator it3 = ((ArrayList) collectionB).iterator();
                            while (it3.hasNext()) {
                                bitSet3.or((BitSet) it3.next());
                            }
                            c0991f.f2429g = bitSet3;
                            c0999e2.f2461g = true;
                            c0999e2.f2458d = true;
                            c0999e2.f2459e = c0999e2.f2456b.f2429g.nextSetBit(0);
                        }
                    }
                    if (c0999e2.f2458d && c0999e2.f2456b.f2430h) {
                        int iB = this.f2441a.m2494b(c0997b.f2450c).b();
                        C0991f c0991f2 = c0999e2.f2456b;
                        if (c0991f2.f2428f != 0) {
                            BitSet bitSet4 = new BitSet();
                            bitSet4.set(c0991f2.f2428f);
                            bitSet = bitSet4;
                        } else {
                            bitSet = c0991f2.f2429g;
                        }
                        AbstractC0994l0[] abstractC0994l0Arr = new AbstractC0994l0[iB + 1];
                        for (b bVar2 : c0999e2.f2456b) {
                            if (bitSet.get(bVar2.b)) {
                                int i3 = bVar2.b;
                                abstractC0994l0Arr[i3] = AbstractC0994l0.m2509e(abstractC0994l0Arr[i3], bVar2.e);
                            }
                        }
                        int i4 = 0;
                        for (int i5 = 1; i5 <= iB; i5++) {
                            if (abstractC0994l0Arr[i5] == null) {
                                abstractC0994l0Arr[i5] = AbstractC0994l0.f2443c;
                            } else if (abstractC0994l0Arr[i5] != AbstractC0994l0.f2443c) {
                                i4++;
                            }
                        }
                        AbstractC0994l0[] abstractC0994l0Arr2 = i4 == 0 ? null : abstractC0994l0Arr;
                        if (abstractC0994l0Arr2 != null) {
                            ArrayList arrayList = new ArrayList();
                            boolean z4 = false;
                            for (int i6 = 1; i6 < abstractC0994l0Arr2.length; i6++) {
                                AbstractC0994l0 abstractC0994l0 = abstractC0994l0Arr2[i6];
                                if (bitSet != null && bitSet.get(i6)) {
                                    arrayList.add(new C0998d(abstractC0994l0, i6));
                                }
                                if (abstractC0994l0 != AbstractC0994l0.f2443c) {
                                    z4 = true;
                                }
                            }
                            c0999e2.f2462h = !z4 ? null : (C0998d[]) arrayList.toArray(new C0998d[arrayList.size()]);
                            c0999e2.f2459e = 0;
                        } else {
                            c0999e2.f2459e = bitSet.nextSetBit(0);
                        }
                        if (c0999e2.f2462h != null) {
                            c0999e2.f2459e = 0;
                        }
                    }
                    c0999eM2478c = m2478c(c0997b, c0999e, iM2428f2, c0999e2);
                }
            }
            if (c0999eM2478c == AbstractC0993l.f2440c) {
                C0981u c0981uM2490p = m2490p(interfaceC0970G, c0983x, c0999e.f2456b, i);
                interfaceC0970G.mo2420d(i);
                int iM2489n = m2489n(c0999e.f2456b, c0983x);
                if (iM2489n != 0) {
                    return iM2489n;
                }
                throw c0981uM2490p;
            }
            if (c0999eM2478c.f2461g) {
                BitSet bitSetM2485j = c0999eM2478c.f2456b.f2429g;
                if (c0999eM2478c.f2462h != null) {
                    int iMo2422i = interfaceC0970G.mo2422i();
                    if (iMo2422i != i) {
                        interfaceC0970G.mo2420d(i);
                    }
                    bitSetM2485j = m2485j(c0999eM2478c.f2462h, c0983x);
                    if (bitSetM2485j.cardinality() == 1) {
                        return bitSetM2485j.nextSetBit(0);
                    }
                    if (iMo2422i != i) {
                        interfaceC0970G.mo2420d(iMo2422i);
                    }
                }
                C0991f c0991fM2484i = m2484i(c0997b.f2451d, c0983x, true);
                C0991f c0991f3 = c0999eM2478c.f2456b;
                int iMo2422i2 = interfaceC0970G.mo2422i();
                AbstractC0982w abstractC0982w = this.f2408d;
                if (abstractC0982w != null) {
                    ((C0984y) abstractC0982w.m2384g()).m2455b(this.f2408d, c0997b, i, iMo2422i2, bitSetM2485j, c0991f3);
                }
                interfaceC0970G.mo2420d(i);
                int iM2428f3 = interfaceC0970G.m2428f(1);
                C0991f c0991f4 = c0991fM2484i;
                while (true) {
                    c0991fM2483h = m2483h(c0991f4, iM2428f3, true);
                    if (c0991fM2483h == null) {
                        C0981u c0981uM2490p2 = m2490p(interfaceC0970G, c0983x, c0991f4, i);
                        interfaceC0970G.mo2420d(i);
                        int iM2489n2 = m2489n(c0991f4, c0983x);
                        if (iM2489n2 == 0) {
                            throw c0981uM2490p2;
                        }
                        return iM2489n2;
                    }
                    Collection collectionB2 = b0.b(c0991fM2483h);
                    iM2476o = m2476o(c0991fM2483h);
                    c0991fM2483h.f2428f = iM2476o;
                    if (iM2476o != 0 || (iM2476o = b0.c(collectionB2)) != 0) {
                        break;
                    }
                    if (iM2428f3 != -1) {
                        interfaceC0970G.mo2423j();
                        iM2428f3 = interfaceC0970G.m2428f(1);
                    }
                    c0991f4 = c0991fM2483h;
                }
                int i7 = c0991fM2483h.f2428f;
                int iMo2422i3 = interfaceC0970G.mo2422i();
                if (i7 != 0) {
                    AbstractC0982w abstractC0982w2 = this.f2408d;
                    if (abstractC0982w2 == null) {
                        return iM2476o;
                    }
                    ((C0984y) abstractC0982w2.m2384g()).m2457d(this.f2408d, c0997b, i, iMo2422i3, iM2476o, c0991fM2483h);
                    return iM2476o;
                }
                BitSet bitSet5 = new BitSet();
                Iterator<b> it4 = c0991fM2483h.f2427e.iterator();
                while (it4.hasNext()) {
                    bitSet5.set(it4.next().b);
                }
                m2491q(c0997b, i, iMo2422i3, bitSet5, c0991fM2483h);
                return iM2476o;
            }
            if (c0999eM2478c.f2458d) {
                if (c0999eM2478c.f2462h == null) {
                    return c0999eM2478c.f2459e;
                }
                int iMo2422i4 = interfaceC0970G.mo2422i();
                interfaceC0970G.mo2420d(i);
                BitSet bitSetM2485j2 = m2485j(c0999eM2478c.f2462h, c0983x);
                int iCardinality = bitSetM2485j2.cardinality();
                if (iCardinality == 0) {
                    throw m2490p(interfaceC0970G, c0983x, c0999eM2478c.f2456b, i);
                }
                if (iCardinality == 1) {
                    return bitSetM2485j2.nextSetBit(0);
                }
                m2491q(c0997b, i, iMo2422i4, bitSetM2485j2, c0999eM2478c.f2456b);
                return bitSetM2485j2.nextSetBit(0);
            }
            if (iM2428f2 != -1) {
                interfaceC0970G.mo2423j();
                iM2428f = interfaceC0970G.m2428f(1);
            } else {
                iM2428f = iM2428f2;
            }
            c0999e = c0999eM2478c;
            iM2428f2 = iM2428f;
        }
    }

    /* JADX INFO: renamed from: m */
    protected final int m2488m(C0991f c0991f) {
        C1003j c1003j = new C1003j(new int[0]);
        for (b bVar : c0991f) {
            if (bVar.b() > 0 || ((bVar.a instanceof e0) && bVar.c.e())) {
                c1003j.m2523a(bVar.b);
            }
        }
        if (c1003j.m2531j() == 0) {
            return 0;
        }
        return c1003j.m2527e();
    }

    /* JADX INFO: renamed from: n */
    protected final int m2489n(C0991f c0991f, C0983x c0983x) {
        int iM2488m;
        C0991f c0991f2 = new C0991f(c0991f.f2432j);
        C0991f c0991f3 = new C0991f(c0991f.f2432j);
        for (b bVar : c0991f) {
            k0 k0Var = bVar.e;
            if (k0Var == AbstractC0994l0.f2443c || m2486k(k0Var, c0983x)) {
                c0991f2.m2499a(bVar, null);
            } else {
                c0991f3.m2499a(bVar, null);
            }
        }
        int iM2488m2 = m2488m(c0991f2);
        if (iM2488m2 != 0) {
            return iM2488m2;
        }
        if (c0991f3.size() <= 0 || (iM2488m = m2488m(c0991f3)) == 0) {
            return 0;
        }
        return iM2488m;
    }

    /* JADX INFO: renamed from: p */
    protected final C0981u m2490p(InterfaceC0970G interfaceC0970G, C0983x c0983x, C0991f c0991f, int i) {
        return new C0981u(this.f2408d, interfaceC0970G, interfaceC0970G.get(i), interfaceC0970G.m2403e(1), c0983x);
    }

    /* JADX INFO: renamed from: q */
    protected final void m2491q(C0997b c0997b, int i, int i2, BitSet bitSet, C0991f c0991f) {
        AbstractC0982w abstractC0982w = this.f2408d;
        if (abstractC0982w != null) {
            ((C0984y) abstractC0982w.m2384g()).m2456c(this.f2408d, c0997b, i, i2, bitSet, c0991f);
        }
    }
}
