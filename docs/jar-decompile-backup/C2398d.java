package com.github.catvod.spider.support.p136v;

import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p135u.AbstractC2362b0;
import com.github.catvod.spider.support.p135u.C2363c;
import com.github.catvod.spider.support.p135u.C2393y;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p136v.d */
/* JADX INFO: loaded from: classes.dex */
public final class C2398d {

    /* JADX INFO: renamed from: a */
    public int f5932a;

    /* JADX INFO: renamed from: b */
    public C2363c f5933b;

    /* JADX INFO: renamed from: c */
    public C2398d[] f5934c;

    /* JADX INFO: renamed from: d */
    public boolean f5935d;

    /* JADX INFO: renamed from: e */
    public int f5936e;

    /* JADX INFO: renamed from: f */
    public C2393y f5937f;

    /* JADX INFO: renamed from: g */
    public boolean f5938g;

    /* JADX INFO: renamed from: h */
    public a[] f5939h;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p136v.d$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public AbstractC2362b0 f5940a;

        /* JADX INFO: renamed from: b */
        public int f5941b;

        public a(AbstractC2362b0 abstractC2362b0, int i) {
            this.f5941b = i;
            this.f5940a = abstractC2362b0;
        }

        public final String toString() {
            StringBuilder sbM5396a = C2137a.m5396a("(");
            sbM5396a.append(this.f5940a);
            sbM5396a.append(", ");
            sbM5396a.append(this.f5941b);
            sbM5396a.append(")");
            return sbM5396a.toString();
        }
    }

    public C2398d() {
        this.f5932a = -1;
        this.f5933b = new C2363c(true);
        this.f5935d = false;
    }

    public C2398d(C2363c c2363c) {
        this.f5932a = -1;
        new C2363c(true);
        this.f5935d = false;
        this.f5933b = c2363c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2398d) {
            return this.f5933b.equals(((C2398d) obj).f5933b);
        }
        return false;
    }

    public final int hashCode() {
        return C1273a.m3160b(C1273a.m3168h(7, this.f5933b.hashCode()), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5932a);
        sb.append(":");
        sb.append(this.f5933b);
        if (this.f5935d) {
            sb.append("=>");
            a[] aVarArr = this.f5939h;
            if (aVarArr != null) {
                sb.append(Arrays.toString(aVarArr));
            } else {
                sb.append(this.f5936e);
            }
        }
        return sb.toString();
    }
}
