package com.github.catvod.spider.support.p002A0;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.lf */
/* JADX INFO: loaded from: classes.dex */
public final class C0417lf implements InterfaceC0654u {

    /* JADX INFO: renamed from: a */
    public final String f1152a;

    public C0417lf(String str) {
        this.f1152a = str;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0654u
    /* JADX INFO: renamed from: e */
    public final void mo1195e(StringBuilder sb, Calendar calendar) {
        sb.append((CharSequence) this.f1152a);
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0654u
    /* JADX INFO: renamed from: f */
    public final int mo1196f() {
        return this.f1152a.length();
    }
}
