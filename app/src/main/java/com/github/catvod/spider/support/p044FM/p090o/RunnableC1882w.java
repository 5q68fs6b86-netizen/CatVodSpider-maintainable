package com.github.catvod.spider.support.p044FM.p090o;

import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.o.w */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1882w implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4339a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1884y f4340b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f4341c;

    public /* synthetic */ RunnableC1882w(C1884y c1884y, Map map, int i) {
        this.f4339a = i;
        this.f4340b = c1884y;
        this.f4341c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4339a) {
            case 0:
                this.f4340b.m4547n(this.f4341c);
                break;
            default:
                this.f4340b.m4559x(this.f4341c);
                break;
        }
    }
}
