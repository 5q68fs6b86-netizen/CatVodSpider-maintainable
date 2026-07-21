package com.github.catvod.spider.support.p012C0.p017S;

import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.S.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1004l<A, B> implements Serializable {

    /* JADX INFO: renamed from: c */
    public final A f2469c;

    /* JADX INFO: renamed from: d */
    public final B f2470d;

    public C1004l(A a, B b) {
        this.f2469c = a;
        this.f2470d = b;
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1004l)) {
            return false;
        }
        C1004l c1004l = (C1004l) obj;
        A a = this.f2469c;
        A a2 = c1004l.f2469c;
        if (a == null) {
            zEquals = a2 == null;
        } else {
            zEquals = a.equals(a2);
        }
        if (zEquals) {
            B b = this.f2470d;
            B b2 = c1004l.f2470d;
            if (b == null) {
                zEquals2 = b2 == null;
            } else {
                zEquals2 = b.equals(b2);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return C0966a.m2368b(C0966a.m2380p(C0966a.m2380p(0, this.f2469c), this.f2470d), 2);
    }

    public final String toString() {
        return String.format("(%s, %s)", this.f2469c, this.f2470d);
    }
}
