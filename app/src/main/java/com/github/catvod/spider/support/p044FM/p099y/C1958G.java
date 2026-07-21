package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p098x.AbstractC1945t;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.G */
/* JADX INFO: loaded from: classes.dex */
public final class C1958G implements InterfaceC1954C {

    /* JADX INFO: renamed from: a */
    private final int f4485a;

    /* JADX INFO: renamed from: b */
    private final int f4486b;

    public C1958G(int i, int i2) {
        this.f4485a = i;
        this.f4486b = i2;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.InterfaceC1954C
    /* JADX INFO: renamed from: a */
    public final boolean mo4723a() {
        return true;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.InterfaceC1954C
    /* JADX INFO: renamed from: b */
    public final void mo4724b(AbstractC1945t abstractC1945t) {
        abstractC1945t.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1958G)) {
            return false;
        }
        C1958G c1958g = (C1958G) obj;
        return this.f4485a == c1958g.f4485a && this.f4486b == c1958g.f4486b;
    }

    public final int hashCode() {
        return C1286l.m3218c(C1286l.m3224i(C1286l.m3224i(C1286l.m3224i(0, 1), this.f4485a), this.f4486b), 3);
    }
}
