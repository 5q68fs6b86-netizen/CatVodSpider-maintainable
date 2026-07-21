package com.github.catvod.spider.support.p012C0.p015Q;

import com.github.catvod.spider.support.C0.Q.X;
import com.github.catvod.spider.support.C0.Q.b;
import com.github.catvod.spider.support.C0.Q.e;
import com.github.catvod.spider.support.p012C0.p017S.C1000c;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.Q.f */
/* JADX INFO: loaded from: classes.dex */
public class C0991f implements Set<b> {

    /* JADX INFO: renamed from: c */
    protected boolean f2425c;

    /* JADX INFO: renamed from: d */
    public e f2426d;

    /* JADX INFO: renamed from: e */
    public final ArrayList<b> f2427e;

    /* JADX INFO: renamed from: f */
    public int f2428f;

    /* JADX INFO: renamed from: g */
    protected BitSet f2429g;

    /* JADX INFO: renamed from: h */
    public boolean f2430h;

    /* JADX INFO: renamed from: i */
    public boolean f2431i;

    /* JADX INFO: renamed from: j */
    public final boolean f2432j;

    /* JADX INFO: renamed from: k */
    private int f2433k;

    public C0991f() {
        this(true);
    }

    public C0991f(boolean z) {
        this.f2425c = false;
        this.f2427e = new ArrayList<>(7);
        this.f2433k = -1;
        this.f2426d = new e(0);
        this.f2432j = z;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/github/catvod/spider/support/C0/Q/b;Lcom/github/catvod/spider/support/C0/S/c<Lcom/github/catvod/spider/support/C0/Q/X;Lcom/github/catvod/spider/support/C0/Q/X;Lcom/github/catvod/spider/support/C0/Q/X;>;)Z */
    /* JADX INFO: renamed from: a */
    public final void m2499a(b bVar, C1000c c1000c) {
        if (this.f2425c) {
            throw new IllegalStateException("This set is readonly");
        }
        if (bVar.e != AbstractC0994l0.f2443c) {
            this.f2430h = true;
        }
        if (bVar.b() > 0) {
            this.f2431i = true;
        }
        b bVar2 = (b) this.f2426d.f(bVar);
        if (bVar2 == bVar) {
            this.f2433k = -1;
            this.f2427e.add(bVar);
            return;
        }
        X xG = X.g(bVar2.c, bVar.c, !this.f2432j, c1000c);
        bVar2.d = Math.max(bVar2.d, bVar.d);
        if (bVar.c()) {
            bVar2.d |= 1073741824;
        }
        bVar2.c = xG;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        m2499a((b) obj, null);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends b> collection) {
        Iterator<? extends b> it = collection.iterator();
        while (it.hasNext()) {
            m2499a(it.next(), null);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m2500b(AbstractC0993l abstractC0993l) {
        if (this.f2425c) {
            throw new IllegalStateException("This set is readonly");
        }
        if (this.f2426d.isEmpty()) {
            return;
        }
        for (b bVar : this.f2427e) {
            X xB = bVar.c;
            C0989Y c0989y = abstractC0993l.f2442b;
            if (c0989y != null) {
                synchronized (c0989y) {
                    xB = X.b(xB, abstractC0993l.f2442b, new IdentityHashMap());
                }
            }
            bVar.c = xB;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (this.f2425c) {
            throw new IllegalStateException("This set is readonly");
        }
        this.f2427e.clear();
        this.f2433k = -1;
        this.f2426d.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        e eVar = this.f2426d;
        if (eVar != null) {
            return eVar.contains(obj);
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
        if (!(obj instanceof C0991f)) {
            return false;
        }
        C0991f c0991f = (C0991f) obj;
        ArrayList<b> arrayList = this.f2427e;
        return arrayList != null && arrayList.equals(c0991f.f2427e) && this.f2432j == c0991f.f2432j && this.f2428f == c0991f.f2428f && this.f2429g == c0991f.f2429g && this.f2430h == c0991f.f2430h && this.f2431i == c0991f.f2431i;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        if (!this.f2425c) {
            return this.f2427e.hashCode();
        }
        if (this.f2433k == -1) {
            this.f2433k = this.f2427e.hashCode();
        }
        return this.f2433k;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f2427e.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<b> iterator() {
        return this.f2427e.iterator();
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
        return this.f2427e.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return (b[]) this.f2426d.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.f2426d.toArray(tArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2427e.toString());
        if (this.f2430h) {
            sb.append(",hasSemanticContext=");
            sb.append(this.f2430h);
        }
        if (this.f2428f != 0) {
            sb.append(",uniqueAlt=");
            sb.append(this.f2428f);
        }
        if (this.f2429g != null) {
            sb.append(",conflictingAlts=");
            sb.append(this.f2429g);
        }
        if (this.f2431i) {
            sb.append(",dipsIntoOuterContext");
        }
        return sb.toString();
    }
}
