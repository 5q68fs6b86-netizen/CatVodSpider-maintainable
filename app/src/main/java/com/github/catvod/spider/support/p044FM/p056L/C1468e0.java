package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.e0 */
/* JADX INFO: loaded from: classes.dex */
final class C1468e0 extends EnumC1484j1 {
    C1468e0() {
        super("Data", 0, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        EnumC1484j1 enumC1484j1;
        char cM3677u = c1455a.m3677u();
        if (cM3677u == 0) {
            c1441t.m3632r(this);
            c1441t.m3624j(c1455a.m3662f());
            return;
        }
        if (cM3677u == '&') {
            enumC1484j1 = EnumC1484j1.f3425b;
        } else {
            if (cM3677u != '<') {
                if (cM3677u != 65535) {
                    c1441t.m3626l(c1455a.m3664h());
                    return;
                } else {
                    c1441t.m3625k(new C1426L());
                    return;
                }
            }
            enumC1484j1 = EnumC1484j1.f3437h;
        }
        c1441t.m3616a(enumC1484j1);
    }
}
