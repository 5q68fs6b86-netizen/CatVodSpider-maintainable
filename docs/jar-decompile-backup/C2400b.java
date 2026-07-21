package com.github.catvod.spider.support.p137w;

import com.github.catvod.spider.support.p043F.C1273a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p137w.b */
/* JADX INFO: loaded from: classes.dex */
public class C2400b<T> implements Set<T> {

    /* JADX INFO: renamed from: a */
    protected final AbstractC2399a f5942a;

    /* JADX INFO: renamed from: b */
    protected T[][] f5943b;

    /* JADX INFO: renamed from: c */
    protected int f5944c;

    /* JADX INFO: renamed from: d */
    protected int f5945d;

    /* JADX INFO: renamed from: e */
    protected int f5946e;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p137w.b$a */
    protected class a implements Iterator<T> {

        /* JADX INFO: renamed from: a */
        final T[] f5947a;

        /* JADX INFO: renamed from: b */
        int f5948b = 0;

        /* JADX INFO: renamed from: c */
        boolean f5949c = true;

        public a(T[] tArr) {
            this.f5947a = tArr;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.f5948b < this.f5947a.length;
        }

        @Override // java.util.Iterator
        public final T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f5949c = false;
            T[] tArr = this.f5947a;
            int i = this.f5948b;
            this.f5948b = i + 1;
            return tArr[i];
        }

        @Override // java.util.Iterator
        public final void remove() {
            if (this.f5949c) {
                throw new IllegalStateException();
            }
            C2400b.this.remove(this.f5947a[this.f5948b - 1]);
            this.f5949c = true;
        }
    }

    public C2400b() {
        this(null, 8);
    }

    public C2400b(AbstractC2399a abstractC2399a, int i) {
        this.f5944c = 0;
        this.f5945d = (int) Math.floor(12.0d);
        this.f5946e = 8;
        this.f5942a = abstractC2399a == null ? C2408j.f5966a : abstractC2399a;
        this.f5943b = mo6362d(16);
        this.f5946e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    protected T mo6360a(Object obj) {
        return obj;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t) {
        return m6401f(t) == t;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        boolean z = false;
        for (T t : collection) {
            if (m6401f(t) != t) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m6399b(T t) {
        if (t == null) {
            return false;
        }
        T[] tArr = this.f5943b[m6400e(t)];
        T t2 = null;
        if (tArr != null) {
            for (T t3 : tArr) {
                if (t3 == null) {
                    break;
                }
                if (this.f5942a.mo6338E(t3, t)) {
                    t2 = t3;
                    break;
                }
            }
        }
        return t2 != null;
    }

    /* JADX INFO: renamed from: c */
    protected T[] mo6361c(int i) {
        return (T[]) new Object[i];
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f5943b = mo6362d(16);
        this.f5944c = 0;
        this.f5945d = (int) Math.floor(12.0d);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return m6399b(mo6360a(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        if (!(collection instanceof C2400b)) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!m6399b(mo6360a(it.next()))) {
                    return false;
                }
            }
            return true;
        }
        for (T[] tArr : ((C2400b) collection).f5943b) {
            if (tArr != null) {
                for (T t : tArr) {
                    if (t == null) {
                        break;
                    }
                    if (!m6399b(mo6360a(t))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    protected T[][] mo6362d(int i) {
        return (T[][]) new Object[i][];
    }

    /* JADX INFO: renamed from: e */
    protected final int m6400e(T t) {
        return this.f5942a.mo6339F(t) & (this.f5943b.length - 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2400b)) {
            return false;
        }
        C2400b c2400b = (C2400b) obj;
        if (c2400b.f5944c != this.f5944c) {
            return false;
        }
        return containsAll(c2400b);
    }

    /* JADX INFO: renamed from: f */
    public final T m6401f(T t) {
        T[] tArrMo6361c;
        if (this.f5944c > this.f5945d) {
            T[][] tArr = this.f5943b;
            int length = tArr.length * 2;
            T[][] tArrMo6362d = mo6362d(length);
            int[] iArr = new int[tArrMo6362d.length];
            this.f5943b = tArrMo6362d;
            double d = length;
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            this.f5945d = (int) (d * 0.75d);
            for (T[] tArr2 : tArr) {
                if (tArr2 != null) {
                    for (T t2 : tArr2) {
                        if (t2 == null) {
                            break;
                        }
                        int iM6400e = m6400e(t2);
                        int i = iArr[iM6400e];
                        if (i == 0) {
                            tArrMo6361c = mo6361c(this.f5946e);
                            tArrMo6362d[iM6400e] = tArrMo6361c;
                        } else {
                            tArrMo6361c = tArrMo6362d[iM6400e];
                            if (i == tArrMo6361c.length) {
                                tArrMo6361c = (T[]) Arrays.copyOf(tArrMo6361c, tArrMo6361c.length * 2);
                                tArrMo6362d[iM6400e] = tArrMo6361c;
                            }
                        }
                        tArrMo6361c[i] = t2;
                        iArr[iM6400e] = iArr[iM6400e] + 1;
                    }
                }
            }
        }
        int iM6400e2 = m6400e(t);
        T[] tArr3 = this.f5943b[iM6400e2];
        if (tArr3 == null) {
            T[] tArrMo6361c2 = mo6361c(this.f5946e);
            tArrMo6361c2[0] = t;
            this.f5943b[iM6400e2] = tArrMo6361c2;
        } else {
            for (int i2 = 0; i2 < tArr3.length; i2++) {
                T t3 = tArr3[i2];
                if (t3 == null) {
                    tArr3[i2] = t;
                } else {
                    if (this.f5942a.mo6338E(t3, t)) {
                        return t3;
                    }
                }
            }
            int length2 = tArr3.length;
            Object[] objArrCopyOf = Arrays.copyOf(tArr3, tArr3.length * 2);
            ((T[][]) this.f5943b)[iM6400e2] = objArrCopyOf;
            objArrCopyOf[length2] = t;
        }
        this.f5944c++;
        return t;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m6402g(T t) {
        T t2;
        if (t == null) {
            return false;
        }
        T[] tArr = this.f5943b[m6400e(t)];
        if (tArr == null) {
            return false;
        }
        for (int i = 0; i < tArr.length && (t2 = tArr[i]) != null; i++) {
            if (this.f5942a.mo6338E(t2, t)) {
                System.arraycopy(tArr, i + 1, tArr, i, (tArr.length - i) - 1);
                tArr[tArr.length - 1] = null;
                this.f5944c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int iM3168h = 0;
        for (T[] tArr : this.f5943b) {
            if (tArr != null) {
                for (T t : tArr) {
                    if (t == null) {
                        break;
                    }
                    iM3168h = C1273a.m3168h(iM3168h, this.f5942a.mo6339F(t));
                }
            }
        }
        return C1273a.m3160b(iM3168h, this.f5944c);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f5944c == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new a(toArray());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return m6402g(mo6360a(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zM6402g = false;
        while (it.hasNext()) {
            zM6402g |= m6402g(mo6360a(it.next()));
        }
        return zM6402g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i = 0;
        for (T[] tArr : this.f5943b) {
            if (tArr != null) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < tArr.length && tArr[i2] != null) {
                    if (collection.contains(tArr[i2])) {
                        if (i2 != i3) {
                            tArr[i3] = tArr[i2];
                        }
                        i3++;
                        i++;
                    }
                    i2++;
                }
                i += i3;
                while (i3 < i2) {
                    tArr[i3] = null;
                    i3++;
                }
            }
        }
        boolean z = i != this.f5944c;
        this.f5944c = i;
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f5944c;
    }

    @Override // java.util.Set, java.util.Collection
    public final T[] toArray() {
        T[] tArrMo6361c = mo6361c(this.f5944c);
        int i = 0;
        for (T[] tArr : this.f5943b) {
            if (tArr != null) {
                int length = tArr.length;
                int i2 = 0;
                while (i2 < length) {
                    T t = tArr[i2];
                    if (t == null) {
                        break;
                    }
                    tArrMo6361c[i] = t;
                    i2++;
                    i++;
                }
            }
        }
        return tArrMo6361c;
    }

    @Override // java.util.Set, java.util.Collection
    public final <U> U[] toArray(U[] uArr) {
        int length = uArr.length;
        int i = this.f5944c;
        if (length < i) {
            uArr = (U[]) Arrays.copyOf(uArr, i);
        }
        int i2 = 0;
        for (T[] tArr : this.f5943b) {
            if (tArr != null) {
                int length2 = tArr.length;
                int i3 = 0;
                while (i3 < length2) {
                    T t = tArr[i3];
                    if (t == null) {
                        break;
                    }
                    uArr[i2] = t;
                    i3++;
                    i2++;
                }
            }
        }
        return uArr;
    }

    public final String toString() {
        if (this.f5944c == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (T[] tArr : this.f5943b) {
            if (tArr != null) {
                for (T t : tArr) {
                    if (t == null) {
                        break;
                    }
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(t.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
