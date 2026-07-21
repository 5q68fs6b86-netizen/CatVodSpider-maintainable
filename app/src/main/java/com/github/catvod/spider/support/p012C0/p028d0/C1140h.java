package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p024b0.C1034b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.h */
/* JADX INFO: loaded from: classes.dex */
final enum C1140h extends EnumC1068A {
    C1140h() {
        super("InCell", 14, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        C1137g c1137g = EnumC1068A.f2641p;
        C1172w c1172w = EnumC1068A.f2634i;
        if (!abstractC1096O.m2850e()) {
            if (!abstractC1096O.m2851f() || !C1034b.m2596b(((C1092M) abstractC1096O).f2686c, C1178z.f2824A)) {
                return c1122b.m2947X(abstractC1096O, c1172w);
            }
            if (c1122b.m2927B("td") || c1122b.m2927B("th")) {
                c1122b.m2990d(c1122b.m2927B("td") ? "td" : "th");
                return c1122b.mo2953c(abstractC1096O);
            }
            c1122b.m2968n(this);
            return false;
        }
        String str = ((C1090L) abstractC1096O).f2686c;
        if (C1034b.m2596b(str, C1178z.f2859x)) {
            if (!c1122b.m2927B(str)) {
                c1122b.m2968n(this);
                c1122b.m2964j0(c1137g);
                return false;
            }
            if (!c1122b.m2989a().m2706d0().equals(str)) {
                c1122b.m2968n(this);
            }
            c1122b.m2945V(str);
            c1122b.m2962i();
            c1122b.m2964j0(c1137g);
            return true;
        }
        if (C1034b.m2596b(str, C1178z.f2860y)) {
            c1122b.m2968n(this);
            return false;
        }
        if (!C1034b.m2596b(str, C1178z.f2861z)) {
            return c1122b.m2947X(abstractC1096O, c1172w);
        }
        if (c1122b.m2927B(str)) {
            c1122b.m2990d(c1122b.m2927B("td") ? "td" : "th");
            return c1122b.mo2953c(abstractC1096O);
        }
        c1122b.m2968n(this);
        return false;
    }
}
