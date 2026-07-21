package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p137w.AbstractC2399a;
import com.github.catvod.spider.support.p137w.C2400b;
import com.github.catvod.spider.support.p137w.C2401c;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.c */
/* JADX INFO: loaded from: classes.dex */
public class C2363c implements Set<C2361b> {

    /* JADX INFO: renamed from: a */
    protected boolean f5858a;

    /* JADX INFO: renamed from: b */
    public a f5859b;

    /* JADX INFO: renamed from: c */
    public final ArrayList<C2361b> f5860c;

    /* JADX INFO: renamed from: d */
    public int f5861d;

    /* JADX INFO: renamed from: e */
    protected BitSet f5862e;

    /* JADX INFO: renamed from: f */
    public boolean f5863f;

    /* JADX INFO: renamed from: g */
    public boolean f5864g;

    /* JADX INFO: renamed from: h */
    public final boolean f5865h;

    /* JADX INFO: renamed from: i */
    private int f5866i;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.c$a */
    public static abstract class a extends C2400b<C2361b> {
        public a(AbstractC2399a abstractC2399a) {
            super(abstractC2399a, 2);
        }

        @Override // com.github.catvod.spider.support.p137w.C2400b
        /* JADX INFO: renamed from: a */
        protected final C2361b mo6360a(Object obj) {
            if (obj instanceof C2361b) {
                return (C2361b) obj;
            }
            return null;
        }

        @Override // com.github.catvod.spider.support.p137w.C2400b
        /* JADX INFO: renamed from: c */
        protected final C2361b[] mo6361c(int i) {
            return new C2361b[i];
        }

        @Override // com.github.catvod.spider.support.p137w.C2400b
        /* JADX INFO: renamed from: d */
        protected final C2361b[][] mo6362d(int i) {
            return new C2361b[i][];
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.c$b */
    public static final class b extends AbstractC2399a {

        /* JADX INFO: renamed from: a */
        public static final b f5867a = new b();

        private b() {
        }

        @Override // com.github.catvod.spider.support.p137w.AbstractC2399a
        /* JADX INFO: renamed from: E */
        public final boolean mo6338E(Object obj, Object obj2) {
            C2361b c2361b = (C2361b) obj;
            C2361b c2361b2 = (C2361b) obj2;
            if (c2361b == c2361b2) {
                return true;
            }
            return c2361b != null && c2361b2 != null && c2361b.f5846a.f5884b == c2361b2.f5846a.f5884b && c2361b.f5847b == c2361b2.f5847b && c2361b.f5850e.equals(c2361b2.f5850e);
        }

        @Override // com.github.catvod.spider.support.p137w.AbstractC2399a
        /* JADX INFO: renamed from: F */
        public final int mo6339F(Object obj) {
            C2361b c2361b = (C2361b) obj;
            return c2361b.f5850e.hashCode() + ((((c2361b.f5846a.f5884b + 217) * 31) + c2361b.f5847b) * 31);
        }
    }

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.c$c */
    public static class c extends a {
        public c() {
            super(b.f5867a);
        }
    }

    public C2363c() {
        this(true);
    }

    public C2363c(boolean z) {
        this.f5858a = false;
        this.f5860c = new ArrayList<>(7);
        this.f5866i = -1;
        this.f5859b = new c();
        this.f5865h = z;
    }

    /* JADX WARN: Incorrect return type in method signature: (Lcom/github/catvod/spider/support/u/b;Lcom/github/catvod/spider/support/w/c<Lcom/github/catvod/spider/support/u/S;Lcom/github/catvod/spider/support/u/S;Lcom/github/catvod/spider/support/u/S;>;)Z */
    /* JADX INFO: renamed from: a */
    public final void m6358a(C2361b c2361b, C2401c c2401c) {
        if (this.f5858a) {
            throw new IllegalStateException("This set is readonly");
        }
        if (c2361b.f5850e != AbstractC2362b0.f5851a) {
            this.f5863f = true;
        }
        if (c2361b.m6351b() > 0) {
            this.f5864g = true;
        }
        C2361b c2361bM6401f = this.f5859b.m6401f(c2361b);
        if (c2361bM6401f == c2361b) {
            this.f5866i = -1;
            this.f5860c.add(c2361b);
            return;
        }
        AbstractC2351S abstractC2351SM6331g = AbstractC2351S.m6331g(c2361bM6401f.f5848c, c2361b.f5848c, !this.f5865h, c2401c);
        c2361bM6401f.f5849d = Math.max(c2361bM6401f.f5849d, c2361b.f5849d);
        if (c2361b.m6352c()) {
            c2361bM6401f.f5849d |= 1073741824;
        }
        c2361bM6401f.f5848c = abstractC2351SM6331g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        m6358a((C2361b) obj, null);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends C2361b> collection) {
        Iterator<? extends C2361b> it = collection.iterator();
        while (it.hasNext()) {
            m6358a(it.next(), null);
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m6359b(AbstractC2373h abstractC2373h) {
        if (this.f5858a) {
            throw new IllegalStateException("This set is readonly");
        }
        if (this.f5859b.isEmpty()) {
            return;
        }
        for (C2361b c2361b : this.f5860c) {
            AbstractC2351S abstractC2351SM6330b = c2361b.f5848c;
            C2352T c2352t = abstractC2373h.f5882b;
            if (c2352t != null) {
                synchronized (c2352t) {
                    abstractC2351SM6330b = AbstractC2351S.m6330b(abstractC2351SM6330b, abstractC2373h.f5882b, new IdentityHashMap());
                }
            }
            c2361b.f5848c = abstractC2351SM6330b;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        if (this.f5858a) {
            throw new IllegalStateException("This set is readonly");
        }
        this.f5860c.clear();
        this.f5866i = -1;
        this.f5859b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        a aVar = this.f5859b;
        if (aVar != null) {
            return aVar.contains(obj);
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
        if (!(obj instanceof C2363c)) {
            return false;
        }
        C2363c c2363c = (C2363c) obj;
        ArrayList<C2361b> arrayList = this.f5860c;
        return arrayList != null && arrayList.equals(c2363c.f5860c) && this.f5865h == c2363c.f5865h && this.f5861d == c2363c.f5861d && this.f5862e == c2363c.f5862e && this.f5863f == c2363c.f5863f && this.f5864g == c2363c.f5864g;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        if (!this.f5858a) {
            return this.f5860c.hashCode();
        }
        if (this.f5866i == -1) {
            this.f5866i = this.f5860c.hashCode();
        }
        return this.f5866i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f5860c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<C2361b> iterator() {
        return this.f5860c.iterator();
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
        return this.f5860c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return this.f5859b.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.f5859b.toArray(tArr);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5860c.toString());
        if (this.f5863f) {
            sb.append(",hasSemanticContext=");
            sb.append(this.f5863f);
        }
        if (this.f5861d != 0) {
            sb.append(",uniqueAlt=");
            sb.append(this.f5861d);
        }
        if (this.f5862e != null) {
            sb.append(",conflictingAlts=");
            sb.append(this.f5862e);
        }
        if (this.f5864g) {
            sb.append(",dipsIntoOuterContext");
        }
        return sb.toString();
    }
}
