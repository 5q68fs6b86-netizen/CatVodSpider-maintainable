package com.github.catvod.spider.support.p044FM.p100z;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p099y.C1955D;
import com.github.catvod.spider.support.p044FM.p099y.C1987f;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p100z.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2028e {

    /* JADX INFO: renamed from: a */
    public int f4594a;

    /* JADX INFO: renamed from: b */
    public C1987f f4595b;

    /* JADX INFO: renamed from: c */
    public C2028e[] f4596c;

    /* JADX INFO: renamed from: d */
    public boolean f4597d;

    /* JADX INFO: renamed from: e */
    public int f4598e;

    /* JADX INFO: renamed from: f */
    public C1955D f4599f;

    /* JADX INFO: renamed from: g */
    public boolean f4600g;

    /* JADX INFO: renamed from: h */
    public C2027d[] f4601h;

    public C2028e() {
        this.f4594a = -1;
        this.f4595b = new C1987f(true);
        this.f4597d = false;
    }

    public C2028e(C1987f c1987f) {
        this.f4594a = -1;
        new C1987f(true);
        this.f4597d = false;
        this.f4595b = c1987f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2028e) {
            return this.f4595b.equals(((C2028e) obj).f4595b);
        }
        return false;
    }

    public final int hashCode() {
        return C1286l.m3218c(C1286l.m3224i(7, this.f4595b.hashCode()), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4594a);
        sb.append(":");
        sb.append(this.f4595b);
        if (this.f4597d) {
            sb.append("=>");
            C2027d[] c2027dArr = this.f4601h;
            if (c2027dArr != null) {
                sb.append(Arrays.toString(c2027dArr));
            } else {
                sb.append(this.f4598e);
            }
        }
        return sb.toString();
    }
}
