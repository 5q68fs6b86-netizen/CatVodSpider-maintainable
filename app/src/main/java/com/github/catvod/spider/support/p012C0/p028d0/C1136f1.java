package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p028d0.f1 */
/* JADX INFO: loaded from: classes.dex */
final class C1136f1 extends EnumC1142h1 {
    C1136f1() {
        super("TagOpen", 7, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        EnumC1142h1 enumC1142h1;
        EnumC1142h1 enumC1142h2;
        char cM2916s = c1119a.m2916s();
        if (cM2916s == '!') {
            enumC1142h1 = EnumC1142h1.f2762T;
        } else if (cM2916s == '/') {
            enumC1142h1 = EnumC1142h1.f2787k;
        } else {
            if (cM2916s != '?') {
                if (c1119a.m2894C()) {
                    c1100q.m2873g(true);
                    enumC1142h2 = EnumC1142h1.f2789l;
                } else {
                    c1100q.m2883q(this);
                    c1100q.m2875i('<');
                    enumC1142h2 = EnumC1142h1.f2771c;
                }
                c1100q.m2887u(enumC1142h2);
                return;
            }
            c1100q.m2871e();
            enumC1142h1 = EnumC1142h1.f2761S;
        }
        c1100q.m2868a(enumC1142h1);
    }
}
