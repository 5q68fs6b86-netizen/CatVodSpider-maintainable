package com.github.catvod.spider.support.p044FM.p089n;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.support.p044FM.p073b.C1729Q;
import com.github.catvod.spider.support.p044FM.p073b.C1750u;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p089n.g */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1851g implements Runnable {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ RunnableC1851g f4251b = new RunnableC1851g(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ RunnableC1851g f4252c = new RunnableC1851g(1);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ RunnableC1851g f4253d = new RunnableC1851g(2);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4254a;

    public /* synthetic */ RunnableC1851g(int i) {
        this.f4254a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4254a) {
            case 0:
                C1729Q.m4076q().m4089m();
                break;
            case 1:
                try {
                    Bili.get().getQRCode();
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                break;
            default:
                try {
                    C1750u.m4125p().m4132K();
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
                break;
        }
    }
}
