package com.github.catvod.spider.support.p044FM.p059O;

import com.github.catvod.spider.support.p044FM.p063S.C1614b;
import com.github.catvod.spider.support.p044FM.p063S.C1619g;
import com.github.catvod.spider.support.p044FM.p063S.C1620h;
import com.github.catvod.spider.support.p044FM.p063S.C1621i;
import com.github.catvod.spider.support.p044FM.p063S.C1622j;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p059O.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1578f extends AbstractC1574b {

    /* JADX INFO: renamed from: e */
    private static final C1619g f3575e = new C1619g();

    /* JADX INFO: renamed from: f */
    private static final C1620h f3576f = new C1620h();

    /* JADX INFO: renamed from: g */
    private static final C1621i f3577g = new C1621i();

    /* JADX INFO: renamed from: h */
    private static final C1622j f3578h = new C1622j();

    /* JADX INFO: renamed from: a */
    private C1614b[] f3579a = {new C1614b(f3575e), new C1614b(f3576f), new C1614b(f3577g), new C1614b(f3578h)};

    /* JADX INFO: renamed from: b */
    private int f3580b;

    /* JADX INFO: renamed from: c */
    private int f3581c;

    /* JADX INFO: renamed from: d */
    private String f3582d;

    public C1578f() {
        mo3800h();
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: c */
    public final String mo3796c() {
        return this.f3582d;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: d */
    public final float mo3797d() {
        return 0.99f;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: e */
    public final int mo3798e() {
        return this.f3581c;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: f */
    public final int mo3799f(byte[] bArr, int i) {
        int i2 = i + 0;
        for (int i3 = 0; i3 < i2 && this.f3581c == 1; i3++) {
            for (int i4 = this.f3580b - 1; i4 >= 0; i4--) {
                int iM3822c = this.f3579a[i4].m3822c(bArr[i3]);
                if (iM3822c == 1) {
                    int i5 = this.f3580b - 1;
                    this.f3580b = i5;
                    if (i5 <= 0) {
                        this.f3581c = 3;
                        return 3;
                    }
                    if (i4 != i5) {
                        C1614b[] c1614bArr = this.f3579a;
                        C1614b c1614b = c1614bArr[i5];
                        c1614bArr[i5] = c1614bArr[i4];
                        c1614bArr[i4] = c1614b;
                    }
                } else if (iM3822c == 2) {
                    this.f3581c = 2;
                    this.f3582d = this.f3579a[i4].m3820a();
                    return this.f3581c;
                }
            }
        }
        return this.f3581c;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: h */
    public final void mo3800h() {
        this.f3581c = 1;
        int i = 0;
        while (true) {
            C1614b[] c1614bArr = this.f3579a;
            if (i >= c1614bArr.length) {
                this.f3580b = c1614bArr.length;
                this.f3582d = null;
                return;
            } else {
                c1614bArr[i].m3823d();
                i++;
            }
        }
    }
}
