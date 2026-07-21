package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p024b0.C1034b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.u */
/* JADX INFO: loaded from: classes.dex */
final enum C1168u extends EnumC1068A {
    C1168u() {
        super("InHeadNoscript", 4, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        C1082H c1082h;
        C1166t c1166t = EnumC1068A.f2631f;
        if (abstractC1096O.m2848c()) {
            c1122b.m2968n(this);
        } else {
            if (abstractC1096O.m2851f() && ((C1092M) abstractC1096O).f2686c.equals("html")) {
                return c1122b.m2947X(abstractC1096O, EnumC1068A.f2634i);
            }
            if (!abstractC1096O.m2850e() || !((C1090L) abstractC1096O).f2686c.equals("noscript")) {
                if (EnumC1068A.m2797a(abstractC1096O) || abstractC1096O.m2847b() || (abstractC1096O.m2851f() && C1034b.m2596b(((C1092M) abstractC1096O).f2686c, C1178z.f2841f))) {
                    return c1122b.m2947X(abstractC1096O, c1166t);
                }
                if (abstractC1096O.m2850e() && ((C1090L) abstractC1096O).f2686c.equals("br")) {
                    c1122b.m2968n(this);
                    c1082h = new C1082H();
                } else {
                    if ((abstractC1096O.m2851f() && C1034b.m2596b(((C1092M) abstractC1096O).f2686c, C1178z.f2834K)) || abstractC1096O.m2850e()) {
                        c1122b.m2968n(this);
                        return false;
                    }
                    c1122b.m2968n(this);
                    c1082h = new C1082H();
                }
                c1082h.m2824i(abstractC1096O.toString());
                c1122b.m2930E(c1082h);
                return true;
            }
            c1122b.m2944U();
            c1122b.m2964j0(c1166t);
        }
        return true;
    }
}
