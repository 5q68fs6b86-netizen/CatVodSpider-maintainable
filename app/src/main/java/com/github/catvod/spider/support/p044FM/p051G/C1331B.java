package com.github.catvod.spider.support.p044FM.p051G;

import java.util.Calendar;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.G.B */
/* JADX INFO: loaded from: classes.dex */
final class C1331B implements InterfaceC1372z {

    /* JADX INFO: renamed from: a */
    private final int f3078a;

    /* JADX INFO: renamed from: b */
    private final String[] f3079b;

    C1331B(int i, String[] strArr) {
        this.f3078a = i;
        this.f3079b = strArr;
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: b */
    public final void mo3318b(Appendable appendable, Calendar calendar) {
        ((StringBuilder) appendable).append((CharSequence) this.f3079b[calendar.get(this.f3078a)]);
    }

    @Override // com.github.catvod.spider.support.p044FM.p051G.InterfaceC1372z
    /* JADX INFO: renamed from: c */
    public final int mo3319c() {
        int length = this.f3079b.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            int length2 = this.f3079b[length].length();
            if (length2 > i) {
                i = length2;
            }
        }
    }
}
