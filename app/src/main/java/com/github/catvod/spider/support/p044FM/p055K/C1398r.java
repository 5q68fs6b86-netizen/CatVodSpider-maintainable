package com.github.catvod.spider.support.p044FM.p055K;

import com.github.catvod.spider.support.p044FM.p052H.C1373a;
import com.github.catvod.spider.support.p044FM.p057M.InterfaceC1533O;
import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p055K.r */
/* JADX INFO: loaded from: classes.dex */
final class C1398r implements InterfaceC1533O {

    /* JADX INFO: renamed from: a */
    private final Appendable f3221a;

    /* JADX INFO: renamed from: b */
    private final C1387g f3222b;

    C1398r(Appendable appendable, C1387g c1387g) {
        this.f3221a = appendable;
        this.f3222b = c1387g;
        c1387g.m3419g();
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.InterfaceC1533O
    /* JADX INFO: renamed from: a */
    public final void mo3437a(AbstractC1399s abstractC1399s, int i) {
        if (abstractC1399s.mo3405s().equals("#text")) {
            return;
        }
        try {
            abstractC1399s.mo3407w(this.f3221a, i, this.f3222b);
        } catch (IOException e) {
            throw new C1373a(e);
        }
    }

    @Override // com.github.catvod.spider.support.p044FM.p057M.InterfaceC1533O
    /* JADX INFO: renamed from: b */
    public final void mo3438b(AbstractC1399s abstractC1399s, int i) {
        try {
            abstractC1399s.mo3406v(this.f3221a, i, this.f3222b);
        } catch (IOException e) {
            throw new C1373a(e);
        }
    }
}
