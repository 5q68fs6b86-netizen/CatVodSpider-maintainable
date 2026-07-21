package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.L0 */
/* JADX INFO: loaded from: classes.dex */
final enum C1091L0 extends EnumC1142h1 {
    C1091L0() {
        super("Doctype", 50, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        C1093M0 c1093m0 = EnumC1142h1.f2770b0;
        char cM2902e = c1119a.m2902e();
        if (cM2902e != '\t' && cM2902e != '\n' && cM2902e != '\f' && cM2902e != '\r' && cM2902e != ' ') {
            if (cM2902e != '>') {
                if (cM2902e != 65535) {
                    c1100q.m2883q(this);
                } else {
                    c1100q.m2882p(this);
                }
            }
            c1100q.m2883q(this);
            c1100q.m2872f();
            c1100q.f2711m.f2684f = true;
            c1100q.m2880n();
            c1100q.m2887u(EnumC1142h1.f2771c);
            return;
        }
        c1100q.m2887u(c1093m0);
    }
}
