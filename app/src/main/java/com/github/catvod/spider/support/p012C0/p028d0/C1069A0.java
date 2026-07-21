package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.A0 */
/* JADX INFO: loaded from: classes.dex */
final enum C1069A0 extends EnumC1142h1 {
    C1069A0() {
        super("AfterAttributeValue_quoted", 40, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        C1126c0 c1126c0 = EnumC1142h1.f2771c;
        C1165s0 c1165s0 = EnumC1142h1.f2752J;
        char cM2902e = c1119a.m2902e();
        if (cM2902e != '\t' && cM2902e != '\n' && cM2902e != '\f' && cM2902e != '\r' && cM2902e != ' ') {
            if (cM2902e == '/') {
                c1100q.m2887u(EnumC1142h1.f2760R);
                return;
            }
            if (cM2902e == '>') {
                c1100q.m2881o();
            } else if (cM2902e != 65535) {
                c1119a.m2898G();
                c1100q.m2883q(this);
            } else {
                c1100q.m2882p(this);
            }
            c1100q.m2887u(c1126c0);
            return;
        }
        c1100q.m2887u(c1165s0);
    }
}
