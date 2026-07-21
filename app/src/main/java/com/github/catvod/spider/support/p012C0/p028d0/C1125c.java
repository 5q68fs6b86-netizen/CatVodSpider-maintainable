package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p024b0.C1034b;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.c */
/* JADX INFO: loaded from: classes.dex */
final enum C1125c extends EnumC1068A {
    C1125c() {
        super("InTableText", 9, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        EnumC1068A enumC1068A = EnumC1068A.f2634i;
        if (abstractC1096O.f2694a == 5) {
            C1082H c1082h = (C1082H) abstractC1096O;
            if (c1082h.m2825j().equals(EnumC1068A.f2651z)) {
                c1122b.m2968n(this);
                return false;
            }
            ((ArrayList) c1122b.m2976v()).add(c1082h.m2825j());
            return true;
        }
        if (((ArrayList) c1122b.m2976v()).size() > 0) {
            for (String str : (ArrayList) c1122b.m2976v()) {
                if (C1034b.m2597c(str)) {
                    C1082H c1082h2 = new C1082H();
                    c1082h2.m2824i(str);
                    c1122b.m2930E(c1082h2);
                } else {
                    c1122b.m2968n(this);
                    if (C1034b.m2596b(c1122b.m2989a().m2706d0(), C1178z.f2826C)) {
                        c1122b.m2959g0(true);
                        C1082H c1082h3 = new C1082H();
                        c1082h3.m2824i(str);
                        c1122b.m2947X(c1082h3, enumC1068A);
                        c1122b.m2959g0(false);
                    } else {
                        C1082H c1082h4 = new C1082H();
                        c1082h4.m2824i(str);
                        c1122b.m2947X(c1082h4, enumC1068A);
                    }
                }
            }
            c1122b.m2941R();
        }
        c1122b.m2964j0(c1122b.m2943T());
        return c1122b.mo2953c(abstractC1096O);
    }
}
