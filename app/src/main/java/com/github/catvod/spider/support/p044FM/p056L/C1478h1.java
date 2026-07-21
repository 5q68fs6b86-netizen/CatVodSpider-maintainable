package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.h1 */
/* JADX INFO: loaded from: classes.dex */
final class C1478h1 extends EnumC1484j1 {
    C1478h1() {
        super("TagOpen", 7, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        EnumC1484j1 enumC1484j1;
        EnumC1484j1 enumC1484j2;
        char cM3677u = c1455a.m3677u();
        if (cM3677u == '!') {
            enumC1484j1 = EnumC1484j1.f3414R;
        } else {
            if (cM3677u != '/') {
                if (cM3677u == '?') {
                    c1441t.m3620f();
                    enumC1484j2 = EnumC1484j1.f3413Q;
                } else if (c1455a.m3650H()) {
                    c1441t.m3622h(true);
                    enumC1484j2 = EnumC1484j1.f3441j;
                } else {
                    c1441t.m3632r(this);
                    c1441t.m3624j('<');
                    enumC1484j2 = EnumC1484j1.f3423a;
                }
                c1441t.m3636v(enumC1484j2);
                return;
            }
            enumC1484j1 = EnumC1484j1.f3439i;
        }
        c1441t.m3616a(enumC1484j1);
    }
}
