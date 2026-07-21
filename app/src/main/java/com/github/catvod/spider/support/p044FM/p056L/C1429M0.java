package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.M0 */
/* JADX INFO: loaded from: classes.dex */
final enum C1429M0 extends EnumC1484j1 {
    C1429M0() {
        super("CommentEndBang", 49, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        C1468e0 c1468e0 = EnumC1484j1.f3423a;
        C1421I0 c1421i0 = EnumC1484j1.f3417U;
        char cM3662f = c1455a.m3662f();
        if (cM3662f != 0) {
            if (cM3662f == '-') {
                c1441t.f3357n.m3568l("--!");
                c1441t.m3636v(EnumC1484j1.f3418V);
                return;
            }
            if (cM3662f != '>') {
                if (cM3662f != 65535) {
                    C1422J c1422j = c1441t.f3357n;
                    c1422j.m3568l("--!");
                    c1422j.m3567k(cM3662f);
                } else {
                    c1441t.m3631q(this);
                }
            }
            c1441t.m3628n();
            c1441t.m3636v(c1468e0);
            return;
        }
        c1441t.m3632r(this);
        C1422J c1422j2 = c1441t.f3357n;
        c1422j2.m3568l("--!");
        c1422j2.m3567k((char) 65533);
        c1441t.m3636v(c1421i0);
    }
}
