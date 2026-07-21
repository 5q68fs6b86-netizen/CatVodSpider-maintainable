package com.github.catvod.spider.support.p003AB.p008n;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.n.h */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0881h implements Runnable {

    /* JADX INFO: renamed from: b */
    public static final RunnableC0881h f2065b = new RunnableC0881h(0);

    /* JADX INFO: renamed from: c */
    public static final RunnableC0881h f2066c = new RunnableC0881h(1);

    /* JADX INFO: renamed from: a */
    public final int f2067a;

    public /* synthetic */ RunnableC0881h(int i) {
        this.f2067a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        (this.f2067a != 0 ? new Thread(RunnableC0883j.f2073d) : new Thread(RunnableC0882i.f2069c)).start();
    }
}
