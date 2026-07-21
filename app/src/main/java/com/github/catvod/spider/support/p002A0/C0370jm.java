package com.github.catvod.spider.support.p002A0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.jm */
/* JADX INFO: loaded from: classes.dex */
public final class C0370jm implements Set {

    /* JADX INFO: renamed from: a */
    public final AbstractC0760xy f1055a;

    /* JADX INFO: renamed from: c */
    public int f1057c = 0;

    /* JADX INFO: renamed from: d */
    public int f1058d = (int) Math.floor(12.0d);

    /* JADX INFO: renamed from: b */
    public Object[][] f1056b = new C0368jk[16][];

    /* JADX INFO: renamed from: e */
    public final int f1059e = 2;

    public C0370jm(AbstractC0760xy abstractC0760xy) {
        this.f1055a = abstractC0760xy;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return m1333h(obj) == obj;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        boolean z = false;
        for (Object obj : collection) {
            if (m1333h(obj) != obj) {
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f1056b = new C0368jk[16][];
        this.f1057c = 0;
        this.f1058d = (int) Math.floor(12.0d);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return m1331f(!(obj instanceof C0368jk) ? null : (C0368jk) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        if (!(collection instanceof C0370jm)) {
            for (Object obj : collection) {
                if (!m1331f(!(obj instanceof C0368jk) ? null : (C0368jk) obj)) {
                    return false;
                }
            }
            return true;
        }
        for (Object[] objArr : ((C0370jm) collection).f1056b) {
            if (objArr != null) {
                for (Object obj2 : objArr) {
                    if (obj2 == null) {
                        break;
                    }
                    if (!m1331f(!(obj2 instanceof C0368jk) ? null : (C0368jk) obj2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0370jm)) {
            return false;
        }
        C0370jm c0370jm = (C0370jm) obj;
        if (c0370jm.f1057c != this.f1057c) {
            return false;
        }
        return containsAll(c0370jm);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m1331f(C0368jk c0368jk) {
        if (c0368jk == null) {
            return false;
        }
        Object[] objArr = this.f1056b[m1332g(c0368jk)];
        Object obj = null;
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if (obj2 == null) {
                    break;
                }
                if (this.f1055a.mo1329e(obj2, c0368jk)) {
                    obj = obj2;
                    break;
                }
            }
        }
        return obj != null;
    }

    /* JADX INFO: renamed from: g */
    public final int m1332g(Object obj) {
        return this.f1055a.mo1330f(obj) & (this.f1056b.length - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public final Object m1333h(Object obj) {
        Object[] objArrCopyOf;
        int i = this.f1057c;
        int i2 = this.f1058d;
        int i3 = this.f1059e;
        if (i > i2) {
            Object[][] objArr = this.f1056b;
            int length = objArr.length * 2;
            Object[][] objArr2 = new C0368jk[length][];
            int[] iArr = new int[length];
            this.f1056b = objArr2;
            this.f1058d = (int) (((double) length) * 0.75d);
            for (Object[] objArr3 : objArr) {
                if (objArr3 != null) {
                    for (Object obj2 : objArr3) {
                        if (obj2 == null) {
                            break;
                        }
                        int iM1332g = m1332g(obj2);
                        int i4 = iArr[iM1332g];
                        if (i4 == 0) {
                            objArrCopyOf = new C0368jk[i3];
                            objArr2[iM1332g] = objArrCopyOf;
                        } else {
                            objArrCopyOf = objArr2[iM1332g];
                            if (i4 == objArrCopyOf.length) {
                                objArrCopyOf = Arrays.copyOf(objArrCopyOf, objArrCopyOf.length * 2);
                                objArr2[iM1332g] = objArrCopyOf;
                            }
                        }
                        objArrCopyOf[i4] = obj2;
                        iArr[iM1332g] = iArr[iM1332g] + 1;
                    }
                }
            }
        }
        int iM1332g2 = m1332g(obj);
        Object[][] objArr4 = this.f1056b;
        Object[] objArr5 = objArr4[iM1332g2];
        if (objArr5 == null) {
            Object[] objArr6 = new C0368jk[i3];
            objArr6[0] = obj;
            objArr4[iM1332g2] = objArr6;
            this.f1057c++;
            return obj;
        }
        for (int i5 = 0; i5 < objArr5.length; i5++) {
            Object obj3 = objArr5[i5];
            if (obj3 == null) {
                objArr5[i5] = obj;
                this.f1057c++;
                return obj;
            }
            if (this.f1055a.mo1329e(obj3, obj)) {
                return obj3;
            }
        }
        int length2 = objArr5.length;
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr5, objArr5.length * 2);
        this.f1056b[iM1332g2] = objArrCopyOf2;
        objArrCopyOf2[length2] = obj;
        this.f1057c++;
        return obj;
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int iM1523j = 0;
        for (Object[] objArr : this.f1056b) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        break;
                    }
                    iM1523j = AbstractC0534po.m1523j(iM1523j, this.f1055a.mo1330f(obj));
                }
            }
        }
        return AbstractC0534po.m1518e(iM1523j, this.f1057c);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m1334i(C0368jk c0368jk) {
        Object obj;
        if (c0368jk == null) {
            return false;
        }
        Object[] objArr = this.f1056b[m1332g(c0368jk)];
        if (objArr == null) {
            return false;
        }
        for (int i = 0; i < objArr.length && (obj = objArr[i]) != null; i++) {
            if (this.f1055a.mo1329e(obj, c0368jk)) {
                System.arraycopy(objArr, i + 1, objArr, i, (objArr.length - i) - 1);
                objArr[objArr.length - 1] = null;
                this.f1057c--;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f1057c == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0540pu(this, toArray());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return m1334i(!(obj instanceof C0368jk) ? null : (C0368jk) obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        boolean zM1334i = false;
        for (Object obj : collection) {
            zM1334i |= m1334i(!(obj instanceof C0368jk) ? null : (C0368jk) obj);
        }
        return zM1334i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Object obj;
        int i = 0;
        for (Object[] objArr : this.f1056b) {
            if (objArr != null) {
                int i2 = 0;
                int i3 = 0;
                while (i2 < objArr.length && (obj = objArr[i2]) != null) {
                    if (collection.contains(obj)) {
                        if (i2 != i3) {
                            objArr[i3] = objArr[i2];
                        }
                        i3++;
                        i++;
                    }
                    i2++;
                }
                i += i3;
                while (i3 < i2) {
                    objArr[i3] = null;
                    i3++;
                }
            }
        }
        boolean z = i != this.f1057c;
        this.f1057c = i;
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f1057c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        C0368jk[] c0368jkArr = new C0368jk[this.f1057c];
        int i = 0;
        for (Object[] objArr : this.f1056b) {
            if (objArr != null) {
                int length = objArr.length;
                int i2 = 0;
                while (i2 < length) {
                    Object obj = objArr[i2];
                    if (obj == null) {
                        break;
                    }
                    c0368jkArr[i] = obj;
                    i2++;
                    i++;
                }
            }
        }
        return c0368jkArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        int length = objArr.length;
        int i = this.f1057c;
        if (length < i) {
            objArr = Arrays.copyOf(objArr, i);
        }
        int i2 = 0;
        for (Object[] objArr2 : this.f1056b) {
            if (objArr2 != null) {
                int length2 = objArr2.length;
                int i3 = 0;
                while (i3 < length2) {
                    Object obj = objArr2[i3];
                    if (obj == null) {
                        break;
                    }
                    objArr[i2] = obj;
                    i3++;
                    i2++;
                }
            }
        }
        return objArr;
    }

    public final String toString() {
        if (this.f1057c == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (Object[] objArr : this.f1056b) {
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (obj == null) {
                        break;
                    }
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(obj.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
