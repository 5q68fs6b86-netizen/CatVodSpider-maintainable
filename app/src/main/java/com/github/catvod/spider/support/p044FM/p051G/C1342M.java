package com.github.catvod.spider.support.p044FM.p051G;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.G.M */
/* JADX INFO: loaded from: classes.dex */
final class C1342M implements InterfaceC1370x {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1370x f3097a;

    C1342M(InterfaceC1370x interfaceC1370x) {
        this.f3097a = interfaceC1370x;
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1370x
    /* JADX INFO: renamed from: a */
    public final void mo3320a(Appendable appendable, int i) {
        this.f3097a.mo3320a(appendable, i);
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: b */
    public final void mo3318b(Appendable appendable, Calendar calendar) {
        this.f3097a.mo3320a(appendable, calendar.getWeekYear());
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: c */
    public final int mo3319c() {
        return this.f3097a.mo3319c();
    }
}
