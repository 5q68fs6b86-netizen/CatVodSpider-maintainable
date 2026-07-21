package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.qt */
/* JADX INFO: loaded from: classes.dex */
public final class C0566qt implements adh {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0269ft f1413a;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ RunnableC0140az f1414c;

    public C0566qt(C0269ft c0269ft, RunnableC0140az runnableC0140az) {
        this.f1413a = c0269ft;
        this.f1414c = runnableC0140az;
    }

    @Override // com.github.catvod.spider.support.p002A0.adh
    /* JADX INFO: renamed from: b */
    public final void mo990b() {
        this.f1413a.f836b.removeCallbacks(this.f1414c);
    }
}
