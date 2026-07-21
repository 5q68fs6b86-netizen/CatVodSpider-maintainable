package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.jn */
/* JADX INFO: loaded from: classes.dex */
public class C0371jn implements Set {

    /* JADX INFO: renamed from: d */
    public int f1063d;

    /* JADX INFO: renamed from: e */
    public BitSet f1064e;

    /* JADX INFO: renamed from: f */
    public boolean f1065f;

    /* JADX INFO: renamed from: g */
    public boolean f1066g;

    /* JADX INFO: renamed from: h */
    public final boolean f1067h;

    /* JADX INFO: renamed from: a */
    public boolean f1060a = false;

    /* JADX INFO: renamed from: c */
    public final ArrayList f1062c = new ArrayList(7);

    /* JADX INFO: renamed from: i */
    public int f1068i = -1;

    /* JADX INFO: renamed from: b */
    public C0370jm f1061b = new C0370jm(C0369jl.f1051a);

    public C0371jn(boolean z) {
        this.f1067h = z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        m1335j((C0368jk) obj, null);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            m1335j((C0368jk) it.next(), null);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (this.f1060a) {
            throw new IllegalStateException("This set is readonly");
        }
        this.f1062c.clear();
        this.f1068i = -1;
        this.f1061b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        C0370jm c0370jm = this.f1061b;
        if (c0370jm != null) {
            return c0370jm.contains(obj);
        }
        throw new UnsupportedOperationException("This method is not implemented for readonly sets.");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0371jn)) {
            return false;
        }
        C0371jn c0371jn = (C0371jn) obj;
        ArrayList arrayList = this.f1062c;
        return arrayList != null && arrayList.equals(c0371jn.f1062c) && this.f1067h == c0371jn.f1067h && this.f1063d == c0371jn.f1063d && this.f1064e == c0371jn.f1064e && this.f1065f == c0371jn.f1065f && this.f1066g == c0371jn.f1066g;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        boolean z = this.f1060a;
        ArrayList arrayList = this.f1062c;
        if (!z) {
            return arrayList.hashCode();
        }
        if (this.f1068i == -1) {
            this.f1068i = arrayList.hashCode();
        }
        return this.f1068i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f1062c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return this.f1062c.iterator();
    }

    /* JADX INFO: renamed from: j */
    public final void m1335j(C0368jk c0368jk, C0736xa c0736xa) {
        if (this.f1060a) {
            throw new IllegalStateException("This set is readonly");
        }
        if (c0368jk.f1050i != AbstractC0687vf.f1592e) {
            this.f1065f = true;
        }
        if ((c0368jk.f1049h & (-1073741825)) > 0) {
            this.f1066g = true;
        }
        C0368jk c0368jk2 = (C0368jk) this.f1061b.m1333h(c0368jk);
        if (c0368jk2 == c0368jk) {
            this.f1068i = -1;
            this.f1062c.add(c0368jk);
            return;
        }
        AbstractC0753xr abstractC0753xrM1877l = AbstractC0753xr.m1877l(c0368jk2.f1048g, c0368jk.f1048g, !this.f1067h, c0736xa);
        c0368jk2.f1049h = Math.max(c0368jk2.f1049h, c0368jk.f1049h);
        if (c0368jk.m1328j()) {
            c0368jk2.f1049h |= 1073741824;
        }
        c0368jk2.f1048g = abstractC0753xrM1877l;
    }

    /* JADX INFO: renamed from: k */
    public final void m1336k(C0504ol c0504ol) {
        if (this.f1060a) {
            throw new IllegalStateException("This set is readonly");
        }
        if (this.f1061b.isEmpty()) {
            return;
        }
        for (C0368jk c0368jk : this.f1062c) {
            AbstractC0753xr abstractC0753xrM1876k = c0368jk.f1048g;
            C0736xa c0736xa = c0504ol.f1125q;
            if (c0736xa != null) {
                synchronized (c0736xa) {
                    abstractC0753xrM1876k = AbstractC0753xr.m1876k(abstractC0753xrM1876k, c0504ol.f1125q, new IdentityHashMap());
                }
            }
            c0368jk.f1048g = abstractC0753xrM1876k;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f1062c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return (C0368jk[]) this.f1061b.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.f1061b.toArray(objArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1062c.toString());
        if (this.f1065f) {
            sb.append(",hasSemanticContext=");
            sb.append(this.f1065f);
        }
        if (this.f1063d != 0) {
            sb.append(",uniqueAlt=");
            sb.append(this.f1063d);
        }
        if (this.f1064e != null) {
            sb.append(",conflictingAlts=");
            sb.append(this.f1064e);
        }
        if (this.f1066g) {
            sb.append(",dipsIntoOuterContext");
        }
        return sb.toString();
    }
}
