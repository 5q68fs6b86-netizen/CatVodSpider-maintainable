package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1278d;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p099y.f */
/* JADX INFO: loaded from: classes.dex */
public class C1987f implements Set<C1979b> {

    /* JADX INFO: renamed from: a */
    protected boolean f4532a;

    /* JADX INFO: renamed from: b */
    public C1985e f4533b;

    /* JADX INFO: renamed from: c */
    public final ArrayList<C1979b> f4534c;

    /* JADX INFO: renamed from: d */
    public int f4535d;

    /* JADX INFO: renamed from: e */
    protected BitSet f4536e;

    /* JADX INFO: renamed from: f */
    public boolean f4537f;

    /* JADX INFO: renamed from: g */
    public boolean f4538g;

    /* JADX INFO: renamed from: h */
    public final boolean f4539h;

    /* JADX INFO: renamed from: i */
    private int f4540i;

    public C1987f() {
        this(true);
    }

    public C1987f(boolean z) {
        this.f4532a = false;
        this.f4534c = new ArrayList<>(7);
        this.f4540i = -1;
        this.f4533b = new C1985e(0);
        this.f4539h = z;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/github/catvod/spider/support/FM/y/b;Lcom/github/catvod/spider/support/FM/A/d<Lcom/github/catvod/spider/support/FM/y/X;Lcom/github/catvod/spider/support/FM/y/X;Lcom/github/catvod/spider/support/FM/y/X;>;)Z */
    /* JADX INFO: renamed from: a */
    public final void m4772a(C1979b c1979b, C1278d c1278d) {
        if (this.f4532a) {
            throw new IllegalStateException("This set is readonly");
        }
        if (c1979b.f4526e != AbstractC2000l0.f4559a) {
            this.f4537f = true;
        }
        if (c1979b.m4766b() > 0) {
            this.f4538g = true;
        }
        C1979b c1979bM3191f = this.f4533b.m3191f(c1979b);
        if (c1979bM3191f == c1979b) {
            this.f4540i = -1;
            this.f4534c.add(c1979b);
            return;
        }
        AbstractC1974X abstractC1974XM4752g = AbstractC1974X.m4752g(c1979bM3191f.f4524c, c1979b.f4524c, !this.f4539h, c1278d);
        c1979bM3191f.f4525d = Math.max(c1979bM3191f.f4525d, c1979b.f4525d);
        if (c1979b.m4767c()) {
            c1979bM3191f.f4525d |= 1073741824;
        }
        c1979bM3191f.f4524c = abstractC1974XM4752g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        m4772a((C1979b) obj, null);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends C1979b> collection) {
        Iterator<? extends C1979b> it = collection.iterator();
        while (it.hasNext()) {
            m4772a(it.next(), null);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m4773b(AbstractC1999l abstractC1999l) {
        if (this.f4532a) {
            throw new IllegalStateException("This set is readonly");
        }
        if (this.f4533b.isEmpty()) {
            return;
        }
        for (C1979b c1979b : this.f4534c) {
            AbstractC1974X abstractC1974XM4751b = c1979b.f4524c;
            C1975Y c1975y = abstractC1999l.f4558b;
            if (c1975y != null) {
                synchronized (c1975y) {
                    abstractC1974XM4751b = AbstractC1974X.m4751b(abstractC1974XM4751b, abstractC1999l.f4558b, new IdentityHashMap());
                }
            }
            c1979b.f4524c = abstractC1974XM4751b;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (this.f4532a) {
            throw new IllegalStateException("This set is readonly");
        }
        this.f4534c.clear();
        this.f4540i = -1;
        this.f4533b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        C1985e c1985e = this.f4533b;
        if (c1985e != null) {
            return c1985e.contains(obj);
        }
        throw new UnsupportedOperationException("This method is not implemented for readonly sets.");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1987f)) {
            return false;
        }
        C1987f c1987f = (C1987f) obj;
        ArrayList<C1979b> arrayList = this.f4534c;
        return arrayList != null && arrayList.equals(c1987f.f4534c) && this.f4539h == c1987f.f4539h && this.f4535d == c1987f.f4535d && this.f4536e == c1987f.f4536e && this.f4537f == c1987f.f4537f && this.f4538g == c1987f.f4538g;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        if (!this.f4532a) {
            return this.f4534c.hashCode();
        }
        if (this.f4540i == -1) {
            this.f4540i = this.f4534c.hashCode();
        }
        return this.f4540i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f4534c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<C1979b> iterator() {
        return this.f4534c.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f4534c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.f4533b.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.f4533b.toArray(tArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4534c.toString());
        if (this.f4537f) {
            sb.append(",hasSemanticContext=");
            sb.append(this.f4537f);
        }
        if (this.f4535d != 0) {
            sb.append(",uniqueAlt=");
            sb.append(this.f4535d);
        }
        if (this.f4536e != null) {
            sb.append(",conflictingAlts=");
            sb.append(this.f4536e);
        }
        if (this.f4538g) {
            sb.append(",dipsIntoOuterContext");
        }
        return sb.toString();
    }
}
