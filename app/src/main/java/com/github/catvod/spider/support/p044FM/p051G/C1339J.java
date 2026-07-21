package com.github.catvod.spider.support.p044FM.p051G;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.G.J */
/* JADX INFO: loaded from: classes.dex */
final class C1339J implements InterfaceC1370x {

    /* JADX INFO: renamed from: a */
    static final C1339J f3094a = new C1339J();

    C1339J() {
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1370x
    /* JADX INFO: renamed from: a */
    public final void mo3320a(Appendable appendable, int i) {
        C1343N.m3321a(appendable, i % 100);
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: b */
    public final void mo3318b(Appendable appendable, Calendar calendar) {
        mo3320a(appendable, calendar.get(1) % 100);
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: c */
    public final int mo3319c() {
        return 2;
    }
}
