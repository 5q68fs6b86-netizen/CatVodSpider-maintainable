package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1283i;
import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p098x.AbstractC1945t;
import java.util.EmptyStackException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.K */
/* JADX INFO: loaded from: classes.dex */
public final class C1962K implements InterfaceC1954C {

    /* JADX INFO: renamed from: a */
    public static final C1962K f4491a = new C1962K();

    private C1962K() {
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.InterfaceC1954C
    /* JADX INFO: renamed from: a */
    public final boolean mo4723a() {
        return false;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.InterfaceC1954C
    /* JADX INFO: renamed from: b */
    public final void mo4724b(AbstractC1945t abstractC1945t) {
        if (abstractC1945t.f4446n.m3198d()) {
            throw new EmptyStackException();
        }
        C1283i c1283i = abstractC1945t.f4446n;
        abstractC1945t.f4447o = c1283i.m3199e(c1283i.m3200f() - 1);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return C1286l.m3218c(C1286l.m3224i(0, 4), 1);
    }

    public final String toString() {
        return "popMode";
    }
}
