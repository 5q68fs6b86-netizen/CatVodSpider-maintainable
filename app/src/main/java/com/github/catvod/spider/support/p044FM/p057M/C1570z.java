package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p057M.z */
/* JADX INFO: loaded from: classes.dex */
public final class C1570z extends AbstractC1569y {
    public C1570z(int i) {
        super(i);
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        return c1393m2.m3458Y() > this.f3517a;
    }

    public final String toString() {
        return String.format(":gt(%d)", Integer.valueOf(this.f3517a));
    }
}
