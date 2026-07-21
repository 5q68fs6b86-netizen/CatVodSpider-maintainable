package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.hr */
/* JADX INFO: loaded from: classes.dex */
public final class C0321hr extends AbstractC0488nw {

    /* JADX INFO: renamed from: a */
    public final int f928a;

    /* JADX INFO: renamed from: f */
    public final int f929f;

    public C0321hr(AbstractC0428lq abstractC0428lq, int i, int i2) {
        super(abstractC0428lq);
        this.f928a = i;
        this.f929f = i2;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0488nw
    /* JADX INFO: renamed from: b */
    public final int mo871b() {
        return 2;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0488nw
    /* JADX INFO: renamed from: c */
    public final C0339ii mo1088c() {
        C0339ii c0339ii = new C0339ii(new int[0]);
        c0339ii.m1303d(this.f928a, this.f929f);
        return c0339ii;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0488nw
    /* JADX INFO: renamed from: d */
    public final boolean mo872d(int i, int i2) {
        return i >= this.f928a && i <= this.f929f;
    }

    public final String toString() {
        StringBuilder sbAppendCodePoint = new StringBuilder("'").appendCodePoint(this.f928a);
        sbAppendCodePoint.append("'..'");
        StringBuilder sbAppendCodePoint2 = sbAppendCodePoint.appendCodePoint(this.f929f);
        sbAppendCodePoint2.append("'");
        return sbAppendCodePoint2.toString();
    }
}
