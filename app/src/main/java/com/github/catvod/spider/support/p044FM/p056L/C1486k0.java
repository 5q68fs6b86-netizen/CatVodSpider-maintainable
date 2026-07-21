package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.k0 */
/* JADX INFO: loaded from: classes.dex */
final enum C1486k0 extends EnumC1484j1 {
    C1486k0() {
        super("ScriptDataEscapedLessthanSign", 24, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        EnumC1484j1 enumC1484j1;
        if (c1455a.m3650H()) {
            c1441t.m3623i();
            c1441t.f3351h.append(c1455a.m3677u());
            c1441t.m3626l("<");
            c1441t.m3624j(c1455a.m3677u());
            enumC1484j1 = EnumC1484j1.f3398B;
        } else if (!c1455a.m3647E('/')) {
            c1441t.m3624j('<');
            c1441t.m3636v(EnumC1484j1.f3463v);
            return;
        } else {
            c1441t.m3623i();
            enumC1484j1 = EnumC1484j1.f3467z;
        }
        c1441t.m3616a(enumC1484j1);
    }
}
