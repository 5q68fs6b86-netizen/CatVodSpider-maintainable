package com.github.catvod.spider.support.p003AB.p008n;

import com.github.catvod.spider.Market;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p008n.q */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0890q implements Runnable {

    /* JADX INFO: renamed from: a */
    public final Market f2093a;

    /* JADX INFO: renamed from: b */
    public final int f2094b;

    public /* synthetic */ RunnableC0890q(Market market, int i) {
        this.f2093a = market;
        this.f2094b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Market.m593a(this.f2093a, this.f2094b);
    }
}
