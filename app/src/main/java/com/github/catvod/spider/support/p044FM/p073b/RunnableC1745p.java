package com.github.catvod.spider.support.p044FM.p073b;

import com.github.catvod.spider.JSDemo;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.b.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1745p implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3840a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3841b;

    public /* synthetic */ RunnableC1745p(Object obj, int i) {
        this.f3840a = i;
        this.f3841b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3840a) {
            case 0:
                C1750u.m4111b((C1750u) this.f3841b);
                break;
            case 1:
                C1715C.m4001e((C1715C) this.f3841b);
                break;
            default:
                JSDemo.a((JSDemo) this.f3841b);
                break;
        }
    }
}
