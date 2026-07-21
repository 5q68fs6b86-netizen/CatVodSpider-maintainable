package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.l */
/* JADX INFO: loaded from: classes.dex */
static final class C1488l extends EnumC1406B {
    C1488l() {
        super("AfterBody", 18, null);
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
            return c1458b.m3716f0(abstractC1436Q, EnumC1406B.f3271g);
        }
        if (abstractC1436Q.m3597f() && ((C1428M) abstractC1436Q).f3327e.equals("html")) {
            c1458b.getClass();
            if (c1458b.m3707Y("html")) {
                c1458b.m3711c0("html");
            }
            c1458b.m3741u0(EnumC1406B.f3286v);
            return true;
        }
        if (abstractC1436Q.m3596e()) {
            return true;
        }
        c1458b.m3738t(this);
        c1458b.m3728n0();
        return c1458b.mo3717g(abstractC1436Q);
    }
}
