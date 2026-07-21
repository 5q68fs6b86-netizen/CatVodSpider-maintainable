package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.k */
/* JADX INFO: loaded from: classes.dex */
static final class C1148k extends EnumC1068A {
    C1148k() {
        super("AfterBody", 17, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        C1172w c1172w = EnumC1068A.f2634i;
        if (EnumC1068A.m2797a(abstractC1096O)) {
            c1122b.m2930E((C1082H) abstractC1096O);
        } else if (abstractC1096O.m2847b()) {
            c1122b.m2931F((C1084I) abstractC1096O);
        } else {
            if (abstractC1096O.m2848c()) {
                c1122b.m2968n(this);
                return false;
            }
            if (abstractC1096O.m2851f() && ((C1092M) abstractC1096O).f2686c.equals("html")) {
                return c1122b.m2947X(abstractC1096O, c1172w);
            }
            if (abstractC1096O.m2850e() && ((C1090L) abstractC1096O).f2686c.equals("html")) {
                c1122b.getClass();
                c1122b.m2964j0(EnumC1068A.f2648w);
            } else if (!abstractC1096O.m2849d()) {
                c1122b.m2968n(this);
                c1122b.m2964j0(c1172w);
                return c1122b.mo2953c(abstractC1096O);
            }
        }
        return true;
    }
}
