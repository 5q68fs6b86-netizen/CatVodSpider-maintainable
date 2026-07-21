package com.github.catvod.spider.support.p012C0.p015Q;

import com.github.catvod.spider.support.p012C0.p015Q.C;
import com.github.catvod.spider.support.p012C0.p015Q.H;
import com.github.catvod.spider.support.p012C0.p013N.C0966a;
import com.github.catvod.spider.support.p012C0.p014P.AbstractC0979s;
import com.github.catvod.spider.support.p012C0.p014P.InterfaceC0972d;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p012C0.p015Q.D */
/* JADX INFO: loaded from: classes.dex */
public final class C0987D {

    /* JADX INFO: renamed from: a */
    private final C[] f2405a;

    /* JADX INFO: renamed from: b */
    private final int f2406b;

    public C0987D(C[] cArr) {
        this.f2405a = cArr;
        int length = cArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int iM2380p = C0966a.m2380p(i2, cArr[i]);
            i++;
            i2 = iM2380p;
        }
        this.f2406b = C0966a.m2368b(i2, cArr.length);
    }

    /* JADX INFO: renamed from: a */
    public static C0987D m2473a(C0987D c0987d, C c) {
        if (c0987d == null) {
            return new C0987D(new C[]{c});
        }
        C[] cArr = c0987d.f2405a;
        C[] cArr2 = (C[]) Arrays.copyOf(cArr, cArr.length + 1);
        cArr2[cArr2.length - 1] = c;
        return new C0987D(cArr2);
    }

    /* JADX INFO: renamed from: b */
    public final void m2474b(AbstractC0979s abstractC0979s, InterfaceC0972d interfaceC0972d, int i) throws Throwable {
        boolean z;
        Throwable th;
        boolean z2;
        int iMo2422i = interfaceC0972d.mo2422i();
        try {
            C[] cArr = this.f2405a;
            int length = cArr.length;
            int i2 = 0;
            z = false;
            while (i2 < length) {
                C c = cArr[i2];
                try {
                    if (c instanceof H) {
                        int iD = ((H) c).d() + i;
                        interfaceC0972d.mo2420d(iD);
                        c = ((H) c).c();
                        z2 = iD != iMo2422i;
                    } else if (c.b()) {
                        interfaceC0972d.mo2420d(iMo2422i);
                    } else {
                        z2 = z;
                    }
                    try {
                        c.a(abstractC0979s);
                        i2++;
                        z = z2;
                    } catch (Throwable th2) {
                        th = th2;
                        z = z2;
                        if (!z) {
                            throw th;
                        }
                        interfaceC0972d.mo2420d(iMo2422i);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (z) {
                interfaceC0972d.mo2420d(iMo2422i);
            }
        } catch (Throwable th4) {
            z = false;
            th = th4;
        }
    }

    /* JADX INFO: renamed from: c */
    public final C0987D m2475c(int i) {
        C[] cArr = null;
        int i2 = 0;
        while (true) {
            C[] cArr2 = this.f2405a;
            if (i2 >= cArr2.length) {
                break;
            }
            if (cArr2[i2].b()) {
                C[] cArr3 = this.f2405a;
                if (!(cArr3[i2] instanceof H)) {
                    if (cArr == null) {
                        cArr = (C[]) cArr3.clone();
                    }
                    cArr[i2] = new H(i, this.f2405a[i2]);
                }
            }
            i2++;
        }
        return cArr == null ? this : new C0987D(cArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0987D)) {
            return false;
        }
        C0987D c0987d = (C0987D) obj;
        return this.f2406b == c0987d.f2406b && Arrays.equals(this.f2405a, c0987d.f2405a);
    }

    public final int hashCode() {
        return this.f2406b;
    }
}
