package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p057M.a */
/* JADX INFO: loaded from: classes.dex */
final class C1544a implements InterfaceC1533O {

    /* JADX INFO: renamed from: a */
    private final C1393m f3490a;

    /* JADX INFO: renamed from: b */
    private final C1551g f3491b;

    /* JADX INFO: renamed from: c */
    private final AbstractC1532N f3492c;

    C1544a(C1393m c1393m, C1551g c1551g, AbstractC1532N abstractC1532N) {
        this.f3490a = c1393m;
        this.f3491b = c1551g;
        this.f3492c = abstractC1532N;
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.InterfaceC1533O
    /* JADX INFO: renamed from: a */
    public final void mo3437a(AbstractC1399s abstractC1399s, int i) {
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.InterfaceC1533O
    /* JADX INFO: renamed from: b */
    public final void mo3438b(AbstractC1399s abstractC1399s, int i) {
        if (abstractC1399s instanceof C1393m) {
            C1393m c1393m = (C1393m) abstractC1399s;
            if (this.f3492c.mo3766a(this.f3490a, c1393m)) {
                this.f3491b.add(c1393m);
            }
        }
    }
}
