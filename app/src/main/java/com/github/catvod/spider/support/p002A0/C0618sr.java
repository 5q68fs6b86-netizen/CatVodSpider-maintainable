package com.github.catvod.spider.support.p002A0;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.sr */
/* JADX INFO: loaded from: classes.dex */
public final class C0618sr {

    /* JADX INFO: renamed from: a */
    public final int f1509a;

    /* JADX INFO: renamed from: b */
    public final ByteBuffer f1510b;

    /* JADX INFO: renamed from: c */
    public final CharBuffer f1511c;

    /* JADX INFO: renamed from: d */
    public final IntBuffer f1512d;

    public C0618sr(int i, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.f1509a = i;
        this.f1510b = byteBuffer;
        this.f1511c = charBuffer;
        this.f1512d = intBuffer;
    }

    /* JADX INFO: renamed from: e */
    public final int m1694e() {
        int iM1764h = AbstractC0710wb.m1764h(this.f1509a);
        if (iM1764h == 0) {
            return this.f1510b.arrayOffset();
        }
        if (iM1764h == 1) {
            return this.f1511c.arrayOffset();
        }
        if (iM1764h == 2) {
            return this.f1512d.arrayOffset();
        }
        throw new UnsupportedOperationException("Not reached");
    }

    /* JADX INFO: renamed from: f */
    public final int m1695f() {
        int iM1764h = AbstractC0710wb.m1764h(this.f1509a);
        if (iM1764h == 0) {
            return this.f1510b.position();
        }
        if (iM1764h == 1) {
            return this.f1511c.position();
        }
        if (iM1764h == 2) {
            return this.f1512d.position();
        }
        throw new UnsupportedOperationException("Not reached");
    }

    /* JADX INFO: renamed from: g */
    public final int m1696g() {
        int iM1764h = AbstractC0710wb.m1764h(this.f1509a);
        if (iM1764h == 0) {
            return this.f1510b.remaining();
        }
        if (iM1764h == 1) {
            return this.f1511c.remaining();
        }
        if (iM1764h == 2) {
            return this.f1512d.remaining();
        }
        throw new UnsupportedOperationException("Not reached");
    }
}
