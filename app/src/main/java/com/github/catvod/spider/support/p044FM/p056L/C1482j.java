package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p054J.C1380b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.j */
/* JADX INFO: loaded from: classes.dex */
final class C1482j extends EnumC1406B {
    C1482j() {
        super("InSelectInTable", 16, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1406B
    /* JADX INFO: renamed from: d */
    final boolean mo3535d(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        if (abstractC1436Q.m3598g() && C1380b.m3364c(((C1430N) abstractC1436Q).f3327e, C1404A.f3233G)) {
            c1458b.m3738t(this);
            c1458b.m3711c0("select");
            c1458b.m3729o0();
            return c1458b.mo3717g(abstractC1436Q);
        }
        if (abstractC1436Q.m3597f()) {
            C1428M c1428m = (C1428M) abstractC1436Q;
            if (C1380b.m3364c(c1428m.f3327e, C1404A.f3233G)) {
                c1458b.m3738t(this);
                if (!c1458b.m3692I(c1428m.f3327e)) {
                    return false;
                }
                c1458b.m3711c0("select");
                c1458b.m3729o0();
                return c1458b.mo3717g(abstractC1436Q);
            }
        }
        return c1458b.m3716f0(abstractC1436Q, EnumC1406B.f3280p);
    }
}
