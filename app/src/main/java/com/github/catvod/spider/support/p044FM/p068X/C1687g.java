package com.github.catvod.spider.support.p044FM.p068X;

import com.github.catvod.spider.support.p044FM.p066V.C1664e;
import com.github.catvod.spider.support.p044FM.p066V.C1665f;
import com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c;
import com.github.catvod.spider.support.p044FM.p070Z.C1710e;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p068X.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1687g implements InterfaceC1662c {
    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c
    /* JADX INFO: renamed from: a */
    public final C1665f mo3955a(C1664e c1664e, List<C1665f> list) {
        LinkedList linkedList = (LinkedList) list;
        if (linkedList.size() == 1) {
            return new C1665f(Boolean.valueOf(!((C1665f) linkedList.get(0)).m3968a().booleanValue()));
        }
        throw new C1710e("error param in not(bool) function.Please check.");
    }

    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c
    public final String name() {
        return "not";
    }
}
