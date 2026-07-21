package com.github.catvod.spider.support.p108N;

import com.github.catvod.spider.support.p106L.C2077e;
import com.github.catvod.spider.support.p106L.C2078f;
import com.github.catvod.spider.support.p106L.InterfaceC2075c;
import com.github.catvod.spider.support.p139y.C2423f;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p108N.m */
/* JADX INFO: loaded from: classes.dex */
public final class C2106m implements InterfaceC2075c {
    @Override // com.github.catvod.spider.support.p106L.InterfaceC2075c
    /* JADX INFO: renamed from: a */
    public final C2078f mo5324a(C2077e c2077e, List<C2078f> list) {
        int iLastIndexOf;
        LinkedList linkedList = (LinkedList) list;
        String strM5343g = ((C2078f) linkedList.get(0)).m5343g();
        String strM5343g2 = ((C2078f) linkedList.get(1)).m5343g();
        if (!C2423f.m6439c(strM5343g)) {
            strM5343g = (C2423f.m6439c(strM5343g2) || (iLastIndexOf = strM5343g.lastIndexOf(strM5343g2)) == -1 || iLastIndexOf == strM5343g.length() - strM5343g2.length()) ? "" : strM5343g.substring(strM5343g2.length() + iLastIndexOf);
        }
        return new C2078f(strM5343g);
    }

    @Override // com.github.catvod.spider.support.p106L.InterfaceC2075c
    public final String name() {
        return "substring-after-last";
    }
}
