package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p098x.AbstractC1917C;
import com.github.catvod.spider.support.p044FM.p098x.C1918D;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p099y.k0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1998k0 extends AbstractC2000l0 {

    /* JADX INFO: renamed from: b */
    public final int f4553b;

    /* JADX INFO: renamed from: c */
    public final int f4554c;

    /* JADX INFO: renamed from: d */
    public final boolean f4555d;

    protected C1998k0() {
        this.f4553b = -1;
        this.f4554c = -1;
        this.f4555d = false;
    }

    public C1998k0(int i, int i2, boolean z) {
        this.f4553b = i;
        this.f4554c = i2;
        this.f4555d = z;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC2000l0
    /* JADX INFO: renamed from: c */
    public final boolean mo4775c(AbstractC1917C<?, ?> abstractC1917C, C1918D c1918d) {
        abstractC1917C.getClass();
        return true;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1998k0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        C1998k0 c1998k0 = (C1998k0) obj;
        return this.f4553b == c1998k0.f4553b && this.f4554c == c1998k0.f4554c && this.f4555d == c1998k0.f4555d;
    }

    public final int hashCode() {
        return C1286l.m3218c(C1286l.m3224i(C1286l.m3224i(C1286l.m3224i(0, this.f4553b), this.f4554c), this.f4555d ? 1 : 0), 3);
    }

    public final String toString() {
        StringBuilder sbM3589b = C1434P.m3589b("{");
        sbM3589b.append(this.f4553b);
        sbM3589b.append(":");
        sbM3589b.append(this.f4554c);
        sbM3589b.append("}?");
        return sbM3589b.toString();
    }
}
