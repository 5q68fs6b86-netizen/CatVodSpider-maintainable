package com.github.catvod.spider.support.p044FM.p045A;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.A.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1276b implements Iterator<Object> {

    /* JADX INFO: renamed from: a */
    final Object[] f2989a;

    /* JADX INFO: renamed from: b */
    int f2990b = 0;

    /* JADX INFO: renamed from: c */
    boolean f2991c = true;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ C1277c f2992d;

    public C1276b(C1277c c1277c, Object[] objArr) {
        this.f2992d = c1277c;
        this.f2989a = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2990b < this.f2989a.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f2991c = false;
        Object[] objArr = this.f2989a;
        int i = this.f2990b;
        this.f2990b = i + 1;
        return objArr[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f2991c) {
            throw new IllegalStateException();
        }
        this.f2992d.remove(this.f2989a[this.f2990b - 1]);
        this.f2991c = true;
    }
}
