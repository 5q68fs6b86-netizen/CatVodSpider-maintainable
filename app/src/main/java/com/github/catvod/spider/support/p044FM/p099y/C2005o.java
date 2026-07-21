package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p056L.C1434P;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p099y.o */
/* JADX INFO: loaded from: classes.dex */
public final class C2005o extends AbstractC2016t0 {

    /* JADX INFO: renamed from: b */
    public final int f4569b;

    /* JADX INFO: renamed from: c */
    public final int f4570c;

    public C2005o(AbstractC2001m abstractC2001m, int i, int i2) {
        super(abstractC2001m);
        this.f4569b = i;
        this.f4570c = i2;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC2016t0
    /* JADX INFO: renamed from: a */
    public final int mo4731a() {
        return 6;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC2016t0
    /* JADX INFO: renamed from: d */
    public final boolean mo4732d(int i, int i2) {
        return false;
    }

    public final String toString() {
        StringBuilder sbM3589b = C1434P.m3589b("action_");
        sbM3589b.append(this.f4569b);
        sbM3589b.append(":");
        sbM3589b.append(this.f4570c);
        return sbM3589b.toString();
    }
}
