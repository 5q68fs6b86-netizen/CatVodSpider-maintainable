package com.github.catvod.spider.support.p002A0;

import java.util.AbstractList;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ro */
/* JADX INFO: loaded from: classes.dex */
public final class C0588ro implements ListIterator, InterfaceC0717wi {

    /* JADX INFO: renamed from: a */
    public final C0128an f1445a;

    /* JADX INFO: renamed from: b */
    public int f1446b;

    /* JADX INFO: renamed from: c */
    public int f1447c = -1;

    /* JADX INFO: renamed from: d */
    public int f1448d;

    public C0588ro(C0128an c0128an, int i) {
        this.f1445a = c0128an;
        this.f1446b = i;
        this.f1448d = ((AbstractList) c0128an).modCount;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        m1639e();
        int i = this.f1446b;
        this.f1446b = i + 1;
        C0128an c0128an = this.f1445a;
        c0128an.add(i, obj);
        this.f1447c = -1;
        this.f1448d = ((AbstractList) c0128an).modCount;
    }

    /* JADX INFO: renamed from: e */
    public final void m1639e() {
        if (((AbstractList) this.f1445a).modCount != this.f1448d) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f1446b < this.f1445a.f662d;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1446b > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        m1639e();
        int i = this.f1446b;
        C0128an c0128an = this.f1445a;
        if (i >= c0128an.f662d) {
            throw new NoSuchElementException();
        }
        this.f1446b = i + 1;
        this.f1447c = i;
        return c0128an.f660b[c0128an.f661c + i];
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1446b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        m1639e();
        int i = this.f1446b;
        if (i <= 0) {
            throw new NoSuchElementException();
        }
        int i2 = i - 1;
        this.f1446b = i2;
        this.f1447c = i2;
        C0128an c0128an = this.f1445a;
        return c0128an.f660b[c0128an.f661c + i2];
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1446b - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        m1639e();
        int i = this.f1447c;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.");
        }
        C0128an c0128an = this.f1445a;
        c0128an.mo998j(i);
        this.f1446b = this.f1447c;
        this.f1447c = -1;
        this.f1448d = ((AbstractList) c0128an).modCount;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        m1639e();
        int i = this.f1447c;
        if (i == -1) {
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.");
        }
        this.f1445a.set(i, obj);
    }
}
