package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.M.T */
/* JADX INFO: loaded from: classes.dex */
final class C1537T extends AbstractC1545a0 {

    /* JADX INFO: renamed from: b */
    final C1546b f3489b;

    public C1537T(AbstractC1532N abstractC1532N) {
        this.f3493a = abstractC1532N;
        this.f3489b = new C1546b(abstractC1532N);
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        for (int i = 0; i < c1393m2.mo3411g(); i++) {
            AbstractC1399s abstractC1399sM3518f = c1393m2.m3518f(i);
            if ((abstractC1399sM3518f instanceof C1393m) && this.f3489b.m3780a(c1393m2, (C1393m) abstractC1399sM3518f) != null) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", this.f3493a);
    }
}
