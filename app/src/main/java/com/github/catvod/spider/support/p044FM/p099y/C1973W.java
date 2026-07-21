package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p056L.C1434P;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p099y.W */
/* JADX INFO: loaded from: classes.dex */
public final class C1973W extends AbstractC2003n {

    /* JADX INFO: renamed from: b */
    public final int f4506b;

    /* JADX INFO: renamed from: c */
    public final int f4507c;

    /* JADX INFO: renamed from: d */
    public final boolean f4508d;

    public C1973W(AbstractC2001m abstractC2001m, int i, int i2, boolean z) {
        super(abstractC2001m);
        this.f4506b = i;
        this.f4507c = i2;
        this.f4508d = z;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC2016t0
    /* JADX INFO: renamed from: a */
    public final int mo4731a() {
        return 4;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC2016t0
    /* JADX INFO: renamed from: b */
    public final boolean mo4749b() {
        return true;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC2016t0
    /* JADX INFO: renamed from: d */
    public final boolean mo4732d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder sbM3589b = C1434P.m3589b("pred_");
        sbM3589b.append(this.f4506b);
        sbM3589b.append(":");
        sbM3589b.append(this.f4507c);
        return sbM3589b.toString();
    }
}
