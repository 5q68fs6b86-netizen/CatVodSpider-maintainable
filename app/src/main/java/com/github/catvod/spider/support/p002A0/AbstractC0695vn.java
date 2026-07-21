package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.vn */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0695vn {
    /* JADX INFO: renamed from: a */
    public static final aar m1749a(C0372jo c0372jo, InterfaceC0769yg interfaceC0769yg) {
        if (interfaceC0769yg.get(InterfaceC0483nr.f1290aj) == null) {
            return interfaceC0769yg.equals(C0233ek.f781a) ? c0372jo : new C0603sc(c0372jo, interfaceC0769yg, -3, 1);
        }
        throw new IllegalArgumentException(("Flow context cannot contain job in it. Had " + interfaceC0769yg).toString());
    }
}
