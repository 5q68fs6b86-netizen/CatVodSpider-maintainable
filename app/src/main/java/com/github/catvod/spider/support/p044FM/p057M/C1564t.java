package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.M.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1564t extends AbstractC1532N {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3511a;

    /* JADX INFO: renamed from: b */
    private final String f3512b;

    public /* synthetic */ C1564t(String str, int i) {
        this.f3511a = i;
        this.f3512b = str;
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.AbstractC1532N
    /* JADX INFO: renamed from: a */
    public final boolean mo3766a(C1393m c1393m, C1393m c1393m2) {
        switch (this.f3511a) {
            case 0:
                return c1393m2.m3486x0().contains(this.f3512b);
            default:
                return c1393m2.m3469i0().endsWith(this.f3512b);
        }
    }

    public final String toString() {
        switch (this.f3511a) {
            case 0:
                return String.format(":containsWholeOwnText(%s)", this.f3512b);
            default:
                return String.format("%s", this.f3512b);
        }
    }
}
