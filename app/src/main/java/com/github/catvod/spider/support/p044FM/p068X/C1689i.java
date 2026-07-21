package com.github.catvod.spider.support.p044FM.p068X;

import com.github.catvod.spider.support.p044FM.p066V.C1664e;
import com.github.catvod.spider.support.p044FM.p066V.C1665f;
import com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.X.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1689i implements InterfaceC1662c {
    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c
    /* JADX INFO: renamed from: a */
    public final C1665f mo3955a(C1664e c1664e, List<C1665f> list) {
        LinkedList linkedList = (LinkedList) list;
        return new C1665f(Boolean.valueOf(((C1665f) linkedList.get(0)).m3974g().startsWith(((C1665f) linkedList.get(1)).m3974g())));
    }

    @Override // com.github.catvod.spider.support.p044FM.p066V.InterfaceC1662c
    public final String name() {
        return "starts-with";
    }
}
