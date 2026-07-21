package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.t0 */
/* JADX INFO: loaded from: classes.dex */
final enum C1167t0 extends EnumC1142h1 {
    C1167t0() {
        super("AttributeName", 34, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        AbstractC1094N abstractC1094N;
        EnumC1142h1 enumC1142h1;
        C1126c0 c1126c0 = EnumC1142h1.f2771c;
        c1100q.f2707i.m2832j(c1119a.m2914q(EnumC1142h1.f2802r0));
        char cM2902e = c1119a.m2902e();
        if (cM2902e != 0) {
            if (cM2902e == ' ') {
                enumC1142h1 = EnumC1142h1.f2754L;
            } else {
                if (cM2902e == '\"' || cM2902e == '\'') {
                    c1100q.m2883q(this);
                } else {
                    if (cM2902e != '/') {
                        if (cM2902e == 65535) {
                            c1100q.m2882p(this);
                        } else {
                            if (cM2902e != '\t' && cM2902e != '\n' && cM2902e != '\f' && cM2902e != '\r') {
                                switch (cM2902e) {
                                    case '<':
                                        c1100q.m2883q(this);
                                        break;
                                    case '=':
                                        enumC1142h1 = EnumC1142h1.f2755M;
                                        break;
                                    case '>':
                                        c1100q.m2881o();
                                        break;
                                }
                            }
                            enumC1142h1 = EnumC1142h1.f2754L;
                        }
                        c1100q.m2887u(c1126c0);
                        return;
                    }
                    enumC1142h1 = EnumC1142h1.f2760R;
                }
                abstractC1094N = c1100q.f2707i;
            }
            c1100q.m2887u(enumC1142h1);
            return;
        }
        c1100q.m2883q(this);
        abstractC1094N = c1100q.f2707i;
        cM2902e = 65533;
        abstractC1094N.m2831i(cM2902e);
    }
}
