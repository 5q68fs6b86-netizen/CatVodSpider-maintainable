package com.github.catvod.spider.support.p116a;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.ZipException;

/* JADX INFO: renamed from: com.github.catvod.spider.support.a.f */
/* JADX INFO: loaded from: classes.dex */
final class C2142f {

    /* JADX INFO: renamed from: com.github.catvod.spider.support.a.f$a */
    static class a {

        /* JADX INFO: renamed from: a */
        long f5021a;

        /* JADX INFO: renamed from: b */
        long f5022b;

        a() {
        }
    }

    /* JADX INFO: renamed from: a */
    static a m5417a(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length() - 22;
        if (length < 0) {
            StringBuilder sbM5396a = C2137a.m5396a("File too short to be a zip file: ");
            sbM5396a.append(randomAccessFile.length());
            throw new ZipException(sbM5396a.toString());
        }
        long j = length - 65536;
        long j2 = j >= 0 ? j : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(length);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                a aVar = new a();
                aVar.f5022b = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                aVar.f5021a = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & 4294967295L;
                return aVar;
            }
            length--;
        } while (length >= j2);
        throw new ZipException("End Of Central Directory signature not found");
    }
}
