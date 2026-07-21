package com.github.catvod.spider.support.p002A0;

import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.gk */
/* JADX INFO: loaded from: classes.dex */
public final class C0287gk {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0573r[] f858a;

    /* JADX INFO: renamed from: b */
    public final int f859b;

    public C0287gk(InterfaceC0573r[] interfaceC0573rArr) {
        this.f858a = interfaceC0573rArr;
        int iM1524k = 0;
        for (InterfaceC0573r interfaceC0573r : interfaceC0573rArr) {
            iM1524k = AbstractC0534po.m1524k(iM1524k, interfaceC0573r);
        }
        this.f859b = AbstractC0534po.m1518e(iM1524k, interfaceC0573rArr.length);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0287gk)) {
            return false;
        }
        C0287gk c0287gk = (C0287gk) obj;
        return this.f859b == c0287gk.f859b && Arrays.equals(this.f858a, c0287gk.f858a);
    }

    public final int hashCode() {
        return this.f859b;
    }
}
