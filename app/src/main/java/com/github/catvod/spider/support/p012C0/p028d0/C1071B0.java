package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.B0 */
/* JADX INFO: loaded from: classes.dex */
final enum C1071B0 extends EnumC1142h1 {
    C1071B0() {
        super("SelfClosingStartTag", 41, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        C1126c0 c1126c0 = EnumC1142h1.f2771c;
        char cM2902e = c1119a.m2902e();
        if (cM2902e == '>') {
            c1100q.f2707i.f2692i = true;
            c1100q.m2881o();
        } else {
            if (cM2902e != 65535) {
                c1119a.m2898G();
                c1100q.m2883q(this);
                c1100q.m2887u(EnumC1142h1.f2752J);
                return;
            }
            c1100q.m2882p(this);
        }
        c1100q.m2887u(c1126c0);
    }
}
