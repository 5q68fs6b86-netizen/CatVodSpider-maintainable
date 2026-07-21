package com.github.catvod.spider.support.p044FM.p051G;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.G.I */
/* JADX INFO: loaded from: classes.dex */
final class C1338I implements InterfaceC1370x {

    /* JADX INFO: renamed from: a */
    private final int f3093a;

    C1338I(int i) {
        this.f3093a = i;
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1370x
    /* JADX INFO: renamed from: a */
    public final void mo3320a(Appendable appendable, int i) {
        if (i < 100) {
            C1343N.m3321a(appendable, i);
        } else {
            C1343N.m3322b(appendable, i, 2);
        }
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: b */
    public final void mo3318b(Appendable appendable, Calendar calendar) {
        mo3320a(appendable, calendar.get(this.f3093a));
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: c */
    public final int mo3319c() {
        return 2;
    }
}
