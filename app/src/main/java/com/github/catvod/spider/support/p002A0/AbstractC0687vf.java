package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.vf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0687vf {

    /* JADX INFO: renamed from: e */
    public static final C0467nb f1592e = new C0467nb();

    /* JADX INFO: renamed from: f */
    public static List m1747f(HashSet hashSet) {
        Iterator it = hashSet.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            AbstractC0687vf abstractC0687vf = (AbstractC0687vf) it.next();
            if (abstractC0687vf instanceof aae) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((aae) abstractC0687vf);
                it.remove();
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static AbstractC0687vf m1748g(AbstractC0687vf abstractC0687vf, AbstractC0687vf abstractC0687vf2) {
        C0467nb c0467nb;
        if (abstractC0687vf == null || abstractC0687vf == (c0467nb = f1592e)) {
            return abstractC0687vf2;
        }
        if (abstractC0687vf2 == null || abstractC0687vf2 == c0467nb) {
            return abstractC0687vf;
        }
        C0806zq c0806zq = new C0806zq(abstractC0687vf, abstractC0687vf2);
        AbstractC0687vf[] abstractC0687vfArr = c0806zq.f1914a;
        return abstractC0687vfArr.length == 1 ? abstractC0687vfArr[0] : c0806zq;
    }

    /* JADX INFO: renamed from: b */
    public AbstractC0687vf mo875b(C0720wl c0720wl, C0579rf c0579rf) {
        return this;
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo876d(C0720wl c0720wl, C0579rf c0579rf);
}
