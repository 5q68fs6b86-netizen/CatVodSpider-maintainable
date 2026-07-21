package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p134t.AbstractC2324q;
import com.github.catvod.spider.support.p134t.InterfaceC2311d;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.u.y */
/* JADX INFO: loaded from: classes.dex */
public final class C2393y {

    /* JADX INFO: renamed from: a */
    private final InterfaceC2392x[] f5914a;

    /* JADX INFO: renamed from: b */
    private final int f5915b;

    public C2393y(InterfaceC2392x[] interfaceC2392xArr) {
        this.f5914a = interfaceC2392xArr;
        int iM3169i = 0;
        for (InterfaceC2392x interfaceC2392x : interfaceC2392xArr) {
            iM3169i = C1273a.m3169i(iM3169i, interfaceC2392x);
        }
        this.f5915b = C1273a.m3160b(iM3169i, interfaceC2392xArr.length);
    }

    /* JADX INFO: renamed from: a */
    public static C2393y m6389a(C2393y c2393y, InterfaceC2392x interfaceC2392x) {
        if (c2393y == null) {
            return new C2393y(new InterfaceC2392x[]{interfaceC2392x});
        }
        InterfaceC2392x[] interfaceC2392xArr = c2393y.f5914a;
        InterfaceC2392x[] interfaceC2392xArr2 = (InterfaceC2392x[]) Arrays.copyOf(interfaceC2392xArr, interfaceC2392xArr.length + 1);
        interfaceC2392xArr2[interfaceC2392xArr2.length - 1] = interfaceC2392x;
        return new C2393y(interfaceC2392xArr2);
    }

    /* JADX INFO: renamed from: b */
    public final void m6390b(AbstractC2324q abstractC2324q, InterfaceC2311d interfaceC2311d, int i) throws Throwable {
        int iMo6234h = interfaceC2311d.mo6234h();
        boolean z = false;
        try {
            InterfaceC2392x[] interfaceC2392xArr = this.f5914a;
            int length = interfaceC2392xArr.length;
            boolean z2 = false;
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    InterfaceC2392x interfaceC2392xM6306c = interfaceC2392xArr[i2];
                    if (interfaceC2392xM6306c instanceof C2336C) {
                        int iM6307d = ((C2336C) interfaceC2392xM6306c).m6307d() + i;
                        interfaceC2311d.mo6232e(iM6307d);
                        interfaceC2392xM6306c = ((C2336C) interfaceC2392xM6306c).m6306c();
                        z2 = iM6307d != iMo6234h;
                    } else if (interfaceC2392xM6306c.mo6305b()) {
                        interfaceC2311d.mo6232e(iMo6234h);
                    }
                    interfaceC2392xM6306c.mo6304a(abstractC2324q);
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    if (z) {
                        interfaceC2311d.mo6232e(iMo6234h);
                    }
                    throw th;
                }
            }
            if (z2) {
                interfaceC2311d.mo6232e(iMo6234h);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C2393y m6391c(int i) {
        InterfaceC2392x[] interfaceC2392xArr = null;
        int i2 = 0;
        while (true) {
            InterfaceC2392x[] interfaceC2392xArr2 = this.f5914a;
            if (i2 >= interfaceC2392xArr2.length) {
                break;
            }
            if (interfaceC2392xArr2[i2].mo6305b()) {
                InterfaceC2392x[] interfaceC2392xArr3 = this.f5914a;
                if (!(interfaceC2392xArr3[i2] instanceof C2336C)) {
                    if (interfaceC2392xArr == null) {
                        interfaceC2392xArr = (InterfaceC2392x[]) interfaceC2392xArr3.clone();
                    }
                    interfaceC2392xArr[i2] = new C2336C(i, this.f5914a[i2]);
                }
            }
            i2++;
        }
        return interfaceC2392xArr == null ? this : new C2393y(interfaceC2392xArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2393y)) {
            return false;
        }
        C2393y c2393y = (C2393y) obj;
        return this.f5915b == c2393y.f5915b && Arrays.equals(this.f5914a, c2393y.f5914a);
    }

    public final int hashCode() {
        return this.f5915b;
    }
}
