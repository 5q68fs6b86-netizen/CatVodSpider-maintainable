package com.github.catvod.spider.support.p044FM.p055K;

import com.github.catvod.spider.support.p044FM.p056L.C1416G;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.K.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1396p extends C1393m {

    /* JADX INFO: renamed from: j */
    private final C1551g f3219j;

    public C1396p(C1416G c1416g, C1383c c1383c) {
        super(c1416g, null, c1383c);
        this.f3219j = new C1551g();
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: C */
    protected final void mo3504C(AbstractC1399s abstractC1399s) {
        super.mo3504C(abstractC1399s);
        this.f3219j.remove(abstractC1399s);
    }

    /* JADX INFO: renamed from: y0 */
    public final C1396p m3505y0(C1393m c1393m) {
        this.f3219j.add(c1393m);
        return this;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.C1393m, com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] */
    public final C1396p mo3404i() {
        return (C1396p) super.mo3404i();
    }
}
