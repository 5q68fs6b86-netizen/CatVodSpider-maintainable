package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p054J.C1380b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.t */
/* JADX INFO: loaded from: classes.dex */
static final class C1505t extends EnumC1406B {
    C1505t() {
        super("BeforeHead", 2, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1406B
    /* JADX INFO: renamed from: d */
    final boolean mo3535d(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
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
            return false;
        }
        if (abstractC1436Q.m3598g() && ((C1430N) abstractC1436Q).f3327e.equals("html")) {
            return EnumC1406B.f3271g.mo3535d(abstractC1436Q, c1458b);
        }
        if (abstractC1436Q.m3598g()) {
            C1430N c1430n = (C1430N) abstractC1436Q;
            if (c1430n.f3327e.equals("head")) {
                c1458b.m3735r0(c1458b.m3693J(c1430n));
                c1458b.m3741u0(EnumC1406B.f3268d);
                return true;
            }
        }
        if (abstractC1436Q.m3597f() && C1380b.m3364c(((C1428M) abstractC1436Q).f3327e, C1404A.f3243e)) {
            c1458b.m3760j("head");
            return c1458b.mo3717g(abstractC1436Q);
        }
        if (abstractC1436Q.m3597f()) {
            c1458b.m3738t(this);
            return false;
        }
        c1458b.m3760j("head");
        return c1458b.mo3717g(abstractC1436Q);
    }
}
