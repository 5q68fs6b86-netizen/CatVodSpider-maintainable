package com.github.catvod.spider.support.p044FM.p068X;

import com.github.catvod.spider.support.p044FM.p047C.C1305h;
import com.github.catvod.spider.support.p044FM.p066V.C1664e;
import com.github.catvod.spider.support.p044FM.p066V.C1665f;
import com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.X.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1694n implements InterfaceC1662c {
    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c
    /* JADX INFO: renamed from: a */
    public final C1665f mo3955a(C1664e c1664e, List<C1665f> list) {
        LinkedList linkedList = (LinkedList) list;
        String strM3974g = ((C1665f) linkedList.get(0)).m3974g();
        String strM3974g2 = ((C1665f) linkedList.get(1)).m3974g();
        if (!C1305h.m3249c(strM3974g) && strM3974g2 != null) {
            if (strM3974g2.isEmpty()) {
                strM3974g = "";
            } else {
                int iIndexOf = strM3974g.indexOf(strM3974g2);
                if (iIndexOf != -1) {
                    strM3974g = strM3974g.substring(0, iIndexOf);
                }
            }
        }
        return new C1665f(strM3974g);
    }

    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c
    public final String name() {
        return "substring-before";
    }
}
