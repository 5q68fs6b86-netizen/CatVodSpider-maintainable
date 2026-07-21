package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class abn implements Map {

    /* JADX INFO: renamed from: a */
    public final AbstractC0760xy f528a;

    /* JADX INFO: renamed from: b */
    public LinkedList[] f529b;

    /* JADX INFO: renamed from: c */
    public int f530c;

    /* JADX INFO: renamed from: d */
    public int f531d;

    public abn() {
        C0369jl c0369jl = C0369jl.f1053c;
        this.f530c = 0;
        this.f531d = 12;
        this.f528a = c0369jl;
        this.f529b = new LinkedList[8];
    }

    @Override // java.util.Map
    public final void clear() {
        this.f529b = new LinkedList[16];
        this.f530c = 0;
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        AbstractC0760xy abstractC0760xy = this.f528a;
        int iMo1330f = abstractC0760xy.mo1330f(obj);
        LinkedList[] linkedListArr = this.f529b;
        LinkedList<C0431lt> linkedList = linkedListArr[iMo1330f & (linkedListArr.length - 1)];
        if (linkedList == null) {
            return null;
        }
        for (C0431lt c0431lt : linkedList) {
            if (abstractC0760xy.mo1329e(c0431lt.f1192a, obj)) {
                return c0431lt.f1193b;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        C0431lt c0431lt;
        int iM1523j = 0;
        for (LinkedList linkedList : this.f529b) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext() && (c0431lt = (C0431lt) it.next()) != null) {
                    iM1523j = AbstractC0534po.m1523j(iM1523j, this.f528a.mo1330f(c0431lt.f1192a));
                }
            }
        }
        return AbstractC0534po.m1518e(iM1523j, this.f530c);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f530c == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        C0431lt c0431lt;
        if (obj == null) {
            return null;
        }
        int i = this.f530c;
        if (i > this.f531d) {
            LinkedList[] linkedListArr = this.f529b;
            int length = linkedListArr.length * 2;
            this.f529b = new LinkedList[length];
            this.f531d = (int) (((double) length) * 0.75d);
            for (LinkedList linkedList : linkedListArr) {
                if (linkedList != null) {
                    Iterator it = linkedList.iterator();
                    while (it.hasNext() && (c0431lt = (C0431lt) it.next()) != null) {
                        put(c0431lt.f1192a, c0431lt.f1193b);
                    }
                }
            }
            this.f530c = i;
        }
        AbstractC0760xy abstractC0760xy = this.f528a;
        int iMo1330f = abstractC0760xy.mo1330f(obj);
        LinkedList[] linkedListArr2 = this.f529b;
        int length2 = iMo1330f & (linkedListArr2.length - 1);
        LinkedList<C0431lt> linkedList2 = linkedListArr2[length2];
        if (linkedList2 == null) {
            linkedList2 = new LinkedList();
            linkedListArr2[length2] = linkedList2;
        }
        for (C0431lt c0431lt2 : linkedList2) {
            if (abstractC0760xy.mo1329e(c0431lt2.f1192a, obj)) {
                Object obj3 = c0431lt2.f1193b;
                c0431lt2.f1193b = obj2;
                this.f530c++;
                return obj3;
            }
        }
        linkedList2.add(new C0431lt(obj, obj2));
        this.f530c++;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f530c;
    }

    public final String toString() {
        C0431lt c0431lt;
        if (this.f530c == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder("{");
        boolean z = true;
        for (LinkedList linkedList : this.f529b) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext() && (c0431lt = (C0431lt) it.next()) != null) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(c0431lt.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        ArrayList arrayList = new ArrayList(this.f530c);
        for (LinkedList linkedList : this.f529b) {
            if (linkedList != null) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C0431lt) it.next()).f1193b);
                }
            }
        }
        return arrayList;
    }
}
