package com.github.catvod.spider.support.p044FM.p067W;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p066V.C1665f;
import com.github.catvod.spider.support.p044FM.p066V.InterfaceC1660a;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p067W.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1678l implements InterfaceC1660a {
    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1660a
    /* JADX INFO: renamed from: a */
    public final C1665f mo3954a(C1551g c1551g) {
        LinkedList linkedList = new LinkedList();
        for (C1393m c1393m : c1551g) {
            if (c1393m.m3476n0() != null) {
                linkedList.add(c1393m.m3476n0());
            }
        }
        C1551g c1551g2 = new C1551g();
        c1551g2.addAll(linkedList);
        return new C1665f(c1551g2);
    }

    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1660a
    public final String name() {
        return "preceding-sibling-one";
    }
}
