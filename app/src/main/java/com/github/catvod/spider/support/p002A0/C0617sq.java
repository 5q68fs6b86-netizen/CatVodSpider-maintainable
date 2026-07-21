package com.github.catvod.spider.support.p002A0;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.sq */
/* JADX INFO: loaded from: classes.dex */
public final class C0617sq {

    /* JADX INFO: renamed from: a */
    public int f1504a;

    /* JADX INFO: renamed from: b */
    public ByteBuffer f1505b;

    /* JADX INFO: renamed from: c */
    public CharBuffer f1506c;

    /* JADX INFO: renamed from: d */
    public IntBuffer f1507d;

    /* JADX INFO: renamed from: e */
    public int f1508e;

    /* JADX INFO: renamed from: f */
    public static int m1691f(int i) {
        return (int) Math.pow(2.0d, 32 - Integer.numberOfLeadingZeros(i - 1));
    }

    /* JADX INFO: renamed from: g */
    public final void m1692g(CharBuffer charBuffer) {
        char[] cArrArray = charBuffer.array();
        int iPosition = charBuffer.position() + charBuffer.arrayOffset();
        int iLimit = charBuffer.limit() + charBuffer.arrayOffset();
        char[] cArrArray2 = this.f1506c.array();
        int iPosition2 = this.f1506c.position() + this.f1506c.arrayOffset();
        while (iPosition < iLimit) {
            char c = cArrArray[iPosition];
            if (Character.isHighSurrogate(c)) {
                charBuffer.position(iPosition - charBuffer.arrayOffset());
                CharBuffer charBuffer2 = this.f1506c;
                charBuffer2.position(iPosition2 - charBuffer2.arrayOffset());
                int iRemaining = charBuffer.remaining();
                this.f1506c.flip();
                IntBuffer intBufferAllocate = IntBuffer.allocate(Math.max(this.f1506c.remaining() + iRemaining, this.f1506c.capacity() / 2));
                while (this.f1506c.hasRemaining()) {
                    intBufferAllocate.put(this.f1506c.get() & 65535);
                }
                this.f1504a = 3;
                this.f1506c = null;
                this.f1507d = intBufferAllocate;
                m1693h(charBuffer);
                return;
            }
            cArrArray2[iPosition2] = c;
            iPosition++;
            iPosition2++;
        }
        charBuffer.position(iPosition - charBuffer.arrayOffset());
        CharBuffer charBuffer3 = this.f1506c;
        charBuffer3.position(iPosition2 - charBuffer3.arrayOffset());
    }

    /* JADX INFO: renamed from: h */
    public final void m1693h(CharBuffer charBuffer) {
        char[] cArrArray = charBuffer.array();
        int iPosition = charBuffer.position() + charBuffer.arrayOffset();
        int iLimit = charBuffer.limit() + charBuffer.arrayOffset();
        int[] iArrArray = this.f1507d.array();
        int iPosition2 = this.f1507d.position() + this.f1507d.arrayOffset();
        while (iPosition < iLimit) {
            char c = cArrArray[iPosition];
            iPosition++;
            if (this.f1508e != -1) {
                if (Character.isLowSurrogate(c)) {
                    iArrArray[iPosition2] = Character.toCodePoint((char) this.f1508e, c);
                    iPosition2++;
                    this.f1508e = -1;
                } else {
                    iArrArray[iPosition2] = this.f1508e;
                    int i = iPosition2 + 1;
                    if (Character.isHighSurrogate(c)) {
                        this.f1508e = c & 65535;
                        iPosition2 = i;
                    } else {
                        iArrArray[i] = 65535 & c;
                        iPosition2 += 2;
                        this.f1508e = -1;
                    }
                }
            } else if (Character.isHighSurrogate(c)) {
                this.f1508e = c & 65535;
            } else {
                iArrArray[iPosition2] = c & 65535;
                iPosition2++;
            }
        }
        int i2 = this.f1508e;
        if (i2 != -1) {
            iArrArray[iPosition2] = i2 & 65535;
            iPosition2++;
        }
        charBuffer.position(iPosition - charBuffer.arrayOffset());
        IntBuffer intBuffer = this.f1507d;
        intBuffer.position(iPosition2 - intBuffer.arrayOffset());
    }
}
