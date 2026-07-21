package com.github.catvod.spider.support.p044FM.p061Q;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.Q.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1591b {

    /* JADX INFO: renamed from: a */
    private int f3645a;

    /* JADX INFO: renamed from: b */
    private int f3646b;

    /* JADX INFO: renamed from: c */
    protected int[] f3647c;

    /* JADX INFO: renamed from: d */
    protected float f3648d;

    public AbstractC1591b() {
        m3815e();
    }

    /* JADX INFO: renamed from: a */
    public final float m3812a() {
        int i;
        int i2 = this.f3646b;
        if (i2 <= 0 || (i = this.f3645a) <= 4) {
            return 0.01f;
        }
        if (i2 != i) {
            float f = (i / (i2 - i)) * this.f3648d;
            if (f < 0.99f) {
                return f;
            }
        }
        return 0.99f;
    }

    /* JADX INFO: renamed from: b */
    protected abstract int mo3811b(byte[] bArr, int i);

    /* JADX INFO: renamed from: c */
    public final boolean m3813c() {
        return this.f3646b > 1024;
    }

    /* JADX INFO: renamed from: d */
    public final void m3814d(byte[] bArr, int i, int i2) {
        int iMo3811b = i2 == 2 ? mo3811b(bArr, i) : -1;
        if (iMo3811b >= 0) {
            this.f3646b++;
            int[] iArr = this.f3647c;
            if (iMo3811b >= iArr.length || 512 <= iArr[iMo3811b]) {
                return;
            }
            this.f3645a++;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m3815e() {
        this.f3646b = 0;
        this.f3645a = 0;
    }
}
