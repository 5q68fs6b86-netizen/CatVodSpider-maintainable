package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.N0 */
/* JADX INFO: loaded from: classes.dex */
final class C1431N0 extends EnumC1484j1 {
    C1431N0() {
        super("Doctype", 50, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        C1433O0 c1433o0 = EnumC1484j1.f3422Z;
        char cM3662f = c1455a.m3662f();
        if (cM3662f != '\t' && cM3662f != '\n' && cM3662f != '\f' && cM3662f != '\r' && cM3662f != ' ') {
            if (cM3662f != '>') {
                if (cM3662f != 65535) {
                    c1441t.m3632r(this);
                } else {
                    c1441t.m3631q(this);
                }
            }
            c1441t.m3632r(this);
            c1441t.m3621g();
            c1441t.f3356m.f3325h = true;
            c1441t.m3629o();
            c1441t.m3636v(EnumC1484j1.f3423a);
            return;
        }
        c1441t.m3636v(c1433o0);
    }
}
