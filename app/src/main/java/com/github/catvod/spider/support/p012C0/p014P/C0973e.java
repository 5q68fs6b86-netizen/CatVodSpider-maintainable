package com.github.catvod.spider.support.p012C0.p014P;

import com.github.catvod.spider.support.p012C0.p037l.C1257a;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.P.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0973e {

    /* JADX INFO: renamed from: b */
    private ByteBuffer f2356b;

    /* JADX INFO: renamed from: a */
    private int f2355a = 1;

    /* JADX INFO: renamed from: c */
    private CharBuffer f2357c = null;

    /* JADX INFO: renamed from: d */
    private IntBuffer f2358d = null;

    /* JADX INFO: renamed from: e */
    private int f2359e = -1;

    C0973e(int i) {
        this.f2356b = ByteBuffer.allocate(i);
    }

    /* JADX INFO: renamed from: b */
    private void m2405b(CharBuffer charBuffer) {
        char[] cArrArray = charBuffer.array();
        int iArrayOffset = charBuffer.arrayOffset() + charBuffer.position();
        int iArrayOffset2 = charBuffer.arrayOffset();
        int iLimit = charBuffer.limit();
        char[] cArrArray2 = this.f2357c.array();
        int iArrayOffset3 = this.f2357c.arrayOffset() + this.f2357c.position();
        while (iArrayOffset < iLimit + iArrayOffset2) {
            char c = cArrArray[iArrayOffset];
            if (Character.isHighSurrogate(c)) {
                charBuffer.position(iArrayOffset - charBuffer.arrayOffset());
                CharBuffer charBuffer2 = this.f2357c;
                charBuffer2.position(iArrayOffset3 - charBuffer2.arrayOffset());
                int iRemaining = charBuffer.remaining();
                this.f2357c.flip();
                IntBuffer intBufferAllocate = IntBuffer.allocate(Math.max(iRemaining + this.f2357c.remaining(), this.f2357c.capacity() / 2));
                while (this.f2357c.hasRemaining()) {
                    intBufferAllocate.put(this.f2357c.get() & 65535);
                }
                this.f2355a = 3;
                this.f2357c = null;
                this.f2358d = intBufferAllocate;
                m2406c(charBuffer);
                return;
            }
            cArrArray2[iArrayOffset3] = c;
            iArrayOffset++;
            iArrayOffset3++;
        }
        charBuffer.position(iArrayOffset - charBuffer.arrayOffset());
        CharBuffer charBuffer3 = this.f2357c;
        charBuffer3.position(iArrayOffset3 - charBuffer3.arrayOffset());
    }

    /* JADX INFO: renamed from: c */
    private void m2406c(CharBuffer charBuffer) {
        int i;
        char[] cArrArray = charBuffer.array();
        int iPosition = charBuffer.position() + charBuffer.arrayOffset();
        int iArrayOffset = charBuffer.arrayOffset();
        int iLimit = charBuffer.limit();
        int[] iArrArray = this.f2358d.array();
        int iArrayOffset2 = this.f2358d.arrayOffset() + this.f2358d.position();
        while (iPosition < iLimit + iArrayOffset) {
            char c = cArrArray[iPosition];
            iPosition++;
            if (this.f2359e != -1) {
                if (Character.isLowSurrogate(c)) {
                    iArrArray[iArrayOffset2] = Character.toCodePoint((char) this.f2359e, c);
                } else {
                    iArrArray[iArrayOffset2] = this.f2359e;
                    iArrayOffset2++;
                    if (!Character.isHighSurrogate(c)) {
                        iArrArray[iArrayOffset2] = 65535 & c;
                    }
                    this.f2359e = i;
                }
                iArrayOffset2++;
                i = -1;
                this.f2359e = i;
            } else if (!Character.isHighSurrogate(c)) {
                iArrArray[iArrayOffset2] = c & 65535;
                iArrayOffset2++;
            }
            i = c & 65535;
            this.f2359e = i;
        }
        int i2 = this.f2359e;
        if (i2 != -1) {
            iArrArray[iArrayOffset2] = i2 & 65535;
            iArrayOffset2++;
        }
        charBuffer.position(iPosition - charBuffer.arrayOffset());
        IntBuffer intBuffer = this.f2358d;
        intBuffer.position(iArrayOffset2 - intBuffer.arrayOffset());
    }

    /* JADX INFO: renamed from: e */
    private static int m2407e(int i) {
        return (int) Math.pow(2.0d, 32 - Integer.numberOfLeadingZeros(i - 1));
    }

    /* JADX INFO: renamed from: a */
    public final void m2408a(CharBuffer charBuffer) {
        int iRemaining = charBuffer.remaining();
        int iM3131a = C1257a.m3131a(this.f2355a);
        if (iM3131a != 0) {
            if (iM3131a != 1) {
                if (iM3131a == 2 && this.f2358d.remaining() < iRemaining) {
                    IntBuffer intBufferAllocate = IntBuffer.allocate(m2407e(iRemaining + this.f2358d.capacity()));
                    this.f2358d.flip();
                    intBufferAllocate.put(this.f2358d);
                    this.f2358d = intBufferAllocate;
                }
            } else if (this.f2357c.remaining() < iRemaining) {
                CharBuffer charBufferAllocate = CharBuffer.allocate(m2407e(iRemaining + this.f2357c.capacity()));
                this.f2357c.flip();
                charBufferAllocate.put(this.f2357c);
                this.f2357c = charBufferAllocate;
            }
        } else if (this.f2356b.remaining() < iRemaining) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(m2407e(iRemaining + this.f2356b.capacity()));
            this.f2356b.flip();
            byteBufferAllocate.put(this.f2356b);
            this.f2356b = byteBufferAllocate;
        }
        if (!charBuffer.hasArray()) {
            throw new UnsupportedOperationException("TODO");
        }
        int iM3131a2 = C1257a.m3131a(this.f2355a);
        if (iM3131a2 != 0) {
            if (iM3131a2 == 1) {
                m2405b(charBuffer);
                return;
            } else {
                if (iM3131a2 != 2) {
                    return;
                }
                m2406c(charBuffer);
                return;
            }
        }
        char[] cArrArray = charBuffer.array();
        int iArrayOffset = charBuffer.arrayOffset() + charBuffer.position();
        int iArrayOffset2 = charBuffer.arrayOffset();
        int iLimit = charBuffer.limit();
        byte[] bArrArray = this.f2356b.array();
        int iArrayOffset3 = this.f2356b.arrayOffset() + this.f2356b.position();
        while (iArrayOffset < iLimit + iArrayOffset2) {
            char c = cArrArray[iArrayOffset];
            if (c > 255) {
                charBuffer.position(iArrayOffset - charBuffer.arrayOffset());
                ByteBuffer byteBuffer = this.f2356b;
                byteBuffer.position(iArrayOffset3 - byteBuffer.arrayOffset());
                if (Character.isHighSurrogate(c)) {
                    int iRemaining2 = charBuffer.remaining();
                    this.f2356b.flip();
                    IntBuffer intBufferAllocate2 = IntBuffer.allocate(Math.max(iRemaining2 + this.f2356b.remaining(), this.f2356b.capacity() / 4));
                    while (this.f2356b.hasRemaining()) {
                        intBufferAllocate2.put(this.f2356b.get() & 255);
                    }
                    this.f2355a = 3;
                    this.f2356b = null;
                    this.f2358d = intBufferAllocate2;
                    m2406c(charBuffer);
                    return;
                }
                int iRemaining3 = charBuffer.remaining();
                this.f2356b.flip();
                CharBuffer charBufferAllocate2 = CharBuffer.allocate(Math.max(iRemaining3 + this.f2356b.remaining(), this.f2356b.capacity() / 2));
                while (this.f2356b.hasRemaining()) {
                    charBufferAllocate2.put((char) (this.f2356b.get() & 255));
                }
                this.f2355a = 2;
                this.f2356b = null;
                this.f2357c = charBufferAllocate2;
                m2405b(charBuffer);
                return;
            }
            bArrArray[iArrayOffset3] = (byte) (c & 255);
            iArrayOffset++;
            iArrayOffset3++;
        }
        charBuffer.position(iArrayOffset - charBuffer.arrayOffset());
        ByteBuffer byteBuffer2 = this.f2356b;
        byteBuffer2.position(iArrayOffset3 - byteBuffer2.arrayOffset());
    }

    /* JADX INFO: renamed from: d */
    public final C0974f m2409d() {
        int iM3131a = C1257a.m3131a(this.f2355a);
        if (iM3131a == 0) {
            this.f2356b.flip();
        } else if (iM3131a == 1) {
            this.f2357c.flip();
        } else if (iM3131a == 2) {
            this.f2358d.flip();
        }
        return new C0974f(this.f2355a, this.f2356b, this.f2357c, this.f2358d);
    }
}
