package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p099y.n0 */
/* JADX INFO: loaded from: classes.dex */
public class C2004n0 extends AbstractC1974X {

    /* JADX INFO: renamed from: c */
    public final AbstractC1974X f4567c;

    /* JADX INFO: renamed from: d */
    public final int f4568d;

    C2004n0(AbstractC1974X abstractC1974X, int i) {
        super(abstractC1974X != null ? C1286l.m3218c(C1286l.m3224i(C1286l.m3225j(1, abstractC1974X), i), 2) : C1286l.m3218c(1, 0));
        this.f4567c = abstractC1974X;
        this.f4568d = i;
    }

    /* JADX INFO: renamed from: i */
    public static C2004n0 m4790i(AbstractC1974X abstractC1974X, int i) {
        return (i == Integer.MAX_VALUE && abstractC1974X == null) ? AbstractC1974X.f4509b : new C2004n0(abstractC1974X, i);
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC1974X
    /* JADX INFO: renamed from: c */
    public AbstractC1974X mo4753c(int i) {
        return this.f4567c;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC1974X
    /* JADX INFO: renamed from: d */
    public int mo4754d(int i) {
        return this.f4568d;
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC1974X
    public boolean equals(Object obj) {
        AbstractC1974X abstractC1974X;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2004n0) || this.f4510a != obj.hashCode()) {
            return false;
        }
        C2004n0 c2004n0 = (C2004n0) obj;
        return this.f4568d == c2004n0.f4568d && (abstractC1974X = this.f4567c) != null && abstractC1974X.equals(c2004n0.f4567c);
    }

    @Override // com.github.catvod.spider.support.p044FM.p099y.AbstractC1974X
    /* JADX INFO: renamed from: h */
    public int mo4757h() {
        return 1;
    }

    public String toString() {
        AbstractC1974X abstractC1974X = this.f4567c;
        String string = abstractC1974X != null ? abstractC1974X.toString() : "";
        if (string.length() == 0) {
            int i = this.f4568d;
            return i == Integer.MAX_VALUE ? "$" : String.valueOf(i);
        }
        return String.valueOf(this.f4568d) + " " + string;
    }
}
