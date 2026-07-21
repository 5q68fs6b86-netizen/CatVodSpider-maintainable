package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ze */
/* JADX INFO: loaded from: classes.dex */
public final class C0794ze {

    /* JADX INFO: renamed from: a */
    public static volatile C0429lr f1870a = C0429lr.f1169a;

    /* JADX INFO: renamed from: b */
    public final StringBuffer f1871b;

    /* JADX INFO: renamed from: c */
    public final C0133as f1872c;

    /* JADX INFO: renamed from: d */
    public final C0429lr f1873d;

    public C0794ze(C0133as c0133as) {
        C0429lr c0429lr = f1870a;
        StringBuffer stringBuffer = new StringBuffer(512);
        this.f1871b = stringBuffer;
        this.f1873d = c0429lr;
        this.f1872c = c0133as;
        if (c0429lr.f1172d) {
            C0429lr.m1407t(c0133as);
            if (c0429lr.f1173e) {
                stringBuffer.append(AbstractC0616sp.m1690c(C0133as.class));
            } else {
                stringBuffer.append(C0133as.class.getName());
            }
        }
        if (c0429lr.f1174f) {
            C0429lr.m1407t(c0133as);
            stringBuffer.append('@');
            stringBuffer.append(Integer.toHexString(System.identityHashCode(c0133as)));
        }
        stringBuffer.append(c0429lr.f1175g);
        if (c0429lr.f1178j) {
            stringBuffer.append(c0429lr.f1179k);
        }
    }

    public final String toString() {
        boolean z = true;
        StringBuffer stringBuffer = this.f1871b;
        C0133as c0133as = this.f1872c;
        C0429lr c0429lr = this.f1873d;
        String str = c0429lr.f1179k;
        int i = AbstractC0273fx.f848a;
        boolean z2 = false;
        if (str.length() <= stringBuffer.length()) {
            int length = stringBuffer.length() - str.length();
            int length2 = str.length();
            int i2 = 0;
            int length3 = stringBuffer.length() - length;
            int length4 = str.length();
            if (length >= 0 && length2 >= 0 && length3 >= length2 && length4 >= length2) {
                while (true) {
                    int i3 = length2 - 1;
                    if (length2 <= 0) {
                        break;
                    }
                    int i4 = length + 1;
                    int i5 = i2 + 1;
                    if (stringBuffer.charAt(length) != str.charAt(i2)) {
                        z = false;
                        break;
                    }
                    length = i4;
                    length2 = i3;
                    i2 = i5;
                }
            } else {
                z = false;
                break;
            }
            z2 = z;
        }
        if (z2) {
            stringBuffer.setLength(stringBuffer.length() - c0429lr.f1179k.length());
        }
        stringBuffer.append(c0429lr.f1176h);
        C0429lr.m1408u(c0133as);
        return stringBuffer.toString();
    }
}
