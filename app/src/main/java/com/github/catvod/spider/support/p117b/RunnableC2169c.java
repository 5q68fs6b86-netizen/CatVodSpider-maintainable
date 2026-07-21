package com.github.catvod.spider.support.p117b;

import com.github.catvod.spider.Config;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2169c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5194a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5195b;

    public /* synthetic */ RunnableC2169c(Object obj, int i) {
        this.f5194a = i;
        this.f5195b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5194a) {
            case 0:
                C2175i.m5659a((C2175i) this.f5195b);
                break;
            case 1:
                C2175i.m5659a((C2175i) this.f5195b);
                break;
            default:
                Config.m479b((Config) this.f5195b);
                break;
        }
    }
}
