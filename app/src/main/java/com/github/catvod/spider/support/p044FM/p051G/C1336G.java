package com.github.catvod.spider.support.p044FM.p051G;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p051G.G */
/* JADX INFO: loaded from: classes.dex */
final class C1336G implements InterfaceC1370x {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1370x f3091a;

    C1336G(InterfaceC1370x interfaceC1370x) {
        this.f3091a = interfaceC1370x;
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1370x
    /* JADX INFO: renamed from: a */
    public final void mo3320a(Appendable appendable, int i) {
        this.f3091a.mo3320a(appendable, i);
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: b */
    public final void mo3318b(Appendable appendable, Calendar calendar) {
        int maximum = calendar.get(11);
        if (maximum == 0) {
            maximum = calendar.getMaximum(11) + 1;
        }
        this.f3091a.mo3320a(appendable, maximum);
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: c */
    public final int mo3319c() {
        return this.f3091a.mo3319c();
    }
}
