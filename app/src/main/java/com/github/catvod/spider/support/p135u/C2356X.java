package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p137w.C2407i;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.X */
/* JADX INFO: loaded from: classes.dex */
public final class C2356X extends AbstractC2376i0 {

    /* JADX INFO: renamed from: b */
    public final int f5831b;

    /* JADX INFO: renamed from: c */
    public final int f5832c;

    public C2356X(AbstractC2375i abstractC2375i, int i, int i2) {
        super(abstractC2375i);
        this.f5831b = i;
        this.f5832c = i2;
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2376i0
    /* JADX INFO: renamed from: a */
    public final int mo6309a() {
        return 2;
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2376i0
    /* JADX INFO: renamed from: c */
    public final C2407i mo6343c() {
        return C2407i.m6414g(this.f5831b, this.f5832c);
    }

    @Override // com.github.catvod.spider.support.p135u.AbstractC2376i0
    /* JADX INFO: renamed from: d */
    public final boolean mo6310d(int i, int i2) {
        return i >= this.f5831b && i <= this.f5832c;
    }

    public final String toString() {
        StringBuilder sbAppendCodePoint = new StringBuilder("'").appendCodePoint(this.f5831b);
        sbAppendCodePoint.append("'..'");
        StringBuilder sbAppendCodePoint2 = sbAppendCodePoint.appendCodePoint(this.f5832c);
        sbAppendCodePoint2.append("'");
        return sbAppendCodePoint2.toString();
    }
}
