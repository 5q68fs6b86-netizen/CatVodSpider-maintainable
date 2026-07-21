package com.github.catvod.spider.support.p002A0;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.pf */
/* JADX INFO: loaded from: classes.dex */
public final class C0525pf extends C0524pe implements ListIterator {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0527ph f1362d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0525pf(AbstractC0527ph abstractC0527ph, int i) {
        super(abstractC0527ph);
        this.f1362d = abstractC0527ph;
        C0523pd c0523pd = AbstractC0527ph.Companion;
        int size = abstractC0527ph.size();
        c0523pd.getClass();
        C0523pd.m1513b(i, size);
        this.f1360b = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f1360b > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f1360b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f1360b - 1;
        this.f1360b = i;
        return this.f1362d.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f1360b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
