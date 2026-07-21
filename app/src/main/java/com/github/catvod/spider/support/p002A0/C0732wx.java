package com.github.catvod.spider.support.p002A0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.wx */
/* JADX INFO: loaded from: classes.dex */
public final class C0732wx implements InterfaceC0319hp {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f1772a;

    public C0732wx(C0631td c0631td) {
        this.f1772a = new AtomicReference(c0631td);
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0319hp
    public final Iterator iterator() {
        InterfaceC0319hp interfaceC0319hp = (InterfaceC0319hp) this.f1772a.getAndSet(null);
        if (interfaceC0319hp != null) {
            return interfaceC0319hp.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
