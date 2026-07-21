package com.github.catvod.spider.support.p044FM.p063S;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p063S.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1614b {

    /* JADX INFO: renamed from: a */
    protected AbstractC1625m f3675a;

    /* JADX INFO: renamed from: b */
    protected int f3676b = 0;

    /* JADX INFO: renamed from: c */
    protected int f3677c;

    public C1614b(AbstractC1625m abstractC1625m) {
        this.f3675a = abstractC1625m;
    }

    /* JADX INFO: renamed from: a */
    public final String m3820a() {
        return this.f3675a.f3710e;
    }

    /* JADX INFO: renamed from: b */
    public final int m3821b() {
        return this.f3677c;
    }

    /* JADX INFO: renamed from: c */
    public final int m3822c(byte b) {
        int iM3825b = this.f3675a.f3706a.m3825b(b & 255);
        int i = this.f3676b;
        if (i == 0) {
            this.f3677c = this.f3675a.f3709d[iM3825b];
        }
        AbstractC1625m abstractC1625m = this.f3675a;
        int iM3825b2 = abstractC1625m.f3708c.m3825b((i * abstractC1625m.f3707b) + iM3825b);
        this.f3676b = iM3825b2;
        return iM3825b2;
    }

    /* JADX INFO: renamed from: d */
    public final void m3823d() {
        this.f3676b = 0;
    }
}
