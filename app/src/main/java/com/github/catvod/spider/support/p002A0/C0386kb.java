package com.github.catvod.spider.support.p002A0;

import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.kb */
/* JADX INFO: loaded from: classes.dex */
public final class C0386kb extends C0579rf {
    @Override // com.github.catvod.spider.support.p002A0.C0579rf, com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public final Object mo874b(C0676uv c0676uv) {
        if (!(c0676uv instanceof C0676uv)) {
            return c0676uv.m1737f(this);
        }
        if (Marker.ANY_MARKER.equals(mo1128c())) {
            C0133as c0133asM1010d = C0133as.m1010d(Marker.ANY_MARKER);
            c0133asM1010d.m1017k();
            return c0133asM1010d;
        }
        if (((C0767ye) m1631k(C0767ye.class)) != null && !((C0767ye) m1631k(C0767ye.class)).m1634n()) {
            return (C0133as) ((C0767ye) m1631k(C0767ye.class)).mo874b(c0676uv);
        }
        if (((abj) m1631k(abj.class)) == null || ((abj) m1631k(abj.class)).m1634n()) {
            return null;
        }
        return (C0133as) ((abj) m1631k(abj.class)).mo874b(c0676uv);
    }
}
