package com.github.catvod.spider.support.p002A0;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ye */
/* JADX INFO: loaded from: classes.dex */
public final class C0767ye extends C0579rf {
    @Override // com.github.catvod.spider.support.p002A0.C0579rf, com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public final Object mo874b(C0676uv c0676uv) {
        if (!(c0676uv instanceof C0676uv)) {
            return c0676uv.m1737f(this);
        }
        List listM1632l = m1632l(abj.class);
        if (listM1632l == null) {
            return null;
        }
        if (listM1632l.size() <= 1) {
            return (C0133as) ((InterfaceC0207dl) listM1632l.get(0)).mo874b(c0676uv);
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = listM1632l.iterator();
        while (it.hasNext()) {
            C0133as c0133as = (C0133as) ((abj) it.next()).mo874b(c0676uv);
            if (c0133as != null) {
                linkedList.add(c0133as.m1015i());
            }
        }
        return C0133as.m1010d(AbstractC0273fx.m1239e(linkedList, ":"));
    }
}
