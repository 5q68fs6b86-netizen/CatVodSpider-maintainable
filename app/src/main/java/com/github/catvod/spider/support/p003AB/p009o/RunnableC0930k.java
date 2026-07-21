package com.github.catvod.spider.support.p003AB.p009o;

import android.widget.Toast;

/* JADX INFO: renamed from: com.github.catvod.spider.support.AB.o.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0930k implements Runnable {

    /* JADX INFO: renamed from: a */
    public final int f2189a;

    /* JADX INFO: renamed from: b */
    public final C0936q f2190b;

    public /* synthetic */ RunnableC0930k(C0936q c0936q, int i) {
        this.f2189a = i;
        this.f2190b = c0936q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2189a;
        C0936q c0936q = this.f2190b;
        if (i != 0) {
            Toast.makeText(c0936q.f2206a, "弹幕加载失败", 0).show();
        } else {
            C0936q.m2254f(c0936q);
        }
    }
}
