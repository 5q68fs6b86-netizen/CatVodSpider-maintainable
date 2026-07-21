package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.S0 */
/* JADX INFO: loaded from: classes.dex */
static final class C1104S0 extends EnumC1142h1 {
    C1104S0() {
        super("DoctypePublicIdentifier_singleQuoted", 57, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        StringBuilder sb;
        C1126c0 c1126c0 = EnumC1142h1.f2771c;
        char cM2902e = c1119a.m2902e();
        if (cM2902e != 0) {
            if (cM2902e == '\'') {
                c1100q.m2887u(EnumC1142h1.f2784i0);
                return;
            }
            if (cM2902e == '>') {
                c1100q.m2883q(this);
            } else if (cM2902e != 65535) {
                sb = c1100q.f2711m.f2682d;
            } else {
                c1100q.m2882p(this);
            }
            c1100q.f2711m.f2684f = true;
            c1100q.m2880n();
            c1100q.m2887u(c1126c0);
            return;
        }
        c1100q.m2883q(this);
        sb = c1100q.f2711m.f2682d;
        cM2902e = 65533;
        sb.append(cM2902e);
    }
}
