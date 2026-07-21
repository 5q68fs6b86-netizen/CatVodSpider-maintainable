package com.github.catvod.spider.support.p044FM.p051G;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p051G.w */
/* JADX INFO: loaded from: classes.dex */
final class C1369w implements InterfaceC1372z {

    /* JADX INFO: renamed from: b */
    static final C1369w f3162b = new C1369w(3);

    /* JADX INFO: renamed from: c */
    static final C1369w f3163c = new C1369w(5);

    /* JADX INFO: renamed from: d */
    static final C1369w f3164d = new C1369w(6);

    /* JADX INFO: renamed from: a */
    final int f3165a;

    C1369w(int i) {
        this.f3165a = i;
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: b */
    public final void mo3318b(Appendable appendable, Calendar calendar) {
        int i = calendar.get(16) + calendar.get(15);
        if (i == 0) {
            ((StringBuilder) appendable).append((CharSequence) "Z");
            return;
        }
        if (i < 0) {
            ((StringBuilder) appendable).append('-');
            i = -i;
        } else {
            ((StringBuilder) appendable).append('+');
        }
        int i2 = i / 3600000;
        C1343N.m3321a(appendable, i2);
        int i3 = this.f3165a;
        if (i3 < 5) {
            return;
        }
        if (i3 == 6) {
            ((StringBuilder) appendable).append(':');
        }
        C1343N.m3321a(appendable, (i / 60000) - (i2 * 60));
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: c */
    public final int mo3319c() {
        return this.f3165a;
    }
}
