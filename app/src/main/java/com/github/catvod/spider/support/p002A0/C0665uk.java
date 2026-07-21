package com.github.catvod.spider.support.p002A0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import okio.Path;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.uk */
/* JADX INFO: loaded from: classes.dex */
public final class C0665uk extends AbstractC0160bs implements Iterator, InterfaceC0747xl, InterfaceC0717wi {

    /* JADX INFO: renamed from: a */
    public int f1573a;

    /* JADX INFO: renamed from: b */
    public Path f1574b;

    /* JADX INFO: renamed from: c */
    public InterfaceC0747xl f1575c;

    /* JADX INFO: renamed from: d */
    public final RuntimeException m1730d() {
        int i = this.f1573a;
        if (i == 4) {
            return new NoSuchElementException();
        }
        if (i == 5) {
            return new IllegalStateException("Iterator has failed.");
        }
        return new IllegalStateException("Unexpected state of the iterator: " + this.f1573a);
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0747xl
    public final InterfaceC0769yg getContext() {
        return C0233ek.f781a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        while (true) {
            i = this.f1573a;
            if (i != 0) {
                break;
            }
            this.f1573a = 5;
            InterfaceC0747xl interfaceC0747xl = this.f1575c;
            AbstractC0399ko.m1348c(interfaceC0747xl);
            this.f1575c = null;
            interfaceC0747xl.resumeWith(C0372jo.f1077i);
        }
        if (i == 1) {
            AbstractC0399ko.m1348c(null);
            throw null;
        }
        if (i == 2 || i == 3) {
            return true;
        }
        if (i == 4) {
            return false;
        }
        throw m1730d();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f1573a;
        if (i == 0 || i == 1) {
            if (hasNext()) {
                return next();
            }
            throw new NoSuchElementException();
        }
        if (i == 2) {
            this.f1573a = 1;
            AbstractC0399ko.m1348c(null);
            throw null;
        }
        if (i != 3) {
            throw m1730d();
        }
        this.f1573a = 0;
        Path path = this.f1574b;
        this.f1574b = null;
        return path;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0747xl
    public final void resumeWith(Object obj) throws Throwable {
        act.m954c(obj);
        this.f1573a = 4;
    }
}
