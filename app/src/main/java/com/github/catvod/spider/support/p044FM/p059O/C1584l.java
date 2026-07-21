package com.github.catvod.spider.support.p044FM.p059O;

import com.github.catvod.spider.support.p044FM.p058N.C1571a;
import com.github.catvod.spider.support.p044FM.p060P.C1589c;
import com.github.catvod.spider.support.p044FM.p061Q.C1597h;
import com.github.catvod.spider.support.p044FM.p063S.C1614b;
import com.github.catvod.spider.support.p044FM.p063S.C1624l;
import java.util.Arrays;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p059O.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1584l extends AbstractC1574b {

    /* JADX INFO: renamed from: f */
    private static final C1624l f3620f = new C1624l();

    /* JADX INFO: renamed from: b */
    private int f3622b;

    /* JADX INFO: renamed from: a */
    private C1614b f3621a = new C1614b(f3620f);

    /* JADX INFO: renamed from: c */
    private C1589c f3623c = new C1589c();

    /* JADX INFO: renamed from: d */
    private C1597h f3624d = new C1597h();

    /* JADX INFO: renamed from: e */
    private byte[] f3625e = new byte[2];

    public C1584l() {
        mo3800h();
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: c */
    public final String mo3796c() {
        return C1571a.f3531l;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: d */
    public final float mo3797d() {
        return Math.max(this.f3623c.m3807a(), this.f3624d.m3812a());
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: e */
    public final int mo3798e() {
        return this.f3622b;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: f */
    public final int mo3799f(byte[] bArr, int i) {
        int i2 = i + 0;
        for (int i3 = 0; i3 < i2; i3++) {
            int iM3822c = this.f3621a.m3822c(bArr[i3]);
            if (iM3822c == 1) {
                this.f3622b = 3;
                break;
            }
            if (iM3822c == 2) {
                this.f3622b = 2;
                break;
            }
            if (iM3822c == 0) {
                int iM3821b = this.f3621a.m3821b();
                if (i3 == 0) {
                    byte[] bArr2 = this.f3625e;
                    bArr2[1] = bArr[0];
                    this.f3623c.m3809d(bArr2, 2 - iM3821b, iM3821b);
                    this.f3624d.m3814d(this.f3625e, 0, iM3821b);
                } else {
                    this.f3623c.m3809d(bArr, (i3 + 1) - iM3821b, iM3821b);
                    this.f3624d.m3814d(bArr, i3 - 1, iM3821b);
                }
            }
        }
        this.f3625e[0] = bArr[i2 - 1];
        if (this.f3622b == 1 && this.f3623c.m3808c() && mo3797d() > 0.95f) {
            this.f3622b = 2;
        }
        return this.f3622b;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: h */
    public final void mo3800h() {
        this.f3621a.m3823d();
        this.f3622b = 1;
        this.f3623c.m3810e();
        this.f3624d.m3815e();
        Arrays.fill(this.f3625e, (byte) 0);
    }
}
