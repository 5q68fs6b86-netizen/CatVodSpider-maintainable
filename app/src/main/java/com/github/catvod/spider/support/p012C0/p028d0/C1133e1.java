package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.e1 */
/* JADX INFO: loaded from: classes.dex */
final class C1133e1 extends EnumC1142h1 {
    C1133e1() {
        super("PLAINTEXT", 6, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        char cM2916s = c1119a.m2916s();
        if (cM2916s == 0) {
            c1100q.m2883q(this);
            c1119a.m2900a();
            c1100q.m2875i((char) 65533);
        } else if (cM2916s != 65535) {
            c1100q.m2877k(c1119a.m2912o((char) 0));
        } else {
            c1100q.m2876j(new C1088K());
        }
    }
}
