package com.github.catvod.spider.support.p044FM.p059O;

import com.github.catvod.spider.support.p044FM.p058N.C1571a;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.O.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1581i extends AbstractC1574b {

    /* JADX INFO: renamed from: d */
    private static final byte[] f3594d = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 1, 1, 1, 1, 1, 1, 0, 1, 7, 1, 1, 1, 1, 1, 1, 5, 1, 5, 0, 5, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 7, 1, 7, 0, 7, 5, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 4, 4, 4, 4, 4, 1, 4, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 6, 6, 6, 6, 6, 1, 6, 6, 6, 6, 6, 7, 7, 7};

    /* JADX INFO: renamed from: e */
    private static final byte[] f3595e = {0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 1, 1, 3, 3, 0, 3, 3, 3, 1, 2, 1, 2, 0, 3, 3, 3, 3, 3, 3, 3, 0, 3, 1, 3, 1, 1, 1, 3, 0, 3, 1, 3, 1, 1, 3, 3};

    /* JADX INFO: renamed from: a */
    private int f3596a;

    /* JADX INFO: renamed from: b */
    private byte f3597b;

    /* JADX INFO: renamed from: c */
    private int[] f3598c = new int[4];

    public C1581i() {
        mo3800h();
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: c */
    public final String mo3796c() {
        return C1571a.f3537r;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: d */
    public final float mo3797d() {
        int[] iArr;
        float f;
        if (this.f3596a == 3) {
            return 0.01f;
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            iArr = this.f3598c;
            if (i >= iArr.length) {
                break;
            }
            i2 += iArr[i];
            i++;
        }
        if (i2 <= 0) {
            f = 0.0f;
        } else {
            float f2 = i2;
            f = ((iArr[3] * 1.0f) / f2) - ((iArr[1] * 20.0f) / f2);
        }
        return (f >= 0.0f ? f : 0.0f) * 0.5f;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: e */
    public final int mo3798e() {
        return this.f3596a;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: f */
    public final int mo3799f(byte[] bArr, int i) {
        ByteBuffer byteBufferM3802a = m3802a(bArr, i);
        byte[] bArrArray = byteBufferM3802a.array();
        int iPosition = byteBufferM3802a.position();
        for (int i2 = 0; i2 < iPosition; i2++) {
            byte b = f3594d[bArrArray[i2] & 255];
            byte b2 = f3595e[(this.f3597b * 8) + b];
            if (b2 == 0) {
                this.f3596a = 3;
                break;
            }
            int[] iArr = this.f3598c;
            iArr[b2] = iArr[b2] + 1;
            this.f3597b = b;
        }
        return this.f3596a;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: h */
    public final void mo3800h() {
        this.f3596a = 1;
        this.f3597b = (byte) 1;
        int i = 0;
        while (true) {
            int[] iArr = this.f3598c;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = 0;
            i++;
        }
    }
}
