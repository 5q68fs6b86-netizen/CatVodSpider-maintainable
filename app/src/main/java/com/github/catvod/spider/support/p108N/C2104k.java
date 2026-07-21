package com.github.catvod.spider.support.p108N;

import com.github.catvod.spider.support.p106L.C2077e;
import com.github.catvod.spider.support.p106L.C2078f;
import com.github.catvod.spider.support.p106L.InterfaceC2075c;
import com.github.catvod.spider.support.p139y.C2423f;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p108N.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2104k implements InterfaceC2075c {
    @Override // com.github.catvod.spider.support.p106L.InterfaceC2075c
    /* JADX INFO: renamed from: a */
    public final C2078f mo5324a(C2077e c2077e, List<C2078f> list) {
        LinkedList linkedList = (LinkedList) list;
        String strM5343g = ((C2078f) linkedList.get(0)).m5343g();
        int iMax = Math.max(((C2078f) linkedList.get(1)).m5342f().intValue() - 1, 0);
        return linkedList.get(2) != null ? new C2078f(C2423f.m6446j(strM5343g, iMax, Math.max(Math.min(((C2078f) linkedList.get(2)).m5342f().intValue() + iMax, strM5343g.length()), 0))) : new C2078f(C2423f.m6445i(strM5343g, iMax));
    }

    @Override // com.github.catvod.spider.support.p106L.InterfaceC2075c
    public final String name() {
        return "substring";
    }
}
