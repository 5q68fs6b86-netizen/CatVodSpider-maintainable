package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p054J.C1380b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.h */
/* JADX INFO: loaded from: classes.dex */
final class C1476h extends EnumC1406B {
    C1476h() {
        super("InCell", 14, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1406B
    /* JADX INFO: renamed from: d */
    final boolean mo3535d(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        C1473g c1473g = EnumC1406B.f3278n;
        C1513x c1513x = EnumC1406B.f3271g;
        if (!abstractC1436Q.m3597f()) {
            if (!abstractC1436Q.m3598g() || !C1380b.m3364c(((C1430N) abstractC1436Q).f3327e, C1404A.f3263y)) {
                return c1458b.m3716f0(abstractC1436Q, c1513x);
            }
            if (c1458b.m3692I("td") || c1458b.m3692I("th")) {
                c1458b.m3758h(c1458b.m3692I("td") ? "td" : "th");
                return c1458b.mo3717g(abstractC1436Q);
            }
            c1458b.m3738t(this);
            return false;
        }
        String str = ((C1428M) abstractC1436Q).f3327e;
        if (!C1380b.m3364c(str, C1404A.f3260v)) {
            if (C1380b.m3364c(str, C1404A.f3261w)) {
                c1458b.m3738t(this);
                return false;
            }
            if (!C1380b.m3364c(str, C1404A.f3262x)) {
                return c1458b.m3716f0(abstractC1436Q, c1513x);
            }
            if (c1458b.m3692I(str)) {
                c1458b.m3758h(c1458b.m3692I("td") ? "td" : "th");
                return c1458b.mo3717g(abstractC1436Q);
            }
            c1458b.m3738t(this);
            return false;
        }
        if (!c1458b.m3692I(str)) {
            c1458b.m3738t(this);
            c1458b.m3741u0(c1473g);
            return false;
        }
        c1458b.m3744x(false);
        if (!c1458b.m3756b(str)) {
            c1458b.m3738t(this);
        }
        c1458b.m3711c0(str);
        c1458b.m3727n();
        c1458b.m3741u0(c1473g);
        return true;
    }
}
