package com.github.catvod.spider.support.p109O;

import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p106L.C2077e;
import com.github.catvod.spider.support.p106L.C2078f;
import com.github.catvod.spider.support.p106L.InterfaceC2076d;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p109O.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2112a implements InterfaceC2076d {
    @Override // com.github.catvod.spider.support.p106L.InterfaceC2076d
    /* JADX INFO: renamed from: a */
    public final C2078f mo5325a(C2077e c2077e) {
        LinkedList linkedList = new LinkedList();
        for (C2037i c2037i : c2077e.m5329a()) {
            linkedList.add("script".equals(c2037i.mo4832t()) ? c2037i.m4877X() : c2037i.m4902t0());
        }
        return new C2078f(linkedList);
    }

    @Override // com.github.catvod.spider.support.p106L.InterfaceC2076d
    public final String name() {
        return "allText";
    }
}
