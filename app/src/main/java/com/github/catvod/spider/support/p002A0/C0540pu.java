package com.github.catvod.spider.support.p002A0;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.pu */
/* JADX INFO: loaded from: classes.dex */
public final class C0540pu implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Object[] f1374a;

    /* JADX INFO: renamed from: b */
    public int f1375b = 0;

    /* JADX INFO: renamed from: c */
    public boolean f1376c = true;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0370jm f1377d;

    public C0540pu(C0370jm c0370jm, Object[] objArr) {
        this.f1377d = c0370jm;
        this.f1374a = objArr;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f1375b < this.f1374a.length;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f1376c = false;
        int i = this.f1375b;
        this.f1375b = i + 1;
        return this.f1374a[i];
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f1376c) {
            throw new IllegalStateException();
        }
        this.f1377d.remove(this.f1374a[this.f1375b - 1]);
        this.f1376c = true;
    }
}
