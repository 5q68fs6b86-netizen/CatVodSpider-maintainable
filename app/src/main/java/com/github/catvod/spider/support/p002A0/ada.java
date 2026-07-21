package com.github.catvod.spider.support.p002A0;

/* JADX INFO: loaded from: classes.dex */
public final class ada extends C0579rf {

    /* JADX INFO: renamed from: a */
    public C0642to f599a;

    @Override // com.github.catvod.spider.support.p002A0.C0579rf, com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public final Object mo874b(C0676uv c0676uv) {
        if (!(c0676uv instanceof C0676uv)) {
            return c0676uv.m1737f(this);
        }
        if (((C0441mc) m1631k(C0441mc.class)) != null && !((C0441mc) m1631k(C0441mc.class)).m1634n()) {
            return (C0133as) ((C0441mc) m1631k(C0441mc.class)).mo874b(c0676uv);
        }
        C0642to c0642to = this.f599a;
        if (c0642to == null) {
            return (C0133as) ((C0148bg) m1631k(C0148bg.class)).mo874b(c0676uv);
        }
        if ("//".equals(c0642to.m1720j())) {
            c0676uv.m1735d().f1439b = true;
        }
        return (C0133as) ((C0291go) m1631k(C0291go.class)).mo874b(c0676uv);
    }
}
