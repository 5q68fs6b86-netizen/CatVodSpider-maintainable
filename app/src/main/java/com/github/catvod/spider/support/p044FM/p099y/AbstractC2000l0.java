package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p098x.AbstractC1917C;
import com.github.catvod.spider.support.p044FM.p098x.C1918D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.l0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2000l0 {

    /* JADX INFO: renamed from: a */
    public static final C1998k0 f4559a = new C1998k0();

    /* JADX INFO: renamed from: a */
    static List m4784a(Collection collection) {
        Iterator it = collection.iterator();
        ArrayList arrayList = null;
        while (it.hasNext()) {
            AbstractC2000l0 abstractC2000l0 = (AbstractC2000l0) it.next();
            if (abstractC2000l0 instanceof C1996j0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((C1996j0) abstractC2000l0);
                it.remove();
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC2000l0 m4785b(AbstractC2000l0 abstractC2000l0, AbstractC2000l0 abstractC2000l1) {
        C1998k0 c1998k0;
        if (abstractC2000l0 == null || abstractC2000l0 == (c1998k0 = f4559a)) {
            return abstractC2000l1;
        }
        if (abstractC2000l1 == null || abstractC2000l1 == c1998k0) {
            return abstractC2000l0;
        }
        C1990g0 c1990g0 = new C1990g0(abstractC2000l0, abstractC2000l1);
        AbstractC2000l0[] abstractC2000l0Arr = c1990g0.f4544b;
        return abstractC2000l0Arr.length == 1 ? abstractC2000l0Arr[0] : c1990g0;
    }

    /* JADX INFO: renamed from: e */
    public static AbstractC2000l0 m4786e(AbstractC2000l0 abstractC2000l0, AbstractC2000l0 abstractC2000l1) {
        AbstractC2000l0 abstractC2000l2;
        if (abstractC2000l0 == null) {
            return abstractC2000l1;
        }
        if (abstractC2000l1 == null) {
            return abstractC2000l0;
        }
        C1998k0 c1998k0 = f4559a;
        if (abstractC2000l0 != c1998k0 && abstractC2000l1 != c1998k0) {
            C1992h0 c1992h0 = new C1992h0(abstractC2000l0, abstractC2000l1);
            AbstractC2000l0[] abstractC2000l0Arr = c1992h0.f4545b;
            abstractC2000l2 = c1992h0;
            if (abstractC2000l0Arr.length == 1) {
                return abstractC2000l0Arr[0];
            }
        }
        abstractC2000l2 = c1998k0;
        abstractC2000l2 = c1998k0;
        return abstractC2000l2;
    }

    /* JADX INFO: renamed from: c */
    public abstract boolean mo4775c(AbstractC1917C<?, ?> abstractC1917C, C1918D c1918d);

    /* JADX INFO: renamed from: d */
    public AbstractC2000l0 mo4776d(AbstractC1917C<?, ?> abstractC1917C, C1918D c1918d) {
        return this;
    }
}
