package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p134t.AbstractC2324q;

/* JADX INFO: renamed from: com.github.catvod.spider.support.u.B */
/* JADX INFO: loaded from: classes.dex */
public final class C2335B implements InterfaceC2392x {

    /* JADX INFO: renamed from: a */
    private final int f5803a;

    /* JADX INFO: renamed from: b */
    private final int f5804b;

    public C2335B(int i, int i2) {
        this.f5803a = i;
        this.f5804b = i2;
    }

    @Override // com.github.catvod.spider.support.p135u.InterfaceC2392x
    /* JADX INFO: renamed from: a */
    public final void mo6304a(AbstractC2324q abstractC2324q) {
        abstractC2324q.getClass();
    }

    @Override // com.github.catvod.spider.support.p135u.InterfaceC2392x
    /* JADX INFO: renamed from: b */
    public final boolean mo6305b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2335B)) {
            return false;
        }
        C2335B c2335b = (C2335B) obj;
        return this.f5803a == c2335b.f5803a && this.f5804b == c2335b.f5804b;
    }

    public final int hashCode() {
        return C1273a.m3160b(C1273a.m3168h(C1273a.m3168h(C1273a.m3168h(0, 1), this.f5803a), this.f5804b), 3);
    }
}
