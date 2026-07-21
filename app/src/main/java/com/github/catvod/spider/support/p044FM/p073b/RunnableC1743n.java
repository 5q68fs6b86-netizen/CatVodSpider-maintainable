package com.github.catvod.spider.support.p044FM.p073b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.b.n */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1743n implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3836a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1750u f3837b;

    public /* synthetic */ RunnableC1743n(C1750u c1750u, int i) {
        this.f3836a = i;
        this.f3837b = c1750u;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3836a) {
            case 0:
                C1750u.m4111b(this.f3837b);
                break;
            default:
                this.f3837b.m4124o();
                break;
        }
    }
}
