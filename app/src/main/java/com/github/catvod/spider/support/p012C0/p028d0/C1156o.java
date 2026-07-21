package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p026c0.C1053l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.o */
/* JADX INFO: loaded from: classes.dex */
final enum C1156o extends EnumC1068A {
    C1156o() {
        super("AfterAfterBody", 20, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        C1172w c1172w = EnumC1068A.f2634i;
        if (abstractC1096O.m2847b()) {
            c1122b.m2931F((C1084I) abstractC1096O);
        } else {
            if (abstractC1096O.m2848c() || (abstractC1096O.m2851f() && ((C1092M) abstractC1096O).f2686c.equals("html"))) {
                return c1122b.m2947X(abstractC1096O, c1172w);
            }
            if (EnumC1068A.m2797a(abstractC1096O)) {
                C1053l c1053lM2945V = c1122b.m2945V("html");
                c1122b.m2930E((C1082H) abstractC1096O);
                c1122b.f2818e.add(c1053lM2945V);
                c1122b.f2818e.add(c1053lM2945V.m2714k0("body"));
            } else if (!abstractC1096O.m2849d()) {
                c1122b.m2968n(this);
                c1122b.m2964j0(c1172w);
                return c1122b.mo2953c(abstractC1096O);
            }
        }
        return true;
    }
}
