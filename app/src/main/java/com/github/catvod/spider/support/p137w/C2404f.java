package com.github.catvod.spider.support.p137w;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p137w.f */
/* JADX INFO: loaded from: classes.dex */
public class C2404f {

    /* JADX INFO: renamed from: c */
    private static int[] f5958c = new int[0];

    /* JADX INFO: renamed from: a */
    private int[] f5959a = f5958c;

    /* JADX INFO: renamed from: b */
    private int f5960b;

    /* JADX INFO: renamed from: a */
    public final void m6405a(int i) {
        int[] iArr = this.f5959a;
        int length = iArr.length;
        int i2 = this.f5960b;
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
            this.f5959a = Arrays.copyOf(this.f5959a, length2);
        }
        int[] iArr2 = this.f5959a;
        int i4 = this.f5960b;
        iArr2[i4] = i;
        this.f5960b = i4 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m6406b() {
        Arrays.fill(this.f5959a, 0, this.f5960b, 0);
        this.f5960b = 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m6407c(int i) {
        if (i < 0 || i >= this.f5960b) {
            throw new IndexOutOfBoundsException();
        }
        return this.f5959a[i];
    }

    /* JADX INFO: renamed from: d */
    public final boolean m6408d() {
        return this.f5960b == 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m6409e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f5960b)) {
            throw new IndexOutOfBoundsException();
        }
        int[] iArr = this.f5959a;
        int i3 = iArr[i];
        System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        int[] iArr2 = this.f5959a;
        int i4 = this.f5960b;
        iArr2[i4 - 1] = 0;
        this.f5960b = i4 - 1;
        return i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2404f)) {
            return false;
        }
        C2404f c2404f = (C2404f) obj;
        if (this.f5960b != c2404f.f5960b) {
            return false;
        }
        for (int i = 0; i < this.f5960b; i++) {
            if (this.f5959a[i] != c2404f.f5959a[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final int m6410f() {
        return this.f5960b;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f5960b; i2++) {
            i = (i * 31) + this.f5959a[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.f5960b;
        return Arrays.toString(i == 0 ? f5958c : Arrays.copyOf(this.f5959a, i));
    }
}
