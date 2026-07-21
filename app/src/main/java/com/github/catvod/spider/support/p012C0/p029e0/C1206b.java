package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r;
import com.github.catvod.spider.support.p012C0.p026c0.C1053l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p029e0.b */
/* JADX INFO: loaded from: classes.dex */
final class C1206b {

    /* JADX INFO: renamed from: a */
    private final C1053l f2878a;

    /* JADX INFO: renamed from: b */
    private C1053l f2879b = null;

    /* JADX INFO: renamed from: c */
    private final AbstractC1193N f2880c;

    C1206b(C1053l c1053l, AbstractC1193N abstractC1193N) {
        this.f2878a = c1053l;
        this.f2880c = abstractC1193N;
    }

    /* JADX INFO: renamed from: b */
    public final int m3008b(AbstractC1059r abstractC1059r) {
        if (abstractC1059r instanceof C1053l) {
            C1053l c1053l = (C1053l) abstractC1059r;
            if (this.f2880c.mo2996a(this.f2878a, c1053l)) {
                this.f2879b = c1053l;
                return 5;
            }
        }
        return 1;
    }
}
