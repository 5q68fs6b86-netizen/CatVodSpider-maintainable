package com.github.catvod.spider.support.p044FM.p062R;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.R.l */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1609l {

    /* JADX INFO: renamed from: a */
    protected short[] f3665a;

    /* JADX INFO: renamed from: b */
    protected byte[] f3666b;

    /* JADX INFO: renamed from: c */
    protected float f3667c;

    /* JADX INFO: renamed from: d */
    protected String f3668d;

    public AbstractC1609l(short[] sArr, byte[] bArr, float f, String str) {
        this.f3665a = sArr;
        this.f3666b = bArr;
        this.f3667c = f;
        this.f3668d = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m3816a() {
        return this.f3668d;
    }

    /* JADX INFO: renamed from: b */
    public final short m3817b(byte b) {
        return this.f3665a[b & 255];
    }

    /* JADX INFO: renamed from: c */
    public final byte m3818c(int i) {
        return this.f3666b[i];
    }

    /* JADX INFO: renamed from: d */
    public final float m3819d() {
        return this.f3667c;
    }
}
