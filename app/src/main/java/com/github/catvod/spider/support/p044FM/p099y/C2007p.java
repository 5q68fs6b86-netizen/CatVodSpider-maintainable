package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.p */
/* JADX INFO: loaded from: classes.dex */
public final class C2007p extends AbstractC1974X {

    /* JADX INFO: renamed from: c */
    public final AbstractC1974X[] f4571c;

    /* JADX INFO: renamed from: d */
    public final int[] f4572d;

    /* JADX WARN: Illegal instructions before constructor call */
    public C2007p(AbstractC1974X[] abstractC1974XArr, int[] iArr) {
        int iM3224i = 1;
        for (AbstractC1974X abstractC1974X : abstractC1974XArr) {
            iM3224i = C1286l.m3225j(iM3224i, abstractC1974X);
        }
        for (int i : iArr) {
            iM3224i = C1286l.m3224i(iM3224i, i);
        }
        super(C1286l.m3218c(iM3224i, abstractC1974XArr.length * 2));
        this.f4571c = abstractC1974XArr;
        this.f4572d = iArr;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC1974X
    /* JADX INFO: renamed from: c */
    public final AbstractC1974X mo4753c(int i) {
        return this.f4571c[i];
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC1974X
    /* JADX INFO: renamed from: d */
    public final int mo4754d(int i) {
        return this.f4572d[i];
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC1974X
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2007p) || this.f4510a != obj.hashCode()) {
            return false;
        }
        C2007p c2007p = (C2007p) obj;
        return Arrays.equals(this.f4572d, c2007p.f4572d) && Arrays.equals(this.f4571c, c2007p.f4571c);
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC1974X
    /* JADX INFO: renamed from: f */
    public final boolean mo4756f() {
        return this.f4572d[0] == Integer.MAX_VALUE;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC1974X
    /* JADX INFO: renamed from: h */
    public final int mo4757h() {
        return this.f4572d.length;
    }

    public final String toString() {
        String string;
        if (mo4756f()) {
            return "[]";
        }
        StringBuilder sbM3589b = C1434P.m3589b("[");
        for (int i = 0; i < this.f4572d.length; i++) {
            if (i > 0) {
                sbM3589b.append(", ");
            }
            int[] iArr = this.f4572d;
            if (iArr[i] == Integer.MAX_VALUE) {
                string = "$";
            } else {
                sbM3589b.append(iArr[i]);
                if (this.f4571c[i] != null) {
                    sbM3589b.append(' ');
                    string = this.f4571c[i].toString();
                } else {
                    string = "null";
                }
            }
            sbM3589b.append(string);
        }
        sbM3589b.append("]");
        return sbM3589b.toString();
    }
}
