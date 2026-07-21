package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p098x.C1932g;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.u */
/* JADX INFO: loaded from: classes.dex */
final class C1507u extends EnumC1406B {
    C1507u() {
        super("InHead", 3, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1406B
    /* JADX INFO: renamed from: d */
    final boolean mo3535d(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        EnumC1406B enumC1406B;
        C1515y c1515y = EnumC1406B.f3272h;
        if (EnumC1406B.m3532a(abstractC1436Q)) {
            c1458b.m3694K((C1420I) abstractC1436Q);
            return true;
        }
        int iM4675a = C1932g.m4675a(abstractC1436Q.f3337a);
        if (iM4675a == 0) {
            c1458b.m3738t(this);
            return false;
        }
        if (iM4675a == 1) {
            C1430N c1430n = (C1430N) abstractC1436Q;
            String str = c1430n.f3327e;
            if (str.equals("html")) {
                return EnumC1406B.f3271g.mo3535d(abstractC1436Q, c1458b);
            }
            if (C1380b.m3364c(str, C1404A.f3239a)) {
                C1393m c1393mM3696M = c1458b.m3696M(c1430n);
                if (str.equals("base") && c1393mM3696M.m3520n("href")) {
                    c1458b.m3704V(c1393mM3696M);
                }
            } else if (str.equals("meta")) {
                c1458b.m3696M(c1430n);
            } else if (str.equals("title")) {
                c1458b.f3470c.m3636v(EnumC1484j1.f3427c);
                c1458b.m3703U();
                c1458b.m3741u0(c1515y);
                c1458b.m3693J(c1430n);
            } else if (C1380b.m3364c(str, C1404A.f3240b)) {
                EnumC1406B.m3533b(c1430n, c1458b);
            } else if (str.equals("noscript")) {
                c1458b.m3693J(c1430n);
                enumC1406B = EnumC1406B.f3269e;
                c1458b.m3741u0(enumC1406B);
            } else if (str.equals("script")) {
                c1458b.f3470c.m3636v(EnumC1484j1.f3433f);
                c1458b.m3703U();
                c1458b.m3741u0(c1515y);
                c1458b.m3693J(c1430n);
            } else {
                if (str.equals("head")) {
                    c1458b.m3738t(this);
                    return false;
                }
                if (!str.equals("template")) {
                    c1458b.m3758h("head");
                    return c1458b.mo3717g(abstractC1436Q);
                }
                c1458b.m3693J(c1430n);
                c1458b.m3699P();
                c1458b.m3740u(false);
                C1485k c1485k = EnumC1406B.f3282r;
                c1458b.m3741u0(c1485k);
                c1458b.m3719h0(c1485k);
            }
        } else if (iM4675a == 2) {
            String str2 = ((C1428M) abstractC1436Q).f3327e;
            if (str2.equals("head")) {
                c1458b.m3709b0();
                enumC1406B = EnumC1406B.f3270f;
                c1458b.m3741u0(enumC1406B);
            } else {
                if (C1380b.m3364c(str2, C1404A.f3241c)) {
                    c1458b.m3758h("head");
                    return c1458b.mo3717g(abstractC1436Q);
                }
                if (!str2.equals("template")) {
                    c1458b.m3738t(this);
                    return false;
                }
                if (c1458b.m3707Y(str2)) {
                    c1458b.m3744x(true);
                    if (!str2.equals(c1458b.m3755a().m3469i0())) {
                        c1458b.m3738t(this);
                    }
                    c1458b.m3711c0(str2);
                    c1458b.m3727n();
                    c1458b.m3713d0();
                    c1458b.m3729o0();
                } else {
                    c1458b.m3738t(this);
                }
            }
        } else {
            if (iM4675a != 3) {
                c1458b.m3758h("head");
                return c1458b.mo3717g(abstractC1436Q);
            }
            c1458b.m3695L((C1422J) abstractC1436Q);
        }
        return true;
    }
}
