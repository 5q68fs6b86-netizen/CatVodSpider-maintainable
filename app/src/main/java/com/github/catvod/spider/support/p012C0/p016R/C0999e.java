package com.github.catvod.spider.support.p012C0.p016R;

import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p015Q.C0987D;
import com.github.catvod.spider.support.p012C0.p015Q.C0991f;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.R.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0999e {

    /* JADX INFO: renamed from: a */
    public int f2455a;

    /* JADX INFO: renamed from: b */
    public C0991f f2456b;

    /* JADX INFO: renamed from: c */
    public C0999e[] f2457c;

    /* JADX INFO: renamed from: d */
    public boolean f2458d;

    /* JADX INFO: renamed from: e */
    public int f2459e;

    /* JADX INFO: renamed from: f */
    public C0987D f2460f;

    /* JADX INFO: renamed from: g */
    public boolean f2461g;

    /* JADX INFO: renamed from: h */
    public C0998d[] f2462h;

    public C0999e() {
        this.f2455a = -1;
        this.f2456b = new C0991f(true);
        this.f2458d = false;
    }

    public C0999e(C0991f c0991f) {
        this.f2455a = -1;
        new C0991f(true);
        this.f2458d = false;
        this.f2456b = c0991f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0999e) {
            return this.f2456b.equals(((C0999e) obj).f2456b);
        }
        return false;
    }

    public final int hashCode() {
        return C0966a.m2368b(C0966a.m2379o(7, this.f2456b.hashCode()), 1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f2455a);
        sb.append(":");
        sb.append(this.f2456b);
        if (this.f2458d) {
            sb.append("=>");
            C0998d[] c0998dArr = this.f2462h;
            if (c0998dArr != null) {
                sb.append(Arrays.toString(c0998dArr));
            } else {
                sb.append(this.f2459e);
            }
        }
        return sb.toString();
    }
}
