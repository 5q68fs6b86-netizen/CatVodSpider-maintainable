package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.un */
/* JADX INFO: loaded from: classes.dex */
public final class C0668un extends AbstractC0814zy implements InterfaceC0569qw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0269ft f1577a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ RunnableC0169ca f1578b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0668un(C0269ft c0269ft, RunnableC0169ca runnableC0169ca) {
        super(1);
        this.f1577a = c0269ft;
        this.f1578b = runnableC0169ca;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0569qw
    public final Object invoke(Object obj) {
        this.f1577a.f836b.removeCallbacks(this.f1578b);
        return C0372jo.f1077i;
    }
}
