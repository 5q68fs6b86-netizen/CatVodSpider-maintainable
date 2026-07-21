package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1285k;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p099y.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1982c0 extends AbstractC2016t0 {

    /* JADX INFO: renamed from: b */
    public final int f4527b;

    /* JADX INFO: renamed from: c */
    public final int f4528c;

    public C1982c0(AbstractC2001m abstractC2001m, int i, int i2) {
        super(abstractC2001m);
        this.f4527b = i;
        this.f4528c = i2;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC2016t0
    /* JADX INFO: renamed from: a */
    public final int mo4731a() {
        return 2;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC2016t0
    /* JADX INFO: renamed from: c */
    public final C1285k mo4771c() {
        return C1285k.m3204g(this.f4527b, this.f4528c);
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC2016t0
    /* JADX INFO: renamed from: d */
    public final boolean mo4732d(int i, int i2) {
        return i >= this.f4527b && i <= this.f4528c;
    }

    public final String toString() {
        StringBuilder sbAppendCodePoint = new StringBuilder("'").appendCodePoint(this.f4527b);
        sbAppendCodePoint.append("'..'");
        StringBuilder sbAppendCodePoint2 = sbAppendCodePoint.appendCodePoint(this.f4528c);
        sbAppendCodePoint2.append("'");
        return sbAppendCodePoint2.toString();
    }
}
