package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.w */
/* JADX INFO: loaded from: classes.dex */
final enum C1511w extends EnumC1406B {
    C1511w() {
        super("AfterHead", 5, null);
    }

    /* JADX INFO: renamed from: e */
    private boolean m3763e(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        c1458b.m3760j("body");
        c1458b.m3740u(true);
        return c1458b.mo3717g(abstractC1436Q);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1406B
    /* JADX INFO: renamed from: d */
    final boolean mo3535d(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        C1507u c1507u = EnumC1406B.f3268d;
        C1513x c1513x = EnumC1406B.f3271g;
        if (EnumC1406B.m3532a(abstractC1436Q)) {
            c1458b.m3694K((C1420I) abstractC1436Q);
            return true;
        }
        if (abstractC1436Q.m3594c()) {
            c1458b.m3695L((C1422J) abstractC1436Q);
            return true;
        }
        if (abstractC1436Q.m3595d()) {
            c1458b.m3738t(this);
            return true;
        }
        if (abstractC1436Q.m3598g()) {
            C1430N c1430n = (C1430N) abstractC1436Q;
            String str = c1430n.f3327e;
            if (str.equals("html")) {
                return c1458b.m3716f0(abstractC1436Q, c1513x);
            }
            if (str.equals("body")) {
                c1458b.m3693J(c1430n);
                c1458b.m3740u(false);
                c1458b.m3741u0(c1513x);
                return true;
            }
            if (str.equals("frameset")) {
                c1458b.m3693J(c1430n);
                c1458b.m3741u0(EnumC1406B.f3284t);
                return true;
            }
            if (C1380b.m3364c(str, C1404A.f3245g)) {
                c1458b.m3738t(this);
                C1393m c1393mM3686B = c1458b.m3686B();
                c1458b.f3472e.add(c1393mM3686B);
                c1458b.m3716f0(abstractC1436Q, c1507u);
                c1458b.m3724l0(c1393mM3686B);
                return true;
            }
            if (str.equals("head")) {
                c1458b.m3738t(this);
                return false;
            }
        } else if (abstractC1436Q.m3597f()) {
            String str2 = ((C1428M) abstractC1436Q).f3327e;
            if (!C1380b.m3364c(str2, C1404A.f3242d)) {
                if (str2.equals("template")) {
                    c1458b.m3716f0(abstractC1436Q, c1507u);
                    return true;
                }
                c1458b.m3738t(this);
                return false;
            }
        }
        m3763e(abstractC1436Q, c1458b);
        return true;
    }
}
