package com.github.catvod.spider.support.p002A0;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.fu */
/* JADX INFO: loaded from: classes.dex */
public final class C0270fu extends AbstractC0414lc {

    /* JADX INFO: renamed from: a */
    public final C0792zc f838a;

    /* JADX INFO: renamed from: b */
    public int f839b;

    /* JADX INFO: renamed from: c */
    public int f840c;

    /* JADX INFO: renamed from: d */
    public int f841d;

    /* JADX INFO: renamed from: e */
    public final C0803zn[] f842e;

    /* JADX INFO: renamed from: f */
    public int f843f;

    /* JADX INFO: renamed from: g */
    public final aab f844g;

    public C0270fu(C0792zc c0792zc, C0367jj c0367jj, C0803zn[] c0803znArr, C0736xa c0736xa) {
        super(c0367jj, c0736xa);
        this.f839b = -1;
        this.f840c = 1;
        this.f841d = 0;
        this.f843f = 0;
        aab aabVar = new aab();
        aabVar.f422a = -1;
        aabVar.f423b = 0;
        aabVar.f424c = -1;
        this.f844g = aabVar;
        this.f842e = c0803znArr;
        this.f838a = c0792zc;
    }

    /* JADX INFO: renamed from: h */
    public static void m1218h(abf abfVar, int i, abf abfVar2) {
        if (i < 0 || i > 127) {
            return;
        }
        synchronized (abfVar) {
            try {
                if (abfVar.f503c == null) {
                    abfVar.f503c = new abf[128];
                }
                abfVar.f503c[i] = abfVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0414lc
    /* JADX INFO: renamed from: i */
    public final void mo1219i() {
        aab aabVar = this.f844g;
        aabVar.f422a = -1;
        aabVar.f423b = 0;
        aabVar.f424c = -1;
        aabVar.f425d = null;
        this.f839b = -1;
        this.f840c = 1;
        this.f841d = 0;
        this.f843f = 0;
    }

    /* JADX INFO: renamed from: j */
    public final abf m1220j(C0464mz c0464mz) {
        C0368jk c0368jk;
        abf abfVar = new abf(c0464mz);
        Iterator it = c0464mz.f1062c.iterator();
        do {
            if (!it.hasNext()) {
                c0368jk = null;
                break;
            }
            c0368jk = (C0368jk) it.next();
        } while (!(c0368jk.f1046e instanceof C0328hy));
        if (c0368jk != null) {
            abfVar.f504d = true;
            abfVar.f506f = ((C0292gp) c0368jk).f869a;
            abfVar.f505e = this.f1124p.f1043g[c0368jk.f1046e.f1165f];
        }
        C0803zn c0803zn = this.f842e[this.f843f];
        synchronized (c0803zn.f1908a) {
            try {
                abf abfVar2 = (abf) c0803zn.f1908a.get(abfVar);
                if (abfVar2 != null) {
                    return abfVar2;
                }
                abfVar.f501a = c0803zn.f1908a.size();
                c0464mz.f1060a = true;
                c0464mz.f1061b = null;
                abfVar.f502b = c0464mz;
                c0803zn.f1908a.put(abfVar, abfVar);
                return abfVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0154  */
    /* JADX WARN: Code duplicated, block: B:75:0x0166  */
    /* JADX INFO: renamed from: k */
    public final boolean m1221k(C0619ss c0619ss, C0292gp c0292gp, C0464mz c0464mz, boolean z, boolean z2, boolean z3) {
        C0292gp c0292gp2;
        C0292gp c0292gp3;
        C0287gk c0287gk;
        boolean z4;
        AbstractC0428lq abstractC0428lq = c0292gp.f1046e;
        boolean z5 = abstractC0428lq instanceof C0328hy;
        C0367jj c0367jj = this.f1124p;
        if (z5) {
            AbstractC0753xr abstractC0753xr = c0292gp.f1048g;
            if (abstractC0753xr == null || abstractC0753xr.m1878m()) {
                AbstractC0753xr abstractC0753xr2 = c0292gp.f1048g;
                if (abstractC0753xr2 == null || abstractC0753xr2.mo1142c()) {
                    c0464mz.m1335j(c0292gp, null);
                    return true;
                }
                c0464mz.m1335j(new C0292gp(c0292gp, abstractC0428lq, AbstractC0753xr.f1815h), null);
                z4 = true;
            } else {
                z4 = z;
            }
            AbstractC0753xr abstractC0753xr3 = c0292gp.f1048g;
            if (abstractC0753xr3 == null || abstractC0753xr3.mo1142c()) {
                return z4;
            }
            boolean zM1221k = z4;
            for (int i = 0; i < c0292gp.f1048g.mo1143d(); i++) {
                if (c0292gp.f1048g.mo1141b(i) != Integer.MAX_VALUE) {
                    zM1221k = m1221k(c0619ss, new C0292gp(c0292gp, (AbstractC0428lq) c0367jj.f1037a.get(c0292gp.f1048g.mo1141b(i)), c0292gp.f1048g.mo1140a(i)), c0464mz, zM1221k, z2, z3);
                }
            }
            return zM1221k;
        }
        if (!abstractC0428lq.f1166g && (!z || !c0292gp.f870b)) {
            c0464mz.m1335j(c0292gp, null);
        }
        boolean zM1221k2 = z;
        for (int i2 = 0; i2 < abstractC0428lq.f1167h.size(); i2++) {
            AbstractC0488nw abstractC0488nwM1406k = abstractC0428lq.m1406k(i2);
            int iMo871b = abstractC0488nwM1406k.mo871b();
            if (iMo871b == 10) {
                throw new UnsupportedOperationException("Precedence predicates are not supported in lexers.");
            }
            switch (iMo871b) {
                case 1:
                    c0292gp3 = new C0292gp(c0292gp, abstractC0488nwM1406k.f1292g);
                    c0292gp2 = c0292gp3;
                    if (c0292gp2 != null) {
                        zM1221k2 = m1221k(c0619ss, c0292gp2, c0464mz, zM1221k2, z2, z3);
                    }
                    break;
                case 2:
                case 5:
                case 7:
                    if (z3 && abstractC0488nwM1406k.mo872d(-1, 1114111)) {
                        c0292gp3 = new C0292gp(c0292gp, abstractC0488nwM1406k.f1292g);
                        c0292gp2 = c0292gp3;
                    } else {
                        c0292gp2 = null;
                    }
                    if (c0292gp2 != null) {
                        zM1221k2 = m1221k(c0619ss, c0292gp2, c0464mz, zM1221k2, z2, z3);
                    }
                    break;
                case 3:
                    c0292gp2 = new C0292gp(c0292gp, abstractC0488nwM1406k.f1292g, C0277ga.m1242g(c0292gp.f1048g, ((abw) abstractC0488nwM1406k).f541f.f1164e));
                    if (c0292gp2 != null) {
                        zM1221k2 = m1221k(c0619ss, c0292gp2, c0464mz, zM1221k2, z2, z3);
                    }
                    break;
                case 4:
                    c0464mz.f1065f = true;
                    if (z2) {
                        int i3 = this.f841d;
                        int i4 = this.f840c;
                        int i5 = c0619ss.f1514b;
                        try {
                            m1222l(c0619ss);
                            this.f841d = i3;
                            this.f840c = i4;
                            c0619ss.f1514b = i5;
                        } catch (Throwable th) {
                            this.f841d = i3;
                            this.f840c = i4;
                            c0619ss.f1514b = i5;
                            throw th;
                        }
                    }
                    c0292gp3 = new C0292gp(c0292gp, abstractC0488nwM1406k.f1292g);
                    c0292gp2 = c0292gp3;
                    if (c0292gp2 != null) {
                        zM1221k2 = m1221k(c0619ss, c0292gp2, c0464mz, zM1221k2, z2, z3);
                    }
                    break;
                case 6:
                    AbstractC0753xr abstractC0753xr4 = c0292gp.f1048g;
                    if (abstractC0753xr4 == null || abstractC0753xr4.m1878m()) {
                        InterfaceC0573r interfaceC0573r = c0367jj.f1044h[((C0531pl) abstractC0488nwM1406k).f1367f];
                        C0287gk c0287gk2 = c0292gp.f869a;
                        if (c0287gk2 == null) {
                            c0287gk = new C0287gk(new InterfaceC0573r[]{interfaceC0573r});
                        } else {
                            InterfaceC0573r[] interfaceC0573rArr = c0287gk2.f858a;
                            InterfaceC0573r[] interfaceC0573rArr2 = (InterfaceC0573r[]) Arrays.copyOf(interfaceC0573rArr, interfaceC0573rArr.length + 1);
                            interfaceC0573rArr2[interfaceC0573rArr2.length - 1] = interfaceC0573r;
                            c0287gk = new C0287gk(interfaceC0573rArr2);
                        }
                        c0292gp3 = new C0292gp(c0292gp, abstractC0488nwM1406k.f1292g, c0287gk);
                    } else {
                        c0292gp3 = new C0292gp(c0292gp, abstractC0488nwM1406k.f1292g);
                    }
                    c0292gp2 = c0292gp3;
                    if (c0292gp2 != null) {
                        zM1221k2 = m1221k(c0619ss, c0292gp2, c0464mz, zM1221k2, z2, z3);
                    }
                    break;
                default:
                    c0292gp2 = null;
                    if (c0292gp2 != null) {
                        zM1221k2 = m1221k(c0619ss, c0292gp2, c0464mz, zM1221k2, z2, z3);
                    }
                    break;
            }
        }
        return zM1221k2;
    }

    /* JADX INFO: renamed from: l */
    public final void m1222l(C0619ss c0619ss) {
        if (c0619ss.mo1697e(1) == 10) {
            this.f840c++;
            this.f841d = 0;
        } else {
            this.f841d++;
        }
        int i = c0619ss.f1514b;
        if (c0619ss.f1513a - i == 0) {
            throw new IllegalStateException("cannot consume EOF");
        }
        c0619ss.f1514b = i + 1;
    }

    /* JADX INFO: renamed from: m */
    public final int m1223m(C0619ss c0619ss, abf abfVar) throws Throwable {
        int i;
        boolean z;
        abf abfVarM1220j;
        C0464mz c0464mz;
        int i2;
        int i3;
        AbstractC0428lq abstractC0428lq;
        C0368jk c0368jk;
        int i4;
        int i5;
        AbstractC0428lq abstractC0428lq2;
        C0368jk c0368jk2;
        abf abfVar2 = abfVar;
        boolean z2 = abfVar2.f504d;
        aab aabVar = this.f844g;
        if (z2) {
            aabVar.f422a = c0619ss.f1514b;
            aabVar.f423b = this.f840c;
            aabVar.f424c = this.f841d;
            aabVar.f425d = abfVar2;
        }
        int iMo1697e = c0619ss.mo1697e(1);
        while (true) {
            abf[] abfVarArr = abfVar2.f503c;
            abf abfVar3 = (abfVarArr == null || iMo1697e < 0 || iMo1697e > 127) ? null : abfVarArr[iMo1697e];
            abf abfVar4 = AbstractC0414lc.f1123o;
            if (abfVar3 == null) {
                C0464mz c0464mz2 = new C0464mz();
                int i6 = 0;
                for (C0368jk c0368jk3 : abfVar2.f502b.f1062c) {
                    boolean z3 = c0368jk3.f1047f == i6;
                    if (!z3 || !((C0292gp) c0368jk3).f870b) {
                        AbstractC0428lq abstractC0428lq3 = c0368jk3.f1046e;
                        int size = abstractC0428lq3.f1167h.size();
                        int i7 = 0;
                        while (true) {
                            if (i7 >= size) {
                                c0464mz = c0464mz2;
                                break;
                            }
                            AbstractC0488nw abstractC0488nwM1406k = abstractC0428lq3.m1406k(i7);
                            AbstractC0428lq abstractC0428lq4 = abstractC0488nwM1406k.mo872d(iMo1697e, 1114111) ? abstractC0488nwM1406k.f1292g : null;
                            if (abstractC0428lq4 != null) {
                                C0292gp c0292gp = (C0292gp) c0368jk3;
                                C0287gk c0287gk = c0292gp.f869a;
                                if (c0287gk != null) {
                                    i4 = i7;
                                    int i8 = c0619ss.f1514b - this.f839b;
                                    i5 = size;
                                    abstractC0428lq2 = abstractC0428lq3;
                                    int i9 = 0;
                                    InterfaceC0573r[] interfaceC0573rArr = null;
                                    while (true) {
                                        InterfaceC0573r[] interfaceC0573rArr2 = c0287gk.f858a;
                                        c0368jk2 = c0368jk3;
                                        if (i9 >= interfaceC0573rArr2.length) {
                                            break;
                                        }
                                        if (interfaceC0573rArr2[i9].mo905a() && !(interfaceC0573rArr2[i9] instanceof abi)) {
                                            if (interfaceC0573rArr == null) {
                                                interfaceC0573rArr = (InterfaceC0573r[]) interfaceC0573rArr2.clone();
                                            }
                                            interfaceC0573rArr[i9] = new abi(i8, interfaceC0573rArr2[i9]);
                                        }
                                        i9++;
                                        c0368jk3 = c0368jk2;
                                    }
                                    if (interfaceC0573rArr != null) {
                                        c0287gk = new C0287gk(interfaceC0573rArr);
                                    }
                                } else {
                                    i4 = i7;
                                    i5 = size;
                                    abstractC0428lq2 = abstractC0428lq3;
                                    c0368jk2 = c0368jk3;
                                }
                                boolean z4 = iMo1697e == -1;
                                C0292gp c0292gp2 = new C0292gp(c0292gp, abstractC0428lq4, c0287gk);
                                i2 = i4;
                                abstractC0428lq = abstractC0428lq2;
                                C0368jk c0368jk4 = c0368jk2;
                                i3 = i5;
                                c0464mz = c0464mz2;
                                if (m1221k(c0619ss, c0292gp2, c0464mz2, z3, true, z4)) {
                                    i6 = c0368jk4.f1047f;
                                    break;
                                }
                                c0368jk = c0368jk4;
                            } else {
                                i2 = i7;
                                i3 = size;
                                abstractC0428lq = abstractC0428lq3;
                                c0368jk = c0368jk3;
                                c0464mz = c0464mz2;
                            }
                            c0368jk3 = c0368jk;
                            i7 = i2 + 1;
                            c0464mz2 = c0464mz;
                            abstractC0428lq3 = abstractC0428lq;
                            i6 = i6;
                            size = i3;
                        }
                        c0464mz2 = c0464mz;
                    }
                }
                C0464mz c0464mz3 = c0464mz2;
                i = -1;
                if (c0464mz3.f1062c.isEmpty()) {
                    if (!c0464mz3.f1065f) {
                        m1218h(abfVar2, iMo1697e, abfVar4);
                    }
                    abfVarM1220j = abfVar4;
                } else {
                    boolean z5 = c0464mz3.f1065f;
                    c0464mz3.f1065f = false;
                    abfVarM1220j = m1220j(c0464mz3);
                    if (!z5) {
                        m1218h(abfVar2, iMo1697e, abfVarM1220j);
                    }
                }
                abfVar2 = abfVarM1220j;
            } else {
                i = -1;
                abfVar2 = abfVar3;
            }
            if (abfVar2 == abfVar4) {
                break;
            }
            if (iMo1697e != i) {
                m1222l(c0619ss);
            }
            if (abfVar2.f504d) {
                aabVar.f422a = c0619ss.f1514b;
                aabVar.f423b = this.f840c;
                aabVar.f424c = this.f841d;
                aabVar.f425d = abfVar2;
                if (iMo1697e == i) {
                    break;
                }
            }
            iMo1697e = c0619ss.mo1697e(1);
        }
        abf abfVar5 = aabVar.f425d;
        C0792zc c0792zc = this.f838a;
        if (abfVar5 == null) {
            if (iMo1697e == i && c0619ss.f1514b == this.f839b) {
                return -1;
            }
            throw new C0663ui(c0792zc, c0619ss, this.f839b);
        }
        C0287gk c0287gk2 = abfVar5.f506f;
        int i10 = this.f839b;
        int i11 = aabVar.f422a;
        int i12 = aabVar.f423b;
        int i13 = aabVar.f424c;
        c0619ss.f1514b = i11;
        this.f840c = i12;
        this.f841d = i13;
        if (c0287gk2 != null) {
            try {
                InterfaceC0573r[] interfaceC0573rArr3 = c0287gk2.f858a;
                int length = interfaceC0573rArr3.length;
                boolean z6 = false;
                for (int i14 = 0; i14 < length; i14++) {
                    try {
                        InterfaceC0573r interfaceC0573r = interfaceC0573rArr3[i14];
                        if (interfaceC0573r instanceof abi) {
                            int i15 = ((abi) interfaceC0573r).f521c + i10;
                            c0619ss.f1514b = i15;
                            interfaceC0573r = ((abi) interfaceC0573r).f522d;
                            z6 = i15 != i11;
                        } else if (interfaceC0573r.mo905a()) {
                            c0619ss.f1514b = i11;
                        }
                        interfaceC0573r.mo906b(c0792zc);
                    } catch (Throwable th) {
                        th = th;
                        z = z6;
                        if (z) {
                            c0619ss.f1514b = i11;
                        }
                        throw th;
                    }
                }
                if (z6) {
                    c0619ss.f1514b = i11;
                }
            } catch (Throwable th2) {
                th = th2;
                z = false;
            }
        }
        return aabVar.f425d.f505e;
    }

    /* JADX INFO: renamed from: n */
    public final int m1224n(C0619ss c0619ss, int i) {
        this.f843f = i;
        c0619ss.getClass();
        this.f839b = c0619ss.f1514b;
        aab aabVar = this.f844g;
        aabVar.f422a = -1;
        aabVar.f423b = 0;
        aabVar.f424c = -1;
        aabVar.f425d = null;
        C0803zn c0803zn = this.f842e[i];
        if (c0803zn.f1909b != null) {
            return m1223m(c0619ss, c0803zn.f1909b);
        }
        AbstractC0428lq abstractC0428lq = (AbstractC0428lq) this.f1124p.f1045i.get(this.f843f);
        C0215dt c0215dt = AbstractC0753xr.f1815h;
        C0464mz c0464mz = new C0464mz();
        int i2 = 0;
        while (i2 < abstractC0428lq.f1167h.size()) {
            int i3 = i2 + 1;
            m1221k(c0619ss, new C0292gp(abstractC0428lq.m1406k(i2).f1292g, i3, c0215dt), c0464mz, false, false, false);
            i2 = i3;
        }
        boolean z = c0464mz.f1065f;
        c0464mz.f1065f = false;
        abf abfVarM1220j = m1220j(c0464mz);
        if (!z) {
            this.f842e[this.f843f].f1909b = abfVarM1220j;
        }
        return m1223m(c0619ss, abfVarM1220j);
    }
}
