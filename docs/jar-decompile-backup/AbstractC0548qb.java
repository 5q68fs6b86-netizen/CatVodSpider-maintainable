package com.github.catvod.spider.support.p002A0;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.qb */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0548qb extends AbstractC0196da {
    /* JADX INFO: renamed from: c */
    public static List m1567c(Object[] objArr) {
        AbstractC0399ko.m1351f("<this>", objArr);
        List listAsList = Arrays.asList(objArr);
        AbstractC0399ko.m1350e("asList(...)", listAsList);
        return listAsList;
    }

    /* JADX INFO: renamed from: d */
    public static void m1568d(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        AbstractC0399ko.m1351f("<this>", bArr);
        AbstractC0399ko.m1351f("destination", bArr2);
        System.arraycopy(bArr, i2, bArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: e */
    public static void m1569e(Object[] objArr, Object[] objArr2, int i, int i2, int i3) {
        AbstractC0399ko.m1351f("<this>", objArr);
        AbstractC0399ko.m1351f("destination", objArr2);
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m1570f(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        m1569e(objArr, objArr2, i, i2, i3);
    }

    /* JADX INFO: renamed from: g */
    public static byte[] m1571g(byte[] bArr, int i, int i2) {
        AbstractC0399ko.m1351f("<this>", bArr);
        AbstractC0196da.m1093a(i2, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i, i2);
        AbstractC0399ko.m1350e("copyOfRange(...)", bArrCopyOfRange);
        return bArrCopyOfRange;
    }

    /* JADX INFO: renamed from: h */
    public static Object[] m1572h(Object[] objArr, int i, int i2) {
        AbstractC0399ko.m1351f("<this>", objArr);
        AbstractC0196da.m1093a(i2, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i, i2);
        AbstractC0399ko.m1350e("copyOfRange(...)", objArrCopyOfRange);
        return objArrCopyOfRange;
    }

    /* JADX INFO: renamed from: i */
    public static void m1573i(Object[] objArr, int i, int i2) {
        AbstractC0399ko.m1351f("<this>", objArr);
        Arrays.fill(objArr, i, i2, (Object) null);
    }
}
