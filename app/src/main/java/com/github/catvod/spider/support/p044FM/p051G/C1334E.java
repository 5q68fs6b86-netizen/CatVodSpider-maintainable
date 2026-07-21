package com.github.catvod.spider.support.p044FM.p051G;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.G.E */
/* JADX INFO: loaded from: classes.dex */
final class C1334E implements InterfaceC1372z {

    /* JADX INFO: renamed from: b */
    static final C1334E f3087b = new C1334E(true);

    /* JADX INFO: renamed from: c */
    static final C1334E f3088c = new C1334E(false);

    /* JADX INFO: renamed from: a */
    final boolean f3089a;

    C1334E(boolean z) {
        this.f3089a = z;
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: b */
    public final void mo3318b(Appendable appendable, Calendar calendar) {
        int i = calendar.get(16) + calendar.get(15);
        if (i < 0) {
            ((StringBuilder) appendable).append('-');
            i = -i;
        } else {
            ((StringBuilder) appendable).append('+');
        }
        int i2 = i / 3600000;
        C1343N.m3321a(appendable, i2);
        if (this.f3089a) {
            ((StringBuilder) appendable).append(':');
        }
        C1343N.m3321a(appendable, (i / 60000) - (i2 * 60));
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: c */
    public final int mo3319c() {
        return 5;
    }
}
