package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p028d0.y0 */
/* JADX INFO: loaded from: classes.dex */
final class C1177y0 extends EnumC1142h1 {
    C1177y0() {
        super("Rcdata", 2, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        EnumC1142h1 enumC1142h1;
        char cM2916s = c1119a.m2916s();
        if (cM2916s == 0) {
            c1100q.m2883q(this);
            c1119a.m2900a();
            c1100q.m2875i((char) 65533);
            return;
        }
        if (cM2916s == '&') {
            enumC1142h1 = EnumC1142h1.f2777f;
        } else {
            if (cM2916s != '<') {
                if (cM2916s != 65535) {
                    c1100q.m2877k(c1119a.m2904g());
                    return;
                } else {
                    c1100q.m2876j(new C1088K());
                    return;
                }
            }
            enumC1142h1 = EnumC1142h1.f2791m;
        }
        c1100q.m2868a(enumC1142h1);
    }
}
