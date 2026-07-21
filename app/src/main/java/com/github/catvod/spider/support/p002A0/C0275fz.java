package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.fz */
/* JADX INFO: loaded from: classes.dex */
public final class C0275fz extends C0178cj {
    @Override // com.github.catvod.spider.support.p002A0.C0178cj, com.github.catvod.spider.support.p002A0.C0150bi
    /* JADX INFO: renamed from: i */
    public final void mo964i(Object obj) {
        Object objM1728a = AbstractC0650tw.m1728a(obj);
        InterfaceC0747xl interfaceC0747xl = this.f712ai;
        InterfaceC0769yg context = interfaceC0747xl.getContext();
        Object objM1957d = AbstractC0807zr.m1957d(context, null);
        try {
            interfaceC0747xl.resumeWith(objM1728a);
        } finally {
            AbstractC0807zr.m1956c(context, objM1957d);
        }
    }
}
