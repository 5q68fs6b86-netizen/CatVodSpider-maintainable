package com.github.catvod.spider.support.p003AB.p008n;

import com.github.catvod.spider.Init;
import com.github.catvod.spider.support.p003AB.p005b.C0833Q;
import java.io.IOException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.n.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0884k implements Runnable {

    /* JADX INFO: renamed from: b */
    public static final RunnableC0884k f2075b = new RunnableC0884k(0);

    /* JADX INFO: renamed from: c */
    public static final RunnableC0884k f2076c = new RunnableC0884k(1);

    /* JADX INFO: renamed from: d */
    public static final RunnableC0884k f2077d = new RunnableC0884k(2);

    /* JADX INFO: renamed from: a */
    public final int f2078a;

    public /* synthetic */ RunnableC0884k(int i) {
        this.f2078a = i;
    }

    @Override // java.lang.Runnable
    public final void run() throws IOException {
        int i = this.f2078a;
        if (i == 0) {
            C0833Q.m2036t().m2051p();
        } else if (i != 1) {
            Init.m574a();
        } else {
            new Thread(RunnableC0886m.f2086e).start();
        }
    }
}
