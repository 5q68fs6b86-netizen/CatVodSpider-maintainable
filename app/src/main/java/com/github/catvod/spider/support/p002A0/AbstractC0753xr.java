package com.github.catvod.spider.support.p002A0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.xr */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0753xr {

    /* JADX INFO: renamed from: h */
    public static final C0215dt f1815h = new C0215dt(null, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: i */
    public final int f1816i;

    public AbstractC0753xr(int i) {
        this.f1816i = i;
    }

    /* JADX INFO: renamed from: j */
    public static C0277ga m1875j(C0367jj c0367jj, C0579rf c0579rf) {
        if (c0579rf == null) {
            c0579rf = C0579rf.f1434d;
        }
        C0579rf c0579rf2 = c0579rf.f1435e;
        return (c0579rf2 == null || c0579rf == C0579rf.f1434d) ? f1815h : C0277ga.m1242g(m1875j(c0367jj, c0579rf2), ((abw) ((AbstractC0428lq) c0367jj.f1037a.get(c0579rf.f1436f)).m1406k(0)).f541f.f1164e);
    }

    /* JADX INFO: renamed from: k */
    public static AbstractC0753xr m1876k(AbstractC0753xr abstractC0753xr, C0736xa c0736xa, IdentityHashMap identityHashMap) {
        if (abstractC0753xr.mo1142c()) {
            return abstractC0753xr;
        }
        AbstractC0753xr abstractC0753xr2 = (AbstractC0753xr) identityHashMap.get(abstractC0753xr);
        if (abstractC0753xr2 != null) {
            return abstractC0753xr2;
        }
        AbstractC0753xr abstractC0753xr3 = (AbstractC0753xr) ((HashMap) c0736xa.f1779d).get(abstractC0753xr);
        if (abstractC0753xr3 != null) {
            identityHashMap.put(abstractC0753xr, abstractC0753xr3);
            return abstractC0753xr3;
        }
        AbstractC0753xr[] abstractC0753xrArr = new AbstractC0753xr[abstractC0753xr.mo1143d()];
        boolean z = false;
        for (int i = 0; i < abstractC0753xrArr.length; i++) {
            AbstractC0753xr abstractC0753xrM1876k = m1876k(abstractC0753xr.mo1140a(i), c0736xa, identityHashMap);
            if (z || abstractC0753xrM1876k != abstractC0753xr.mo1140a(i)) {
                if (!z) {
                    abstractC0753xrArr = new AbstractC0753xr[abstractC0753xr.mo1143d()];
                    for (int i2 = 0; i2 < abstractC0753xr.mo1143d(); i2++) {
                        abstractC0753xrArr[i2] = abstractC0753xr.mo1140a(i2);
                    }
                    z = true;
                }
                abstractC0753xrArr[i] = abstractC0753xrM1876k;
            }
        }
        C0215dt c0215dt = f1815h;
        HashMap map = (HashMap) c0736xa.f1779d;
        if (!z) {
            if (abstractC0753xr != c0215dt && ((AbstractC0753xr) map.get(abstractC0753xr)) == null) {
                map.put(abstractC0753xr, abstractC0753xr);
            }
            identityHashMap.put(abstractC0753xr, abstractC0753xr);
            return abstractC0753xr;
        }
        AbstractC0753xr abstractC0753xrM1242g = abstractC0753xrArr.length == 0 ? c0215dt : abstractC0753xrArr.length == 1 ? C0277ga.m1242g(abstractC0753xrArr[0], abstractC0753xr.mo1141b(0)) : new C0543px(abstractC0753xrArr, ((C0543px) abstractC0753xr).f1385f);
        if (abstractC0753xrM1242g != c0215dt && ((AbstractC0753xr) map.get(abstractC0753xrM1242g)) == null) {
            map.put(abstractC0753xrM1242g, abstractC0753xrM1242g);
        }
        identityHashMap.put(abstractC0753xrM1242g, abstractC0753xrM1242g);
        identityHashMap.put(abstractC0753xr, abstractC0753xrM1242g);
        return abstractC0753xrM1242g;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077  */
    /* JADX INFO: renamed from: l */
    public static AbstractC0753xr m1877l(AbstractC0753xr abstractC0753xr, AbstractC0753xr abstractC0753xr2, boolean z, C0736xa c0736xa) {
        AbstractC0753xr[] abstractC0753xrArr;
        AbstractC0753xr[] abstractC0753xrArr2;
        int[] iArr;
        int i;
        int i2;
        AbstractC0753xr c0543px;
        AbstractC0753xr c0543px2;
        AbstractC0753xr abstractC0753xr3;
        AbstractC0753xr c0543px3 = abstractC0753xr;
        AbstractC0753xr c0543px4 = abstractC0753xr2;
        if (c0543px3 == c0543px4 || abstractC0753xr.equals(abstractC0753xr2)) {
            return c0543px3;
        }
        boolean z2 = c0543px3 instanceof C0277ga;
        if (z2 && (c0543px4 instanceof C0277ga)) {
            C0277ga c0277ga = (C0277ga) c0543px3;
            C0277ga c0277ga2 = (C0277ga) c0543px4;
            if (c0736xa != null && ((abstractC0753xr3 = (AbstractC0753xr) c0736xa.m1858f(c0277ga, c0277ga2)) != null || (abstractC0753xr3 = (AbstractC0753xr) c0736xa.m1858f(c0277ga2, c0277ga)) != null)) {
                return abstractC0753xr3;
            }
            AbstractC0753xr abstractC0753xr4 = c0277ga.f852e;
            int i3 = c0277ga.f853f;
            AbstractC0753xr abstractC0753xr5 = null;
            AbstractC0753xr c0543px5 = f1815h;
            if (z) {
                if (c0277ga != c0543px5 && c0277ga2 != c0543px5) {
                    c0543px5 = null;
                }
            } else if (c0277ga != c0543px5 || c0277ga2 != c0543px5) {
                if (c0277ga == c0543px5) {
                    c0543px5 = new C0543px(new AbstractC0753xr[]{c0277ga2.f852e, null}, new int[]{c0277ga2.f853f, Integer.MAX_VALUE});
                } else if (c0277ga2 == c0543px5) {
                    c0543px5 = new C0543px(new AbstractC0753xr[]{abstractC0753xr4, null}, new int[]{i3, Integer.MAX_VALUE});
                } else {
                    c0543px5 = null;
                }
            }
            if (c0543px5 != null) {
                if (c0736xa != null) {
                    c0736xa.m1859g(c0277ga, c0277ga2, c0543px5);
                }
                return c0543px5;
            }
            int i4 = c0277ga2.f853f;
            AbstractC0753xr abstractC0753xr6 = c0277ga2.f852e;
            if (i3 == i4) {
                AbstractC0753xr abstractC0753xrM1877l = m1877l(abstractC0753xr4, abstractC0753xr6, z, c0736xa);
                if (abstractC0753xrM1877l == abstractC0753xr4) {
                    return c0277ga;
                }
                if (abstractC0753xrM1877l == abstractC0753xr6) {
                    return c0277ga2;
                }
                c0543px2 = C0277ga.m1242g(abstractC0753xrM1877l, i3);
                if (c0736xa != null) {
                    c0736xa.m1859g(c0277ga, c0277ga2, c0543px2);
                }
            } else {
                if (c0277ga == c0277ga2 || (abstractC0753xr4 != null && abstractC0753xr4.equals(abstractC0753xr6))) {
                    abstractC0753xr5 = abstractC0753xr4;
                }
                int i5 = c0277ga2.f853f;
                if (abstractC0753xr5 != null) {
                    int[] iArr2 = {i3, i5};
                    if (i3 > i5) {
                        iArr2[0] = i5;
                        iArr2[1] = i3;
                    }
                    AbstractC0753xr c0543px6 = new C0543px(new AbstractC0753xr[]{abstractC0753xr5, abstractC0753xr5}, iArr2);
                    if (c0736xa != null) {
                        c0736xa.m1859g(c0277ga, c0277ga2, c0543px6);
                    }
                    return c0543px6;
                }
                int[] iArr3 = {i3, i5};
                AbstractC0753xr[] abstractC0753xrArr3 = {abstractC0753xr4, abstractC0753xr6};
                if (i3 > i5) {
                    iArr3[0] = i5;
                    iArr3[1] = i3;
                    abstractC0753xrArr3 = new AbstractC0753xr[]{abstractC0753xr6, abstractC0753xr4};
                }
                c0543px2 = new C0543px(abstractC0753xrArr3, iArr3);
                if (c0736xa != null) {
                    c0736xa.m1859g(c0277ga, c0277ga2, c0543px2);
                }
            }
            return c0543px2;
        }
        if (z) {
            if (c0543px3 instanceof C0215dt) {
                return c0543px3;
            }
            if (c0543px4 instanceof C0215dt) {
                return c0543px4;
            }
        }
        if (z2) {
            c0543px3 = new C0543px((C0277ga) c0543px3);
        }
        if (c0543px4 instanceof C0277ga) {
            c0543px4 = new C0543px((C0277ga) c0543px4);
        }
        C0543px c0543px7 = (C0543px) c0543px3;
        C0543px c0543px8 = (C0543px) c0543px4;
        if (c0736xa == null || ((c0543px = (AbstractC0753xr) c0736xa.m1858f(c0543px7, c0543px8)) == null && (c0543px = (AbstractC0753xr) c0736xa.m1858f(c0543px8, c0543px7)) == null)) {
            int[] iArr4 = c0543px7.f1385f;
            int length = iArr4.length;
            int[] iArr5 = c0543px8.f1385f;
            int[] iArrCopyOf = new int[length + iArr5.length];
            int length2 = iArr4.length + iArr5.length;
            AbstractC0753xr[] abstractC0753xrArr4 = new AbstractC0753xr[length2];
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                int length3 = iArr4.length;
                abstractC0753xrArr = c0543px7.f1384e;
                abstractC0753xrArr2 = c0543px8.f1384e;
                iArr = c0543px8.f1385f;
                if (i6 >= length3 || i7 >= iArr.length) {
                    break;
                }
                AbstractC0753xr abstractC0753xr7 = abstractC0753xrArr[i6];
                AbstractC0753xr abstractC0753xr8 = abstractC0753xrArr2[i7];
                int i9 = iArr4[i6];
                int i10 = iArr[i7];
                if (i9 == i10) {
                    boolean z3 = i9 == Integer.MAX_VALUE && abstractC0753xr7 == null && abstractC0753xr8 == null;
                    boolean z4 = (abstractC0753xr7 == null || abstractC0753xr8 == null || !abstractC0753xr7.equals(abstractC0753xr8)) ? false : true;
                    if (z3 || z4) {
                        abstractC0753xrArr4[i8] = abstractC0753xr7;
                        iArrCopyOf[i8] = i9;
                    } else {
                        abstractC0753xrArr4[i8] = m1877l(abstractC0753xr7, abstractC0753xr8, z, c0736xa);
                        iArrCopyOf[i8] = i9;
                    }
                    i6++;
                } else {
                    if (i9 < i10) {
                        abstractC0753xrArr4[i8] = abstractC0753xr7;
                        iArrCopyOf[i8] = i9;
                        i6++;
                    } else {
                        abstractC0753xrArr4[i8] = abstractC0753xr8;
                        iArrCopyOf[i8] = i10;
                    }
                    i8++;
                }
                i7++;
                i8++;
            }
            if (i6 < iArr4.length) {
                while (i6 < iArr4.length) {
                    abstractC0753xrArr4[i8] = abstractC0753xrArr[i6];
                    iArrCopyOf[i8] = iArr4[i6];
                    i8++;
                    i6++;
                }
                i = 1;
            } else {
                i = 1;
                while (i7 < iArr.length) {
                    abstractC0753xrArr4[i8] = abstractC0753xrArr2[i7];
                    iArrCopyOf[i8] = iArr[i7];
                    i8++;
                    i7++;
                }
            }
            if (i8 >= length2) {
                i2 = 0;
            } else {
                if (i8 == i) {
                    AbstractC0753xr abstractC0753xrM1242g = C0277ga.m1242g(abstractC0753xrArr4[0], iArrCopyOf[0]);
                    if (c0736xa != null) {
                        c0736xa.m1859g(c0543px7, c0543px8, abstractC0753xrM1242g);
                    }
                    return abstractC0753xrM1242g;
                }
                i2 = 0;
                abstractC0753xrArr4 = (AbstractC0753xr[]) Arrays.copyOf(abstractC0753xrArr4, i8);
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i8);
            }
            c0543px = new C0543px(abstractC0753xrArr4, iArrCopyOf);
            if (c0543px.equals(c0543px7)) {
                if (c0736xa == null) {
                    return c0543px7;
                }
                c0736xa.m1859g(c0543px7, c0543px8, c0543px7);
                return c0543px7;
            }
            if (c0543px.equals(c0543px8)) {
                if (c0736xa != null) {
                    c0736xa.m1859g(c0543px7, c0543px8, c0543px8);
                }
                return c0543px8;
            }
            HashMap map = new HashMap();
            for (AbstractC0753xr abstractC0753xr9 : abstractC0753xrArr4) {
                if (!map.containsKey(abstractC0753xr9)) {
                    map.put(abstractC0753xr9, abstractC0753xr9);
                }
            }
            while (i2 < abstractC0753xrArr4.length) {
                abstractC0753xrArr4[i2] = (AbstractC0753xr) map.get(abstractC0753xrArr4[i2]);
                i2++;
            }
            if (c0736xa != null) {
                c0736xa.m1859g(c0543px7, c0543px8, c0543px);
            }
        }
        return c0543px;
    }

    /* JADX INFO: renamed from: a */
    public abstract AbstractC0753xr mo1140a(int i);

    /* JADX INFO: renamed from: b */
    public abstract int mo1141b(int i);

    /* JADX INFO: renamed from: c */
    public boolean mo1142c() {
        return this == f1815h;
    }

    /* JADX INFO: renamed from: d */
    public abstract int mo1143d();

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        return this.f1816i;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m1878m() {
        return mo1141b(mo1143d() - 1) == Integer.MAX_VALUE;
    }
}
