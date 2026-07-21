package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p024b0.C1034b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.j */
/* JADX INFO: loaded from: classes.dex */
final enum C1146j extends EnumC1068A {
    C1146j() {
        super("InSelectInTable", 16, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        if (abstractC1096O.m2851f() && C1034b.m2596b(((C1092M) abstractC1096O).f2686c, C1178z.f2832I)) {
            c1122b.m2968n(this);
            c1122b.m2990d("select");
            return c1122b.mo2953c(abstractC1096O);
        }
        if (abstractC1096O.m2850e()) {
            C1090L c1090l = (C1090L) abstractC1096O;
            if (C1034b.m2596b(c1090l.f2686c, C1178z.f2832I)) {
                c1122b.m2968n(this);
                if (!c1122b.m2927B(c1090l.f2686c)) {
                    return false;
                }
                c1122b.m2990d("select");
                return c1122b.mo2953c(abstractC1096O);
            }
        }
        return c1122b.m2947X(abstractC1096O, EnumC1068A.f2643r);
    }
}
