package com.github.catvod.spider.support.p003AB.p008n;

import com.github.catvod.spider.Bili;
import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p003AB.p005b.C0857x;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.n.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0883j implements Runnable {

    /* JADX INFO: renamed from: b */
    public static final RunnableC0883j f2071b = new RunnableC0883j(0);

    /* JADX INFO: renamed from: c */
    public static final RunnableC0883j f2072c = new RunnableC0883j(1);

    /* JADX INFO: renamed from: d */
    public static final RunnableC0883j f2073d = new RunnableC0883j(2);

    /* JADX INFO: renamed from: a */
    public final int f2074a;

    public /* synthetic */ RunnableC0883j(int i) {
        this.f2074a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2074a;
        if (i == 0) {
            Init.run(RunnableC0884k.f2076c);
            return;
        }
        if (i != 1) {
            try {
                C0857x.m2086p().m2093K();
                return;
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        try {
            Bili.get().getQRCode();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
