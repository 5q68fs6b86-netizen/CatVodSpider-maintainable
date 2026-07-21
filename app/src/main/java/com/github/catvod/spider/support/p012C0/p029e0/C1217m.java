package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1053l;
import com.github.catvod.spider.support.p012C0.p040x.C1263a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.e0.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1217m extends AbstractC1214j {
    public C1217m(String str, String str2) {
        super(str, str2, true);
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        return c1053l2.m2757o(this.f2885a) && C1263a.m3147c(c1053l2.mo2747c(this.f2885a)).contains(this.f2886b);
    }

    public final String toString() {
        return String.format("[%s*=%s]", this.f2885a, this.f2886b);
    }
}
