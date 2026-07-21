package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.vo */
/* JADX INFO: loaded from: classes.dex */
public final class C0696vo extends aco {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0747xl f1596a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0696vo(InterfaceC0769yg interfaceC0769yg, InterfaceC0304ha interfaceC0304ha) {
        super(interfaceC0769yg, false);
        this.f1596a = ((AbstractC0555qi) interfaceC0304ha).create(this, this);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0521pb
    /* JADX INFO: renamed from: an */
    public final void mo1511an() throws IllegalAccessException, InvocationTargetException {
        try {
            AbstractC0552qf.m1583e(C0372jo.f1077i, AbstractC0313hj.m1276a(this.f1596a));
        } catch (Throwable th) {
            resumeWith(act.m953b(th));
        }
    }
}
