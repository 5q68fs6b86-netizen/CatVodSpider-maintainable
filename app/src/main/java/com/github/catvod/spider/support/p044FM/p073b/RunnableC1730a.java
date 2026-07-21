package com.github.catvod.spider.support.p044FM.p073b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.Market;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p073b.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1730a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3806a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3807b;

    public /* synthetic */ RunnableC1730a(Object obj, int i) {
        this.f3806a = i;
        this.f3807b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3806a) {
            case 0:
                C1750u.m4111b((C1750u) this.f3807b);
                break;
            case 1:
                ((C1715C) this.f3807b).m4005i();
                break;
            case 2:
                ((C1729Q) this.f3807b).m4087K();
                break;
            case 3:
                ((MainActivity) this.f3807b).j();
                break;
            default:
                Market.m595c((Market) this.f3807b);
                break;
        }
    }
}
