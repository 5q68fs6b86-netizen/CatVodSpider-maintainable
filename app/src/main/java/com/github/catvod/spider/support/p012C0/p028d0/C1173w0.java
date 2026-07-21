package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.w0 */
/* JADX INFO: loaded from: classes.dex */
final enum C1173w0 extends EnumC1142h1 {
    C1173w0() {
        super("AttributeValue_doubleQuoted", 37, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        AbstractC1094N abstractC1094N;
        EnumC1142h1 enumC1142h1;
        String strM2903f = c1119a.m2903f(false);
        if (strM2903f.length() > 0) {
            c1100q.f2707i.m2834l(strM2903f);
        } else {
            c1100q.f2707i.m2843w();
        }
        char cM2902e = c1119a.m2902e();
        if (cM2902e != 0) {
            if (cM2902e == '\"') {
                enumC1142h1 = EnumC1142h1.f2759Q;
            } else {
                if (cM2902e == '&') {
                    int[] iArrM2870d = c1100q.m2870d('\"', true);
                    AbstractC1094N abstractC1094N2 = c1100q.f2707i;
                    if (iArrM2870d != null) {
                        abstractC1094N2.m2835m(iArrM2870d);
                        return;
                    } else {
                        abstractC1094N2.m2833k('&');
                        return;
                    }
                }
                if (cM2902e != 65535) {
                    abstractC1094N = c1100q.f2707i;
                } else {
                    c1100q.m2882p(this);
                    enumC1142h1 = EnumC1142h1.f2771c;
                }
            }
            c1100q.m2887u(enumC1142h1);
            return;
        }
        c1100q.m2883q(this);
        abstractC1094N = c1100q.f2707i;
        cM2902e = 65533;
        abstractC1094N.m2833k(cM2902e);
    }
}
