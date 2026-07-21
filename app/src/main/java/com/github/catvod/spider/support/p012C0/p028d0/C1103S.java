package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.S */
/* JADX INFO: loaded from: classes.dex */
static final class C1103S extends EnumC1142h1 {
    C1103S() {
        super("TagName", 9, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        EnumC1142h1 enumC1142h1;
        C1126c0 c1126c0 = EnumC1142h1.f2771c;
        c1100q.f2707i.m2837o(c1119a.m2910m());
        char cM2902e = c1119a.m2902e();
        if (cM2902e == 0) {
            c1100q.f2707i.m2837o(EnumC1142h1.f2806t0);
            return;
        }
        if (cM2902e == ' ') {
            enumC1142h1 = EnumC1142h1.f2752J;
        } else {
            if (cM2902e != '/') {
                if (cM2902e != '<') {
                    if (cM2902e != '>') {
                        if (cM2902e != 65535) {
                            if (cM2902e != '\t' && cM2902e != '\n' && cM2902e != '\f' && cM2902e != '\r') {
                                c1100q.f2707i.m2836n(cM2902e);
                                return;
                            }
                            enumC1142h1 = EnumC1142h1.f2752J;
                        } else {
                            c1100q.m2882p(this);
                        }
                    }
                    c1100q.m2887u(c1126c0);
                    return;
                }
                c1119a.m2898G();
                c1100q.m2883q(this);
                c1100q.m2881o();
                c1100q.m2887u(c1126c0);
                return;
            }
            enumC1142h1 = EnumC1142h1.f2760R;
        }
        c1100q.m2887u(enumC1142h1);
    }
}
