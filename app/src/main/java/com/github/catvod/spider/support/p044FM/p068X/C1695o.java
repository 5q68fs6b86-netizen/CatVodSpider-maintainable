package com.github.catvod.spider.support.p044FM.p068X;

import com.github.catvod.spider.support.p044FM.p047C.C1305h;
import com.github.catvod.spider.support.p044FM.p066V.C1664e;
import com.github.catvod.spider.support.p044FM.p066V.C1665f;
import com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p068X.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1695o implements InterfaceC1662c {
    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c
    /* JADX INFO: renamed from: a */
    public final C1665f mo3955a(C1664e c1664e, List<C1665f> list) {
        int iLastIndexOf;
        LinkedList linkedList = (LinkedList) list;
        String strM3974g = ((C1665f) linkedList.get(0)).m3974g();
        String strM3974g2 = ((C1665f) linkedList.get(1)).m3974g();
        if (!C1305h.m3249c(strM3974g) && !C1305h.m3249c(strM3974g2) && (iLastIndexOf = strM3974g.lastIndexOf(strM3974g2)) != -1) {
            strM3974g = strM3974g.substring(0, iLastIndexOf);
        }
        return new C1665f(strM3974g);
    }

    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c
    public final String name() {
        return "substring-before-last";
    }
}
