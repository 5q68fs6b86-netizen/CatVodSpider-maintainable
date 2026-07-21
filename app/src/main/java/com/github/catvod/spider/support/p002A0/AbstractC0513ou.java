package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ou */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0513ou {
    /* JADX INFO: renamed from: a */
    public static InterfaceC0750xo m1508a(InterfaceC0750xo interfaceC0750xo, InterfaceC0751xp interfaceC0751xp) {
        AbstractC0399ko.m1351f("key", interfaceC0751xp);
        if (AbstractC0399ko.m1347b(interfaceC0750xo.getKey(), interfaceC0751xp)) {
            return interfaceC0750xo;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC0769yg m1509b(InterfaceC0750xo interfaceC0750xo, InterfaceC0751xp interfaceC0751xp) {
        AbstractC0399ko.m1351f("key", interfaceC0751xp);
        return AbstractC0399ko.m1347b(interfaceC0750xo.getKey(), interfaceC0751xp) ? C0233ek.f781a : interfaceC0750xo;
    }
}
