package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.M.W */
/* JADX INFO: loaded from: classes.dex */
final class C1540W extends AbstractC1545a0 {
    public C1540W(AbstractC1532N abstractC1532N) {
        this.f3493a = abstractC1532N;
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        return !this.f3493a.mo3766a(c1393m, c1393m2);
    }

    public final String toString() {
        return String.format(":not(%s)", this.f3493a);
    }
}
