package com.github.catvod.spider.support.p044FM.p089n;

import com.github.catvod.spider.Init;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.n.e */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1849e implements Runnable {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ RunnableC1849e f4245b = new RunnableC1849e(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ RunnableC1849e f4246c = new RunnableC1849e(1);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4247a;

    public /* synthetic */ RunnableC1849e(int i) {
        this.f4247a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4247a) {
            case 0:
                Init.run(RunnableC1850f.f4249c);
                break;
            default:
                new Thread(RunnableC1852h.f4257d).start();
                break;
        }
    }
}
