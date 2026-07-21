package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p037l.C1257a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.e */
/* JADX INFO: loaded from: classes.dex */
final enum C1131e extends EnumC1068A {
    C1131e() {
        super("InColumnGroup", 11, null);
    }

    /* JADX INFO: renamed from: e */
    private boolean m2981e(AbstractC1096O abstractC1096O, AbstractC1145i1 abstractC1145i1) {
        if (abstractC1145i1.m2990d("colgroup")) {
            return abstractC1145i1.mo2953c(abstractC1096O);
        }
        return true;
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        if (EnumC1068A.m2797a(abstractC1096O)) {
            c1122b.m2930E((C1082H) abstractC1096O);
            return true;
        }
        int iM3131a = C1257a.m3131a(abstractC1096O.f2694a);
        if (iM3131a == 0) {
            c1122b.m2968n(this);
        } else if (iM3131a == 1) {
            C1092M c1092m = (C1092M) abstractC1096O;
            String str = c1092m.f2686c;
            str.getClass();
            if (!str.equals("col")) {
                return !str.equals("html") ? m2981e(abstractC1096O, c1122b) : c1122b.m2947X(abstractC1096O, EnumC1068A.f2634i);
            }
            c1122b.m2932G(c1092m);
        } else if (iM3131a != 2) {
            if (iM3131a != 3) {
                if (iM3131a == 5 && c1122b.m2989a().m2706d0().equals("html")) {
                    return true;
                }
                return m2981e(abstractC1096O, c1122b);
            }
            c1122b.m2931F((C1084I) abstractC1096O);
        } else {
            if (!((C1090L) abstractC1096O).f2686c.equals("colgroup")) {
                return m2981e(abstractC1096O, c1122b);
            }
            if (c1122b.m2989a().m2706d0().equals("html")) {
                c1122b.m2968n(this);
                return false;
            }
            c1122b.m2944U();
            c1122b.m2964j0(EnumC1068A.f2636k);
        }
        return true;
    }
}
