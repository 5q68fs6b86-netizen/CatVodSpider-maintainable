package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.z0 */
/* JADX INFO: loaded from: classes.dex */
static final class C1518z0 extends EnumC1484j1 {
    C1518z0() {
        super("AttributeValue_singleQuoted", 38, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1484j1
    /* JADX INFO: renamed from: g */
    final void mo3531g(C1441T c1441t, C1455a c1455a) {
        AbstractC1432O abstractC1432O;
        EnumC1484j1 enumC1484j1;
        String strM3663g = c1455a.m3663g(true);
        if (strM3663g.length() > 0) {
            c1441t.f3354k.m3577n(strM3663g);
        } else {
            c1441t.f3354k.m3587z();
        }
        char cM3662f = c1455a.m3662f();
        if (cM3662f != 0) {
            if (cM3662f == 65535) {
                c1441t.m3631q(this);
                enumC1484j1 = EnumC1484j1.f3423a;
            } else {
                if (cM3662f == '&') {
                    int[] iArrM3619e = c1441t.m3619e('\'', true);
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
                    abstractC1432O = c1441t.f3354k;
                } else {
                    enumC1484j1 = EnumC1484j1.f3411O;
                }
            }
            c1441t.m3636v(enumC1484j1);
            return;
        }
        c1441t.m3632r(this);
        abstractC1432O = c1441t.f3354k;
        cM3662f = 65533;
        abstractC1432O.m3576m(cM3662f);
    }
}
