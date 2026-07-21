package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.G0 */
/* JADX INFO: loaded from: classes.dex */
final class C1081G0 extends EnumC1142h1 {
    C1081G0() {
        super("Comment", 46, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        char cM2916s = c1119a.m2916s();
        if (cM2916s == 0) {
            c1100q.m2883q(this);
            c1119a.m2900a();
            c1100q.f2712n.m2826i((char) 65533);
        } else if (cM2916s == '-') {
            c1100q.m2868a(EnumC1142h1.f2766X);
        } else {
            if (cM2916s != 65535) {
                c1100q.f2712n.m2827j(c1119a.m2913p('-', 0));
                return;
            }
            c1100q.m2882p(this);
            c1100q.m2879m();
            c1100q.m2887u(EnumC1142h1.f2771c);
        }
    }
}
