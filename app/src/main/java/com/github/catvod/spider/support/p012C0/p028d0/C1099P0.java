package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.P0 */
/* JADX INFO: loaded from: classes.dex */
final class C1099P0 extends EnumC1142h1 {
    C1099P0() {
        super("AfterDoctypePublicKeyword", 54, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        EnumC1142h1 enumC1142h1;
        C1126c0 c1126c0 = EnumC1142h1.f2771c;
        char cM2902e = c1119a.m2902e();
        if (cM2902e == '\t' || cM2902e == '\n' || cM2902e == '\f' || cM2902e == '\r' || cM2902e == ' ') {
            enumC1142h1 = EnumC1142h1.f2778f0;
        } else if (cM2902e == '\"') {
            c1100q.m2883q(this);
            enumC1142h1 = EnumC1142h1.f2780g0;
        } else {
            if (cM2902e != '\'') {
                if (cM2902e == '>') {
                    c1100q.m2883q(this);
                } else if (cM2902e != 65535) {
                    c1100q.m2883q(this);
                    c1100q.f2711m.f2684f = true;
                    enumC1142h1 = EnumC1142h1.f2798p0;
                } else {
                    c1100q.m2882p(this);
                }
                c1100q.f2711m.f2684f = true;
                c1100q.m2880n();
                c1100q.m2887u(c1126c0);
                return;
            }
            c1100q.m2883q(this);
            enumC1142h1 = EnumC1142h1.f2782h0;
        }
        c1100q.m2887u(enumC1142h1);
    }
}
