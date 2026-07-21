package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.B0 */
/* JADX INFO: loaded from: classes.dex */
final class C1407B0 extends EnumC1484j1 {
    C1407B0() {
        super("AttributeValue_unquoted", 39, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        AbstractC1432O abstractC1432O;
        C1468e0 c1468e0 = EnumC1484j1.f3423a;
        String strM3674r = c1455a.m3674r(EnumC1484j1.f3456q0);
        if (strM3674r.length() > 0) {
            c1441t.f3354k.m3577n(strM3674r);
        }
        char cM3662f = c1455a.m3662f();
        if (cM3662f != 0) {
            if (cM3662f != ' ') {
                if (cM3662f != '\"' && cM3662f != '`') {
                    if (cM3662f == 65535) {
                        c1441t.m3631q(this);
                    } else if (cM3662f != '\t' && cM3662f != '\n' && cM3662f != '\f' && cM3662f != '\r') {
                        if (cM3662f == '&') {
                            int[] iArrM3619e = c1441t.m3619e('>', true);
                            AbstractC1432O abstractC1432O2 = c1441t.f3354k;
                            if (iArrM3619e != null) {
                                abstractC1432O2.m3578o(iArrM3619e);
                                return;
                            } else {
                                abstractC1432O2.m3576m('&');
                                return;
                            }
                        }
                        if (cM3662f != '\'') {
                            switch (cM3662f) {
                                case '<':
                                case '=':
                                    c1441t.m3632r(this);
                                    break;
                                case '>':
                                    c1441t.m3630p();
                                    break;
                            }
                        }
                        c1441t.m3632r(this);
                    }
                    c1441t.m3636v(c1468e0);
                    return;
                }
                c1441t.m3632r(this);
                abstractC1432O = c1441t.f3354k;
            }
            c1441t.m3636v(EnumC1484j1.f3404H);
            return;
        }
        c1441t.m3632r(this);
        abstractC1432O = c1441t.f3354k;
        cM3662f = 65533;
        abstractC1432O.m3576m(cM3662f);
    }
}
