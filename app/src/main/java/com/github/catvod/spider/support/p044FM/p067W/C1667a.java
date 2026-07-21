package com.github.catvod.spider.support.p044FM.p067W;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p066V.C1665f;
import com.github.catvod.spider.support.p044FM.p066V.InterfaceC1660a;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p067W.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1667a implements InterfaceC1660a {
    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1660a
    /* JADX INFO: renamed from: a */
    public final C1665f mo3954a(C1551g c1551g) {
        LinkedList linkedList = new LinkedList();
        for (C1393m c1393m : c1551g) {
            linkedList.addAll(c1393m.m3474l0());
            linkedList.add(c1393m);
        }
        return new C1665f(new C1551g(linkedList));
    }

    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1660a
    public final String name() {
        return "ancestor-or-self";
    }
}
