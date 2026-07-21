package com.github.catvod.spider.support.p044FM.p045A;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.A.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1284j {

    /* JADX INFO: renamed from: c */
    static C1284j[] f3008c = new C1284j[1001];

    /* JADX INFO: renamed from: a */
    public int f3009a;

    /* JADX INFO: renamed from: b */
    public int f3010b;

    public C1284j(int i, int i2) {
        this.f3009a = i;
        this.f3010b = i2;
    }

    /* JADX INFO: renamed from: b */
    public static C1284j m3201b(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new C1284j(i, i2);
        }
        C1284j[] c1284jArr = f3008c;
        if (c1284jArr[i] == null) {
            c1284jArr[i] = new C1284j(i, i);
        }
        return c1284jArr[i];
    }

    /* JADX INFO: renamed from: a */
    public final boolean m3202a(C1284j c1284j) {
        int i = this.f3009a;
        int i2 = c1284j.f3009a;
        if (!(i < i2 && this.f3010b < i2)) {
            if (!(i > c1284j.f3010b)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final C1284j m3203c(C1284j c1284j) {
        return m3201b(Math.min(this.f3009a, c1284j.f3009a), Math.max(this.f3010b, c1284j.f3010b));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1284j)) {
            return false;
        }
        C1284j c1284j = (C1284j) obj;
        return this.f3009a == c1284j.f3009a && this.f3010b == c1284j.f3010b;
    }

    public final int hashCode() {
        return ((713 + this.f3009a) * 31) + this.f3010b;
    }

    public final String toString() {
        return this.f3009a + ".." + this.f3010b;
    }
}
