package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.O0 */
/* JADX INFO: loaded from: classes.dex */
final class C1097O0 extends EnumC1142h1 {
    C1097O0() {
        super("AfterDoctypeName", 53, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        EnumC1142h1 enumC1142h1;
        C1126c0 c1126c0 = EnumC1142h1.f2771c;
        if (c1119a.m2917t()) {
            c1100q.m2882p(this);
            c1100q.f2711m.f2684f = true;
            c1100q.m2880n();
            c1100q.m2887u(c1126c0);
            return;
        }
        if (c1119a.m2922z('\t', '\n', '\r', '\f', ' ')) {
            c1119a.m2900a();
            return;
        }
        if (c1119a.m2921y('>')) {
            c1100q.m2880n();
            c1100q.m2868a(c1126c0);
            return;
        }
        if (c1119a.m2920x("PUBLIC")) {
            c1100q.f2711m.f2681c = "PUBLIC";
            enumC1142h1 = EnumC1142h1.f2776e0;
        } else {
            if (!c1119a.m2920x("SYSTEM")) {
                c1100q.m2883q(this);
                c1100q.f2711m.f2684f = true;
                c1100q.m2868a(EnumC1142h1.f2798p0);
                return;
            }
            c1100q.f2711m.f2681c = "SYSTEM";
            enumC1142h1 = EnumC1142h1.f2788k0;
        }
        c1100q.m2887u(enumC1142h1);
    }
}
