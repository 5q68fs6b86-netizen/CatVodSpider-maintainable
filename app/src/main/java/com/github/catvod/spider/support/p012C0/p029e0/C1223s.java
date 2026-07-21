package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1053l;
import com.github.catvod.spider.support.p012C0.p040x.C1263a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.e0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C1223s extends AbstractC1193N {

    /* JADX INFO: renamed from: a */
    private final String f2892a;

    public C1223s(String str) {
        this.f2892a = C1263a.m3147c(str);
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        return C1263a.m3147c(c1053l2.m2721p0()).contains(this.f2892a);
    }

    public final String toString() {
        return String.format(":contains(%s)", this.f2892a);
    }
}
