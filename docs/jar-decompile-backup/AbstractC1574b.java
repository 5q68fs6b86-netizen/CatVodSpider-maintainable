package com.github.catvod.spider.support.p044FM.p059O;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p059O.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1574b {
    /* JADX INFO: renamed from: g */
    private boolean m3801g(byte b) {
        int i = b & 255;
        return i < 65 || (i > 90 && i < 97) || i > 122;
    }

    /* JADX INFO: renamed from: a */
    public final ByteBuffer m3802a(byte[] bArr, int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        int i2 = i + 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (i3 < i2) {
            byte b = bArr[i3];
            if (b == 62) {
                z = false;
            } else if (b == 60) {
                z = true;
            }
            if (((b & 128) == 0) && m3801g(b)) {
                if (i3 > i4 && !z) {
                    byteBufferAllocate.put(bArr, i4, i3 - i4);
                    byteBufferAllocate.put((byte) 32);
                }
                i4 = i3 + 1;
            }
            i3++;
        }
        if (!z && i3 > i4) {
            byteBufferAllocate.put(bArr, i4, i3 - i4);
        }
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: b */
    public final ByteBuffer m3803b(byte[] bArr, int i) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i);
        int i2 = i + 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (i3 < i2) {
            byte b = bArr[i3];
            if (!((b & 128) == 0)) {
                z = true;
            } else if (m3801g(b)) {
                if (!z || i3 <= i4) {
                    i4 = i3 + 1;
                } else {
                    byteBufferAllocate.put(bArr, i4, i3 - i4);
                    byteBufferAllocate.put((byte) 32);
                    i4 = i3 + 1;
                    z = false;
                }
            }
            i3++;
        }
        if (z && i3 > i4) {
            byteBufferAllocate.put(bArr, i4, i3 - i4);
        }
        return byteBufferAllocate;
    }

    /* JADX INFO: renamed from: c */
    public abstract String mo3796c();

    /* JADX INFO: renamed from: d */
    public abstract float mo3797d();

    /* JADX INFO: renamed from: e */
    public abstract int mo3798e();

    /* JADX INFO: renamed from: f */
    public abstract int mo3799f(byte[] bArr, int i);

    /* JADX INFO: renamed from: h */
    public abstract void mo3800h();
}
