package com.github.catvod.spider.support.p002A0;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes.dex */
public abstract class aai {
    /* JADX INFO: renamed from: a */
    public static C0619ss m896a(String str) {
        int length = str.length();
        C0617sq c0617sq = new C0617sq();
        c0617sq.f1504a = 1;
        c0617sq.f1505b = ByteBuffer.allocate(length);
        c0617sq.f1506c = null;
        c0617sq.f1507d = null;
        c0617sq.f1508e = -1;
        CharBuffer charBufferAllocate = CharBuffer.allocate(str.length());
        charBufferAllocate.put(str);
        charBufferAllocate.flip();
        int iRemaining = charBufferAllocate.remaining();
        int iM1764h = AbstractC0710wb.m1764h(c0617sq.f1504a);
        if (iM1764h != 0) {
            if (iM1764h != 1) {
                if (iM1764h == 2 && c0617sq.f1507d.remaining() < iRemaining) {
                    IntBuffer intBufferAllocate = IntBuffer.allocate(C0617sq.m1691f(c0617sq.f1507d.capacity() + iRemaining));
                    c0617sq.f1507d.flip();
                    intBufferAllocate.put(c0617sq.f1507d);
                    c0617sq.f1507d = intBufferAllocate;
                }
            } else if (c0617sq.f1506c.remaining() < iRemaining) {
                CharBuffer charBufferAllocate2 = CharBuffer.allocate(C0617sq.m1691f(c0617sq.f1506c.capacity() + iRemaining));
                c0617sq.f1506c.flip();
                charBufferAllocate2.put(c0617sq.f1506c);
                c0617sq.f1506c = charBufferAllocate2;
            }
        } else if (c0617sq.f1505b.remaining() < iRemaining) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(C0617sq.m1691f(c0617sq.f1505b.capacity() + iRemaining));
            c0617sq.f1505b.flip();
            byteBufferAllocate.put(c0617sq.f1505b);
            c0617sq.f1505b = byteBufferAllocate;
        }
        if (!charBufferAllocate.hasArray()) {
            throw new UnsupportedOperationException("TODO");
        }
        int iM1764h2 = AbstractC0710wb.m1764h(c0617sq.f1504a);
        if (iM1764h2 == 0) {
            char[] cArrArray = charBufferAllocate.array();
            int iPosition = charBufferAllocate.position() + charBufferAllocate.arrayOffset();
            int iLimit = charBufferAllocate.limit() + charBufferAllocate.arrayOffset();
            byte[] bArrArray = c0617sq.f1505b.array();
            int iPosition2 = c0617sq.f1505b.position() + c0617sq.f1505b.arrayOffset();
            while (true) {
                if (iPosition < iLimit) {
                    char c = cArrArray[iPosition];
                    if (c > 255) {
                        charBufferAllocate.position(iPosition - charBufferAllocate.arrayOffset());
                        ByteBuffer byteBuffer = c0617sq.f1505b;
                        byteBuffer.position(iPosition2 - byteBuffer.arrayOffset());
                        if (!Character.isHighSurrogate(c)) {
                            int iRemaining2 = charBufferAllocate.remaining();
                            c0617sq.f1505b.flip();
                            CharBuffer charBufferAllocate3 = CharBuffer.allocate(Math.max(c0617sq.f1505b.remaining() + iRemaining2, c0617sq.f1505b.capacity() / 2));
                            while (c0617sq.f1505b.hasRemaining()) {
                                charBufferAllocate3.put((char) (c0617sq.f1505b.get() & 255));
                            }
                            c0617sq.f1504a = 2;
                            c0617sq.f1505b = null;
                            c0617sq.f1506c = charBufferAllocate3;
                            c0617sq.m1692g(charBufferAllocate);
                            break;
                        }
                        int iRemaining3 = charBufferAllocate.remaining();
                        c0617sq.f1505b.flip();
                        IntBuffer intBufferAllocate2 = IntBuffer.allocate(Math.max(c0617sq.f1505b.remaining() + iRemaining3, c0617sq.f1505b.capacity() / 4));
                        while (c0617sq.f1505b.hasRemaining()) {
                            intBufferAllocate2.put(c0617sq.f1505b.get() & 255);
                        }
                        c0617sq.f1504a = 3;
                        c0617sq.f1505b = null;
                        c0617sq.f1507d = intBufferAllocate2;
                        c0617sq.m1693h(charBufferAllocate);
                        break;
                    }
                    bArrArray[iPosition2] = (byte) (c & 255);
                    iPosition++;
                    iPosition2++;
                } else {
                    charBufferAllocate.position(iPosition - charBufferAllocate.arrayOffset());
                    ByteBuffer byteBuffer2 = c0617sq.f1505b;
                    byteBuffer2.position(iPosition2 - byteBuffer2.arrayOffset());
                    break;
                }
            }
        } else if (iM1764h2 == 1) {
            c0617sq.m1692g(charBufferAllocate);
        } else if (iM1764h2 == 2) {
            c0617sq.m1693h(charBufferAllocate);
        }
        int iM1764h3 = AbstractC0710wb.m1764h(c0617sq.f1504a);
        if (iM1764h3 == 0) {
            c0617sq.f1505b.flip();
        } else if (iM1764h3 == 1) {
            c0617sq.f1506c.flip();
        } else if (iM1764h3 == 2) {
            c0617sq.f1507d.flip();
        }
        int i = c0617sq.f1504a;
        ByteBuffer byteBuffer3 = c0617sq.f1505b;
        CharBuffer charBuffer = c0617sq.f1506c;
        IntBuffer intBuffer = c0617sq.f1507d;
        C0618sr c0618sr = new C0618sr(i, byteBuffer3, charBuffer, intBuffer);
        int iM1764h4 = AbstractC0710wb.m1764h(i);
        if (iM1764h4 == 0) {
            c0618sr.m1695f();
            int iM1696g = c0618sr.m1696g();
            byte[] bArrArray2 = byteBuffer3.array();
            c0618sr.m1694e();
            return new C0619ss(iM1696g, bArrArray2, 2);
        }
        if (iM1764h4 == 1) {
            c0618sr.m1695f();
            int iM1696g2 = c0618sr.m1696g();
            char[] cArrArray2 = charBuffer.array();
            c0618sr.m1694e();
            return new C0619ss(iM1696g2, cArrArray2, 0);
        }
        if (iM1764h4 != 2) {
            throw new UnsupportedOperationException("Not reached");
        }
        c0618sr.m1695f();
        int iM1696g3 = c0618sr.m1696g();
        int[] iArrArray = intBuffer.array();
        c0618sr.m1694e();
        return new C0619ss(iM1696g3, iArrArray, 1);
    }
}
