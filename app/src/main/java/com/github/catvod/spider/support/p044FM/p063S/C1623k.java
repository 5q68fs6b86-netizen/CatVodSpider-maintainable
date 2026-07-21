package com.github.catvod.spider.support.p044FM.p063S;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p063S.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1623k {

    /* JADX INFO: renamed from: a */
    private int[] f3702a;

    public C1623k(int[] iArr) {
        this.f3702a = iArr;
    }

    /* JADX INFO: renamed from: a */
    public static int m3824a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        return i | (i2 << 4) | (((i4 << 4) | i3) << 8) | (((((i8 << 4) | i7) << 8) | ((i6 << 4) | i5)) << 16);
    }

    /* JADX INFO: renamed from: b */
    public final int m3825b(int i) {
        return (this.f3702a[i >> 3] >> ((i & 7) << 2)) & 15;
    }
}
