package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p098x.AbstractC1945t;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.L */
/* JADX INFO: loaded from: classes.dex */
public final class C1963L implements InterfaceC1954C {

    /* JADX INFO: renamed from: a */
    private final int f4492a;

    public C1963L(int i) {
        this.f4492a = i;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.InterfaceC1954C
    /* JADX INFO: renamed from: a */
    public final boolean mo4723a() {
        return false;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.InterfaceC1954C
    /* JADX INFO: renamed from: b */
    public final void mo4724b(AbstractC1945t abstractC1945t) {
        int i = this.f4492a;
        abstractC1945t.f4446n.m3195a(abstractC1945t.f4447o);
        abstractC1945t.f4447o = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C1963L) && this.f4492a == ((C1963L) obj).f4492a;
    }

    public final int hashCode() {
        return C1286l.m3218c(C1286l.m3224i(C1286l.m3224i(0, 5), this.f4492a), 2);
    }

    public final String toString() {
        return String.format("pushMode(%d)", Integer.valueOf(this.f4492a));
    }
}
