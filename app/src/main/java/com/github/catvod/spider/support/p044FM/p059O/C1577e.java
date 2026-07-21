package com.github.catvod.spider.support.p044FM.p059O;

import com.github.catvod.spider.support.p044FM.p058N.C1571a;
import com.github.catvod.spider.support.p044FM.p061Q.C1594e;
import com.github.catvod.spider.support.p044FM.p063S.C1614b;
import com.github.catvod.spider.support.p044FM.p063S.C1617e;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.O.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1577e extends AbstractC1574b {

    /* JADX INFO: renamed from: e */
    private static final C1617e f3570e = new C1617e();

    /* JADX INFO: renamed from: b */
    private int f3572b;

    /* JADX INFO: renamed from: a */
    private C1614b f3571a = new C1614b(f3570e);

    /* JADX INFO: renamed from: c */
    private C1594e f3573c = new C1594e();

    /* JADX INFO: renamed from: d */
    private byte[] f3574d = new byte[2];

    public C1577e() {
        mo3800h();
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: c */
    public final String mo3796c() {
        return C1571a.f3530k;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: d */
    public final float mo3797d() {
        return this.f3573c.m3812a();
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: e */
    public final int mo3798e() {
        return this.f3572b;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: f */
    public final int mo3799f(byte[] bArr, int i) {
        int i2 = i + 0;
        for (int i3 = 0; i3 < i2; i3++) {
            int iM3822c = this.f3571a.m3822c(bArr[i3]);
            if (iM3822c == 1) {
                this.f3572b = 3;
                break;
            }
            if (iM3822c == 2) {
                this.f3572b = 2;
                break;
            }
            if (iM3822c == 0) {
                int iM3821b = this.f3571a.m3821b();
                if (i3 == 0) {
                    byte[] bArr2 = this.f3574d;
                    bArr2[1] = bArr[0];
                    this.f3573c.m3814d(bArr2, 0, iM3821b);
                } else {
                    this.f3573c.m3814d(bArr, i3 - 1, iM3821b);
                }
            }
        }
        this.f3574d[0] = bArr[i2 - 1];
        if (this.f3572b == 1 && this.f3573c.m3813c() && mo3797d() > 0.95f) {
            this.f3572b = 2;
        }
        return this.f3572b;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: h */
    public final void mo3800h() {
        this.f3571a.m3823d();
        this.f3572b = 1;
        this.f3573c.m3815e();
        Arrays.fill(this.f3574d, (byte) 0);
    }
}
