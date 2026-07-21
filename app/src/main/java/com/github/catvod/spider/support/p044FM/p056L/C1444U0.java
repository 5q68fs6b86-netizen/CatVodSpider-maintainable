package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.U0 */
/* JADX INFO: loaded from: classes.dex */
final class C1444U0 extends EnumC1484j1 {
    C1444U0() {
        super("DoctypePublicIdentifier_singleQuoted", 57, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        StringBuilder sb;
        C1468e0 c1468e0 = EnumC1484j1.f3423a;
        char cM3662f = c1455a.m3662f();
        if (cM3662f != 0) {
            if (cM3662f == '\'') {
                c1441t.m3636v(EnumC1484j1.f3436g0);
                return;
            }
            if (cM3662f == '>') {
                c1441t.m3632r(this);
            } else if (cM3662f != 65535) {
                sb = c1441t.f3356m.f3323f;
            } else {
                c1441t.m3631q(this);
            }
            c1441t.f3356m.f3325h = true;
            c1441t.m3629o();
            c1441t.m3636v(c1468e0);
            return;
        }
        c1441t.m3632r(this);
        sb = c1441t.f3356m.f3323f;
        cM3662f = 65533;
        sb.append(cM3662f);
    }
}
