package com.github.catvod.spider.support.p117b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.b.z */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2189z implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5267a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2144B f5268b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f5269c;

    public /* synthetic */ RunnableC2189z(C2144B c2144b, String str, int i) {
        this.f5267a = i;
        this.f5268b = c2144b;
        this.f5269c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5267a) {
            case 0:
                this.f5268b.m5433b(this.f5269c, true);
                break;
            default:
                this.f5268b.m5433b(this.f5269c, true);
                break;
        }
    }
}
