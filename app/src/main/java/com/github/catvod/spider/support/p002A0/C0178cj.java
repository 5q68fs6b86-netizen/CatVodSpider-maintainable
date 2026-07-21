package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.cj */
/* JADX INFO: loaded from: classes.dex */
public class C0178cj extends AbstractC0521pb implements InterfaceC0785yw {

    /* JADX INFO: renamed from: ai */
    public final InterfaceC0747xl f712ai;

    public C0178cj(InterfaceC0769yg interfaceC0769yg, InterfaceC0747xl interfaceC0747xl) {
        super(interfaceC0769yg, true);
        this.f712ai = interfaceC0747xl;
    }

    @Override // com.github.catvod.spider.support.p002A0.C0150bi
    /* JADX INFO: renamed from: h */
    public void mo963h(Object obj) {
        AbstractC0552qf.m1583e(AbstractC0650tw.m1728a(obj), AbstractC0313hj.m1276a(this.f712ai));
    }

    @Override // com.github.catvod.spider.support.p002A0.C0150bi
    /* JADX INFO: renamed from: i */
    public void mo964i(Object obj) {
        this.f712ai.resumeWith(AbstractC0650tw.m1728a(obj));
    }

    @Override // com.github.catvod.spider.support.p002A0.C0150bi
    /* JADX INFO: renamed from: z */
    public final boolean mo1053z() {
        return true;
    }
}
