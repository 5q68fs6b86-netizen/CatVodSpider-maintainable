package com.github.catvod.spider.support.p107M;

import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p103I.C2060c;
import com.github.catvod.spider.support.p106L.C2078f;
import com.github.catvod.spider.support.p106L.InterfaceC2073a;
import com.github.catvod.spider.support.p128m.C2261d;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.M.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2086g implements InterfaceC2073a {
    @Override // com.github.catvod.spider.support.p106L.InterfaceC2073a
    /* JADX INFO: renamed from: a */
    public final C2078f mo5323a(C2060c c2060c) {
        LinkedList linkedList = new LinkedList();
        for (C2037i c2037i : c2060c) {
            Iterator<C2037i> it = c2037i.m4892k0().iterator();
            while (it.hasNext()) {
                C2060c c2060cM6141a = C2261d.m6141a(it.next());
                if (c2060cM6141a != null) {
                    Iterator<C2037i> it2 = c2060cM6141a.iterator();
                    while (it2.hasNext()) {
                        linkedList.addAll(it2.next().m4879Z());
                    }
                }
            }
            C2060c c2060cM6141a2 = C2261d.m6141a(c2037i);
            if (c2060cM6141a2 != null) {
                Iterator<C2037i> it3 = c2060cM6141a2.iterator();
                while (it3.hasNext()) {
                    linkedList.addAll(it3.next().m4879Z());
                }
            }
        }
        return new C2078f(new C2060c(linkedList));
    }

    @Override // com.github.catvod.spider.support.p106L.InterfaceC2073a
    public final String name() {
        return "following";
    }
}
