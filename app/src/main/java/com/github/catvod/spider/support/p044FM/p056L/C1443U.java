package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.U */
/* JADX INFO: loaded from: classes.dex */
static final class C1443U extends EnumC1484j1 {
    C1443U() {
        super("TagName", 9, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        EnumC1484j1 enumC1484j1;
        C1468e0 c1468e0 = EnumC1484j1.f3423a;
        c1441t.f3354k.m3580q(c1455a.m3670n());
        char cM3662f = c1455a.m3662f();
        if (cM3662f == 0) {
            c1441t.f3354k.m3580q(EnumC1484j1.f3458r0);
            return;
        }
        if (cM3662f == ' ') {
            enumC1484j1 = EnumC1484j1.f3404H;
        } else {
            if (cM3662f != '/') {
                if (cM3662f != '<') {
                    if (cM3662f != '>') {
                        if (cM3662f != 65535) {
                            if (cM3662f != '\t' && cM3662f != '\n' && cM3662f != '\f' && cM3662f != '\r') {
                                c1441t.f3354k.m3579p(cM3662f);
                                return;
                            }
                            enumC1484j1 = EnumC1484j1.f3404H;
                        } else {
                            c1441t.m3631q(this);
                        }
                    }
                    c1441t.m3636v(c1468e0);
                    return;
                }
                c1455a.m3657P();
                c1441t.m3632r(this);
                c1441t.m3630p();
                c1441t.m3636v(c1468e0);
                return;
            }
            enumC1484j1 = EnumC1484j1.f3412P;
        }
        c1441t.m3636v(enumC1484j1);
    }
}
