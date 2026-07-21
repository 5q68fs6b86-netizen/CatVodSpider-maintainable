package com.github.catvod.spider.support.p002A0;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0303h implements InterfaceC0654u {

    /* JADX INFO: renamed from: a */
    public static final C0303h f880a = new C0303h(3);

    /* JADX INFO: renamed from: b */
    public static final C0303h f881b = new C0303h(5);

    /* JADX INFO: renamed from: c */
    public static final C0303h f882c = new C0303h(6);

    /* JADX INFO: renamed from: d */
    public final int f883d;

    public C0303h(int i) {
        this.f883d = i;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0654u
    /* JADX INFO: renamed from: e */
    public final void mo1195e(StringBuilder sb, Calendar calendar) {
        int i = calendar.get(16) + calendar.get(15);
        if (i == 0) {
            sb.append("Z");
            return;
        }
        if (i < 0) {
            sb.append('-');
            i = -i;
        } else {
            sb.append('+');
        }
        int i2 = i / 3600000;
        C0312hi.m1272h(sb, i2);
        int i3 = this.f883d;
        if (i3 < 5) {
            return;
        }
        if (i3 == 6) {
            sb.append(':');
        }
        C0312hi.m1272h(sb, (i / 60000) - (i2 * 60));
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0654u
    /* JADX INFO: renamed from: f */
    public final int mo1196f() {
        return this.f883d;
    }
}
