package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.p */
/* JADX INFO: loaded from: classes.dex */
final class C1497p extends EnumC1406B {
    C1497p() {
        super("AfterAfterBody", 21, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1406B
    /* JADX INFO: renamed from: d */
    final boolean mo3535d(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        if (abstractC1436Q.m3594c()) {
            c1458b.m3695L((C1422J) abstractC1436Q);
            return true;
        }
        if (abstractC1436Q.m3595d() || (abstractC1436Q.m3598g() && ((C1430N) abstractC1436Q).f3327e.equals("html"))) {
            return c1458b.m3716f0(abstractC1436Q, EnumC1406B.f3271g);
        }
        if (EnumC1406B.m3532a(abstractC1436Q)) {
            c1458b.m3694K((C1420I) abstractC1436Q);
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
