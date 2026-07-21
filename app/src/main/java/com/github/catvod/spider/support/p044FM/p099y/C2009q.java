package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1285k;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p099y.q */
/* JADX INFO: loaded from: classes.dex */
public final class C2009q extends AbstractC2016t0 {

    /* JADX INFO: renamed from: b */
    public final int f4575b;

    public C2009q(AbstractC2001m abstractC2001m, int i) {
        super(abstractC2001m);
        this.f4575b = i;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC2016t0
    /* JADX INFO: renamed from: a */
    public final int mo4731a() {
        return 5;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC2016t0
    /* JADX INFO: renamed from: c */
    public final C1285k mo4771c() {
        int i = this.f4575b;
        C1285k c1285k = new C1285k(new int[0]);
        c1285k.m3206a(i);
        return c1285k;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC2016t0
    /* JADX INFO: renamed from: d */
    public final boolean mo4732d(int i, int i2) {
        return this.f4575b == i;
    }

    public final String toString() {
        return String.valueOf(this.f4575b);
    }
}
