package com.github.catvod.spider.support.p002A0;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.an */
/* JADX INFO: loaded from: classes.dex */
public final class C0128an extends AbstractC0528pi implements RandomAccess, Serializable {

    /* JADX INFO: renamed from: a */
    public static final C0128an f659a;

    /* JADX INFO: renamed from: b */
    public Object[] f660b;

    /* JADX INFO: renamed from: c */
    public final int f661c;

    /* JADX INFO: renamed from: d */
    public int f662d;

    /* JADX INFO: renamed from: e */
    public boolean f663e;

    /* JADX INFO: renamed from: f */
    public final C0128an f664f;

    /* JADX INFO: renamed from: g */
    public final C0128an f665g;

    static {
        C0128an c0128an = new C0128an(0);
        c0128an.f663e = true;
        f659a = c0128an;
    }

    public C0128an() {
        this(10);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0128an(int i) {
        this(new Object[i], 0, 0, false, null, null);
        if (i < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
        }
    }

    public C0128an(Object[] objArr, int i, int i2, boolean z, C0128an c0128an, C0128an c0128an2) {
        this.f660b = objArr;
        this.f661c = i;
        this.f662d = i2;
        this.f663e = z;
        this.f664f = c0128an;
        this.f665g = c0128an2;
        if (c0128an != null) {
            ((AbstractList) this).modCount = ((AbstractList) c0128an).modCount;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m1002n();
        m1001m();
        C0523pd c0523pd = AbstractC0527ph.Companion;
        int i2 = this.f662d;
        c0523pd.getClass();
        C0523pd.m1513b(i, i2);
        m1000l(this.f661c + i, obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        m1002n();
        m1001m();
        m1000l(this.f661c + this.f662d, obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        AbstractC0399ko.m1351f("elements", collection);
        m1002n();
        m1001m();
        C0523pd c0523pd = AbstractC0527ph.Companion;
        int i2 = this.f662d;
        c0523pd.getClass();
        C0523pd.m1513b(i, i2);
        int size = collection.size();
        m999k(this.f661c + i, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC0399ko.m1351f("elements", collection);
        m1002n();
        m1001m();
        int size = collection.size();
        m999k(this.f661c + this.f662d, collection, size);
        return size > 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m1002n();
        m1001m();
        m1005q(this.f661c, this.f662d);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        m1001m();
        if (obj != this) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            Object[] objArr = this.f660b;
            int i = this.f662d;
            if (i != list.size()) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (!AbstractC0399ko.m1347b(objArr[this.f661c + i2], list.get(i2))) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        m1001m();
        C0523pd c0523pd = AbstractC0527ph.Companion;
        int i2 = this.f662d;
        c0523pd.getClass();
        C0523pd.m1512a(i, i2);
        return this.f660b[this.f661c + i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        m1001m();
        Object[] objArr = this.f660b;
        int i = this.f662d;
        int iHashCode = 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[this.f661c + i2];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0528pi
    /* JADX INFO: renamed from: i */
    public final int mo997i() {
        m1001m();
        return this.f662d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        m1001m();
        for (int i = 0; i < this.f662d; i++) {
            if (AbstractC0399ko.m1347b(this.f660b[this.f661c + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        m1001m();
        return this.f662d == 0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0528pi
    /* JADX INFO: renamed from: j */
    public final Object mo998j(int i) {
        m1002n();
        m1001m();
        C0523pd c0523pd = AbstractC0527ph.Companion;
        int i2 = this.f662d;
        c0523pd.getClass();
        C0523pd.m1512a(i, i2);
        return m1004p(this.f661c + i);
    }

    /* JADX INFO: renamed from: k */
    public final void m999k(int i, Collection collection, int i2) {
        ((AbstractList) this).modCount++;
        C0128an c0128an = this.f664f;
        if (c0128an != null) {
            c0128an.m999k(i, collection, i2);
            this.f660b = c0128an.f660b;
            this.f662d += i2;
        } else {
            m1003o(i, i2);
            Iterator it = collection.iterator();
            for (int i3 = 0; i3 < i2; i3++) {
                this.f660b[i + i3] = it.next();
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m1000l(int i, Object obj) {
        ((AbstractList) this).modCount++;
        C0128an c0128an = this.f664f;
        if (c0128an == null) {
            m1003o(i, 1);
            this.f660b[i] = obj;
        } else {
            c0128an.m1000l(i, obj);
            this.f660b = c0128an.f660b;
            this.f662d++;
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        m1001m();
        for (int i = this.f662d - 1; i >= 0; i--) {
            if (AbstractC0399ko.m1347b(this.f660b[this.f661c + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        m1001m();
        C0523pd c0523pd = AbstractC0527ph.Companion;
        int i2 = this.f662d;
        c0523pd.getClass();
        C0523pd.m1513b(i, i2);
        return new C0588ro(this, i);
    }

    /* JADX INFO: renamed from: m */
    public final void m1001m() {
        C0128an c0128an = this.f665g;
        if (c0128an != null && ((AbstractList) c0128an).modCount != ((AbstractList) this).modCount) {
            throw new ConcurrentModificationException();
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m1002n() {
        C0128an c0128an;
        if (this.f663e || ((c0128an = this.f665g) != null && c0128an.f663e)) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m1003o(int i, int i2) {
        int i3 = this.f662d + i2;
        if (i3 < 0) {
            throw new OutOfMemoryError();
        }
        Object[] objArr = this.f660b;
        if (i3 > objArr.length) {
            C0523pd c0523pd = AbstractC0527ph.Companion;
            int length = objArr.length;
            c0523pd.getClass();
            int i4 = length + (length >> 1);
            if (i4 - i3 < 0) {
                i4 = i3;
            }
            if (i4 - 2147483639 > 0) {
                i4 = i3 > 2147483639 ? Integer.MAX_VALUE : 2147483639;
            }
            Object[] objArr2 = this.f660b;
            AbstractC0399ko.m1351f("<this>", objArr2);
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, i4);
            AbstractC0399ko.m1350e("copyOf(...)", objArrCopyOf);
            this.f660b = objArrCopyOf;
        }
        Object[] objArr3 = this.f660b;
        AbstractC0548qb.m1569e(objArr3, objArr3, i + i2, i, this.f661c + this.f662d);
        this.f662d += i2;
    }

    /* JADX INFO: renamed from: p */
    public final Object m1004p(int i) {
        ((AbstractList) this).modCount++;
        C0128an c0128an = this.f664f;
        if (c0128an != null) {
            Object objM1004p = c0128an.m1004p(i);
            this.f662d--;
            return objM1004p;
        }
        Object[] objArr = this.f660b;
        Object obj = objArr[i];
        int i2 = this.f662d;
        int i3 = this.f661c;
        AbstractC0548qb.m1569e(objArr, objArr, i, i + 1, i2 + i3);
        Object[] objArr2 = this.f660b;
        int i4 = (i3 + this.f662d) - 1;
        AbstractC0399ko.m1351f("<this>", objArr2);
        objArr2[i4] = null;
        this.f662d--;
        return obj;
    }

    /* JADX INFO: renamed from: q */
    public final void m1005q(int i, int i2) {
        if (i2 > 0) {
            ((AbstractList) this).modCount++;
        }
        C0128an c0128an = this.f664f;
        if (c0128an != null) {
            c0128an.m1005q(i, i2);
        } else {
            Object[] objArr = this.f660b;
            AbstractC0548qb.m1569e(objArr, objArr, i, i + i2, this.f662d);
            Object[] objArr2 = this.f660b;
            int i3 = this.f662d;
            AbstractC0399ko.m1351f("<this>", objArr2);
            for (int i4 = i3 - i2; i4 < i3; i4++) {
                objArr2[i4] = null;
            }
        }
        this.f662d -= i2;
    }

    /* JADX INFO: renamed from: r */
    public final int m1006r(int i, int i2, Collection collection, boolean z) {
        int iM1006r;
        C0128an c0128an = this.f664f;
        if (c0128an != null) {
            iM1006r = c0128an.m1006r(i, i2, collection, z);
        } else {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i + i3;
                if (collection.contains(this.f660b[i5]) == z) {
                    Object[] objArr = this.f660b;
                    i3++;
                    objArr[i4 + i] = objArr[i5];
                    i4++;
                } else {
                    i3++;
                }
            }
            int i6 = i2 - i4;
            Object[] objArr2 = this.f660b;
            AbstractC0548qb.m1569e(objArr2, objArr2, i + i4, i2 + i, this.f662d);
            Object[] objArr3 = this.f660b;
            int i7 = this.f662d;
            AbstractC0399ko.m1351f("<this>", objArr3);
            for (int i8 = i7 - i6; i8 < i7; i8++) {
                objArr3[i8] = null;
            }
            iM1006r = i6;
        }
        if (iM1006r > 0) {
            ((AbstractList) this).modCount++;
        }
        this.f662d -= iM1006r;
        return iM1006r;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        m1002n();
        m1001m();
        int iIndexOf = indexOf(obj);
        if (iIndexOf >= 0) {
            mo998j(iIndexOf);
        }
        return iIndexOf >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        AbstractC0399ko.m1351f("elements", collection);
        m1002n();
        m1001m();
        return m1006r(this.f661c, this.f662d, collection, false) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        AbstractC0399ko.m1351f("elements", collection);
        m1002n();
        m1001m();
        return m1006r(this.f661c, this.f662d, collection, true) > 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m1002n();
        m1001m();
        C0523pd c0523pd = AbstractC0527ph.Companion;
        int i2 = this.f662d;
        c0523pd.getClass();
        C0523pd.m1512a(i, i2);
        Object[] objArr = this.f660b;
        int i3 = this.f661c + i;
        Object obj2 = objArr[i3];
        objArr[i3] = obj;
        return obj2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        C0523pd c0523pd = AbstractC0527ph.Companion;
        int i3 = this.f662d;
        c0523pd.getClass();
        C0523pd.m1514c(i, i2, i3);
        Object[] objArr = this.f660b;
        int i4 = this.f661c + i;
        int i5 = i2 - i;
        boolean z = this.f663e;
        C0128an c0128an = this.f665g;
        return new C0128an(objArr, i4, i5, z, this, c0128an == null ? this : c0128an);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        m1001m();
        Object[] objArr = this.f660b;
        int i = this.f662d;
        int i2 = this.f661c;
        return AbstractC0548qb.m1572h(objArr, i2, i + i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC0399ko.m1351f("destination", objArr);
        m1001m();
        int length = objArr.length;
        int i = this.f662d;
        int i2 = this.f661c;
        if (length < i) {
            Object[] objArrCopyOfRange = Arrays.copyOfRange(this.f660b, i2, i + i2, objArr.getClass());
            AbstractC0399ko.m1350e("copyOfRange(...)", objArrCopyOfRange);
            return objArrCopyOfRange;
        }
        AbstractC0548qb.m1569e(this.f660b, objArr, 0, i2, i + i2);
        int i3 = this.f662d;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        m1001m();
        Object[] objArr = this.f660b;
        int i = this.f662d;
        StringBuilder sb = new StringBuilder((i * 3) + 2);
        sb.append("[");
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[this.f661c + i2];
            if (obj == this) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String string = sb.toString();
        AbstractC0399ko.m1350e("toString(...)", string);
        return string;
    }
}
