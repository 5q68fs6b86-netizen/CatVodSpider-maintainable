package com.github.catvod.spider.support.p003AB.p004a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p003AB.p004a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0816a {
    /* JADX INFO: renamed from: a */
    public static String m1965a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int length2 = bArr2.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            if (i2 >= length2) {
                i2 = 0;
            }
            bArr[i] = (byte) (bArr[i] ^ bArr2[i2]);
            i++;
            i2++;
        }
        return new String(bArr);
    }
}
