package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ek */
/* JADX INFO: loaded from: classes.dex */
public final class C0233ek implements InterfaceC0769yg, Serializable {

    /* JADX INFO: renamed from: a */
    public static final C0233ek f781a = new C0233ek();

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0769yg
    public final Object fold(Object obj, InterfaceC0304ha interfaceC0304ha) {
        return obj;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0769yg
    public final InterfaceC0750xo get(InterfaceC0751xp interfaceC0751xp) {
        AbstractC0399ko.m1351f("key", interfaceC0751xp);
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0769yg
    public final InterfaceC0769yg minusKey(InterfaceC0751xp interfaceC0751xp) {
        AbstractC0399ko.m1351f("key", interfaceC0751xp);
        return this;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0769yg
    public final InterfaceC0769yg plus(InterfaceC0769yg interfaceC0769yg) {
        AbstractC0399ko.m1351f("context", interfaceC0769yg);
        return interfaceC0769yg;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
