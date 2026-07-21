package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.F0 */
/* JADX INFO: loaded from: classes.dex */
final enum C1079F0 extends EnumC1142h1 {
    C1079F0() {
        super("CommentStartDash", 45, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        C1126c0 c1126c0 = EnumC1142h1.f2771c;
        C1081G0 c1081g0 = EnumC1142h1.f2765W;
        char cM2902e = c1119a.m2902e();
        if (cM2902e != 0) {
            if (cM2902e == '-') {
                c1100q.m2887u(EnumC1142h1.f2764V);
                return;
            }
            if (cM2902e == '>') {
                c1100q.m2883q(this);
            } else if (cM2902e != 65535) {
                c1100q.f2712n.m2826i(cM2902e);
            } else {
                c1100q.m2882p(this);
            }
            c1100q.m2879m();
            c1100q.m2887u(c1126c0);
            return;
        }
        c1100q.m2883q(this);
        c1100q.f2712n.m2826i((char) 65533);
        c1100q.m2887u(c1081g0);
    }
}
