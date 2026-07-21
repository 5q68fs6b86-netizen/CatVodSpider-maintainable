package com.github.catvod.spider.support.p109O;

import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p106L.C2077e;
import com.github.catvod.spider.support.p106L.C2078f;
import com.github.catvod.spider.support.p106L.InterfaceC2076d;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.O.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2116e implements InterfaceC2076d {
    @Override // com.github.catvod.spider.support.p106L.InterfaceC2076d
    /* JADX INFO: renamed from: a */
    public final C2078f mo5325a(C2077e c2077e) {
        LinkedList linkedList = new LinkedList();
        Iterator<C2037i> it = c2077e.m5329a().iterator();
        while (it.hasNext()) {
            linkedList.add(it.next().mo4843u());
        }
        return new C2078f(linkedList);
    }

    @Override // com.github.catvod.spider.support.p106L.InterfaceC2076d
    public final String name() {
        return "outerHtml";
    }
}
