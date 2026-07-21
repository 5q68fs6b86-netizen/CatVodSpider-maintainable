package com.github.catvod.spider.support.p137w;

import com.github.catvod.spider.support.p043F.C1273a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.github.catvod.spider.support.w.d */
/* JADX INFO: loaded from: classes.dex */
public class C2402d<K, V> implements Map<K, V> {

    /* JADX INFO: renamed from: a */
    protected final AbstractC2399a f5952a;

    /* JADX INFO: renamed from: c */
    protected int f5954c = 0;

    /* JADX INFO: renamed from: d */
    protected int f5955d = 12;

    /* JADX INFO: renamed from: b */
    protected LinkedList<a<K, V>>[] f5953b = new LinkedList[8];

    /* JADX INFO: renamed from: com.github.catvod.spider.support.w.d$a */
    public static class a<K, V> {

        /* JADX INFO: renamed from: a */
        public final K f5956a;

        /* JADX INFO: renamed from: b */
        public V f5957b;

        public a(K k, V v) {
            this.f5956a = k;
            this.f5957b = v;
        }

        public final String toString() {
            return this.f5956a.toString() + ":" + this.f5957b.toString();
        }
    }

    public C2402d(AbstractC2399a abstractC2399a) {
        this.f5952a = abstractC2399a;
    }

    @Override // java.util.Map
    public final void clear() {
        this.f5953b = new LinkedList[16];
        this.f5954c = 0;
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
        int iMo6339F = this.f5952a.mo6339F(obj);
        LinkedList<a<K, V>>[] linkedListArr = this.f5953b;
        LinkedList<a<K, V>> linkedList = linkedListArr[iMo6339F & (linkedListArr.length - 1)];
        if (linkedList == null) {
            return null;
        }
        for (a<K, V> aVar : linkedList) {
            if (this.f5952a.mo6338E(aVar.f5956a, obj)) {
                return aVar.f5957b;
            }
        }
        return null;
    }

    @Override // java.util.Map
    public final int hashCode() {
        a<K, V> next;
        int iM3168h = 0;
        for (LinkedList<a<K, V>> linkedList : this.f5953b) {
            if (linkedList != null) {
                Iterator<a<K, V>> it = linkedList.iterator();
                while (it.hasNext() && (next = it.next()) != null) {
                    iM3168h = C1273a.m3168h(iM3168h, this.f5952a.mo6339F(next.f5956a));
                }
            }
        }
        return C1273a.m3160b(iM3168h, this.f5954c);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.f5954c == 0;
    }

    @Override // java.util.Map
    public final Set<K> keySet() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final V put(K k, V v) {
        a<K, V> next;
        if (k == null) {
            return null;
        }
        if (this.f5954c > this.f5955d) {
            LinkedList<a<K, V>>[] linkedListArr = this.f5953b;
            int length = linkedListArr.length * 2;
            this.f5953b = new LinkedList[length];
            double d = length;
            Double.isNaN(d);
            Double.isNaN(d);
            Double.isNaN(d);
            this.f5955d = (int) (d * 0.75d);
            int i = this.f5954c;
            for (LinkedList<a<K, V>> linkedList : linkedListArr) {
                if (linkedList != null) {
                    Iterator<a<K, V>> it = linkedList.iterator();
                    while (it.hasNext() && (next = it.next()) != null) {
                        put(next.f5956a, next.f5957b);
                    }
                }
            }
            this.f5954c = i;
        }
        int iMo6339F = this.f5952a.mo6339F(k);
        LinkedList<a<K, V>>[] linkedListArr2 = this.f5953b;
        int length2 = iMo6339F & (linkedListArr2.length - 1);
        LinkedList<a<K, V>> linkedList2 = linkedListArr2[length2];
        if (linkedList2 == null) {
            linkedList2 = new LinkedList<>();
            linkedListArr2[length2] = linkedList2;
        }
        for (a<K, V> aVar : linkedList2) {
            if (this.f5952a.mo6338E(aVar.f5956a, k)) {
                V v2 = aVar.f5957b;
                aVar.f5957b = v;
                this.f5954c++;
                return v2;
            }
        }
        linkedList2.add(new a<>(k, v));
        this.f5954c++;
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
        return this.f5954c;
    }

    public final String toString() {
        a<K, V> next;
        if (this.f5954c == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        boolean z = true;
        for (LinkedList<a<K, V>> linkedList : this.f5953b) {
            if (linkedList != null) {
                Iterator<a<K, V>> it = linkedList.iterator();
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
        ArrayList arrayList = new ArrayList(this.f5954c);
        for (LinkedList<a<K, V>> linkedList : this.f5953b) {
            if (linkedList != null) {
                Iterator<a<K, V>> it = linkedList.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().f5957b);
                }
            }
        }
        return arrayList;
    }
}
