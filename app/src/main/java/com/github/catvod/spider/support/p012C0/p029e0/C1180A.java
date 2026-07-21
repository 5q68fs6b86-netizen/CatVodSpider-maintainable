package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1049h;
import com.github.catvod.spider.support.p012C0.p026c0.C1053l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p029e0.A */
/* JADX INFO: loaded from: classes.dex */
public final class C1180A extends AbstractC1193N {

    /* JADX INFO: renamed from: a */
    public final int f2862a;

    public /* synthetic */ C1180A(int i) {
        this.f2862a = i;
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        switch (this.f2862a) {
            case 0:
                C1053l c1053lM2709f0 = c1053l2.m2709f0();
                return (c1053lM2709f0 == null || (c1053lM2709f0 instanceof C1049h) || c1053l2.m2697U() != 0) ? false : true;
            default:
                C1053l c1053lM2709f1 = c1053l2.m2709f0();
                return (c1053lM2709f1 == null || (c1053lM2709f1 instanceof C1049h) || !c1053l2.m2716l0().isEmpty()) ? false : true;
        }
    }

    public final String toString() {
        switch (this.f2862a) {
            case 0:
                return ":first-child";
            default:
                return ":only-child";
        }
    }
}
