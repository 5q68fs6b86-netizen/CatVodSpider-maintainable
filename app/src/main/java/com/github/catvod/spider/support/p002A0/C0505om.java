package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.om */
/* JADX INFO: loaded from: classes.dex */
public final class C0505om extends C0579rf {
    @Override // com.github.catvod.spider.support.p002A0.C0579rf, com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public final Object mo874b(C0676uv c0676uv) {
        if (!(c0676uv instanceof C0676uv)) {
            return c0676uv.m1737f(this);
        }
        if (((C0386kb) m1631k(C0386kb.class)) != null) {
            return (C0133as) ((C0386kb) m1631k(C0386kb.class)).mo874b(c0676uv);
        }
        if (m1633m(5) == null) {
            return null;
        }
        String strMo1128c = m1633m(5).mo1128c();
        if (AbstractC0375jr.f1084b.get(strMo1128c) != null) {
            throw new ClassCastException();
        }
        throw new C0649tv("not support nodeTest: " + strMo1128c);
    }
}
