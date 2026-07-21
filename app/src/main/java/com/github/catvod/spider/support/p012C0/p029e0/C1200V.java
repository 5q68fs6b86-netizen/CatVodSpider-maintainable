package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1053l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p029e0.V */
/* JADX INFO: loaded from: classes.dex */
final class C1200V extends AbstractC1204Z {
    public C1200V(AbstractC1193N abstractC1193N) {
        this.f2874a = abstractC1193N;
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        return !this.f2874a.mo2996a(c1053l, c1053l2);
    }

    public final String toString() {
        return String.format(":not(%s)", this.f2874a);
    }
}
