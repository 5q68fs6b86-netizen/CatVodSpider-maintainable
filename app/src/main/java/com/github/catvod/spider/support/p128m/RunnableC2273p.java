package com.github.catvod.spider.support.p128m;

import java.util.Map;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2273p implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5673a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2253G f5674b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Map f5675c;

    public /* synthetic */ RunnableC2273p(C2253G c2253g, Map map, int i) {
        this.f5673a = i;
        this.f5674b = c2253g;
        this.f5675c = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5673a) {
            case 0:
                this.f5674b.m6080A(this.f5675c);
                break;
            default:
                this.f5674b.m6080A(this.f5675c);
                break;
        }
    }
}
