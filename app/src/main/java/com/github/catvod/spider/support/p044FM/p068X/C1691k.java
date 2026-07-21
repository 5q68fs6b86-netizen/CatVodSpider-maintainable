package com.github.catvod.spider.support.p044FM.p068X;

import com.github.catvod.spider.support.p044FM.p047C.C1305h;
import com.github.catvod.spider.support.p044FM.p066V.C1664e;
import com.github.catvod.spider.support.p044FM.p066V.C1665f;
import com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.X.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1691k implements InterfaceC1662c {
    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c
    /* JADX INFO: renamed from: a */
    public final C1665f mo3955a(C1664e c1664e, List<C1665f> list) {
        LinkedList linkedList = (LinkedList) list;
        String strM3974g = ((C1665f) linkedList.get(0)).m3974g();
        int iMax = Math.max(((C1665f) linkedList.get(1)).m3973f().intValue() - 1, 0);
        return linkedList.get(2) != null ? new C1665f(C1305h.m3256j(strM3974g, iMax, Math.max(Math.min(((C1665f) linkedList.get(2)).m3973f().intValue() + iMax, strM3974g.length()), 0))) : new C1665f(C1305h.m3255i(strM3974g, iMax));
    }

    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c
    public final String name() {
        return "substring";
    }
}
