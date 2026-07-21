package com.github.catvod.spider.support.p044FM.p098x;

import com.github.catvod.spider.support.p044FM.p045A.C1284j;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.x.i */
/* JADX INFO: loaded from: classes.dex */
final class C1934i extends AbstractC1937l {

    /* JADX INFO: renamed from: c */
    private final char[] f4416c;

    C1934i(int i, int i2, char[] cArr) {
        super(i2);
        this.f4416c = cArr;
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1929d
    /* JADX INFO: renamed from: e */
    public final String mo4667e(C1284j c1284j) {
        int iMin = Math.min(c1284j.f3009a, this.f4419a);
        return new String(this.f4416c, iMin, Math.min((c1284j.f3010b - c1284j.f3009a) + 1, this.f4419a - iMin));
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1944s
    /* JADX INFO: renamed from: h */
    public final int mo4659h(int i) {
        char c;
        int iSignum = Integer.signum(1);
        if (iSignum == -1) {
            int i2 = this.f4420b + 1;
            if (i2 < 0) {
                return -1;
            }
            c = this.f4416c[i2];
        } else {
            if (iSignum == 0) {
                return 0;
            }
            if (iSignum != 1) {
                throw new UnsupportedOperationException("Not reached");
            }
            int i3 = (this.f4420b + 1) - 1;
            if (i3 >= this.f4419a) {
                return -1;
            }
            c = this.f4416c[i3];
        }
        return c & 65535;
    }
}
