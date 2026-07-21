package com.github.catvod.spider.support.p002A0;

import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.uh */
/* JADX INFO: loaded from: classes.dex */
public final class C0662uh implements Iterator, InterfaceC0717wi {

    /* JADX INFO: renamed from: a */
    public final Iterator f1567a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ acr f1568b;

    public C0662uh(acr acrVar) {
        this.f1568b = acrVar;
        this.f1567a = ((InterfaceC0319hp) acrVar.f576c).iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1567a.hasNext();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.github.catvod.spider.support.A0.qw, com.github.catvod.spider.support.A0.zy] */
    @Override // java.util.Iterator
    public final Object next() {
        return this.f1568b.f575b.invoke(this.f1567a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
