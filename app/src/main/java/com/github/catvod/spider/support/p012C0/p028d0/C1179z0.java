package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.z0 */
/* JADX INFO: loaded from: classes.dex */
final enum C1179z0 extends EnumC1142h1 {
    C1179z0() {
        super("AttributeValue_unquoted", 39, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        AbstractC1094N abstractC1094N;
        C1126c0 c1126c0 = EnumC1142h1.f2771c;
        String strM2914q = c1119a.m2914q(EnumC1142h1.f2804s0);
        if (strM2914q.length() > 0) {
            c1100q.f2707i.m2834l(strM2914q);
        }
        char cM2902e = c1119a.m2902e();
        if (cM2902e != 0) {
            if (cM2902e != ' ') {
                if (cM2902e != '\"' && cM2902e != '`') {
                    if (cM2902e == 65535) {
                        c1100q.m2882p(this);
                    } else if (cM2902e != '\t' && cM2902e != '\n' && cM2902e != '\f' && cM2902e != '\r') {
                        if (cM2902e == '&') {
                            int[] iArrM2870d = c1100q.m2870d('>', true);
                            AbstractC1094N abstractC1094N2 = c1100q.f2707i;
                            if (iArrM2870d != null) {
                                abstractC1094N2.m2835m(iArrM2870d);
                                return;
                            } else {
                                abstractC1094N2.m2833k('&');
                                return;
                            }
                        }
                        if (cM2902e != '\'') {
                            switch (cM2902e) {
                                case '<':
                                case '=':
                                    c1100q.m2883q(this);
                                    break;
                                case '>':
                                    c1100q.m2881o();
                                    break;
                            }
                        }
                        c1100q.m2883q(this);
                    }
                    c1100q.m2887u(c1126c0);
                    return;
                }
                c1100q.m2883q(this);
                abstractC1094N = c1100q.f2707i;
            }
            c1100q.m2887u(EnumC1142h1.f2752J);
            return;
        }
        c1100q.m2883q(this);
        abstractC1094N = c1100q.f2707i;
        cM2902e = 65533;
        abstractC1094N.m2833k(cM2902e);
    }
}
