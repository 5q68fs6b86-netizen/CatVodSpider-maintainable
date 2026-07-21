package com.github.catvod.spider.support.p108N;

import com.github.catvod.spider.support.p106L.C2077e;
import com.github.catvod.spider.support.p106L.C2078f;
import com.github.catvod.spider.support.p106L.InterfaceC2075c;
import com.github.catvod.spider.support.p139y.C2423f;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.N.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2107n implements InterfaceC2075c {
    @Override // com.github.catvod.spider.support.p106L.InterfaceC2075c
    /* JADX INFO: renamed from: a */
    public final C2078f mo5324a(C2077e c2077e, List<C2078f> list) {
        LinkedList linkedList = (LinkedList) list;
        String strM5343g = ((C2078f) linkedList.get(0)).m5343g();
        String strM5343g2 = ((C2078f) linkedList.get(1)).m5343g();
        if (!C2423f.m6439c(strM5343g) && strM5343g2 != null) {
            if (strM5343g2.isEmpty()) {
                strM5343g = "";
            } else {
                int iIndexOf = strM5343g.indexOf(strM5343g2);
                if (iIndexOf != -1) {
                    strM5343g = strM5343g.substring(0, iIndexOf);
                }
            }
        }
        return new C2078f(strM5343g);
    }

    @Override // com.github.catvod.spider.support.p106L.InterfaceC2075c
    public final String name() {
        return "substring-before";
    }
}
