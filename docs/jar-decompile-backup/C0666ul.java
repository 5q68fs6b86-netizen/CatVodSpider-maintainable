package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ul */
/* JADX INFO: loaded from: classes.dex */
public final class C0666ul extends C0150bi {

    /* JADX INFO: renamed from: a */
    public final boolean f1576a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0666ul(InterfaceC0483nr interfaceC0483nr) {
        C0150bi c0150bi;
        super(true);
        boolean z = true;
        m1051x(interfaceC0483nr);
        InterfaceC0609si interfaceC0609siM1048u = m1048u();
        C0610sj c0610sj = (C0610sj) (interfaceC0609siM1048u instanceof C0610sj ? interfaceC0609siM1048u : null);
        if (c0610sj == null || (c0150bi = (C0150bi) c0610sj.f1263a) == null) {
            z = false;
            break;
        }
        while (!c0150bi.mo1046s()) {
            InterfaceC0609si interfaceC0609siM1048u2 = c0150bi.m1048u();
            C0610sj c0610sj2 = (C0610sj) (interfaceC0609siM1048u2 instanceof C0610sj ? interfaceC0609siM1048u2 : null);
            if (c0610sj2 == null || (c0150bi = (C0150bi) c0610sj2.f1263a) == null) {
                z = false;
                break;
            }
        }
        this.f1576a = z;
    }

    @Override // com.github.catvod.spider.support.p002A0.C0150bi
    /* JADX INFO: renamed from: m */
    public final boolean mo1040m(Throwable th) {
        return false;
    }

    @Override // com.github.catvod.spider.support.p002A0.C0150bi
    /* JADX INFO: renamed from: s */
    public final boolean mo1046s() {
        return this.f1576a;
    }
}
