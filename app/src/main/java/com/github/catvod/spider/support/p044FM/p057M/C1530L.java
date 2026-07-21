package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p055K.C1401u;
import com.github.catvod.spider.support.p044FM.p055K.C1402v;
import com.github.catvod.spider.support.p044FM.p056L.C1412E;
import com.github.catvod.spider.support.p044FM.p056L.C1416G;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.M.L */
/* JADX INFO: loaded from: classes.dex */
public final class C1530L extends AbstractC1532N {
    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        if (c1393m2 instanceof C1401u) {
            return true;
        }
        for (C1402v c1402v : c1393m2.m3485w0()) {
            C1401u c1401u = new C1401u(C1416G.m3552m(c1393m2.m3483t0(), C1412E.f3295d), c1393m2.mo3465e(), c1393m2.mo3463d());
            c1402v.m3514D(c1401u);
            c1401u.m3448L(c1402v);
        }
        return false;
    }

    public final String toString() {
        return ":matchText";
    }
}
