package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1049h;
import com.github.catvod.spider.support.p012C0.p026c0.C1053l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.e0.C */
/* JADX INFO: loaded from: classes.dex */
public final class C1182C extends AbstractC1193N {

    /* JADX INFO: renamed from: a */
    public final int f2863a;

    public /* synthetic */ C1182C(int i) {
        this.f2863a = i;
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        switch (this.f2863a) {
            case 0:
                C1053l c1053lM2709f0 = c1053l2.m2709f0();
                return (c1053lM2709f0 == null || (c1053lM2709f0 instanceof C1049h) || c1053l2.m2697U() != c1053lM2709f0.m2695R().size() + (-1)) ? false : true;
            default:
                if (c1053l instanceof C1049h) {
                    c1053l = c1053l.m2693P();
                }
                return c1053l2 == c1053l;
        }
    }

    public final String toString() {
        switch (this.f2863a) {
            case 0:
                return ":last-child";
            default:
                return ":root";
        }
    }
}
