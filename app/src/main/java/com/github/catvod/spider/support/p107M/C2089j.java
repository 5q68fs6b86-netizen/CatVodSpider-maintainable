package com.github.catvod.spider.support.p107M;

import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p103I.C2060c;
import com.github.catvod.spider.support.p106L.C2078f;
import com.github.catvod.spider.support.p106L.InterfaceC2073a;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p107M.j */
/* JADX INFO: loaded from: classes.dex */
public final class C2089j implements InterfaceC2073a {
    @Override // com.github.catvod.spider.support.p106L.InterfaceC2073a
    /* JADX INFO: renamed from: a */
    public final C2078f mo5323a(C2060c c2060c) {
        LinkedList linkedList = new LinkedList();
        C2060c c2060c2 = new C2060c();
        Iterator<C2037i> it = c2060c.iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().m4890j0());
        }
        c2060c2.addAll(linkedList);
        return new C2078f(c2060c2);
    }

    @Override // com.github.catvod.spider.support.p106L.InterfaceC2073a
    public final String name() {
        return "parent";
    }
}
