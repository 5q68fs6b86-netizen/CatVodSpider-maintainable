package com.github.catvod.spider.support.p044FM.p061Q;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.Q.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1597h extends AbstractC1596g {
    @Override // com.github.catvod.spider.support.p044FM.p061Q.AbstractC1591b
    /* JADX INFO: renamed from: b */
    protected final int mo3811b(byte[] bArr, int i) {
        int i2;
        int i3 = bArr[i] & 255;
        if (i3 >= 129 && i3 <= 159) {
            i2 = i3 - 129;
        } else {
            if (i3 < 224 || i3 > 239) {
                return -1;
            }
            i2 = (i3 - 224) + 31;
        }
        int i4 = i2 * 188;
        int i5 = bArr[i + 1] & 255;
        int i6 = (i5 - 64) + i4;
        return i5 >= 128 ? i6 - 1 : i6;
    }
}
