package com.github.catvod.spider.support.p002A0;

import java.util.ArrayList;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.sc */
/* JADX INFO: loaded from: classes.dex */
public final class C0603sc implements aar {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0769yg f1467a;

    /* JADX INFO: renamed from: b */
    public final int f1468b;

    /* JADX INFO: renamed from: c */
    public final int f1469c;

    /* JADX INFO: renamed from: d */
    public final C0372jo f1470d;

    public C0603sc(C0372jo c0372jo, InterfaceC0769yg interfaceC0769yg, int i, int i2) {
        this.f1467a = interfaceC0769yg;
        this.f1468b = i;
        this.f1469c = i2;
        this.f1470d = c0372jo;
    }

    /* JADX INFO: renamed from: e */
    public final String m1660e() {
        ArrayList arrayList = new ArrayList(4);
        C0233ek c0233ek = C0233ek.f781a;
        InterfaceC0769yg interfaceC0769yg = this.f1467a;
        if (interfaceC0769yg != c0233ek) {
            arrayList.add("context=" + interfaceC0769yg);
        }
        int i = this.f1468b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        int i2 = this.f1469c;
        if (i2 != 1) {
            arrayList.add("onBufferOverflow=".concat(i2 != 1 ? "null" : "SUSPEND"));
        }
        return getClass().getSimpleName() + '[' + AbstractC0623sw.m1700b(arrayList, null, null, null, 62) + ']';
    }

    public final String toString() {
        return this.f1470d + " -> " + m1660e();
    }
}
