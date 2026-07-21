package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p134t.AbstractC2324q;

/* JADX INFO: renamed from: com.github.catvod.spider.support.u.C */
/* JADX INFO: loaded from: classes.dex */
public final class C2336C implements InterfaceC2392x {

    /* JADX INFO: renamed from: a */
    private final int f5805a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC2392x f5806b;

    public C2336C(int i, InterfaceC2392x interfaceC2392x) {
        this.f5805a = i;
        this.f5806b = interfaceC2392x;
    }

    @Override // com.github.catvod.spider.support.p135u.InterfaceC2392x
    /* JADX INFO: renamed from: a */
    public final void mo6304a(AbstractC2324q abstractC2324q) {
        this.f5806b.mo6304a(abstractC2324q);
    }

    @Override // com.github.catvod.spider.support.p135u.InterfaceC2392x
    /* JADX INFO: renamed from: b */
    public final boolean mo6305b() {
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC2392x m6306c() {
        return this.f5806b;
    }

    /* JADX INFO: renamed from: d */
    public final int m6307d() {
        return this.f5805a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2336C)) {
            return false;
        }
        C2336C c2336c = (C2336C) obj;
        return this.f5805a == c2336c.f5805a && this.f5806b.equals(c2336c.f5806b);
    }

    public final int hashCode() {
        return C1273a.m3160b(C1273a.m3169i(C1273a.m3168h(0, this.f5805a), this.f5806b), 2);
    }
}
