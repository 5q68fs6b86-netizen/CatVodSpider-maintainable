package com.github.catvod.spider.support.p002A0;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.qg */
/* JADX INFO: loaded from: classes.dex */
public final class C0553qg implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f1402a;

    /* JADX INFO: renamed from: b */
    public int f1403b = 0;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0554qh f1404c;

    public C0553qg(C0554qh c0554qh) {
        this.f1404c = c0554qh;
        this.f1402a = c0554qh.f1405a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        C0554qh c0554qh = this.f1404c;
        if (c0554qh.f1405a != this.f1402a) {
            throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
        }
        while (true) {
            int i = this.f1403b;
            if (i >= c0554qh.f1405a || !C0554qh.m1584d(c0554qh.f1406b[i])) {
                break;
            }
            this.f1403b++;
        }
        return this.f1403b < c0554qh.f1405a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C0554qh c0554qh = this.f1404c;
        int i = c0554qh.f1405a;
        if (i != this.f1402a) {
            throw new ConcurrentModificationException("Use Iterator#remove() instead to remove attributes while iterating.");
        }
        int i2 = this.f1403b;
        if (i2 >= i) {
            throw new NoSuchElementException();
        }
        C0551qe c0551qe = new C0551qe(c0554qh.f1406b[i2], (String) c0554qh.f1407c[this.f1403b], c0554qh);
        this.f1403b++;
        return c0551qe;
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i = this.f1403b - 1;
        this.f1403b = i;
        this.f1404c.m1595o(i);
        this.f1402a--;
    }
}
