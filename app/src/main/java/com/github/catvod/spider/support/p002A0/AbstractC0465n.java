package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.n */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0465n extends C0341ik implements adh, InterfaceC0681v, InterfaceC0569qw {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0483nr f1263a;

    public AbstractC0465n(InterfaceC0483nr interfaceC0483nr) {
        this.f1263a = interfaceC0483nr;
    }

    @Override // com.github.catvod.spider.support.p002A0.adh
    /* JADX INFO: renamed from: b */
    public final void mo990b() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC0483nr interfaceC0483nr = this.f1263a;
        if (interfaceC0483nr == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.JobSupport");
        }
        C0150bi c0150bi = (C0150bi) interfaceC0483nr;
        while (true) {
            Object objM1049v = c0150bi.m1049v();
            if (!(objM1049v instanceof AbstractC0465n)) {
                if (!(objM1049v instanceof InterfaceC0681v) || ((InterfaceC0681v) objM1049v).mo1154e() == null) {
                    return;
                }
                m1316p();
                return;
            }
            if (objM1049v != this) {
                return;
            }
            C0224eb c0224eb = AbstractC0745xj.f1810g;
            do {
                atomicReferenceFieldUpdater = C0150bi.f686c;
                if (atomicReferenceFieldUpdater.compareAndSet(c0150bi, objM1049v, c0224eb)) {
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c0150bi) == objM1049v);
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0681v
    /* JADX INFO: renamed from: d */
    public final boolean mo1153d() {
        return true;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0681v
    /* JADX INFO: renamed from: e */
    public final C0804zo mo1154e() {
        return null;
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo992f(Throwable th);

    @Override // com.github.catvod.spider.support.p002A0.C0341ik
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0592rs.m1647a(this) + "[job@" + AbstractC0592rs.m1647a(this.f1263a) + ']';
    }
}
