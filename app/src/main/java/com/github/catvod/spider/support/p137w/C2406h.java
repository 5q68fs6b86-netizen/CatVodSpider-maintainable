package com.github.catvod.spider.support.p137w;

/* JADX INFO: renamed from: com.github.catvod.spider.support.w.h */
/* JADX INFO: loaded from: classes.dex */
public final class C2406h {

    /* JADX INFO: renamed from: c */
    static C2406h[] f5961c = new C2406h[1001];

    /* JADX INFO: renamed from: a */
    public int f5962a;

    /* JADX INFO: renamed from: b */
    public int f5963b;

    public C2406h(int i, int i2) {
        this.f5962a = i;
        this.f5963b = i2;
    }

    /* JADX INFO: renamed from: b */
    public static C2406h m6411b(int i, int i2) {
        if (i != i2 || i < 0 || i > 1000) {
            return new C2406h(i, i2);
        }
        C2406h[] c2406hArr = f5961c;
        if (c2406hArr[i] == null) {
            c2406hArr[i] = new C2406h(i, i);
        }
        return c2406hArr[i];
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6412a(C2406h c2406h) {
        int i = this.f5962a;
        int i2 = c2406h.f5962a;
        if (!(i < i2 && this.f5963b < i2)) {
            if (!(i > c2406h.f5963b)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final C2406h m6413c(C2406h c2406h) {
        return m6411b(Math.min(this.f5962a, c2406h.f5962a), Math.max(this.f5963b, c2406h.f5963b));
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2406h)) {
            return false;
        }
        C2406h c2406h = (C2406h) obj;
        return this.f5962a == c2406h.f5962a && this.f5963b == c2406h.f5963b;
    }

    public final int hashCode() {
        return ((713 + this.f5962a) * 31) + this.f5963b;
    }

    public final String toString() {
        return this.f5962a + ".." + this.f5963b;
    }
}
