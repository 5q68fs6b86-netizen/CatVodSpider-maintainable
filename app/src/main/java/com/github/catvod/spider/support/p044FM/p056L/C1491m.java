package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p055K.C1389i;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p056L.m */
/* JADX INFO: loaded from: classes.dex */
final class C1491m extends EnumC1406B {
    C1491m() {
        super("Initial", 0, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1406B
    /* JADX INFO: renamed from: d */
    final boolean mo3535d(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        C1503s c1503s = EnumC1406B.f3266b;
        if (EnumC1406B.m3532a(abstractC1436Q)) {
            return true;
        }
        if (abstractC1436Q.m3594c()) {
            c1458b.m3695L((C1422J) abstractC1436Q);
        } else {
            if (!abstractC1436Q.m3595d()) {
                c1458b.m3741u0(c1503s);
                return c1458b.mo3717g(abstractC1436Q);
            }
            C1424K c1424k = (C1424K) abstractC1436Q;
            C1389i c1389i = new C1389i(c1458b.f3475h.m3541d(c1424k.m3570k()), c1424k.f3323f.toString(), c1424k.f3324g.toString());
            c1389i.m3436L(c1424k.f3322e);
            c1458b.f3471d.m3448L(c1389i);
            if (c1424k.f3325h) {
                c1458b.f3471d.m3427D0();
            }
            c1458b.m3741u0(c1503s);
        }
        return true;
    }
}
