package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.M.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1567w extends AbstractC1532N {

    /* JADX INFO: renamed from: a */
    private final String f3516a;

    public C1567w(String str) {
        this.f3516a = str;
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        return this.f3516a.equals(c1393m2.m3464d0());
    }

    public final String toString() {
        return String.format("#%s", this.f3516a);
    }
}
