package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import com.github.catvod.spider.support.p044FM.p098x.C1932g;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.k */
/* JADX INFO: loaded from: classes.dex */
final class C1485k extends EnumC1406B {
    C1485k() {
        super("InTemplate", 17, null);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e5  */
    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1406B
    /* JADX INFO: renamed from: d */
    final boolean mo3535d(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        C1507u c1507u = EnumC1406B.f3268d;
        C1513x c1513x = EnumC1406B.f3271g;
        int iM4675a = C1932g.m4675a(abstractC1436Q.f3337a);
        if (iM4675a == 0) {
            c1458b.m3716f0(abstractC1436Q, c1513x);
        } else {
            if (iM4675a == 1) {
                String str = ((C1430N) abstractC1436Q).f3327e;
                if (!C1380b.m3364c(str, C1404A.f3237K)) {
                    if (C1380b.m3364c(str, C1404A.f3238L)) {
                        c1458b.m3713d0();
                        C1517z c1517z = EnumC1406B.f3273i;
                        c1458b.m3719h0(c1517z);
                        c1458b.m3741u0(c1517z);
                        return c1458b.mo3717g(abstractC1436Q);
                    }
                    if (str.equals("col")) {
                        c1458b.m3713d0();
                        C1467e c1467e = EnumC1406B.f3276l;
                        c1458b.m3719h0(c1467e);
                        c1458b.m3741u0(c1467e);
                        return c1458b.mo3717g(abstractC1436Q);
                    }
                    if (str.equals("tr")) {
                        c1458b.m3713d0();
                        C1470f c1470f = EnumC1406B.f3277m;
                        c1458b.m3719h0(c1470f);
                        c1458b.m3741u0(c1470f);
                        return c1458b.mo3717g(abstractC1436Q);
                    }
                    if (!str.equals("td") && !str.equals("th")) {
                        c1458b.m3713d0();
                        c1458b.m3719h0(c1513x);
                        c1458b.m3741u0(c1513x);
                        return c1458b.mo3717g(abstractC1436Q);
                    }
                    c1458b.m3713d0();
                    C1473g c1473g = EnumC1406B.f3278n;
                    c1458b.m3719h0(c1473g);
                    c1458b.m3741u0(c1473g);
                    return c1458b.mo3717g(abstractC1436Q);
                }
            } else if (iM4675a != 2) {
                if (iM4675a != 3 && iM4675a != 4) {
                    if (iM4675a != 5 || !c1458b.m3707Y("template")) {
                        return true;
                    }
                    c1458b.m3738t(this);
                    c1458b.m3711c0("template");
                    c1458b.m3727n();
                    c1458b.m3713d0();
                    c1458b.m3729o0();
                    if (c1458b.m3737s0() == EnumC1406B.f3282r || c1458b.m3739t0() >= 12) {
                        return true;
                    }
                    return c1458b.mo3717g(abstractC1436Q);
                }
                c1458b.m3716f0(abstractC1436Q, c1513x);
            } else if (!((C1428M) abstractC1436Q).f3327e.equals("template")) {
                c1458b.m3738t(this);
                return false;
            }
            c1458b.m3716f0(abstractC1436Q, c1507u);
        }
        return true;
    }
}
