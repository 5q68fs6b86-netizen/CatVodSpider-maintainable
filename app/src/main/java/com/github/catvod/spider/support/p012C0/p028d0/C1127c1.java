package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.c1 */
/* JADX INFO: loaded from: classes.dex */
final class C1127c1 extends EnumC1142h1 {
    C1127c1() {
        super("CdataSection", 66, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        c1100q.f2706h.append(c1119a.m2911n());
        if (c1119a.m2919w("]]>") || c1119a.m2917t()) {
            c1100q.m2876j(new C1080G(c1100q.f2706h.toString()));
            c1100q.m2887u(EnumC1142h1.f2771c);
        }
    }
}
