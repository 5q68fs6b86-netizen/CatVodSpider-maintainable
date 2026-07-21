package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s;
import com.github.catvod.spider.support.p044FM.p055K.C1385e;
import com.github.catvod.spider.support.p044FM.p055K.C1389i;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p055K.C1403w;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.M.B */
/* JADX INFO: loaded from: classes.dex */
public final class C1520B extends AbstractC1532N {
    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        for (AbstractC1399s abstractC1399s : c1393m2.m3519h()) {
            if (!(abstractC1399s instanceof C1385e) && !(abstractC1399s instanceof C1403w) && !(abstractC1399s instanceof C1389i)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return ":empty";
    }
}
