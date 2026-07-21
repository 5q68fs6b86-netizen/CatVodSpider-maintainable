package com.github.catvod.spider.support.p012C0.p028d0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.d0.v0 */
/* JADX INFO: loaded from: classes.dex */
final enum C1171v0 extends EnumC1142h1 {
    C1171v0() {
        super("BeforeAttributeValue", 36, null);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0051  */
    @Override // com.github.catvod.spider.support.p012C0.p028d0.EnumC1142h1
    /* JADX INFO: renamed from: g */
    final void mo2801g(C1100Q c1100q, C1119a c1119a) {
        EnumC1142h1 enumC1142h1;
        C1126c0 c1126c0 = EnumC1142h1.f2771c;
        C1179z0 c1179z0 = EnumC1142h1.f2758P;
        char cM2902e = c1119a.m2902e();
        if (cM2902e != 0) {
            if (cM2902e != ' ') {
                if (cM2902e == '\"') {
                    enumC1142h1 = EnumC1142h1.f2756N;
                } else {
                    if (cM2902e != '`') {
                        if (cM2902e == 65535) {
                            c1100q.m2882p(this);
                        } else {
                            if (cM2902e == '\t' || cM2902e == '\n' || cM2902e == '\f' || cM2902e == '\r') {
                                return;
                            }
                            if (cM2902e != '&') {
                                if (cM2902e != '\'') {
                                    switch (cM2902e) {
                                        case '<':
                                        case '=':
                                            c1100q.m2883q(this);
                                            c1100q.f2707i.m2833k(cM2902e);
                                            break;
                                        case '>':
                                            c1100q.m2883q(this);
                                            break;
                                    }
                                } else {
                                    enumC1142h1 = EnumC1142h1.f2757O;
                                }
                            }
                            c1119a.m2898G();
                        }
                        c1100q.m2881o();
                        c1100q.m2887u(c1126c0);
                        return;
                    }
                    c1100q.m2883q(this);
                    c1100q.f2707i.m2833k(cM2902e);
                }
                c1100q.m2887u(enumC1142h1);
                return;
            }
            return;
        }
        c1100q.m2883q(this);
        c1100q.f2707i.m2833k((char) 65533);
        c1100q.m2887u(c1179z0);
    }
}
