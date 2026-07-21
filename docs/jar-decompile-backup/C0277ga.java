package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ga */
/* JADX INFO: loaded from: classes.dex */
public class C0277ga extends AbstractC0753xr {

    /* JADX INFO: renamed from: e */
    public final AbstractC0753xr f852e;

    /* JADX INFO: renamed from: f */
    public final int f853f;

    public C0277ga(AbstractC0753xr abstractC0753xr, int i) {
        super(abstractC0753xr != null ? AbstractC0534po.m1518e(AbstractC0534po.m1523j(AbstractC0534po.m1524k(1, abstractC0753xr), i), 2) : AbstractC0534po.m1518e(1, 0));
        this.f852e = abstractC0753xr;
        this.f853f = i;
    }

    /* JADX INFO: renamed from: g */
    public static C0277ga m1242g(AbstractC0753xr abstractC0753xr, int i) {
        return (i == Integer.MAX_VALUE && abstractC0753xr == null) ? AbstractC0753xr.f1815h : new C0277ga(abstractC0753xr, i);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0753xr
    /* JADX INFO: renamed from: a */
    public AbstractC0753xr mo1140a(int i) {
        return this.f852e;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0753xr
    /* JADX INFO: renamed from: b */
    public int mo1141b(int i) {
        return this.f853f;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0753xr
    /* JADX INFO: renamed from: d */
    public int mo1143d() {
        return 1;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0753xr
    public boolean equals(Object obj) {
        AbstractC0753xr abstractC0753xr;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0277ga)) {
            return false;
        }
        if (this.f1816i != ((AbstractC0753xr) obj).f1816i) {
            return false;
        }
        C0277ga c0277ga = (C0277ga) obj;
        return this.f853f == c0277ga.f853f && (abstractC0753xr = this.f852e) != null && abstractC0753xr.equals(c0277ga.f852e);
    }

    public String toString() {
        AbstractC0753xr abstractC0753xr = this.f852e;
        String string = abstractC0753xr != null ? abstractC0753xr.toString() : "";
        int length = string.length();
        int i = this.f853f;
        if (length == 0) {
            return i == Integer.MAX_VALUE ? "$" : String.valueOf(i);
        }
        return String.valueOf(i) + " " + string;
    }
}
