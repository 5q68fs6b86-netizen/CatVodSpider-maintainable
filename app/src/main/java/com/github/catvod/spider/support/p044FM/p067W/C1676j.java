package com.github.catvod.spider.support.p044FM.p067W;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p066V.C1665f;
import com.github.catvod.spider.support.p044FM.p066V.InterfaceC1660a;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.W.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1676j implements InterfaceC1660a {
    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1660a
    /* JADX INFO: renamed from: a */
    public final C1665f mo3954a(C1551g c1551g) {
        LinkedList linkedList = new LinkedList();
        C1551g c1551g2 = new C1551g();
        Iterator<C1393m> it = c1551g.iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().m3473k0());
        }
        c1551g2.addAll(linkedList);
        return new C1665f(c1551g2);
    }

    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1660a
    public final String name() {
        return "parent";
    }
}
