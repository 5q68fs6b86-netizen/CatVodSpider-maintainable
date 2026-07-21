package com.github.catvod.spider.support.p044FM.p060P;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.P.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1589c extends AbstractC1588b {
    @Override // com.github.catvod.spider.support.p044FM.p060P.AbstractC1588b
    /* JADX INFO: renamed from: b */
    protected final int mo3806b(byte[] bArr, int i) {
        int i2;
        if ((bArr[i] & 255) != 130 || (i2 = bArr[i + 1] & 255) < 159 || i2 > 241) {
            return -1;
        }
        return i2 - 159;
    }
}
