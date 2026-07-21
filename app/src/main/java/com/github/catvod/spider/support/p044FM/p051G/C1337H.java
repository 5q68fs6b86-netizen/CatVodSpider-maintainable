package com.github.catvod.spider.support.p044FM.p051G;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.G.H */
/* JADX INFO: loaded from: classes.dex */
final class C1337H implements InterfaceC1370x {

    /* JADX INFO: renamed from: a */
    static final C1337H f3092a = new C1337H();

    C1337H() {
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1370x
    /* JADX INFO: renamed from: a */
    public final void mo3320a(Appendable appendable, int i) {
        C1343N.m3321a(appendable, i);
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: b */
    public final void mo3318b(Appendable appendable, Calendar calendar) {
        C1343N.m3321a(appendable, calendar.get(2) + 1);
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: c */
    public final int mo3319c() {
        return 2;
    }
}
