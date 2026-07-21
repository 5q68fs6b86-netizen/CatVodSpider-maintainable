package com.github.catvod.spider.support.p002A0;

import java.util.Objects;
import java.util.Stack;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.co */
/* JADX INFO: loaded from: classes.dex */
public final class C0183co extends C0579rf {

    /* JADX INFO: renamed from: a */
    public C0642to f714a;

    @Override // com.github.catvod.spider.support.p002A0.C0579rf, com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public final Object mo874b(C0676uv c0676uv) {
        if (!(c0676uv instanceof C0676uv)) {
            return c0676uv.m1737f(this);
        }
        Stack stack = c0676uv.f1588b;
        C0580rg c0580rg = new C0580rg(c0676uv.f1589c.f1438a);
        c0580rg.f1440c = c0676uv.m1735d();
        stack.push(c0580rg);
        if (Objects.equals(this.f714a.m1720j(), "//")) {
            c0676uv.m1735d().f1439b = true;
        }
        C0133as c0133as = (C0133as) ((C0291go) m1631k(C0291go.class)).mo874b(c0676uv);
        stack.pop();
        return c0133as;
    }
}
