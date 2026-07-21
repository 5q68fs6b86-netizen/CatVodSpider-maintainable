package com.github.catvod.spider.support.p012C0.p028d0;

import com.github.catvod.spider.support.p012C0.p021Z.a;
import com.github.catvod.spider.support.p012C0.p023b.C1030n;
import com.github.catvod.spider.support.p012C0.p027d.C1064d;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p028d0.M */
/* JADX INFO: loaded from: classes.dex */
final class C1092M extends AbstractC1094N {
    C1092M() {
        this.f2694a = 2;
    }

    @Override // com.github.catvod.spider.support.p012C0.p028d0.AbstractC1094N, com.github.catvod.spider.support.p012C0.p028d0.AbstractC1096O
    /* JADX INFO: renamed from: g */
    final /* bridge */ /* synthetic */ AbstractC1096O mo2823g() {
        mo2823g();
        return this;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.github.catvod.spider.support.p012C0.p021Z.a */
    public final String toString() throws a {
        StringBuilder sbM2774b;
        String strM2844x;
        if (!m2839r() || this.f2693j.size() <= 0) {
            sbM2774b = C1064d.m2774b("<");
            strM2844x = m2844x();
        } else {
            sbM2774b = C1064d.m2774b("<");
            sbM2774b.append(m2844x());
            sbM2774b.append(" ");
            strM2844x = this.f2693j.toString();
        }
        return C1030n.m2554b(sbM2774b, strM2844x, ">");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.github.catvod.spider.support.p012C0.p028d0.AbstractC1094N
    /* JADX INFO: renamed from: v */
    public final AbstractC1094N mo2823g() {
        super.mo2823g();
        this.f2693j = null;
        return this;
    }
}
