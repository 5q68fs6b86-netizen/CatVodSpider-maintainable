package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.g1 */
/* JADX INFO: loaded from: classes.dex */
static final class C1139g1 extends EnumC1142h1 {
    C1139g1() {
        super("EndTagOpen", 8, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        C1126c0 c1126c0 = EnumC1142h1.f2771c;
        if (c1119a.m2917t()) {
            c1100q.m2882p(this);
            c1100q.m2877k("</");
            c1100q.m2887u(c1126c0);
        } else {
            if (c1119a.m2894C()) {
                c1100q.m2873g(false);
                c1100q.m2887u(EnumC1142h1.f2789l);
                return;
            }
            boolean zM2921y = c1119a.m2921y('>');
            c1100q.m2883q(this);
            if (zM2921y) {
                c1100q.m2868a(c1126c0);
            } else {
                c1100q.m2871e();
                c1100q.m2868a(EnumC1142h1.f2761S);
            }
        }
    }
}
