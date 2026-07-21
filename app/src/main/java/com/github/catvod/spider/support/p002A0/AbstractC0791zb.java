package com.github.catvod.spider.support.p002A0;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.zb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0791zb {

    /* JADX INFO: renamed from: a */
    public static final C0737xb f1863a = new C0737xb("CONDITION_FALSE", 3);

    /* JADX INFO: renamed from: b */
    public static void m1910b(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }
}
