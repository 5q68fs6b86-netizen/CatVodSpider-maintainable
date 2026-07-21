package com.github.catvod.spider.support.p044FM.p045A;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.A.f */
/* JADX INFO: loaded from: classes.dex */
public class C1280f<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: a */
    protected final AbstractC1275a f3001a;

    /* JADX INFO: renamed from: c */
    protected int f3003c = 0;

    /* JADX INFO: renamed from: d */
    protected int f3004d = 12;

    /* JADX INFO: renamed from: b */
    protected LinkedList<C1279e<K, V>>[] f3002b = new LinkedList[8];

    public C1280f(AbstractC1275a abstractC1275a) {
        this.f3001a = abstractC1275a;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f3002b = new LinkedList[16];
        this.f3003c = 0;
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
    public final Set<Map.Entry<K, V>> entrySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        if (obj == null) {
            return null;
        }
        int iMo3182F = this.f3001a.mo3182F(obj);
        LinkedList<C1279e<K, V>>[] linkedListArr = this.f3002b;
        LinkedList<C1279e<K, V>> linkedList = linkedListArr[iMo3182F & (linkedListArr.length - 1)];
        if (linkedList == null) {
            return null;
        }
        for (C1279e<K, V> c1279e : linkedList) {
            if (this.f3001a.mo3181E(c1279e.f2999a, obj)) {
                return c1279e.f3000b;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        C1279e<K, V> next;
        int iM3224i = 0;
        for (LinkedList<C1279e<K, V>> linkedList : this.f3002b) {
            if (linkedList != null) {
                Iterator<C1279e<K, V>> it = linkedList.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    iM3224i = C1286l.m3224i(iM3224i, this.f3001a.mo3182F(next.f2999a));
                }
            }
        }
        return C1286l.m3218c(iM3224i, this.f3003c);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f3003c == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        C1279e<K, V> next;
        if (k == null) {
            return null;
        }
        if (this.f3003c > this.f3004d) {
            LinkedList<C1279e<K, V>>[] linkedListArr = this.f3002b;
            int length = linkedListArr.length * 2;
            this.f3002b = new LinkedList[length];
            double d = length;
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            this.f3004d = (int) (d * 0.75d);
            int i = this.f3003c;
            for (LinkedList<C1279e<K, V>> linkedList : linkedListArr) {
                if (linkedList != null) {
                    Iterator<C1279e<K, V>> it = linkedList.iterator();
                    while (it.hasNext() && (next = it.next()) != null) {
                        put(next.f2999a, next.f3000b);
                    }
                }
            }
            this.f3003c = i;
        }
        int iMo3182F = this.f3001a.mo3182F(k);
        LinkedList<C1279e<K, V>>[] linkedListArr2 = this.f3002b;
        int length2 = iMo3182F & (linkedListArr2.length - 1);
        LinkedList<C1279e<K, V>> linkedList2 = linkedListArr2[length2];
        if (linkedList2 == null) {
            linkedList2 = new LinkedList<>();
            linkedListArr2[length2] = linkedList2;
        }
        for (C1279e<K, V> c1279e : linkedList2) {
            if (this.f3001a.mo3181E(c1279e.f2999a, k)) {
                V v2 = c1279e.f3000b;
                c1279e.f3000b = v;
                this.f3003c++;
                return v2;
            }
        }
        linkedList2.add(new C1279e<>(k, v));
        this.f3003c++;
        return null;
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f3003c;
    }

    public final String toString() {
        C1279e<K, V> next;
        if (this.f3003c == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (LinkedList<C1279e<K, V>> linkedList : this.f3002b) {
            if (linkedList != null) {
                Iterator<C1279e<K, V>> it = linkedList.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    if (z) {
                        z = false;
                    } else {
                        sb.append(", ");
                    }
                    sb.append(next.toString());
                }
            }
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // java.util.Map
    public final Collection<V> values() {
        ArrayList arrayList = new ArrayList(this.f3003c);
        for (LinkedList<C1279e<K, V>> linkedList : this.f3002b) {
            if (linkedList != null) {
                Iterator<C1279e<K, V>> it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f3000b);
                }
            }
        }
        return arrayList;
    }
}
