package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.aq */
/* JADX INFO: loaded from: classes.dex */
public final class C0131aq implements InterfaceC0573r {

    /* JADX INFO: renamed from: c */
    public final int f670c;

    public C0131aq(int i) {
        this.f670c = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0573r
    /* JADX INFO: renamed from: a */
    public final boolean mo905a() {
        return false;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0573r
    /* JADX INFO: renamed from: b */
    public final void mo906b(C0792zc c0792zc) {
        c0792zc.f519p.m1855d(c0792zc.f520u);
        c0792zc.f520u = this.f670c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0131aq) {
            return this.f670c == ((C0131aq) obj).f670c;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0534po.m1518e(AbstractC0534po.m1523j(AbstractC0534po.m1523j(0, 5), this.f670c), 2);
    }

    public final String toString() {
        return String.format("pushMode(%d)", Integer.valueOf(this.f670c));
    }
}
