package com.github.catvod.spider.support.p044FM.p090o;

import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.o.v */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1881v implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4336a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1884y f4337b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f4338c;

    public /* synthetic */ RunnableC1881v(C1884y c1884y, Map map, int i) {
        this.f4336a = i;
        this.f4337b = c1884y;
        this.f4338c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4336a) {
            case 0:
                this.f4337b.m4557y(this.f4338c);
                break;
            case 1:
                this.f4337b.m4559x(this.f4338c);
                break;
            default:
                this.f4337b.m4559x(this.f4338c);
                break;
        }
    }
}
