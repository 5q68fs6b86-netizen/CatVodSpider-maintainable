package com.github.catvod.spider.support.p002A0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.pw */
/* JADX INFO: loaded from: classes.dex */
public final class C0542pw extends AbstractC0528pi {

    /* JADX INFO: renamed from: a */
    public static final Object[] f1380a = new Object[0];

    /* JADX INFO: renamed from: b */
    public int f1381b;

    /* JADX INFO: renamed from: c */
    public Object[] f1382c = f1380a;

    /* JADX INFO: renamed from: d */
    public int f1383d;

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int length;
        C0523pd c0523pd = AbstractC0527ph.Companion;
        int i2 = this.f1383d;
        c0523pd.getClass();
        C0523pd.m1513b(i, i2);
        int i3 = this.f1383d;
        if (i == i3) {
            addLast(obj);
            return;
        }
        if (i == 0) {
            addFirst(obj);
            return;
        }
        m1563f(i3 + 1);
        int iM1565h = m1565h(this.f1381b + i);
        int i4 = this.f1383d;
        if (i < ((i4 + 1) >> 1)) {
            if (iM1565h == 0) {
                Object[] objArr = this.f1382c;
                AbstractC0399ko.m1351f("<this>", objArr);
                iM1565h = objArr.length;
            }
            int i5 = iM1565h - 1;
            int i6 = this.f1381b;
            if (i6 == 0) {
                Object[] objArr2 = this.f1382c;
                AbstractC0399ko.m1351f("<this>", objArr2);
                length = objArr2.length - 1;
            } else {
                length = i6 - 1;
            }
            int i7 = this.f1381b;
            if (i5 >= i7) {
                Object[] objArr3 = this.f1382c;
                objArr3[length] = objArr3[i7];
                AbstractC0548qb.m1569e(objArr3, objArr3, i7, i7 + 1, i5 + 1);
            } else {
                Object[] objArr4 = this.f1382c;
                AbstractC0548qb.m1569e(objArr4, objArr4, i7 - 1, i7, objArr4.length);
                Object[] objArr5 = this.f1382c;
                objArr5[objArr5.length - 1] = objArr5[0];
                AbstractC0548qb.m1569e(objArr5, objArr5, 0, 1, i5 + 1);
            }
            this.f1382c[i5] = obj;
            this.f1381b = length;
        } else {
            int iM1565h2 = m1565h(i4 + this.f1381b);
            if (iM1565h < iM1565h2) {
                Object[] objArr6 = this.f1382c;
                AbstractC0548qb.m1569e(objArr6, objArr6, iM1565h + 1, iM1565h, iM1565h2);
            } else {
                Object[] objArr7 = this.f1382c;
                AbstractC0548qb.m1569e(objArr7, objArr7, 1, 0, iM1565h2);
                Object[] objArr8 = this.f1382c;
                objArr8[0] = objArr8[objArr8.length - 1];
                AbstractC0548qb.m1569e(objArr8, objArr8, iM1565h + 1, iM1565h, objArr8.length - 1);
            }
            this.f1382c[iM1565h] = obj;
        }
        this.f1383d++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        addLast(obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        AbstractC0399ko.m1351f("elements", collection);
        C0523pd c0523pd = AbstractC0527ph.Companion;
        int i2 = this.f1383d;
        c0523pd.getClass();
        C0523pd.m1513b(i, i2);
        if (collection.isEmpty()) {
            return false;
        }
        int i3 = this.f1383d;
        if (i == i3) {
            return addAll(collection);
        }
        m1563f(collection.size() + i3);
        int iM1565h = m1565h(this.f1383d + this.f1381b);
        int iM1565h2 = m1565h(this.f1381b + i);
        int size = collection.size();
        if (i < ((this.f1383d + 1) >> 1)) {
            int i4 = this.f1381b;
            int length = i4 - size;
            if (iM1565h2 < i4) {
                Object[] objArr = this.f1382c;
                AbstractC0548qb.m1569e(objArr, objArr, length, i4, objArr.length);
                if (size >= iM1565h2) {
                    Object[] objArr2 = this.f1382c;
                    AbstractC0548qb.m1569e(objArr2, objArr2, objArr2.length - size, 0, iM1565h2);
                } else {
                    Object[] objArr3 = this.f1382c;
                    AbstractC0548qb.m1569e(objArr3, objArr3, objArr3.length - size, 0, size);
                    Object[] objArr4 = this.f1382c;
                    AbstractC0548qb.m1569e(objArr4, objArr4, 0, size, iM1565h2);
                }
            } else if (length >= 0) {
                Object[] objArr5 = this.f1382c;
                AbstractC0548qb.m1569e(objArr5, objArr5, length, i4, iM1565h2);
            } else {
                Object[] objArr6 = this.f1382c;
                length += objArr6.length;
                int i5 = iM1565h2 - i4;
                int length2 = objArr6.length - length;
                if (length2 >= i5) {
                    AbstractC0548qb.m1569e(objArr6, objArr6, length, i4, iM1565h2);
                } else {
                    AbstractC0548qb.m1569e(objArr6, objArr6, length, i4, i4 + length2);
                    Object[] objArr7 = this.f1382c;
                    AbstractC0548qb.m1569e(objArr7, objArr7, 0, this.f1381b + length2, iM1565h2);
                }
            }
            this.f1381b = length;
            int length3 = iM1565h2 - size;
            if (length3 < 0) {
                length3 += this.f1382c.length;
            }
            m1562e(length3, collection);
        } else {
            int i6 = iM1565h2 + size;
            if (iM1565h2 < iM1565h) {
                int i7 = size + iM1565h;
                Object[] objArr8 = this.f1382c;
                if (i7 <= objArr8.length) {
                    AbstractC0548qb.m1569e(objArr8, objArr8, i6, iM1565h2, iM1565h);
                } else if (i6 >= objArr8.length) {
                    AbstractC0548qb.m1569e(objArr8, objArr8, i6 - objArr8.length, iM1565h2, iM1565h);
                } else {
                    int length4 = iM1565h - (i7 - objArr8.length);
                    AbstractC0548qb.m1569e(objArr8, objArr8, 0, length4, iM1565h);
                    Object[] objArr9 = this.f1382c;
                    AbstractC0548qb.m1569e(objArr9, objArr9, i6, iM1565h2, length4);
                }
            } else {
                Object[] objArr10 = this.f1382c;
                AbstractC0548qb.m1569e(objArr10, objArr10, size, 0, iM1565h);
                Object[] objArr11 = this.f1382c;
                if (i6 >= objArr11.length) {
                    AbstractC0548qb.m1569e(objArr11, objArr11, i6 - objArr11.length, iM1565h2, objArr11.length);
                } else {
                    AbstractC0548qb.m1569e(objArr11, objArr11, 0, objArr11.length - size, objArr11.length);
                    Object[] objArr12 = this.f1382c;
                    AbstractC0548qb.m1569e(objArr12, objArr12, i6, iM1565h2, objArr12.length - size);
                }
            }
            m1562e(iM1565h2, collection);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        AbstractC0399ko.m1351f("elements", collection);
        if (collection.isEmpty()) {
            return false;
        }
        m1563f(collection.size() + mo997i());
        m1562e(m1565h(mo997i() + this.f1381b), collection);
        return true;
    }

    public final void addFirst(Object obj) {
        m1563f(this.f1383d + 1);
        int length = this.f1381b;
        if (length == 0) {
            Object[] objArr = this.f1382c;
            AbstractC0399ko.m1351f("<this>", objArr);
            length = objArr.length;
        }
        int i = length - 1;
        this.f1381b = i;
        this.f1382c[i] = obj;
        this.f1383d++;
    }

    public final void addLast(Object obj) {
        m1563f(mo997i() + 1);
        this.f1382c[m1565h(mo997i() + this.f1381b)] = obj;
        this.f1383d = mo997i() + 1;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        int iM1565h = m1565h(this.f1383d + this.f1381b);
        int i = this.f1381b;
        if (i < iM1565h) {
            AbstractC0548qb.m1573i(this.f1382c, i, iM1565h);
        } else if (!isEmpty()) {
            Object[] objArr = this.f1382c;
            AbstractC0548qb.m1573i(objArr, this.f1381b, objArr.length);
            AbstractC0548qb.m1573i(this.f1382c, 0, iM1565h);
        }
        this.f1381b = 0;
        this.f1383d = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: e */
    public final void m1562e(int i, Collection collection) {
        Iterator it = collection.iterator();
        int length = this.f1382c.length;
        while (i < length && it.hasNext()) {
            this.f1382c[i] = it.next();
            i++;
        }
        int i2 = this.f1381b;
        for (int i3 = 0; i3 < i2 && it.hasNext(); i3++) {
            this.f1382c[i3] = it.next();
        }
        this.f1383d = collection.size() + this.f1383d;
    }

    /* JADX INFO: renamed from: f */
    public final void m1563f(int i) {
        if (i < 0) {
            throw new IllegalStateException("Deque is too big.");
        }
        Object[] objArr = this.f1382c;
        if (i <= objArr.length) {
            return;
        }
        if (objArr == f1380a) {
            if (i < 10) {
                i = 10;
            }
            this.f1382c = new Object[i];
            return;
        }
        C0523pd c0523pd = AbstractC0527ph.Companion;
        int length = objArr.length;
        c0523pd.getClass();
        int i2 = length + (length >> 1);
        if (i2 - i < 0) {
            i2 = i;
        }
        if (i2 - 2147483639 > 0) {
            i2 = i > 2147483639 ? Integer.MAX_VALUE : 2147483639;
        }
        Object[] objArr2 = new Object[i2];
        Object[] objArr3 = this.f1382c;
        AbstractC0548qb.m1569e(objArr3, objArr2, 0, this.f1381b, objArr3.length);
        Object[] objArr4 = this.f1382c;
        int length2 = objArr4.length;
        int i3 = this.f1381b;
        AbstractC0548qb.m1569e(objArr4, objArr2, length2 - i3, 0, i3);
        this.f1381b = 0;
        this.f1382c = objArr2;
    }

    /* JADX INFO: renamed from: g */
    public final int m1564g(int i) {
        Object[] objArr = this.f1382c;
        AbstractC0399ko.m1351f("<this>", objArr);
        if (i == objArr.length - 1) {
            return 0;
        }
        return i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        C0523pd c0523pd = AbstractC0527ph.Companion;
        int i2 = this.f1383d;
        c0523pd.getClass();
        C0523pd.m1512a(i, i2);
        return this.f1382c[m1565h(this.f1381b + i)];
    }

    /* JADX INFO: renamed from: h */
    public final int m1565h(int i) {
        Object[] objArr = this.f1382c;
        return i >= objArr.length ? i - objArr.length : i;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0528pi
    /* JADX INFO: renamed from: i */
    public final int mo997i() {
        return this.f1383d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        int i;
        int iM1565h = m1565h(mo997i() + this.f1381b);
        int length = this.f1381b;
        if (length < iM1565h) {
            while (length < iM1565h) {
                if (AbstractC0399ko.m1347b(obj, this.f1382c[length])) {
                    i = this.f1381b;
                } else {
                    length++;
                }
            }
            return -1;
        }
        if (length < iM1565h) {
            return -1;
        }
        int length2 = this.f1382c.length;
        while (length < length2) {
            if (AbstractC0399ko.m1347b(obj, this.f1382c[length])) {
                i = this.f1381b;
            } else {
                length++;
            }
        }
        for (int i2 = 0; i2 < iM1565h; i2++) {
            if (AbstractC0399ko.m1347b(obj, this.f1382c[i2])) {
                length = i2 + this.f1382c.length;
                i = this.f1381b;
            }
        }
        return -1;
        return length - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return mo997i() == 0;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0528pi
    /* JADX INFO: renamed from: j */
    public final Object mo998j(int i) {
        C0523pd c0523pd = AbstractC0527ph.Companion;
        int i2 = this.f1383d;
        c0523pd.getClass();
        C0523pd.m1512a(i, i2);
        if (i == size() - 1) {
            return removeLast();
        }
        if (i == 0) {
            return removeFirst();
        }
        int iM1565h = m1565h(this.f1381b + i);
        Object[] objArr = this.f1382c;
        Object obj = objArr[iM1565h];
        if (i < (this.f1383d >> 1)) {
            int i3 = this.f1381b;
            if (iM1565h >= i3) {
                AbstractC0548qb.m1569e(objArr, objArr, i3 + 1, i3, iM1565h);
            } else {
                AbstractC0548qb.m1569e(objArr, objArr, 1, 0, iM1565h);
                Object[] objArr2 = this.f1382c;
                objArr2[0] = objArr2[objArr2.length - 1];
                int i4 = this.f1381b;
                AbstractC0548qb.m1569e(objArr2, objArr2, i4 + 1, i4, objArr2.length - 1);
            }
            Object[] objArr3 = this.f1382c;
            int i5 = this.f1381b;
            objArr3[i5] = null;
            this.f1381b = m1564g(i5);
        } else {
            int iM1565h2 = m1565h((size() - 1) + this.f1381b);
            if (iM1565h <= iM1565h2) {
                Object[] objArr4 = this.f1382c;
                AbstractC0548qb.m1569e(objArr4, objArr4, iM1565h, iM1565h + 1, iM1565h2 + 1);
            } else {
                Object[] objArr5 = this.f1382c;
                AbstractC0548qb.m1569e(objArr5, objArr5, iM1565h, iM1565h + 1, objArr5.length);
                Object[] objArr6 = this.f1382c;
                objArr6[objArr6.length - 1] = objArr6[0];
                AbstractC0548qb.m1569e(objArr6, objArr6, 0, 1, iM1565h2 + 1);
            }
            this.f1382c[iM1565h2] = null;
        }
        this.f1383d--;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        int length;
        int i;
        int iM1565h = m1565h(this.f1383d + this.f1381b);
        int i2 = this.f1381b;
        if (i2 < iM1565h) {
            length = iM1565h - 1;
            if (i2 <= length) {
                while (!AbstractC0399ko.m1347b(obj, this.f1382c[length])) {
                    if (length != i2) {
                        length--;
                    }
                }
                i = this.f1381b;
                return length - i;
            }
            return -1;
        }
        if (i2 > iM1565h) {
            for (int i3 = iM1565h - 1; -1 < i3; i3--) {
                if (AbstractC0399ko.m1347b(obj, this.f1382c[i3])) {
                    length = i3 + this.f1382c.length;
                    i = this.f1381b;
                    return length - i;
                }
            }
            Object[] objArr = this.f1382c;
            AbstractC0399ko.m1351f("<this>", objArr);
            length = objArr.length - 1;
            int i4 = this.f1381b;
            if (i4 <= length) {
                while (!AbstractC0399ko.m1347b(obj, this.f1382c[length])) {
                    if (length != i4) {
                        length--;
                    }
                }
                i = this.f1381b;
                return length - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        mo998j(iIndexOf);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        int iM1565h;
        AbstractC0399ko.m1351f("elements", collection);
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f1382c.length != 0) {
            int iM1565h2 = m1565h(this.f1383d + this.f1381b);
            int i = this.f1381b;
            if (i < iM1565h2) {
                iM1565h = i;
                while (i < iM1565h2) {
                    Object obj = this.f1382c[i];
                    if (collection.contains(obj)) {
                        z = true;
                    } else {
                        this.f1382c[iM1565h] = obj;
                        iM1565h++;
                    }
                    i++;
                }
                AbstractC0548qb.m1573i(this.f1382c, iM1565h, iM1565h2);
            } else {
                int length = this.f1382c.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.f1382c;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        z2 = true;
                    } else {
                        this.f1382c[i2] = obj2;
                        i2++;
                    }
                    i++;
                }
                iM1565h = m1565h(i2);
                for (int i3 = 0; i3 < iM1565h2; i3++) {
                    Object[] objArr2 = this.f1382c;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        z2 = true;
                    } else {
                        this.f1382c[iM1565h] = obj3;
                        iM1565h = m1564g(iM1565h);
                    }
                }
                z = z2;
            }
            if (z) {
                int length2 = iM1565h - this.f1381b;
                if (length2 < 0) {
                    length2 += this.f1382c.length;
                }
                this.f1383d = length2;
            }
        }
        return z;
    }

    public final Object removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        Object[] objArr = this.f1382c;
        int i = this.f1381b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f1381b = m1564g(i);
        this.f1383d = mo997i() - 1;
        return obj;
    }

    public final Object removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException("ArrayDeque is empty.");
        }
        int iM1565h = m1565h(AbstractC0624sx.m1709k(this) + this.f1381b);
        Object[] objArr = this.f1382c;
        Object obj = objArr[iM1565h];
        objArr[iM1565h] = null;
        this.f1383d = mo997i() - 1;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        int iM1565h;
        AbstractC0399ko.m1351f("elements", collection);
        boolean z = false;
        z = false;
        z = false;
        if (!isEmpty() && this.f1382c.length != 0) {
            int iM1565h2 = m1565h(this.f1383d + this.f1381b);
            int i = this.f1381b;
            if (i < iM1565h2) {
                iM1565h = i;
                while (i < iM1565h2) {
                    Object obj = this.f1382c[i];
                    if (collection.contains(obj)) {
                        this.f1382c[iM1565h] = obj;
                        iM1565h++;
                    } else {
                        z = true;
                    }
                    i++;
                }
                AbstractC0548qb.m1573i(this.f1382c, iM1565h, iM1565h2);
            } else {
                int length = this.f1382c.length;
                int i2 = i;
                boolean z2 = false;
                while (i < length) {
                    Object[] objArr = this.f1382c;
                    Object obj2 = objArr[i];
                    objArr[i] = null;
                    if (collection.contains(obj2)) {
                        this.f1382c[i2] = obj2;
                        i2++;
                    } else {
                        z2 = true;
                    }
                    i++;
                }
                iM1565h = m1565h(i2);
                for (int i3 = 0; i3 < iM1565h2; i3++) {
                    Object[] objArr2 = this.f1382c;
                    Object obj3 = objArr2[i3];
                    objArr2[i3] = null;
                    if (collection.contains(obj3)) {
                        this.f1382c[iM1565h] = obj3;
                        iM1565h = m1564g(iM1565h);
                    } else {
                        z2 = true;
                    }
                }
                z = z2;
            }
            if (z) {
                int length2 = iM1565h - this.f1381b;
                if (length2 < 0) {
                    length2 += this.f1382c.length;
                }
                this.f1383d = length2;
            }
        }
        return z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        C0523pd c0523pd = AbstractC0527ph.Companion;
        int i2 = this.f1383d;
        c0523pd.getClass();
        C0523pd.m1512a(i, i2);
        int iM1565h = m1565h(this.f1381b + i);
        Object[] objArr = this.f1382c;
        Object obj2 = objArr[iM1565h];
        objArr[iM1565h] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray() {
        return toArray(new Object[mo997i()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        AbstractC0399ko.m1351f("array", objArr);
        int length = objArr.length;
        int i = this.f1383d;
        if (length < i) {
            Object objNewInstance = Array.newInstance(objArr.getClass().getComponentType(), i);
            AbstractC0399ko.m1349d("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.arrayOfNulls>", objNewInstance);
            objArr = (Object[]) objNewInstance;
        }
        int iM1565h = m1565h(this.f1383d + this.f1381b);
        int i2 = this.f1381b;
        if (i2 < iM1565h) {
            AbstractC0548qb.m1570f(this.f1382c, objArr, 0, i2, iM1565h, 2);
        } else if (!isEmpty()) {
            Object[] objArr2 = this.f1382c;
            AbstractC0548qb.m1569e(objArr2, objArr, 0, this.f1381b, objArr2.length);
            Object[] objArr3 = this.f1382c;
            AbstractC0548qb.m1569e(objArr3, objArr, objArr3.length - this.f1381b, 0, iM1565h);
        }
        int i3 = this.f1383d;
        if (i3 < objArr.length) {
            objArr[i3] = null;
        }
        return objArr;
    }
}
