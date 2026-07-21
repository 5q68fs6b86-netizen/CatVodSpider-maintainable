package com.github.catvod.spider.support.p137w;

import com.github.catvod.spider.support.p043F.C1273a;
import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p137w.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2409k<A, B> implements Serializable {

    /* JADX INFO: renamed from: a */
    public final A f5967a;

    /* JADX INFO: renamed from: b */
    public final B f5968b;

    public C2409k(A a, B b) {
        this.f5967a = a;
        this.f5968b = b;
    }

    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2409k)) {
            return false;
        }
        C2409k c2409k = (C2409k) obj;
        A a = this.f5967a;
        A a2 = c2409k.f5967a;
        if (a == null) {
            zEquals = a2 == null;
        } else {
            zEquals = a.equals(a2);
        }
        if (zEquals) {
            B b = this.f5968b;
            B b2 = c2409k.f5968b;
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
        return C1273a.m3160b(C1273a.m3169i(C1273a.m3169i(0, this.f5967a), this.f5968b), 2);
    }

    public final String toString() {
        return String.format("(%s, %s)", this.f5967a, this.f5968b);
    }
}
