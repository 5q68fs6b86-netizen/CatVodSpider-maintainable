package com.github.catvod.spider.support.p044FM.p059O;

import com.github.catvod.spider.support.p044FM.p058N.C1571a;
import com.github.catvod.spider.support.p044FM.p060P.C1587a;
import com.github.catvod.spider.support.p044FM.p061Q.C1592c;
import com.github.catvod.spider.support.p044FM.p063S.C1614b;
import com.github.catvod.spider.support.p044FM.p063S.C1615c;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.O.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1575c extends AbstractC1574b {

    /* JADX INFO: renamed from: f */
    private static final C1615c f3559f = new C1615c();

    /* JADX INFO: renamed from: b */
    private int f3561b;

    /* JADX INFO: renamed from: a */
    private C1614b f3560a = new C1614b(f3559f);

    /* JADX INFO: renamed from: c */
    private C1587a f3562c = new C1587a();

    /* JADX INFO: renamed from: d */
    private C1592c f3563d = new C1592c();

    /* JADX INFO: renamed from: e */
    private byte[] f3564e = new byte[2];

    public C1575c() {
        mo3800h();
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: c */
    public final String mo3796c() {
        return C1571a.f3528i;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: d */
    public final float mo3797d() {
        return Math.max(this.f3562c.m3807a(), this.f3563d.m3812a());
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: e */
    public final int mo3798e() {
        return this.f3561b;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: f */
    public final int mo3799f(byte[] bArr, int i) {
        int i2 = i + 0;
        for (int i3 = 0; i3 < i2; i3++) {
            int iM3822c = this.f3560a.m3822c(bArr[i3]);
            if (iM3822c == 1) {
                this.f3561b = 3;
                break;
            }
            if (iM3822c == 2) {
                this.f3561b = 2;
                break;
            }
            if (iM3822c == 0) {
                int iM3821b = this.f3560a.m3821b();
                if (i3 == 0) {
                    byte[] bArr2 = this.f3564e;
                    bArr2[1] = bArr[0];
                    this.f3562c.m3809d(bArr2, 0, iM3821b);
                    this.f3563d.m3814d(this.f3564e, 0, iM3821b);
                } else {
                    int i4 = i3 - 1;
                    this.f3562c.m3809d(bArr, i4, iM3821b);
                    this.f3563d.m3814d(bArr, i4, iM3821b);
                }
            }
        }
        this.f3564e[0] = bArr[i2 - 1];
        if (this.f3561b == 1 && this.f3562c.m3808c() && mo3797d() > 0.95f) {
            this.f3561b = 2;
        }
        return this.f3561b;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: h */
    public final void mo3800h() {
        this.f3560a.m3823d();
        this.f3561b = 1;
        this.f3562c.m3810e();
        this.f3563d.m3815e();
        Arrays.fill(this.f3564e, (byte) 0);
    }
}
