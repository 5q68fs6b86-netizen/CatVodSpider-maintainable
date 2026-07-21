package com.github.catvod.spider.support.p002A0;

/* JADX INFO: loaded from: classes.dex */
public final class aae extends AbstractC0687vf implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f427a;

    public aae(int i) {
        this.f427a = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0687vf
    /* JADX INFO: renamed from: b */
    public final AbstractC0687vf mo875b(C0720wl c0720wl, C0579rf c0579rf) {
        if (c0720wl.m1137p(this.f427a)) {
            return AbstractC0687vf.f1592e;
        }
        return null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f427a - ((aae) obj).f427a;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0687vf
    /* JADX INFO: renamed from: d */
    public final boolean mo876d(C0720wl c0720wl, C0579rf c0579rf) {
        return c0720wl.m1137p(this.f427a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aae) {
            return this == obj || this.f427a == ((aae) obj).f427a;
        }
        return false;
    }

    public final int hashCode() {
        return 31 + this.f427a;
    }

    public final String toString() {
        return "{" + this.f427a + ">=prec}?";
    }
}
