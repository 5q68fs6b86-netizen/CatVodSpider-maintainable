package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.b */
/* JADX INFO: loaded from: classes.dex */
public class C1979b {

    /* JADX INFO: renamed from: a */
    public final AbstractC2001m f4522a;

    /* JADX INFO: renamed from: b */
    public final int f4523b;

    /* JADX INFO: renamed from: c */
    public AbstractC1974X f4524c;

    /* JADX INFO: renamed from: d */
    public int f4525d;

    /* JADX INFO: renamed from: e */
    public final AbstractC2000l0 f4526e;

    public C1979b(C1979b c1979b, AbstractC2001m abstractC2001m, AbstractC1974X abstractC1974X, AbstractC2000l0 abstractC2000l0) {
        this.f4522a = abstractC2001m;
        this.f4523b = c1979b.f4523b;
        this.f4524c = abstractC1974X;
        this.f4526e = abstractC2000l0;
        this.f4525d = c1979b.f4525d;
    }

    public C1979b(AbstractC2001m abstractC2001m, int i, AbstractC1974X abstractC1974X, AbstractC2000l0 abstractC2000l0) {
        this.f4522a = abstractC2001m;
        this.f4523b = i;
        this.f4524c = abstractC1974X;
        this.f4526e = abstractC2000l0;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo4765a(C1979b c1979b) {
        AbstractC1974X abstractC1974X;
        AbstractC1974X abstractC1974X2;
        if (this == c1979b) {
            return true;
        }
        return c1979b != null && this.f4522a.f4561b == c1979b.f4522a.f4561b && this.f4523b == c1979b.f4523b && ((abstractC1974X = this.f4524c) == (abstractC1974X2 = c1979b.f4524c) || (abstractC1974X != null && abstractC1974X.equals(abstractC1974X2))) && this.f4526e.equals(c1979b.f4526e) && m4767c() == c1979b.m4767c();
    }

    /* JADX INFO: renamed from: b */
    public final int m4766b() {
        return this.f4525d & (-1073741825);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m4767c() {
        return (this.f4525d & 1073741824) != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1979b) {
            return mo4765a((C1979b) obj);
        }
        return false;
    }

    public int hashCode() {
        return C1286l.m3218c(C1286l.m3225j(C1286l.m3225j(C1286l.m3224i(C1286l.m3224i(7, this.f4522a.f4561b), this.f4523b), this.f4524c), this.f4526e), 4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.f4522a);
        sb.append(",");
        sb.append(this.f4523b);
        if (this.f4524c != null) {
            sb.append(",[");
            sb.append(this.f4524c.toString());
            sb.append("]");
        }
        AbstractC2000l0 abstractC2000l0 = this.f4526e;
        if (abstractC2000l0 != null && abstractC2000l0 != AbstractC2000l0.f4559a) {
            sb.append(",");
            sb.append(this.f4526e);
        }
        if (m4766b() > 0) {
            sb.append(",up=");
            sb.append(m4766b());
        }
        sb.append(')');
        return sb.toString();
    }
}
