package com.github.catvod.spider.support.p128m;

import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.q */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2274q implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5676a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2253G f5677b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f5678c;

    public /* synthetic */ RunnableC2274q(C2253G c2253g, Map map, int i) {
        this.f5676a = i;
        this.f5677b = c2253g;
        this.f5678c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5676a) {
            case 0:
                this.f5677b.m6080A(this.f5678c);
                break;
            case 1:
                this.f5677b.m6108z(this.f5678c);
                break;
            default:
                this.f5677b.m6080A(this.f5678c);
                break;
        }
    }
}
