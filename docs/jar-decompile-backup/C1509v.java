package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p054J.C1380b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.v */
/* JADX INFO: loaded from: classes.dex */
final class C1509v extends EnumC1406B {
    C1509v() {
        super("InHeadNoscript", 4, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1406B
    /* JADX INFO: renamed from: d */
    final boolean mo3535d(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        C1420I c1420i;
        C1507u c1507u = EnumC1406B.f3268d;
        if (abstractC1436Q.m3595d()) {
            c1458b.m3738t(this);
        } else {
            if (abstractC1436Q.m3598g() && ((C1430N) abstractC1436Q).f3327e.equals("html")) {
                return c1458b.m3716f0(abstractC1436Q, EnumC1406B.f3271g);
            }
            if (!abstractC1436Q.m3597f() || !((C1428M) abstractC1436Q).f3327e.equals("noscript")) {
                if (EnumC1406B.m3532a(abstractC1436Q) || abstractC1436Q.m3594c() || (abstractC1436Q.m3598g() && C1380b.m3364c(((C1430N) abstractC1436Q).f3327e, C1404A.f3244f))) {
                    return c1458b.m3716f0(abstractC1436Q, c1507u);
                }
                if (abstractC1436Q.m3597f() && ((C1428M) abstractC1436Q).f3327e.equals("br")) {
                    c1458b.m3738t(this);
                    c1420i = new C1420I();
                } else {
                    if ((abstractC1436Q.m3598g() && C1380b.m3364c(((C1430N) abstractC1436Q).f3327e, C1404A.f3235I)) || abstractC1436Q.m3597f()) {
                        c1458b.m3738t(this);
                        return false;
                    }
                    c1458b.m3738t(this);
                    c1420i = new C1420I();
                }
                c1420i.m3565k(abstractC1436Q.toString());
                c1458b.m3694K(c1420i);
                return true;
            }
            c1458b.m3709b0();
            c1458b.m3741u0(c1507u);
        }
        return true;
    }
}
