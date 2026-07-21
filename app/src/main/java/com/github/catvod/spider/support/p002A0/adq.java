package com.github.catvod.spider.support.p002A0;

/* JADX INFO: loaded from: classes.dex */
public final class adq implements InterfaceC0282gf, InterfaceC0569qw {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f645a;

    /* JADX INFO: renamed from: b */
    public final Object f646b;

    public /* synthetic */ adq(int i, Object obj) {
        this.f645a = i;
        this.f646b = obj;
    }

    /* JADX INFO: renamed from: c */
    public final void m991c(Throwable th) {
        switch (this.f645a) {
            case 0:
                ((adh) this.f646b).mo990b();
                break;
            default:
                ((InterfaceC0569qw) this.f646b).invoke(th);
                break;
        }
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0569qw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f645a) {
            case 0:
                m991c((Throwable) obj);
                break;
            default:
                m991c((Throwable) obj);
                break;
        }
        return C0372jo.f1077i;
    }

    public final String toString() {
        switch (this.f645a) {
            case 0:
                return "DisposeOnCancel[" + ((adh) this.f646b) + ']';
            default:
                return "InvokeOnCancel[" + ((InterfaceC0569qw) this.f646b).getClass().getSimpleName() + '@' + AbstractC0592rs.m1647a(this) + ']';
        }
    }
}
