package com.github.catvod.spider.support.p107M;

import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p103I.C2060c;
import com.github.catvod.spider.support.p106L.C2078f;
import com.github.catvod.spider.support.p106L.InterfaceC2073a;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p107M.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2080a implements InterfaceC2073a {
    @Override // com.github.catvod.spider.support.p106L.InterfaceC2073a
    /* JADX INFO: renamed from: a */
    public final C2078f mo5323a(C2060c c2060c) {
        LinkedList linkedList = new LinkedList();
        for (C2037i c2037i : c2060c) {
            linkedList.addAll(c2037i.m4892k0());
            linkedList.add(c2037i);
        }
        return new C2078f(new C2060c(linkedList));
    }

    @Override // com.github.catvod.spider.support.p106L.InterfaceC2073a
    public final String name() {
        return "ancestor-or-self";
    }
}
