package com.github.catvod.spider.support.p107M;

import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p103I.C2060c;
import com.github.catvod.spider.support.p106L.C2078f;
import com.github.catvod.spider.support.p106L.InterfaceC2073a;
import com.github.catvod.spider.support.p128m.C2261d;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p107M.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2090k implements InterfaceC2073a {
    @Override // com.github.catvod.spider.support.p106L.InterfaceC2073a
    /* JADX INFO: renamed from: a */
    public final C2078f mo5323a(C2060c c2060c) {
        C2060c c2060c2 = new C2060c();
        LinkedList linkedList = new LinkedList();
        for (C2037i c2037i : c2060c) {
            Iterator<C2037i> it = c2037i.m4892k0().iterator();
            while (it.hasNext()) {
                C2060c c2060cM6143c = C2261d.m6143c(it.next());
                if (c2060cM6143c != null) {
                    linkedList.addAll(c2060cM6143c);
                }
            }
            C2060c c2060cM6143c2 = C2261d.m6143c(c2037i);
            if (c2060cM6143c2 != null) {
                linkedList.addAll(c2060cM6143c2);
            }
        }
        c2060c2.addAll(linkedList);
        return new C2078f(c2060c2);
    }

    @Override // com.github.catvod.spider.support.p106L.InterfaceC2073a
    public final String name() {
        return "preceding";
    }
}
