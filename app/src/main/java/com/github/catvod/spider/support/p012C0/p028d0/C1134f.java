package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p024b0.C1034b;
import com.github.catvod.spider.support.p012C0.p037l.C1257a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.f */
/* JADX INFO: loaded from: classes.dex */
final class C1134f extends EnumC1068A {
    C1134f() {
        super("InTableBody", 12, null);
    }

    /* JADX INFO: renamed from: e */
    private boolean m2982e(AbstractC1096O abstractC1096O, C1122b c1122b) {
        if (!c1122b.m2927B("tbody") && !c1122b.m2927B("thead") && !c1122b.m2978x("tfoot", null)) {
            c1122b.m2968n(this);
            return false;
        }
        c1122b.m2965k();
        c1122b.m2990d(c1122b.m2989a().m2706d0());
        return c1122b.mo2953c(abstractC1096O);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        EnumC1068A enumC1068A = EnumC1068A.f2636k;
        int iM3131a = C1257a.m3131a(abstractC1096O.f2694a);
        if (iM3131a == 1) {
            C1092M c1092m = (C1092M) abstractC1096O;
            String str = c1092m.f2686c;
            if (str.equals("template")) {
                c1122b.m2929D(c1092m);
            } else {
                if (!str.equals("tr")) {
                    if (!C1034b.m2596b(str, C1178z.f2859x)) {
                        return C1034b.m2596b(str, C1178z.f2827D) ? m2982e(abstractC1096O, c1122b) : c1122b.m2947X(abstractC1096O, enumC1068A);
                    }
                    c1122b.m2968n(this);
                    c1122b.m2992f("tr");
                    return c1122b.mo2953c(c1092m);
                }
                c1122b.m2965k();
                c1122b.m2929D(c1092m);
                c1122b.m2964j0(EnumC1068A.f2641p);
            }
        } else {
            if (iM3131a != 2) {
                return c1122b.m2947X(abstractC1096O, enumC1068A);
            }
            String str2 = ((C1090L) abstractC1096O).f2686c;
            if (!C1034b.m2596b(str2, C1178z.f2833J)) {
                if (str2.equals("table")) {
                    return m2982e(abstractC1096O, c1122b);
                }
                if (!C1034b.m2596b(str2, C1178z.f2828E)) {
                    return c1122b.m2947X(abstractC1096O, enumC1068A);
                }
                c1122b.m2968n(this);
                return false;
            }
            if (!c1122b.m2927B(str2)) {
                c1122b.m2968n(this);
                return false;
            }
            c1122b.m2965k();
            c1122b.m2944U();
            c1122b.m2964j0(enumC1068A);
        }
        return true;
    }
}
