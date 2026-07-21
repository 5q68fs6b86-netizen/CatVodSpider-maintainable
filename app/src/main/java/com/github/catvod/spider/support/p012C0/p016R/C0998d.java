package com.github.catvod.spider.support.p012C0.p016R;

import com.github.catvod.spider.support.p012C0.p015Q.AbstractC0994l0;
import com.github.catvod.spider.support.p012C0.p027d.C1064d;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p016R.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0998d {

    /* JADX INFO: renamed from: a */
    public AbstractC0994l0 f2453a;

    /* JADX INFO: renamed from: b */
    public int f2454b;

    public C0998d(AbstractC0994l0 abstractC0994l0, int i) {
        this.f2454b = i;
        this.f2453a = abstractC0994l0;
    }

    public final String toString() {
        StringBuilder sbM2774b = C1064d.m2774b("(");
        sbM2774b.append(this.f2453a);
        sbM2774b.append(", ");
        sbM2774b.append(this.f2454b);
        sbM2774b.append(")");
        return sbM2774b.toString();
    }
}
