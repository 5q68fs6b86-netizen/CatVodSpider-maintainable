package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p024b0.C1034b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.y */
/* JADX INFO: loaded from: classes.dex */
static final class C1176y extends EnumC1068A {
    C1176y() {
        super("InTable", 8, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        EnumC1068A enumC1068A;
        if (abstractC1096O.m2846a()) {
            c1122b.m2941R();
            c1122b.m2939P();
            c1122b.m2964j0(EnumC1068A.f2637l);
            return c1122b.mo2953c(abstractC1096O);
        }
        if (abstractC1096O.m2847b()) {
            c1122b.m2931F((C1084I) abstractC1096O);
            return true;
        }
        if (abstractC1096O.m2848c()) {
            c1122b.m2968n(this);
            return false;
        }
        if (!abstractC1096O.m2851f()) {
            if (!abstractC1096O.m2850e()) {
                if (!abstractC1096O.m2849d()) {
                    return m2995e(abstractC1096O, c1122b);
                }
                if (c1122b.m2989a().m2706d0().equals("html")) {
                    c1122b.m2968n(this);
                }
                return true;
            }
            String str = ((C1090L) abstractC1096O).f2686c;
            if (!str.equals("table")) {
                if (!C1034b.m2596b(str, C1178z.f2825B)) {
                    return m2995e(abstractC1096O, c1122b);
                }
                c1122b.m2968n(this);
                return false;
            }
            if (!c1122b.m2927B(str)) {
                c1122b.m2968n(this);
                return false;
            }
            c1122b.m2945V("table");
            c1122b.m2956e0();
            return true;
        }
        C1092M c1092m = (C1092M) abstractC1096O;
        String str2 = c1092m.f2686c;
        if (str2.equals("caption")) {
            c1122b.m2966l();
            c1122b.m2935J();
            c1122b.m2929D(c1092m);
            enumC1068A = EnumC1068A.f2638m;
        } else {
            if (!str2.equals("colgroup")) {
                if (str2.equals("col")) {
                    c1122b.m2992f("colgroup");
                    return c1122b.mo2953c(abstractC1096O);
                }
                if (C1034b.m2596b(str2, C1178z.f2856u)) {
                    c1122b.m2966l();
                    c1122b.m2929D(c1092m);
                    enumC1068A = EnumC1068A.f2640o;
                } else {
                    if (C1034b.m2596b(str2, C1178z.f2857v)) {
                        c1122b.m2992f("tbody");
                        return c1122b.mo2953c(abstractC1096O);
                    }
                    if (str2.equals("table")) {
                        c1122b.m2968n(this);
                        if (c1122b.m2990d("table")) {
                            return c1122b.mo2953c(abstractC1096O);
                        }
                    } else {
                        if (C1034b.m2596b(str2, C1178z.f2858w)) {
                            return c1122b.m2947X(abstractC1096O, EnumC1068A.f2631f);
                        }
                        if (str2.equals("input")) {
                            if (!c1092m.m2839r() || !c1092m.f2693j.m2645j("type").equalsIgnoreCase("hidden")) {
                                return m2995e(abstractC1096O, c1122b);
                            }
                            c1122b.m2932G(c1092m);
                        } else {
                            if (!str2.equals("form")) {
                                return m2995e(abstractC1096O, c1122b);
                            }
                            c1122b.m2968n(this);
                            if (c1122b.m2973s() != null) {
                                return false;
                            }
                            c1122b.m2933H(c1092m, false);
                        }
                    }
                }
                return true;
            }
            c1122b.m2966l();
            c1122b.m2929D(c1092m);
            enumC1068A = EnumC1068A.f2639n;
        }
        c1122b.m2964j0(enumC1068A);
        return true;
    }

    /* JADX INFO: renamed from: e */
    final boolean m2995e(AbstractC1096O abstractC1096O, C1122b c1122b) {
        C1172w c1172w = EnumC1068A.f2634i;
        c1122b.m2968n(this);
        if (!C1034b.m2596b(c1122b.m2989a().m2706d0(), C1178z.f2826C)) {
            return c1122b.m2947X(abstractC1096O, c1172w);
        }
        c1122b.m2959g0(true);
        boolean zM2947X = c1122b.m2947X(abstractC1096O, c1172w);
        c1122b.m2959g0(false);
        return zM2947X;
    }
}
