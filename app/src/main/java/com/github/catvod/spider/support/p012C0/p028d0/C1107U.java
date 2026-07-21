package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.U */
/* JADX INFO: loaded from: classes.dex */
final enum C1107U extends EnumC1142h1 {
    C1107U() {
        super("RCDATAEndTagOpen", 11, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        if (!c1119a.m2894C()) {
            c1100q.m2877k("</");
            c1100q.m2887u(EnumC1142h1.f2775e);
        } else {
            c1100q.m2873g(false);
            c1100q.f2707i.m2836n(c1119a.m2916s());
            c1100q.f2706h.append(c1119a.m2916s());
            c1100q.m2868a(EnumC1142h1.f2795o);
        }
    }
}
