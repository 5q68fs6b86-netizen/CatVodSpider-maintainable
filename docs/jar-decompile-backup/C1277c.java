package com.github.catvod.spider.support.p044FM.p045A;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p045A.c */
/* JADX INFO: loaded from: classes.dex */
public class C1277c<T> implements Set<T> {

    /* JADX INFO: renamed from: a */
    protected final AbstractC1275a f2993a;

    /* JADX INFO: renamed from: b */
    protected T[][] f2994b;

    /* JADX INFO: renamed from: c */
    protected int f2995c;

    /* JADX INFO: renamed from: d */
    protected int f2996d;

    /* JADX INFO: renamed from: e */
    protected int f2997e;

    public C1277c() {
        this(null, 8);
    }

    public C1277c(AbstractC1275a abstractC1275a, int i) {
        this.f2995c = 0;
        this.f2996d = (int) Math.floor(12.0d);
        this.f2997e = 8;
        this.f2993a = abstractC1275a == null ? C1287m.f3013a : abstractC1275a;
        this.f2994b = mo3189d(16);
        this.f2997e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    protected T mo3186a(Object obj) {
        return obj;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(T t) {
        return m3191f(t) == t;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection<? extends T> collection) {
        boolean z = false;
        for (T t : collection) {
            if (m3191f(t) != t) {
                z = true;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3187b(T t) {
        if (t == null) {
            return false;
        }
        T[] tArr = this.f2994b[m3190e(t)];
        T t2 = null;
        if (tArr != null) {
            for (T t3 : tArr) {
                if (t3 == null) {
                    break;
                }
                if (this.f2993a.mo3181E(t3, t)) {
                    t2 = t3;
                    break;
                }
            }
        }
        return t2 != null;
    }

    /* JADX INFO: renamed from: c */
    protected T[] mo3188c(int i) {
        return (T[]) new Object[i];
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f2994b = mo3189d(16);
        this.f2995c = 0;
        this.f2996d = (int) Math.floor(12.0d);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return m3187b(mo3186a(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        if (!(collection instanceof C1277c)) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!m3187b(mo3186a(it.next()))) {
                    return false;
                }
            }
            return true;
        }
        for (T[] tArr : ((C1277c) collection).f2994b) {
            if (tArr != null) {
                for (T t : tArr) {
                    if (t == null) {
                        break;
                    }
                    if (!m3187b(mo3186a(t))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    protected T[][] mo3189d(int i) {
        return (T[][]) new Object[i][];
    }

    /* JADX INFO: renamed from: e */
    protected final int m3190e(T t) {
        return this.f2993a.mo3182F(t) & (this.f2994b.length - 1);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1277c)) {
            return false;
        }
        C1277c c1277c = (C1277c) obj;
        if (c1277c.f2995c != this.f2995c) {
            return false;
        }
        return containsAll(c1277c);
    }

    /* JADX INFO: renamed from: f */
    public final T m3191f(T t) {
        T[] tArrMo3188c;
        if (this.f2995c > this.f2996d) {
            T[][] tArr = this.f2994b;
            int length = tArr.length * 2;
            T[][] tArrMo3189d = mo3189d(length);
            int[] iArr = new int[tArrMo3189d.length];
            this.f2994b = tArrMo3189d;
            double d = length;
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            this.f2996d = (int) (d * 0.75d);
            for (T[] tArr2 : tArr) {
                if (tArr2 != null) {
                    for (T t2 : tArr2) {
                        if (t2 == null) {
                            break;
                        }
                        int iM3190e = m3190e(t2);
                        int i = iArr[iM3190e];
                        if (i == 0) {
                            tArrMo3188c = mo3188c(this.f2997e);
                            tArrMo3189d[iM3190e] = tArrMo3188c;
                        } else {
                            tArrMo3188c = tArrMo3189d[iM3190e];
                            if (i == tArrMo3188c.length) {
                                tArrMo3188c = (T[]) Arrays.copyOf(tArrMo3188c, tArrMo3188c.length * 2);
                                tArrMo3189d[iM3190e] = tArrMo3188c;
                            }
                        }
                        tArrMo3188c[i] = t2;
                        iArr[iM3190e] = iArr[iM3190e] + 1;
                    }
                }
            }
        }
        int iM3190e2 = m3190e(t);
        T[] tArr3 = this.f2994b[iM3190e2];
        if (tArr3 == null) {
            T[] tArrMo3188c2 = mo3188c(this.f2997e);
            tArrMo3188c2[0] = t;
            this.f2994b[iM3190e2] = tArrMo3188c2;
        } else {
            for (int i2 = 0; i2 < tArr3.length; i2++) {
                T t3 = tArr3[i2];
                if (t3 == null) {
                    tArr3[i2] = t;
                } else {
                    if (this.f2993a.mo3181E(t3, t)) {
                        return t3;
                    }
                }
            }
            int length2 = tArr3.length;
            Object[] objArrCopyOf = Arrays.copyOf(tArr3, tArr3.length * 2);
            ((T[][]) this.f2994b)[iM3190e2] = objArrCopyOf;
            objArrCopyOf[length2] = t;
        }
        this.f2995c++;
        return t;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m3192g(T t) {
        T t2;
        if (t == null) {
            return false;
        }
        T[] tArr = this.f2994b[m3190e(t)];
        if (tArr == null) {
            return false;
        }
        for (int i = 0; i < tArr.length && (t2 = tArr[i]) != null; i++) {
            if (this.f2993a.mo3181E(t2, t)) {
                System.arraycopy(tArr, i + 1, tArr, i, (tArr.length - i) - 1);
                tArr[tArr.length - 1] = null;
                this.f2995c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int iM3224i = 0;
        for (T[] tArr : this.f2994b) {
            if (tArr != null) {
                for (T t : tArr) {
                    if (t == null) {
                        break;
                    }
                    iM3224i = C1286l.m3224i(iM3224i, this.f2993a.mo3182F(t));
                }
            }
        }
        return C1286l.m3218c(iM3224i, this.f2995c);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f2995c == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator<T> iterator() {
        return new C1276b(this, toArray());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return m3192g(mo3186a(obj));
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zM3192g = false;
        while (it.hasNext()) {
            zM3192g |= m3192g(mo3186a(it.next()));
        }
        return zM3192g;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        int i = 0;
        for (T[] tArr : this.f2994b) {
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
        boolean z = i != this.f2995c;
        this.f2995c = i;
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f2995c;
    }

    @Override // java.util.Set, java.util.Collection
    public final T[] toArray() {
        T[] tArrMo3188c = mo3188c(this.f2995c);
        int i = 0;
        for (T[] tArr : this.f2994b) {
            if (tArr != null) {
                int length = tArr.length;
                int i2 = 0;
                while (i2 < length) {
                    T t = tArr[i2];
                    if (t == null) {
                        break;
                    }
                    tArrMo3188c[i] = t;
                    i2++;
                    i++;
                }
            }
        }
        return tArrMo3188c;
    }

    @Override // java.util.Set, java.util.Collection
    public final <U> U[] toArray(U[] uArr) {
        int length = uArr.length;
        int i = this.f2995c;
        if (length < i) {
            uArr = (U[]) Arrays.copyOf(uArr, i);
        }
        int i2 = 0;
        for (T[] tArr : this.f2994b) {
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
        if (this.f2995c == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (T[] tArr : this.f2994b) {
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
