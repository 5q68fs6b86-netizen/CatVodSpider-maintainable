package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1278d;
import com.github.catvod.spider.support.p044FM.p098x.C1918D;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.X */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1974X {

    /* JADX INFO: renamed from: b */
    public static final C2020w f4509b = new C2020w();

    /* JADX INFO: renamed from: a */
    public final int f4510a;

    protected AbstractC1974X(int i) {
        this.f4510a = i;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.y.m>] */
    /* JADX INFO: renamed from: a */
    public static AbstractC1974X m4750a(C1977a c1977a, C1918D c1918d) {
        if (c1918d == null) {
            c1918d = C1918D.f4393c;
        }
        C1918D c1918d2 = c1918d.f4394a;
        return (c1918d2 == null || c1918d == C1918D.f4393c) ? f4509b : C2004n0.m4790i(m4750a(c1977a, c1918d2), ((C1988f0) ((AbstractC2001m) c1977a.f4513a.get(c1918d.f4395b)).m4789d(0)).f4542c.f4561b);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.FM.y.X, com.github.catvod.spider.support.FM.y.X>] */
    /* JADX INFO: renamed from: b */
    public static AbstractC1974X m4751b(AbstractC1974X abstractC1974X, C1975Y c1975y, IdentityHashMap<AbstractC1974X, AbstractC1974X> identityHashMap) {
        if (abstractC1974X.mo4756f()) {
            return abstractC1974X;
        }
        AbstractC1974X abstractC1974X2 = identityHashMap.get(abstractC1974X);
        if (abstractC1974X2 != null) {
            return abstractC1974X2;
        }
        AbstractC1974X abstractC1974X3 = (AbstractC1974X) c1975y.f4511a.get(abstractC1974X);
        if (abstractC1974X3 != null) {
            identityHashMap.put(abstractC1974X, abstractC1974X3);
            return abstractC1974X3;
        }
        AbstractC1974X[] abstractC1974XArr = new AbstractC1974X[abstractC1974X.mo4757h()];
        boolean z = false;
        for (int i = 0; i < abstractC1974XArr.length; i++) {
            AbstractC1974X abstractC1974XM4751b = m4751b(abstractC1974X.mo4753c(i), c1975y, identityHashMap);
            if (z || abstractC1974XM4751b != abstractC1974X.mo4753c(i)) {
                if (!z) {
                    abstractC1974XArr = new AbstractC1974X[abstractC1974X.mo4757h()];
                    for (int i2 = 0; i2 < abstractC1974X.mo4757h(); i2++) {
                        abstractC1974XArr[i2] = abstractC1974X.mo4753c(i2);
                    }
                    z = true;
                }
                abstractC1974XArr[i] = abstractC1974XM4751b;
            }
        }
        if (!z) {
            c1975y.m4758a(abstractC1974X);
            identityHashMap.put(abstractC1974X, abstractC1974X);
            return abstractC1974X;
        }
        AbstractC1974X abstractC1974XM4790i = abstractC1974XArr.length == 0 ? f4509b : abstractC1974XArr.length == 1 ? C2004n0.m4790i(abstractC1974XArr[0], abstractC1974X.mo4754d(0)) : new C2007p(abstractC1974XArr, ((C2007p) abstractC1974X).f4572d);
        c1975y.m4758a(abstractC1974XM4790i);
        identityHashMap.put(abstractC1974XM4790i, abstractC1974XM4790i);
        identityHashMap.put(abstractC1974X, abstractC1974XM4790i);
        return abstractC1974XM4790i;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00dc A[PHI: r4
      0x00dc: PHI (r4v21 com.github.catvod.spider.support.FM.y.X) = (r4v20 com.github.catvod.spider.support.FM.y.X), (r4v22 com.github.catvod.spider.support.FM.y.X) binds: [B:68:0x0104, B:62:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: g */
    public static AbstractC1974X m4752g(AbstractC1974X abstractC1974X, AbstractC1974X abstractC1974X2, boolean z, C1278d<AbstractC1974X, AbstractC1974X, AbstractC1974X> c1278d) {
        int[] iArr;
        AbstractC1974X c2007p;
        AbstractC1974X c2007p2;
        AbstractC1974X c2007p3;
        AbstractC1974X abstractC1974X3;
        AbstractC1974X c2007p4 = abstractC1974X;
        AbstractC1974X c2007p5 = abstractC1974X2;
        if (c2007p4 == c2007p5 || abstractC1974X.equals(abstractC1974X2)) {
            return c2007p4;
        }
        boolean z2 = c2007p4 instanceof C2004n0;
        if (z2 && (c2007p5 instanceof C2004n0)) {
            C2004n0 c2004n0 = (C2004n0) c2007p4;
            C2004n0 c2004n1 = (C2004n0) c2007p5;
            if (c1278d == null || ((c2007p3 = c1278d.m3193a(c2004n0, c2004n1)) == null && (c2007p3 = c1278d.m3193a(c2004n1, c2004n0)) == null)) {
                AbstractC1974X abstractC1974X4 = null;
                AbstractC1974X abstractC1974X5 = f4509b;
                if (z) {
                    if (c2004n0 != abstractC1974X5 && c2004n1 != abstractC1974X5) {
                        abstractC1974X5 = null;
                    }
                } else if (c2004n0 != abstractC1974X5 || c2004n1 != abstractC1974X5) {
                    if (c2004n0 == abstractC1974X5) {
                        c2007p2 = new C2007p(new AbstractC1974X[]{c2004n1.f4567c, null}, new int[]{c2004n1.f4568d, Integer.MAX_VALUE});
                    } else if (c2004n1 == abstractC1974X5) {
                        c2007p2 = new C2007p(new AbstractC1974X[]{c2004n0.f4567c, null}, new int[]{c2004n0.f4568d, Integer.MAX_VALUE});
                    } else {
                        abstractC1974X5 = null;
                    }
                    abstractC1974X5 = c2007p2;
                }
                if (abstractC1974X5 != null) {
                    if (c1278d != null) {
                        c1278d.m3194b(c2004n0, c2004n1, abstractC1974X5);
                    }
                    return abstractC1974X5;
                }
                if (c2004n0.f4568d == c2004n1.f4568d) {
                    AbstractC1974X abstractC1974XM4752g = m4752g(c2004n0.f4567c, c2004n1.f4567c, z, c1278d);
                    if (abstractC1974XM4752g == c2004n0.f4567c) {
                        return c2004n0;
                    }
                    if (abstractC1974XM4752g == c2004n1.f4567c) {
                        return c2004n1;
                    }
                    AbstractC1974X abstractC1974XM4790i = C2004n0.m4790i(abstractC1974XM4752g, c2004n0.f4568d);
                    if (c1278d != null) {
                        c1278d.m3194b(c2004n0, c2004n1, abstractC1974XM4790i);
                    }
                    return abstractC1974XM4790i;
                }
                if (c2004n0 == c2004n1 || ((abstractC1974X3 = c2004n0.f4567c) != null && abstractC1974X3.equals(c2004n1.f4567c))) {
                    abstractC1974X4 = c2004n0.f4567c;
                }
                int[] iArr2 = new int[2];
                if (abstractC1974X4 != null) {
                    int i = c2004n0.f4568d;
                    iArr2[0] = i;
                    int i2 = c2004n1.f4568d;
                    iArr2[1] = i2;
                    if (i > i2) {
                        iArr2[0] = i2;
                        iArr2[1] = i;
                    }
                    c2007p3 = new C2007p(new AbstractC1974X[]{abstractC1974X4, abstractC1974X4}, iArr2);
                    if (c1278d != null) {
                        c1278d.m3194b(c2004n0, c2004n1, c2007p3);
                    }
                } else {
                    int i3 = c2004n0.f4568d;
                    iArr2[0] = i3;
                    int i4 = c2004n1.f4568d;
                    iArr2[1] = i4;
                    AbstractC1974X abstractC1974X6 = c2004n0.f4567c;
                    AbstractC1974X abstractC1974X7 = c2004n1.f4567c;
                    AbstractC1974X[] abstractC1974XArr = {abstractC1974X6, abstractC1974X7};
                    if (i3 > i4) {
                        iArr2[0] = i4;
                        iArr2[1] = i3;
                        abstractC1974XArr = new AbstractC1974X[]{abstractC1974X7, abstractC1974X6};
                    }
                    c2007p3 = new C2007p(abstractC1974XArr, iArr2);
                    if (c1278d != null) {
                        c1278d.m3194b(c2004n0, c2004n1, c2007p3);
                    }
                }
            }
            return c2007p3;
        }
        if (z) {
            if (c2007p4 instanceof C2020w) {
                return c2007p4;
            }
            if (c2007p5 instanceof C2020w) {
                return c2007p5;
            }
        }
        if (z2) {
            C2004n0 c2004n2 = (C2004n0) c2007p4;
            c2007p4 = new C2007p(new AbstractC1974X[]{c2004n2.f4567c}, new int[]{c2004n2.f4568d});
        }
        if (c2007p5 instanceof C2004n0) {
            C2004n0 c2004n3 = (C2004n0) c2007p5;
            c2007p5 = new C2007p(new AbstractC1974X[]{c2004n3.f4567c}, new int[]{c2004n3.f4568d});
        }
        C2007p c2007p6 = (C2007p) c2007p4;
        C2007p c2007p7 = (C2007p) c2007p5;
        if (c1278d == null || ((c2007p = c1278d.m3193a(c2007p6, c2007p7)) == null && (c2007p = c1278d.m3193a(c2007p7, c2007p6)) == null)) {
            int[] iArr3 = c2007p6.f4572d;
            int length = iArr3.length;
            int[] iArr4 = c2007p7.f4572d;
            int[] iArrCopyOf = new int[length + iArr4.length];
            int length2 = iArr3.length + iArr4.length;
            AbstractC1974X[] abstractC1974XArr2 = new AbstractC1974X[length2];
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                iArr = c2007p6.f4572d;
                if (i5 >= iArr.length) {
                    break;
                }
                int[] iArr5 = c2007p7.f4572d;
                if (i6 >= iArr5.length) {
                    break;
                }
                AbstractC1974X abstractC1974X8 = c2007p6.f4571c[i5];
                AbstractC1974X abstractC1974X9 = c2007p7.f4571c[i6];
                if (iArr[i5] == iArr5[i6]) {
                    int i8 = iArr[i5];
                    boolean z3 = i8 == Integer.MAX_VALUE && abstractC1974X8 == null && abstractC1974X9 == null;
                    boolean z4 = (abstractC1974X8 == null || abstractC1974X9 == null || !abstractC1974X8.equals(abstractC1974X9)) ? false : true;
                    if (z3 || z4) {
                        abstractC1974XArr2[i7] = abstractC1974X8;
                        iArrCopyOf[i7] = i8;
                    } else {
                        abstractC1974XArr2[i7] = m4752g(abstractC1974X8, abstractC1974X9, z, c1278d);
                        iArrCopyOf[i7] = i8;
                    }
                    i5++;
                } else {
                    if (iArr[i5] < iArr5[i6]) {
                        abstractC1974XArr2[i7] = abstractC1974X8;
                        iArrCopyOf[i7] = iArr[i5];
                        i5++;
                    } else {
                        abstractC1974XArr2[i7] = abstractC1974X9;
                        iArrCopyOf[i7] = iArr5[i6];
                    }
                    i7++;
                }
                i6++;
                i7++;
            }
            if (i5 >= iArr.length) {
                while (true) {
                    int[] iArr6 = c2007p7.f4572d;
                    if (i6 >= iArr6.length) {
                        break;
                    }
                    abstractC1974XArr2[i7] = c2007p7.f4571c[i6];
                    iArrCopyOf[i7] = iArr6[i6];
                    i7++;
                    i6++;
                }
            } else {
                while (true) {
                    int[] iArr7 = c2007p6.f4572d;
                    if (i5 >= iArr7.length) {
                        break;
                    }
                    abstractC1974XArr2[i7] = c2007p6.f4571c[i5];
                    iArrCopyOf[i7] = iArr7[i5];
                    i7++;
                    i5++;
                }
            }
            if (i7 < length2) {
                if (i7 == 1) {
                    AbstractC1974X abstractC1974XM4790i2 = C2004n0.m4790i(abstractC1974XArr2[0], iArrCopyOf[0]);
                    if (c1278d != null) {
                        c1278d.m3194b(c2007p6, c2007p7, abstractC1974XM4790i2);
                    }
                    return abstractC1974XM4790i2;
                }
                abstractC1974XArr2 = (AbstractC1974X[]) Arrays.copyOf(abstractC1974XArr2, i7);
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i7);
            }
            c2007p = new C2007p(abstractC1974XArr2, iArrCopyOf);
            if (c2007p.equals(c2007p6)) {
                if (c1278d == null) {
                    return c2007p6;
                }
                c1278d.m3194b(c2007p6, c2007p7, c2007p6);
                return c2007p6;
            }
            if (c2007p.equals(c2007p7)) {
                if (c1278d != null) {
                    c1278d.m3194b(c2007p6, c2007p7, c2007p7);
                }
                return c2007p7;
            }
            HashMap map = new HashMap();
            for (AbstractC1974X abstractC1974X10 : abstractC1974XArr2) {
                if (!map.containsKey(abstractC1974X10)) {
                    map.put(abstractC1974X10, abstractC1974X10);
                }
            }
            for (int i9 = 0; i9 < abstractC1974XArr2.length; i9++) {
                abstractC1974XArr2[i9] = (AbstractC1974X) map.get(abstractC1974XArr2[i9]);
            }
            if (c1278d != null) {
                c1278d.m3194b(c2007p6, c2007p7, c2007p);
            }
        }
        return c2007p;
    }

    /* JADX INFO: renamed from: c */
    public abstract AbstractC1974X mo4753c(int i);

    /* JADX INFO: renamed from: d */
    public abstract int mo4754d(int i);

    /* JADX INFO: renamed from: e */
    public final boolean m4755e() {
        return mo4754d(mo4757h() - 1) == Integer.MAX_VALUE;
    }

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: f */
    public boolean mo4756f() {
        return this == f4509b;
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo4757h();

    public final int hashCode() {
        return this.f4510a;
    }
}
