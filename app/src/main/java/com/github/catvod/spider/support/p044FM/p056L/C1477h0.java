package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.h0 */
/* JADX INFO: loaded from: classes.dex */
final class C1477h0 extends EnumC1484j1 {
    C1477h0() {
        super("ScriptDataEscaped", 21, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        EnumC1484j1 enumC1484j1;
        if (c1455a.m3679w()) {
            c1441t.m3631q(this);
            c1441t.m3636v(EnumC1484j1.f3423a);
            return;
        }
        char cM3677u = c1455a.m3677u();
        if (cM3677u == 0) {
            c1441t.m3632r(this);
            c1455a.m3659a();
            c1441t.m3624j((char) 65533);
            return;
        }
        if (cM3677u == '-') {
            c1441t.m3624j('-');
            enumC1484j1 = EnumC1484j1.f3464w;
        } else {
            if (cM3677u != '<') {
                c1441t.m3626l(c1455a.m3673q('-', '<', 0));
                return;
            }
            enumC1484j1 = EnumC1484j1.f3466y;
        }
        c1441t.m3616a(enumC1484j1);
    }
}
