package com.github.catvod.spider.support.p044FM.p059O;

import com.github.catvod.spider.support.p044FM.p058N.C1571a;
import com.github.catvod.spider.support.p044FM.p061Q.C1590a;
import com.github.catvod.spider.support.p044FM.p063S.C1613a;
import com.github.catvod.spider.support.p044FM.p063S.C1614b;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.O.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1573a extends AbstractC1574b {

    /* JADX INFO: renamed from: e */
    private static final C1613a f3554e = new C1613a();

    /* JADX INFO: renamed from: b */
    private int f3556b;

    /* JADX INFO: renamed from: a */
    private C1614b f3555a = new C1614b(f3554e);

    /* JADX INFO: renamed from: c */
    private C1590a f3557c = new C1590a();

    /* JADX INFO: renamed from: d */
    private byte[] f3558d = new byte[2];

    public C1573a() {
        mo3800h();
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: c */
    public final String mo3796c() {
        return C1571a.f3526g;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: d */
    public final float mo3797d() {
        return this.f3557c.m3812a();
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: e */
    public final int mo3798e() {
        return this.f3556b;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: f */
    public final int mo3799f(byte[] bArr, int i) {
        int i2 = i + 0;
        for (int i3 = 0; i3 < i2; i3++) {
            int iM3822c = this.f3555a.m3822c(bArr[i3]);
            if (iM3822c == 1) {
                this.f3556b = 3;
                break;
            }
            if (iM3822c == 2) {
                this.f3556b = 2;
                break;
            }
            if (iM3822c == 0) {
                int iM3821b = this.f3555a.m3821b();
                if (i3 == 0) {
                    byte[] bArr2 = this.f3558d;
                    bArr2[1] = bArr[0];
                    this.f3557c.m3814d(bArr2, 0, iM3821b);
                } else {
                    this.f3557c.m3814d(bArr, i3 - 1, iM3821b);
                }
            }
        }
        this.f3558d[0] = bArr[i2 - 1];
        if (this.f3556b == 1 && this.f3557c.m3813c() && mo3797d() > 0.95f) {
            this.f3556b = 2;
        }
        return this.f3556b;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: h */
    public final void mo3800h() {
        this.f3555a.m3823d();
        this.f3556b = 1;
        this.f3557c.m3815e();
        Arrays.fill(this.f3558d, (byte) 0);
    }
}
