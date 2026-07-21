package com.github.catvod.spider.support.p109O;

import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p103I.C2060c;
import com.github.catvod.spider.support.p106L.C2077e;
import com.github.catvod.spider.support.p106L.C2078f;
import com.github.catvod.spider.support.p106L.InterfaceC2076d;
import com.github.catvod.spider.support.p139y.C2423f;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p109O.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2114c implements InterfaceC2076d {
    @Override // com.github.catvod.spider.support.p106L.InterfaceC2076d
    /* JADX INFO: renamed from: a */
    public final C2078f mo5325a(C2077e c2077e) {
        C2060c c2060c = new C2060c();
        for (C2037i c2037i : c2077e.m5329a()) {
            c2060c.addAll(c2037i.m4876V());
            String strM4889i0 = c2037i.m4889i0();
            if (C2423f.m6440d(strM4889i0)) {
                C2037i c2037i2 = new C2037i("");
                c2037i2.m4872Q(strM4889i0);
                c2060c.add(c2037i2);
            }
        }
        return new C2078f(c2060c);
    }

    @Override // com.github.catvod.spider.support.p106L.InterfaceC2076d
    public final String name() {
        return "node";
    }
}
