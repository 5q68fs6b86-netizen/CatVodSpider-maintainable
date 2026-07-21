package com.github.catvod.spider.support.p044FM.p098x;

import com.github.catvod.spider.support.p044FM.p045A.C1284j;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p098x.j */
/* JADX INFO: loaded from: classes.dex */
final class C1935j extends AbstractC1937l {

    /* JADX INFO: renamed from: c */
    private final int[] f4417c;

    C1935j(int i, int i2, int[] iArr) {
        super(i2);
        this.f4417c = iArr;
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1929d
    /* JADX INFO: renamed from: e */
    public final String mo4667e(C1284j c1284j) {
        int iMin = Math.min(c1284j.f3009a, this.f4419a);
        return new String(this.f4417c, iMin, Math.min((c1284j.f3010b - c1284j.f3009a) + 1, this.f4419a - iMin));
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.InterfaceC1944s
    /* JADX INFO: renamed from: h */
    public final int mo4659h(int i) {
        int iSignum = Integer.signum(1);
        if (iSignum == -1) {
            int i2 = this.f4420b + 1;
            if (i2 < 0) {
                return -1;
            }
            return this.f4417c[i2];
        }
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
        return this.f4417c[i3];
    }
}
