package com.github.catvod.spider.support.p044FM.p090o;

import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p090o.x */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1883x implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f4342a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1884y f4343b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f4344c;

    public /* synthetic */ RunnableC1883x(C1884y c1884y, Map map, int i) {
        this.f4342a = i;
        this.f4343b = c1884y;
        this.f4344c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4342a) {
            case 0:
                this.f4343b.m4557y(this.f4344c);
                break;
            default:
                this.f4343b.m4559x(this.f4344c);
                break;
        }
    }
}
