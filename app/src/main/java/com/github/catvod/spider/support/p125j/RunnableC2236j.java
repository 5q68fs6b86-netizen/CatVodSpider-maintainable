package com.github.catvod.spider.support.p125j;

import com.github.catvod.debug.MainActivity;

/* JADX INFO: renamed from: com.github.catvod.spider.support.j.j */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2236j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5581a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MainActivity f5582b;

    public /* synthetic */ RunnableC2236j(MainActivity mainActivity, int i) {
        this.f5581a = i;
        this.f5582b = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5581a) {
            case 0:
                this.f5582b.o();
                break;
            default:
                this.f5582b.k();
                break;
        }
    }
}
