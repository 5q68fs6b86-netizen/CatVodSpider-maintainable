package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1053l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.e0.T */
/* JADX INFO: loaded from: classes.dex */
final class C1198T extends AbstractC1204Z {
    public C1198T(AbstractC1193N abstractC1193N) {
        this.f2874a = abstractC1193N;
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        C1053l c1053lM2709f0;
        return (c1053l == c1053l2 || (c1053lM2709f0 = c1053l2.m2709f0()) == null || !this.f2874a.mo2996a(c1053l, c1053lM2709f0)) ? false : true;
    }

    public final String toString() {
        return String.format("%s > ", this.f2874a);
    }
}
