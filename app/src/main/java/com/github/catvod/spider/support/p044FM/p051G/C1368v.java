package com.github.catvod.spider.support.p044FM.p051G;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p051G.v */
/* JADX INFO: loaded from: classes.dex */
final class C1368v implements InterfaceC1370x {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1370x f3161a;

    C1368v(InterfaceC1370x interfaceC1370x) {
        this.f3161a = interfaceC1370x;
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1370x
    /* JADX INFO: renamed from: a */
    public final void mo3320a(Appendable appendable, int i) {
        this.f3161a.mo3320a(appendable, i);
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: b */
    public final void mo3318b(Appendable appendable, Calendar calendar) {
        int i = calendar.get(7);
        this.f3161a.mo3320a(appendable, i != 1 ? i - 1 : 7);
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: c */
    public final int mo3319c() {
        return this.f3161a.mo3319c();
    }
}
