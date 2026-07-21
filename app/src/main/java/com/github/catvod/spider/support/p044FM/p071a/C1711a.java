package com.github.catvod.spider.support.p044FM.p071a;

import com.github.catvod.spider.support.p044FM.p074b0.InterfaceC1756a;
import com.github.catvod.spider.support.p044FM.p074b0.InterfaceC1757b;
import com.github.catvod.spider.support.p044FM.p078d0.C1788b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1711a implements InterfaceC1756a {
    /* JADX INFO: renamed from: b */
    public static String m3992b(byte[] bArr, byte[] bArr2) {
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

    @Override // com.github.catvod.spider.support.p044FM.p074b0.InterfaceC1756a
    /* JADX INFO: renamed from: a */
    public InterfaceC1757b mo3993a(String str) {
        return C1788b.f4016a;
    }
}
