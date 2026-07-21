package com.github.catvod.spider.support.p012C0.p029e0;

import com.github.catvod.spider.support.p012C0.p020W.C1013a;
import com.github.catvod.spider.support.p012C0.p026c0.AbstractC1059r;
import com.github.catvod.spider.support.p012C0.p026c0.C1053l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p029e0.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1207c {
    /* JADX INFO: renamed from: a */
    public static C1211g m3009a(AbstractC1193N abstractC1193N, C1053l c1053l) {
        C1211g c1211g = new C1211g();
        C1013a.m2550c(new C1205a(c1053l, c1211g, abstractC1193N), c1053l);
        return c1211g;
    }

    /* JADX INFO: renamed from: b */
    public static C1053l m3010b(AbstractC1193N abstractC1193N, C1053l c1053l) {
        C1206b c1206b = new C1206b(c1053l, abstractC1193N);
        int i = 0;
        AbstractC1059r abstractC1059rM2755g = c1053l;
        while (abstractC1059rM2755g != null) {
            int iM3008b = c1206b.m3008b(abstractC1059rM2755g);
            if (iM3008b == 5) {
                break;
            }
            if (iM3008b != 1 || abstractC1059rM2755g.mo2661h() <= 0) {
                int i2 = i;
                while (abstractC1059rM2755g.m2760s() == null && i2 > 0) {
                    if (iM3008b == 1 || iM3008b == 2) {
                        iM3008b = 1;
                    }
                    AbstractC1059r abstractC1059rM2749A = abstractC1059rM2755g.m2749A();
                    i2--;
                    if (iM3008b == 4) {
                        abstractC1059rM2755g.m2750C();
                    }
                    abstractC1059rM2755g = abstractC1059rM2749A;
                    iM3008b = 1;
                }
                if (iM3008b == 1 || iM3008b == 2) {
                    iM3008b = 1;
                }
                if (abstractC1059rM2755g == c1053l) {
                    break;
                }
                AbstractC1059r abstractC1059rM2760s = abstractC1059rM2755g.m2760s();
                if (iM3008b == 4) {
                    abstractC1059rM2755g.m2750C();
                }
                i = i2;
                abstractC1059rM2755g = abstractC1059rM2760s;
            } else {
                abstractC1059rM2755g = abstractC1059rM2755g.m2755g(0);
                i++;
            }
        }
        return c1206b.f2879b;
    }
}
