package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.rx */
/* JADX INFO: loaded from: classes.dex */
public final class C0597rx extends AbstractC0455mq {

    /* JADX INFO: renamed from: c */
    public static final AtomicIntegerFieldUpdater f1456c = AtomicIntegerFieldUpdater.newUpdater(C0597rx.class, "_invoked");
    private volatile int _invoked;

    /* JADX INFO: renamed from: q */
    public final AbstractC0465n f1457q;

    public C0597rx(C0150bi c0150bi, AbstractC0465n abstractC0465n) {
        super(c0150bi);
        this.f1457q = abstractC0465n;
        this._invoked = 0;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0465n
    /* JADX INFO: renamed from: f */
    public final void mo992f(Throwable th) {
        if (f1456c.compareAndSet(this, 0, 1)) {
            this.f1457q.invoke(th);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0569qw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo992f((Throwable) obj);
        return C0372jo.f1077i;
    }
}
