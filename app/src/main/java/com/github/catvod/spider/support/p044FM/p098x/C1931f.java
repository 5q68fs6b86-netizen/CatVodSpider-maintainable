package com.github.catvod.spider.support.p044FM.p098x;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p098x.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1931f {

    /* JADX INFO: renamed from: b */
    private ByteBuffer f4407b;

    /* JADX INFO: renamed from: a */
    private int f4406a = 1;

    /* JADX INFO: renamed from: c */
    private CharBuffer f4408c = null;

    /* JADX INFO: renamed from: d */
    private IntBuffer f4409d = null;

    /* JADX INFO: renamed from: e */
    private int f4410e = -1;

    C1931f(int i) {
        this.f4407b = ByteBuffer.allocate(i);
    }

    /* JADX INFO: renamed from: b */
    private void m4670b(CharBuffer charBuffer) {
        char[] cArrArray = charBuffer.array();
        int iPosition = charBuffer.position() + charBuffer.arrayOffset();
        int iLimit = charBuffer.limit() + charBuffer.arrayOffset();
        char[] cArrArray2 = this.f4408c.array();
        int iPosition2 = this.f4408c.position() + this.f4408c.arrayOffset();
        while (iPosition < iLimit) {
            char c = cArrArray[iPosition];
            if (Character.isHighSurrogate(c)) {
                charBuffer.position(iPosition - charBuffer.arrayOffset());
                CharBuffer charBuffer2 = this.f4408c;
                charBuffer2.position(iPosition2 - charBuffer2.arrayOffset());
                int iRemaining = charBuffer.remaining();
                this.f4408c.flip();
                IntBuffer intBufferAllocate = IntBuffer.allocate(Math.max(this.f4408c.remaining() + iRemaining, this.f4408c.capacity() / 2));
                while (this.f4408c.hasRemaining()) {
                    intBufferAllocate.put(this.f4408c.get() & 65535);
                }
                this.f4406a = 3;
                this.f4408c = null;
                this.f4409d = intBufferAllocate;
                m4671c(charBuffer);
                return;
            }
            cArrArray2[iPosition2] = c;
            iPosition++;
            iPosition2++;
        }
        charBuffer.position(iPosition - charBuffer.arrayOffset());
        CharBuffer charBuffer3 = this.f4408c;
        charBuffer3.position(iPosition2 - charBuffer3.arrayOffset());
    }

    /* JADX INFO: renamed from: c */
    private void m4671c(CharBuffer charBuffer) {
        char[] cArrArray = charBuffer.array();
        int iPosition = charBuffer.position() + charBuffer.arrayOffset();
        int iLimit = charBuffer.limit() + charBuffer.arrayOffset();
        int[] iArrArray = this.f4409d.array();
        int iPosition2 = this.f4409d.position() + this.f4409d.arrayOffset();
        while (true) {
            int i = -1;
            if (iPosition >= iLimit) {
                break;
            }
            char c = cArrArray[iPosition];
            iPosition++;
            if (this.f4410e != -1) {
                if (Character.isLowSurrogate(c)) {
                    iArrArray[iPosition2] = Character.toCodePoint((char) this.f4410e, c);
                } else {
                    iArrArray[iPosition2] = this.f4410e;
                    iPosition2++;
                    if (!Character.isHighSurrogate(c)) {
                        iArrArray[iPosition2] = 65535 & c;
                    }
                    this.f4410e = i;
                }
                iPosition2++;
                this.f4410e = i;
            } else if (!Character.isHighSurrogate(c)) {
                iArrArray[iPosition2] = c & 65535;
                iPosition2++;
            }
            i = c & 65535;
            this.f4410e = i;
        }
        int i2 = this.f4410e;
        if (i2 != -1) {
            iArrArray[iPosition2] = i2 & 65535;
            iPosition2++;
        }
        charBuffer.position(iPosition - charBuffer.arrayOffset());
        IntBuffer intBuffer = this.f4409d;
        intBuffer.position(iPosition2 - intBuffer.arrayOffset());
    }

    /* JADX INFO: renamed from: e */
    private static int m4672e(int i) {
        return (int) Math.pow(2.0d, 32 - Integer.numberOfLeadingZeros(i - 1));
    }

    /* JADX INFO: renamed from: a */
    public final void m4673a(CharBuffer charBuffer) {
        int iRemaining = charBuffer.remaining();
        int iM4675a = C1932g.m4675a(this.f4406a);
        if (iM4675a != 0) {
            if (iM4675a != 1) {
                if (iM4675a == 2 && this.f4409d.remaining() < iRemaining) {
                    IntBuffer intBufferAllocate = IntBuffer.allocate(m4672e(this.f4409d.capacity() + iRemaining));
                    this.f4409d.flip();
                    intBufferAllocate.put(this.f4409d);
                    this.f4409d = intBufferAllocate;
                }
            } else if (this.f4408c.remaining() < iRemaining) {
                CharBuffer charBufferAllocate = CharBuffer.allocate(m4672e(this.f4408c.capacity() + iRemaining));
                this.f4408c.flip();
                charBufferAllocate.put(this.f4408c);
                this.f4408c = charBufferAllocate;
            }
        } else if (this.f4407b.remaining() < iRemaining) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(m4672e(this.f4407b.capacity() + iRemaining));
            this.f4407b.flip();
            byteBufferAllocate.put(this.f4407b);
            this.f4407b = byteBufferAllocate;
        }
        if (!charBuffer.hasArray()) {
            throw new UnsupportedOperationException("TODO");
        }
        int iM4675a2 = C1932g.m4675a(this.f4406a);
        if (iM4675a2 != 0) {
            if (iM4675a2 == 1) {
                m4670b(charBuffer);
                return;
            } else {
                if (iM4675a2 != 2) {
                    return;
                }
                m4671c(charBuffer);
                return;
            }
        }
        char[] cArrArray = charBuffer.array();
        int iPosition = charBuffer.position() + charBuffer.arrayOffset();
        int iLimit = charBuffer.limit() + charBuffer.arrayOffset();
        byte[] bArrArray = this.f4407b.array();
        int iPosition2 = this.f4407b.position() + this.f4407b.arrayOffset();
        while (iPosition < iLimit) {
            char c = cArrArray[iPosition];
            if (c > 255) {
                charBuffer.position(iPosition - charBuffer.arrayOffset());
                ByteBuffer byteBuffer = this.f4407b;
                byteBuffer.position(iPosition2 - byteBuffer.arrayOffset());
                if (Character.isHighSurrogate(c)) {
                    int iRemaining2 = charBuffer.remaining();
                    this.f4407b.flip();
                    IntBuffer intBufferAllocate2 = IntBuffer.allocate(Math.max(this.f4407b.remaining() + iRemaining2, this.f4407b.capacity() / 4));
                    while (this.f4407b.hasRemaining()) {
                        intBufferAllocate2.put(this.f4407b.get() & 255);
                    }
                    this.f4406a = 3;
                    this.f4407b = null;
                    this.f4409d = intBufferAllocate2;
                    m4671c(charBuffer);
                    return;
                }
                int iRemaining3 = charBuffer.remaining();
                this.f4407b.flip();
                CharBuffer charBufferAllocate2 = CharBuffer.allocate(Math.max(this.f4407b.remaining() + iRemaining3, this.f4407b.capacity() / 2));
                while (this.f4407b.hasRemaining()) {
                    charBufferAllocate2.put((char) (this.f4407b.get() & 255));
                }
                this.f4406a = 2;
                this.f4407b = null;
                this.f4408c = charBufferAllocate2;
                m4670b(charBuffer);
                return;
            }
            bArrArray[iPosition2] = (byte) (c & 255);
            iPosition++;
            iPosition2++;
        }
        charBuffer.position(iPosition - charBuffer.arrayOffset());
        ByteBuffer byteBuffer2 = this.f4407b;
        byteBuffer2.position(iPosition2 - byteBuffer2.arrayOffset());
    }

    /* JADX INFO: renamed from: d */
    public final C1933h m4674d() {
        int iM4675a = C1932g.m4675a(this.f4406a);
        if (iM4675a == 0) {
            this.f4407b.flip();
        } else if (iM4675a == 1) {
            this.f4408c.flip();
        } else if (iM4675a == 2) {
            this.f4409d.flip();
        }
        return new C1933h(this.f4406a, this.f4407b, this.f4408c, this.f4409d);
    }
}
