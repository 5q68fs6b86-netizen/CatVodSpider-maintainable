package com.github.catvod.spider.support.p101G;

import com.github.catvod.spider.support.p102H.C2052h;
import com.github.catvod.spider.support.p103I.C2060c;

/* JADX INFO: renamed from: com.github.catvod.spider.support.G.k */
/* JADX INFO: loaded from: classes.dex */
public final class C2039k extends C2037i {

    /* JADX INFO: renamed from: j */
    private final C2060c f4645j;

    public C2039k(C2052h c2052h, C2030b c2030b) {
        super(c2052h, null, c2030b);
        this.f4645j = new C2060c();
    }

    @Override // com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: D */
    protected final void mo4922D(AbstractC2041m abstractC2041m) {
        super.mo4922D(abstractC2041m);
        this.f4645j.remove(abstractC2041m);
    }

    /* JADX INFO: renamed from: w0 */
    public final C2039k m4923w0(C2037i c2037i) {
        this.f4645j.add(c2037i);
        return this;
    }

    @Override // com.github.catvod.spider.support.p101G.C2037i, com.github.catvod.spider.support.p101G.AbstractC2041m
    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public final C2039k clone() {
        return (C2039k) super.clone();
    }
}
