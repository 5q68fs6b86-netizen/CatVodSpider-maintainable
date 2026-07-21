package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1053l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.e0.u */
/* JADX INFO: loaded from: classes.dex */
public final class C1225u extends AbstractC1193N {

    /* JADX INFO: renamed from: a */
    private final String f2895a;

    public C1225u(String str) {
        this.f2895a = str;
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        return this.f2895a.equals(c1053l2.m2701Y());
    }

    public final String toString() {
        return String.format("#%s", this.f2895a);
    }
}
