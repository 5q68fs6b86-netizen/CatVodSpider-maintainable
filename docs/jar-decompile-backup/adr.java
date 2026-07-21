package com.github.catvod.spider.support.p002A0;

/* JADX INFO: loaded from: classes.dex */
public final class adr extends AbstractC0465n {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f647c;

    /* JADX INFO: renamed from: q */
    public final Object f648q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ adr(AbstractC0521pb abstractC0521pb, Object obj, int i) {
        super(abstractC0521pb);
        this.f647c = i;
        this.f648q = obj;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0465n
    /* JADX INFO: renamed from: f */
    public final void mo992f(Throwable th) {
        switch (this.f647c) {
            case 0:
                ((adh) this.f648q).mo990b();
                break;
            default:
                Object objM1049v = ((C0150bi) this.f1263a).m1049v();
                boolean z = objM1049v instanceof C0647tt;
                C0470ne c0470ne = (C0470ne) this.f648q;
                if (!z) {
                    c0470ne.resumeWith(AbstractC0745xj.m1873j(objM1049v));
                } else {
                    c0470ne.resumeWith(act.m953b(((C0647tt) objM1049v).f1565c));
                }
                break;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0569qw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f647c) {
            case 0:
                mo992f((Throwable) obj);
                break;
            default:
                mo992f((Throwable) obj);
                break;
        }
        return C0372jo.f1077i;
    }
}
