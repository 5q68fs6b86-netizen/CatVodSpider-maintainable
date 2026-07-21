package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.l */
/* JADX INFO: loaded from: classes.dex */
final class C1150l extends EnumC1068A {
    C1150l() {
        super("InFrameset", 18, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        EnumC1068A enumC1068A;
        if (EnumC1068A.m2797a(abstractC1096O)) {
            c1122b.m2930E((C1082H) abstractC1096O);
        } else if (abstractC1096O.m2847b()) {
            c1122b.m2931F((C1084I) abstractC1096O);
        } else {
            if (abstractC1096O.m2848c()) {
                c1122b.m2968n(this);
                return false;
            }
            if (abstractC1096O.m2851f()) {
                C1092M c1092m = (C1092M) abstractC1096O;
                String str = c1092m.f2686c;
                str.getClass();
                switch (str) {
                    case "frameset":
                        c1122b.m2929D(c1092m);
                        break;
                    case "html":
                        enumC1068A = EnumC1068A.f2634i;
                        break;
                    case "frame":
                        c1122b.m2932G(c1092m);
                        break;
                    case "noframes":
                        enumC1068A = EnumC1068A.f2631f;
                        break;
                    default:
                        c1122b.m2968n(this);
                        return false;
                }
                return c1122b.m2947X(c1092m, enumC1068A);
            }
            if (abstractC1096O.m2850e() && ((C1090L) abstractC1096O).f2686c.equals("frameset")) {
                if (c1122b.m2989a().m2706d0().equals("html")) {
                    c1122b.m2968n(this);
                    return false;
                }
                c1122b.m2944U();
                if (!c1122b.m2989a().m2706d0().equals("frameset")) {
                    c1122b.m2964j0(EnumC1068A.f2647v);
                }
            } else {
                if (!abstractC1096O.m2849d()) {
                    c1122b.m2968n(this);
                    return false;
                }
                if (!c1122b.m2989a().m2706d0().equals("html")) {
                    c1122b.m2968n(this);
                }
            }
        }
        return true;
    }
}
