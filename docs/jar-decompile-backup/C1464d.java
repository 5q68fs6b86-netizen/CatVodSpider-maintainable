package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p054J.C1380b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.d */
/* JADX INFO: loaded from: classes.dex */
final class C1464d extends EnumC1406B {
    C1464d() {
        super("InCaption", 10, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1406B
    /* JADX INFO: renamed from: d */
    final boolean mo3535d(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        if (abstractC1436Q.m3597f()) {
            C1428M c1428m = (C1428M) abstractC1436Q;
            if (c1428m.f3327e.equals("caption")) {
                if (!c1458b.m3692I(c1428m.f3327e)) {
                    c1458b.m3738t(this);
                    return false;
                }
                c1458b.m3744x(false);
                if (!c1458b.m3756b("caption")) {
                    c1458b.m3738t(this);
                }
                c1458b.m3711c0("caption");
                c1458b.m3727n();
                c1458b.m3741u0(EnumC1406B.f3273i);
                return true;
            }
        }
        if ((abstractC1436Q.m3598g() && C1380b.m3364c(((C1430N) abstractC1436Q).f3327e, C1404A.f3263y)) || (abstractC1436Q.m3597f() && ((C1428M) abstractC1436Q).f3327e.equals("table"))) {
            c1458b.m3738t(this);
            if (c1458b.m3758h("caption")) {
                return c1458b.mo3717g(abstractC1436Q);
            }
            return true;
        }
        if (!abstractC1436Q.m3597f() || !C1380b.m3364c(((C1428M) abstractC1436Q).f3327e, C1404A.f3236J)) {
            return c1458b.m3716f0(abstractC1436Q, EnumC1406B.f3271g);
        }
        c1458b.m3738t(this);
        return false;
    }
}
