package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1278d;
import com.github.catvod.spider.support.p044FM.p045A.C1285k;
import com.github.catvod.spider.support.p044FM.p098x.AbstractC1949x;
import com.github.catvod.spider.support.p044FM.p098x.C1918D;
import com.github.catvod.spider.support.p044FM.p098x.C1947v;
import com.github.catvod.spider.support.p044FM.p098x.C1950y;
import com.github.catvod.spider.support.p044FM.p098x.C1951z;
import com.github.catvod.spider.support.p044FM.p098x.InterfaceC1922H;
import com.github.catvod.spider.support.p044FM.p100z.C2025b;
import com.github.catvod.spider.support.p044FM.p100z.C2027d;
import com.github.catvod.spider.support.p044FM.p100z.C2028e;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.S */
/* JADX INFO: loaded from: classes.dex */
public final class C1969S extends AbstractC1999l {

    /* JADX INFO: renamed from: k */
    public static final boolean f4496k;

    /* JADX INFO: renamed from: d */
    protected final AbstractC1949x f4497d;

    /* JADX INFO: renamed from: e */
    public final C2025b[] f4498e;

    /* JADX INFO: renamed from: f */
    protected C1278d<AbstractC1974X, AbstractC1974X, AbstractC1974X> f4499f;

    /* JADX INFO: renamed from: g */
    protected InterfaceC1922H f4500g;

    /* JADX INFO: renamed from: h */
    protected int f4501h;

    /* JADX INFO: renamed from: i */
    protected C1950y f4502i;

    /* JADX INFO: renamed from: j */
    protected C2025b f4503j;

    static {
        String str;
        try {
            str = System.getenv("TURN_OFF_LR_LOOP_ENTRY_BRANCH_OPT");
        } catch (SecurityException unused) {
            str = null;
        }
        f4496k = Boolean.parseBoolean(str);
    }

    public C1969S(AbstractC1949x abstractC1949x, C1977a c1977a, C2025b[] c2025bArr, C1975Y c1975y) {
        super(c1977a, c1975y);
        this.f4497d = abstractC1949x;
        this.f4498e = c2025bArr;
    }

    /* JADX INFO: renamed from: o */
    protected static int m4733o(C1987f c1987f) {
        int i = 0;
        for (C1979b c1979b : c1987f) {
            if (i == 0) {
                i = c1979b.f4523b;
            } else if (c1979b.f4523b != i) {
                return 0;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC1999l
    /* JADX INFO: renamed from: a */
    public final void mo4713a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final int m4734b(InterfaceC1922H interfaceC1922H, int i, C1950y c1950y) {
        this.f4500g = interfaceC1922H;
        this.f4501h = interfaceC1922H.mo4660i();
        this.f4502i = c1950y;
        C2025b c2025b = this.f4498e[i];
        this.f4503j = c2025b;
        interfaceC1922H.mo4657d();
        int i2 = this.f4501h;
        try {
            C2028e c2028eM4796a = c2025b.m4797b() ? c2025b.m4796a(this.f4497d.m4704p()) : c2025b.f4586b;
            if (c2028eM4796a == null) {
                if (c1950y == null) {
                    c1950y = C1918D.f4393c;
                }
                C1987f c1987fM4741i = m4741i(c2025b.f4588d, C1918D.f4393c, false);
                if (c2025b.m4797b()) {
                    c2025b.f4586b.f4595b = c1987fM4741i;
                    c2028eM4796a = m4736d(c2025b, new C2028e(m4737e(c1987fM4741i)));
                    c2025b.m4798c(this.f4497d.m4704p(), c2028eM4796a);
                } else {
                    c2028eM4796a = m4736d(c2025b, new C2028e(c1987fM4741i));
                    c2025b.f4586b = c2028eM4796a;
                }
            }
            return m4744l(c2025b, c2028eM4796a, interfaceC1922H, i2, c1950y);
        } finally {
            this.f4499f = null;
            this.f4503j = null;
            interfaceC1922H.mo4658f(i2);
            interfaceC1922H.mo4656a();
        }
    }

    /* JADX INFO: renamed from: c */
    protected final C2028e m4735c(C2025b c2025b, C2028e c2028e, int i, C2028e c2028e2) {
        if (c2028e2 == null) {
            return null;
        }
        C2028e c2028eM4736d = m4736d(c2025b, c2028e2);
        if (i < -1 || i > this.f4557a.f4518f) {
            return c2028eM4736d;
        }
        synchronized (c2028e) {
            if (c2028e.f4596c == null) {
                c2028e.f4596c = new C2028e[this.f4557a.f4518f + 1 + 1];
            }
            c2028e.f4596c[i + 1] = c2028eM4736d;
        }
        return c2028eM4736d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.FM.z.e, com.github.catvod.spider.support.FM.z.e>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.FM.z.e, com.github.catvod.spider.support.FM.z.e>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.FM.z.e, com.github.catvod.spider.support.FM.z.e>] */
    /* JADX INFO: renamed from: d */
    protected final C2028e m4736d(C2025b c2025b, C2028e c2028e) {
        if (c2028e == AbstractC1999l.f4556c) {
            return c2028e;
        }
        synchronized (c2025b.f4585a) {
            C2028e c2028e2 = (C2028e) c2025b.f4585a.get(c2028e);
            if (c2028e2 != null) {
                return c2028e2;
            }
            c2028e.f4594a = c2025b.f4585a.size();
            C1987f c1987f = c2028e.f4595b;
            if (!c1987f.f4532a) {
                c1987f.m4773b(this);
                C1987f c1987f2 = c2028e.f4595b;
                c1987f2.f4532a = true;
                c1987f2.f4533b = null;
            }
            c2025b.f4585a.put(c2028e, c2028e);
            return c2028e;
        }
    }

    /* JADX INFO: renamed from: e */
    protected final C1987f m4737e(C1987f c1987f) {
        AbstractC1974X abstractC1974X;
        AbstractC2000l0 abstractC2000l0Mo4776d;
        HashMap map = new HashMap();
        C1987f c1987f2 = new C1987f(c1987f.f4539h);
        for (C1979b c1979b : c1987f) {
            if (c1979b.f4523b == 1 && (abstractC2000l0Mo4776d = c1979b.f4526e.mo4776d(this.f4497d, this.f4502i)) != null) {
                map.put(Integer.valueOf(c1979b.f4522a.f4561b), c1979b.f4524c);
                if (abstractC2000l0Mo4776d != c1979b.f4526e) {
                    c1987f2.m4772a(new C1979b(c1979b, c1979b.f4522a, c1979b.f4524c, abstractC2000l0Mo4776d), this.f4499f);
                } else {
                    c1987f2.m4772a(c1979b, this.f4499f);
                }
            }
        }
        for (C1979b c1979b2 : c1987f) {
            if (c1979b2.f4523b != 1 && (c1979b2.m4767c() || (abstractC1974X = (AbstractC1974X) map.get(Integer.valueOf(c1979b2.f4522a.f4561b))) == null || !abstractC1974X.equals(c1979b2.f4524c))) {
                c1987f2.m4772a(c1979b2, this.f4499f);
            }
        }
        return c1987f2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.y.m>] */
    /* JADX INFO: renamed from: f */
    protected final void m4738f(C1979b c1979b, C1987f c1987f, Set<C1979b> set, boolean z, boolean z2, int i, boolean z3) {
        if (c1979b.f4522a instanceof C1986e0) {
            if (!c1979b.f4524c.mo4756f()) {
                for (int i2 = 0; i2 < c1979b.f4524c.mo4757h(); i2++) {
                    if (c1979b.f4524c.mo4754d(i2) != Integer.MAX_VALUE) {
                        C1979b c1979b2 = new C1979b((AbstractC2001m) this.f4557a.f4513a.get(c1979b.f4524c.mo4754d(i2)), c1979b.f4523b, c1979b.f4524c.mo4753c(i2), c1979b.f4526e);
                        c1979b2.f4525d = c1979b.f4525d;
                        m4738f(c1979b2, c1987f, set, z, z2, i - 1, z3);
                    } else if (z2) {
                        c1987f.m4772a(new C1979b(c1979b, c1979b.f4522a, AbstractC1974X.f4509b, c1979b.f4526e), this.f4499f);
                    } else {
                        m4739g(c1979b, c1987f, set, z, z2, i, z3);
                    }
                }
                return;
            }
            if (z2) {
                c1987f.m4772a(c1979b, this.f4499f);
                return;
            }
        }
        m4739g(c1979b, c1987f, set, z, z2, i, z3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x0231  */
    /* JADX WARN: Code duplicated, block: B:109:0x0236  */
    /* JADX WARN: Code duplicated, block: B:125:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:0x025d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:66:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x0106  */
    /* JADX WARN: Code duplicated, block: B:69:0x0117  */
    /* JADX WARN: Code duplicated, block: B:78:0x0164  */
    /* JADX WARN: Code duplicated, block: B:79:0x0171  */
    /* JADX WARN: Code duplicated, block: B:80:0x0188  */
    /* JADX WARN: Code duplicated, block: B:84:0x019d  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:92:0x01da A[PHI: r5
      0x01da: PHI (r5v5 com.github.catvod.spider.support.FM.y.b) = 
      (r5v3 com.github.catvod.spider.support.FM.y.b)
      (r5v0 com.github.catvod.spider.support.FM.y.b)
      (r5v0 com.github.catvod.spider.support.FM.y.b)
      (r5v0 com.github.catvod.spider.support.FM.y.b)
      (r5v0 com.github.catvod.spider.support.FM.y.b)
      (r5v10 com.github.catvod.spider.support.FM.y.b)
      (r5v13 com.github.catvod.spider.support.FM.y.b)
     binds: [B:93:0x01dc, B:90:0x01cc, B:66:0x0101, B:80:0x0188, B:82:0x018f, B:79:0x0171, B:77:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:96:0x0200  */
    /* JADX WARN: Code duplicated, block: B:98:0x0206  */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.y.m>] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.y.m>] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.y.m>] */
    /* JADX INFO: renamed from: g */
    protected final void m4739g(C1979b c1979b, C1987f c1987f, Set<C1979b> set, boolean z, boolean z2, int i, boolean z3) {
        AbstractC2016t0 abstractC2016t0M4789d;
        boolean z4;
        boolean z5;
        int iMo4731a;
        C1979b c1979b2;
        C1972V c1972v;
        C1979b c1979b3;
        int i2;
        int i3;
        C2025b c2025b;
        C1973W c1973w;
        boolean z6;
        boolean z7;
        AbstractC2001m abstractC2001m = c1979b.f4522a;
        if (!abstractC2001m.f4563d) {
            c1987f.m4772a(c1979b, this.f4499f);
        }
        for (int i4 = 0; i4 < abstractC2001m.m4788b(); i4++) {
            if (i4 != 0) {
                abstractC2016t0M4789d = abstractC2001m.m4789d(i4);
                if ((abstractC2016t0M4789d instanceof C2005o) && z) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                iMo4731a = abstractC2016t0M4789d.mo4731a();
                c1979b2 = null;
                if (iMo4731a != 10) {
                    switch (iMo4731a) {
                        case 1:
                            c1979b3 = new C1979b(c1979b, abstractC2016t0M4789d.f4577a, c1979b.f4524c, c1979b.f4526e);
                            break;
                        case 2:
                        case 5:
                        case 7:
                            if (z3 || !abstractC2016t0M4789d.mo4732d(-1, 1)) {
                                c1979b3 = c1979b2;
                            } else {
                                c1979b3 = new C1979b(c1979b, abstractC2016t0M4789d.f4577a, c1979b.f4524c, c1979b.f4526e);
                            }
                            break;
                        case 3:
                            C1988f0 c1988f0 = (C1988f0) abstractC2016t0M4789d;
                            c1979b2 = new C1979b(c1979b, c1988f0.f4577a, C2004n0.m4790i(c1979b.f4524c, c1988f0.f4542c.f4561b), c1979b.f4526e);
                            c1979b3 = c1979b2;
                            break;
                        case 4:
                            c1973w = (C1973W) abstractC2016t0M4789d;
                            if (z4 || ((z6 = c1973w.f4508d) && !(z6 && z5))) {
                                c1979b3 = new C1979b(c1979b, c1973w.f4577a, c1979b.f4524c, c1979b.f4526e);
                            } else if (z2) {
                                int iMo4660i = this.f4500g.mo4660i();
                                this.f4500g.mo4658f(this.f4501h);
                                this.f4497d.getClass();
                                this.f4500g.mo4658f(iMo4660i);
                                c1979b3 = new C1979b(c1979b, c1973w.f4577a, c1979b.f4524c, c1979b.f4526e);
                            } else {
                                c1979b2 = new C1979b(c1979b, c1973w.f4577a, c1979b.f4524c, AbstractC2000l0.m4785b(c1979b.f4526e, new C1998k0(c1973w.f4506b, c1973w.f4507c, z6)));
                                c1979b3 = c1979b2;
                            }
                            break;
                        case 6:
                            c1979b3 = new C1979b(c1979b, ((C2005o) abstractC2016t0M4789d).f4577a, c1979b.f4524c, c1979b.f4526e);
                            break;
                        default:
                            c1979b3 = c1979b2;
                            break;
                    }
                } else {
                    c1972v = (C1972V) abstractC2016t0M4789d;
                    if (z4 || !z5) {
                        c1979b3 = new C1979b(c1979b, c1972v.f4577a, c1979b.f4524c, c1979b.f4526e);
                    } else {
                        if (z2) {
                            int iMo4660i2 = this.f4500g.mo4660i();
                            this.f4500g.mo4658f(this.f4501h);
                            boolean zMo4635h = this.f4497d.mo4635h(c1972v.f4505b);
                            this.f4500g.mo4658f(iMo4660i2);
                            if (zMo4635h) {
                                c1979b3 = new C1979b(c1979b, c1972v.f4577a, c1979b.f4524c, c1979b.f4526e);
                            }
                        } else {
                            c1979b2 = new C1979b(c1979b, c1972v.f4577a, c1979b.f4524c, AbstractC2000l0.m4785b(c1979b.f4526e, new C1996j0(c1972v.f4505b)));
                        }
                        c1979b3 = c1979b2;
                    }
                }
                if (c1979b3 == null) {
                    if (c1979b.f4522a instanceof C1986e0) {
                        c2025b = this.f4503j;
                        if (c2025b != null && c2025b.m4797b() && ((C2021x) abstractC2016t0M4789d).m4791e() == this.f4503j.f4588d.f4562c) {
                            c1979b3.f4525d |= 1073741824;
                        }
                        c1979b3.f4525d++;
                        if (!set.add(c1979b3)) {
                            c1987f.f4538g = true;
                            i3 = i - 1;
                            i2 = i3;
                            m4738f(c1979b3, c1987f, set, z4, z2, i2, z3);
                        }
                    } else if (!abstractC2016t0M4789d.mo4749b() || set.add(c1979b3)) {
                        if ((abstractC2016t0M4789d instanceof C1988f0) || i < 0) {
                            i2 = i;
                        } else {
                            i3 = i + 1;
                            i2 = i3;
                        }
                        m4738f(c1979b3, c1987f, set, z4, z2, i2, z3);
                    }
                }
            } else {
                if (f4496k) {
                    z7 = false;
                } else {
                    AbstractC2001m abstractC2001m2 = c1979b.f4522a;
                    if (abstractC2001m2.mo4730c() != 10 || !((C2008p0) abstractC2001m2).f4574j || c1979b.f4524c.mo4756f() || c1979b.f4524c.m4755e()) {
                        z7 = false;
                    } else {
                        int iMo4757h = c1979b.f4524c.mo4757h();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= iMo4757h) {
                                C2015t c2015t = (C2015t) this.f4557a.f4513a.get(((AbstractC2017u) abstractC2001m2.m4789d(0).f4577a).f4578i.f4561b);
                                int i6 = 0;
                                while (true) {
                                    if (i6 < iMo4757h) {
                                        AbstractC2001m abstractC2001m3 = (AbstractC2001m) this.f4557a.f4513a.get(c1979b.f4524c.mo4754d(i6));
                                        if (abstractC2001m3.m4788b() == 1 && abstractC2001m3.m4789d(0).mo4749b()) {
                                            AbstractC2001m abstractC2001m4 = abstractC2001m3.m4789d(0).f4577a;
                                            if ((abstractC2001m3.mo4730c() == 8 && abstractC2001m4 == abstractC2001m2) || abstractC2001m3 == c2015t || abstractC2001m4 == c2015t || (abstractC2001m4.mo4730c() == 8 && abstractC2001m4.m4788b() == 1 && abstractC2001m4.m4789d(0).mo4749b() && abstractC2001m4.m4789d(0).f4577a == abstractC2001m2)) {
                                                i6++;
                                            }
                                        }
                                    } else {
                                        z7 = true;
                                    }
                                }
                            } else if (((AbstractC2001m) this.f4557a.f4513a.get(c1979b.f4524c.mo4754d(i5))).f4562c == abstractC2001m2.f4562c) {
                                i5++;
                            }
                            z7 = false;
                        }
                    }
                }
                if (!z7) {
                    abstractC2016t0M4789d = abstractC2001m.m4789d(i4);
                    if (abstractC2016t0M4789d instanceof C2005o) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (i == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iMo4731a = abstractC2016t0M4789d.mo4731a();
                    c1979b2 = null;
                    if (iMo4731a != 10) {
                        switch (iMo4731a) {
                            case 1:
                                c1979b3 = new C1979b(c1979b, abstractC2016t0M4789d.f4577a, c1979b.f4524c, c1979b.f4526e);
                                break;
                            case 2:
                            case 5:
                            case 7:
                                if (z3) {
                                    c1979b3 = c1979b2;
                                } else {
                                    c1979b3 = c1979b2;
                                }
                                break;
                            case 3:
                                C1988f0 c1988f1 = (C1988f0) abstractC2016t0M4789d;
                                c1979b2 = new C1979b(c1979b, c1988f1.f4577a, C2004n0.m4790i(c1979b.f4524c, c1988f1.f4542c.f4561b), c1979b.f4526e);
                                c1979b3 = c1979b2;
                                break;
                            case 4:
                                c1973w = (C1973W) abstractC2016t0M4789d;
                                if (z4) {
                                    c1979b3 = new C1979b(c1979b, c1973w.f4577a, c1979b.f4524c, c1979b.f4526e);
                                } else {
                                    c1979b3 = new C1979b(c1979b, c1973w.f4577a, c1979b.f4524c, c1979b.f4526e);
                                }
                                break;
                            case 6:
                                c1979b3 = new C1979b(c1979b, ((C2005o) abstractC2016t0M4789d).f4577a, c1979b.f4524c, c1979b.f4526e);
                                break;
                            default:
                                c1979b3 = c1979b2;
                                break;
                        }
                    } else {
                        c1972v = (C1972V) abstractC2016t0M4789d;
                        if (z4) {
                            c1979b3 = new C1979b(c1979b, c1972v.f4577a, c1979b.f4524c, c1979b.f4526e);
                        } else {
                            c1979b3 = new C1979b(c1979b, c1972v.f4577a, c1979b.f4524c, c1979b.f4526e);
                        }
                    }
                    if (c1979b3 == null) {
                        if (c1979b.f4522a instanceof C1986e0) {
                            c2025b = this.f4503j;
                            if (c2025b != null) {
                                c1979b3.f4525d |= 1073741824;
                            }
                            c1979b3.f4525d++;
                            if (!set.add(c1979b3)) {
                                c1987f.f4538g = true;
                                i3 = i - 1;
                                i2 = i3;
                                m4738f(c1979b3, c1987f, set, z4, z2, i2, z3);
                            }
                        } else {
                            if (!abstractC2016t0M4789d.mo4749b()) {
                            }
                            if (abstractC2016t0M4789d instanceof C1988f0) {
                            }
                            i2 = i;
                            m4738f(c1979b3, c1987f, set, z4, z2, i2, z3);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0143  */
    /* JADX WARN: Code duplicated, block: B:77:0x014d A[LOOP:5: B:75:0x0147->B:77:0x014d, LOOP_END] */
    /* JADX INFO: renamed from: h */
    protected final C1987f m4740h(C1987f c1987f, int i, boolean z) {
        int i2;
        Iterator it;
        if (this.f4499f == null) {
            this.f4499f = new C1278d<>();
        }
        C1987f c1987f2 = new C1987f(z);
        Iterator<C1979b> it2 = c1987f.iterator();
        ArrayList arrayList = null;
        while (true) {
            i2 = 0;
            if (!it2.hasNext()) {
                break;
            }
            C1979b next = it2.next();
            AbstractC2001m abstractC2001m = next.f4522a;
            if (!(abstractC2001m instanceof C1986e0)) {
                int iM4788b = abstractC2001m.m4788b();
                while (i2 < iM4788b) {
                    AbstractC2016t0 abstractC2016t0M4789d = next.f4522a.m4789d(i2);
                    AbstractC2001m abstractC2001m2 = abstractC2016t0M4789d.mo4732d(i, this.f4557a.f4518f) ? abstractC2016t0M4789d.f4577a : null;
                    if (abstractC2001m2 != null) {
                        c1987f2.m4772a(new C1979b(next, abstractC2001m2, next.f4524c, next.f4526e), this.f4499f);
                    }
                    i2++;
                }
            } else if (z || i == -1) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(next);
            }
        }
        C1987f c1987f3 = (arrayList != null || i == -1 || (c1987f2.size() != 1 && m4733o(c1987f2) == 0)) ? null : c1987f2;
        if (c1987f3 == null) {
            C1987f c1987f4 = new C1987f(z);
            HashSet hashSet = new HashSet();
            boolean z2 = i == -1;
            Iterator<C1979b> it3 = c1987f2.iterator();
            while (it3.hasNext()) {
                m4738f(it3.next(), c1987f4, hashSet, false, z, 0, z2);
                c1987f4 = c1987f4;
            }
            c1987f3 = c1987f4;
        }
        if (i == -1) {
            boolean z3 = c1987f3 == c1987f2;
            if (!C1980b0.m4768a(c1987f3)) {
                C1987f c1987f5 = new C1987f(c1987f3.f4539h);
                for (C1979b c1979b : c1987f3) {
                    AbstractC2001m abstractC2001m3 = c1979b.f4522a;
                    if (abstractC2001m3 instanceof C1986e0) {
                        c1987f5.m4772a(c1979b, this.f4499f);
                    } else if (z3 && abstractC2001m3.f4563d && this.f4557a.m4763e(abstractC2001m3).m3209d(-2)) {
                        c1987f5.m4772a(new C1979b(c1979b, this.f4557a.f4516d[c1979b.f4522a.f4562c], c1979b.f4524c, c1979b.f4526e), this.f4499f);
                    }
                }
                c1987f3 = c1987f5;
            }
        }
        if (arrayList != null) {
            if (z) {
                Iterator<C1979b> it4 = c1987f3.iterator();
                while (it4.hasNext()) {
                    if (it4.next().f4522a instanceof C1986e0) {
                        i2 = 1;
                        break;
                    }
                }
                if (i2 == 0) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        c1987f3.m4772a((C1979b) it.next(), this.f4499f);
                    }
                }
            } else {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    c1987f3.m4772a((C1979b) it.next(), this.f4499f);
                }
            }
        }
        if (c1987f3.isEmpty()) {
            return null;
        }
        return c1987f3;
    }

    /* JADX INFO: renamed from: i */
    protected final C1987f m4741i(AbstractC2001m abstractC2001m, C1918D c1918d, boolean z) {
        AbstractC1974X abstractC1974XM4750a = AbstractC1974X.m4750a(this.f4557a, c1918d);
        C1987f c1987f = new C1987f(z);
        int i = 0;
        while (i < abstractC2001m.m4788b()) {
            int i2 = i + 1;
            m4738f(new C1979b(abstractC2001m.m4789d(i).f4577a, i2, abstractC1974XM4750a, AbstractC2000l0.f4559a), c1987f, new HashSet(), true, z, 0, false);
            i = i2;
        }
        return c1987f;
    }

    /* JADX INFO: renamed from: j */
    protected final BitSet m4742j(C2027d[] c2027dArr, C1950y c1950y) {
        BitSet bitSet = new BitSet();
        for (C2027d c2027d : c2027dArr) {
            AbstractC2000l0 abstractC2000l0 = c2027d.f4592a;
            if (abstractC2000l0 == AbstractC2000l0.f4559a || m4743k(abstractC2000l0, c1950y)) {
                bitSet.set(c2027d.f4593b);
            }
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: k */
    protected final boolean m4743k(AbstractC2000l0 abstractC2000l0, C1950y c1950y) {
        return abstractC2000l0.mo4775c(this.f4497d, c1950y);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX INFO: renamed from: l */
    protected final int m4744l(C2025b c2025b, C2028e c2028e, InterfaceC1922H interfaceC1922H, int i, C1950y c1950y) {
        boolean z;
        BitSet bitSet;
        C1987f c1987fM4740h;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        BitSet bitSet2;
        int i3;
        Object r4 = 1;
        int iMo4659h = interfaceC1922H.mo4659h(1);
        C2028e c2028e2 = c2028e;
        while (true) {
            C2028e[] c2028eArr = c2028e2.f4596c;
            C2028e c2028eM4735c = (c2028eArr == null || (i3 = iMo4659h + 1) < 0 || i3 >= c2028eArr.length) ? null : c2028eArr[i3];
            if (c2028eM4735c == null) {
                C1987f c1987fM4740h2 = m4740h(c2028e2.f4595b, iMo4659h, false);
                if (c1987fM4740h2 == null) {
                    c2028eM4735c = AbstractC1999l.f4556c;
                    m4735c(c2025b, c2028e2, iMo4659h, c2028eM4735c);
                } else {
                    C2028e c2028e3 = new C2028e(c1987fM4740h2);
                    int iM4733o = m4733o(c1987fM4740h2);
                    if (iM4733o != 0) {
                        c2028e3.f4597d = r4;
                        c2028e3.f4595b.f4535d = iM4733o;
                        c2028e3.f4598e = iM4733o;
                    } else {
                        if (!C1980b0.m4768a(c1987fM4740h2)) {
                            Iterator it = ((ArrayList) C1980b0.m4769b(c1987fM4740h2)).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z4 = false;
                                    break;
                                }
                                if (((BitSet) it.next()).cardinality() > r4) {
                                    z4 = true;
                                    break;
                                }
                            }
                            if (z4) {
                                HashMap map = new HashMap();
                                for (C1979b c1979b : c1987fM4740h2) {
                                    BitSet bitSet3 = (BitSet) map.get(c1979b.f4522a);
                                    if (bitSet3 == null) {
                                        bitSet3 = new BitSet();
                                        map.put(c1979b.f4522a, bitSet3);
                                    }
                                    bitSet3.set(c1979b.f4523b);
                                }
                                Iterator it2 = map.values().iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z5 = false;
                                        break;
                                    }
                                    if (((BitSet) it2.next()).cardinality() == r4) {
                                        z5 = true;
                                        break;
                                    }
                                }
                                z3 = z5 ? false : true;
                            }
                        }
                        if (z3) {
                            C1987f c1987f = c2028e3.f4595b;
                            Collection<BitSet> collectionM4769b = C1980b0.m4769b(c1987fM4740h2);
                            BitSet bitSet4 = new BitSet();
                            Iterator it3 = ((ArrayList) collectionM4769b).iterator();
                            while (it3.hasNext()) {
                                bitSet4.or((BitSet) it3.next());
                            }
                            c1987f.f4536e = bitSet4;
                            c2028e3.f4600g = r4;
                            c2028e3.f4597d = r4;
                            c2028e3.f4598e = c2028e3.f4595b.f4536e.nextSetBit(0);
                        }
                    }
                    if (c2028e3.f4597d && c2028e3.f4595b.f4537f) {
                        int iM4788b = this.f4557a.m4760b(c2025b.f4587c).m4788b();
                        C1987f c1987f2 = c2028e3.f4595b;
                        if (c1987f2.f4535d != 0) {
                            bitSet2 = new BitSet();
                            bitSet2.set(c1987f2.f4535d);
                        } else {
                            bitSet2 = c1987f2.f4536e;
                        }
                        AbstractC2000l0[] abstractC2000l0Arr = new AbstractC2000l0[iM4788b + 1];
                        for (C1979b c1979b2 : c2028e3.f4595b) {
                            if (bitSet2.get(c1979b2.f4523b)) {
                                int i4 = c1979b2.f4523b;
                                abstractC2000l0Arr[i4] = AbstractC2000l0.m4786e(abstractC2000l0Arr[i4], c1979b2.f4526e);
                            }
                        }
                        int i5 = 0;
                        for (int i6 = 1; i6 <= iM4788b; i6++) {
                            if (abstractC2000l0Arr[i6] == null) {
                                abstractC2000l0Arr[i6] = AbstractC2000l0.f4559a;
                            } else if (abstractC2000l0Arr[i6] != AbstractC2000l0.f4559a) {
                                i5++;
                            }
                        }
                        if (i5 == 0) {
                            abstractC2000l0Arr = null;
                        }
                        if (abstractC2000l0Arr != null) {
                            ArrayList arrayList = new ArrayList();
                            boolean z6 = false;
                            for (int i7 = 1; i7 < abstractC2000l0Arr.length; i7++) {
                                AbstractC2000l0 abstractC2000l0 = abstractC2000l0Arr[i7];
                                if (bitSet2 != null && bitSet2.get(i7)) {
                                    arrayList.add(new C2027d(abstractC2000l0, i7));
                                }
                                if (abstractC2000l0 != AbstractC2000l0.f4559a) {
                                    z6 = true;
                                }
                            }
                            c2028e3.f4601h = !z6 ? null : (C2027d[]) arrayList.toArray(new C2027d[arrayList.size()]);
                            c2028e3.f4598e = 0;
                        } else {
                            c2028e3.f4598e = bitSet2.nextSetBit(0);
                        }
                        if (c2028e3.f4601h != null) {
                            c2028e3.f4598e = 0;
                        }
                    }
                    c2028eM4735c = m4735c(c2025b, c2028e2, iMo4659h, c2028e3);
                }
            }
            if (c2028eM4735c == AbstractC1999l.f4556c) {
                C1947v c1947vM4747p = m4747p(interfaceC1922H, c1950y, c2028e2.f4595b, i);
                interfaceC1922H.mo4658f(i);
                int iM4746n = m4746n(c2028e2.f4595b, c1950y);
                if (iM4746n != 0) {
                    return iM4746n;
                }
                throw c1947vM4747p;
            }
            if (c2028eM4735c.f4600g) {
                BitSet bitSet5 = c2028eM4735c.f4595b.f4536e;
                if (c2028eM4735c.f4601h != null) {
                    int iMo4660i = interfaceC1922H.mo4660i();
                    if (iMo4660i != i) {
                        interfaceC1922H.mo4658f(i);
                    }
                    BitSet bitSetM4742j = m4742j(c2028eM4735c.f4601h, c1950y);
                    z = true;
                    if (bitSetM4742j.cardinality() == 1) {
                        return bitSetM4742j.nextSetBit(0);
                    }
                    if (iMo4660i != i) {
                        interfaceC1922H.mo4658f(iMo4660i);
                    }
                    bitSet = bitSetM4742j;
                } else {
                    z = true;
                    bitSet = bitSet5;
                }
                C1987f c1987fM4741i = m4741i(c2025b.f4588d, c1950y, z);
                C1987f c1987f3 = c2028eM4735c.f4595b;
                int iMo4660i2 = interfaceC1922H.mo4660i();
                AbstractC1949x abstractC1949x = this.f4497d;
                if (abstractC1949x != null) {
                    ((C1951z) abstractC1949x.m4632e()).mo4655d(this.f4497d, c2025b, i, iMo4660i2, bitSet, c1987f3);
                }
                interfaceC1922H.mo4658f(i);
                boolean z7 = true;
                int iMo4659h2 = interfaceC1922H.mo4659h(1);
                while (true) {
                    c1987fM4740h = m4740h(c1987fM4741i, iMo4659h2, z7);
                    if (c1987fM4740h == null) {
                        C1947v c1947vM4747p2 = m4747p(interfaceC1922H, c1950y, c1987fM4741i, i);
                        interfaceC1922H.mo4658f(i);
                        int iM4746n2 = m4746n(c1987fM4741i, c1950y);
                        if (iM4746n2 != 0) {
                            return iM4746n2;
                        }
                        throw c1947vM4747p2;
                    }
                    Collection<BitSet> collectionM4769b2 = C1980b0.m4769b(c1987fM4740h);
                    int iM4733o2 = m4733o(c1987fM4740h);
                    c1987fM4740h.f4535d = iM4733o2;
                    if (iM4733o2 != 0) {
                        i2 = iM4733o2;
                        break;
                    }
                    int iM4770c = C1980b0.m4770c(collectionM4769b2);
                    if (iM4770c != 0) {
                        i2 = iM4770c;
                        break;
                    }
                    if (iMo4659h2 != -1) {
                        interfaceC1922H.mo4661j();
                        iMo4659h2 = interfaceC1922H.mo4659h(1);
                    }
                    c1987fM4741i = c1987fM4740h;
                    z7 = true;
                }
                int i8 = c1987fM4740h.f4535d;
                int iMo4660i3 = interfaceC1922H.mo4660i();
                if (i8 != 0) {
                    AbstractC1949x abstractC1949x2 = this.f4497d;
                    if (abstractC1949x2 != null) {
                        ((C1951z) abstractC1949x2.m4632e()).mo4654c(this.f4497d, c2025b, i, iMo4660i3, i2, c1987fM4740h);
                    }
                } else {
                    BitSet bitSet6 = new BitSet();
                    Iterator<C1979b> it4 = c1987fM4740h.f4534c.iterator();
                    while (it4.hasNext()) {
                        bitSet6.set(it4.next().f4523b);
                    }
                    m4748q(c2025b, i, iMo4660i3, bitSet6, c1987fM4740h);
                }
                return i2;
            }
            if (c2028eM4735c.f4597d) {
                if (c2028eM4735c.f4601h == null) {
                    return c2028eM4735c.f4598e;
                }
                int iMo4660i4 = interfaceC1922H.mo4660i();
                interfaceC1922H.mo4658f(i);
                BitSet bitSetM4742j2 = m4742j(c2028eM4735c.f4601h, c1950y);
                int iCardinality = bitSetM4742j2.cardinality();
                if (iCardinality == 0) {
                    throw m4747p(interfaceC1922H, c1950y, c2028eM4735c.f4595b, i);
                }
                if (iCardinality == 1) {
                    return bitSetM4742j2.nextSetBit(0);
                }
                m4748q(c2025b, i, iMo4660i4, bitSetM4742j2, c2028eM4735c.f4595b);
                return bitSetM4742j2.nextSetBit(0);
            }
            if (iMo4659h != -1) {
                interfaceC1922H.mo4661j();
                z2 = true;
                iMo4659h = interfaceC1922H.mo4659h(1);
            } else {
                z2 = true;
            }
            c2028e2 = c2028eM4735c;
            r4 = z2;
        }
    }

    /* JADX INFO: renamed from: m */
    protected final int m4745m(C1987f c1987f) {
        C1285k c1285k = new C1285k(new int[0]);
        for (C1979b c1979b : c1987f) {
            if (c1979b.m4766b() > 0 || ((c1979b.f4522a instanceof C1986e0) && c1979b.f4524c.m4755e())) {
                c1285k.m3206a(c1979b.f4523b);
            }
        }
        if (c1285k.m3214j() == 0) {
            return 0;
        }
        return c1285k.m3210e();
    }

    /* JADX INFO: renamed from: n */
    protected final int m4746n(C1987f c1987f, C1950y c1950y) {
        int iM4745m;
        C1987f c1987f2 = new C1987f(c1987f.f4539h);
        C1987f c1987f3 = new C1987f(c1987f.f4539h);
        for (C1979b c1979b : c1987f) {
            AbstractC2000l0 abstractC2000l0 = c1979b.f4526e;
            if (abstractC2000l0 == AbstractC2000l0.f4559a || m4743k(abstractC2000l0, c1950y)) {
                c1987f2.m4772a(c1979b, null);
            } else {
                c1987f3.m4772a(c1979b, null);
            }
        }
        int iM4745m2 = m4745m(c1987f2);
        if (iM4745m2 != 0) {
            return iM4745m2;
        }
        if (c1987f3.size() <= 0 || (iM4745m = m4745m(c1987f3)) == 0) {
            return 0;
        }
        return iM4745m;
    }

    /* JADX INFO: renamed from: p */
    protected final C1947v m4747p(InterfaceC1922H interfaceC1922H, C1950y c1950y, C1987f c1987f, int i) {
        return new C1947v(this.f4497d, interfaceC1922H, interfaceC1922H.get(i), interfaceC1922H.mo4647g(1), c1950y);
    }

    /* JADX INFO: renamed from: q */
    protected final void m4748q(C2025b c2025b, int i, int i2, BitSet bitSet, C1987f c1987f) {
        AbstractC1949x abstractC1949x = this.f4497d;
        if (abstractC1949x != null) {
            ((C1951z) abstractC1949x.m4632e()).mo4652a(this.f4497d, c2025b, i, i2, bitSet, c1987f);
        }
    }
}
