package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.D0 */
/* JADX INFO: loaded from: classes.dex */
final class C1411D0 extends EnumC1484j1 {
    C1411D0() {
        super("SelfClosingStartTag", 41, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        C1468e0 c1468e0 = EnumC1484j1.f3423a;
        char cM3662f = c1455a.m3662f();
        if (cM3662f == '>') {
            c1441t.f3354k.f3335m = true;
            c1441t.m3630p();
        } else {
            if (cM3662f != 65535) {
                c1455a.m3657P();
                c1441t.m3632r(this);
                c1441t.m3636v(EnumC1484j1.f3404H);
                return;
            }
            c1441t.m3631q(this);
        }
        c1441t.m3636v(c1468e0);
    }
}
