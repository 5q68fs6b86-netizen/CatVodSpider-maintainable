package com.github.catvod.spider.support.p128m;

import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.s */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2276s implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5682a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2253G f5683b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f5684c;

    public /* synthetic */ RunnableC2276s(C2253G c2253g, Map map, int i) {
        this.f5682a = i;
        this.f5683b = c2253g;
        this.f5684c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5682a) {
            case 0:
                this.f5683b.m6104w(this.f5684c);
                break;
            case 1:
                this.f5683b.m6108z(this.f5684c);
                break;
            default:
                this.f5683b.m6080A(this.f5684c);
                break;
        }
    }
}
