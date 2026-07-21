package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.i0 */
/* JADX INFO: loaded from: classes.dex */
static final class C1480i0 extends EnumC1484j1 {
    C1480i0() {
        super("ScriptDataEscapedDash", 22, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        EnumC1484j1 enumC1484j1;
        C1477h0 c1477h0 = EnumC1484j1.f3463v;
        if (c1455a.m3679w()) {
            c1441t.m3631q(this);
            c1441t.m3636v(EnumC1484j1.f3423a);
            return;
        }
        char cM3662f = c1455a.m3662f();
        if (cM3662f != 0) {
            if (cM3662f == '-') {
                c1441t.m3624j(cM3662f);
                enumC1484j1 = EnumC1484j1.f3465x;
            } else if (cM3662f == '<') {
                enumC1484j1 = EnumC1484j1.f3466y;
            }
            c1441t.m3636v(enumC1484j1);
            return;
        }
        c1441t.m3632r(this);
        cM3662f = 65533;
        c1441t.m3624j(cM3662f);
        c1441t.m3636v(c1477h0);
    }
}
