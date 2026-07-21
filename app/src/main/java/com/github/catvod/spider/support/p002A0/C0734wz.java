package com.github.catvod.spider.support.p002A0;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.wz */
/* JADX INFO: loaded from: classes.dex */
public final class C0734wz {

    /* JADX INFO: renamed from: a */
    public static final int[] f1773a = new int[0];

    /* JADX INFO: renamed from: b */
    public int[] f1774b = f1773a;

    /* JADX INFO: renamed from: c */
    public int f1775c;

    /* JADX INFO: renamed from: d */
    public final void m1855d(int i) {
        int[] iArr = this.f1774b;
        int length = iArr.length;
        int i2 = this.f1775c;
        if (length == i2) {
            int i3 = i2 + 1;
            if (i3 < 0 || i3 > 2147483639) {
                throw new OutOfMemoryError();
            }
            int length2 = iArr.length == 0 ? 4 : iArr.length;
            while (length2 < i3) {
                length2 *= 2;
                if (length2 < 0 || length2 > 2147483639) {
                    length2 = 2147483639;
                }
            }
            this.f1774b = Arrays.copyOf(this.f1774b, length2);
        }
        int[] iArr2 = this.f1774b;
        int i4 = this.f1775c;
        iArr2[i4] = i;
        this.f1775c = i4 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0734wz)) {
            return false;
        }
        C0734wz c0734wz = (C0734wz) obj;
        if (this.f1775c != c0734wz.f1775c) {
            return false;
        }
        for (int i = 0; i < this.f1775c; i++) {
            if (this.f1774b[i] != c0734wz.f1774b[i]) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f1775c; i2++) {
            i = (i * 31) + this.f1774b[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.f1775c;
        return Arrays.toString(i == 0 ? f1773a : Arrays.copyOf(this.f1774b, i));
    }
}
