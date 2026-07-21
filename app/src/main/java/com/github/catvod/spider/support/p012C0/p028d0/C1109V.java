package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.V */
/* JADX INFO: loaded from: classes.dex */
final enum C1109V extends EnumC1142h1 {
    C1109V() {
        super("RCDATAEndTagName", 12, null);
    }

    /* JADX INFO: renamed from: h */
    private void m2888h(C1100Q c1100q, C1119a c1119a) {
        c1100q.m2877k("</");
        c1100q.m2878l(c1100q.f2706h);
        c1119a.m2898G();
        c1100q.m2887u(EnumC1142h1.f2775e);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        EnumC1142h1 enumC1142h1;
        if (c1119a.m2894C()) {
            String strM2907j = c1119a.m2907j();
            c1100q.f2707i.m2837o(strM2907j);
            c1100q.f2706h.append(strM2907j);
            return;
        }
        char cM2902e = c1119a.m2902e();
        if (cM2902e == '\t' || cM2902e == '\n' || cM2902e == '\f' || cM2902e == '\r' || cM2902e == ' ') {
            if (c1100q.m2885s()) {
                enumC1142h1 = EnumC1142h1.f2752J;
                c1100q.m2887u(enumC1142h1);
                return;
            }
            m2888h(c1100q, c1119a);
        }
        if (cM2902e == '/') {
            if (c1100q.m2885s()) {
                enumC1142h1 = EnumC1142h1.f2760R;
                c1100q.m2887u(enumC1142h1);
                return;
            }
            m2888h(c1100q, c1119a);
        }
        if (cM2902e == '>' && c1100q.m2885s()) {
            c1100q.m2881o();
            enumC1142h1 = EnumC1142h1.f2771c;
            c1100q.m2887u(enumC1142h1);
            return;
        }
        m2888h(c1100q, c1119a);
    }
}
