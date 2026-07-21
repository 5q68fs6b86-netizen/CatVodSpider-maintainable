package com.github.catvod.spider.support.p044FM.p059O;

import com.github.catvod.spider.support.p044FM.p062R.C1601d;
import com.github.catvod.spider.support.p044FM.p062R.C1602e;
import com.github.catvod.spider.support.p044FM.p062R.C1603f;
import com.github.catvod.spider.support.p044FM.p062R.C1604g;
import com.github.catvod.spider.support.p044FM.p062R.C1605h;
import com.github.catvod.spider.support.p044FM.p062R.C1606i;
import com.github.catvod.spider.support.p044FM.p062R.C1607j;
import com.github.catvod.spider.support.p044FM.p062R.C1608k;
import com.github.catvod.spider.support.p044FM.p062R.C1610m;
import com.github.catvod.spider.support.p044FM.p062R.C1611n;
import com.github.catvod.spider.support.p044FM.p062R.C1612o;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p059O.k */
/* JADX INFO: loaded from: classes.dex */
public final class C1583k extends AbstractC1574b {

    /* JADX INFO: renamed from: f */
    private static final C1611n f3604f = new C1611n();

    /* JADX INFO: renamed from: g */
    private static final C1604g f3605g = new C1604g();

    /* JADX INFO: renamed from: h */
    private static final C1606i f3606h = new C1606i();

    /* JADX INFO: renamed from: i */
    private static final C1608k f3607i = new C1608k();

    /* JADX INFO: renamed from: j */
    private static final C1603f f3608j = new C1603f();

    /* JADX INFO: renamed from: k */
    private static final C1602e f3609k = new C1602e();

    /* JADX INFO: renamed from: l */
    private static final C1607j f3610l = new C1607j();

    /* JADX INFO: renamed from: m */
    private static final C1612o f3611m = new C1612o();

    /* JADX INFO: renamed from: n */
    private static final C1605h f3612n = new C1605h();

    /* JADX INFO: renamed from: o */
    private static final C1610m f3613o = new C1610m();

    /* JADX INFO: renamed from: p */
    private static final C1601d f3614p = new C1601d();

    /* JADX INFO: renamed from: a */
    private int f3615a;

    /* JADX INFO: renamed from: b */
    private AbstractC1574b[] f3616b;

    /* JADX INFO: renamed from: c */
    private boolean[] f3617c = new boolean[13];

    /* JADX INFO: renamed from: d */
    private int f3618d;

    /* JADX INFO: renamed from: e */
    private int f3619e;

    public C1583k() {
        AbstractC1574b[] abstractC1574bArr = new AbstractC1574b[13];
        this.f3616b = abstractC1574bArr;
        abstractC1574bArr[0] = new C1585m(f3604f);
        this.f3616b[1] = new C1585m(f3605g);
        this.f3616b[2] = new C1585m(f3606h);
        this.f3616b[3] = new C1585m(f3607i);
        this.f3616b[4] = new C1585m(f3608j);
        this.f3616b[5] = new C1585m(f3609k);
        this.f3616b[6] = new C1585m(f3610l);
        this.f3616b[7] = new C1585m(f3611m);
        this.f3616b[8] = new C1585m(f3612n);
        this.f3616b[9] = new C1585m(f3613o);
        C1580h c1580h = new C1580h();
        AbstractC1574b[] abstractC1574bArr2 = this.f3616b;
        abstractC1574bArr2[10] = c1580h;
        C1601d c1601d = f3614p;
        abstractC1574bArr2[11] = new C1585m(c1601d, false, c1580h);
        this.f3616b[12] = new C1585m(c1601d, true, c1580h);
        AbstractC1574b[] abstractC1574bArr3 = this.f3616b;
        c1580h.m3805j(abstractC1574bArr3[11], abstractC1574bArr3[12]);
        mo3800h();
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: c */
    public final String mo3796c() {
        if (this.f3618d == -1) {
            mo3797d();
            if (this.f3618d == -1) {
                this.f3618d = 0;
            }
        }
        return this.f3616b[this.f3618d].mo3796c();
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: d */
    public final float mo3797d() {
        int i = this.f3615a;
        if (i == 2) {
            return 0.99f;
        }
        if (i == 3) {
            return 0.01f;
        }
        int i2 = 0;
        float f = 0.0f;
        while (true) {
            AbstractC1574b[] abstractC1574bArr = this.f3616b;
            if (i2 >= abstractC1574bArr.length) {
                return f;
            }
            if (this.f3617c[i2]) {
                float fMo3797d = abstractC1574bArr[i2].mo3797d();
                if (f < fMo3797d) {
                    this.f3618d = i2;
                    f = fMo3797d;
                }
            }
            i2++;
        }
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: e */
    public final int mo3798e() {
        return this.f3615a;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: f */
    public final int mo3799f(byte[] bArr, int i) {
        ByteBuffer byteBufferM3803b = m3803b(bArr, i);
        if (byteBufferM3803b.position() != 0) {
            int i2 = 0;
            while (true) {
                AbstractC1574b[] abstractC1574bArr = this.f3616b;
                if (i2 >= abstractC1574bArr.length) {
                    break;
                }
                if (this.f3617c[i2]) {
                    int iMo3799f = abstractC1574bArr[i2].mo3799f(byteBufferM3803b.array(), byteBufferM3803b.position());
                    int i3 = 2;
                    if (iMo3799f == 2) {
                        this.f3618d = i2;
                    } else {
                        i3 = 3;
                        if (iMo3799f == 3) {
                            this.f3617c[i2] = false;
                            int i4 = this.f3619e - 1;
                            this.f3619e = i4;
                            if (i4 <= 0) {
                            }
                        } else {
                            continue;
                        }
                    }
                    this.f3615a = i3;
                    break;
                }
                i2++;
            }
        }
        return this.f3615a;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: h */
    public final void mo3800h() {
        int i = 0;
        this.f3619e = 0;
        while (true) {
            AbstractC1574b[] abstractC1574bArr = this.f3616b;
            if (i >= abstractC1574bArr.length) {
                this.f3618d = -1;
                this.f3615a = 1;
                return;
            } else {
                abstractC1574bArr[i].mo3800h();
                this.f3617c[i] = true;
                this.f3619e++;
                i++;
            }
        }
    }
}
