package com.github.catvod.spider.support.p002A0;

/* JADX INFO: loaded from: classes.dex */
public final class abi implements InterfaceC0573r {

    /* JADX INFO: renamed from: c */
    public final int f521c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0573r f522d;

    public abi(int i, InterfaceC0573r interfaceC0573r) {
        this.f521c = i;
        this.f522d = interfaceC0573r;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0573r
    /* JADX INFO: renamed from: a */
    public final boolean mo905a() {
        return true;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0573r
    /* JADX INFO: renamed from: b */
    public final void mo906b(C0792zc c0792zc) {
        this.f522d.mo906b(c0792zc);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof abi)) {
            return false;
        }
        abi abiVar = (abi) obj;
        return this.f521c == abiVar.f521c && this.f522d.equals(abiVar.f522d);
    }

    public final int hashCode() {
        return AbstractC0534po.m1518e(AbstractC0534po.m1524k(AbstractC0534po.m1523j(0, this.f521c), this.f522d), 2);
    }
}
