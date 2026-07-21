package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.i1 */
/* JADX INFO: loaded from: classes.dex */
final enum C1481i1 extends EnumC1484j1 {
    C1481i1() {
        super("EndTagOpen", 8, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        EnumC1484j1 enumC1484j1;
        C1468e0 c1468e0 = EnumC1484j1.f3423a;
        if (c1455a.m3679w()) {
            c1441t.m3631q(this);
            c1441t.m3626l("</");
            c1441t.m3636v(c1468e0);
            return;
        }
        if (c1455a.m3650H()) {
            c1441t.m3622h(false);
            enumC1484j1 = EnumC1484j1.f3441j;
        } else {
            boolean zM3647E = c1455a.m3647E('>');
            c1441t.m3632r(this);
            if (zM3647E) {
                c1441t.m3616a(c1468e0);
                return;
            } else {
                c1441t.m3620f();
                c1441t.f3357n.m3567k('/');
                enumC1484j1 = EnumC1484j1.f3413Q;
            }
        }
        c1441t.m3636v(enumC1484j1);
    }
}
