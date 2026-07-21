package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p098x.AbstractC1945t;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.H */
/* JADX INFO: loaded from: classes.dex */
public final class C1959H implements InterfaceC1954C {

    /* JADX INFO: renamed from: a */
    private final int f4487a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC1954C f4488b;

    public C1959H(int i, InterfaceC1954C interfaceC1954C) {
        this.f4487a = i;
        this.f4488b = interfaceC1954C;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.InterfaceC1954C
    /* JADX INFO: renamed from: a */
    public final boolean mo4723a() {
        return true;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.InterfaceC1954C
    /* JADX INFO: renamed from: b */
    public final void mo4724b(AbstractC1945t abstractC1945t) {
        this.f4488b.mo4724b(abstractC1945t);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC1954C m4728c() {
        return this.f4488b;
    }

    /* JADX INFO: renamed from: d */
    public final int m4729d() {
        return this.f4487a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1959H)) {
            return false;
        }
        C1959H c1959h = (C1959H) obj;
        return this.f4487a == c1959h.f4487a && this.f4488b.equals(c1959h.f4488b);
    }

    public final int hashCode() {
        return C1286l.m3218c(C1286l.m3225j(C1286l.m3224i(0, this.f4487a), this.f4488b), 2);
    }
}
