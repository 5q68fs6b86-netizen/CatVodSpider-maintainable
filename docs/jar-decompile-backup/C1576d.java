package com.github.catvod.spider.support.p044FM.p059O;

import com.github.catvod.spider.support.p044FM.p058N.C1571a;
import com.github.catvod.spider.support.p044FM.p061Q.C1593d;
import com.github.catvod.spider.support.p044FM.p063S.C1614b;
import com.github.catvod.spider.support.p044FM.p063S.C1616d;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p059O.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1576d extends AbstractC1574b {

    /* JADX INFO: renamed from: e */
    private static final C1616d f3565e = new C1616d();

    /* JADX INFO: renamed from: b */
    private int f3567b;

    /* JADX INFO: renamed from: a */
    private C1614b f3566a = new C1614b(f3565e);

    /* JADX INFO: renamed from: c */
    private C1593d f3568c = new C1593d();

    /* JADX INFO: renamed from: d */
    private byte[] f3569d = new byte[2];

    public C1576d() {
        mo3800h();
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: c */
    public final String mo3796c() {
        return C1571a.f3529j;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: d */
    public final float mo3797d() {
        return this.f3568c.m3812a();
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: e */
    public final int mo3798e() {
        return this.f3567b;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: f */
    public final int mo3799f(byte[] bArr, int i) {
        int i2 = i + 0;
        for (int i3 = 0; i3 < i2; i3++) {
            int iM3822c = this.f3566a.m3822c(bArr[i3]);
            if (iM3822c == 1) {
                this.f3567b = 3;
                break;
            }
            if (iM3822c == 2) {
                this.f3567b = 2;
                break;
            }
            if (iM3822c == 0) {
                int iM3821b = this.f3566a.m3821b();
                if (i3 == 0) {
                    byte[] bArr2 = this.f3569d;
                    bArr2[1] = bArr[0];
                    this.f3568c.m3814d(bArr2, 0, iM3821b);
                } else {
                    this.f3568c.m3814d(bArr, i3 - 1, iM3821b);
                }
            }
        }
        this.f3569d[0] = bArr[i2 - 1];
        if (this.f3567b == 1 && this.f3568c.m3813c() && mo3797d() > 0.95f) {
            this.f3567b = 2;
        }
        return this.f3567b;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: h */
    public final void mo3800h() {
        this.f3566a.m3823d();
        this.f3567b = 1;
        this.f3568c.m3815e();
        Arrays.fill(this.f3569d, (byte) 0);
    }
}
