package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p134t.AbstractC2324q;

/* JADX INFO: renamed from: com.github.catvod.spider.support.u.G */
/* JADX INFO: loaded from: classes.dex */
public final class C2340G implements InterfaceC2392x {

    /* JADX INFO: renamed from: a */
    private final int f5810a;

    public C2340G(int i) {
        this.f5810a = i;
    }

    @Override // com.github.catvod.spider.support.p135u.InterfaceC2392x
    /* JADX INFO: renamed from: a */
    public final void mo6304a(AbstractC2324q abstractC2324q) {
        int i = this.f5810a;
        abstractC2324q.f5775n.m6405a(abstractC2324q.f5776o);
        abstractC2324q.f5776o = i;
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
        return (obj instanceof C2340G) && this.f5810a == ((C2340G) obj).f5810a;
    }

    public final int hashCode() {
        return C1273a.m3160b(C1273a.m3168h(C1273a.m3168h(0, 5), this.f5810a), 2);
    }

    public final String toString() {
        return String.format("pushMode(%d)", Integer.valueOf(this.f5810a));
    }
}
