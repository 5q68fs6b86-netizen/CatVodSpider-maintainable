package com.github.catvod.spider.support.p044FM.p059O;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.O.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1582j extends AbstractC1574b {

    /* JADX INFO: renamed from: a */
    private int f3599a;

    /* JADX INFO: renamed from: b */
    private AbstractC1574b[] f3600b;

    /* JADX INFO: renamed from: c */
    private boolean[] f3601c = new boolean[7];

    /* JADX INFO: renamed from: d */
    private int f3602d;

    /* JADX INFO: renamed from: e */
    private int f3603e;

    public C1582j() {
        AbstractC1574b[] abstractC1574bArr = new AbstractC1574b[7];
        this.f3600b = abstractC1574bArr;
        abstractC1574bArr[0] = new C1586n();
        this.f3600b[1] = new C1584l();
        this.f3600b[2] = new C1575c();
        this.f3600b[3] = new C1579g();
        this.f3600b[4] = new C1576d();
        this.f3600b[5] = new C1573a();
        this.f3600b[6] = new C1577e();
        mo3800h();
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: c */
    public final String mo3796c() {
        if (this.f3602d == -1) {
            mo3797d();
            if (this.f3602d == -1) {
                this.f3602d = 0;
            }
        }
        return this.f3600b[this.f3602d].mo3796c();
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: d */
    public final float mo3797d() {
        int i = this.f3599a;
        if (i == 2) {
            return 0.99f;
        }
        if (i == 3) {
            return 0.01f;
        }
        int i2 = 0;
        float f = 0.0f;
        while (true) {
            AbstractC1574b[] abstractC1574bArr = this.f3600b;
            if (i2 >= abstractC1574bArr.length) {
                return f;
            }
            if (this.f3601c[i2]) {
                float fMo3797d = abstractC1574bArr[i2].mo3797d();
                if (f < fMo3797d) {
                    this.f3602d = i2;
                    f = fMo3797d;
                }
            }
            i2++;
        }
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: e */
    public final int mo3798e() {
        return this.f3599a;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: f */
    public final int mo3799f(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        int i2 = i + 0;
        boolean z = true;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            if ((bArr[i4] & 128) != 0) {
                bArr2[i3] = bArr[i4];
                i3++;
                z = true;
            } else if (z) {
                bArr2[i3] = bArr[i4];
                i3++;
                z = false;
            }
        }
        int i5 = 0;
        while (true) {
            AbstractC1574b[] abstractC1574bArr = this.f3600b;
            if (i5 >= abstractC1574bArr.length) {
                break;
            }
            if (this.f3601c[i5]) {
                int iMo3799f = abstractC1574bArr[i5].mo3799f(bArr2, i3);
                int i6 = 2;
                if (iMo3799f == 2) {
                    this.f3602d = i5;
                } else {
                    i6 = 3;
                    if (iMo3799f == 3) {
                        this.f3601c[i5] = false;
                        int i7 = this.f3603e - 1;
                        this.f3603e = i7;
                        if (i7 <= 0) {
                        }
                    } else {
                        continue;
                    }
                }
                this.f3599a = i6;
                break;
            }
            i5++;
        }
        return this.f3599a;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: h */
    public final void mo3800h() {
        int i = 0;
        this.f3603e = 0;
        while (true) {
            AbstractC1574b[] abstractC1574bArr = this.f3600b;
            if (i >= abstractC1574bArr.length) {
                this.f3602d = -1;
                this.f3599a = 1;
                return;
            } else {
                abstractC1574bArr[i].mo3800h();
                this.f3601c[i] = true;
                this.f3603e++;
                i++;
            }
        }
    }
}
