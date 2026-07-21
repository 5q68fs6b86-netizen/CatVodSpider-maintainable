package com.github.catvod.spider.support.p012C0.p040x;

import com.github.catvod.spider.support.p012C0.E.f;
import com.github.catvod.spider.support.p012C0.p027d.C1064d;
import java.io.Serializable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p040x.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1265f implements Serializable {

    /* JADX INFO: renamed from: c */
    public final Throwable f2980c;

    public C1265f(Throwable th) {
        this.f2980c = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1265f) && f.a(this.f2980c, ((C1265f) obj).f2980c);
    }

    public final int hashCode() {
        return this.f2980c.hashCode();
    }

    public final String toString() {
        StringBuilder sbM2774b = C1064d.m2774b("Failure(");
        sbM2774b.append(this.f2980c);
        sbM2774b.append(')');
        return sbM2774b.toString();
    }
}
