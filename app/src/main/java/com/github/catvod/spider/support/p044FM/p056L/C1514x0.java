package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.x0 */
/* JADX INFO: loaded from: classes.dex */
final enum C1514x0 extends EnumC1484j1 {
    C1514x0() {
        super("BeforeAttributeValue", 36, null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004c  */
    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        EnumC1484j1 enumC1484j1;
        C1468e0 c1468e0 = EnumC1484j1.f3423a;
        C1407B0 c1407b0 = EnumC1484j1.f3410N;
        char cM3662f = c1455a.m3662f();
        if (cM3662f != 0) {
            if (cM3662f != ' ') {
                if (cM3662f == '\"') {
                    enumC1484j1 = EnumC1484j1.f3408L;
                } else {
                    if (cM3662f != '`') {
                        if (cM3662f == 65535) {
                            c1441t.m3631q(this);
                        } else {
                            if (cM3662f == '\t' || cM3662f == '\n' || cM3662f == '\f' || cM3662f == '\r') {
                                return;
                            }
                            if (cM3662f != '&') {
                                if (cM3662f != '\'') {
                                    switch (cM3662f) {
                                        case '<':
                                        case '=':
                                            c1441t.m3632r(this);
                                            c1441t.f3354k.m3576m(cM3662f);
                                            break;
                                        case '>':
                                            c1441t.m3632r(this);
                                            break;
                                    }
                                } else {
                                    enumC1484j1 = EnumC1484j1.f3409M;
                                }
                            }
                            c1455a.m3657P();
                        }
                        c1441t.m3630p();
                        c1441t.m3636v(c1468e0);
                        return;
                    }
                    c1441t.m3632r(this);
                    c1441t.f3354k.m3576m(cM3662f);
                }
                c1441t.m3636v(enumC1484j1);
                return;
            }
            return;
        }
        c1441t.m3632r(this);
        c1441t.f3354k.m3576m((char) 65533);
        c1441t.m3636v(c1407b0);
    }
}
