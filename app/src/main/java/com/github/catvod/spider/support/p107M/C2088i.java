package com.github.catvod.spider.support.p107M;

import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p103I.C2060c;
import com.github.catvod.spider.support.p106L.C2078f;
import com.github.catvod.spider.support.p106L.InterfaceC2073a;
import com.github.catvod.spider.support.p128m.C2261d;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p107M.i */
/* JADX INFO: loaded from: classes.dex */
public final class C2088i implements InterfaceC2073a {
    @Override // com.github.catvod.spider.support.p106L.InterfaceC2073a
    /* JADX INFO: renamed from: a */
    public final C2078f mo5323a(C2060c c2060c) {
        LinkedList linkedList = new LinkedList();
        Iterator<C2037i> it = c2060c.iterator();
        while (it.hasNext()) {
            C2060c c2060cM6141a = C2261d.m6141a(it.next());
            if (c2060cM6141a != null) {
                linkedList.addAll(c2060cM6141a);
            }
        }
        C2060c c2060c2 = new C2060c();
        c2060c2.addAll(linkedList);
        return new C2078f(c2060c2);
    }

    @Override // com.github.catvod.spider.support.p106L.InterfaceC2073a
    public final String name() {
        return "following-sibling";
    }
}
