package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.s0 */
/* JADX INFO: loaded from: classes.dex */
final enum C1165s0 extends EnumC1142h1 {
    C1165s0() {
        super("BeforeAttributeName", 33, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x0055  */
    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        C1126c0 c1126c0 = EnumC1142h1.f2771c;
        C1167t0 c1167t0 = EnumC1142h1.f2753K;
        char cM2902e = c1119a.m2902e();
        if (cM2902e == 0) {
            c1119a.m2898G();
            c1100q.m2883q(this);
            c1100q.f2707i.m2842u();
        } else {
            if (cM2902e == ' ') {
                return;
            }
            if (cM2902e != '\"' && cM2902e != '\'') {
                if (cM2902e == '/') {
                    c1100q.m2887u(EnumC1142h1.f2760R);
                    return;
                }
                if (cM2902e != 65535) {
                    if (cM2902e == '\t' || cM2902e == '\n' || cM2902e == '\f' || cM2902e == '\r') {
                        return;
                    }
                    switch (cM2902e) {
                        case '<':
                            c1119a.m2898G();
                            c1100q.m2883q(this);
                            c1100q.m2881o();
                            break;
                        case '=':
                            c1100q.m2883q(this);
                            c1100q.f2707i.m2842u();
                            c1100q.f2707i.m2831i(cM2902e);
                            break;
                        case '>':
                            c1100q.m2881o();
                            break;
                        default:
                            c1100q.f2707i.m2842u();
                            c1119a.m2898G();
                            break;
                    }
                }
                c1100q.m2882p(this);
                c1100q.m2887u(c1126c0);
                return;
            }
            c1100q.m2883q(this);
            c1100q.f2707i.m2842u();
            c1100q.f2707i.m2831i(cM2902e);
        }
        c1100q.m2887u(c1167t0);
    }
}
