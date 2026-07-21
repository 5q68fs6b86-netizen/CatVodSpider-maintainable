package com.github.catvod.spider.support.p044FM.p045A;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.A.h */
/* JADX INFO: loaded from: classes.dex */
public class C1282h {

    /* JADX INFO: renamed from: c */
    private static int[] f3005c = new int[0];

    /* JADX INFO: renamed from: a */
    private int[] f3006a = f3005c;

    /* JADX INFO: renamed from: b */
    private int f3007b;

    /* JADX INFO: renamed from: a */
    public final void m3195a(int i) {
        int[] iArr = this.f3006a;
        int length = iArr.length;
        int i2 = this.f3007b;
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
            this.f3006a = Arrays.copyOf(this.f3006a, length2);
        }
        int[] iArr2 = this.f3006a;
        int i4 = this.f3007b;
        iArr2[i4] = i;
        this.f3007b = i4 + 1;
    }

    /* JADX INFO: renamed from: b */
    public final void m3196b() {
        Arrays.fill(this.f3006a, 0, this.f3007b, 0);
        this.f3007b = 0;
    }

    /* JADX INFO: renamed from: c */
    public final int m3197c(int i) {
        if (i < 0 || i >= this.f3007b) {
            throw new IndexOutOfBoundsException();
        }
        return this.f3006a[i];
    }

    /* JADX INFO: renamed from: d */
    public final boolean m3198d() {
        return this.f3007b == 0;
    }

    /* JADX INFO: renamed from: e */
    public final int m3199e(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.f3007b)) {
            throw new IndexOutOfBoundsException();
        }
        int[] iArr = this.f3006a;
        int i3 = iArr[i];
        System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        int[] iArr2 = this.f3006a;
        int i4 = this.f3007b;
        iArr2[i4 - 1] = 0;
        this.f3007b = i4 - 1;
        return i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1282h)) {
            return false;
        }
        C1282h c1282h = (C1282h) obj;
        if (this.f3007b != c1282h.f3007b) {
            return false;
        }
        for (int i = 0; i < this.f3007b; i++) {
            if (this.f3006a[i] != c1282h.f3006a[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final int m3200f() {
        return this.f3007b;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f3007b; i2++) {
            i = (i * 31) + this.f3006a[i2];
        }
        return i;
    }

    public final String toString() {
        int i = this.f3007b;
        return Arrays.toString(i == 0 ? f3005c : Arrays.copyOf(this.f3006a, i));
    }
}
