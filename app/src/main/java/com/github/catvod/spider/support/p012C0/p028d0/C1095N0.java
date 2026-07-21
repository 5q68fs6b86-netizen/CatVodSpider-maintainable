package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.N0 */
/* JADX INFO: loaded from: classes.dex */
static final class C1095N0 extends EnumC1142h1 {
    C1095N0() {
        super("DoctypeName", 52, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        StringBuilder sb;
        C1126c0 c1126c0 = EnumC1142h1.f2771c;
        if (c1119a.m2894C()) {
            c1100q.f2711m.f2680b.append(c1119a.m2907j());
            return;
        }
        char cM2902e = c1119a.m2902e();
        if (cM2902e != 0) {
            if (cM2902e != ' ') {
                if (cM2902e != '>') {
                    if (cM2902e == 65535) {
                        c1100q.m2882p(this);
                        c1100q.f2711m.f2684f = true;
                    } else if (cM2902e != '\t' && cM2902e != '\n' && cM2902e != '\f' && cM2902e != '\r') {
                        sb = c1100q.f2711m.f2680b;
                    }
                }
                c1100q.m2880n();
                c1100q.m2887u(c1126c0);
                return;
            }
            c1100q.m2887u(EnumC1142h1.f2774d0);
            return;
        }
        c1100q.m2883q(this);
        sb = c1100q.f2711m.f2680b;
        cM2902e = 65533;
        sb.append(cM2902e);
    }
}
