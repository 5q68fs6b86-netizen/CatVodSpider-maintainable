package com.github.catvod.spider.support.p044FM.p069Y;

import com.github.catvod.spider.support.p044FM.p047C.C1305h;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p066V.C1664e;
import com.github.catvod.spider.support.p044FM.p066V.C1665f;
import com.github.catvod.spider.support.p044FM.p066V.InterfaceC1663d;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.Y.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1701c implements InterfaceC1663d {
    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1663d
    /* JADX INFO: renamed from: a */
    public final C1665f mo3956a(C1664e c1664e) {
        C1551g c1551g = new C1551g();
        for (C1393m c1393m : c1664e.m3960a()) {
            c1551g.addAll(c1393m.m3456V());
            String strM3471j0 = c1393m.m3471j0();
            if (C1305h.m3250d(strM3471j0)) {
                C1393m c1393m2 = new C1393m("");
                c1393m2.m3451P(strM3471j0);
                c1551g.add(c1393m2);
            }
        }
        return new C1665f(c1551g);
    }

    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1663d
    public final String name() {
        return "node";
    }
}
