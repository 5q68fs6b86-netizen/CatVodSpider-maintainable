package com.github.catvod.spider.support.p002A0;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.tc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0630tc extends AbstractC0629tb {
    /* JADX INFO: renamed from: o */
    public static void m1713o(Collection collection, Iterable iterable) {
        AbstractC0399ko.m1351f("<this>", collection);
        AbstractC0399ko.m1351f("elements", iterable);
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }
}
