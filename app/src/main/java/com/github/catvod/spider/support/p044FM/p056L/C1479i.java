package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import com.github.catvod.spider.support.p044FM.p098x.C1932g;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.i */
/* JADX INFO: loaded from: classes.dex */
final class C1479i extends EnumC1406B {
    C1479i() {
        super("InSelect", 15, null);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1406B
    /* JADX INFO: renamed from: d */
    final boolean mo3535d(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        EnumC1406B enumC1406B = EnumC1406B.f3268d;
        int iM4675a = C1932g.m4675a(abstractC1436Q.f3337a);
        if (iM4675a == 0) {
            c1458b.m3738t(this);
            return false;
        }
        if (iM4675a == 1) {
            C1430N c1430n = (C1430N) abstractC1436Q;
            String str = c1430n.f3327e;
            if (str.equals("html")) {
                return c1458b.m3716f0(c1430n, EnumC1406B.f3271g);
            }
            if (!str.equals("option")) {
                if (!str.equals("optgroup")) {
                    if (str.equals("select")) {
                        c1458b.m3738t(this);
                        return c1458b.m3758h("select");
                    }
                    if (C1380b.m3364c(str, C1404A.f3232F)) {
                        c1458b.m3738t(this);
                        if (!c1458b.m3691G("select")) {
                            return false;
                        }
                        c1458b.m3758h("select");
                        return c1458b.mo3717g(c1430n);
                    }
                    if (str.equals("script") || str.equals("template")) {
                        return c1458b.m3716f0(abstractC1436Q, enumC1406B);
                    }
                    c1458b.m3738t(this);
                    return false;
                }
                if (c1458b.m3756b("option")) {
                    c1458b.m3758h("option");
                }
                if (c1458b.m3756b("optgroup")) {
                    c1458b.m3758h("optgroup");
                }
            } else if (c1458b.m3756b("option")) {
                c1458b.m3758h("option");
            }
            c1458b.m3693J(c1430n);
        } else if (iM4675a == 2) {
            String str2 = ((C1428M) abstractC1436Q).f3327e;
            str2.getClass();
            byte b = -1;
            switch (str2.hashCode()) {
                case -1321546630:
                    if (str2.equals("template")) {
                        b = 0;
                    }
                    break;
                case -1010136971:
                    if (str2.equals("option")) {
                        b = 1;
                    }
                    break;
                case -906021636:
                    if (str2.equals("select")) {
                        b = 2;
                    }
                    break;
                case -80773204:
                    if (str2.equals("optgroup")) {
                        b = 3;
                    }
                    break;
            }
            if (b == 0) {
                return c1458b.m3716f0(abstractC1436Q, enumC1406B);
            }
            if (b != 1) {
                if (b != 2) {
                    if (b != 3) {
                        c1458b.m3738t(this);
                        return false;
                    }
                    if (c1458b.m3756b("option") && c1458b.m3723l(c1458b.m3755a()) != null && c1458b.m3723l(c1458b.m3755a()).m3469i0().equals("optgroup")) {
                        c1458b.m3758h("option");
                    }
                    if (c1458b.m3756b("optgroup")) {
                        c1458b.m3709b0();
                    } else {
                        c1458b.m3738t(this);
                    }
                } else {
                    if (!c1458b.m3691G(str2)) {
                        c1458b.m3738t(this);
                        return false;
                    }
                    c1458b.m3711c0(str2);
                    c1458b.m3729o0();
                }
            } else if (c1458b.m3756b("option")) {
                c1458b.m3709b0();
            } else {
                c1458b.m3738t(this);
            }
        } else if (iM4675a == 3) {
            c1458b.m3695L((C1422J) abstractC1436Q);
        } else if (iM4675a == 4) {
            C1420I c1420i = (C1420I) abstractC1436Q;
            if (c1420i.m3566l().equals(EnumC1406B.f3289y)) {
                c1458b.m3738t(this);
                return false;
            }
            c1458b.m3694K(c1420i);
        } else {
            if (iM4675a != 5) {
                c1458b.m3738t(this);
                return false;
            }
            if (!c1458b.m3756b("html")) {
                c1458b.m3738t(this);
            }
        }
        return true;
    }
}
