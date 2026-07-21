package com.github.catvod.spider.support.p002A0;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.lk */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0422lk {
    /* JADX INFO: renamed from: a */
    public static String m1384a(byte[] bArr) throws IOException {
        GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr2 = new byte[1024];
        while (true) {
            int i = gZIPInputStream.read(bArr2);
            if (i == -1) {
                return byteArrayOutputStream.toString("UTF-8");
            }
            byteArrayOutputStream.write(bArr2, 0, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static void m1385b(InterfaceC0304ha interfaceC0304ha, AbstractC0521pb abstractC0521pb, AbstractC0521pb abstractC0521pb2) {
        try {
            AbstractC0552qf.m1583e(C0372jo.f1077i, AbstractC0313hj.m1276a(((AbstractC0555qi) interfaceC0304ha).create(abstractC0521pb, abstractC0521pb2)));
        } catch (Throwable th) {
            abstractC0521pb2.resumeWith(act.m953b(th));
        }
    }
}
