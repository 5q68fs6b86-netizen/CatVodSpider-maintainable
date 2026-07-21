package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.oh */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0500oh {
    /* JADX INFO: renamed from: a */
    public static final Object m1480a(long j, AbstractC0748xm abstractC0748xm) {
        if (j <= 0) {
            return C0372jo.f1077i;
        }
        C0601sa c0601sa = new C0601sa(AbstractC0313hj.m1276a(abstractC0748xm));
        c0601sa.m1659w();
        if (j < Long.MAX_VALUE) {
            InterfaceC0750xo interfaceC0750xo = c0601sa.f1464f.get(C0372jo.f1071c);
            if (!(interfaceC0750xo instanceof acp)) {
                interfaceC0750xo = null;
            }
            acp acpVar = (acp) interfaceC0750xo;
            if (acpVar == null) {
                acpVar = ack.f563a;
            }
            acpVar.mo951d(j, c0601sa);
        }
        return c0601sa.m1656t();
    }
}
