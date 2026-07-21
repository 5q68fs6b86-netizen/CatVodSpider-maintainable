package com.github.catvod.spider.support.p002A0;

import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ss */
/* JADX INFO: loaded from: classes.dex */
public final class C0619ss implements InterfaceC0669uo {

    /* JADX INFO: renamed from: a */
    public final int f1513a;

    /* JADX INFO: renamed from: b */
    public int f1514b = 0;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f1515c;

    /* JADX INFO: renamed from: d */
    public final Object f1516d;

    public C0619ss(int i, Object obj, int i2) {
        this.f1515c = i2;
        this.f1513a = i;
        this.f1516d = obj;
    }

    @Override // com.github.catvod.spider.support.p002A0.InterfaceC0669uo
    /* JADX INFO: renamed from: e */
    public final int mo1697e(int i) {
        char c;
        byte b;
        switch (this.f1515c) {
            case 0:
                int iSignum = Integer.signum(1);
                char[] cArr = (char[]) this.f1516d;
                if (iSignum == -1) {
                    int i2 = this.f1514b + 1;
                    if (i2 < 0) {
                        return -1;
                    }
                    c = cArr[i2];
                } else {
                    if (iSignum == 0) {
                        return 0;
                    }
                    if (iSignum != 1) {
                        throw new UnsupportedOperationException("Not reached");
                    }
                    int i3 = this.f1514b;
                    if (i3 >= this.f1513a) {
                        return -1;
                    }
                    c = cArr[i3];
                }
                return c & 65535;
            case 1:
                int iSignum2 = Integer.signum(1);
                int[] iArr = (int[]) this.f1516d;
                if (iSignum2 == -1) {
                    int i4 = this.f1514b + 1;
                    if (i4 < 0) {
                        return -1;
                    }
                    return iArr[i4];
                }
                if (iSignum2 == 0) {
                    return 0;
                }
                if (iSignum2 != 1) {
                    throw new UnsupportedOperationException("Not reached");
                }
                int i5 = this.f1514b;
                if (i5 >= this.f1513a) {
                    return -1;
                }
                return iArr[i5];
            default:
                int iSignum3 = Integer.signum(1);
                byte[] bArr = (byte[]) this.f1516d;
                if (iSignum3 == -1) {
                    int i6 = this.f1514b + 1;
                    if (i6 < 0) {
                        return -1;
                    }
                    b = bArr[i6];
                } else {
                    if (iSignum3 == 0) {
                        return 0;
                    }
                    if (iSignum3 != 1) {
                        throw new UnsupportedOperationException("Not reached");
                    }
                    int i7 = this.f1514b;
                    if (i7 >= this.f1513a) {
                        return -1;
                    }
                    b = bArr[i7];
                }
                return b & 255;
        }
    }

    /* JADX INFO: renamed from: f */
    public final String m1698f(C0145bd c0145bd) {
        switch (this.f1515c) {
            case 0:
                int i = c0145bd.f684b;
                int i2 = this.f1513a;
                int iMin = Math.min(i, i2);
                return new String((char[]) this.f1516d, iMin, Math.min((c0145bd.f685c - c0145bd.f684b) + 1, i2 - iMin));
            case 1:
                int i3 = c0145bd.f684b;
                int i4 = this.f1513a;
                int iMin2 = Math.min(i3, i4);
                return new String((int[]) this.f1516d, iMin2, Math.min((c0145bd.f685c - c0145bd.f684b) + 1, i4 - iMin2));
            default:
                int i5 = c0145bd.f684b;
                int i6 = this.f1513a;
                int iMin3 = Math.min(i5, i6);
                return new String((byte[]) this.f1516d, iMin3, Math.min((c0145bd.f685c - c0145bd.f684b) + 1, i6 - iMin3), StandardCharsets.ISO_8859_1);
        }
    }

    public final String toString() {
        return m1698f(C0145bd.m1022d(0, this.f1513a - 1));
    }
}
