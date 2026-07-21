package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.wt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0728wt extends AbstractC0724wp {
    /* JADX INFO: renamed from: a */
    public static List m1854a(InterfaceC0319hp interfaceC0319hp) {
        Iterator it = interfaceC0319hp.iterator();
        if (!it.hasNext()) {
            return C0230eh.f777a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return AbstractC0624sx.m1710l(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
