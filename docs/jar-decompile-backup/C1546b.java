package com.github.catvod.spider.support.p044FM.p057M;

import com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p057M.b */
/* JADX INFO: loaded from: classes.dex */
final class C1546b {

    /* JADX INFO: renamed from: a */
    @Nullable
    private C1393m f3494a = null;

    /* JADX INFO: renamed from: b */
    @Nullable
    private C1393m f3495b = null;

    /* JADX INFO: renamed from: c */
    private final AbstractC1532N f3496c;

    C1546b(AbstractC1532N abstractC1532N) {
        this.f3496c = abstractC1532N;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    final C1393m m3780a(C1393m c1393m, C1393m c1393m2) {
        this.f3494a = c1393m;
        this.f3495b = null;
        AbstractC1399s abstractC1399sM3518f = c1393m2;
        int i = 0;
        while (abstractC1399sM3518f != null) {
            int iM3781b = m3781b(abstractC1399sM3518f);
            if (iM3781b == 5) {
                break;
            }
            int i2 = 1;
            if (iM3781b != 1 || abstractC1399sM3518f.mo3411g() <= 0) {
                while (abstractC1399sM3518f.m3523r() == null && i > 0) {
                    if (iM3781b == 1 || iM3781b == 2) {
                        iM3781b = 1;
                    }
                    AbstractC1399s abstractC1399sM3526z = abstractC1399sM3518f.m3526z();
                    i--;
                    if (iM3781b == 4) {
                        abstractC1399sM3518f.m3513B();
                    }
                    abstractC1399sM3518f = abstractC1399sM3526z;
                    iM3781b = 1;
                }
                if (iM3781b != 1 && iM3781b != 2) {
                    i2 = iM3781b;
                }
                if (abstractC1399sM3518f == c1393m2) {
                    break;
                }
                AbstractC1399s abstractC1399sM3523r = abstractC1399sM3518f.m3523r();
                if (i2 == 4) {
                    abstractC1399sM3518f.m3513B();
                }
                abstractC1399sM3518f = abstractC1399sM3523r;
            } else {
                abstractC1399sM3518f = abstractC1399sM3518f.m3518f(0);
                i++;
            }
        }
        return this.f3495b;
    }

    /* JADX INFO: renamed from: b */
    public final int m3781b(AbstractC1399s abstractC1399s) {
        if (!(abstractC1399s instanceof C1393m)) {
            return 1;
        }
        C1393m c1393m = (C1393m) abstractC1399s;
        if (!this.f3496c.mo3766a(this.f3494a, c1393m)) {
            return 1;
        }
        this.f3495b = c1393m;
        return 5;
    }
}
