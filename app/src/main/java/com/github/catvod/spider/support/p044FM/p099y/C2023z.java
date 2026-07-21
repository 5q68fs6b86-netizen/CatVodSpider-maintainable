package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.z */
/* JADX INFO: loaded from: classes.dex */
public final class C2023z extends C1979b {

    /* JADX INFO: renamed from: f */
    private final C1955D f4583f;

    /* JADX INFO: renamed from: g */
    private final boolean f4584g;

    public C2023z(AbstractC2001m abstractC2001m, int i, AbstractC1974X abstractC1974X) {
        super(abstractC2001m, i, abstractC1974X, AbstractC2000l0.f4559a);
        this.f4584g = false;
        this.f4583f = null;
    }

    public C2023z(C2023z c2023z, AbstractC2001m abstractC2001m) {
        super(c2023z, abstractC2001m, c2023z.f4524c, c2023z.f4526e);
        this.f4583f = c2023z.f4583f;
        this.f4584g = m4793d(c2023z, abstractC2001m);
    }

    public C2023z(C2023z c2023z, AbstractC2001m abstractC2001m, C1955D c1955d) {
        super(c2023z, abstractC2001m, c2023z.f4524c, c2023z.f4526e);
        this.f4583f = c1955d;
        this.f4584g = m4793d(c2023z, abstractC2001m);
    }

    public C2023z(C2023z c2023z, AbstractC2001m abstractC2001m, AbstractC1974X abstractC1974X) {
        super(c2023z, abstractC2001m, abstractC1974X, c2023z.f4526e);
        this.f4583f = c2023z.f4583f;
        this.f4584g = m4793d(c2023z, abstractC2001m);
    }

    /* JADX INFO: renamed from: d */
    private static boolean m4793d(C2023z c2023z, AbstractC2001m abstractC2001m) {
        return c2023z.f4584g || ((abstractC2001m instanceof AbstractC2019v) && ((AbstractC2019v) abstractC2001m).f4580h);
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.C1979b
    /* JADX INFO: renamed from: a */
    public final boolean mo4765a(C1979b c1979b) {
        boolean zEquals = true;
        if (this == c1979b) {
            return true;
        }
        if (!(c1979b instanceof C2023z)) {
            return false;
        }
        C2023z c2023z = (C2023z) c1979b;
        if (this.f4584g != c2023z.f4584g) {
            return false;
        }
        C1955D c1955d = this.f4583f;
        C1955D c1955d2 = c2023z.f4583f;
        if (c1955d != null) {
            zEquals = c1955d.equals(c1955d2);
        } else if (c1955d2 != null) {
            zEquals = false;
        }
        if (zEquals) {
            return super.mo4765a(c1979b);
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final C1955D m4794e() {
        return this.f4583f;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m4795f() {
        return this.f4584g;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.C1979b
    public final int hashCode() {
        return C1286l.m3218c(C1286l.m3225j(C1286l.m3224i(C1286l.m3225j(C1286l.m3225j(C1286l.m3224i(C1286l.m3224i(7, this.f4522a.f4561b), this.f4523b), this.f4524c), this.f4526e), this.f4584g ? 1 : 0), this.f4583f), 6);
    }
}
