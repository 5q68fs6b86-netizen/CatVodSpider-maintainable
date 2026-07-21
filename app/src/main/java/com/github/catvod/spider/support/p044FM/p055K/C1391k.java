package com.github.catvod.spider.support.p044FM.p055K;

import com.github.catvod.spider.support.p044FM.p057M.InterfaceC1533O;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.K.k */
/* JADX INFO: loaded from: classes.dex */
final class C1391k implements InterfaceC1533O {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ StringBuilder f3201a;

    C1391k(StringBuilder sb) {
        this.f3201a = sb;
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.InterfaceC1533O
    /* JADX INFO: renamed from: a */
    public final void mo3437a(AbstractC1399s abstractC1399s, int i) {
        if ((abstractC1399s instanceof C1393m) && ((C1393m) abstractC1399s).m3466f0() && (abstractC1399s.m3523r() instanceof C1402v) && !C1402v.m3528N(this.f3201a)) {
            this.f3201a.append(' ');
        }
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.InterfaceC1533O
    /* JADX INFO: renamed from: b */
    public final void mo3438b(AbstractC1399s abstractC1399s, int i) {
        if (abstractC1399s instanceof C1402v) {
            C1393m.m3443O(this.f3201a, (C1402v) abstractC1399s);
        } else if (abstractC1399s instanceof C1393m) {
            C1393m c1393m = (C1393m) abstractC1399s;
            if (this.f3201a.length() > 0) {
                if ((c1393m.m3466f0() || c1393m.f3205d.m3561j().equals("br")) && !C1402v.m3528N(this.f3201a)) {
                    this.f3201a.append(' ');
                }
            }
        }
    }
}
