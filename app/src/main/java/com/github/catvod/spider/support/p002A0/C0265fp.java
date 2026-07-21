package com.github.catvod.spider.support.p002A0;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.fp */
/* JADX INFO: loaded from: classes.dex */
public final class C0265fp implements InterfaceC0159br {

    /* JADX INFO: renamed from: a */
    public final int f832a;

    /* JADX INFO: renamed from: b */
    public final int f833b;

    public C0265fp(int i, int i2) {
        if (i2 < 3) {
            throw new IllegalArgumentException();
        }
        this.f832a = i;
        this.f833b = i2;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0159br
    /* JADX INFO: renamed from: c */
    public final void mo1063c(StringBuilder sb, int i) {
        C0312hi.m1273i(sb, i, this.f833b);
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0654u
    /* JADX INFO: renamed from: e */
    public final void mo1195e(StringBuilder sb, Calendar calendar) {
        mo1063c(sb, calendar.get(this.f832a));
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0654u
    /* JADX INFO: renamed from: f */
    public final int mo1196f() {
        return this.f833b;
    }
}
