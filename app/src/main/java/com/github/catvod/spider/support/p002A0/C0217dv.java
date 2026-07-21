package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.dv */
/* JADX INFO: loaded from: classes.dex */
public final class C0217dv extends AbstractRunnableC0494ob {

    /* JADX INFO: renamed from: a */
    public final C0601sa f753a;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0219dx f754c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0217dv(AbstractC0219dx abstractC0219dx, long j, C0601sa c0601sa) {
        super(j);
        this.f754c = abstractC0219dx;
        this.f753a = c0601sa;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f753a.m1658v(this.f754c);
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractRunnableC0494ob
    public final String toString() {
        return super.toString() + this.f753a.toString();
    }
}
