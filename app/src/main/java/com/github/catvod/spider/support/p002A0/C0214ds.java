package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ds */
/* JADX INFO: loaded from: classes.dex */
public final class C0214ds extends AbstractC0213dr {

    /* JADX INFO: renamed from: a */
    public final int f751a;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f752e;

    public C0214ds(int i, int i2) {
        this.f752e = i2;
        this.f751a = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: c */
    public final boolean mo1020c(C0226ed c0226ed, C0226ed c0226ed2) {
        switch (this.f752e) {
            case 0:
                return c0226ed2.m1160ab() == this.f751a;
            case 1:
                return c0226ed2.m1160ab() > this.f751a;
            default:
                return c0226ed != c0226ed2 && c0226ed2.m1160ab() < this.f751a;
        }
    }

    public final String toString() {
        int i = this.f751a;
        switch (this.f752e) {
            case 0:
                return String.format(":eq(%d)", Integer.valueOf(i));
            case 1:
                return String.format(":gt(%d)", Integer.valueOf(i));
            default:
                return String.format(":lt(%d)", Integer.valueOf(i));
        }
    }
}
