package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.Z */
/* JADX INFO: loaded from: classes.dex */
final class C1117Z extends EnumC1142h1 {
    C1117Z() {
        super("ScriptDataLessthanSign", 16, null);
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        EnumC1142h1 enumC1142h1;
        char cM2902e = c1119a.m2902e();
        if (cM2902e == '!') {
            c1100q.m2877k("<!");
            enumC1142h1 = EnumC1142h1.f2809v;
        } else if (cM2902e != '/') {
            c1100q.m2877k("<");
            if (cM2902e != 65535) {
                c1119a.m2898G();
                enumC1142h1 = EnumC1142h1.f2781h;
            } else {
                c1100q.m2882p(this);
                enumC1142h1 = EnumC1142h1.f2771c;
            }
        } else {
            c1100q.m2874h();
            enumC1142h1 = EnumC1142h1.f2805t;
        }
        c1100q.m2887u(enumC1142h1);
    }
}
