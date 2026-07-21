package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r;
import com.github.catvod.spider.support.p012C0.p026c0.C1053l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p029e0.a */
/* JADX INFO: loaded from: classes.dex */
final class C1205a implements InterfaceC1194O {

    /* JADX INFO: renamed from: a */
    private final C1053l f2875a;

    /* JADX INFO: renamed from: b */
    private final C1211g f2876b;

    /* JADX INFO: renamed from: c */
    private final AbstractC1193N f2877c;

    C1205a(C1053l c1053l, C1211g c1211g, AbstractC1193N abstractC1193N) {
        this.f2875a = c1053l;
        this.f2876b = c1211g;
        this.f2877c = abstractC1193N;
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.InterfaceC1194O
    /* JADX INFO: renamed from: a */
    public final void mo2681a(AbstractC1059r abstractC1059r, int i) {
        if (abstractC1059r instanceof C1053l) {
            C1053l c1053l = (C1053l) abstractC1059r;
            if (this.f2877c.mo2996a(this.f2875a, c1053l)) {
                this.f2876b.add(c1053l);
            }
        }
    }

    @Override // com.github.catvod.spider.support.p012C0.p029e0.InterfaceC1194O
    /* JADX INFO: renamed from: b */
    public final void mo2682b(AbstractC1059r abstractC1059r, int i) {
    }
}
