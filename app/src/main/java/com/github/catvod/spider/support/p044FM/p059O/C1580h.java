package com.github.catvod.spider.support.p044FM.p059O;

import com.github.catvod.spider.support.p044FM.p058N.C1571a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p059O.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1580h extends AbstractC1574b {

    /* JADX INFO: renamed from: a */
    private int f3588a;

    /* JADX INFO: renamed from: b */
    private int f3589b;

    /* JADX INFO: renamed from: c */
    private byte f3590c;

    /* JADX INFO: renamed from: d */
    private byte f3591d;

    /* JADX INFO: renamed from: e */
    private AbstractC1574b f3592e = null;

    /* JADX INFO: renamed from: f */
    private AbstractC1574b f3593f = null;

    public C1580h() {
        mo3800h();
    }

    /* JADX INFO: renamed from: i */
    protected static boolean m3804i(byte b) {
        int i = b & 255;
        return i == 234 || i == 237 || i == 239 || i == 243 || i == 245;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: c */
    public final String mo3796c() {
        int i = this.f3588a - this.f3589b;
        if (i >= 5) {
            return C1571a.f3539t;
        }
        if (i <= -5) {
            return C1571a.f3525f;
        }
        float fMo3797d = this.f3592e.mo3797d() - this.f3593f.mo3797d();
        if (fMo3797d > 0.01f) {
            return C1571a.f3539t;
        }
        if (fMo3797d >= -0.01f && i >= 0) {
            return C1571a.f3539t;
        }
        return C1571a.f3525f;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: d */
    public final float mo3797d() {
        return 0.0f;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: e */
    public final int mo3798e() {
        return (this.f3592e.mo3798e() == 3 && this.f3593f.mo3798e() == 3) ? 3 : 1;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x004d  */
    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: f */
    public final int mo3799f(byte[] bArr, int i) {
        if (mo3798e() == 3) {
            return 3;
        }
        int i2 = i + 0;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = bArr[i3];
            byte b2 = this.f3591d;
            if (b == 32) {
                if (b2 != 32) {
                    if (m3804i(this.f3590c)) {
                        this.f3588a++;
                    } else {
                        int i4 = this.f3590c & 255;
                        if (i4 == 235 || i4 == 238 || i4 == 240 || i4 == 244) {
                            this.f3589b++;
                        }
                    }
                }
            } else if (b2 == 32 && m3804i(this.f3590c) && b != 32) {
                this.f3589b++;
            }
            this.f3591d = this.f3590c;
            this.f3590c = b;
        }
        return 1;
    }

    @Override // com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b
    /* JADX INFO: renamed from: h */
    public final void mo3800h() {
        this.f3588a = 0;
        this.f3589b = 0;
        this.f3590c = (byte) 32;
        this.f3591d = (byte) 32;
    }

    /* JADX INFO: renamed from: j */
    public final void m3805j(AbstractC1574b abstractC1574b, AbstractC1574b abstractC1574b2) {
        this.f3592e = abstractC1574b;
        this.f3593f = abstractC1574b2;
    }
}
