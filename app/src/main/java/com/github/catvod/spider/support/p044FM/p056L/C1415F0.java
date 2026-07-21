package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.F0 */
/* JADX INFO: loaded from: classes.dex */
final class C1415F0 extends EnumC1484j1 {
    C1415F0() {
        super("MarkupDeclarationOpen", 43, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        EnumC1484j1 enumC1484j1;
        if (c1455a.m3645C("--")) {
            c1441t.f3357n.mo3564h();
            enumC1484j1 = EnumC1484j1.f3415S;
        } else if (c1455a.m3646D("DOCTYPE")) {
            enumC1484j1 = EnumC1484j1.f3421Y;
        } else if (c1455a.m3645C("[CDATA[")) {
            c1441t.m3623i();
            enumC1484j1 = EnumC1484j1.f3452o0;
        } else {
            c1441t.m3632r(this);
            c1441t.m3620f();
            enumC1484j1 = EnumC1484j1.f3413Q;
        }
        c1441t.m3636v(enumC1484j1);
    }
}
