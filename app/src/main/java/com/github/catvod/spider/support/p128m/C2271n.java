package com.github.catvod.spider.support.p128m;

import com.github.catvod.spider.support.p116a.C2137a;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p128m.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2271n implements Serializable {

    /* JADX INFO: renamed from: a */
    private int[] f5667a;

    /* JADX INFO: renamed from: b */
    private final ReentrantReadWriteLock f5668b;

    public C2271n(String str) throws Exception {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f5668b = reentrantReadWriteLock;
        int length = str.length();
        if (length < 5 || length >= 256) {
            throw new Exception();
        }
        ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
        writeLock.lock();
        try {
            byte[] bytes = str.getBytes();
            int[] iArr = new int[256];
            for (int i = 0; i < 256; i++) {
                iArr[i] = i;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < 256; i3++) {
                i2 = (((i2 + iArr[i3]) + bytes[i3 % bytes.length]) & 255) % 256;
                int i4 = iArr[i3];
                iArr[i3] = iArr[i2];
                iArr[i2] = i4;
            }
            this.f5667a = iArr;
        } finally {
            writeLock.unlock();
        }
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m6180a(byte[] bArr) {
        ReentrantReadWriteLock.ReadLock lock = this.f5668b.readLock();
        lock.lock();
        try {
            int[] iArr = (int[]) this.f5667a.clone();
            byte[] bArr2 = new byte[bArr.length];
            int i = 0;
            int i2 = 0;
            for (int i3 = 0; i3 < bArr.length; i3++) {
                i = (i + 1) % 256;
                i2 = (i2 + iArr[i]) % 256;
                int i4 = iArr[i];
                iArr[i] = iArr[i2];
                iArr[i2] = i4;
                bArr2[i3] = (byte) (iArr[(iArr[i] + iArr[i2]) % 256] ^ bArr[i3]);
            }
            lock.unlock();
            return bArr2;
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final String m6181b(byte[] bArr) {
        Charset.defaultCharset();
        return new String(m6180a(bArr));
    }

    /* JADX INFO: renamed from: c */
    public final String m6182c(String str) {
        byte[] bArrM6180a = m6180a(str.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : bArrM6180a) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = '0' + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: d */
    public final byte[] m6183d(String str) {
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("invalid hex string");
        }
        char[] charArray = str.toCharArray();
        byte[] bArr = new byte[str.length() / 2];
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            StringBuilder sbM5396a = C2137a.m5396a("");
            int i3 = i + 1;
            sbM5396a.append(charArray[i]);
            sbM5396a.append(charArray[i3]);
            bArr[i2] = new Integer(Integer.parseInt(sbM5396a.toString(), 16) & 255).byteValue();
            i = i3 + 1;
            i2++;
        }
        return bArr;
    }
}
