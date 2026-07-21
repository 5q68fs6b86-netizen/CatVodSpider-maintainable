package com.github.catvod.spider.support.p044FM.p045A;

import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.A.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1288n<A, B> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final A f3014a;

    /* JADX INFO: renamed from: b */
    public final B f3015b;

    public C1288n(A a, B b) {
        this.f3014a = a;
        this.f3015b = b;
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1288n)) {
            return false;
        }
        C1288n c1288n = (C1288n) obj;
        A a = this.f3014a;
        A a2 = c1288n.f3014a;
        if (a == null) {
            zEquals = a2 == null;
        } else {
            zEquals = a.equals(a2);
        }
        if (zEquals) {
            B b = this.f3015b;
            B b2 = c1288n.f3015b;
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
        return C1286l.m3218c(C1286l.m3225j(C1286l.m3225j(0, this.f3014a), this.f3015b), 2);
    }

    public final String toString() {
        return String.format("(%s, %s)", this.f3014a, this.f3015b);
    }
}
