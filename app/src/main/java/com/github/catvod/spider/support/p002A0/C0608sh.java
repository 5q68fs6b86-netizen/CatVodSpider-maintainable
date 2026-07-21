package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.sh */
/* JADX INFO: loaded from: classes.dex */
public final class C0608sh extends AbstractC0455mq {

    /* JADX INFO: renamed from: c */
    public final C0601sa f1491c;

    public C0608sh(InterfaceC0483nr interfaceC0483nr, C0601sa c0601sa) {
        super(interfaceC0483nr);
        this.f1491c = c0601sa;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0465n
    /* JADX INFO: renamed from: f */
    public final void mo992f(Throwable th) {
        C0601sa c0601sa = this.f1491c;
        Throwable thMo1456b = c0601sa.mo1456b(this.f1263a);
        boolean zM958i = false;
        boolean z = c0601sa.f586x == 2;
        InterfaceC0747xl interfaceC0747xl = c0601sa.f1465g;
        if (z) {
            acu acuVar = (acu) (!(interfaceC0747xl instanceof acu) ? null : interfaceC0747xl);
            if (acuVar != null) {
                zM958i = acuVar.m958i(thMo1456b);
            }
        }
        if (zM958i) {
            return;
        }
        c0601sa.m1653q(thMo1456b);
        if ((interfaceC0747xl instanceof acu) && ((acu) interfaceC0747xl).m957h(c0601sa)) {
            return;
        }
        c0601sa.m1654r();
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0569qw
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo992f((Throwable) obj);
        return C0372jo.f1077i;
    }
}
