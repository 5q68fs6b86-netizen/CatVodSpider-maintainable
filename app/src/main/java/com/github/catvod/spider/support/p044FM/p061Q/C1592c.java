package com.github.catvod.spider.support.p044FM.p061Q;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p061Q.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1592c extends AbstractC1596g {
    @Override // com.github.catvod.spider.support.p044FM.p061Q.AbstractC1591b
    /* JADX INFO: renamed from: b */
    protected final int mo3811b(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        if (i2 < 161) {
            return -1;
        }
        return (((i2 - 161) * 94) + (bArr[i + 1] & 255)) - 161;
    }
}
