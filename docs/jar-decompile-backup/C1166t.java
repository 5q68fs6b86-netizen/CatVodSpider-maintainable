package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p024b0.C1034b;
import com.github.catvod.spider.support.p012C0.p026c0.C1053l;
import com.github.catvod.spider.support.p012C0.p037l.C1257a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p028d0.t */
/* JADX INFO: loaded from: classes.dex */
final class C1166t extends EnumC1068A {
    C1166t() {
        super("InHead", 3, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        EnumC1068A enumC1068A;
        C1174x c1174x = EnumC1068A.f2635j;
        if (EnumC1068A.m2797a(abstractC1096O)) {
            c1122b.m2930E((C1082H) abstractC1096O);
            return true;
        }
        int iM3131a = C1257a.m3131a(abstractC1096O.f2694a);
        if (iM3131a == 0) {
            c1122b.m2968n(this);
            return false;
        }
        if (iM3131a == 1) {
            C1092M c1092m = (C1092M) abstractC1096O;
            String str = c1092m.f2686c;
            if (str.equals("html")) {
                return EnumC1068A.f2634i.mo2800d(abstractC1096O, c1122b);
            }
            if (C1034b.m2596b(str, C1178z.f2836a)) {
                C1053l c1053lM2932G = c1122b.m2932G(c1092m);
                if (str.equals("base") && c1053lM2932G.m2757o("href")) {
                    c1122b.m2940Q(c1053lM2932G);
                }
            } else if (str.equals("meta")) {
                c1122b.m2932G(c1092m);
            } else if (str.equals("title")) {
                c1122b.f2816c.m2887u(EnumC1142h1.f2775e);
                c1122b.m2939P();
                c1122b.m2964j0(c1174x);
                c1122b.m2929D(c1092m);
            } else if (C1034b.m2596b(str, C1178z.f2837b)) {
                EnumC1068A.m2798b(c1092m, c1122b);
            } else if (str.equals("noscript")) {
                c1122b.m2929D(c1092m);
                enumC1068A = EnumC1068A.f2632g;
                c1122b.m2964j0(enumC1068A);
            } else {
                if (!str.equals("script")) {
                    if (str.equals("head")) {
                        c1122b.m2968n(this);
                        return false;
                    }
                    c1122b.m2990d("head");
                    return c1122b.mo2953c(abstractC1096O);
                }
                c1122b.f2816c.m2887u(EnumC1142h1.f2781h);
                c1122b.m2939P();
                c1122b.m2964j0(c1174x);
                c1122b.m2929D(c1092m);
            }
        } else if (iM3131a == 2) {
            String str2 = ((C1090L) abstractC1096O).f2686c;
            if (!str2.equals("head")) {
                if (C1034b.m2596b(str2, C1178z.f2838c)) {
                    c1122b.m2990d("head");
                    return c1122b.mo2953c(abstractC1096O);
                }
                c1122b.m2968n(this);
                return false;
            }
            c1122b.m2944U();
            enumC1068A = EnumC1068A.f2633h;
            c1122b.m2964j0(enumC1068A);
        } else {
            if (iM3131a != 3) {
                c1122b.m2990d("head");
                return c1122b.mo2953c(abstractC1096O);
            }
            c1122b.m2931F((C1084I) abstractC1096O);
        }
        return true;
    }
}
