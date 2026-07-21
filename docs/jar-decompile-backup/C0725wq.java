package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.wq */
/* JADX INFO: loaded from: classes.dex */
public final class C0725wq extends C0579rf {

    /* JADX INFO: renamed from: a */
    public C0642to f1760a;

    @Override // com.github.catvod.spider.support.p002A0.C0579rf, com.github.catvod.spider.support.p002A0.InterfaceC0207dl
    /* JADX INFO: renamed from: b */
    public final Object mo874b(C0676uv c0676uv) {
        if (!(c0676uv instanceof C0676uv)) {
            return c0676uv.m1737f(this);
        }
        List listM1632l = m1632l(C0793zd.class);
        if (listM1632l.size() == 1) {
            return (C0133as) ((InterfaceC0207dl) listM1632l.get(0)).mo874b(c0676uv);
        }
        if (listM1632l.size() != 2) {
            throw new C0649tv("error equalityExpr near:" + mo1128c());
        }
        C0133as c0133as = (C0133as) ((InterfaceC0207dl) listM1632l.get(0)).mo874b(c0676uv);
        C0133as c0133as2 = (C0133as) ((InterfaceC0207dl) listM1632l.get(1)).mo874b(c0676uv);
        Class<?> cls = Object.class;
        if ("=".equals(this.f1760a.m1720j())) {
            Serializable serializable = c0133as.f673a;
            Class<?> cls2 = serializable == null ? cls : serializable.getClass();
            Serializable serializable2 = c0133as2.f673a;
            return cls2.equals(serializable2 != null ? serializable2.getClass() : Object.class) ? C0133as.m1010d(Boolean.valueOf(c0133as.equals(c0133as2))) : C0133as.m1010d(Boolean.valueOf(Objects.equals(c0133as.m1015i(), c0133as2.m1015i())));
        }
        Serializable serializable3 = c0133as.f673a;
        Class<?> cls3 = serializable3 == null ? cls : serializable3.getClass();
        Serializable serializable4 = c0133as2.f673a;
        return cls3.equals(serializable4 != null ? serializable4.getClass() : Object.class) ? C0133as.m1010d(Boolean.valueOf(!c0133as.equals(c0133as2))) : C0133as.m1010d(Boolean.valueOf(!Objects.equals(c0133as.m1015i(), c0133as2.m1015i())));
    }
}
