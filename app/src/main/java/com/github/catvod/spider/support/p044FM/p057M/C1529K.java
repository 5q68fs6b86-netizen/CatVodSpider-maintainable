package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.C1388h;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p057M.K */
/* JADX INFO: loaded from: classes.dex */
public final class C1529K extends AbstractC1532N {
    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        C1393m c1393mM3473k0 = c1393m2.m3473k0();
        if (c1393mM3473k0 == null || (c1393mM3473k0 instanceof C1388h)) {
            return false;
        }
        Iterator<C1393m> it = c1393mM3473k0.m3456V().iterator();
        int i = 0;
        while (it.hasNext()) {
            if (it.next().m3482s0().equals(c1393m2.m3482s0())) {
                i++;
            }
        }
        return i == 1;
    }

    public final String toString() {
        return ":only-of-type";
    }
}
