package com.github.catvod.spider.support.p044FM.p059O;

import com.github.catvod.spider.support.p044FM.p058N.C1571a;
import com.github.catvod.spider.support.p044FM.p063S.C1614b;
import com.github.catvod.spider.support.p044FM.p063S.C1626n;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p059O.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1586n extends AbstractC1574b {

    /* JADX INFO: renamed from: d */
    private static final C1626n f3635d = new C1626n();

    /* JADX INFO: renamed from: b */
    private int f3637b;

    /* JADX INFO: renamed from: c */
    private int f3638c = 0;

    /* JADX INFO: renamed from: a */
    private C1614b f3636a = new C1614b(f3635d);

    public C1586n() {
        mo3800h();
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: c */
    public final String mo3796c() {
        return C1571a.f3540u;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: d */
    public final float mo3797d() {
        float f = 0.99f;
        if (this.f3638c >= 6) {
            return 0.99f;
        }
        for (int i = 0; i < this.f3638c; i++) {
            f *= 0.5f;
        }
        return 1.0f - f;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: e */
    public final int mo3798e() {
        return this.f3637b;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: f */
    public final int mo3799f(byte[] bArr, int i) {
        int i2 = i + 0;
        for (int i3 = 0; i3 < i2; i3++) {
            int iM3822c = this.f3636a.m3822c(bArr[i3]);
            if (iM3822c == 1) {
                this.f3637b = 3;
                break;
            }
            if (iM3822c == 2) {
                this.f3637b = 2;
                break;
            }
            if (iM3822c == 0 && this.f3636a.m3821b() >= 2) {
                this.f3638c++;
            }
        }
        if (this.f3637b == 1 && mo3797d() > 0.95f) {
            this.f3637b = 2;
        }
        return this.f3637b;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: h */
    public final void mo3800h() {
        this.f3636a.m3823d();
        this.f3638c = 0;
        this.f3637b = 1;
    }
}
