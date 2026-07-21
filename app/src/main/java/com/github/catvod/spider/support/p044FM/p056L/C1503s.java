package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p054J.C1380b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.s */
/* JADX INFO: loaded from: classes.dex */
final enum C1503s extends EnumC1406B {
    C1503s() {
        super("BeforeHtml", 1, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1406B
    /* JADX INFO: renamed from: d */
    final boolean mo3535d(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        C1505t c1505t = EnumC1406B.f3267c;
        if (abstractC1436Q.m3595d()) {
            c1458b.m3738t(this);
            return false;
        }
        if (abstractC1436Q.m3594c()) {
            c1458b.m3695L((C1422J) abstractC1436Q);
            return true;
        }
        if (EnumC1406B.m3532a(abstractC1436Q)) {
            c1458b.m3694K((C1420I) abstractC1436Q);
            return true;
        }
        if (abstractC1436Q.m3598g()) {
            C1430N c1430n = (C1430N) abstractC1436Q;
            if (c1430n.f3327e.equals("html")) {
                c1458b.m3693J(c1430n);
                c1458b.m3741u0(c1505t);
                return true;
            }
        }
        if (!(abstractC1436Q.m3597f() && C1380b.m3364c(((C1428M) abstractC1436Q).f3327e, C1404A.f3243e)) && abstractC1436Q.m3597f()) {
            c1458b.m3738t(this);
            return false;
        }
        c1458b.m3700R();
        c1458b.m3741u0(c1505t);
        return c1458b.mo3717g(abstractC1436Q);
    }
}
