package com.github.catvod.spider.support.p002A0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.zs */
/* JADX INFO: loaded from: classes.dex */
public final class C0808zs extends AbstractC0550qd {

    /* JADX INFO: renamed from: e */
    public C0804zo f1916e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0465n f1917f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0150bi f1918g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC0681v f1919h;

    public C0808zs(AbstractC0465n abstractC0465n, C0150bi c0150bi, InterfaceC0681v interfaceC0681v) {
        this.f1918g = c0150bi;
        this.f1919h = interfaceC0681v;
        this.f1917f = abstractC0465n;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0550qd
    /* JADX INFO: renamed from: c */
    public final void mo1575c(Object obj, Object obj2) {
        C0341ik c0341ik = (C0341ik) obj;
        boolean z = obj2 == null;
        C0341ik c0341ik2 = this.f1917f;
        C0341ik c0341ik3 = z ? c0341ik2 : this.f1916e;
        if (c0341ik3 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0341ik.f1010g;
            while (!atomicReferenceFieldUpdater.compareAndSet(c0341ik, this, c0341ik3)) {
                if (atomicReferenceFieldUpdater.get(c0341ik) != this) {
                    return;
                }
            }
            if (z) {
                C0341ik c0341ik4 = this.f1916e;
                AbstractC0399ko.m1348c(c0341ik4);
                c0341ik2.m1311k(c0341ik4);
            }
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0550qd
    /* JADX INFO: renamed from: d */
    public final C0737xb mo1576d(Object obj) {
        if (this.f1918g.m1049v() == this.f1919h) {
            return null;
        }
        return AbstractC0791zb.f1863a;
    }
}
