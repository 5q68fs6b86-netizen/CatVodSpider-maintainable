package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.go */
/* JADX INFO: loaded from: classes.dex */
public final class C0291go extends C0579rf {
    @Override // com.github.catvod.spider.support.p002A0.C0579rf, com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public final Object mo874b(C0676uv c0676uv) {
        if (!(c0676uv instanceof C0676uv)) {
            return c0676uv.m1737f(this);
        }
        C0133as c0133as = null;
        for (int i = 0; i < m1630j(); i++) {
            InterfaceC0207dl interfaceC0207dlM1629i = m1629i(i);
            if (interfaceC0207dlM1629i instanceof aax) {
                c0133as = (C0133as) ((aax) interfaceC0207dlM1629i).mo874b(c0676uv);
                Serializable serializable = c0133as.f673a;
                if (serializable instanceof C0589rp) {
                    c0676uv.m1736e((C0589rp) serializable);
                }
            } else if ("//".equals(interfaceC0207dlM1629i.mo1128c())) {
                c0676uv.m1735d().f1439b = true;
            } else {
                c0676uv.m1735d().f1439b = false;
            }
        }
        return c0133as;
    }
}
