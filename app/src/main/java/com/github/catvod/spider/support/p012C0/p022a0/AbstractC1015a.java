package com.github.catvod.spider.support.p012C0.p022a0;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.a0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1015a<E> extends ArrayList<E> {
    public AbstractC1015a(int i) {
        super(i);
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo2552a();

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        mo2552a();
        super.add(i, e);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        mo2552a();
        return super.add(e);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends E> collection) {
        mo2552a();
        return super.addAll(i, collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends E> collection) {
        mo2552a();
        return super.addAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        mo2552a();
        super.clear();
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        mo2552a();
        return (E) super.remove(i);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        mo2552a();
        return super.remove(obj);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        mo2552a();
        return super.removeAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        mo2552a();
        super.removeRange(i, i2);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection<?> collection) {
        mo2552a();
        return super.retainAll(collection);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        mo2552a();
        return (E) super.set(i, e);
    }
}
