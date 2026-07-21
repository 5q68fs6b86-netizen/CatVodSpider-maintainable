package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.q0 */
/* JADX INFO: loaded from: classes.dex */
final class C1500q0 extends EnumC1484j1 {
    C1500q0() {
        super("ScriptDataDoubleEscapedDash", 29, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        EnumC1484j1 enumC1484j1;
        C1496o0 c1496o0 = EnumC1484j1.f3399C;
        char cM3662f = c1455a.m3662f();
        if (cM3662f != 0) {
            if (cM3662f == '-') {
                c1441t.m3624j(cM3662f);
                enumC1484j1 = EnumC1484j1.f3401E;
            } else if (cM3662f == '<') {
                c1441t.m3624j(cM3662f);
                enumC1484j1 = EnumC1484j1.f3402F;
            } else if (cM3662f == 65535) {
                c1441t.m3631q(this);
                enumC1484j1 = EnumC1484j1.f3423a;
            }
            c1441t.m3636v(enumC1484j1);
            return;
        }
        c1441t.m3632r(this);
        cM3662f = 65533;
        c1441t.m3624j(cM3662f);
        c1441t.m3636v(c1496o0);
    }
}
