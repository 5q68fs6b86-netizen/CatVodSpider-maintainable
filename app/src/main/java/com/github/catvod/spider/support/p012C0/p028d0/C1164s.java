package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p024b0.C1034b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.s */
/* JADX INFO: loaded from: classes.dex */
final enum C1164s extends EnumC1068A {
    C1164s() {
        super("BeforeHead", 2, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        if (EnumC1068A.m2797a(abstractC1096O)) {
            c1122b.m2930E((C1082H) abstractC1096O);
        } else {
            if (!abstractC1096O.m2847b()) {
                if (abstractC1096O.m2848c()) {
                    c1122b.m2968n(this);
                    return false;
                }
                if (abstractC1096O.m2851f() && ((C1092M) abstractC1096O).f2686c.equals("html")) {
                    return EnumC1068A.f2634i.mo2800d(abstractC1096O, c1122b);
                }
                if (abstractC1096O.m2851f()) {
                    C1092M c1092m = (C1092M) abstractC1096O;
                    if (c1092m.f2686c.equals("head")) {
                        c1122b.m2961h0(c1122b.m2929D(c1092m));
                        c1122b.m2964j0(EnumC1068A.f2631f);
                    }
                }
                if (abstractC1096O.m2850e() && C1034b.m2596b(((C1090L) abstractC1096O).f2686c, C1178z.f2840e)) {
                    c1122b.m2992f("head");
                    return c1122b.mo2953c(abstractC1096O);
                }
                if (abstractC1096O.m2850e()) {
                    c1122b.m2968n(this);
                    return false;
                }
                c1122b.m2992f("head");
                return c1122b.mo2953c(abstractC1096O);
            }
            c1122b.m2931F((C1084I) abstractC1096O);
        }
        return true;
    }
}
