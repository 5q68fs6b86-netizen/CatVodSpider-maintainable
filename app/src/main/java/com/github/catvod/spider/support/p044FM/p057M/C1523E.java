package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.C1388h;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.M.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1523E extends AbstractC1532N {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3480a;

    public /* synthetic */ C1523E(int i) {
        this.f3480a = i;
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        switch (this.f3480a) {
            case 0:
                C1393m c1393mM3473k0 = c1393m2.m3473k0();
                return (c1393mM3473k0 == null || (c1393mM3473k0 instanceof C1388h) || c1393m2.m3458Y() != c1393mM3473k0.m3456V().size() - 1) ? false : true;
            default:
                if (c1393m instanceof C1388h) {
                    c1393m = c1393m.m3454T();
                }
                return c1393m2 == c1393m;
        }
    }

    public final String toString() {
        switch (this.f3480a) {
            case 0:
                return ":last-child";
            default:
                return ":root";
        }
    }
}
