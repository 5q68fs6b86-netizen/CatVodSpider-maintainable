package com.github.catvod.spider.support.p117b;

import com.github.catvod.debug.MainActivity;
import com.github.catvod.spider.support.p128m.C2253G;
import com.github.catvod.spider.support.p128m.C2263f;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2170d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5196a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5197b;

    public /* synthetic */ RunnableC2170d(Object obj, int i) {
        this.f5196a = i;
        this.f5197b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5196a) {
            case 0:
                C2175i.m5659a((C2175i) this.f5197b);
                break;
            case 1:
                ((MainActivity) this.f5197b).p();
                break;
            case 2:
                C2263f.m6150a((C2263f) this.f5197b);
                break;
            default:
                C2253G.m6091i((C2253G) this.f5197b);
                break;
        }
    }
}
