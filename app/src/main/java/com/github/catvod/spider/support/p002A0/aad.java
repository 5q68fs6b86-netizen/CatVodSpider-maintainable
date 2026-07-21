package com.github.catvod.spider.support.p002A0;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class aad extends C0579rf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f426a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aad(C0579rf c0579rf, int i, int i2) {
        super(i, c0579rf);
        this.f426a = i2;
    }

    @Override // com.github.catvod.spider.support.p002A0.C0579rf, com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public final Object mo874b(C0676uv c0676uv) {
        switch (this.f426a) {
            case 0:
                if (!(c0676uv instanceof C0676uv)) {
                    return c0676uv.m1737f(this);
                }
                List listM1632l = m1632l(C0725wq.class);
                if (listM1632l.size() <= 1) {
                    return (C0133as) ((InterfaceC0207dl) listM1632l.get(0)).mo874b(c0676uv);
                }
                Boolean boolM1011e = ((C0133as) ((InterfaceC0207dl) listM1632l.get(0)).mo874b(c0676uv)).m1011e();
                for (int i = 1; i < listM1632l.size(); i++) {
                    boolM1011e = Boolean.valueOf(boolM1011e.booleanValue() & ((C0133as) ((InterfaceC0207dl) listM1632l.get(i)).mo874b(c0676uv)).m1011e().booleanValue());
                }
                return C0133as.m1010d(boolM1011e);
            default:
                return c0676uv instanceof C0676uv ? c0676uv.m1737f(this) : c0676uv.m1737f(this);
        }
    }
}
