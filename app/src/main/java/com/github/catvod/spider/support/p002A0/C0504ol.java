package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ol */
/* JADX INFO: loaded from: classes.dex */
public final class C0504ol extends AbstractC0414lc {

    /* JADX INFO: renamed from: a */
    public static final boolean f1337a;

    /* JADX INFO: renamed from: b */
    public final C0720wl f1338b;

    /* JADX INFO: renamed from: c */
    public final C0803zn[] f1339c;

    /* JADX INFO: renamed from: d */
    public C0736xa f1340d;

    /* JADX INFO: renamed from: e */
    public C0643tp f1341e;

    /* JADX INFO: renamed from: f */
    public int f1342f;

    /* JADX INFO: renamed from: g */
    public C0579rf f1343g;

    /* JADX INFO: renamed from: h */
    public C0803zn f1344h;

    static {
        String str;
        try {
            str = System.getenv("TURN_OFF_LR_LOOP_ENTRY_BRANCH_OPT");
        } catch (SecurityException unused) {
            str = null;
        }
        f1337a = Boolean.parseBoolean(str);
    }

    public C0504ol(C0720wl c0720wl, C0367jj c0367jj, C0803zn[] c0803znArr, C0736xa c0736xa) {
        super(c0367jj, c0736xa);
        this.f1338b = c0720wl;
        this.f1339c = c0803znArr;
    }

    /* JADX INFO: renamed from: j */
    public static int m1488j(C0371jn c0371jn) {
        C0339ii c0339ii = new C0339ii(new int[0]);
        for (C0368jk c0368jk : c0371jn.f1062c) {
            if ((c0368jk.f1049h & (-1073741825)) > 0 || ((c0368jk.f1046e instanceof C0328hy) && c0368jk.f1048g.m1878m())) {
                c0339ii.m1302c(c0368jk.f1047f);
            }
        }
        if (c0339ii.m1308i() == 0) {
            return 0;
        }
        if (c0339ii.m1306g()) {
            throw new RuntimeException("set is empty");
        }
        return ((C0145bd) c0339ii.f1008a.get(0)).f684b;
    }

    /* JADX INFO: renamed from: k */
    public static int m1489k(C0371jn c0371jn) {
        int i = 0;
        for (C0368jk c0368jk : c0371jn.f1062c) {
            if (i == 0) {
                i = c0368jk.f1047f;
            } else if (c0368jk.f1047f != i) {
                return 0;
            }
        }
        return i;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0414lc
    /* JADX INFO: renamed from: i */
    public final void mo1219i() {
    }

    /* JADX INFO: renamed from: l */
    public final int m1490l(int i, C0643tp c0643tp, C0579rf c0579rf) {
        abf abfVarM1492n;
        int i2;
        this.f1341e = c0643tp;
        int i3 = c0643tp.f1555c;
        this.f1342f = i3;
        this.f1343g = c0579rf;
        C0803zn c0803zn = this.f1339c[i];
        this.f1344h = c0803zn;
        try {
            boolean z = c0803zn.f1912e;
            int i4 = -1;
            if (z) {
                C0734wz c0734wz = this.f1338b.f737c;
                int i5 = c0734wz.f1775c;
                if (i5 == 0) {
                    i2 = -1;
                } else {
                    int i6 = i5 - 1;
                    if (i6 < 0 || i6 >= i5) {
                        throw new IndexOutOfBoundsException();
                    }
                    i2 = c0734wz.f1774b[i6];
                }
                if (!z) {
                    throw new IllegalStateException("Only precedence DFAs may contain a precedence start state.");
                }
                abfVarM1492n = (i2 < 0 || i2 >= c0803zn.f1909b.f503c.length) ? null : c0803zn.f1909b.f503c[i2];
            } else {
                abfVarM1492n = c0803zn.f1909b;
            }
            if (abfVarM1492n == null) {
                if (c0579rf == null) {
                    c0579rf = C0579rf.f1434d;
                }
                C0371jn c0371jnM1497v = m1497v(c0803zn.f1911d, C0579rf.f1434d, false);
                if (c0803zn.f1912e) {
                    c0803zn.f1909b.f502b = c0371jnM1497v;
                    abfVarM1492n = m1492n(c0803zn, new abf(m1493r(c0371jnM1497v)));
                    C0734wz c0734wz2 = this.f1338b.f737c;
                    int i7 = c0734wz2.f1775c;
                    if (i7 != 0) {
                        int i8 = i7 - 1;
                        if (i8 < 0 || i8 >= i7) {
                            throw new IndexOutOfBoundsException();
                        }
                        i4 = c0734wz2.f1774b[i8];
                    }
                    c0803zn.m1955f(i4, abfVarM1492n);
                } else {
                    abfVarM1492n = m1492n(c0803zn, new abf(c0371jnM1497v));
                    c0803zn.f1909b = abfVarM1492n;
                }
            }
            int iM1499x = m1499x(c0803zn, abfVarM1492n, c0643tp, i3, c0579rf);
            this.f1340d = null;
            this.f1344h = null;
            c0643tp.m1725j(i3);
            return iM1499x;
        } catch (Throwable th) {
            this.f1340d = null;
            this.f1344h = null;
            c0643tp.m1725j(i3);
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public final abf m1491m(C0803zn c0803zn, abf abfVar, int i, abf abfVar2) {
        if (abfVar2 == null) {
            return null;
        }
        abf abfVarM1492n = m1492n(c0803zn, abfVar2);
        if (i < -1 || i > this.f1124p.f1042f) {
            return abfVarM1492n;
        }
        synchronized (abfVar) {
            try {
                if (abfVar.f503c == null) {
                    abfVar.f503c = new abf[this.f1124p.f1042f + 2];
                }
                abfVar.f503c[i + 1] = abfVarM1492n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abfVarM1492n;
    }

    /* JADX INFO: renamed from: n */
    public final abf m1492n(C0803zn c0803zn, abf abfVar) {
        if (abfVar == AbstractC0414lc.f1123o) {
            return abfVar;
        }
        synchronized (c0803zn.f1908a) {
            try {
                abf abfVar2 = (abf) c0803zn.f1908a.get(abfVar);
                if (abfVar2 != null) {
                    return abfVar2;
                }
                abfVar.f501a = c0803zn.f1908a.size();
                C0371jn c0371jn = abfVar.f502b;
                if (!c0371jn.f1060a) {
                    c0371jn.m1336k(this);
                    C0371jn c0371jn2 = abfVar.f502b;
                    c0371jn2.f1060a = true;
                    c0371jn2.f1061b = null;
                }
                c0803zn.f1908a.put(abfVar, abfVar);
                return abfVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final C0371jn m1493r(C0371jn c0371jn) {
        AbstractC0753xr abstractC0753xr;
        HashMap map = new HashMap();
        C0371jn c0371jn2 = new C0371jn(c0371jn.f1067h);
        ArrayList<C0368jk> arrayList = c0371jn.f1062c;
        for (C0368jk c0368jk : arrayList) {
            if (c0368jk.f1047f == 1) {
                C0720wl c0720wl = this.f1338b;
                C0579rf c0579rf = this.f1343g;
                AbstractC0687vf abstractC0687vf = c0368jk.f1050i;
                AbstractC0687vf abstractC0687vfMo875b = abstractC0687vf.mo875b(c0720wl, c0579rf);
                if (abstractC0687vfMo875b != null) {
                    AbstractC0428lq abstractC0428lq = c0368jk.f1046e;
                    map.put(Integer.valueOf(abstractC0428lq.f1164e), c0368jk.f1048g);
                    if (abstractC0687vfMo875b != abstractC0687vf) {
                        c0371jn2.m1335j(new C0368jk(c0368jk, abstractC0428lq, c0368jk.f1048g, abstractC0687vfMo875b), this.f1340d);
                    } else {
                        c0371jn2.m1335j(c0368jk, this.f1340d);
                    }
                }
            }
        }
        for (C0368jk c0368jk2 : arrayList) {
            if (c0368jk2.f1047f != 1 && (c0368jk2.m1328j() || (abstractC0753xr = (AbstractC0753xr) map.get(Integer.valueOf(c0368jk2.f1046e.f1164e))) == null || !abstractC0753xr.equals(c0368jk2.f1048g))) {
                c0371jn2.m1335j(c0368jk2, this.f1340d);
            }
        }
        return c0371jn2;
    }

    /* JADX INFO: renamed from: s */
    public final void m1494s(C0368jk c0368jk, C0371jn c0371jn, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        if (c0368jk.f1046e instanceof C0328hy) {
            if (!c0368jk.f1048g.mo1142c()) {
                for (int i2 = 0; i2 < c0368jk.f1048g.mo1143d(); i2++) {
                    int iMo1141b = c0368jk.f1048g.mo1141b(i2);
                    AbstractC0687vf abstractC0687vf = c0368jk.f1050i;
                    if (iMo1141b != Integer.MAX_VALUE) {
                        C0368jk c0368jk2 = new C0368jk((AbstractC0428lq) this.f1124p.f1037a.get(c0368jk.f1048g.mo1141b(i2)), c0368jk.f1047f, c0368jk.f1048g.mo1140a(i2), abstractC0687vf);
                        c0368jk2.f1049h = c0368jk.f1049h;
                        m1494s(c0368jk2, c0371jn, hashSet, z, z2, i - 1, z3);
                    } else if (z2) {
                        c0371jn.m1335j(new C0368jk(c0368jk, c0368jk.f1046e, AbstractC0753xr.f1815h, abstractC0687vf), this.f1340d);
                    } else {
                        m1495t(c0368jk, c0371jn, hashSet, z, z2, i, z3);
                    }
                }
                return;
            }
            if (z2) {
                c0371jn.m1335j(c0368jk, this.f1340d);
                return;
            }
        }
        m1495t(c0368jk, c0371jn, hashSet, z, z2, i, z3);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:103:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:107:0x0206  */
    /* JADX WARN: Code duplicated, block: B:109:0x020c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0232 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:64:0x0102  */
    /* JADX WARN: Code duplicated, block: B:65:0x0105  */
    /* JADX WARN: Code duplicated, block: B:66:0x0108  */
    /* JADX WARN: Code duplicated, block: B:67:0x0117  */
    /* JADX WARN: Code duplicated, block: B:76:0x0156  */
    /* JADX WARN: Code duplicated, block: B:78:0x0162  */
    /* JADX WARN: Code duplicated, block: B:79:0x0178  */
    /* JADX WARN: Code duplicated, block: B:83:0x018b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0195  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:95:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e0  */
    /* JADX INFO: renamed from: t */
    public final void m1495t(C0368jk c0368jk, C0371jn c0371jn, HashSet hashSet, boolean z, boolean z2, int i, boolean z3) {
        AbstractC0488nw abstractC0488nwM1406k;
        boolean z4;
        boolean z5;
        int iMo871b;
        AbstractC0687vf abstractC0687vf;
        C0420li c0420li;
        C0368jk c0368jk2;
        int i2;
        int i3;
        C0803zn c0803zn;
        C0368jk c0368jk3;
        aaa aaaVar;
        boolean z6;
        AbstractC0428lq abstractC0428lq = c0368jk.f1046e;
        if (!abstractC0428lq.f1166g) {
            c0371jn.m1335j(c0368jk, this.f1340d);
        }
        int i4 = 0;
        int i5 = 0;
        while (i5 < abstractC0428lq.f1167h.size()) {
            AbstractC0428lq abstractC0428lq2 = c0368jk.f1046e;
            if (i5 != 0 || f1337a || abstractC0428lq2.mo897a() != 10 || !((C0627t) abstractC0428lq2).f1523c || c0368jk.f1048g.mo1142c() || c0368jk.f1048g.m1878m()) {
                abstractC0488nwM1406k = abstractC0428lq.m1406k(i5);
                if ((abstractC0488nwM1406k instanceof C0531pl) && z) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (i == 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                iMo871b = abstractC0488nwM1406k.mo871b();
                C0720wl c0720wl = this.f1338b;
                abstractC0687vf = c0368jk.f1050i;
                if (iMo871b != 10) {
                    switch (iMo871b) {
                        case 1:
                            c0368jk3 = new C0368jk(c0368jk, abstractC0488nwM1406k.f1292g, c0368jk.f1048g, abstractC0687vf);
                            c0368jk2 = c0368jk3;
                            break;
                        case 2:
                        case 5:
                        case 7:
                            if (!z3 && abstractC0488nwM1406k.mo872d(-1, 1)) {
                                c0368jk3 = new C0368jk(c0368jk, abstractC0488nwM1406k.f1292g, c0368jk.f1048g, abstractC0687vf);
                                c0368jk2 = c0368jk3;
                            } else {
                                c0368jk2 = null;
                            }
                            break;
                        case 3:
                            abw abwVar = (abw) abstractC0488nwM1406k;
                            c0368jk2 = new C0368jk(c0368jk, abwVar.f1292g, C0277ga.m1242g(c0368jk.f1048g, abwVar.f541f.f1164e), abstractC0687vf);
                            break;
                        case 4:
                            aaaVar = (aaa) abstractC0488nwM1406k;
                            if (z4 || ((z6 = aaaVar.f421h) && !(z6 && z5))) {
                                c0368jk3 = new C0368jk(c0368jk, aaaVar.f1292g, c0368jk.f1048g, abstractC0687vf);
                            } else if (z2) {
                                C0643tp c0643tp = this.f1341e;
                                int i6 = c0643tp.f1555c;
                                c0643tp.m1725j(this.f1342f);
                                this.f1341e.m1725j(i6);
                                c0368jk3 = new C0368jk(c0368jk, aaaVar.f1292g, c0368jk.f1048g, abstractC0687vf);
                            } else {
                                c0368jk3 = new C0368jk(c0368jk, aaaVar.f1292g, c0368jk.f1048g, AbstractC0687vf.m1748g(abstractC0687vf, new C0467nb(z6, aaaVar.f419a, aaaVar.f420f)));
                            }
                            c0368jk2 = c0368jk3;
                            break;
                        case 6:
                            c0368jk2 = new C0368jk(c0368jk, ((C0531pl) abstractC0488nwM1406k).f1292g, c0368jk.f1048g, abstractC0687vf);
                            break;
                        default:
                            c0368jk2 = null;
                            break;
                    }
                } else {
                    c0420li = (C0420li) abstractC0488nwM1406k;
                    if (z4 || !z5) {
                        c0368jk2 = new C0368jk(c0368jk, c0420li.f1292g, c0368jk.f1048g, abstractC0687vf);
                    } else {
                        int i7 = c0420li.f1154a;
                        if (z2) {
                            C0643tp c0643tp2 = this.f1341e;
                            int i8 = c0643tp2.f1555c;
                            c0643tp2.m1725j(this.f1342f);
                            boolean zM1137p = c0720wl.m1137p(i7);
                            this.f1341e.m1725j(i8);
                            if (zM1137p) {
                                c0368jk2 = new C0368jk(c0368jk, c0420li.f1292g, c0368jk.f1048g, abstractC0687vf);
                            } else {
                                c0368jk2 = null;
                            }
                        } else {
                            c0368jk2 = new C0368jk(c0368jk, c0420li.f1292g, c0368jk.f1048g, AbstractC0687vf.m1748g(abstractC0687vf, new aae(i7)));
                        }
                    }
                }
                if (c0368jk2 == null) {
                    if (abstractC0428lq2 instanceof C0328hy) {
                        c0803zn = this.f1344h;
                        if (c0803zn != null && c0803zn.f1912e) {
                            if (((C0244ev) abstractC0488nwM1406k).f798a == c0803zn.f1911d.f1165f) {
                                c0368jk2.f1049h |= 1073741824;
                            }
                        }
                        c0368jk2.f1049h++;
                        if (!hashSet.add(c0368jk2)) {
                            c0371jn.f1066g = true;
                            i3 = i - 1;
                            i2 = i3;
                            m1494s(c0368jk2, c0371jn, hashSet, z4, z2, i2, z3);
                        }
                    } else if (!abstractC0488nwM1406k.mo873e() || hashSet.add(c0368jk2)) {
                        if ((abstractC0488nwM1406k instanceof abw) || i < 0) {
                            i2 = i;
                        } else {
                            i3 = i + 1;
                            i2 = i3;
                        }
                        m1494s(c0368jk2, c0371jn, hashSet, z4, z2, i2, z3);
                    }
                }
            } else {
                int iMo1143d = c0368jk.f1048g.mo1143d();
                int i9 = 0;
                while (true) {
                    C0367jj c0367jj = this.f1124p;
                    if (i9 >= iMo1143d) {
                        C0558ql c0558ql = (C0558ql) c0367jj.f1037a.get(((AbstractC0559qm) abstractC0428lq2.m1406k(i4).f1292g).f1409c.f1164e);
                        int i10 = 0;
                        while (true) {
                            if (i10 < iMo1143d) {
                                AbstractC0428lq abstractC0428lq3 = (AbstractC0428lq) c0367jj.f1037a.get(c0368jk.f1048g.mo1141b(i10));
                                if (abstractC0428lq3.f1167h.size() == 1 && abstractC0428lq3.m1406k(i4).mo873e()) {
                                    AbstractC0428lq abstractC0428lq4 = abstractC0428lq3.m1406k(i4).f1292g;
                                    if ((abstractC0428lq3.mo897a() == 8 && abstractC0428lq4 == abstractC0428lq2) || abstractC0428lq3 == c0558ql || abstractC0428lq4 == c0558ql) {
                                        i4 = 0;
                                    } else if (abstractC0428lq4.mo897a() == 8 && abstractC0428lq4.f1167h.size() == 1) {
                                        i4 = 0;
                                        if (!abstractC0428lq4.m1406k(0).mo873e() || abstractC0428lq4.m1406k(0).f1292g != abstractC0428lq2) {
                                        }
                                    }
                                    i10++;
                                }
                            }
                        }
                    } else if (((AbstractC0428lq) c0367jj.f1037a.get(c0368jk.f1048g.mo1141b(i9))).f1165f == abstractC0428lq2.f1165f) {
                        i9++;
                    }
                    abstractC0488nwM1406k = abstractC0428lq.m1406k(i5);
                    if (abstractC0488nwM1406k instanceof C0531pl) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    if (i == 0) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    iMo871b = abstractC0488nwM1406k.mo871b();
                    C0720wl c0720wl2 = this.f1338b;
                    abstractC0687vf = c0368jk.f1050i;
                    if (iMo871b != 10) {
                        switch (iMo871b) {
                            case 1:
                                c0368jk3 = new C0368jk(c0368jk, abstractC0488nwM1406k.f1292g, c0368jk.f1048g, abstractC0687vf);
                                c0368jk2 = c0368jk3;
                                break;
                            case 2:
                            case 5:
                            case 7:
                                if (!z3) {
                                }
                                c0368jk2 = null;
                                break;
                            case 3:
                                abw abwVar2 = (abw) abstractC0488nwM1406k;
                                c0368jk2 = new C0368jk(c0368jk, abwVar2.f1292g, C0277ga.m1242g(c0368jk.f1048g, abwVar2.f541f.f1164e), abstractC0687vf);
                                break;
                            case 4:
                                aaaVar = (aaa) abstractC0488nwM1406k;
                                if (z4) {
                                    c0368jk3 = new C0368jk(c0368jk, aaaVar.f1292g, c0368jk.f1048g, abstractC0687vf);
                                } else {
                                    c0368jk3 = new C0368jk(c0368jk, aaaVar.f1292g, c0368jk.f1048g, abstractC0687vf);
                                }
                                c0368jk2 = c0368jk3;
                                break;
                            case 6:
                                c0368jk2 = new C0368jk(c0368jk, ((C0531pl) abstractC0488nwM1406k).f1292g, c0368jk.f1048g, abstractC0687vf);
                                break;
                            default:
                                c0368jk2 = null;
                                break;
                        }
                    } else {
                        c0420li = (C0420li) abstractC0488nwM1406k;
                        if (z4) {
                            c0368jk2 = new C0368jk(c0368jk, c0420li.f1292g, c0368jk.f1048g, abstractC0687vf);
                        } else {
                            c0368jk2 = new C0368jk(c0368jk, c0420li.f1292g, c0368jk.f1048g, abstractC0687vf);
                        }
                    }
                    if (c0368jk2 == null) {
                        if (abstractC0428lq2 instanceof C0328hy) {
                            c0803zn = this.f1344h;
                            if (c0803zn != null) {
                                if (((C0244ev) abstractC0488nwM1406k).f798a == c0803zn.f1911d.f1165f) {
                                    c0368jk2.f1049h |= 1073741824;
                                }
                            }
                            c0368jk2.f1049h++;
                            if (!hashSet.add(c0368jk2)) {
                                c0371jn.f1066g = true;
                                i3 = i - 1;
                                i2 = i3;
                                m1494s(c0368jk2, c0371jn, hashSet, z4, z2, i2, z3);
                            }
                        } else {
                            if (!abstractC0488nwM1406k.mo873e()) {
                            }
                            if (abstractC0488nwM1406k instanceof abw) {
                            }
                            i2 = i;
                            m1494s(c0368jk2, c0371jn, hashSet, z4, z2, i2, z3);
                        }
                    }
                }
            }
            i5++;
            i4 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:79:0x016e A[LOOP:6: B:77:0x0168->B:79:0x016e, LOOP_END] */
    /* JADX INFO: renamed from: u */
    public final C0371jn m1496u(C0371jn c0371jn, int i, boolean z) {
        C0367jj c0367jj;
        int i2;
        Iterator it;
        if (this.f1340d == null) {
            C0736xa c0736xa = new C0736xa(2);
            c0736xa.f1779d = new LinkedHashMap();
            this.f1340d = c0736xa;
        }
        C0371jn c0371jn2 = new C0371jn(z);
        Iterator it2 = c0371jn.f1062c.iterator();
        ArrayList arrayList = null;
        while (true) {
            boolean zHasNext = it2.hasNext();
            c0367jj = this.f1124p;
            if (!zHasNext) {
                break;
            }
            C0368jk c0368jk = (C0368jk) it2.next();
            AbstractC0428lq abstractC0428lq = c0368jk.f1046e;
            if (!(abstractC0428lq instanceof C0328hy)) {
                int size = abstractC0428lq.f1167h.size();
                for (int i3 = 0; i3 < size; i3++) {
                    AbstractC0488nw abstractC0488nwM1406k = c0368jk.f1046e.m1406k(i3);
                    AbstractC0428lq abstractC0428lq2 = abstractC0488nwM1406k.mo872d(i, c0367jj.f1042f) ? abstractC0488nwM1406k.f1292g : null;
                    if (abstractC0428lq2 != null) {
                        c0371jn2.m1335j(new C0368jk(c0368jk, abstractC0428lq2, c0368jk.f1048g, c0368jk.f1050i), this.f1340d);
                    }
                }
            } else if (z || i == -1) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(c0368jk);
            }
        }
        ArrayList arrayList2 = c0371jn2.f1062c;
        C0371jn c0371jn3 = (arrayList != null || i == -1 || (arrayList2.size() != 1 && m1489k(c0371jn2) == 0)) ? null : c0371jn2;
        if (c0371jn3 == null) {
            C0371jn c0371jn4 = new C0371jn(z);
            HashSet hashSet = new HashSet();
            boolean z2 = i == -1;
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                m1494s((C0368jk) it3.next(), c0371jn4, hashSet, false, z, 0, z2);
                c0371jn4 = c0371jn4;
            }
            i2 = -1;
            c0371jn3 = c0371jn4;
        } else {
            i2 = -1;
        }
        if (i == i2) {
            boolean z3 = c0371jn3 == c0371jn2;
            ArrayList<C0368jk> arrayList3 = c0371jn3.f1062c;
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                if (!(((C0368jk) it4.next()).f1046e instanceof C0328hy)) {
                    C0371jn c0371jn5 = new C0371jn(c0371jn3.f1067h);
                    for (C0368jk c0368jk2 : arrayList3) {
                        AbstractC0428lq abstractC0428lq3 = c0368jk2.f1046e;
                        if (abstractC0428lq3 instanceof C0328hy) {
                            c0371jn5.m1335j(c0368jk2, this.f1340d);
                        } else if (z3 && abstractC0428lq3.f1166g && c0367jj.m1326l(abstractC0428lq3).m1305f(-2)) {
                            c0371jn5.m1335j(new C0368jk(c0368jk2, c0367jj.f1040d[c0368jk2.f1046e.f1165f], c0368jk2.f1048g, c0368jk2.f1050i), this.f1340d);
                        }
                    }
                    c0371jn3 = c0371jn5;
                    break;
                }
            }
        }
        ArrayList arrayList4 = c0371jn3.f1062c;
        if (arrayList != null) {
            if (z) {
                Iterator it5 = arrayList4.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            c0371jn3.m1335j((C0368jk) it.next(), this.f1340d);
                        }
                    } else if (((C0368jk) it5.next()).f1046e instanceof C0328hy) {
                    }
                }
            } else {
                it = arrayList.iterator();
                while (it.hasNext()) {
                    c0371jn3.m1335j((C0368jk) it.next(), this.f1340d);
                }
            }
        }
        if (arrayList4.isEmpty()) {
            return null;
        }
        return c0371jn3;
    }

    /* JADX INFO: renamed from: v */
    public final C0371jn m1497v(AbstractC0428lq abstractC0428lq, C0579rf c0579rf, boolean z) {
        C0277ga c0277gaM1875j = AbstractC0753xr.m1875j(this.f1124p, c0579rf);
        C0371jn c0371jn = new C0371jn(z);
        int i = 0;
        while (i < abstractC0428lq.f1167h.size()) {
            int i2 = i + 1;
            m1494s(new C0368jk(abstractC0428lq.m1406k(i).f1292g, i2, c0277gaM1875j), c0371jn, new HashSet(), true, z, 0, false);
            i = i2;
        }
        return c0371jn;
    }

    /* JADX INFO: renamed from: w */
    public final BitSet m1498w(abc[] abcVarArr, C0579rf c0579rf) {
        BitSet bitSet = new BitSet();
        for (abc abcVar : abcVarArr) {
            AbstractC0687vf abstractC0687vf = abcVar.f474a;
            C0467nb c0467nb = AbstractC0687vf.f1592e;
            int i = abcVar.f475b;
            if (abstractC0687vf == c0467nb) {
                bitSet.set(i);
            } else if (abstractC0687vf.mo876d(this.f1338b, c0579rf)) {
                bitSet.set(i);
            }
        }
        return bitSet;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 8881. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: x */
    public final int m1499x(com.github.catvod.spider.support.p002A0.C0803zn r19, com.github.catvod.spider.support.p002A0.abf r20, com.github.catvod.spider.support.p002A0.C0643tp r21, int r22, com.github.catvod.spider.support.p002A0.C0579rf r23) {
        /*
            Method dump skipped, instruction units count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.support.p002A0.C0504ol.m1499x(com.github.catvod.spider.support.p002A0.zn, com.github.catvod.spider.support.p002A0.abf, com.github.catvod.spider.support.p002A0.tp, int, com.github.catvod.spider.support.p002A0.rf):int");
    }

    /* JADX INFO: renamed from: y */
    public final int m1500y(C0371jn c0371jn, C0579rf c0579rf) {
        int iM1488j;
        C0371jn c0371jn2 = new C0371jn(c0371jn.f1067h);
        C0371jn c0371jn3 = new C0371jn(c0371jn.f1067h);
        for (C0368jk c0368jk : c0371jn.f1062c) {
            AbstractC0687vf abstractC0687vf = c0368jk.f1050i;
            if (abstractC0687vf == AbstractC0687vf.f1592e) {
                c0371jn2.m1335j(c0368jk, null);
            } else if (abstractC0687vf.mo876d(this.f1338b, c0579rf)) {
                c0371jn2.m1335j(c0368jk, null);
            } else {
                c0371jn3.m1335j(c0368jk, null);
            }
        }
        int iM1488j2 = m1488j(c0371jn2);
        if (iM1488j2 != 0) {
            return iM1488j2;
        }
        if (c0371jn3.f1062c.size() <= 0 || (iM1488j = m1488j(c0371jn3)) == 0) {
            return 0;
        }
        return iM1488j;
    }

    /* JADX INFO: renamed from: z */
    public final C0390kf m1501z(int i, C0643tp c0643tp, C0579rf c0579rf) {
        ArrayList arrayList = c0643tp.f1554b;
        if (i >= 0 && i < arrayList.size()) {
            return new C0390kf(this.f1338b, c0643tp, (C0642to) arrayList.get(i), c0643tp.m1721f(1), c0579rf);
        }
        throw new IndexOutOfBoundsException("token index " + i + " out of range 0.." + (arrayList.size() - 1));
    }
}
