package com.github.catvod.spider.support.p002A0;

import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ue */
/* JADX INFO: loaded from: classes.dex */
public final class C0659ue extends C0579rf {
    @Override // com.github.catvod.spider.support.p002A0.C0579rf, com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public final Object mo874b(C0676uv c0676uv) {
        if (!(c0676uv instanceof C0676uv)) {
            return c0676uv.m1737f(this);
        }
        List listM1632l = m1632l(aad.class);
        if (listM1632l.size() <= 1) {
            return (C0133as) ((InterfaceC0207dl) listM1632l.get(0)).mo874b(c0676uv);
        }
        Boolean boolM1011e = ((C0133as) ((InterfaceC0207dl) listM1632l.get(0)).mo874b(c0676uv)).m1011e();
        for (int i = 1; i < listM1632l.size(); i++) {
            boolM1011e = Boolean.valueOf(boolM1011e.booleanValue() | ((C0133as) ((InterfaceC0207dl) listM1632l.get(i)).mo874b(c0676uv)).m1011e().booleanValue());
        }
        return C0133as.m1010d(boolM1011e);
    }
}
