package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p054J.C1380b;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.c */
/* JADX INFO: loaded from: classes.dex */
final class C1461c extends EnumC1406B {
    C1461c() {
        super("InTableText", 9, null);
    }

    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1406B
    /* JADX INFO: renamed from: d */
    final boolean mo3535d(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        EnumC1406B enumC1406B = EnumC1406B.f3271g;
        if (abstractC1436Q.f3337a == 5) {
            C1420I c1420i = (C1420I) abstractC1436Q;
            if (c1420i.m3566l().equals(EnumC1406B.f3289y)) {
                c1458b.m3738t(this);
                return false;
            }
            ((ArrayList) c1458b.m3687C()).add(c1420i.m3566l());
            return true;
        }
        if (((ArrayList) c1458b.m3687C()).size() > 0) {
            for (String str : (ArrayList) c1458b.m3687C()) {
                if (C1380b.m3365d(str)) {
                    C1420I c1420i2 = new C1420I();
                    c1420i2.m3565k(str);
                    c1458b.m3694K(c1420i2);
                } else {
                    c1458b.m3738t(this);
                    if (C1380b.m3364c(c1458b.m3755a().m3469i0(), C1404A.f3227A)) {
                        c1458b.m3733q0(true);
                        C1420I c1420i3 = new C1420I();
                        c1420i3.m3565k(str);
                        c1458b.m3716f0(c1420i3, enumC1406B);
                        c1458b.m3733q0(false);
                    } else {
                        C1420I c1420i4 = new C1420I();
                        c1420i4.m3565k(str);
                        c1458b.m3716f0(c1420i4, enumC1406B);
                    }
                }
            }
            c1458b.m3705W();
        }
        c1458b.m3741u0(c1458b.m3708a0());
        return c1458b.mo3717g(abstractC1436Q);
    }
}
