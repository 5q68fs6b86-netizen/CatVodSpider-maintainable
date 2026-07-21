package com.github.catvod.spider.support.p002A0;

import android.text.TextUtils;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ah */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0122ah {
    /* JADX INFO: renamed from: a */
    public static int[] m993a(String str) {
        int iIndexOf;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int iIndexOf2 = str.indexOf(35);
        if (iIndexOf2 != -1) {
            length = iIndexOf2;
        }
        int iIndexOf3 = str.indexOf(63);
        if (iIndexOf3 == -1 || iIndexOf3 > length) {
            iIndexOf3 = length;
        }
        int iIndexOf4 = str.indexOf(47);
        if (iIndexOf4 == -1 || iIndexOf4 > iIndexOf3) {
            iIndexOf4 = iIndexOf3;
        }
        int iIndexOf5 = str.indexOf(58);
        if (iIndexOf5 > iIndexOf4) {
            iIndexOf5 = -1;
        }
        int i = iIndexOf5 + 2;
        if (i < iIndexOf3 && str.charAt(iIndexOf5 + 1) == '/' && str.charAt(i) == '/') {
            iIndexOf = str.indexOf(47, iIndexOf5 + 3);
            if (iIndexOf == -1 || iIndexOf > iIndexOf3) {
                iIndexOf = iIndexOf3;
            }
        } else {
            iIndexOf = iIndexOf5 + 1;
        }
        iArr[0] = iIndexOf5;
        iArr[1] = iIndexOf;
        iArr[2] = iIndexOf3;
        iArr[3] = length;
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public static String m994b(StringBuilder sb, int i, int i2) {
        int i3;
        int iLastIndexOf;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i4 = i;
        int i5 = i4;
        while (i4 <= i2) {
            if (i4 == i2) {
                i3 = i4;
            } else if (sb.charAt(i4) == '/') {
                i3 = i4 + 1;
            } else {
                i4++;
            }
            int i6 = i5 + 1;
            if (i4 == i6 && sb.charAt(i5) == '.') {
                sb.delete(i5, i3);
                i2 -= i3 - i5;
            } else {
                if (i4 == i5 + 2 && sb.charAt(i5) == '.' && sb.charAt(i6) == '.') {
                    iLastIndexOf = sb.lastIndexOf("/", i5 - 2) + 1;
                    int iMax = Math.max(iLastIndexOf, i);
                    sb.delete(iMax, i3);
                    i2 -= i3 - iMax;
                } else {
                    iLastIndexOf = i4 + 1;
                }
                i5 = iLastIndexOf;
            }
            i4 = i5;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: c */
    public static final Object m995c(InterfaceC0769yg interfaceC0769yg, InterfaceC0304ha interfaceC0304ha, InterfaceC0747xl interfaceC0747xl) {
        InterfaceC0769yg context = interfaceC0747xl.getContext();
        InterfaceC0769yg interfaceC0769ygPlus = context.plus(interfaceC0769yg);
        InterfaceC0483nr interfaceC0483nr = (InterfaceC0483nr) interfaceC0769ygPlus.get(InterfaceC0483nr.f1290aj);
        if (interfaceC0483nr != null && !interfaceC0483nr.mo1035f()) {
            throw ((C0150bi) interfaceC0483nr).m1044q();
        }
        if (interfaceC0769ygPlus == context) {
            C0178cj c0178cj = new C0178cj(interfaceC0769ygPlus, interfaceC0747xl);
            return AbstractC0196da.m1094b(c0178cj, c0178cj, interfaceC0304ha);
        }
        C0372jo c0372jo = C0372jo.f1071c;
        if (!AbstractC0399ko.m1347b((InterfaceC0749xn) interfaceC0769ygPlus.get(c0372jo), (InterfaceC0749xn) context.get(c0372jo))) {
            acv acvVar = new acv(interfaceC0769ygPlus, interfaceC0747xl);
            acvVar.m1510am();
            AbstractC0422lk.m1385b(interfaceC0304ha, acvVar, acvVar);
            return acvVar.m962ao();
        }
        C0275fz c0275fz = new C0275fz(interfaceC0769ygPlus, interfaceC0747xl);
        Object objM1957d = AbstractC0807zr.m1957d(interfaceC0769ygPlus, null);
        try {
            return AbstractC0196da.m1094b(c0275fz, c0275fz, interfaceC0304ha);
        } finally {
            AbstractC0807zr.m1956c(interfaceC0769ygPlus, objM1957d);
        }
    }
}
