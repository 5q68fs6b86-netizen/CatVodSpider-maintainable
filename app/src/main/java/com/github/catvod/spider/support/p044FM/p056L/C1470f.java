package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import com.github.catvod.spider.support.p044FM.p098x.C1932g;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.f */
/* JADX INFO: loaded from: classes.dex */
static final class C1470f extends EnumC1406B {
    C1470f() {
        super("InTableBody", 12, null);
    }

    /* JADX INFO: renamed from: e */
    private boolean m3748e(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        if (!c1458b.m3692I("tbody") && !c1458b.m3692I("thead") && !c1458b.m3689E("tfoot", null)) {
            c1458b.m3738t(this);
            return false;
        }
        c1458b.m3730p();
        c1458b.m3758h(c1458b.m3755a().m3469i0());
        return c1458b.mo3717g(abstractC1436Q);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1406B
    /* JADX INFO: renamed from: d */
    final boolean mo3535d(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        EnumC1406B enumC1406B = EnumC1406B.f3273i;
        int iM4675a = C1932g.m4675a(abstractC1436Q.f3337a);
        if (iM4675a == 1) {
            C1430N c1430n = (C1430N) abstractC1436Q;
            String str = c1430n.f3327e;
            if (!str.equals("tr")) {
                if (!C1380b.m3364c(str, C1404A.f3260v)) {
                    return C1380b.m3364c(str, C1404A.f3228B) ? m3748e(abstractC1436Q, c1458b) : c1458b.m3716f0(abstractC1436Q, enumC1406B);
                }
                c1458b.m3738t(this);
                c1458b.m3760j("tr");
                return c1458b.mo3717g(c1430n);
            }
            c1458b.m3730p();
            c1458b.m3693J(c1430n);
            c1458b.m3741u0(EnumC1406B.f3278n);
        } else {
            if (iM4675a != 2) {
                return c1458b.m3716f0(abstractC1436Q, enumC1406B);
            }
            String str2 = ((C1428M) abstractC1436Q).f3327e;
            if (!C1380b.m3364c(str2, C1404A.f3234H)) {
                if (str2.equals("table")) {
                    return m3748e(abstractC1436Q, c1458b);
                }
                if (!C1380b.m3364c(str2, C1404A.f3229C)) {
                    return c1458b.m3716f0(abstractC1436Q, enumC1406B);
                }
                c1458b.m3738t(this);
                return false;
            }
            if (!c1458b.m3692I(str2)) {
                c1458b.m3738t(this);
                return false;
            }
            c1458b.m3730p();
            c1458b.m3709b0();
            c1458b.m3741u0(enumC1406B);
        }
        return true;
    }
}
