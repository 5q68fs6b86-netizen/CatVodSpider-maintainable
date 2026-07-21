package com.github.catvod.spider.support.p044FM.p051G;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p051G.K */
/* JADX INFO: loaded from: classes.dex */
final class C1340K implements InterfaceC1370x {

    /* JADX INFO: renamed from: a */
    static final C1340K f3095a = new C1340K();

    C1340K() {
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1370x
    /* JADX INFO: renamed from: a */
    public final void mo3320a(Appendable appendable, int i) {
        if (i >= 10) {
            C1343N.m3321a(appendable, i);
        } else {
            ((StringBuilder) appendable).append((char) (i + 48));
        }
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: b */
    public final void mo3318b(Appendable appendable, Calendar calendar) {
        mo3320a(appendable, calendar.get(2) + 1);
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: c */
    public final int mo3319c() {
        return 2;
    }
}
