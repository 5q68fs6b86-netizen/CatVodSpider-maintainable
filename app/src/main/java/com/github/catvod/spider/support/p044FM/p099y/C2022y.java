package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1285k;
import java.util.BitSet;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.y */
/* JADX INFO: loaded from: classes.dex */
public final class C2022y {

    /* JADX INFO: renamed from: a */
    public final C1977a f4582a;

    public C2022y(C1977a c1977a) {
        this.f4582a = c1977a;
    }

    /* JADX WARN: Type inference failed for: r1v23, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.y.m>] */
    /* JADX INFO: renamed from: a */
    protected final void m4792a(AbstractC2001m abstractC2001m, AbstractC1974X abstractC1974X, C1285k c1285k, Set set, BitSet bitSet) {
        if (set.add(new C1979b(abstractC2001m, 0, abstractC1974X, AbstractC2000l0.f4559a))) {
            if (abstractC2001m == null) {
                if (abstractC1974X == null) {
                    c1285k.m3206a(-2);
                    return;
                } else if (abstractC1974X.mo4756f()) {
                    c1285k.m3206a(-1);
                    return;
                }
            }
            if (abstractC2001m instanceof C1986e0) {
                if (abstractC1974X == null) {
                    c1285k.m3206a(-2);
                    return;
                }
                if (abstractC1974X.mo4756f()) {
                    c1285k.m3206a(-1);
                    return;
                }
                if (abstractC1974X != AbstractC1974X.f4509b) {
                    boolean z = bitSet.get(abstractC2001m.f4562c);
                    try {
                        bitSet.clear(abstractC2001m.f4562c);
                        for (int i = 0; i < abstractC1974X.mo4757h(); i++) {
                            m4792a((AbstractC2001m) this.f4582a.f4513a.get(abstractC1974X.mo4754d(i)), abstractC1974X.mo4753c(i), c1285k, set, bitSet);
                        }
                        if (z) {
                            bitSet.set(abstractC2001m.f4562c);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        if (z) {
                            bitSet.set(abstractC2001m.f4562c);
                        }
                        throw th;
                    }
                }
            }
            int iM4788b = abstractC2001m.m4788b();
            for (int i2 = 0; i2 < iM4788b; i2++) {
                AbstractC2016t0 abstractC2016t0M4789d = abstractC2001m.m4789d(i2);
                if (abstractC2016t0M4789d.getClass() == C1988f0.class) {
                    C1988f0 c1988f0 = (C1988f0) abstractC2016t0M4789d;
                    if (bitSet.get(c1988f0.f4577a.f4562c)) {
                        continue;
                    } else {
                        C2004n0 c2004n0M4790i = C2004n0.m4790i(abstractC1974X, c1988f0.f4542c.f4561b);
                        try {
                            bitSet.set(((C1988f0) abstractC2016t0M4789d).f4577a.f4562c);
                            m4792a(abstractC2016t0M4789d.f4577a, c2004n0M4790i, c1285k, set, bitSet);
                            bitSet.clear(c1988f0.f4577a.f4562c);
                        } catch (Throwable th2) {
                            bitSet.clear(c1988f0.f4577a.f4562c);
                            throw th2;
                        }
                    }
                } else if ((abstractC2016t0M4789d instanceof AbstractC2003n) || abstractC2016t0M4789d.mo4749b()) {
                    m4792a(abstractC2016t0M4789d.f4577a, abstractC1974X, c1285k, set, bitSet);
                } else if (abstractC2016t0M4789d.getClass() == C2018u0.class) {
                    c1285k.m3208c(C1285k.m3204g(1, this.f4582a.f4518f));
                } else {
                    C1285k c1285kMo4771c = abstractC2016t0M4789d.mo4771c();
                    if (c1285kMo4771c != null) {
                        if (abstractC2016t0M4789d instanceof C1967P) {
                            C1285k c1285kM3204g = C1285k.m3204g(1, this.f4582a.f4518f);
                            if (c1285kM3204g.m3211f()) {
                                c1285kMo4771c = null;
                            } else if (c1285kMo4771c.m3211f()) {
                                c1285kMo4771c = new C1285k(new int[0]);
                                c1285kMo4771c.m3208c(c1285kM3204g);
                            } else {
                                c1285kMo4771c = C1285k.m3205k(c1285kM3204g, c1285kMo4771c);
                            }
                        }
                        c1285k.m3208c(c1285kMo4771c);
                    }
                }
            }
        }
    }
}
