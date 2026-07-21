package com.github.catvod.spider.support.p044FM.p059O;

import com.github.catvod.spider.support.p044FM.p062R.AbstractC1609l;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p059O.m */
/* JADX INFO: loaded from: classes.dex */
public final class C1585m extends AbstractC1574b {

    /* JADX INFO: renamed from: a */
    private int f3626a;

    /* JADX INFO: renamed from: b */
    private AbstractC1609l f3627b;

    /* JADX INFO: renamed from: c */
    private boolean f3628c;

    /* JADX INFO: renamed from: d */
    private short f3629d;

    /* JADX INFO: renamed from: e */
    private int f3630e;

    /* JADX INFO: renamed from: f */
    private int[] f3631f;

    /* JADX INFO: renamed from: g */
    private int f3632g;

    /* JADX INFO: renamed from: h */
    private int f3633h;

    /* JADX INFO: renamed from: i */
    private AbstractC1574b f3634i;

    public C1585m(AbstractC1609l abstractC1609l) {
        this.f3627b = abstractC1609l;
        this.f3628c = false;
        this.f3634i = null;
        this.f3631f = new int[4];
        mo3800h();
    }

    public C1585m(AbstractC1609l abstractC1609l, boolean z, AbstractC1574b abstractC1574b) {
        this.f3627b = abstractC1609l;
        this.f3628c = z;
        this.f3634i = abstractC1574b;
        this.f3631f = new int[4];
        mo3800h();
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: c */
    public final String mo3796c() {
        AbstractC1574b abstractC1574b = this.f3634i;
        return abstractC1574b == null ? this.f3627b.m3816a() : abstractC1574b.mo3796c();
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: d */
    public final float mo3797d() {
        int i = this.f3630e;
        if (i <= 0) {
            return 0.01f;
        }
        float fM3819d = ((((this.f3631f[3] * 1.0f) / i) / this.f3627b.m3819d()) * this.f3633h) / this.f3632g;
        if (fM3819d >= 1.0f) {
            return 0.99f;
        }
        return fM3819d;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: e */
    public final int mo3798e() {
        return this.f3626a;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: f */
    public final int mo3799f(byte[] bArr, int i) {
        int i2;
        int i3 = i + 0;
        for (int i4 = 0; i4 < i3; i4++) {
            short sM3817b = this.f3627b.m3817b(bArr[i4]);
            if (sM3817b < 250) {
                this.f3632g++;
            }
            if (sM3817b < 64) {
                this.f3633h++;
                short s = this.f3629d;
                if (s < 64) {
                    this.f3630e++;
                    if (this.f3628c) {
                        int[] iArr = this.f3631f;
                        byte bM3818c = this.f3627b.m3818c((sM3817b * 64) + s);
                        iArr[bM3818c] = iArr[bM3818c] + 1;
                    } else {
                        int[] iArr2 = this.f3631f;
                        byte bM3818c2 = this.f3627b.m3818c((s * 64) + sM3817b);
                        iArr2[bM3818c2] = iArr2[bM3818c2] + 1;
                    }
                }
            }
            this.f3629d = sM3817b;
        }
        if (this.f3626a == 1 && this.f3630e > 1024) {
            float fMo3797d = mo3797d();
            if (fMo3797d <= 0.95f) {
                i2 = fMo3797d < 0.05f ? 3 : 2;
            }
            this.f3626a = i2;
        }
        return this.f3626a;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: h */
    public final void mo3800h() {
        this.f3626a = 1;
        this.f3629d = (short) 255;
        for (int i = 0; i < 4; i++) {
            this.f3631f[i] = 0;
        }
        this.f3630e = 0;
        this.f3632g = 0;
        this.f3633h = 0;
    }
}
