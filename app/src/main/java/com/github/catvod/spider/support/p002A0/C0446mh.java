package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.mh */
/* JADX INFO: loaded from: classes.dex */
public final class C0446mh implements InterfaceC0573r {

    /* JADX INFO: renamed from: c */
    public final int f1232c;

    /* JADX INFO: renamed from: d */
    public final int f1233d;

    public C0446mh(int i, int i2) {
        this.f1232c = i;
        this.f1233d = i2;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0573r
    /* JADX INFO: renamed from: a */
    public final boolean mo905a() {
        return true;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0573r
    /* JADX INFO: renamed from: b */
    public final void mo906b(C0792zc c0792zc) {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0446mh)) {
            return false;
        }
        C0446mh c0446mh = (C0446mh) obj;
        return this.f1232c == c0446mh.f1232c && this.f1233d == c0446mh.f1233d;
    }

    public final int hashCode() {
        return AbstractC0534po.m1518e(AbstractC0534po.m1523j(AbstractC0534po.m1523j(AbstractC0534po.m1523j(0, 1), this.f1232c), this.f1233d), 3);
    }
}
