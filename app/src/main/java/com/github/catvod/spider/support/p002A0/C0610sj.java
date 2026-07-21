package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.sj */
/* JADX INFO: loaded from: classes.dex */
public final class C0610sj extends AbstractC0455mq implements InterfaceC0609si {

    /* JADX INFO: renamed from: q */
    public final C0150bi f1492q;

    public C0610sj(C0150bi c0150bi, C0150bi c0150bi2) {
        super(c0150bi);
        this.f1492q = c0150bi2;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0609si
    /* JADX INFO: renamed from: c */
    public final boolean mo1421c(Throwable th) {
        return ((C0150bi) this.f1263a).mo1040m(th);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0465n
    /* JADX INFO: renamed from: f */
    public final void mo992f(Throwable th) throws IllegalAccessException, InvocationTargetException {
        this.f1492q.m1037j((InterfaceC0678ux) this.f1263a);
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0569qw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) throws IllegalAccessException, InvocationTargetException {
        mo992f((Throwable) obj);
        return C0372jo.f1077i;
    }
}
