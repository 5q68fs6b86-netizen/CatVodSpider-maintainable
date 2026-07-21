package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p134t.AbstractC2327t;
import com.github.catvod.spider.support.p134t.C2326s;
import com.github.catvod.spider.support.p134t.C2328u;
import com.github.catvod.spider.support.p134t.C2329v;
import com.github.catvod.spider.support.p134t.C2332y;
import com.github.catvod.spider.support.p134t.InterfaceC2304C;
import com.github.catvod.spider.support.p136v.C2396b;
import com.github.catvod.spider.support.p136v.C2398d;
import com.github.catvod.spider.support.p137w.C2401c;
import com.github.catvod.spider.support.p137w.C2407i;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.support.u.M */
/* JADX INFO: loaded from: classes.dex */
public final class C2346M extends AbstractC2373h {

    /* JADX INFO: renamed from: k */
    public static final boolean f5814k;

    /* JADX INFO: renamed from: d */
    protected final AbstractC2327t f5815d;

    /* JADX INFO: renamed from: e */
    public final C2396b[] f5816e;

    /* JADX INFO: renamed from: f */
    protected C2401c<AbstractC2351S, AbstractC2351S, AbstractC2351S> f5817f;

    /* JADX INFO: renamed from: g */
    protected InterfaceC2304C f5818g;

    /* JADX INFO: renamed from: h */
    protected int f5819h;

    /* JADX INFO: renamed from: i */
    protected C2328u f5820i;

    /* JADX INFO: renamed from: j */
    protected C2396b f5821j;

    static {
        String str;
        try {
            str = System.getenv("TURN_OFF_LR_LOOP_ENTRY_BRANCH_OPT");
        } catch (SecurityException unused) {
            str = null;
        }
        f5814k = Boolean.parseBoolean(str);
    }

    public C2346M(AbstractC2327t abstractC2327t, C2359a c2359a, C2396b[] c2396bArr, C2352T c2352t) {
        super(c2359a, c2352t);
        this.f5815d = abstractC2327t;
        this.f5816e = c2396bArr;
    }

    /* JADX INFO: renamed from: o */
    protected static int m6311o(C2363c c2363c) {
        int i = 0;
        for (C2361b c2361b : c2363c) {
            if (i == 0) {
                i = c2361b.f5847b;
            } else if (c2361b.f5847b != i) {
                return 0;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2373h
    /* JADX INFO: renamed from: a */
    public final void mo6312a() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public final int m6313b(InterfaceC2304C interfaceC2304C, int i, C2328u c2328u) {
        this.f5818g = interfaceC2304C;
        this.f5819h = interfaceC2304C.mo6234h();
        this.f5820i = c2328u;
        C2396b c2396b = this.f5816e[i];
        this.f5821j = c2396b;
        interfaceC2304C.mo6231c();
        int i2 = this.f5819h;
        try {
            C2398d c2398dM6392a = c2396b.m6393b() ? c2396b.m6392a(this.f5815d.m6283o()) : c2396b.f5926b;
            if (c2398dM6392a == null) {
                if (c2328u == null) {
                    c2328u = C2332y.f5799c;
                }
                C2363c c2363cM6320i = m6320i(c2396b.f5928d, C2332y.f5799c, false);
                if (c2396b.m6393b()) {
                    c2396b.f5926b.f5933b = c2363cM6320i;
                    c2398dM6392a = m6315d(c2396b, new C2398d(m6316e(c2363cM6320i)));
                    c2396b.m6394c(this.f5815d.m6283o(), c2398dM6392a);
                } else {
                    c2398dM6392a = m6315d(c2396b, new C2398d(c2363cM6320i));
                    c2396b.f5926b = c2398dM6392a;
                }
            }
            return m6323l(c2396b, c2398dM6392a, interfaceC2304C, i2, c2328u);
        } finally {
            this.f5817f = null;
            this.f5821j = null;
            interfaceC2304C.mo6232e(i2);
            interfaceC2304C.release();
        }
    }

    /* JADX INFO: renamed from: c */
    protected final C2398d m6314c(C2396b c2396b, C2398d c2398d, int i, C2398d c2398d2) {
        if (c2398d2 == null) {
            return null;
        }
        C2398d c2398dM6315d = m6315d(c2396b, c2398d2);
        if (i < -1 || i > this.f5881a.f5840f) {
            return c2398dM6315d;
        }
        synchronized (c2398d) {
            if (c2398d.f5934c == null) {
                c2398d.f5934c = new C2398d[this.f5881a.f5840f + 1 + 1];
            }
            c2398d.f5934c[i + 1] = c2398dM6315d;
        }
        return c2398dM6315d;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.v.d, com.github.catvod.spider.support.v.d>] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.v.d, com.github.catvod.spider.support.v.d>] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.v.d, com.github.catvod.spider.support.v.d>] */
    /* JADX INFO: renamed from: d */
    protected final C2398d m6315d(C2396b c2396b, C2398d c2398d) {
        if (c2398d == AbstractC2373h.f5880c) {
            return c2398d;
        }
        synchronized (c2396b.f5925a) {
            C2398d c2398d2 = (C2398d) c2396b.f5925a.get(c2398d);
            if (c2398d2 != null) {
                return c2398d2;
            }
            c2398d.f5932a = c2396b.f5925a.size();
            C2363c c2363c = c2398d.f5933b;
            if (!c2363c.f5858a) {
                c2363c.m6359b(this);
                C2363c c2363c2 = c2398d.f5933b;
                c2363c2.f5858a = true;
                c2363c2.f5859b = null;
            }
            c2396b.f5925a.put(c2398d, c2398d);
            return c2398d;
        }
    }

    /* JADX INFO: renamed from: e */
    protected final C2363c m6316e(C2363c c2363c) {
        AbstractC2351S abstractC2351S;
        AbstractC2362b0 abstractC2362b0Mo6357d;
        HashMap map = new HashMap();
        C2363c c2363c2 = new C2363c(c2363c.f5865h);
        for (C2361b c2361b : c2363c) {
            if (c2361b.f5847b == 1 && (abstractC2362b0Mo6357d = c2361b.f5850e.mo6357d(this.f5815d, this.f5820i)) != null) {
                map.put(Integer.valueOf(c2361b.f5846a.f5884b), c2361b.f5848c);
                if (abstractC2362b0Mo6357d != c2361b.f5850e) {
                    c2363c2.m6358a(new C2361b(c2361b, c2361b.f5846a, c2361b.f5848c, abstractC2362b0Mo6357d), this.f5817f);
                } else {
                    c2363c2.m6358a(c2361b, this.f5817f);
                }
            }
        }
        for (C2361b c2361b2 : c2363c) {
            if (c2361b2.f5847b != 1 && (c2361b2.m6352c() || (abstractC2351S = (AbstractC2351S) map.get(Integer.valueOf(c2361b2.f5846a.f5884b))) == null || !abstractC2351S.equals(c2361b2.f5848c))) {
                c2363c2.m6358a(c2361b2, this.f5817f);
            }
        }
        return c2363c2;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.i>] */
    /* JADX INFO: renamed from: f */
    protected final void m6317f(C2361b c2361b, C2363c c2363c, Set<C2361b> set, boolean z, boolean z2, int i, boolean z3) {
        if (c2361b.f5846a instanceof C2358Z) {
            if (!c2361b.f5848c.mo6335f()) {
                for (int i2 = 0; i2 < c2361b.f5848c.mo6336h(); i2++) {
                    if (c2361b.f5848c.mo6333d(i2) != Integer.MAX_VALUE) {
                        C2361b c2361b2 = new C2361b((AbstractC2375i) this.f5881a.f5835a.get(c2361b.f5848c.mo6333d(i2)), c2361b.f5847b, c2361b.f5848c.mo6332c(i2), c2361b.f5850e);
                        c2361b2.f5849d = c2361b.f5849d;
                        m6317f(c2361b2, c2363c, set, z, z2, i - 1, z3);
                    } else if (z2) {
                        c2363c.m6358a(new C2361b(c2361b, c2361b.f5846a, AbstractC2351S.f5827b, c2361b.f5850e), this.f5817f);
                    } else {
                        m6318g(c2361b, c2363c, set, z, z2, i, z3);
                    }
                }
                return;
            }
            if (z2) {
                c2363c.m6358a(c2361b, this.f5817f);
                return;
            }
        }
        m6318g(c2361b, c2363c, set, z, z2, i, z3);
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
      0x01da: PHI (r5v5 com.github.catvod.spider.support.u.b) = 
      (r5v3 com.github.catvod.spider.support.u.b)
      (r5v0 com.github.catvod.spider.support.u.b)
      (r5v0 com.github.catvod.spider.support.u.b)
      (r5v0 com.github.catvod.spider.support.u.b)
      (r5v0 com.github.catvod.spider.support.u.b)
      (r5v10 com.github.catvod.spider.support.u.b)
      (r5v13 com.github.catvod.spider.support.u.b)
     binds: [B:93:0x01dc, B:90:0x01cc, B:66:0x0101, B:80:0x0188, B:82:0x018f, B:79:0x0171, B:77:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:94:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:96:0x0200  */
    /* JADX WARN: Code duplicated, block: B:98:0x0206  */
    /* JADX WARN: Type inference failed for: r5v20, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.i>] */
    /* JADX WARN: Type inference failed for: r5v25, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.i>] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.i>] */
    /* JADX INFO: renamed from: g */
    protected final void m6318g(C2361b c2361b, C2363c c2363c, Set<C2361b> set, boolean z, boolean z2, int i, boolean z3) {
        AbstractC2376i0 abstractC2376i0M6374d;
        boolean z4;
        boolean z5;
        int iMo6309a;
        C2361b c2361b2;
        C2349P c2349p;
        C2361b c2361b3;
        int i2;
        int i3;
        C2396b c2396b;
        C2350Q c2350q;
        boolean z6;
        boolean z7;
        AbstractC2375i abstractC2375i = c2361b.f5846a;
        if (!abstractC2375i.f5886d) {
            c2363c.m6358a(c2361b, this.f5817f);
        }
        for (int i4 = 0; i4 < abstractC2375i.m6373b(); i4++) {
            if (i4 != 0) {
                abstractC2376i0M6374d = abstractC2375i.m6374d(i4);
                if ((abstractC2376i0M6374d instanceof C2379k) && z) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                iMo6309a = abstractC2376i0M6374d.mo6309a();
                c2361b2 = null;
                if (iMo6309a != 10) {
                    switch (iMo6309a) {
                        case 1:
                            c2361b3 = new C2361b(c2361b, abstractC2376i0M6374d.f5889a, c2361b.f5848c, c2361b.f5850e);
                            break;
                        case 2:
                        case 5:
                        case 7:
                            if (z3 || !abstractC2376i0M6374d.mo6310d(-1, 1)) {
                                c2361b3 = c2361b2;
                            } else {
                                c2361b3 = new C2361b(c2361b, abstractC2376i0M6374d.f5889a, c2361b.f5848c, c2361b.f5850e);
                            }
                            break;
                        case 3:
                            C2360a0 c2360a0 = (C2360a0) abstractC2376i0M6374d;
                            c2361b2 = new C2361b(c2361b, c2360a0.f5889a, C2366d0.m6364i(c2361b.f5848c, c2360a0.f5845c.f5884b), c2361b.f5850e);
                            c2361b3 = c2361b2;
                            break;
                        case 4:
                            c2350q = (C2350Q) abstractC2376i0M6374d;
                            if (z4 || ((z6 = c2350q.f5826d) && !(z6 && z5))) {
                                c2361b3 = new C2361b(c2361b, c2350q.f5889a, c2361b.f5848c, c2361b.f5850e);
                            } else if (z2) {
                                int iMo6234h = this.f5818g.mo6234h();
                                this.f5818g.mo6232e(this.f5819h);
                                this.f5815d.getClass();
                                this.f5818g.mo6232e(iMo6234h);
                                c2361b3 = new C2361b(c2361b, c2350q.f5889a, c2361b.f5848c, c2361b.f5850e);
                            } else {
                                c2361b2 = new C2361b(c2361b, c2350q.f5889a, c2361b.f5848c, AbstractC2362b0.m6354b(c2361b.f5850e, new AbstractC2362b0.e(c2350q.f5824b, c2350q.f5825c, z6)));
                                c2361b3 = c2361b2;
                            }
                            break;
                        case 6:
                            c2361b3 = new C2361b(c2361b, ((C2379k) abstractC2376i0M6374d).f5889a, c2361b.f5848c, c2361b.f5850e);
                            break;
                        default:
                            c2361b3 = c2361b2;
                            break;
                    }
                } else {
                    c2349p = (C2349P) abstractC2376i0M6374d;
                    if (z4 || !z5) {
                        c2361b3 = new C2361b(c2361b, c2349p.f5889a, c2361b.f5848c, c2361b.f5850e);
                    } else {
                        if (z2) {
                            int iMo6234h2 = this.f5818g.mo6234h();
                            this.f5818g.mo6232e(this.f5819h);
                            boolean zMo6276g = this.f5815d.mo6276g(c2349p.f5823b);
                            this.f5818g.mo6232e(iMo6234h2);
                            if (zMo6276g) {
                                c2361b3 = new C2361b(c2361b, c2349p.f5889a, c2361b.f5848c, c2361b.f5850e);
                            }
                        } else {
                            c2361b2 = new C2361b(c2361b, c2349p.f5889a, c2361b.f5848c, AbstractC2362b0.m6354b(c2361b.f5850e, new AbstractC2362b0.d(c2349p.f5823b)));
                        }
                        c2361b3 = c2361b2;
                    }
                }
                if (c2361b3 == null) {
                    if (c2361b.f5846a instanceof C2358Z) {
                        c2396b = this.f5821j;
                        if (c2396b != null && c2396b.m6393b() && ((C2388t) abstractC2376i0M6374d).m6375e() == this.f5821j.f5928d.f5885c) {
                            c2361b3.f5849d |= 1073741824;
                        }
                        c2361b3.f5849d++;
                        if (!set.add(c2361b3)) {
                            c2363c.f5864g = true;
                            i3 = i - 1;
                            i2 = i3;
                            m6317f(c2361b3, c2363c, set, z4, z2, i2, z3);
                        }
                    } else if (!abstractC2376i0M6374d.mo6328b() || set.add(c2361b3)) {
                        if ((abstractC2376i0M6374d instanceof C2360a0) || i < 0) {
                            i2 = i;
                        } else {
                            i3 = i + 1;
                            i2 = i3;
                        }
                        m6317f(c2361b3, c2363c, set, z4, z2, i2, z3);
                    }
                }
            } else {
                if (f5814k) {
                    z7 = false;
                } else {
                    AbstractC2375i abstractC2375i2 = c2361b.f5846a;
                    if (abstractC2375i2.mo6308c() != 10 || !((C2370f0) abstractC2375i2).f5873j || c2361b.f5848c.mo6335f() || c2361b.f5848c.m6334e()) {
                        z7 = false;
                    } else {
                        int iMo6336h = c2361b.f5848c.mo6336h();
                        int i5 = 0;
                        while (true) {
                            if (i5 >= iMo6336h) {
                                C2384p c2384p = (C2384p) this.f5881a.f5835a.get(((AbstractC2385q) abstractC2375i2.m6374d(0).f5889a).f5896i.f5884b);
                                int i6 = 0;
                                while (true) {
                                    if (i6 < iMo6336h) {
                                        AbstractC2375i abstractC2375i3 = (AbstractC2375i) this.f5881a.f5835a.get(c2361b.f5848c.mo6333d(i6));
                                        if (abstractC2375i3.m6373b() == 1 && abstractC2375i3.m6374d(0).mo6328b()) {
                                            AbstractC2375i abstractC2375i4 = abstractC2375i3.m6374d(0).f5889a;
                                            if ((abstractC2375i3.mo6308c() == 8 && abstractC2375i4 == abstractC2375i2) || abstractC2375i3 == c2384p || abstractC2375i4 == c2384p || (abstractC2375i4.mo6308c() == 8 && abstractC2375i4.m6373b() == 1 && abstractC2375i4.m6374d(0).mo6328b() && abstractC2375i4.m6374d(0).f5889a == abstractC2375i2)) {
                                                i6++;
                                            }
                                        }
                                    } else {
                                        z7 = true;
                                    }
                                }
                            } else if (((AbstractC2375i) this.f5881a.f5835a.get(c2361b.f5848c.mo6333d(i5))).f5885c == abstractC2375i2.f5885c) {
                                i5++;
                            }
                            z7 = false;
                        }
                    }
                }
                if (!z7) {
                    abstractC2376i0M6374d = abstractC2375i.m6374d(i4);
                    if (abstractC2376i0M6374d instanceof C2379k) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (i == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iMo6309a = abstractC2376i0M6374d.mo6309a();
                    c2361b2 = null;
                    if (iMo6309a != 10) {
                        switch (iMo6309a) {
                            case 1:
                                c2361b3 = new C2361b(c2361b, abstractC2376i0M6374d.f5889a, c2361b.f5848c, c2361b.f5850e);
                                break;
                            case 2:
                            case 5:
                            case 7:
                                if (z3) {
                                    c2361b3 = c2361b2;
                                } else {
                                    c2361b3 = c2361b2;
                                }
                                break;
                            case 3:
                                C2360a0 c2360a1 = (C2360a0) abstractC2376i0M6374d;
                                c2361b2 = new C2361b(c2361b, c2360a1.f5889a, C2366d0.m6364i(c2361b.f5848c, c2360a1.f5845c.f5884b), c2361b.f5850e);
                                c2361b3 = c2361b2;
                                break;
                            case 4:
                                c2350q = (C2350Q) abstractC2376i0M6374d;
                                if (z4) {
                                    c2361b3 = new C2361b(c2361b, c2350q.f5889a, c2361b.f5848c, c2361b.f5850e);
                                } else {
                                    c2361b3 = new C2361b(c2361b, c2350q.f5889a, c2361b.f5848c, c2361b.f5850e);
                                }
                                break;
                            case 6:
                                c2361b3 = new C2361b(c2361b, ((C2379k) abstractC2376i0M6374d).f5889a, c2361b.f5848c, c2361b.f5850e);
                                break;
                            default:
                                c2361b3 = c2361b2;
                                break;
                        }
                    } else {
                        c2349p = (C2349P) abstractC2376i0M6374d;
                        if (z4) {
                            c2361b3 = new C2361b(c2361b, c2349p.f5889a, c2361b.f5848c, c2361b.f5850e);
                        } else {
                            c2361b3 = new C2361b(c2361b, c2349p.f5889a, c2361b.f5848c, c2361b.f5850e);
                        }
                    }
                    if (c2361b3 == null) {
                        if (c2361b.f5846a instanceof C2358Z) {
                            c2396b = this.f5821j;
                            if (c2396b != null) {
                                c2361b3.f5849d |= 1073741824;
                            }
                            c2361b3.f5849d++;
                            if (!set.add(c2361b3)) {
                                c2363c.f5864g = true;
                                i3 = i - 1;
                                i2 = i3;
                                m6317f(c2361b3, c2363c, set, z4, z2, i2, z3);
                            }
                        } else {
                            if (!abstractC2376i0M6374d.mo6328b()) {
                            }
                            if (abstractC2376i0M6374d instanceof C2360a0) {
                            }
                            i2 = i;
                            m6317f(c2361b3, c2363c, set, z4, z2, i2, z3);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0143  */
    /* JADX WARN: Code duplicated, block: B:77:0x014d A[LOOP:5: B:75:0x0147->B:77:0x014d, LOOP_END] */
    /* JADX INFO: renamed from: h */
    protected final C2363c m6319h(C2363c c2363c, int i, boolean z) {
        int i2;
        Iterator it;
        if (this.f5817f == null) {
            this.f5817f = new C2401c<>();
        }
        C2363c c2363c2 = new C2363c(z);
        Iterator<C2361b> it2 = c2363c.iterator();
        ArrayList arrayList = null;
        while (true) {
            i2 = 0;
            if (!it2.hasNext()) {
                break;
            }
            C2361b next = it2.next();
            AbstractC2375i abstractC2375i = next.f5846a;
            if (!(abstractC2375i instanceof C2358Z)) {
                int iM6373b = abstractC2375i.m6373b();
                while (i2 < iM6373b) {
                    AbstractC2376i0 abstractC2376i0M6374d = next.f5846a.m6374d(i2);
                    AbstractC2375i abstractC2375i2 = abstractC2376i0M6374d.mo6310d(i, this.f5881a.f5840f) ? abstractC2376i0M6374d.f5889a : null;
                    if (abstractC2375i2 != null) {
                        c2363c2.m6358a(new C2361b(next, abstractC2375i2, next.f5848c, next.f5850e), this.f5817f);
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
        C2363c c2363c3 = (arrayList != null || i == -1 || (c2363c2.size() != 1 && m6311o(c2363c2) == 0)) ? null : c2363c2;
        if (c2363c3 == null) {
            C2363c c2363c4 = new C2363c(z);
            HashSet hashSet = new HashSet();
            boolean z2 = i == -1;
            Iterator<C2361b> it3 = c2363c2.iterator();
            while (it3.hasNext()) {
                m6317f(it3.next(), c2363c4, hashSet, false, z, 0, z2);
                c2363c4 = c2363c4;
            }
            c2363c3 = c2363c4;
        }
        if (i == -1) {
            boolean z3 = c2363c3 == c2363c2;
            if (!C2355W.m6340a(c2363c3)) {
                C2363c c2363c5 = new C2363c(c2363c3.f5865h);
                for (C2361b c2361b : c2363c3) {
                    AbstractC2375i abstractC2375i3 = c2361b.f5846a;
                    if (abstractC2375i3 instanceof C2358Z) {
                        c2363c5.m6358a(c2361b, this.f5817f);
                    } else if (z3 && abstractC2375i3.f5886d && this.f5881a.m6348e(abstractC2375i3).m6419d(-2)) {
                        c2363c5.m6358a(new C2361b(c2361b, this.f5881a.f5838d[c2361b.f5846a.f5885c], c2361b.f5848c, c2361b.f5850e), this.f5817f);
                    }
                }
                c2363c3 = c2363c5;
            }
        }
        if (arrayList != null) {
            if (z) {
                Iterator<C2361b> it4 = c2363c3.iterator();
                while (it4.hasNext()) {
                    if (it4.next().f5846a instanceof C2358Z) {
                        i2 = 1;
                        break;
                    }
                }
                if (i2 == 0) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                        c2363c3.m6358a((C2361b) it.next(), this.f5817f);
                    }
                }
            } else {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    c2363c3.m6358a((C2361b) it.next(), this.f5817f);
                }
            }
        }
        if (c2363c3.isEmpty()) {
            return null;
        }
        return c2363c3;
    }

    /* JADX INFO: renamed from: i */
    protected final C2363c m6320i(AbstractC2375i abstractC2375i, C2332y c2332y, boolean z) {
        AbstractC2351S abstractC2351SM6329a = AbstractC2351S.m6329a(this.f5881a, c2332y);
        C2363c c2363c = new C2363c(z);
        int i = 0;
        while (i < abstractC2375i.m6373b()) {
            int i2 = i + 1;
            m6317f(new C2361b(abstractC2375i.m6374d(i).f5889a, i2, abstractC2351SM6329a, AbstractC2362b0.f5851a), c2363c, new HashSet(), true, z, 0, false);
            i = i2;
        }
        return c2363c;
    }

    /* JADX INFO: renamed from: j */
    protected final BitSet m6321j(C2398d.a[] aVarArr, C2328u c2328u) {
        BitSet bitSet = new BitSet();
        for (C2398d.a aVar : aVarArr) {
            AbstractC2362b0 abstractC2362b0 = aVar.f5940a;
            if (abstractC2362b0 == AbstractC2362b0.f5851a || m6322k(abstractC2362b0, c2328u)) {
                bitSet.set(aVar.f5941b);
            }
        }
        return bitSet;
    }

    /* JADX INFO: renamed from: k */
    protected final boolean m6322k(AbstractC2362b0 abstractC2362b0, C2328u c2328u) {
        return abstractC2362b0.mo6356c(this.f5815d, c2328u);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00c0  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX INFO: renamed from: l */
    protected final int m6323l(C2396b c2396b, C2398d c2398d, InterfaceC2304C interfaceC2304C, int i, C2328u c2328u) {
        boolean z;
        BitSet bitSet;
        C2363c c2363cM6319h;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        BitSet bitSet2;
        int i3;
        Object r4 = 1;
        int iMo6233g = interfaceC2304C.mo6233g(1);
        C2398d c2398d2 = c2398d;
        while (true) {
            C2398d[] c2398dArr = c2398d2.f5934c;
            C2398d c2398dM6314c = (c2398dArr == null || (i3 = iMo6233g + 1) < 0 || i3 >= c2398dArr.length) ? null : c2398dArr[i3];
            if (c2398dM6314c == null) {
                C2363c c2363cM6319h2 = m6319h(c2398d2.f5933b, iMo6233g, false);
                if (c2363cM6319h2 == null) {
                    c2398dM6314c = AbstractC2373h.f5880c;
                    m6314c(c2396b, c2398d2, iMo6233g, c2398dM6314c);
                } else {
                    C2398d c2398d3 = new C2398d(c2363cM6319h2);
                    int iM6311o = m6311o(c2363cM6319h2);
                    if (iM6311o != 0) {
                        c2398d3.f5935d = r4;
                        c2398d3.f5933b.f5861d = iM6311o;
                        c2398d3.f5936e = iM6311o;
                    } else {
                        if (!C2355W.m6340a(c2363cM6319h2)) {
                            Iterator it = ((ArrayList) C2355W.m6341b(c2363cM6319h2)).iterator();
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
                                for (C2361b c2361b : c2363cM6319h2) {
                                    BitSet bitSet3 = (BitSet) map.get(c2361b.f5846a);
                                    if (bitSet3 == null) {
                                        bitSet3 = new BitSet();
                                        map.put(c2361b.f5846a, bitSet3);
                                    }
                                    bitSet3.set(c2361b.f5847b);
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
                            C2363c c2363c = c2398d3.f5933b;
                            Collection<BitSet> collectionM6341b = C2355W.m6341b(c2363cM6319h2);
                            BitSet bitSet4 = new BitSet();
                            Iterator it3 = ((ArrayList) collectionM6341b).iterator();
                            while (it3.hasNext()) {
                                bitSet4.or((BitSet) it3.next());
                            }
                            c2363c.f5862e = bitSet4;
                            c2398d3.f5938g = r4;
                            c2398d3.f5935d = r4;
                            c2398d3.f5936e = c2398d3.f5933b.f5862e.nextSetBit(0);
                        }
                    }
                    if (c2398d3.f5935d && c2398d3.f5933b.f5863f) {
                        int iM6373b = this.f5881a.m6345b(c2396b.f5927c).m6373b();
                        C2363c c2363c2 = c2398d3.f5933b;
                        if (c2363c2.f5861d != 0) {
                            bitSet2 = new BitSet();
                            bitSet2.set(c2363c2.f5861d);
                        } else {
                            bitSet2 = c2363c2.f5862e;
                        }
                        AbstractC2362b0[] abstractC2362b0Arr = new AbstractC2362b0[iM6373b + 1];
                        for (C2361b c2361b2 : c2398d3.f5933b) {
                            if (bitSet2.get(c2361b2.f5847b)) {
                                int i4 = c2361b2.f5847b;
                                abstractC2362b0Arr[i4] = AbstractC2362b0.m6355e(abstractC2362b0Arr[i4], c2361b2.f5850e);
                            }
                        }
                        int i5 = 0;
                        for (int i6 = 1; i6 <= iM6373b; i6++) {
                            if (abstractC2362b0Arr[i6] == null) {
                                abstractC2362b0Arr[i6] = AbstractC2362b0.f5851a;
                            } else if (abstractC2362b0Arr[i6] != AbstractC2362b0.f5851a) {
                                i5++;
                            }
                        }
                        if (i5 == 0) {
                            abstractC2362b0Arr = null;
                        }
                        if (abstractC2362b0Arr != null) {
                            ArrayList arrayList = new ArrayList();
                            boolean z6 = false;
                            for (int i7 = 1; i7 < abstractC2362b0Arr.length; i7++) {
                                AbstractC2362b0 abstractC2362b0 = abstractC2362b0Arr[i7];
                                if (bitSet2 != null && bitSet2.get(i7)) {
                                    arrayList.add(new C2398d.a(abstractC2362b0, i7));
                                }
                                if (abstractC2362b0 != AbstractC2362b0.f5851a) {
                                    z6 = true;
                                }
                            }
                            c2398d3.f5939h = !z6 ? null : (C2398d.a[]) arrayList.toArray(new C2398d.a[arrayList.size()]);
                            c2398d3.f5936e = 0;
                        } else {
                            c2398d3.f5936e = bitSet2.nextSetBit(0);
                        }
                        if (c2398d3.f5939h != null) {
                            c2398d3.f5936e = 0;
                        }
                    }
                    c2398dM6314c = m6314c(c2396b, c2398d2, iMo6233g, c2398d3);
                }
            }
            if (c2398dM6314c == AbstractC2373h.f5880c) {
                C2326s c2326sM6326p = m6326p(interfaceC2304C, c2328u, c2398d2.f5933b, i);
                interfaceC2304C.mo6232e(i);
                int iM6325n = m6325n(c2398d2.f5933b, c2328u);
                if (iM6325n != 0) {
                    return iM6325n;
                }
                throw c2326sM6326p;
            }
            if (c2398dM6314c.f5938g) {
                BitSet bitSet5 = c2398dM6314c.f5933b.f5862e;
                if (c2398dM6314c.f5939h != null) {
                    int iMo6234h = interfaceC2304C.mo6234h();
                    if (iMo6234h != i) {
                        interfaceC2304C.mo6232e(i);
                    }
                    BitSet bitSetM6321j = m6321j(c2398dM6314c.f5939h, c2328u);
                    z = true;
                    if (bitSetM6321j.cardinality() == 1) {
                        return bitSetM6321j.nextSetBit(0);
                    }
                    if (iMo6234h != i) {
                        interfaceC2304C.mo6232e(iMo6234h);
                    }
                    bitSet = bitSetM6321j;
                } else {
                    z = true;
                    bitSet = bitSet5;
                }
                C2363c c2363cM6320i = m6320i(c2396b.f5928d, c2328u, z);
                C2363c c2363c3 = c2398dM6314c.f5933b;
                int iMo6234h2 = interfaceC2304C.mo6234h();
                AbstractC2327t abstractC2327t = this.f5815d;
                if (abstractC2327t != null) {
                    ((C2329v) abstractC2327t.m6299d()).mo6228b(this.f5815d, c2396b, i, iMo6234h2, bitSet, c2363c3);
                }
                interfaceC2304C.mo6232e(i);
                boolean z7 = true;
                int iMo6233g2 = interfaceC2304C.mo6233g(1);
                while (true) {
                    c2363cM6319h = m6319h(c2363cM6320i, iMo6233g2, z7);
                    if (c2363cM6319h == null) {
                        C2326s c2326sM6326p2 = m6326p(interfaceC2304C, c2328u, c2363cM6320i, i);
                        interfaceC2304C.mo6232e(i);
                        int iM6325n2 = m6325n(c2363cM6320i, c2328u);
                        if (iM6325n2 != 0) {
                            return iM6325n2;
                        }
                        throw c2326sM6326p2;
                    }
                    Collection<BitSet> collectionM6341b2 = C2355W.m6341b(c2363cM6319h);
                    int iM6311o2 = m6311o(c2363cM6319h);
                    c2363cM6319h.f5861d = iM6311o2;
                    if (iM6311o2 != 0) {
                        i2 = iM6311o2;
                        break;
                    }
                    int iM6342c = C2355W.m6342c(collectionM6341b2);
                    if (iM6342c != 0) {
                        i2 = iM6342c;
                        break;
                    }
                    if (iMo6233g2 != -1) {
                        interfaceC2304C.mo6235i();
                        iMo6233g2 = interfaceC2304C.mo6233g(1);
                    }
                    c2363cM6320i = c2363cM6319h;
                    z7 = true;
                }
                int i8 = c2363cM6319h.f5861d;
                int iMo6234h3 = interfaceC2304C.mo6234h();
                if (i8 != 0) {
                    AbstractC2327t abstractC2327t2 = this.f5815d;
                    if (abstractC2327t2 != null) {
                        ((C2329v) abstractC2327t2.m6299d()).mo6229c(this.f5815d, c2396b, i, iMo6234h3, i2, c2363cM6319h);
                    }
                } else {
                    BitSet bitSet6 = new BitSet();
                    Iterator<C2361b> it4 = c2363cM6319h.f5860c.iterator();
                    while (it4.hasNext()) {
                        bitSet6.set(it4.next().f5847b);
                    }
                    m6327q(c2396b, i, iMo6234h3, bitSet6, c2363cM6319h);
                }
                return i2;
            }
            if (c2398dM6314c.f5935d) {
                if (c2398dM6314c.f5939h == null) {
                    return c2398dM6314c.f5936e;
                }
                int iMo6234h4 = interfaceC2304C.mo6234h();
                interfaceC2304C.mo6232e(i);
                BitSet bitSetM6321j2 = m6321j(c2398dM6314c.f5939h, c2328u);
                int iCardinality = bitSetM6321j2.cardinality();
                if (iCardinality == 0) {
                    throw m6326p(interfaceC2304C, c2328u, c2398dM6314c.f5933b, i);
                }
                if (iCardinality == 1) {
                    return bitSetM6321j2.nextSetBit(0);
                }
                m6327q(c2396b, i, iMo6234h4, bitSetM6321j2, c2398dM6314c.f5933b);
                return bitSetM6321j2.nextSetBit(0);
            }
            if (iMo6233g != -1) {
                interfaceC2304C.mo6235i();
                z2 = true;
                iMo6233g = interfaceC2304C.mo6233g(1);
            } else {
                z2 = true;
            }
            c2398d2 = c2398dM6314c;
            r4 = z2;
        }
    }

    /* JADX INFO: renamed from: m */
    protected final int m6324m(C2363c c2363c) {
        C2407i c2407i = new C2407i(new int[0]);
        for (C2361b c2361b : c2363c) {
            if (c2361b.m6351b() > 0 || ((c2361b.f5846a instanceof C2358Z) && c2361b.f5848c.m6334e())) {
                c2407i.m6416a(c2361b.f5847b);
            }
        }
        if (c2407i.m6424j() == 0) {
            return 0;
        }
        return c2407i.m6420e();
    }

    /* JADX INFO: renamed from: n */
    protected final int m6325n(C2363c c2363c, C2328u c2328u) {
        int iM6324m;
        C2363c c2363c2 = new C2363c(c2363c.f5865h);
        C2363c c2363c3 = new C2363c(c2363c.f5865h);
        for (C2361b c2361b : c2363c) {
            AbstractC2362b0 abstractC2362b0 = c2361b.f5850e;
            if (abstractC2362b0 == AbstractC2362b0.f5851a || m6322k(abstractC2362b0, c2328u)) {
                c2363c2.m6358a(c2361b, null);
            } else {
                c2363c3.m6358a(c2361b, null);
            }
        }
        int iM6324m2 = m6324m(c2363c2);
        if (iM6324m2 != 0) {
            return iM6324m2;
        }
        if (c2363c3.size() <= 0 || (iM6324m = m6324m(c2363c3)) == 0) {
            return 0;
        }
        return iM6324m;
    }

    /* JADX INFO: renamed from: p */
    protected final C2326s m6326p(InterfaceC2304C interfaceC2304C, C2328u c2328u, C2363c c2363c, int i) {
        return new C2326s(this.f5815d, interfaceC2304C, interfaceC2304C.get(i), interfaceC2304C.mo6222f(1), c2328u);
    }

    /* JADX INFO: renamed from: q */
    protected final void m6327q(C2396b c2396b, int i, int i2, BitSet bitSet, C2363c c2363c) {
        AbstractC2327t abstractC2327t = this.f5815d;
        if (abstractC2327t != null) {
            ((C2329v) abstractC2327t.m6299d()).mo6227a(this.f5815d, c2396b, i, i2, bitSet, c2363c);
        }
    }
}
