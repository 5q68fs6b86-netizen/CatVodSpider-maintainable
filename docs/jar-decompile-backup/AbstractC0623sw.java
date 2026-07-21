package com.github.catvod.spider.support.p002A0;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.sw */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0623sw extends AbstractC0630tc {
    /* JADX INFO: renamed from: a */
    public static final void m1699a(Collection collection, StringBuilder sb, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, InterfaceC0569qw interfaceC0569qw) {
        sb.append(charSequence2);
        int i = 0;
        for (Object obj : collection) {
            i++;
            if (i > 1) {
                sb.append(charSequence);
            }
            AbstractC0411l.m1366b(sb, obj, interfaceC0569qw);
        }
        sb.append(charSequence3);
    }

    /* JADX INFO: renamed from: b */
    public static String m1700b(Collection collection, String str, String str2, C0433lv c0433lv, int i) {
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        if ((i & 32) != 0) {
            c0433lv = null;
        }
        StringBuilder sb = new StringBuilder();
        m1699a(collection, sb, ", ", str3, str4, "...", c0433lv);
        String string = sb.toString();
        AbstractC0399ko.m1350e("toString(...)", string);
        return string;
    }

    /* JADX INFO: renamed from: c */
    public static Object m1701c(List list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(list.size() - 1);
    }

    /* JADX INFO: renamed from: d */
    public static ArrayList m1702d(Collection collection, Iterable iterable) {
        AbstractC0399ko.m1351f("<this>", collection);
        AbstractC0399ko.m1351f("elements", iterable);
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            AbstractC0630tc.m1713o(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    /* JADX INFO: renamed from: e */
    public static List m1703e(Iterable iterable, Comparator comparator) {
        AbstractC0399ko.m1351f("<this>", iterable);
        AbstractC0399ko.m1351f("comparator", comparator);
        if (!(iterable instanceof Collection)) {
            List listM1707i = m1707i(iterable);
            if (((ArrayList) listM1707i).size() > 1) {
                Collections.sort(listM1707i, comparator);
            }
            return listM1707i;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return m1706h(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        AbstractC0399ko.m1351f("<this>", array);
        if (array.length > 1) {
            Arrays.sort(array, comparator);
        }
        return AbstractC0548qb.m1567c(array);
    }

    /* JADX INFO: renamed from: f */
    public static List m1704f(Iterable iterable, int i) {
        Object next;
        AbstractC0399ko.m1351f("<this>", iterable);
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        C0230eh c0230eh = C0230eh.f777a;
        if (i == 0) {
            return c0230eh;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return m1706h(iterable);
            }
            if (i == 1) {
                if (iterable instanceof List) {
                    List list = (List) iterable;
                    if (list.isEmpty()) {
                        throw new NoSuchElementException("List is empty.");
                    }
                    next = list.get(0);
                } else {
                    Iterator it = iterable.iterator();
                    if (!it.hasNext()) {
                        throw new NoSuchElementException("Collection is empty.");
                    }
                    next = it.next();
                }
                return AbstractC0624sx.m1710l(next);
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it2 = iterable.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            arrayList.add(it2.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        int size = arrayList.size();
        if (size != 0) {
            return size != 1 ? arrayList : AbstractC0624sx.m1710l(arrayList.get(0));
        }
        return c0230eh;
    }

    /* JADX INFO: renamed from: g */
    public static final void m1705g(Iterable iterable, AbstractCollection abstractCollection) {
        AbstractC0399ko.m1351f("<this>", iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    /* JADX INFO: renamed from: h */
    public static List m1706h(Iterable iterable) {
        AbstractC0399ko.m1351f("<this>", iterable);
        boolean z = iterable instanceof Collection;
        C0230eh c0230eh = C0230eh.f777a;
        if (!z) {
            List listM1707i = m1707i(iterable);
            ArrayList arrayList = (ArrayList) listM1707i;
            int size = arrayList.size();
            if (size != 0) {
                return size != 1 ? listM1707i : AbstractC0624sx.m1710l(arrayList.get(0));
            }
            return c0230eh;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return c0230eh;
        }
        if (size2 != 1) {
            return new ArrayList(collection);
        }
        return AbstractC0624sx.m1710l(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    /* JADX INFO: renamed from: i */
    public static List m1707i(Iterable iterable) {
        AbstractC0399ko.m1351f("<this>", iterable);
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        m1705g(iterable, arrayList);
        return arrayList;
    }
}
