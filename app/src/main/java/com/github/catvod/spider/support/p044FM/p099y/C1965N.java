package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p098x.AbstractC1945t;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.N */
/* JADX INFO: loaded from: classes.dex */
public final class C1965N implements InterfaceC1954C {

    /* JADX INFO: renamed from: a */
    private final int f4494a;

    public C1965N(int i) {
        this.f4494a = i;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.InterfaceC1954C
    /* JADX INFO: renamed from: a */
    public final boolean mo4723a() {
        return false;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.InterfaceC1954C
    /* JADX INFO: renamed from: b */
    public final void mo4724b(AbstractC1945t abstractC1945t) {
        abstractC1945t.f4445m = this.f4494a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C1965N) && this.f4494a == ((C1965N) obj).f4494a;
    }

    public final int hashCode() {
        return C1286l.m3218c(C1286l.m3224i(C1286l.m3224i(0, 7), this.f4494a), 2);
    }

    public final String toString() {
        return String.format("type(%d)", Integer.valueOf(this.f4494a));
    }
}
