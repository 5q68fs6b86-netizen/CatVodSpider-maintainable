package com.github.catvod.spider.support.p044FM.p056L;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.n */
/* JADX INFO: loaded from: classes.dex */
final class C1493n extends EnumC1406B {
    C1493n() {
        super("InFrameset", 19, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1406B
    /* JADX INFO: renamed from: d */
    final boolean mo3535d(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        EnumC1406B enumC1406B;
        if (EnumC1406B.m3532a(abstractC1436Q)) {
            c1458b.m3694K((C1420I) abstractC1436Q);
        } else if (abstractC1436Q.m3594c()) {
            c1458b.m3695L((C1422J) abstractC1436Q);
        } else {
            if (abstractC1436Q.m3595d()) {
                c1458b.m3738t(this);
                return false;
            }
            if (abstractC1436Q.m3598g()) {
                C1430N c1430n = (C1430N) abstractC1436Q;
                String str = c1430n.f3327e;
                str.getClass();
                switch (str) {
                    case "frameset":
                        c1458b.m3693J(c1430n);
                        break;
                    case "html":
                        enumC1406B = EnumC1406B.f3271g;
                        return c1458b.m3716f0(c1430n, enumC1406B);
                    case "frame":
                        c1458b.m3696M(c1430n);
                        break;
                    case "noframes":
                        enumC1406B = EnumC1406B.f3268d;
                        return c1458b.m3716f0(c1430n, enumC1406B);
                    default:
                        c1458b.m3738t(this);
                        return false;
                }
            } else if (abstractC1436Q.m3597f() && ((C1428M) abstractC1436Q).f3327e.equals("frameset")) {
                if (c1458b.m3756b("html")) {
                    c1458b.m3738t(this);
                    return false;
                }
                c1458b.m3709b0();
                if (!c1458b.m3756b("frameset")) {
                    c1458b.m3741u0(EnumC1406B.f3285u);
                }
            } else {
                if (!abstractC1436Q.m3596e()) {
                    c1458b.m3738t(this);
                    return false;
                }
                if (!c1458b.m3756b("html")) {
                    c1458b.m3738t(this);
                }
            }
        }
        return true;
    }
}
