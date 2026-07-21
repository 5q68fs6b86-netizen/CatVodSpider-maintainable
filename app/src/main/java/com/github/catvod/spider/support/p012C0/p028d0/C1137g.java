package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p024b0.C1034b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.g */
/* JADX INFO: loaded from: classes.dex */
static final class C1137g extends EnumC1068A {
    C1137g() {
        super("InRow", 13, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        C1134f c1134f = EnumC1068A.f2640o;
        C1176y c1176y = EnumC1068A.f2636k;
        if (abstractC1096O.m2851f()) {
            C1092M c1092m = (C1092M) abstractC1096O;
            String str = c1092m.f2686c;
            if (str.equals("template")) {
                c1122b.m2929D(c1092m);
            } else {
                if (!C1034b.m2596b(str, C1178z.f2859x)) {
                    if (C1034b.m2596b(str, C1178z.f2829F)) {
                        return c1122b.m2990d("tr") ? c1122b.mo2953c(abstractC1096O) : false;
                    }
                    return c1122b.m2947X(abstractC1096O, c1176y);
                }
                c1122b.m2967m();
                c1122b.m2929D(c1092m);
                c1122b.m2964j0(EnumC1068A.f2642q);
                c1122b.m2935J();
            }
        } else {
            if (!abstractC1096O.m2850e()) {
                return c1122b.m2947X(abstractC1096O, c1176y);
            }
            String str2 = ((C1090L) abstractC1096O).f2686c;
            if (str2.equals("tr")) {
                if (!c1122b.m2927B(str2)) {
                    c1122b.m2968n(this);
                    return false;
                }
            } else {
                if (str2.equals("table")) {
                    if (c1122b.m2990d("tr")) {
                        return c1122b.mo2953c(abstractC1096O);
                    }
                    return false;
                }
                if (!C1034b.m2596b(str2, C1178z.f2856u)) {
                    if (!C1034b.m2596b(str2, C1178z.f2830G)) {
                        return c1122b.m2947X(abstractC1096O, c1176y);
                    }
                    c1122b.m2968n(this);
                    return false;
                }
                if (!c1122b.m2927B(str2) || !c1122b.m2927B("tr")) {
                    c1122b.m2968n(this);
                    return false;
                }
            }
            c1122b.m2967m();
            c1122b.m2944U();
            c1122b.m2964j0(c1134f);
        }
        return true;
    }
}
