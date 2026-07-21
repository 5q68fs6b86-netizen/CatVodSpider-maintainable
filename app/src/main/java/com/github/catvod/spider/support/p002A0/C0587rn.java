package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.rn */
/* JADX INFO: loaded from: classes.dex */
public final class C0587rn extends C0579rf {
    @Override // com.github.catvod.spider.support.p002A0.C0579rf, com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public final Object mo874b(C0676uv c0676uv) {
        if (!(c0676uv instanceof C0676uv)) {
            return c0676uv.m1737f(this);
        }
        if (m1633m(7) == null) {
            if (!"@".equals(mo1128c())) {
                return null;
            }
            C0133as c0133asM1010d = C0133as.m1010d(null);
            c0133asM1010d.f674b = true;
            return c0133asM1010d;
        }
        String strMo1128c = m1633m(7).mo1128c();
        if (AbstractC0375jr.f1083a.get(strMo1128c) != null) {
            throw new ClassCastException();
        }
        throw new C0649tv("not support axis: " + strMo1128c);
    }
}
