package com.github.catvod.spider.support.p117b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p117b.q */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC2183q implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5244a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5245b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f5246c;

    public /* synthetic */ RunnableC2183q(Object obj, String str, int i) {
        this.f5244a = i;
        this.f5245b = obj;
        this.f5246c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5244a) {
            case 0:
                ((C2187w) this.f5245b).m5759d(this.f5246c, true);
                break;
            case 1:
                ((C2187w) this.f5245b).m5759d(this.f5246c, true);
                break;
            default:
                C2144B c2144b = (C2144B) this.f5245b;
                String str = this.f5246c;
                int i = C2144B.f5027e;
                c2144b.m5433b(str, true);
                break;
        }
    }
}
