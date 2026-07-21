package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p098x.AbstractC1945t;
import com.github.catvod.spider.support.p044FM.p098x.C1946u;
import com.github.catvod.spider.support.p044FM.p098x.InterfaceC1929d;
import com.github.catvod.spider.support.p044FM.p100z.C2025b;
import com.github.catvod.spider.support.p044FM.p100z.C2028e;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.B */
/* JADX INFO: loaded from: classes.dex */
public final class C1953B extends AbstractC1999l {

    /* JADX INFO: renamed from: d */
    protected final AbstractC1945t f4466d;

    /* JADX INFO: renamed from: e */
    protected int f4467e;

    /* JADX INFO: renamed from: f */
    protected int f4468f;

    /* JADX INFO: renamed from: g */
    protected int f4469g;

    /* JADX INFO: renamed from: h */
    public final C2025b[] f4470h;

    /* JADX INFO: renamed from: i */
    protected int f4471i;

    /* JADX INFO: renamed from: j */
    protected final C1952A f4472j;

    public C1953B(AbstractC1945t abstractC1945t, C1977a c1977a, C2025b[] c2025bArr, C1975Y c1975y) {
        super(c1977a, c1975y);
        this.f4467e = -1;
        this.f4468f = 1;
        this.f4469g = 0;
        this.f4471i = 0;
        this.f4472j = new C1952A();
        this.f4470h = c2025bArr;
        this.f4466d = abstractC1945t;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC1999l
    /* JADX INFO: renamed from: a */
    public final void mo4713a() {
        C1952A c1952a = this.f4472j;
        c1952a.f4462a = -1;
        c1952a.f4463b = 0;
        c1952a.f4464c = -1;
        c1952a.f4465d = null;
        this.f4467e = -1;
        this.f4468f = 1;
        this.f4469g = 0;
        this.f4471i = 0;
    }

    /* JADX INFO: renamed from: b */
    protected final void m4714b(C2028e c2028e, int i, C2028e c2028e2) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (c2028e) {
            if (c2028e.f4596c == null) {
                c2028e.f4596c = new C2028e[128];
            }
            c2028e.f4596c[i + 0] = c2028e2;
        }
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.FM.z.e, com.github.catvod.spider.support.FM.z.e>] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.FM.z.e, com.github.catvod.spider.support.FM.z.e>] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.FM.z.e, com.github.catvod.spider.support.FM.z.e>] */
    /* JADX INFO: renamed from: c */
    protected final C2028e m4715c(C1987f c1987f) {
        C1979b next;
        C2028e c2028e = new C2028e(c1987f);
        Iterator<C1979b> it = c1987f.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(next.f4522a instanceof C1986e0));
        if (next != null) {
            c2028e.f4597d = true;
            c2028e.f4599f = ((C2023z) next).m4794e();
            c2028e.f4598e = this.f4557a.f4519g[next.f4522a.f4562c];
        }
        C2025b c2025b = this.f4470h[this.f4471i];
        synchronized (c2025b.f4585a) {
            C2028e c2028e2 = (C2028e) c2025b.f4585a.get(c2028e);
            if (c2028e2 != null) {
                return c2028e2;
            }
            c2028e.f4594a = c2025b.f4585a.size();
            c1987f.f4532a = true;
            c1987f.f4533b = null;
            c2028e.f4595b = c1987f;
            c2025b.f4585a.put(c2028e, c2028e);
            return c2028e;
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0152  */
    /* JADX WARN: Code duplicated, block: B:85:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v26, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.y.m>] */
    /* JADX INFO: renamed from: d */
    protected final boolean m4716d(InterfaceC1929d interfaceC1929d, C2023z c2023z, C1987f c1987f, boolean z, boolean z2, boolean z3) {
        C2023z c2023z2;
        C2023z c2023z3;
        AbstractC2001m abstractC2001m = c2023z.f4522a;
        boolean z4 = true;
        if (abstractC2001m instanceof C1986e0) {
            AbstractC1974X abstractC1974X = c2023z.f4524c;
            if (abstractC1974X == null || abstractC1974X.m4755e()) {
                AbstractC1974X abstractC1974X2 = c2023z.f4524c;
                if (abstractC1974X2 == null || abstractC1974X2.mo4756f()) {
                    c1987f.m4772a(c2023z, null);
                    return true;
                }
                c1987f.m4772a(new C2023z(c2023z, c2023z.f4522a, AbstractC1974X.f4509b), null);
            } else {
                z4 = z;
            }
            AbstractC1974X abstractC1974X3 = c2023z.f4524c;
            if (abstractC1974X3 == null || abstractC1974X3.mo4756f()) {
                return z4;
            }
            boolean zM4716d = z4;
            for (int i = 0; i < c2023z.f4524c.mo4757h(); i++) {
                if (c2023z.f4524c.mo4754d(i) != Integer.MAX_VALUE) {
                    zM4716d = m4716d(interfaceC1929d, new C2023z(c2023z, (AbstractC2001m) this.f4557a.f4513a.get(c2023z.f4524c.mo4754d(i)), c2023z.f4524c.mo4753c(i)), c1987f, zM4716d, z2, z3);
                }
            }
            return zM4716d;
        }
        if (!abstractC2001m.f4563d && (!z || !c2023z.m4795f())) {
            c1987f.m4772a(c2023z, null);
        }
        AbstractC2001m abstractC2001m2 = c2023z.f4522a;
        boolean zM4716d2 = z;
        for (int i2 = 0; i2 < abstractC2001m2.m4788b(); i2++) {
            AbstractC2016t0 abstractC2016t0M4789d = abstractC2001m2.m4789d(i2);
            int iMo4731a = abstractC2016t0M4789d.mo4731a();
            if (iMo4731a == 10) {
                throw new UnsupportedOperationException("Precedence predicates are not supported in lexers.");
            }
            switch (iMo4731a) {
                case 1:
                    c2023z3 = new C2023z(c2023z, abstractC2016t0M4789d.f4577a);
                    c2023z2 = c2023z3;
                    if (c2023z2 != null) {
                        zM4716d2 = m4716d(interfaceC1929d, c2023z2, c1987f, zM4716d2, z2, z3);
                    }
                    break;
                case 2:
                case 5:
                case 7:
                    if (z3 && abstractC2016t0M4789d.mo4732d(-1, 1114111)) {
                        c2023z3 = new C2023z(c2023z, abstractC2016t0M4789d.f4577a);
                        c2023z2 = c2023z3;
                    } else {
                        c2023z2 = null;
                    }
                    if (c2023z2 != null) {
                        zM4716d2 = m4716d(interfaceC1929d, c2023z2, c1987f, zM4716d2, z2, z3);
                    }
                    break;
                case 3:
                    c2023z2 = new C2023z(c2023z, abstractC2016t0M4789d.f4577a, C2004n0.m4790i(c2023z.f4524c, ((C1988f0) abstractC2016t0M4789d).f4542c.f4561b));
                    if (c2023z2 != null) {
                        zM4716d2 = m4716d(interfaceC1929d, c2023z2, c1987f, zM4716d2, z2, z3);
                    }
                    break;
                case 4:
                    c1987f.f4537f = true;
                    if (this.f4466d != null && z2) {
                        int i3 = this.f4469g;
                        int i4 = this.f4468f;
                        int iMo4660i = interfaceC1929d.mo4660i();
                        interfaceC1929d.mo4657d();
                        try {
                            m4717e(interfaceC1929d);
                            this.f4466d.getClass();
                            this.f4469g = i3;
                            this.f4468f = i4;
                            interfaceC1929d.mo4658f(iMo4660i);
                            interfaceC1929d.mo4656a();
                        } catch (Throwable th) {
                            this.f4469g = i3;
                            this.f4468f = i4;
                            interfaceC1929d.mo4658f(iMo4660i);
                            interfaceC1929d.mo4656a();
                            throw th;
                        }
                    }
                    c2023z3 = new C2023z(c2023z, abstractC2016t0M4789d.f4577a);
                    c2023z2 = c2023z3;
                    if (c2023z2 != null) {
                        zM4716d2 = m4716d(interfaceC1929d, c2023z2, c1987f, zM4716d2, z2, z3);
                    }
                    break;
                case 6:
                    AbstractC1974X abstractC1974X4 = c2023z.f4524c;
                    if (abstractC1974X4 == null || abstractC1974X4.m4755e()) {
                        c2023z2 = new C2023z(c2023z, abstractC2016t0M4789d.f4577a, C1955D.m4725a(c2023z.m4794e(), this.f4557a.f4520h[((C2005o) abstractC2016t0M4789d).f4570c]));
                    } else {
                        c2023z3 = new C2023z(c2023z, abstractC2016t0M4789d.f4577a);
                        c2023z2 = c2023z3;
                    }
                    if (c2023z2 != null) {
                        zM4716d2 = m4716d(interfaceC1929d, c2023z2, c1987f, zM4716d2, z2, z3);
                    }
                    break;
                default:
                    c2023z2 = null;
                    if (c2023z2 != null) {
                        zM4716d2 = m4716d(interfaceC1929d, c2023z2, c1987f, zM4716d2, z2, z3);
                    }
                    break;
            }
        }
        return zM4716d2;
    }

    /* JADX INFO: renamed from: e */
    public final void m4717e(InterfaceC1929d interfaceC1929d) {
        if (interfaceC1929d.mo4659h(1) == 10) {
            this.f4468f++;
            this.f4469g = 0;
        } else {
            this.f4469g++;
        }
        interfaceC1929d.mo4661j();
    }

    /* JADX INFO: renamed from: f */
    protected final int m4718f(InterfaceC1929d interfaceC1929d, C2028e c2028e) throws Throwable {
        AbstractC1945t abstractC1945t;
        int i;
        C1979b c1979b;
        if (c2028e.f4597d) {
            C1952A c1952a = this.f4472j;
            c1952a.f4462a = interfaceC1929d.mo4660i();
            c1952a.f4463b = this.f4468f;
            c1952a.f4464c = this.f4469g;
            c1952a.f4465d = c2028e;
        }
        C2028e c2028e2 = c2028e;
        int iMo4659h = interfaceC1929d.mo4659h(1);
        while (true) {
            C2028e[] c2028eArr = c2028e2.f4596c;
            C2028e c2028e3 = (c2028eArr == null || iMo4659h < 0 || iMo4659h > 127) ? null : c2028eArr[iMo4659h + 0];
            int i2 = -1;
            if (c2028e3 == null) {
                C1968Q c1968q = new C1968Q();
                int i3 = 0;
                for (C1979b c1979b2 : c2028e2.f4595b) {
                    boolean z = c1979b2.f4523b == i3;
                    if (z && ((C2023z) c1979b2).m4795f()) {
                        i3 = i3;
                        break;
                        break;
                    }
                    int iM4788b = c1979b2.f4522a.m4788b();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= iM4788b) {
                            i3 = i3;
                            break;
                        }
                        AbstractC2016t0 abstractC2016t0M4789d = c1979b2.f4522a.m4789d(i4);
                        AbstractC2001m abstractC2001m = abstractC2016t0M4789d.mo4732d(iMo4659h, 1114111) ? abstractC2016t0M4789d.f4577a : null;
                        if (abstractC2001m != null) {
                            C2023z c2023z = (C2023z) c1979b2;
                            C1955D c1955dM4794e = c2023z.m4794e();
                            if (c1955dM4794e != null) {
                                c1955dM4794e = c1955dM4794e.m4727c(interfaceC1929d.mo4660i() - this.f4467e);
                            }
                            boolean z2 = iMo4659h == i2;
                            c1979b = c1979b2;
                            i = iM4788b;
                            if (m4716d(interfaceC1929d, new C2023z(c2023z, abstractC2001m, c1955dM4794e), c1968q, z, true, z2)) {
                                i3 = c1979b.f4523b;
                                break;
                            }
                        } else {
                            i = iM4788b;
                            c1979b = c1979b2;
                        }
                        i4++;
                        c1979b2 = c1979b;
                        i3 = i3;
                        iM4788b = i;
                        i2 = -1;
                    }
                    i2 = -1;
                }
                if (c1968q.isEmpty()) {
                    if (!c1968q.f4537f) {
                        m4714b(c2028e2, iMo4659h, AbstractC1999l.f4556c);
                    }
                    c2028e3 = AbstractC1999l.f4556c;
                    c2028e2 = c2028e3;
                } else {
                    boolean z3 = c1968q.f4537f;
                    c1968q.f4537f = false;
                    C2028e c2028eM4715c = m4715c(c1968q);
                    if (!z3) {
                        m4714b(c2028e2, iMo4659h, c2028eM4715c);
                    }
                    c2028e2 = c2028eM4715c;
                }
            } else {
                c2028e2 = c2028e3;
            }
            if (c2028e2 == AbstractC1999l.f4556c) {
                break;
            }
            if (iMo4659h != -1) {
                m4717e(interfaceC1929d);
            }
            if (c2028e2.f4597d) {
                C1952A c1952a2 = this.f4472j;
                c1952a2.f4462a = interfaceC1929d.mo4660i();
                c1952a2.f4463b = this.f4468f;
                c1952a2.f4464c = this.f4469g;
                c1952a2.f4465d = c2028e2;
                if (iMo4659h == -1) {
                    break;
                }
            }
            iMo4659h = interfaceC1929d.mo4659h(1);
        }
        C1952A c1952a3 = this.f4472j;
        C2028e c2028e4 = c1952a3.f4465d;
        if (c2028e4 == null) {
            if (iMo4659h == -1 && interfaceC1929d.mo4660i() == this.f4467e) {
                return -1;
            }
            throw new C1946u(this.f4466d, interfaceC1929d, this.f4467e);
        }
        C1955D c1955d = c2028e4.f4599f;
        int i5 = this.f4467e;
        int i6 = c1952a3.f4462a;
        int i7 = c1952a3.f4463b;
        int i8 = c1952a3.f4464c;
        interfaceC1929d.mo4658f(i6);
        this.f4468f = i7;
        this.f4469g = i8;
        if (c1955d != null && (abstractC1945t = this.f4466d) != null) {
            c1955d.m4726b(abstractC1945t, interfaceC1929d, i5);
        }
        return c1952a3.f4465d.f4598e;
    }

    /* JADX INFO: renamed from: g */
    public final int m4719g() {
        return this.f4469g;
    }

    /* JADX INFO: renamed from: h */
    public final int m4720h() {
        return this.f4468f;
    }

    /* JADX INFO: renamed from: i */
    public final int m4721i(InterfaceC1929d interfaceC1929d, int i) {
        this.f4471i = i;
        interfaceC1929d.mo4657d();
        try {
            this.f4467e = interfaceC1929d.mo4660i();
            C1952A c1952a = this.f4472j;
            c1952a.f4462a = -1;
            c1952a.f4463b = 0;
            c1952a.f4464c = -1;
            c1952a.f4465d = null;
            C2025b c2025b = this.f4470h[i];
            return c2025b.f4586b == null ? m4722j(interfaceC1929d) : m4718f(interfaceC1929d, c2025b.f4586b);
        } finally {
            interfaceC1929d.mo4656a();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.y.r0>] */
    /* JADX INFO: renamed from: j */
    protected final int m4722j(InterfaceC1929d interfaceC1929d) {
        AbstractC2001m abstractC2001m = (AbstractC2001m) this.f4557a.f4521i.get(this.f4471i);
        C2020w c2020w = AbstractC1974X.f4509b;
        C1968Q c1968q = new C1968Q();
        int i = 0;
        while (i < abstractC2001m.m4788b()) {
            int i2 = i + 1;
            m4716d(interfaceC1929d, new C2023z(abstractC2001m.m4789d(i).f4577a, i2, c2020w), c1968q, false, false, false);
            i = i2;
        }
        boolean z = c1968q.f4537f;
        c1968q.f4537f = false;
        C2028e c2028eM4715c = m4715c(c1968q);
        if (!z) {
            this.f4470h[this.f4471i].f4586b = c2028eM4715c;
        }
        return m4718f(interfaceC1929d, c2028eM4715c);
    }
}
