package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.bd */
/* JADX INFO: loaded from: classes.dex */
public final class C0145bd {

    /* JADX INFO: renamed from: a */
    public static final C0145bd[] f683a = new C0145bd[1001];

    /* JADX INFO: renamed from: b */
    public int f684b;

    /* JADX INFO: renamed from: c */
    public int f685c;

    public C0145bd(int i, int i2) {
        this.f684b = i;
        this.f685c = i2;
    }

    /* JADX INFO: renamed from: d */
    public static C0145bd m1022d(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new C0145bd(i, i2);
        }
        C0145bd[] c0145bdArr = f683a;
        if (c0145bdArr[i] == null) {
            c0145bdArr[i] = new C0145bd(i, i);
        }
        return c0145bdArr[i];
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0145bd)) {
            return false;
        }
        C0145bd c0145bd = (C0145bd) obj;
        return this.f684b == c0145bd.f684b && this.f685c == c0145bd.f685c;
    }

    public final int hashCode() {
        return ((713 + this.f684b) * 31) + this.f685c;
    }

    public final String toString() {
        return this.f684b + ".." + this.f685c;
    }
}
