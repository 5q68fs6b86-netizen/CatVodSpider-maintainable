package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.b0 */
/* JADX INFO: loaded from: classes.dex */
final enum C1459b0 extends EnumC1484j1 {
    C1459b0() {
        super("ScriptDataLessthanSign", 16, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        EnumC1484j1 enumC1484j1;
        char cM3662f = c1455a.m3662f();
        if (cM3662f == '!') {
            c1441t.m3626l("<!");
            enumC1484j1 = EnumC1484j1.f3461t;
        } else if (cM3662f != '/') {
            c1441t.m3626l("<");
            if (cM3662f != 65535) {
                c1455a.m3657P();
                enumC1484j1 = EnumC1484j1.f3433f;
            } else {
                c1441t.m3631q(this);
                enumC1484j1 = EnumC1484j1.f3423a;
            }
        } else {
            c1441t.m3623i();
            enumC1484j1 = EnumC1484j1.f3457r;
        }
        c1441t.m3636v(enumC1484j1);
    }
}
