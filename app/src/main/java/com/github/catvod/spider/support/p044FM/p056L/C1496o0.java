package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.o0 */
/* JADX INFO: loaded from: classes.dex */
final enum C1496o0 extends EnumC1484j1 {
    C1496o0() {
        super("ScriptDataDoubleEscaped", 28, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        EnumC1484j1 enumC1484j1;
        char cM3677u = c1455a.m3677u();
        if (cM3677u == 0) {
            c1441t.m3632r(this);
            c1455a.m3659a();
            c1441t.m3624j((char) 65533);
            return;
        }
        if (cM3677u == '-') {
            c1441t.m3624j(cM3677u);
            enumC1484j1 = EnumC1484j1.f3400D;
        } else {
            if (cM3677u != '<') {
                if (cM3677u != 65535) {
                    c1441t.m3626l(c1455a.m3673q('-', '<', 0));
                    return;
                } else {
                    c1441t.m3631q(this);
                    c1441t.m3636v(EnumC1484j1.f3423a);
                    return;
                }
            }
            c1441t.m3624j(cM3677u);
            enumC1484j1 = EnumC1484j1.f3402F;
        }
        c1441t.m3616a(enumC1484j1);
    }
}
