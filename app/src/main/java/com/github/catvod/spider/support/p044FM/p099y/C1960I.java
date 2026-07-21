package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p098x.AbstractC1945t;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.I */
/* JADX INFO: loaded from: classes.dex */
public final class C1960I implements InterfaceC1954C {

    /* JADX INFO: renamed from: a */
    private final int f4489a;

    public C1960I(int i) {
        this.f4489a = i;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.InterfaceC1954C
    /* JADX INFO: renamed from: a */
    public final boolean mo4723a() {
        return false;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.InterfaceC1954C
    /* JADX INFO: renamed from: b */
    public final void mo4724b(AbstractC1945t abstractC1945t) {
        abstractC1945t.f4447o = this.f4489a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C1960I) && this.f4489a == ((C1960I) obj).f4489a;
    }

    public final int hashCode() {
        return C1286l.m3218c(C1286l.m3224i(C1286l.m3224i(0, 2), this.f4489a), 2);
    }

    public final String toString() {
        return String.format("mode(%d)", Integer.valueOf(this.f4489a));
    }
}
