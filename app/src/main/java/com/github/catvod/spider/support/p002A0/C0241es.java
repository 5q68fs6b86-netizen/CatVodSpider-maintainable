package com.github.catvod.spider.support.p002A0;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.es */
/* JADX INFO: loaded from: classes.dex */
public final class C0241es implements InterfaceC0654u {

    /* JADX INFO: renamed from: a */
    public static final C0241es f792a = new C0241es(true);

    /* JADX INFO: renamed from: b */
    public static final C0241es f793b = new C0241es(false);

    /* JADX INFO: renamed from: c */
    public final boolean f794c;

    public C0241es(boolean z) {
        this.f794c = z;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0654u
    /* JADX INFO: renamed from: e */
    public final void mo1195e(StringBuilder sb, Calendar calendar) {
        int i = calendar.get(16) + calendar.get(15);
        if (i < 0) {
            sb.append('-');
            i = -i;
        } else {
            sb.append('+');
        }
        int i2 = i / 3600000;
        C0312hi.m1272h(sb, i2);
        if (this.f794c) {
            sb.append(':');
        }
        C0312hi.m1272h(sb, (i / 60000) - (i2 * 60));
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0654u
    /* JADX INFO: renamed from: f */
    public final int mo1196f() {
        return 5;
    }
}
