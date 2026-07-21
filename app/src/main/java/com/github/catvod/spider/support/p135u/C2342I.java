package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p134t.AbstractC2324q;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p135u.I */
/* JADX INFO: loaded from: classes.dex */
public final class C2342I implements InterfaceC2392x {

    /* JADX INFO: renamed from: a */
    private final int f5812a;

    public C2342I(int i) {
        this.f5812a = i;
    }

    @Override // com.github.catvod.spider.support.p135u.InterfaceC2392x
    /* JADX INFO: renamed from: a */
    public final void mo6304a(AbstractC2324q abstractC2324q) {
        abstractC2324q.f5774m = this.f5812a;
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
        return (obj instanceof C2342I) && this.f5812a == ((C2342I) obj).f5812a;
    }

    public final int hashCode() {
        return C1273a.m3160b(C1273a.m3168h(C1273a.m3168h(0, 7), this.f5812a), 2);
    }

    public final String toString() {
        return String.format("type(%d)", Integer.valueOf(this.f5812a));
    }
}
