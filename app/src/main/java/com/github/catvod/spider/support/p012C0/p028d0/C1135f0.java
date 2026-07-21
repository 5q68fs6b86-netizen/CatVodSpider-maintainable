package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.f0 */
/* JADX INFO: loaded from: classes.dex */
final class C1135f0 extends EnumC1142h1 {
    C1135f0() {
        super("ScriptDataEscaped", 21, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        EnumC1142h1 enumC1142h1;
        if (c1119a.m2917t()) {
            c1100q.m2882p(this);
            c1100q.m2887u(EnumC1142h1.f2771c);
            return;
        }
        char cM2916s = c1119a.m2916s();
        if (cM2916s == 0) {
            c1100q.m2883q(this);
            c1119a.m2900a();
            c1100q.m2875i((char) 65533);
            return;
        }
        if (cM2916s == '-') {
            c1100q.m2875i('-');
            enumC1142h1 = EnumC1142h1.f2812y;
        } else {
            if (cM2916s != '<') {
                c1100q.m2877k(c1119a.m2913p('-', '<', 0));
                return;
            }
            enumC1142h1 = EnumC1142h1.f2743A;
        }
        c1100q.m2868a(enumC1142h1);
    }
}
