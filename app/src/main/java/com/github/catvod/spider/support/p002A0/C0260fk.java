package com.github.catvod.spider.support.p002A0;

import java.util.LinkedList;
import java.util.Stack;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.fk */
/* JADX INFO: loaded from: classes.dex */
public final class C0260fk extends C0579rf {
    @Override // com.github.catvod.spider.support.p002A0.C0579rf, com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public final Object mo874b(C0676uv c0676uv) {
        if (!(c0676uv instanceof C0676uv)) {
            return c0676uv.m1737f(this);
        }
        LinkedList linkedList = new LinkedList();
        C0133as c0133as = (C0133as) ((adj) m1631k(adj.class)).mo874b(c0676uv);
        for (C0383jz c0383jz : m1632l(C0383jz.class)) {
            Stack stack = c0676uv.f1588b;
            C0580rg c0580rgM1735d = c0676uv.m1735d();
            C0580rg c0580rg = new C0580rg(c0580rgM1735d.f1438a);
            c0580rg.f1440c = c0580rgM1735d;
            stack.push(c0580rg);
            linkedList.add(c0383jz.mo874b(c0676uv));
            stack.pop();
        }
        String strM1015i = c0133as.m1015i();
        if (AbstractC0375jr.f1085c.get(strM1015i) != null) {
            throw new ClassCastException();
        }
        throw new C0649tv("not support function: " + strM1015i);
    }
}
