package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.i0 */
/* JADX INFO: loaded from: classes.dex */
final enum C1144i0 extends EnumC1142h1 {
    C1144i0() {
        super("ScriptDataEscapedLessthanSign", 24, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        EnumC1142h1 enumC1142h1;
        if (c1119a.m2894C()) {
            c1100q.m2874h();
            c1100q.f2706h.append(c1119a.m2916s());
            c1100q.m2877k("<");
            c1100q.m2875i(c1119a.m2916s());
            enumC1142h1 = EnumC1142h1.f2746D;
        } else if (!c1119a.m2921y('/')) {
            c1100q.m2875i('<');
            c1100q.m2887u(EnumC1142h1.f2811x);
            return;
        } else {
            c1100q.m2874h();
            enumC1142h1 = EnumC1142h1.f2744B;
        }
        c1100q.m2868a(enumC1142h1);
    }
}
