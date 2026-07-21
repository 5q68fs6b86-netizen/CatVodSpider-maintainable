package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p024b0.C1034b;
import com.github.catvod.spider.support.p012C0.p026c0.C1053l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.v */
/* JADX INFO: loaded from: classes.dex */
static final class C1170v extends EnumC1068A {
    C1170v() {
        super("AfterHead", 5, null);
    }

    /* JADX INFO: renamed from: e */
    private boolean m2993e(AbstractC1096O abstractC1096O, C1122b c1122b) {
        c1122b.m2992f("body");
        c1122b.m2969o(true);
        return c1122b.mo2953c(abstractC1096O);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        C1172w c1172w = EnumC1068A.f2634i;
        if (EnumC1068A.m2797a(abstractC1096O)) {
            c1122b.m2930E((C1082H) abstractC1096O);
        } else if (abstractC1096O.m2847b()) {
            c1122b.m2931F((C1084I) abstractC1096O);
        } else if (abstractC1096O.m2848c()) {
            c1122b.m2968n(this);
        } else {
            if (abstractC1096O.m2851f()) {
                C1092M c1092m = (C1092M) abstractC1096O;
                String str = c1092m.f2686c;
                if (str.equals("html")) {
                    return c1122b.m2947X(abstractC1096O, c1172w);
                }
                if (str.equals("body")) {
                    c1122b.m2929D(c1092m);
                    c1122b.m2969o(false);
                    c1122b.m2964j0(c1172w);
                } else if (str.equals("frameset")) {
                    c1122b.m2929D(c1092m);
                    c1122b.m2964j0(EnumC1068A.f2646u);
                } else if (C1034b.m2596b(str, C1178z.f2842g)) {
                    c1122b.m2968n(this);
                    C1053l c1053lM2975u = c1122b.m2975u();
                    c1122b.f2818e.add(c1053lM2975u);
                    c1122b.m2947X(abstractC1096O, EnumC1068A.f2631f);
                    c1122b.m2954c0(c1053lM2975u);
                } else if (str.equals("head")) {
                    c1122b.m2968n(this);
                    return false;
                }
            } else if (abstractC1096O.m2850e() && !C1034b.m2596b(((C1090L) abstractC1096O).f2686c, C1178z.f2839d)) {
                c1122b.m2968n(this);
                return false;
            }
            m2993e(abstractC1096O, c1122b);
        }
        return true;
    }
}
