package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.qc */
/* JADX INFO: loaded from: classes.dex */
public final class C0549qc extends AbstractC0488nw {

    /* JADX INFO: renamed from: a */
    public final int f1392a;

    public C0549qc(AbstractC0428lq abstractC0428lq, int i) {
        super(abstractC0428lq);
        this.f1392a = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0488nw
    /* JADX INFO: renamed from: b */
    public final int mo871b() {
        return 5;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0488nw
    /* JADX INFO: renamed from: c */
    public final C0339ii mo1088c() {
        C0339ii c0339ii = new C0339ii(new int[0]);
        c0339ii.m1302c(this.f1392a);
        return c0339ii;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0488nw
    /* JADX INFO: renamed from: d */
    public final boolean mo872d(int i, int i2) {
        return this.f1392a == i;
    }

    public final String toString() {
        return String.valueOf(this.f1392a);
    }
}
