package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.P0 */
/* JADX INFO: loaded from: classes.dex */
final enum C1435P0 extends EnumC1484j1 {
    C1435P0() {
        super("DoctypeName", 52, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        StringBuilder sb;
        C1468e0 c1468e0 = EnumC1484j1.f3423a;
        if (c1455a.m3652J()) {
            c1441t.f3356m.f3321d.append(c1455a.m3667k());
            return;
        }
        char cM3662f = c1455a.m3662f();
        if (cM3662f != 0) {
            if (cM3662f != ' ') {
                if (cM3662f != '>') {
                    if (cM3662f == 65535) {
                        c1441t.m3631q(this);
                        c1441t.f3356m.f3325h = true;
                    } else if (cM3662f != '\t' && cM3662f != '\n' && cM3662f != '\f' && cM3662f != '\r') {
                        sb = c1441t.f3356m.f3321d;
                    }
                }
                c1441t.m3629o();
                c1441t.m3636v(c1468e0);
                return;
            }
            c1441t.m3636v(EnumC1484j1.f3426b0);
            return;
        }
        c1441t.m3632r(this);
        sb = c1441t.f3356m.f3321d;
        cM3662f = 65533;
        sb.append(cM3662f);
    }
}
