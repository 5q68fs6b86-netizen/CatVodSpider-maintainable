package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p054J.C1380b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.z */
/* JADX INFO: loaded from: classes.dex */
final class C1517z extends EnumC1406B {
    C1517z() {
        super("InTable", 8, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1406B
    /* JADX INFO: renamed from: d */
    final boolean mo3535d(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        EnumC1406B enumC1406B;
        C1507u c1507u = EnumC1406B.f3268d;
        if (!abstractC1436Q.m3593b() || !C1380b.m3364c(c1458b.m3755a().m3469i0(), C1404A.f3227A)) {
            if (abstractC1436Q.m3594c()) {
                c1458b.m3695L((C1422J) abstractC1436Q);
                return true;
            }
            if (abstractC1436Q.m3595d()) {
                c1458b.m3738t(this);
                return false;
            }
            if (!abstractC1436Q.m3598g()) {
                if (!abstractC1436Q.m3597f()) {
                    if (!abstractC1436Q.m3596e()) {
                        m3765e(abstractC1436Q, c1458b);
                        return true;
                    }
                    if (c1458b.m3756b("html")) {
                        c1458b.m3738t(this);
                    }
                    return true;
                }
                String str = ((C1428M) abstractC1436Q).f3327e;
                if (str.equals("table")) {
                    if (!c1458b.m3692I(str)) {
                        c1458b.m3738t(this);
                        return false;
                    }
                    c1458b.m3711c0("table");
                    c1458b.m3729o0();
                } else {
                    if (C1380b.m3364c(str, C1404A.f3264z)) {
                        c1458b.m3738t(this);
                        return false;
                    }
                    if (!str.equals("template")) {
                        m3765e(abstractC1436Q, c1458b);
                        return true;
                    }
                    c1458b.m3716f0(abstractC1436Q, c1507u);
                }
                return true;
            }
            C1430N c1430n = (C1430N) abstractC1436Q;
            String str2 = c1430n.f3327e;
            if (str2.equals("caption")) {
                c1458b.m3732q();
                c1458b.m3699P();
                c1458b.m3693J(c1430n);
                enumC1406B = EnumC1406B.f3275k;
            } else if (str2.equals("colgroup")) {
                c1458b.m3732q();
                c1458b.m3693J(c1430n);
                enumC1406B = EnumC1406B.f3276l;
            } else {
                if (!str2.equals("col")) {
                    if (C1380b.m3364c(str2, C1404A.f3257s)) {
                        c1458b.m3732q();
                        c1458b.m3693J(c1430n);
                        enumC1406B = EnumC1406B.f3277m;
                    } else if (C1380b.m3364c(str2, C1404A.f3258t)) {
                        c1458b.m3732q();
                        c1458b.m3760j("tbody");
                    } else {
                        if (str2.equals("table")) {
                            c1458b.m3738t(this);
                            if (!c1458b.m3692I(str2)) {
                                return false;
                            }
                            c1458b.m3711c0(str2);
                            if (c1458b.m3729o0()) {
                                return c1458b.mo3717g(abstractC1436Q);
                            }
                            c1458b.m3693J(c1430n);
                            return true;
                        }
                        if (C1380b.m3364c(str2, C1404A.f3259u)) {
                            return c1458b.m3716f0(abstractC1436Q, c1507u);
                        }
                        if (str2.equals("input")) {
                            if (!c1430n.m3583u() || !c1430n.f3336n.m3392l("type").equalsIgnoreCase("hidden")) {
                                m3765e(abstractC1436Q, c1458b);
                                return true;
                            }
                            c1458b.m3696M(c1430n);
                        } else {
                            if (!str2.equals("form")) {
                                m3765e(abstractC1436Q, c1458b);
                                return true;
                            }
                            c1458b.m3738t(this);
                            if (c1458b.m3746z() != null || c1458b.m3707Y("template")) {
                                return false;
                            }
                            c1458b.m3697N(c1430n, false, false);
                        }
                    }
                    return true;
                }
                c1458b.m3732q();
                c1458b.m3760j("colgroup");
            }
            c1458b.m3741u0(enumC1406B);
            return true;
        }
        c1458b.m3705W();
        c1458b.m3703U();
        c1458b.m3741u0(EnumC1406B.f3274j);
        return c1458b.mo3717g(abstractC1436Q);
    }

    /* JADX INFO: renamed from: e */
    final void m3765e(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        c1458b.m3738t(this);
        c1458b.m3733q0(true);
        c1458b.m3716f0(abstractC1436Q, EnumC1406B.f3271g);
        c1458b.m3733q0(false);
    }
}
