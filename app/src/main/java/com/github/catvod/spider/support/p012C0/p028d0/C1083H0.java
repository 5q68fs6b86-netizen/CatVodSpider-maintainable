package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.H0 */
/* JADX INFO: loaded from: classes.dex */
static final class C1083H0 extends EnumC1142h1 {
    C1083H0() {
        super("CommentEndDash", 47, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        EnumC1142h1 enumC1142h1;
        C1081G0 c1081g0 = EnumC1142h1.f2765W;
        char cM2902e = c1119a.m2902e();
        if (cM2902e != 0) {
            if (cM2902e == '-') {
                enumC1142h1 = EnumC1142h1.f2767Y;
            } else if (cM2902e != 65535) {
                C1084I c1084i = c1100q.f2712n;
                c1084i.m2826i('-');
                c1084i.m2826i(cM2902e);
            } else {
                c1100q.m2882p(this);
                c1100q.m2879m();
                enumC1142h1 = EnumC1142h1.f2771c;
            }
            c1100q.m2887u(enumC1142h1);
            return;
        }
        c1100q.m2883q(this);
        C1084I c1084i2 = c1100q.f2712n;
        c1084i2.m2826i('-');
        c1084i2.m2826i((char) 65533);
        c1100q.m2887u(c1081g0);
    }
}
