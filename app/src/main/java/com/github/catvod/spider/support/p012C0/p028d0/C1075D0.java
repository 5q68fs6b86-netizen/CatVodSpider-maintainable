package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.D0 */
/* JADX INFO: loaded from: classes.dex */
final enum C1075D0 extends EnumC1142h1 {
    C1075D0() {
        super("MarkupDeclarationOpen", 43, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        EnumC1142h1 enumC1142h1;
        if (c1119a.m2919w("--")) {
            c1100q.f2712n.mo2823g();
            enumC1142h1 = EnumC1142h1.f2763U;
        } else if (c1119a.m2920x("DOCTYPE")) {
            enumC1142h1 = EnumC1142h1.f2769a0;
        } else {
            if (!c1119a.m2919w("[CDATA[")) {
                c1100q.m2883q(this);
                c1100q.m2871e();
                c1100q.m2868a(EnumC1142h1.f2761S);
                return;
            }
            c1100q.m2874h();
            enumC1142h1 = EnumC1142h1.f2800q0;
        }
        c1100q.m2887u(enumC1142h1);
    }
}
