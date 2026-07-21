package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p028d0.n */
/* JADX INFO: loaded from: classes.dex */
final class C1154n extends EnumC1068A {
    C1154n() {
        super("AfterFrameset", 19, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        EnumC1068A enumC1068A;
        if (EnumC1068A.m2797a(abstractC1096O)) {
            c1122b.m2930E((C1082H) abstractC1096O);
        } else {
            if (!abstractC1096O.m2847b()) {
                if (abstractC1096O.m2848c()) {
                    c1122b.m2968n(this);
                    return false;
                }
                if (abstractC1096O.m2851f() && ((C1092M) abstractC1096O).f2686c.equals("html")) {
                    enumC1068A = EnumC1068A.f2634i;
                } else if (abstractC1096O.m2850e() && ((C1090L) abstractC1096O).f2686c.equals("html")) {
                    c1122b.m2964j0(EnumC1068A.f2649x);
                } else if (abstractC1096O.m2851f() && ((C1092M) abstractC1096O).f2686c.equals("noframes")) {
                    enumC1068A = EnumC1068A.f2631f;
                } else if (!abstractC1096O.m2849d()) {
                    c1122b.m2968n(this);
                    return false;
                }
                return c1122b.m2947X(abstractC1096O, enumC1068A);
            }
            c1122b.m2931F((C1084I) abstractC1096O);
        }
        return true;
    }
}
