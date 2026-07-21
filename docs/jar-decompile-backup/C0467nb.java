package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.nb */
/* JADX INFO: loaded from: classes.dex */
public final class C0467nb extends AbstractC0687vf {

    /* JADX INFO: renamed from: a */
    public final int f1264a;

    /* JADX INFO: renamed from: b */
    public final int f1265b;

    /* JADX INFO: renamed from: c */
    public final boolean f1266c;

    public C0467nb() {
        this.f1264a = -1;
        this.f1265b = -1;
        this.f1266c = false;
    }

    public C0467nb(boolean z, int i, int i2) {
        this.f1264a = i;
        this.f1265b = i2;
        this.f1266c = z;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0687vf
    /* JADX INFO: renamed from: d */
    public final boolean mo876d(C0720wl c0720wl, C0579rf c0579rf) {
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0467nb)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C0467nb c0467nb = (C0467nb) obj;
        return this.f1264a == c0467nb.f1264a && this.f1265b == c0467nb.f1265b && this.f1266c == c0467nb.f1266c;
    }

    public final int hashCode() {
        return AbstractC0534po.m1518e(AbstractC0534po.m1523j(AbstractC0534po.m1523j(AbstractC0534po.m1523j(0, this.f1264a), this.f1265b), this.f1266c ? 1 : 0), 3);
    }

    public final String toString() {
        return "{" + this.f1264a + ":" + this.f1265b + "}?";
    }
}
