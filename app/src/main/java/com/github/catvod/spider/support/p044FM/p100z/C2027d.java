package com.github.catvod.spider.support.p044FM.p100z;

import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p099y.AbstractC2000l0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.z.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2027d {

    /* JADX INFO: renamed from: a */
    public AbstractC2000l0 f4592a;

    /* JADX INFO: renamed from: b */
    public int f4593b;

    public C2027d(AbstractC2000l0 abstractC2000l0, int i) {
        this.f4593b = i;
        this.f4592a = abstractC2000l0;
    }

    public final String toString() {
        StringBuilder sbM3589b = C1434P.m3589b("(");
        sbM3589b.append(this.f4592a);
        sbM3589b.append(", ");
        sbM3589b.append(this.f4593b);
        sbM3589b.append(")");
        return sbM3589b.toString();
    }
}
