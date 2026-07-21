package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p028d0.p */
/* JADX INFO: loaded from: classes.dex */
final class C1158p extends EnumC1068A {
    C1158p() {
        super("AfterAfterFrameset", 21, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        if (abstractC1096O.m2847b()) {
            c1122b.m2931F((C1084I) abstractC1096O);
        } else {
            if (abstractC1096O.m2848c() || EnumC1068A.m2797a(abstractC1096O) || (abstractC1096O.m2851f() && ((C1092M) abstractC1096O).f2686c.equals("html"))) {
                return c1122b.m2947X(abstractC1096O, EnumC1068A.f2634i);
            }
            if (!abstractC1096O.m2849d()) {
                if (abstractC1096O.m2851f() && ((C1092M) abstractC1096O).f2686c.equals("noframes")) {
                    return c1122b.m2947X(abstractC1096O, EnumC1068A.f2631f);
                }
                c1122b.m2968n(this);
                return false;
            }
        }
        return true;
    }
}
