package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p134t.AbstractC2324q;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.A */
/* JADX INFO: loaded from: classes.dex */
public final class C2334A implements InterfaceC2392x {

    /* JADX INFO: renamed from: a */
    private final int f5802a;

    public C2334A(int i) {
        this.f5802a = i;
    }

    @Override // com.github.catvod.spider.support.p135u.InterfaceC2392x
    /* JADX INFO: renamed from: a */
    public final void mo6304a(AbstractC2324q abstractC2324q) {
        abstractC2324q.f5773l = this.f5802a;
    }

    @Override // com.github.catvod.spider.support.p135u.InterfaceC2392x
    /* JADX INFO: renamed from: b */
    public final boolean mo6305b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C2334A) && this.f5802a == ((C2334A) obj).f5802a;
    }

    public final int hashCode() {
        return C1273a.m3160b(C1273a.m3168h(C1273a.m3168h(0, 0), this.f5802a), 2);
    }

    public final String toString() {
        return String.format("channel(%d)", Integer.valueOf(this.f5802a));
    }
}
