package com.github.catvod.spider.support.p044FM.p051G;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p051G.y */
/* JADX INFO: loaded from: classes.dex */
final class C1371y implements InterfaceC1370x {

    /* JADX INFO: renamed from: a */
    private final int f3166a;

    /* JADX INFO: renamed from: b */
    private final int f3167b;

    C1371y(int i, int i2) {
        if (i2 < 3) {
            throw new IllegalArgumentException();
        }
        this.f3166a = i;
        this.f3167b = i2;
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1370x
    /* JADX INFO: renamed from: a */
    public final void mo3320a(Appendable appendable, int i) {
        C1343N.m3322b(appendable, i, this.f3167b);
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: b */
    public final void mo3318b(Appendable appendable, Calendar calendar) {
        mo3320a(appendable, calendar.get(this.f3166a));
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: c */
    public final int mo3319c() {
        return this.f3167b;
    }
}
