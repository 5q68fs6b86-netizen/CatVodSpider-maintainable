package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.gn */
/* JADX INFO: loaded from: classes.dex */
public final class C0290gn implements InterfaceC0573r {

    /* JADX INFO: renamed from: c */
    public final int f868c;

    public C0290gn(int i) {
        this.f868c = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0573r
    /* JADX INFO: renamed from: a */
    public final boolean mo905a() {
        return false;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0573r
    /* JADX INFO: renamed from: b */
    public final void mo906b(C0792zc c0792zc) {
        c0792zc.f520u = this.f868c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0290gn) {
            return this.f868c == ((C0290gn) obj).f868c;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0534po.m1518e(AbstractC0534po.m1523j(AbstractC0534po.m1523j(0, 2), this.f868c), 2);
    }

    public final String toString() {
        return String.format("mode(%d)", Integer.valueOf(this.f868c));
    }
}
