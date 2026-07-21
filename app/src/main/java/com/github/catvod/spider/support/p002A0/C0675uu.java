package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.uu */
/* JADX INFO: loaded from: classes.dex */
public final class C0675uu implements InterfaceC0573r {

    /* JADX INFO: renamed from: c */
    public final int f1586c;

    public C0675uu(int i) {
        this.f1586c = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0573r
    /* JADX INFO: renamed from: a */
    public final boolean mo905a() {
        return false;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0573r
    /* JADX INFO: renamed from: b */
    public final void mo906b(C0792zc c0792zc) {
        c0792zc.f518o = this.f1586c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0675uu) {
            return this.f1586c == ((C0675uu) obj).f1586c;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0534po.m1518e(AbstractC0534po.m1523j(AbstractC0534po.m1523j(0, 7), this.f1586c), 2);
    }

    public final String toString() {
        return String.format("type(%d)", Integer.valueOf(this.f1586c));
    }
}
