package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.I0 */
/* JADX INFO: loaded from: classes.dex */
static final class C1421I0 extends EnumC1484j1 {
    C1421I0() {
        super("Comment", 46, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        char cM3677u = c1455a.m3677u();
        if (cM3677u == 0) {
            c1441t.m3632r(this);
            c1455a.m3659a();
            c1441t.f3357n.m3567k((char) 65533);
        } else if (cM3677u == '-') {
            c1441t.m3616a(EnumC1484j1.f3418V);
        } else {
            if (cM3677u != 65535) {
                c1441t.f3357n.m3568l(c1455a.m3673q('-', 0));
                return;
            }
            c1441t.m3631q(this);
            c1441t.m3628n();
            c1441t.m3636v(EnumC1484j1.f3423a);
        }
    }
}
