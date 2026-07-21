package com.github.catvod.spider.support.p044FM.p099y;

import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p098x.AbstractC1945t;
import com.github.catvod.spider.support.p044FM.p098x.InterfaceC1929d;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.y.D */
/* JADX INFO: loaded from: classes.dex */
public final class C1955D {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1954C[] f4473a;

    /* JADX INFO: renamed from: b */
    private final int f4474b;

    public C1955D(InterfaceC1954C[] interfaceC1954CArr) {
        this.f4473a = interfaceC1954CArr;
        int iM3225j = 0;
        for (InterfaceC1954C interfaceC1954C : interfaceC1954CArr) {
            iM3225j = C1286l.m3225j(iM3225j, interfaceC1954C);
        }
        this.f4474b = C1286l.m3218c(iM3225j, interfaceC1954CArr.length);
    }

    /* JADX INFO: renamed from: a */
    public static C1955D m4725a(C1955D c1955d, InterfaceC1954C interfaceC1954C) {
        if (c1955d == null) {
            return new C1955D(new InterfaceC1954C[]{interfaceC1954C});
        }
        InterfaceC1954C[] interfaceC1954CArr = c1955d.f4473a;
        InterfaceC1954C[] interfaceC1954CArr2 = (InterfaceC1954C[]) Arrays.copyOf(interfaceC1954CArr, interfaceC1954CArr.length + 1);
        interfaceC1954CArr2[interfaceC1954CArr2.length - 1] = interfaceC1954C;
        return new C1955D(interfaceC1954CArr2);
    }

    /* JADX INFO: renamed from: b */
    public final void m4726b(AbstractC1945t abstractC1945t, InterfaceC1929d interfaceC1929d, int i) throws Throwable {
        int iMo4660i = interfaceC1929d.mo4660i();
        boolean z = false;
        try {
            InterfaceC1954C[] interfaceC1954CArr = this.f4473a;
            int length = interfaceC1954CArr.length;
            boolean z2 = false;
            for (int i2 = 0; i2 < length; i2++) {
                try {
                    InterfaceC1954C interfaceC1954CM4728c = interfaceC1954CArr[i2];
                    if (interfaceC1954CM4728c instanceof C1959H) {
                        int iM4729d = ((C1959H) interfaceC1954CM4728c).m4729d() + i;
                        interfaceC1929d.mo4658f(iM4729d);
                        interfaceC1954CM4728c = ((C1959H) interfaceC1954CM4728c).m4728c();
                        z2 = iM4729d != iMo4660i;
                    } else if (interfaceC1954CM4728c.mo4723a()) {
                        interfaceC1929d.mo4658f(iMo4660i);
                    }
                    interfaceC1954CM4728c.mo4724b(abstractC1945t);
                } catch (Throwable th) {
                    th = th;
                    z = z2;
                    if (z) {
                        interfaceC1929d.mo4658f(iMo4660i);
                    }
                    throw th;
                }
            }
            if (z2) {
                interfaceC1929d.mo4658f(iMo4660i);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C1955D m4727c(int i) {
        InterfaceC1954C[] interfaceC1954CArr = null;
        int i2 = 0;
        while (true) {
            InterfaceC1954C[] interfaceC1954CArr2 = this.f4473a;
            if (i2 >= interfaceC1954CArr2.length) {
                break;
            }
            if (interfaceC1954CArr2[i2].mo4723a()) {
                InterfaceC1954C[] interfaceC1954CArr3 = this.f4473a;
                if (!(interfaceC1954CArr3[i2] instanceof C1959H)) {
                    if (interfaceC1954CArr == null) {
                        interfaceC1954CArr = (InterfaceC1954C[]) interfaceC1954CArr3.clone();
                    }
                    interfaceC1954CArr[i2] = new C1959H(i, this.f4473a[i2]);
                }
            }
            i2++;
        }
        return interfaceC1954CArr == null ? this : new C1955D(interfaceC1954CArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1955D)) {
            return false;
        }
        C1955D c1955d = (C1955D) obj;
        return this.f4474b == c1955d.f4474b && Arrays.equals(this.f4473a, c1955d.f4473a);
    }

    public final int hashCode() {
        return this.f4474b;
    }
}
