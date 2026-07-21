package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.v0 */
/* JADX INFO: loaded from: classes.dex */
final class C1510v0 extends EnumC1484j1 {
    C1510v0() {
        super("AttributeName", 34, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        EnumC1484j1 enumC1484j1;
        C1468e0 c1468e0 = EnumC1484j1.f3423a;
        c1441t.f3354k.m3575l(c1455a.m3674r(EnumC1484j1.f3454p0));
        char cM3662f = c1455a.m3662f();
        if (cM3662f != '\t' && cM3662f != '\n' && cM3662f != '\f' && cM3662f != '\r' && cM3662f != ' ') {
            if (cM3662f == '\"' || cM3662f == '\'') {
                c1441t.m3632r(this);
            } else {
                if (cM3662f != '/') {
                    if (cM3662f != 65535) {
                        switch (cM3662f) {
                            case '<':
                                c1441t.m3632r(this);
                                break;
                            case '=':
                                enumC1484j1 = EnumC1484j1.f3407K;
                                break;
                            case '>':
                                c1441t.m3630p();
                                break;
                        }
                    }
                    c1441t.m3631q(this);
                    c1441t.m3636v(c1468e0);
                    return;
                }
                enumC1484j1 = EnumC1484j1.f3412P;
            }
            c1441t.f3354k.m3574k(cM3662f);
            return;
        }
        enumC1484j1 = EnumC1484j1.f3406J;
        c1441t.m3636v(enumC1484j1);
    }
}
