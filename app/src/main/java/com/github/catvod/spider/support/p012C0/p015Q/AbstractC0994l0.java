package com.github.catvod.spider.support.p012C0.p015Q;

import com.github.catvod.spider.support.C0.Q.g0;
import com.github.catvod.spider.support.C0.Q.h0;
import com.github.catvod.spider.support.C0.Q.j0;
import com.github.catvod.spider.support.C0.Q.k0;
import com.github.catvod.spider.support.p012C0.p014P.AbstractC0967B;
import com.github.catvod.spider.support.p012C0.p014P.C0968C;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.Q.l0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0994l0 {

    /* JADX INFO: renamed from: c */
    public static final k0 f2443c = new k0();

    /* JADX INFO: renamed from: a */
    static List m2507a(Collection collection) {
        Iterator it = collection.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            j0 j0Var = (AbstractC0994l0) it.next();
            if (j0Var instanceof j0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(j0Var);
                it.remove();
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC0994l0 m2508b(AbstractC0994l0 abstractC0994l0, AbstractC0994l0 abstractC0994l1) {
        k0 k0Var;
        if (abstractC0994l0 == null || abstractC0994l0 == (k0Var = f2443c)) {
            return abstractC0994l1;
        }
        if (abstractC0994l1 == null || abstractC0994l1 == k0Var) {
            return abstractC0994l0;
        }
        g0 g0Var = new g0(abstractC0994l0, abstractC0994l1);
        AbstractC0994l0[] abstractC0994l0Arr = g0Var.d;
        return abstractC0994l0Arr.length == 1 ? abstractC0994l0Arr[0] : g0Var;
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC0994l0 m2509e(AbstractC0994l0 abstractC0994l0, AbstractC0994l0 abstractC0994l1) {
        if (abstractC0994l0 == null) {
            return abstractC0994l1;
        }
        if (abstractC0994l1 == null) {
            return abstractC0994l0;
        }
        h0 h0Var = f2443c;
        if (abstractC0994l0 != h0Var && abstractC0994l1 != h0Var) {
            h0Var = new h0(abstractC0994l0, abstractC0994l1);
            AbstractC0994l0[] abstractC0994l0Arr = h0Var.d;
            if (abstractC0994l0Arr.length == 1) {
                return abstractC0994l0Arr[0];
            }
        }
        return h0Var;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean m2510c(AbstractC0967B<?, ?> abstractC0967B, C0968C c0968c);

    /* JADX INFO: renamed from: d */
    public AbstractC0994l0 m2511d(AbstractC0967B<?, ?> abstractC0967B, C0968C c0968c) {
        return this;
    }
}
