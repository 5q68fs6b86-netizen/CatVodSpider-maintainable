package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p026c0.C1050i;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.m */
/* JADX INFO: loaded from: classes.dex */
static final class C1152m extends EnumC1068A {
    C1152m() {
        super("Initial", 0, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1068A
    /* JADX INFO: renamed from: d */
    final boolean mo2800d(AbstractC1096O abstractC1096O, C1122b c1122b) {
        C1162r c1162r = EnumC1068A.f2629d;
        if (EnumC1068A.m2797a(abstractC1096O)) {
            return true;
        }
        if (abstractC1096O.m2847b()) {
            c1122b.m2931F((C1084I) abstractC1096O);
            return true;
        }
        if (!abstractC1096O.m2848c()) {
            c1122b.m2964j0(c1162r);
            return c1122b.mo2953c(abstractC1096O);
        }
        C1086J c1086j = (C1086J) abstractC1096O;
        C1050i c1050i = new C1050i(c1122b.f2821h.m2805c(c1086j.f2680b.toString()), c1086j.f2682d.toString(), c1086j.f2683e.toString());
        c1050i.m2680L(c1086j.f2681c);
        c1122b.f2817d.m2690L(c1050i);
        if (c1086j.f2684f) {
            c1122b.f2817d.m2677v0();
        }
        c1122b.m2964j0(c1162r);
        return true;
    }
}
