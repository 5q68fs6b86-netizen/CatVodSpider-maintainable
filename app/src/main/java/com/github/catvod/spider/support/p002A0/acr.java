package com.github.catvod.spider.support.p002A0;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class acr implements InterfaceC0319hp {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f574a = 1;

    /* JADX INFO: renamed from: b */
    public final AbstractC0814zy f575b;

    /* JADX INFO: renamed from: c */
    public final Object f576c;

    /* JADX WARN: Multi-variable type inference failed */
    public acr(InterfaceC0319hp interfaceC0319hp, InterfaceC0569qw interfaceC0569qw) {
        AbstractC0399ko.m1351f("sequence", interfaceC0319hp);
        this.f576c = interfaceC0319hp;
        this.f575b = (AbstractC0814zy) interfaceC0569qw;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public acr(String str, InterfaceC0304ha interfaceC0304ha) {
        AbstractC0399ko.m1351f("input", str);
        this.f576c = str;
        this.f575b = (AbstractC0814zy) interfaceC0304ha;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0319hp
    public final Iterator iterator() {
        switch (this.f574a) {
            case 0:
                return new acq(this);
            default:
                return new C0662uh(this);
        }
    }
}
