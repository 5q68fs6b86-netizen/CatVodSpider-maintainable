package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.w0 */
/* JADX INFO: loaded from: classes.dex */
final class C1512w0 extends EnumC1484j1 {
    C1512w0() {
        super("AfterAttributeName", 35, null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        EnumC1484j1 enumC1484j1;
        C1468e0 c1468e0 = EnumC1484j1.f3423a;
        C1510v0 c1510v0 = EnumC1484j1.f3405I;
        char cM3662f = c1455a.m3662f();
        if (cM3662f == 0) {
            c1441t.m3632r(this);
            c1441t.f3354k.m3574k((char) 65533);
        } else {
            if (cM3662f == ' ') {
                return;
            }
            if (cM3662f != '\"' && cM3662f != '\'') {
                if (cM3662f != '/') {
                    if (cM3662f != 65535) {
                        if (cM3662f == '\t' || cM3662f == '\n' || cM3662f == '\f' || cM3662f == '\r') {
                            return;
                        }
                        switch (cM3662f) {
                            case '<':
                                c1441t.m3632r(this);
                                c1441t.f3354k.m3586x();
                                c1441t.f3354k.m3574k(cM3662f);
                                break;
                            case '=':
                                enumC1484j1 = EnumC1484j1.f3407K;
                                break;
                            case '>':
                                c1441t.m3630p();
                                break;
                            default:
                                c1441t.f3354k.m3586x();
                                c1455a.m3657P();
                                break;
                        }
                    }
                    c1441t.m3631q(this);
                    c1441t.m3636v(c1468e0);
                    return;
                }
                enumC1484j1 = EnumC1484j1.f3412P;
                c1441t.m3636v(enumC1484j1);
                return;
            }
            c1441t.m3632r(this);
            c1441t.f3354k.m3586x();
            c1441t.f3354k.m3574k(cM3662f);
        }
        c1441t.m3636v(c1510v0);
    }
}
