package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.C1053l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.e0.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1228x extends AbstractC1227w {
    public C1228x(int i) {
        super(i);
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.AbstractC1193N
    /* JADX INFO: renamed from: a */
    public final boolean mo2996a(C1053l c1053l, C1053l c1053l2) {
        return c1053l2.m2697U() > this.f2896a;
    }

    public final String toString() {
        return String.format(":gt(%d)", Integer.valueOf(this.f2896a));
    }
}
