package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.h0 */
/* JADX INFO: loaded from: classes.dex */
final class C1141h0 extends EnumC1142h1 {
    C1141h0() {
        super("ScriptDataEscapedDashDash", 23, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        EnumC1142h1 enumC1142h1;
        C1135f0 c1135f0 = EnumC1142h1.f2811x;
        if (c1119a.m2917t()) {
            c1100q.m2882p(this);
            c1100q.m2887u(EnumC1142h1.f2771c);
            return;
        }
        char cM2902e = c1119a.m2902e();
        if (cM2902e != 0) {
            if (cM2902e == '-') {
                c1100q.m2875i(cM2902e);
                return;
            }
            if (cM2902e != '<') {
                c1100q.m2875i(cM2902e);
                if (cM2902e == '>') {
                    enumC1142h1 = EnumC1142h1.f2781h;
                }
            } else {
                enumC1142h1 = EnumC1142h1.f2743A;
            }
            c1100q.m2887u(enumC1142h1);
            return;
        }
        c1100q.m2883q(this);
        c1100q.m2875i((char) 65533);
        c1100q.m2887u(c1135f0);
    }
}
