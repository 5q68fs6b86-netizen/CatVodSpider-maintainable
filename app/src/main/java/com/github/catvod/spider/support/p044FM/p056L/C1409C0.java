package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.C0 */
/* JADX INFO: loaded from: classes.dex */
final class C1409C0 extends EnumC1484j1 {
    C1409C0() {
        super("AfterAttributeValue_quoted", 40, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        C1468e0 c1468e0 = EnumC1484j1.f3423a;
        C1508u0 c1508u0 = EnumC1484j1.f3404H;
        char cM3662f = c1455a.m3662f();
        if (cM3662f != '\t' && cM3662f != '\n' && cM3662f != '\f' && cM3662f != '\r' && cM3662f != ' ') {
            if (cM3662f == '/') {
                c1441t.m3636v(EnumC1484j1.f3412P);
                return;
            }
            if (cM3662f == '>') {
                c1441t.m3630p();
            } else if (cM3662f != 65535) {
                c1455a.m3657P();
                c1441t.m3632r(this);
            } else {
                c1441t.m3631q(this);
            }
            c1441t.m3636v(c1468e0);
            return;
        }
        c1441t.m3636v(c1508u0);
    }
}
