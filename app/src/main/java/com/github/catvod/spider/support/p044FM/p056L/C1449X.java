package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.X */
/* JADX INFO: loaded from: classes.dex */
final enum C1449X extends EnumC1484j1 {
    C1449X() {
        super("RCDATAEndTagName", 12, null);
    }

    /* JADX INFO: renamed from: h */
    private void m3637h(C1441T c1441t, C1455a c1455a) {
        c1441t.m3626l("</");
        c1441t.m3627m(c1441t.f3351h);
        c1455a.m3657P();
        c1441t.m3636v(EnumC1484j1.f3427c);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        EnumC1484j1 enumC1484j1;
        if (c1455a.m3650H()) {
            String strM3667k = c1455a.m3667k();
            c1441t.f3354k.m3580q(strM3667k);
            c1441t.f3351h.append(strM3667k);
            return;
        }
        char cM3662f = c1455a.m3662f();
        if (cM3662f == '\t' || cM3662f == '\n' || cM3662f == '\f' || cM3662f == '\r' || cM3662f == ' ') {
            if (c1441t.m3634t()) {
                enumC1484j1 = EnumC1484j1.f3404H;
                c1441t.m3636v(enumC1484j1);
                return;
            }
            m3637h(c1441t, c1455a);
        }
        if (cM3662f == '/') {
            if (c1441t.m3634t()) {
                enumC1484j1 = EnumC1484j1.f3412P;
                c1441t.m3636v(enumC1484j1);
                return;
            }
            m3637h(c1441t, c1455a);
        }
        if (cM3662f == '>' && c1441t.m3634t()) {
            c1441t.m3630p();
            enumC1484j1 = EnumC1484j1.f3423a;
            c1441t.m3636v(enumC1484j1);
            return;
        }
        m3637h(c1441t, c1455a);
    }
}
