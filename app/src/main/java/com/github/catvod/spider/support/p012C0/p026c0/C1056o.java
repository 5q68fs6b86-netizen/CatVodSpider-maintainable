package com.github.catvod.spider.support.p012C0.p026c0;

import com.github.catvod.spider.support.p012C0.p028d0.C1078F;
import com.github.catvod.spider.support.p012C0.p029e0.C1211g;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p026c0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1056o extends C1053l {

    /* JADX INFO: renamed from: l */
    private final C1211g f2595l;

    public C1056o(C1078F c1078f, C1044c c1044c) {
        super(c1078f, null, c1044c);
        this.f2595l = new C1211g();
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: D */
    protected final void mo2740D(AbstractC1059r abstractC1059r) {
        super.mo2740D(abstractC1059r);
        this.f2595l.remove(abstractC1059r);
    }

    /* JADX INFO: renamed from: r0 */
    public final C1056o m2741r0(C1053l c1053l) {
        this.f2595l.add(c1053l);
        return this;
    }

    @Override // com.github.catvod.spider.support.p012C0.p026c0.C1053l, com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public final C1056o mo2657j() {
        return (C1056o) super.mo2657j();
    }
}
