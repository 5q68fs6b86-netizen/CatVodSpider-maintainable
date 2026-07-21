package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.O0 */
/* JADX INFO: loaded from: classes.dex */
final enum C1433O0 extends EnumC1484j1 {
    C1433O0() {
        super("BeforeDoctypeName", 51, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        C1435P0 c1435p0 = EnumC1484j1.f3424a0;
        if (c1455a.m3650H()) {
            c1441t.m3621g();
            c1441t.m3636v(c1435p0);
            return;
        }
        char cM3662f = c1455a.m3662f();
        if (cM3662f == 0) {
            c1441t.m3632r(this);
            c1441t.m3621g();
            c1441t.f3356m.f3321d.append((char) 65533);
        } else {
            if (cM3662f == ' ') {
                return;
            }
            if (cM3662f == 65535) {
                c1441t.m3631q(this);
                c1441t.m3621g();
                c1441t.f3356m.f3325h = true;
                c1441t.m3629o();
                c1441t.m3636v(EnumC1484j1.f3423a);
                return;
            }
            if (cM3662f == '\t' || cM3662f == '\n' || cM3662f == '\f' || cM3662f == '\r') {
                return;
            }
            c1441t.m3621g();
            c1441t.f3356m.f3321d.append(cM3662f);
        }
        c1441t.m3636v(c1435p0);
    }
}
