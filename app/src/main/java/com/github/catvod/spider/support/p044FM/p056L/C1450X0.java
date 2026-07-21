package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.X0 */
/* JADX INFO: loaded from: classes.dex */
final enum C1450X0 extends EnumC1484j1 {
    C1450X0() {
        super("BetweenDoctypePublicAndSystemIdentifiers", 59, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        EnumC1484j1 enumC1484j1;
        C1468e0 c1468e0 = EnumC1484j1.f3423a;
        char cM3662f = c1455a.m3662f();
        if (cM3662f == '\t' || cM3662f == '\n' || cM3662f == '\f' || cM3662f == '\r' || cM3662f == ' ') {
            return;
        }
        if (cM3662f == '\"') {
            c1441t.m3632r(this);
            enumC1484j1 = EnumC1484j1.f3444k0;
        } else {
            if (cM3662f != '\'') {
                if (cM3662f != '>') {
                    if (cM3662f != 65535) {
                        c1441t.m3632r(this);
                        c1441t.f3356m.f3325h = true;
                        enumC1484j1 = EnumC1484j1.f3450n0;
                    } else {
                        c1441t.m3631q(this);
                        c1441t.f3356m.f3325h = true;
                    }
                }
                c1441t.m3629o();
                c1441t.m3636v(c1468e0);
                return;
            }
            c1441t.m3632r(this);
            enumC1484j1 = EnumC1484j1.f3446l0;
        }
        c1441t.m3636v(enumC1484j1);
    }
}
