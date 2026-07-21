package com.github.catvod.spider.support.p044FM.p058N;

import com.github.catvod.spider.support.p044FM.p059O.AbstractC1574b;
import com.github.catvod.spider.support.p044FM.p059O.C1578f;
import com.github.catvod.spider.support.p044FM.p059O.C1581i;
import com.github.catvod.spider.support.p044FM.p059O.C1582j;
import com.github.catvod.spider.support.p044FM.p059O.C1583k;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p058N.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1572b {

    /* JADX INFO: renamed from: a */
    private int f3546a;

    /* JADX INFO: renamed from: b */
    private boolean f3547b;

    /* JADX INFO: renamed from: c */
    private boolean f3548c;

    /* JADX INFO: renamed from: d */
    private boolean f3549d;

    /* JADX INFO: renamed from: e */
    private byte f3550e;

    /* JADX INFO: renamed from: f */
    private String f3551f;

    /* JADX INFO: renamed from: h */
    private C1578f f3553h = null;

    /* JADX INFO: renamed from: g */
    private AbstractC1574b[] f3552g = new AbstractC1574b[3];

    public C1572b() {
        int i = 0;
        int i2 = 0;
        while (true) {
            AbstractC1574b[] abstractC1574bArr = this.f3552g;
            if (i2 >= abstractC1574bArr.length) {
                break;
            }
            abstractC1574bArr[i2] = null;
            i2++;
        }
        this.f3547b = false;
        this.f3548c = true;
        this.f3551f = null;
        this.f3549d = false;
        this.f3546a = 1;
        this.f3550e = (byte) 0;
        C1578f c1578f = this.f3553h;
        if (c1578f != null) {
            c1578f.mo3800h();
        }
        while (true) {
            AbstractC1574b[] abstractC1574bArr2 = this.f3552g;
            if (i >= abstractC1574bArr2.length) {
                return;
            }
            if (abstractC1574bArr2[i] != null) {
                abstractC1574bArr2[i].mo3800h();
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3793a() {
        AbstractC1574b[] abstractC1574bArr;
        if (this.f3549d) {
            if (this.f3551f != null) {
                this.f3547b = true;
                return;
            }
            if (this.f3546a == 3) {
                float f = 0.0f;
                int i = 0;
                int i2 = 0;
                while (true) {
                    abstractC1574bArr = this.f3552g;
                    if (i >= abstractC1574bArr.length) {
                        break;
                    }
                    float fMo3797d = abstractC1574bArr[i].mo3797d();
                    if (fMo3797d > f) {
                        i2 = i;
                        f = fMo3797d;
                    }
                    i++;
                }
                if (f > 0.2f) {
                    this.f3551f = abstractC1574bArr[i2].mo3796c();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m3794b() {
        return this.f3551f;
    }

    /* JADX INFO: renamed from: c */
    public final void m3795c(byte[] bArr, int i) {
        String str;
        if (this.f3547b) {
            return;
        }
        if (i > 0) {
            this.f3549d = true;
        }
        int i2 = 0;
        if (this.f3548c) {
            this.f3548c = false;
            if (i > 3) {
                int i3 = bArr[0] & 255;
                int i4 = bArr[1] & 255;
                int i5 = bArr[2] & 255;
                int i6 = bArr[3] & 255;
                if (i3 == 0) {
                    if (i4 == 0 && i5 == 254 && i6 == 255) {
                        str = C1571a.f3543x;
                    } else if (i4 == 0 && i5 == 255 && i6 == 254) {
                        str = C1571a.f3519B;
                    }
                    this.f3551f = str;
                } else if (i3 != 239) {
                    if (i3 == 254) {
                        if (i4 == 255 && i5 == 0 && i6 == 0) {
                            str = C1571a.f3518A;
                        } else if (i4 == 255) {
                            str = C1571a.f3541v;
                        }
                        this.f3551f = str;
                    } else if (i3 == 255) {
                        if (i4 == 254 && i5 == 0 && i6 == 0) {
                            str = C1571a.f3544y;
                        } else if (i4 == 254) {
                            str = C1571a.f3542w;
                        }
                        this.f3551f = str;
                    }
                } else if (i4 == 187 && i5 == 191) {
                    str = C1571a.f3540u;
                    this.f3551f = str;
                }
                if (this.f3551f != null) {
                    this.f3547b = true;
                    return;
                }
            }
        }
        int i7 = 0 + i;
        for (int i8 = 0; i8 < i7; i8++) {
            int i9 = bArr[i8] & 255;
            if ((i9 & 128) == 0 || i9 == 160) {
                if (this.f3546a == 1 && (i9 == 27 || (i9 == 123 && this.f3550e == 126))) {
                    this.f3546a = 2;
                }
                this.f3550e = bArr[i8];
            } else if (this.f3546a != 3) {
                this.f3546a = 3;
                if (this.f3553h != null) {
                    this.f3553h = null;
                }
                AbstractC1574b[] abstractC1574bArr = this.f3552g;
                if (abstractC1574bArr[0] == null) {
                    abstractC1574bArr[0] = new C1582j();
                }
                AbstractC1574b[] abstractC1574bArr2 = this.f3552g;
                if (abstractC1574bArr2[1] == null) {
                    abstractC1574bArr2[1] = new C1583k();
                }
                AbstractC1574b[] abstractC1574bArr3 = this.f3552g;
                if (abstractC1574bArr3[2] == null) {
                    abstractC1574bArr3[2] = new C1581i();
                }
            }
        }
        int i10 = this.f3546a;
        if (i10 == 2) {
            if (this.f3553h == null) {
                this.f3553h = new C1578f();
            }
            if (this.f3553h.mo3799f(bArr, i) == 2) {
                this.f3547b = true;
                this.f3551f = this.f3553h.mo3796c();
                return;
            }
            return;
        }
        if (i10 != 3) {
            return;
        }
        while (true) {
            AbstractC1574b[] abstractC1574bArr4 = this.f3552g;
            if (i2 >= abstractC1574bArr4.length) {
                return;
            }
            if (abstractC1574bArr4[i2].mo3799f(bArr, i) == 2) {
                this.f3547b = true;
                this.f3551f = this.f3552g[i2].mo3796c();
                return;
            }
            i2++;
        }
    }
}
