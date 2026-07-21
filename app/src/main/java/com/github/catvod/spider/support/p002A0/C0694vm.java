package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.vm */
/* JADX INFO: loaded from: classes.dex */
public final class C0694vm extends C0579rf {
    @Override // com.github.catvod.spider.support.p002A0.C0579rf, com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public final Object mo874b(C0676uv c0676uv) {
        if (!(c0676uv instanceof C0676uv)) {
            return c0676uv.m1737f(this);
        }
        if (((C0383jz) m1631k(C0383jz.class)) != null && !((C0383jz) m1631k(C0383jz.class)).m1634n()) {
            return (C0133as) ((C0383jz) m1631k(C0383jz.class)).mo874b(c0676uv);
        }
        if (((C0260fk) m1631k(C0260fk.class)) != null && !((C0260fk) m1631k(C0260fk.class)).m1634n()) {
            return (C0133as) ((C0260fk) m1631k(C0260fk.class)).mo874b(c0676uv);
        }
        if (m1633m(39) != null) {
            C0133as c0133asM1010d = C0133as.m1010d(m1633m(39).mo1128c());
            c0133asM1010d.m1017k();
            return c0133asM1010d;
        }
        if (m1633m(6) != null) {
            String strMo1128c = m1633m(6).mo1128c();
            return C0133as.m1010d(strMo1128c == null ? null : Double.valueOf(strMo1128c));
        }
        throw new C0649tv("not support variableReference:" + mo1128c());
    }
}
