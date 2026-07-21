package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1053l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p029e0.M */
/* JADX INFO: loaded from: classes.dex */
public final class C1192M extends AbstractC1193N {

    /* JADX INFO: renamed from: a */
    private final String f2866a;

    public C1192M(String str) {
        this.f2866a = str;
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        return c1053l2.m2706d0().equals(this.f2866a);
    }

    public final String toString() {
        return String.format("%s", this.f2866a);
    }
}
