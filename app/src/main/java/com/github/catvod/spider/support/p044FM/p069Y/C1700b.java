package com.github.catvod.spider.support.p044FM.p069Y;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p066V.C1664e;
import com.github.catvod.spider.support.p044FM.p066V.C1665f;
import com.github.catvod.spider.support.p044FM.p066V.InterfaceC1663d;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p069Y.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1700b implements InterfaceC1663d {
    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1663d
    /* JADX INFO: renamed from: a */
    public final C1665f mo3956a(C1664e c1664e) {
        LinkedList linkedList = new LinkedList();
        Iterator<C1393m> it = c1664e.m3960a().iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().m3462c0());
        }
        return new C1665f(linkedList);
    }

    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1663d
    public final String name() {
        return "html";
    }
}
