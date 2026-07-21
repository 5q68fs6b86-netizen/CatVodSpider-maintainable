package com.github.catvod.spider.support.p134t;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p134t.f */
/* JADX INFO: loaded from: classes.dex */
public final class C2313f {

    /* JADX INFO: renamed from: a */
    private final int f5734a;

    /* JADX INFO: renamed from: b */
    private final ByteBuffer f5735b;

    /* JADX INFO: renamed from: c */
    private final CharBuffer f5736c;

    /* JADX INFO: renamed from: d */
    private final IntBuffer f5737d;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p134t.f$a */
    public static class a {

        /* JADX INFO: renamed from: b */
        private ByteBuffer f5739b;

        /* JADX INFO: renamed from: a */
        private int f5738a = 1;

        /* JADX INFO: renamed from: c */
        private CharBuffer f5740c = null;

        /* JADX INFO: renamed from: d */
        private IntBuffer f5741d = null;

        /* JADX INFO: renamed from: e */
        private int f5742e = -1;

        a(int i) {
            this.f5739b = ByteBuffer.allocate(i);
        }

        /* JADX INFO: renamed from: b */
        private void m6250b(CharBuffer charBuffer) {
            char[] cArrArray = charBuffer.array();
            int iPosition = charBuffer.position() + charBuffer.arrayOffset();
            int iLimit = charBuffer.limit() + charBuffer.arrayOffset();
            char[] cArrArray2 = this.f5740c.array();
            int iPosition2 = this.f5740c.position() + this.f5740c.arrayOffset();
            while (iPosition < iLimit) {
                char c = cArrArray[iPosition];
                if (Character.isHighSurrogate(c)) {
                    charBuffer.position(iPosition - charBuffer.arrayOffset());
                    CharBuffer charBuffer2 = this.f5740c;
                    charBuffer2.position(iPosition2 - charBuffer2.arrayOffset());
                    int iRemaining = charBuffer.remaining();
                    this.f5740c.flip();
                    IntBuffer intBufferAllocate = IntBuffer.allocate(Math.max(this.f5740c.remaining() + iRemaining, this.f5740c.capacity() / 2));
                    while (this.f5740c.hasRemaining()) {
                        intBufferAllocate.put(this.f5740c.get() & 65535);
                    }
                    this.f5738a = 3;
                    this.f5740c = null;
                    this.f5741d = intBufferAllocate;
                    m6251c(charBuffer);
                    return;
                }
                cArrArray2[iPosition2] = c;
                iPosition++;
                iPosition2++;
            }
            charBuffer.position(iPosition - charBuffer.arrayOffset());
            CharBuffer charBuffer3 = this.f5740c;
            charBuffer3.position(iPosition2 - charBuffer3.arrayOffset());
        }

        /* JADX INFO: renamed from: c */
        private void m6251c(CharBuffer charBuffer) {
            char[] cArrArray = charBuffer.array();
            int iPosition = charBuffer.position() + charBuffer.arrayOffset();
            int iLimit = charBuffer.limit() + charBuffer.arrayOffset();
            int[] iArrArray = this.f5741d.array();
            int iPosition2 = this.f5741d.position() + this.f5741d.arrayOffset();
            while (true) {
                int i = -1;
                if (iPosition >= iLimit) {
                    break;
                }
                char c = cArrArray[iPosition];
                iPosition++;
                if (this.f5742e != -1) {
                    if (Character.isLowSurrogate(c)) {
                        iArrArray[iPosition2] = Character.toCodePoint((char) this.f5742e, c);
                    } else {
                        iArrArray[iPosition2] = this.f5742e;
                        iPosition2++;
                        if (!Character.isHighSurrogate(c)) {
                            iArrArray[iPosition2] = 65535 & c;
                        }
                        this.f5742e = i;
                    }
                    iPosition2++;
                    this.f5742e = i;
                } else if (!Character.isHighSurrogate(c)) {
                    iArrArray[iPosition2] = c & 65535;
                    iPosition2++;
                }
                i = c & 65535;
                this.f5742e = i;
            }
            int i2 = this.f5742e;
            if (i2 != -1) {
                iArrArray[iPosition2] = i2 & 65535;
                iPosition2++;
            }
            charBuffer.position(iPosition - charBuffer.arrayOffset());
            IntBuffer intBuffer = this.f5741d;
            intBuffer.position(iPosition2 - intBuffer.arrayOffset());
        }

        /* JADX INFO: renamed from: e */
        private static int m6252e(int i) {
            return (int) Math.pow(2.0d, 32 - Integer.numberOfLeadingZeros(i - 1));
        }

        /* JADX INFO: renamed from: a */
        public final void m6253a(CharBuffer charBuffer) {
            int iRemaining = charBuffer.remaining();
            int iM6255a = C2314g.m6255a(this.f5738a);
            if (iM6255a != 0) {
                if (iM6255a != 1) {
                    if (iM6255a == 2 && this.f5741d.remaining() < iRemaining) {
                        IntBuffer intBufferAllocate = IntBuffer.allocate(m6252e(this.f5741d.capacity() + iRemaining));
                        this.f5741d.flip();
                        intBufferAllocate.put(this.f5741d);
                        this.f5741d = intBufferAllocate;
                    }
                } else if (this.f5740c.remaining() < iRemaining) {
                    CharBuffer charBufferAllocate = CharBuffer.allocate(m6252e(this.f5740c.capacity() + iRemaining));
                    this.f5740c.flip();
                    charBufferAllocate.put(this.f5740c);
                    this.f5740c = charBufferAllocate;
                }
            } else if (this.f5739b.remaining() < iRemaining) {
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(m6252e(this.f5739b.capacity() + iRemaining));
                this.f5739b.flip();
                byteBufferAllocate.put(this.f5739b);
                this.f5739b = byteBufferAllocate;
            }
            if (!charBuffer.hasArray()) {
                throw new UnsupportedOperationException("TODO");
            }
            int iM6255a2 = C2314g.m6255a(this.f5738a);
            if (iM6255a2 != 0) {
                if (iM6255a2 == 1) {
                    m6250b(charBuffer);
                    return;
                } else {
                    if (iM6255a2 != 2) {
                        return;
                    }
                    m6251c(charBuffer);
                    return;
                }
            }
            char[] cArrArray = charBuffer.array();
            int iPosition = charBuffer.position() + charBuffer.arrayOffset();
            int iLimit = charBuffer.limit() + charBuffer.arrayOffset();
            byte[] bArrArray = this.f5739b.array();
            int iPosition2 = this.f5739b.position() + this.f5739b.arrayOffset();
            while (iPosition < iLimit) {
                char c = cArrArray[iPosition];
                if (c > 255) {
                    charBuffer.position(iPosition - charBuffer.arrayOffset());
                    ByteBuffer byteBuffer = this.f5739b;
                    byteBuffer.position(iPosition2 - byteBuffer.arrayOffset());
                    if (Character.isHighSurrogate(c)) {
                        int iRemaining2 = charBuffer.remaining();
                        this.f5739b.flip();
                        IntBuffer intBufferAllocate2 = IntBuffer.allocate(Math.max(this.f5739b.remaining() + iRemaining2, this.f5739b.capacity() / 4));
                        while (this.f5739b.hasRemaining()) {
                            intBufferAllocate2.put(this.f5739b.get() & 255);
                        }
                        this.f5738a = 3;
                        this.f5739b = null;
                        this.f5741d = intBufferAllocate2;
                        m6251c(charBuffer);
                        return;
                    }
                    int iRemaining3 = charBuffer.remaining();
                    this.f5739b.flip();
                    CharBuffer charBufferAllocate2 = CharBuffer.allocate(Math.max(this.f5739b.remaining() + iRemaining3, this.f5739b.capacity() / 2));
                    while (this.f5739b.hasRemaining()) {
                        charBufferAllocate2.put((char) (this.f5739b.get() & 255));
                    }
                    this.f5738a = 2;
                    this.f5739b = null;
                    this.f5740c = charBufferAllocate2;
                    m6250b(charBuffer);
                    return;
                }
                bArrArray[iPosition2] = (byte) (c & 255);
                iPosition++;
                iPosition2++;
            }
            charBuffer.position(iPosition - charBuffer.arrayOffset());
            ByteBuffer byteBuffer2 = this.f5739b;
            byteBuffer2.position(iPosition2 - byteBuffer2.arrayOffset());
        }

        /* JADX INFO: renamed from: d */
        public final C2313f m6254d() {
            int iM6255a = C2314g.m6255a(this.f5738a);
            if (iM6255a == 0) {
                this.f5739b.flip();
            } else if (iM6255a == 1) {
                this.f5740c.flip();
            } else if (iM6255a == 2) {
                this.f5741d.flip();
            }
            return new C2313f(this.f5738a, this.f5739b, this.f5740c, this.f5741d);
        }
    }

    C2313f(int i, ByteBuffer byteBuffer, CharBuffer charBuffer, IntBuffer intBuffer) {
        this.f5734a = i;
        this.f5735b = byteBuffer;
        this.f5736c = charBuffer;
        this.f5737d = intBuffer;
    }

    /* JADX INFO: renamed from: a */
    final int m6243a() {
        int iM6255a = C2314g.m6255a(this.f5734a);
        if (iM6255a == 0) {
            return this.f5735b.arrayOffset();
        }
        if (iM6255a == 1) {
            return this.f5736c.arrayOffset();
        }
        if (iM6255a == 2) {
            return this.f5737d.arrayOffset();
        }
        throw new UnsupportedOperationException("Not reached");
    }

    /* JADX INFO: renamed from: b */
    final byte[] m6244b() {
        return this.f5735b.array();
    }

    /* JADX INFO: renamed from: c */
    final char[] m6245c() {
        return this.f5736c.array();
    }

    /* JADX INFO: renamed from: d */
    final int m6246d() {
        return this.f5734a;
    }

    /* JADX INFO: renamed from: e */
    final int[] m6247e() {
        return this.f5737d.array();
    }

    /* JADX INFO: renamed from: f */
    public final int m6248f() {
        Buffer buffer;
        int iM6255a = C2314g.m6255a(this.f5734a);
        if (iM6255a == 0) {
            buffer = this.f5735b;
        } else if (iM6255a == 1) {
            buffer = this.f5736c;
        } else {
            if (iM6255a != 2) {
                throw new UnsupportedOperationException("Not reached");
            }
            buffer = this.f5737d;
        }
        return buffer.position();
    }

    /* JADX INFO: renamed from: g */
    public final int m6249g() {
        Buffer buffer;
        int iM6255a = C2314g.m6255a(this.f5734a);
        if (iM6255a == 0) {
            buffer = this.f5735b;
        } else if (iM6255a == 1) {
            buffer = this.f5736c;
        } else {
            if (iM6255a != 2) {
                throw new UnsupportedOperationException("Not reached");
            }
            buffer = this.f5737d;
        }
        return buffer.remaining();
    }
}
