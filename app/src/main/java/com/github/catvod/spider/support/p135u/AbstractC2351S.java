package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p134t.C2332y;
import com.github.catvod.spider.support.p137w.C2401c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.u.S */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2351S {

    /* JADX INFO: renamed from: b */
    public static final C2387s f5827b = new C2387s();

    /* JADX INFO: renamed from: a */
    public final int f5828a;

    protected AbstractC2351S(int i) {
        this.f5828a = i;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.i>] */
    /* JADX INFO: renamed from: a */
    public static AbstractC2351S m6329a(C2359a c2359a, C2332y c2332y) {
        if (c2332y == null) {
            c2332y = C2332y.f5799c;
        }
        C2332y c2332y2 = c2332y.f5800a;
        return (c2332y2 == null || c2332y == C2332y.f5799c) ? f5827b : C2366d0.m6364i(m6329a(c2359a, c2332y2), ((C2360a0) ((AbstractC2375i) c2359a.f5835a.get(c2332y.f5801b)).m6374d(0)).f5845c.f5884b);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.HashMap, java.util.Map<com.github.catvod.spider.support.u.S, com.github.catvod.spider.support.u.S>] */
    /* JADX INFO: renamed from: b */
    public static AbstractC2351S m6330b(AbstractC2351S abstractC2351S, C2352T c2352t, IdentityHashMap<AbstractC2351S, AbstractC2351S> identityHashMap) {
        if (abstractC2351S.mo6335f()) {
            return abstractC2351S;
        }
        AbstractC2351S abstractC2351S2 = identityHashMap.get(abstractC2351S);
        if (abstractC2351S2 != null) {
            return abstractC2351S2;
        }
        AbstractC2351S abstractC2351S3 = (AbstractC2351S) c2352t.f5829a.get(abstractC2351S);
        if (abstractC2351S3 != null) {
            identityHashMap.put(abstractC2351S, abstractC2351S3);
            return abstractC2351S3;
        }
        AbstractC2351S[] abstractC2351SArr = new AbstractC2351S[abstractC2351S.mo6336h()];
        boolean z = false;
        for (int i = 0; i < abstractC2351SArr.length; i++) {
            AbstractC2351S abstractC2351SM6330b = m6330b(abstractC2351S.mo6332c(i), c2352t, identityHashMap);
            if (z || abstractC2351SM6330b != abstractC2351S.mo6332c(i)) {
                if (!z) {
                    abstractC2351SArr = new AbstractC2351S[abstractC2351S.mo6336h()];
                    for (int i2 = 0; i2 < abstractC2351S.mo6336h(); i2++) {
                        abstractC2351SArr[i2] = abstractC2351S.mo6332c(i2);
                    }
                    z = true;
                }
                abstractC2351SArr[i] = abstractC2351SM6330b;
            }
        }
        if (!z) {
            c2352t.m6337a(abstractC2351S);
            identityHashMap.put(abstractC2351S, abstractC2351S);
            return abstractC2351S;
        }
        AbstractC2351S abstractC2351SM6364i = abstractC2351SArr.length == 0 ? f5827b : abstractC2351SArr.length == 1 ? C2366d0.m6364i(abstractC2351SArr[0], abstractC2351S.mo6333d(0)) : new C2380l(abstractC2351SArr, ((C2380l) abstractC2351S).f5893d);
        c2352t.m6337a(abstractC2351SM6364i);
        identityHashMap.put(abstractC2351SM6364i, abstractC2351SM6364i);
        identityHashMap.put(abstractC2351S, abstractC2351SM6364i);
        return abstractC2351SM6364i;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007b  */
    /* JADX WARN: Code duplicated, block: B:63:0x00dc A[PHI: r4
      0x00dc: PHI (r4v21 com.github.catvod.spider.support.u.S) = (r4v20 com.github.catvod.spider.support.u.S), (r4v22 com.github.catvod.spider.support.u.S) binds: [B:68:0x0104, B:62:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: g */
    public static AbstractC2351S m6331g(AbstractC2351S abstractC2351S, AbstractC2351S abstractC2351S2, boolean z, C2401c<AbstractC2351S, AbstractC2351S, AbstractC2351S> c2401c) {
        int[] iArr;
        AbstractC2351S c2380l;
        AbstractC2351S c2380l2;
        AbstractC2351S c2380l3;
        AbstractC2351S abstractC2351S3;
        AbstractC2351S c2380l4 = abstractC2351S;
        AbstractC2351S c2380l5 = abstractC2351S2;
        if (c2380l4 == c2380l5 || abstractC2351S.equals(abstractC2351S2)) {
            return c2380l4;
        }
        boolean z2 = c2380l4 instanceof C2366d0;
        if (z2 && (c2380l5 instanceof C2366d0)) {
            C2366d0 c2366d0 = (C2366d0) c2380l4;
            C2366d0 c2366d1 = (C2366d0) c2380l5;
            if (c2401c == null || ((c2380l3 = c2401c.m6403a(c2366d0, c2366d1)) == null && (c2380l3 = c2401c.m6403a(c2366d1, c2366d0)) == null)) {
                AbstractC2351S abstractC2351S4 = null;
                AbstractC2351S abstractC2351S5 = f5827b;
                if (z) {
                    if (c2366d0 != abstractC2351S5 && c2366d1 != abstractC2351S5) {
                        abstractC2351S5 = null;
                    }
                } else if (c2366d0 != abstractC2351S5 || c2366d1 != abstractC2351S5) {
                    if (c2366d0 == abstractC2351S5) {
                        c2380l2 = new C2380l(new AbstractC2351S[]{c2366d1.f5870c, null}, new int[]{c2366d1.f5871d, Integer.MAX_VALUE});
                    } else if (c2366d1 == abstractC2351S5) {
                        c2380l2 = new C2380l(new AbstractC2351S[]{c2366d0.f5870c, null}, new int[]{c2366d0.f5871d, Integer.MAX_VALUE});
                    } else {
                        abstractC2351S5 = null;
                    }
                    abstractC2351S5 = c2380l2;
                }
                if (abstractC2351S5 != null) {
                    if (c2401c != null) {
                        c2401c.m6404b(c2366d0, c2366d1, abstractC2351S5);
                    }
                    return abstractC2351S5;
                }
                if (c2366d0.f5871d == c2366d1.f5871d) {
                    AbstractC2351S abstractC2351SM6331g = m6331g(c2366d0.f5870c, c2366d1.f5870c, z, c2401c);
                    if (abstractC2351SM6331g == c2366d0.f5870c) {
                        return c2366d0;
                    }
                    if (abstractC2351SM6331g == c2366d1.f5870c) {
                        return c2366d1;
                    }
                    AbstractC2351S abstractC2351SM6364i = C2366d0.m6364i(abstractC2351SM6331g, c2366d0.f5871d);
                    if (c2401c != null) {
                        c2401c.m6404b(c2366d0, c2366d1, abstractC2351SM6364i);
                    }
                    return abstractC2351SM6364i;
                }
                if (c2366d0 == c2366d1 || ((abstractC2351S3 = c2366d0.f5870c) != null && abstractC2351S3.equals(c2366d1.f5870c))) {
                    abstractC2351S4 = c2366d0.f5870c;
                }
                int[] iArr2 = new int[2];
                if (abstractC2351S4 != null) {
                    int i = c2366d0.f5871d;
                    iArr2[0] = i;
                    int i2 = c2366d1.f5871d;
                    iArr2[1] = i2;
                    if (i > i2) {
                        iArr2[0] = i2;
                        iArr2[1] = i;
                    }
                    c2380l3 = new C2380l(new AbstractC2351S[]{abstractC2351S4, abstractC2351S4}, iArr2);
                    if (c2401c != null) {
                        c2401c.m6404b(c2366d0, c2366d1, c2380l3);
                    }
                } else {
                    int i3 = c2366d0.f5871d;
                    iArr2[0] = i3;
                    int i4 = c2366d1.f5871d;
                    iArr2[1] = i4;
                    AbstractC2351S abstractC2351S6 = c2366d0.f5870c;
                    AbstractC2351S abstractC2351S7 = c2366d1.f5870c;
                    AbstractC2351S[] abstractC2351SArr = {abstractC2351S6, abstractC2351S7};
                    if (i3 > i4) {
                        iArr2[0] = i4;
                        iArr2[1] = i3;
                        abstractC2351SArr = new AbstractC2351S[]{abstractC2351S7, abstractC2351S6};
                    }
                    c2380l3 = new C2380l(abstractC2351SArr, iArr2);
                    if (c2401c != null) {
                        c2401c.m6404b(c2366d0, c2366d1, c2380l3);
                    }
                }
            }
            return c2380l3;
        }
        if (z) {
            if (c2380l4 instanceof C2387s) {
                return c2380l4;
            }
            if (c2380l5 instanceof C2387s) {
                return c2380l5;
            }
        }
        if (z2) {
            C2366d0 c2366d2 = (C2366d0) c2380l4;
            c2380l4 = new C2380l(new AbstractC2351S[]{c2366d2.f5870c}, new int[]{c2366d2.f5871d});
        }
        if (c2380l5 instanceof C2366d0) {
            C2366d0 c2366d3 = (C2366d0) c2380l5;
            c2380l5 = new C2380l(new AbstractC2351S[]{c2366d3.f5870c}, new int[]{c2366d3.f5871d});
        }
        C2380l c2380l6 = (C2380l) c2380l4;
        C2380l c2380l7 = (C2380l) c2380l5;
        if (c2401c == null || ((c2380l = c2401c.m6403a(c2380l6, c2380l7)) == null && (c2380l = c2401c.m6403a(c2380l7, c2380l6)) == null)) {
            int[] iArr3 = c2380l6.f5893d;
            int length = iArr3.length;
            int[] iArr4 = c2380l7.f5893d;
            int[] iArrCopyOf = new int[length + iArr4.length];
            int length2 = iArr3.length + iArr4.length;
            AbstractC2351S[] abstractC2351SArr2 = new AbstractC2351S[length2];
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            while (true) {
                iArr = c2380l6.f5893d;
                if (i5 >= iArr.length) {
                    break;
                }
                int[] iArr5 = c2380l7.f5893d;
                if (i6 >= iArr5.length) {
                    break;
                }
                AbstractC2351S abstractC2351S8 = c2380l6.f5892c[i5];
                AbstractC2351S abstractC2351S9 = c2380l7.f5892c[i6];
                if (iArr[i5] == iArr5[i6]) {
                    int i8 = iArr[i5];
                    boolean z3 = i8 == Integer.MAX_VALUE && abstractC2351S8 == null && abstractC2351S9 == null;
                    boolean z4 = (abstractC2351S8 == null || abstractC2351S9 == null || !abstractC2351S8.equals(abstractC2351S9)) ? false : true;
                    if (z3 || z4) {
                        abstractC2351SArr2[i7] = abstractC2351S8;
                        iArrCopyOf[i7] = i8;
                    } else {
                        abstractC2351SArr2[i7] = m6331g(abstractC2351S8, abstractC2351S9, z, c2401c);
                        iArrCopyOf[i7] = i8;
                    }
                    i5++;
                } else {
                    if (iArr[i5] < iArr5[i6]) {
                        abstractC2351SArr2[i7] = abstractC2351S8;
                        iArrCopyOf[i7] = iArr[i5];
                        i5++;
                    } else {
                        abstractC2351SArr2[i7] = abstractC2351S9;
                        iArrCopyOf[i7] = iArr5[i6];
                    }
                    i7++;
                }
                i6++;
                i7++;
            }
            if (i5 >= iArr.length) {
                while (true) {
                    int[] iArr6 = c2380l7.f5893d;
                    if (i6 >= iArr6.length) {
                        break;
                    }
                    abstractC2351SArr2[i7] = c2380l7.f5892c[i6];
                    iArrCopyOf[i7] = iArr6[i6];
                    i7++;
                    i6++;
                }
            } else {
                while (true) {
                    int[] iArr7 = c2380l6.f5893d;
                    if (i5 >= iArr7.length) {
                        break;
                    }
                    abstractC2351SArr2[i7] = c2380l6.f5892c[i5];
                    iArrCopyOf[i7] = iArr7[i5];
                    i7++;
                    i5++;
                }
            }
            if (i7 < length2) {
                if (i7 == 1) {
                    AbstractC2351S abstractC2351SM6364i2 = C2366d0.m6364i(abstractC2351SArr2[0], iArrCopyOf[0]);
                    if (c2401c != null) {
                        c2401c.m6404b(c2380l6, c2380l7, abstractC2351SM6364i2);
                    }
                    return abstractC2351SM6364i2;
                }
                abstractC2351SArr2 = (AbstractC2351S[]) Arrays.copyOf(abstractC2351SArr2, i7);
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i7);
            }
            c2380l = new C2380l(abstractC2351SArr2, iArrCopyOf);
            if (c2380l.equals(c2380l6)) {
                if (c2401c == null) {
                    return c2380l6;
                }
                c2401c.m6404b(c2380l6, c2380l7, c2380l6);
                return c2380l6;
            }
            if (c2380l.equals(c2380l7)) {
                if (c2401c != null) {
                    c2401c.m6404b(c2380l6, c2380l7, c2380l7);
                }
                return c2380l7;
            }
            HashMap map = new HashMap();
            for (AbstractC2351S abstractC2351S10 : abstractC2351SArr2) {
                if (!map.containsKey(abstractC2351S10)) {
                    map.put(abstractC2351S10, abstractC2351S10);
                }
            }
            for (int i9 = 0; i9 < abstractC2351SArr2.length; i9++) {
                abstractC2351SArr2[i9] = (AbstractC2351S) map.get(abstractC2351SArr2[i9]);
            }
            if (c2401c != null) {
                c2401c.m6404b(c2380l6, c2380l7, c2380l);
            }
        }
        return c2380l;
    }

    /* JADX INFO: renamed from: c */
    public abstract AbstractC2351S mo6332c(int i);

    /* JADX INFO: renamed from: d */
    public abstract int mo6333d(int i);

    /* JADX INFO: renamed from: e */
    public final boolean m6334e() {
        return mo6333d(mo6336h() - 1) == Integer.MAX_VALUE;
    }

    public abstract boolean equals(Object obj);

    /* JADX INFO: renamed from: f */
    public boolean mo6335f() {
        return this == f5827b;
    }

    /* JADX INFO: renamed from: h */
    public abstract int mo6336h();

    public final int hashCode() {
        return this.f5828a;
    }
}
