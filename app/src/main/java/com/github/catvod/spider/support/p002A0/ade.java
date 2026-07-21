package com.github.catvod.spider.support.p002A0;

/* JADX INFO: loaded from: classes.dex */
public final class ade extends C0579rf {

    /* JADX INFO: renamed from: a */
    public C0642to f602a;

    @Override // com.github.catvod.spider.support.p002A0.C0579rf, com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public final Object mo874b(C0676uv c0676uv) {
        if (!(c0676uv instanceof C0676uv)) {
            return c0676uv.m1737f(this);
        }
        if (((ade) m1631k(ade.class)) == null || ((ade) m1631k(ade.class)).m1634n()) {
            return (C0133as) ((C0139ay) m1631k(C0139ay.class)).mo874b(c0676uv);
        }
        C0133as c0133as = (C0133as) ((C0139ay) m1631k(C0139ay.class)).mo874b(c0676uv);
        C0133as c0133as2 = (C0133as) ((ade) m1631k(ade.class)).mo874b(c0676uv);
        switch (this.f602a.f1544a) {
            case 17:
                return C0133as.m1010d(Double.valueOf(c0133as2.m1013g().doubleValue() * c0133as.m1013g().doubleValue()));
            case 18:
                return C0133as.m1010d(Double.valueOf(c0133as.m1013g().doubleValue() / c0133as2.m1013g().doubleValue()));
            case 19:
                return C0133as.m1010d(Double.valueOf(c0133as.m1013g().doubleValue() % c0133as2.m1013g().doubleValue()));
            default:
                throw new C0649tv("syntax error, " + mo1128c());
        }
    }
}
