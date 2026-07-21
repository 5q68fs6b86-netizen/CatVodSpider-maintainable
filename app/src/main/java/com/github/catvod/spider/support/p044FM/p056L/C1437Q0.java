package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.Q0 */
/* JADX INFO: loaded from: classes.dex */
final class C1437Q0 extends EnumC1484j1 {
    C1437Q0() {
        super("AfterDoctypeName", 53, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        EnumC1484j1 enumC1484j1;
        C1468e0 c1468e0 = EnumC1484j1.f3423a;
        if (c1455a.m3679w()) {
            c1441t.m3631q(this);
            c1441t.f3356m.f3325h = true;
            c1441t.m3629o();
            c1441t.m3636v(c1468e0);
            return;
        }
        if (c1455a.m3648F('\t', '\n', '\r', '\f', ' ')) {
            c1455a.m3659a();
            return;
        }
        if (c1455a.m3647E('>')) {
            c1441t.m3629o();
            c1441t.m3616a(c1468e0);
            return;
        }
        if (c1455a.m3646D("PUBLIC")) {
            c1441t.f3356m.f3322e = "PUBLIC";
            enumC1484j1 = EnumC1484j1.f3428c0;
        } else {
            if (!c1455a.m3646D("SYSTEM")) {
                c1441t.m3632r(this);
                c1441t.f3356m.f3325h = true;
                c1441t.m3616a(EnumC1484j1.f3450n0);
                return;
            }
            c1441t.f3356m.f3322e = "SYSTEM";
            enumC1484j1 = EnumC1484j1.f3440i0;
        }
        c1441t.m3636v(enumC1484j1);
    }
}
