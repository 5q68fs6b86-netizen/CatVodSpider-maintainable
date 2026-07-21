package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1285k;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.m0 */
/* JADX INFO: loaded from: classes.dex */
public class C2002m0 extends AbstractC2016t0 {

    /* JADX INFO: renamed from: b */
    public final C1285k f4566b;

    public C2002m0(AbstractC2001m abstractC2001m, C1285k c1285k) {
        super(abstractC2001m);
        if (c1285k == null) {
            c1285k = new C1285k(new int[0]);
            c1285k.m3206a(0);
        }
        this.f4566b = c1285k;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC2016t0
    /* JADX INFO: renamed from: a */
    public int mo4731a() {
        return 7;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC2016t0
    /* JADX INFO: renamed from: c */
    public final C1285k mo4771c() {
        return this.f4566b;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC2016t0
    /* JADX INFO: renamed from: d */
    public boolean mo4732d(int i, int i2) {
        return this.f4566b.m3209d(i);
    }

    public String toString() {
        return this.f4566b.toString();
    }
}
