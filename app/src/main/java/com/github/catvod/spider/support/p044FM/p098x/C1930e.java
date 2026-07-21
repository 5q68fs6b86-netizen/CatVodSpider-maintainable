package com.github.catvod.spider.support.p044FM.p098x;

import com.github.catvod.spider.support.p044FM.p045A.C1288n;
import java.nio.CharBuffer;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p098x.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1930e implements InterfaceC1920F {

    /* JADX INFO: renamed from: a */
    public static final C1930e f4405a = new C1930e();

    /* JADX INFO: renamed from: b */
    public static AbstractC1937l m4668b(String str) {
        C1931f c1931f = new C1931f(str.length());
        CharBuffer charBufferAllocate = CharBuffer.allocate(str.length());
        charBufferAllocate.put(str);
        charBufferAllocate.flip();
        c1931f.m4673a(charBufferAllocate);
        C1933h c1933hM4674d = c1931f.m4674d();
        int iM4675a = C1932g.m4675a(c1933hM4674d.m4680d());
        if (iM4675a == 0) {
            int iM4682f = c1933hM4674d.m4682f();
            int iM4683g = c1933hM4674d.m4683g();
            byte[] bArrM4678b = c1933hM4674d.m4678b();
            c1933hM4674d.m4677a();
            return new C1936k(iM4682f, iM4683g, bArrM4678b);
        }
        if (iM4675a == 1) {
            int iM4682f2 = c1933hM4674d.m4682f();
            int iM4683g2 = c1933hM4674d.m4683g();
            char[] cArrM4679c = c1933hM4674d.m4679c();
            c1933hM4674d.m4677a();
            return new C1934i(iM4682f2, iM4683g2, cArrM4679c);
        }
        if (iM4675a != 2) {
            throw new UnsupportedOperationException("Not reached");
        }
        int iM4682f3 = c1933hM4674d.m4682f();
        int iM4683g3 = c1933hM4674d.m4683g();
        int[] iArrM4681e = c1933hM4674d.m4681e();
        c1933hM4674d.m4677a();
        return new C1935j(iM4682f3, iM4683g3, iArrM4681e);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC1919E m4669a(C1288n c1288n, int i, String str, int i2, int i3, int i4, int i5, int i6) {
        C1938m c1938m = new C1938m(c1288n, i, i2, i3, i4);
        c1938m.f4422b = i5;
        c1938m.f4423c = i6;
        if (str != null) {
            c1938m.f4426f = str;
        }
        return c1938m;
    }
}
