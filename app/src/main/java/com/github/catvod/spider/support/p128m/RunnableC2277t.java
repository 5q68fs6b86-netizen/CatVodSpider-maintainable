package com.github.catvod.spider.support.p128m;

import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.t */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2277t implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5685a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2253G f5686b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f5687c;

    public /* synthetic */ RunnableC2277t(C2253G c2253g, Map map, int i) {
        this.f5685a = i;
        this.f5686b = c2253g;
        this.f5687c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5685a) {
            case 0:
                this.f5686b.m6108z(this.f5687c);
                break;
            default:
                this.f5686b.m6108z(this.f5687c);
                break;
        }
    }
}
