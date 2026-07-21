package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p057M.V */
/* JADX INFO: loaded from: classes.dex */
final class C1539V extends AbstractC1545a0 {
    public C1539V(AbstractC1532N abstractC1532N) {
        this.f3493a = abstractC1532N;
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        C1393m c1393mM3476n0;
        return (c1393m == c1393m2 || (c1393mM3476n0 = c1393m2.m3476n0()) == null || !this.f3493a.mo3766a(c1393m, c1393mM3476n0)) ? false : true;
    }

    public final String toString() {
        return String.format("%s + ", this.f3493a);
    }
}
