package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p054J.C1380b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.g */
/* JADX INFO: loaded from: classes.dex */
final class C1473g extends EnumC1406B {
    C1473g() {
        super("InRow", 13, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1406B
    /* JADX INFO: renamed from: d */
    final boolean mo3535d(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        C1470f c1470f = EnumC1406B.f3277m;
        C1517z c1517z = EnumC1406B.f3273i;
        if (abstractC1436Q.m3598g()) {
            C1430N c1430n = (C1430N) abstractC1436Q;
            String str = c1430n.f3327e;
            if (C1380b.m3364c(str, C1404A.f3260v)) {
                c1458b.m3734r();
                c1458b.m3693J(c1430n);
                c1458b.m3741u0(EnumC1406B.f3279o);
                c1458b.m3699P();
                return true;
            }
            if (!C1380b.m3364c(str, C1404A.f3230D)) {
                return c1458b.m3716f0(abstractC1436Q, c1517z);
            }
            if (c1458b.m3758h("tr")) {
                return c1458b.mo3717g(abstractC1436Q);
            }
            return false;
        }
        if (!abstractC1436Q.m3597f()) {
            return c1458b.m3716f0(abstractC1436Q, c1517z);
        }
        String str2 = ((C1428M) abstractC1436Q).f3327e;
        if (str2.equals("tr")) {
            if (!c1458b.m3692I(str2)) {
                c1458b.m3738t(this);
                return false;
            }
        } else {
            if (str2.equals("table")) {
                if (c1458b.m3758h("tr")) {
                    return c1458b.mo3717g(abstractC1436Q);
                }
                return false;
            }
            if (!C1380b.m3364c(str2, C1404A.f3257s)) {
                if (!C1380b.m3364c(str2, C1404A.f3231E)) {
                    return c1458b.m3716f0(abstractC1436Q, c1517z);
                }
                c1458b.m3738t(this);
                return false;
            }
            if (!c1458b.m3692I(str2) || !c1458b.m3692I("tr")) {
                c1458b.m3738t(this);
                return false;
            }
        }
        c1458b.m3734r();
        c1458b.m3709b0();
        c1458b.m3741u0(c1470f);
        return true;
    }
}
