package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p028d0.u0 */
/* JADX INFO: loaded from: classes.dex */
final class C1169u0 extends EnumC1142h1 {
    C1169u0() {
        super("AfterAttributeName", 35, null);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        EnumC1142h1 enumC1142h1;
        C1126c0 c1126c0 = EnumC1142h1.f2771c;
        C1167t0 c1167t0 = EnumC1142h1.f2753K;
        char cM2902e = c1119a.m2902e();
        if (cM2902e == 0) {
            c1100q.m2883q(this);
            c1100q.f2707i.m2831i((char) 65533);
        } else {
            if (cM2902e == ' ') {
                return;
            }
            if (cM2902e != '\"' && cM2902e != '\'') {
                if (cM2902e != '/') {
                    if (cM2902e != 65535) {
                        if (cM2902e == '\t' || cM2902e == '\n' || cM2902e == '\f' || cM2902e == '\r') {
                            return;
                        }
                        switch (cM2902e) {
                            case '<':
                                c1100q.m2883q(this);
                                c1100q.f2707i.m2842u();
                                c1100q.f2707i.m2831i(cM2902e);
                                break;
                            case '=':
                                enumC1142h1 = EnumC1142h1.f2755M;
                                break;
                            case '>':
                                c1100q.m2881o();
                                break;
                            default:
                                c1100q.f2707i.m2842u();
                                c1119a.m2898G();
                                break;
                        }
                    }
                    c1100q.m2882p(this);
                    c1100q.m2887u(c1126c0);
                    return;
                }
                enumC1142h1 = EnumC1142h1.f2760R;
                c1100q.m2887u(enumC1142h1);
                return;
            }
            c1100q.m2883q(this);
            c1100q.f2707i.m2842u();
            c1100q.f2707i.m2831i(cM2902e);
        }
        c1100q.m2887u(c1167t0);
    }
}
