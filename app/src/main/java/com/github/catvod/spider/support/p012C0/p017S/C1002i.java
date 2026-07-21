package com.github.catvod.spider.support.p012C0.p017S;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p017S.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1002i {

    /* JADX INFO: renamed from: c */
    static C1002i[] f2464c = new C1002i[1001];

    /* JADX INFO: renamed from: a */
    public int f2465a;

    /* JADX INFO: renamed from: b */
    public int f2466b;

    public C1002i(int i, int i2) {
        this.f2465a = i;
        this.f2466b = i2;
    }

    /* JADX INFO: renamed from: b */
    public static C1002i m2518b(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new C1002i(i, i2);
        }
        C1002i[] c1002iArr = f2464c;
        if (c1002iArr[i] == null) {
            c1002iArr[i] = new C1002i(i, i);
        }
        return c1002iArr[i];
    }

    /* JADX INFO: renamed from: a */
    public final boolean m2519a(C1002i c1002i) {
        int i = this.f2465a;
        int i2 = c1002i.f2465a;
        if (!(i < i2 && this.f2466b < i2)) {
            if (!(i > c1002i.f2466b)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final C1002i m2520c(C1002i c1002i) {
        return m2518b(Math.min(this.f2465a, c1002i.f2465a), Math.max(this.f2466b, c1002i.f2466b));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1002i)) {
            return false;
        }
        C1002i c1002i = (C1002i) obj;
        return this.f2465a == c1002i.f2465a && this.f2466b == c1002i.f2466b;
    }

    public final int hashCode() {
        return ((this.f2465a + 713) * 31) + this.f2466b;
    }

    public final String toString() {
        return this.f2465a + ".." + this.f2466b;
    }
}
