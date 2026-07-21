package com.github.catvod.spider.support.p044FM.p073b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.Market;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p073b.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1732c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3810a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3811b;

    public /* synthetic */ RunnableC1732c(Object obj, int i) {
        this.f3810a = i;
        this.f3811b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3810a) {
            case 0:
                C1750u.m4120k((C1750u) this.f3811b);
                break;
            case 1:
                ((C1722J) this.f3811b).m4036o();
                break;
            case 2:
                ((MainActivity) this.f3811b).k();
                break;
            default:
                Market market = (Market) this.f3811b;
                market.getClass();
                Init.run(new RunnableC1730a(market, 4));
                break;
        }
    }
}
