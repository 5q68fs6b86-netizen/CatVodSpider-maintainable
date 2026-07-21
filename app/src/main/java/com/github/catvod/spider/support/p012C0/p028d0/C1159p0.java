package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p028d0.p0 */
/* JADX INFO: loaded from: classes.dex */
final class C1159p0 extends EnumC1142h1 {
    C1159p0() {
        super("ScriptDataDoubleEscapedDashDash", 30, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        EnumC1142h1 enumC1142h1;
        C1153m0 c1153m0 = EnumC1142h1.f2747E;
        char cM2902e = c1119a.m2902e();
        if (cM2902e != 0) {
            if (cM2902e == '-') {
                c1100q.m2875i(cM2902e);
                return;
            }
            if (cM2902e == '<') {
                c1100q.m2875i(cM2902e);
                enumC1142h1 = EnumC1142h1.f2750H;
            } else if (cM2902e == '>') {
                c1100q.m2875i(cM2902e);
                enumC1142h1 = EnumC1142h1.f2781h;
            } else if (cM2902e == 65535) {
                c1100q.m2882p(this);
                enumC1142h1 = EnumC1142h1.f2771c;
            }
            c1100q.m2887u(enumC1142h1);
            return;
        }
        c1100q.m2883q(this);
        cM2902e = 65533;
        c1100q.m2875i(cM2902e);
        c1100q.m2887u(c1153m0);
    }
}
