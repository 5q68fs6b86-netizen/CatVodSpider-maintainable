package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.C1388h;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.M.C */
/* JADX INFO: loaded from: classes.dex */
public final class C1521C extends AbstractC1532N {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3479a;

    public /* synthetic */ C1521C(int i) {
        this.f3479a = i;
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        switch (this.f3479a) {
            case 0:
                C1393m c1393mM3473k0 = c1393m2.m3473k0();
                return (c1393mM3473k0 == null || (c1393mM3473k0 instanceof C1388h) || c1393m2.m3458Y() != 0) ? false : true;
            default:
                C1393m c1393mM3473k1 = c1393m2.m3473k0();
                return (c1393mM3473k1 == null || (c1393mM3473k1 instanceof C1388h) || !c1393m2.m3481r0().isEmpty()) ? false : true;
        }
    }

    public final String toString() {
        switch (this.f3479a) {
            case 0:
                return ":first-child";
            default:
                return ":only-child";
        }
    }
}
