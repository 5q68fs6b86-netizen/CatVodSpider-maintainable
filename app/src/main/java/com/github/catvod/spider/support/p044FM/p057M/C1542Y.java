package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p057M.Y */
/* JADX INFO: loaded from: classes.dex */
final class C1542Y extends AbstractC1545a0 {
    public C1542Y(AbstractC1532N abstractC1532N) {
        this.f3493a = abstractC1532N;
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        if (c1393m == c1393m2) {
            return false;
        }
        do {
            c1393m2 = c1393m2.m3476n0();
            if (c1393m2 == null) {
                return false;
            }
        } while (!this.f3493a.mo3766a(c1393m, c1393m2));
        return true;
    }

    public final String toString() {
        return String.format("%s ~ ", this.f3493a);
    }
}
