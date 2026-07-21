package com.github.catvod.spider.support.p044FM.p067W;

import com.github.catvod.spider.support.p044FM.p045A.C1290p;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p066V.C1665f;
import com.github.catvod.spider.support.p044FM.p066V.InterfaceC1660a;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p067W.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1673g implements InterfaceC1660a {
    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1660a
    /* JADX INFO: renamed from: a */
    public final C1665f mo3954a(C1551g c1551g) {
        LinkedList linkedList = new LinkedList();
        for (C1393m c1393m : c1551g) {
            Iterator<C1393m> it = c1393m.m3474l0().iterator();
            while (it.hasNext()) {
                C1551g c1551gM3226a = C1290p.m3226a(it.next());
                if (c1551gM3226a != null) {
                    Iterator<C1393m> it2 = c1551gM3226a.iterator();
                    while (it2.hasNext()) {
                        linkedList.addAll(it2.next().m3459Z());
                    }
                }
            }
            C1551g c1551gM3226a2 = C1290p.m3226a(c1393m);
            if (c1551gM3226a2 != null) {
                Iterator<C1393m> it3 = c1551gM3226a2.iterator();
                while (it3.hasNext()) {
                    linkedList.addAll(it3.next().m3459Z());
                }
            }
        }
        return new C1665f(new C1551g(linkedList));
    }

    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1660a
    public final String name() {
        return "following";
    }
}
