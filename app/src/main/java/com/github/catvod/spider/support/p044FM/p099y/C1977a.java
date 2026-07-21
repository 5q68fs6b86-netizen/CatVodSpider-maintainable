package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1285k;
import com.github.catvod.spider.support.p044FM.p098x.C1918D;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1977a {

    /* JADX INFO: renamed from: a */
    public final List<AbstractC2001m> f4513a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List<AbstractC2019v> f4514b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public C1984d0[] f4515c;

    /* JADX INFO: renamed from: d */
    public C1986e0[] f4516d;

    /* JADX INFO: renamed from: e */
    public final int f4517e;

    /* JADX INFO: renamed from: f */
    public final int f4518f;

    /* JADX INFO: renamed from: g */
    public int[] f4519g;

    /* JADX INFO: renamed from: h */
    public InterfaceC1954C[] f4520h;

    /* JADX INFO: renamed from: i */
    public final List<C2012r0> f4521i;

    public C1977a(int i, int i2) {
        new LinkedHashMap();
        this.f4521i = new ArrayList();
        this.f4517e = i;
        this.f4518f = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.y.m>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.y.m>] */
    /* JADX INFO: renamed from: a */
    public final void m4759a(AbstractC2001m abstractC2001m) {
        if (abstractC2001m != null) {
            abstractC2001m.f4560a = this;
            abstractC2001m.f4561b = this.f4513a.size();
        }
        this.f4513a.add(abstractC2001m);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.y.v>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.y.v>] */
    /* JADX INFO: renamed from: b */
    public final AbstractC2019v m4760b(int i) {
        if (this.f4514b.isEmpty()) {
            return null;
        }
        return (AbstractC2019v) this.f4514b.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.y.m>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.y.m>] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.y.m>] */
    /* JADX INFO: renamed from: c */
    public final C1285k m4761c(int i, C1918D c1918d) {
        if (i < 0 || i >= this.f4513a.size()) {
            throw new IllegalArgumentException("Invalid state number.");
        }
        C1285k c1285kM4763e = m4763e((AbstractC2001m) this.f4513a.get(i));
        if (!c1285kM4763e.m3209d(-2)) {
            return c1285kM4763e;
        }
        C1285k c1285k = new C1285k(new int[0]);
        c1285k.m3208c(c1285kM4763e);
        c1285k.m3212h();
        while (c1918d != null && c1918d.f4395b >= 0 && c1285kM4763e.m3209d(-2)) {
            c1285kM4763e = m4763e(((C1988f0) ((AbstractC2001m) this.f4513a.get(c1918d.f4395b)).m4789d(0)).f4542c);
            c1285k.m3208c(c1285kM4763e);
            c1285k.m3212h();
            c1918d = c1918d.f4394a;
        }
        if (c1285kM4763e.m3209d(-2)) {
            c1285k.m3206a(-1);
        }
        return c1285k;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.y.v>] */
    /* JADX INFO: renamed from: d */
    public final int m4762d() {
        return this.f4514b.size();
    }

    /* JADX INFO: renamed from: e */
    public final C1285k m4763e(AbstractC2001m abstractC2001m) {
        C1285k c1285k = abstractC2001m.f4565f;
        if (c1285k != null) {
            return c1285k;
        }
        C1285k c1285kM4764f = m4764f(abstractC2001m, null);
        abstractC2001m.f4565f = c1285kM4764f;
        c1285kM4764f.m3213i();
        return abstractC2001m.f4565f;
    }

    /* JADX INFO: renamed from: f */
    public final C1285k m4764f(AbstractC2001m abstractC2001m, C1918D c1918d) {
        C2022y c2022y = new C2022y(this);
        C1285k c1285k = new C1285k(new int[0]);
        c2022y.m4792a(abstractC2001m, c1918d != null ? AbstractC1974X.m4750a(abstractC2001m.f4560a, c1918d) : null, c1285k, new HashSet(), new BitSet());
        return c1285k;
    }
}
