package com.github.catvod.spider.support.p044FM.p067W;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p066V.C1665f;
import com.github.catvod.spider.support.p044FM.p066V.InterfaceC1660a;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p067W.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1671e implements InterfaceC1660a {
    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1660a
    /* JADX INFO: renamed from: a */
    public final C1665f mo3954a(C1551g c1551g) {
        HashSet hashSet = new HashSet();
        C1551g c1551g2 = new C1551g();
        Iterator<C1393m> it = c1551g.iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().m3459Z());
        }
        c1551g2.addAll(hashSet);
        return new C1665f(c1551g2);
    }

    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1660a
    public final String name() {
        return "descendant-or-self";
    }
}
