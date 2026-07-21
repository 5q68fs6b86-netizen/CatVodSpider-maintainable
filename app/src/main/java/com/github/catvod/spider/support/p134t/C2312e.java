package com.github.catvod.spider.support.p134t;

import java.nio.CharBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p134t.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2312e {
    /* JADX INFO: renamed from: a */
    public static AbstractC2315h m6242a(String str) {
        C2313f.a aVar = new C2313f.a(str.length());
        CharBuffer charBufferAllocate = CharBuffer.allocate(str.length());
        charBufferAllocate.put(str);
        charBufferAllocate.flip();
        aVar.m6253a(charBufferAllocate);
        C2313f c2313fM6254d = aVar.m6254d();
        int iM6255a = C2314g.m6255a(c2313fM6254d.m6246d());
        if (iM6255a == 0) {
            int iM6248f = c2313fM6254d.m6248f();
            int iM6249g = c2313fM6254d.m6249g();
            byte[] bArrM6244b = c2313fM6254d.m6244b();
            c2313fM6254d.m6243a();
            return new AbstractC2315h.c(iM6248f, iM6249g, bArrM6244b);
        }
        if (iM6255a == 1) {
            int iM6248f2 = c2313fM6254d.m6248f();
            int iM6249g2 = c2313fM6254d.m6249g();
            char[] cArrM6245c = c2313fM6254d.m6245c();
            c2313fM6254d.m6243a();
            return new AbstractC2315h.a(iM6248f2, iM6249g2, cArrM6245c);
        }
        if (iM6255a != 2) {
            throw new UnsupportedOperationException("Not reached");
        }
        int iM6248f3 = c2313fM6254d.m6248f();
        int iM6249g3 = c2313fM6254d.m6249g();
        int[] iArrM6247e = c2313fM6254d.m6247e();
        c2313fM6254d.m6243a();
        return new AbstractC2315h.b(iM6248f3, iM6249g3, iArrM6247e);
    }
}
