package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: loaded from: classes.dex */
public final class acv extends C0178cj {

    /* JADX INFO: renamed from: a */
    public static final AtomicIntegerFieldUpdater f585a = AtomicIntegerFieldUpdater.newUpdater(acv.class, "_decision");
    private volatile int _decision;

    public acv(InterfaceC0769yg interfaceC0769yg, InterfaceC0747xl interfaceC0747xl) {
        super(interfaceC0769yg, interfaceC0747xl);
        this._decision = 0;
    }

    /* JADX INFO: renamed from: ao */
    public final Object m962ao() throws Throwable {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                Object objM1873j = AbstractC0745xj.m1873j(m1049v());
                if (objM1873j instanceof C0647tt) {
                    throw ((C0647tt) objM1873j).f1565c;
                }
                return objM1873j;
            }
        } while (!f585a.compareAndSet(this, 0, 1));
        return EnumC0781ys.f1859a;
    }

    @Override // com.github.catvod.spider.support.p002A0.C0178cj, com.github.catvod.spider.support.p002A0.C0150bi
    /* JADX INFO: renamed from: h */
    public final void mo963h(Object obj) {
        mo964i(obj);
    }

    @Override // com.github.catvod.spider.support.p002A0.C0178cj, com.github.catvod.spider.support.p002A0.C0150bi
    /* JADX INFO: renamed from: i */
    public final void mo964i(Object obj) {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC0552qf.m1583e(AbstractC0650tw.m1728a(obj), AbstractC0313hj.m1276a(this.f712ai));
                return;
            }
        } while (!f585a.compareAndSet(this, 0, 2));
    }
}
