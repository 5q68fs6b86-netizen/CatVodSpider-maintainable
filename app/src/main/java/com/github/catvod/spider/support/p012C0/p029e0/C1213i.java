package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1053l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p029e0.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1213i extends AbstractC1193N {

    /* JADX INFO: renamed from: a */
    public final int f2883a;

    /* JADX INFO: renamed from: b */
    private final String f2884b;

    public /* synthetic */ C1213i(String str, int i) {
        this.f2883a = i;
        this.f2884b = str;
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        switch (this.f2883a) {
            case 0:
                return c1053l2.m2757o(this.f2884b);
            case 1:
                return c1053l2.m2699W(this.f2884b);
            default:
                return c1053l2.m2706d0().endsWith(this.f2884b);
        }
    }

    public final String toString() {
        switch (this.f2883a) {
            case 0:
                return String.format("[%s]", this.f2884b);
            case 1:
                return String.format(".%s", this.f2884b);
            default:
                return String.format("%s", this.f2884b);
        }
    }
}
