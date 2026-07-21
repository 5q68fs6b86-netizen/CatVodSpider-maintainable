package com.github.catvod.spider.support.p012C0.p026c0;

import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p026c0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1046e extends AbstractC1057p {
    public C1046e(String str) {
        this.f2596f = str;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: clone */
    public final Object mo2657j() {
        return (C1046e) super.mo2657j();
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1057p, com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ int mo2661h() {
        return 0;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: j */
    public final AbstractC1059r mo2657j() {
        return (C1046e) super.mo2657j();
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1057p, com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: m */
    public final AbstractC1059r mo2662m() {
        return this;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: t */
    public final String mo2658t() {
        return "#comment";
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    public final String toString() {
        return mo2675u();
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: w */
    final void mo2659w(Appendable appendable, int i, C1048g c1048g) throws IOException {
        if (c1048g.m2668f() && this.f2601d == 0) {
            AbstractC1059r abstractC1059r = this.f2600c;
            if ((abstractC1059r instanceof C1053l) && ((C1053l) abstractC1059r).m2717m0().m2812a()) {
                m2759r(appendable, i, c1048g);
            }
        }
        appendable.append("<!--").append(m2744I()).append("-->");
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: x */
    final void mo2660x(Appendable appendable, int i, C1048g c1048g) {
    }
}
