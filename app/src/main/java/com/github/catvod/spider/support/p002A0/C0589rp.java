package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.rp */
/* JADX INFO: loaded from: classes.dex */
public final class C0589rp extends ArrayList {
    public C0589rp(C0226ed... c0226edArr) {
        super(Arrays.asList(c0226edArr));
    }

    /* JADX INFO: renamed from: a */
    public final String m1640a(String str) {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            C0226ed c0226ed = (C0226ed) it.next();
            if (c0226ed.m1229av(str)) {
                return c0226ed.mo1228au(str);
            }
        }
        return "";
    }

    @Override // java.util.ArrayList
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C0589rp clone() {
        C0589rp c0589rp = new C0589rp(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            c0589rp.add(((C0226ed) it.next()).mo923b());
        }
        return c0589rp;
    }

    /* JADX INFO: renamed from: c */
    public final String m1642c() {
        return (String) stream().map(new C0234el(3)).collect(AbstractC0727ws.m1851m("\n"));
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            ((C0226ed) it.next()).m1234ba();
        }
        super.clear();
    }

    /* JADX INFO: renamed from: d */
    public final String m1643d() {
        return (String) stream().map(new C0234el(5)).collect(AbstractC0727ws.m1851m("\n"));
    }

    /* JADX INFO: renamed from: e */
    public final C0589rp m1644e(String str) {
        AbstractC0711wc.m1768c(str);
        AbstractC0213dr abstractC0213drM1458h = C0471nf.m1458h(str);
        C0589rp c0589rp = new C0589rp();
        IdentityHashMap identityHashMap = new IdentityHashMap();
        Iterator it = iterator();
        while (it.hasNext()) {
            C0226ed c0226ed = (C0226ed) it.next();
            AbstractC0711wc.m1770e(abstractC0213drM1458h);
            AbstractC0711wc.m1770e(c0226ed);
            for (C0226ed c0226ed2 : AbstractC0149bh.m1024a(abstractC0213drM1458h, c0226ed)) {
                if (identityHashMap.put(c0226ed2, Boolean.TRUE) == null) {
                    c0589rp.add(c0226ed2);
                }
            }
        }
        return c0589rp;
    }

    /* JADX INFO: renamed from: f */
    public final String m1645f() {
        return (String) stream().map(new C0234el(4)).collect(AbstractC0727ws.m1851m(" "));
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        C0226ed c0226ed = (C0226ed) super.remove(i);
        c0226ed.m1234ba();
        return c0226ed;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf == -1) {
            return false;
        }
        ((C0226ed) super.remove(iIndexOf)).m1234ba();
        return true;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.ArrayList, java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        Iterator<E> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (predicate.test((C0226ed) it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.ArrayList, java.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        for (int i = 0; i < size(); i++) {
            C0226ed c0226ed = (C0226ed) unaryOperator.apply((C0226ed) get(i));
            AbstractC0711wc.m1770e(c0226ed);
            ((C0226ed) super.set(i, c0226ed)).m1235bb(c0226ed);
        }
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(Collection collection) {
        Iterator<E> it = iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (!collection.contains((C0226ed) it.next())) {
                it.remove();
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        C0226ed c0226ed = (C0226ed) obj;
        AbstractC0711wc.m1770e(c0226ed);
        C0226ed c0226ed2 = (C0226ed) super.set(i, c0226ed);
        c0226ed2.m1235bb(c0226ed);
        return c0226ed2;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return m1643d();
    }
}
