package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p098x.AbstractC1917C;
import com.github.catvod.spider.support.p044FM.p098x.C1918D;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1996j0 extends AbstractC2000l0 implements Comparable<C1996j0> {

    /* JADX INFO: renamed from: b */
    public final int f4546b;

    protected C1996j0() {
        this.f4546b = 0;
    }

    public C1996j0(int i) {
        this.f4546b = i;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC2000l0
    /* JADX INFO: renamed from: c */
    public final boolean mo4775c(AbstractC1917C<?, ?> abstractC1917C, C1918D c1918d) {
        return abstractC1917C.mo4635h(this.f4546b);
    }

    @Override // java.lang.Comparable
    public final int compareTo(C1996j0 c1996j0) {
        return this.f4546b - c1996j0.f4546b;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC2000l0
    /* JADX INFO: renamed from: d */
    public final AbstractC2000l0 mo4776d(AbstractC1917C<?, ?> abstractC1917C, C1918D c1918d) {
        if (abstractC1917C.mo4635h(this.f4546b)) {
            return AbstractC2000l0.f4559a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1996j0) {
            return this == obj || this.f4546b == ((C1996j0) obj).f4546b;
        }
        return false;
    }

    public final int hashCode() {
        return 31 + this.f4546b;
    }

    public final String toString() {
        StringBuilder sbM3589b = C1434P.m3589b("{");
        sbM3589b.append(this.f4546b);
        sbM3589b.append(">=prec}?");
        return sbM3589b.toString();
    }
}
