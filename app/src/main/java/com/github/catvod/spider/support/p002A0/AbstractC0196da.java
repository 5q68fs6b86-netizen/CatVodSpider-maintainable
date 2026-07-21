package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.da */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0196da {
    /* JADX INFO: renamed from: a */
    public static final void m1093a(int i, int i2) {
        if (i <= i2) {
            return;
        }
        throw new IndexOutOfBoundsException("toIndex (" + i + ") is greater than size (" + i2 + ").");
    }

    /* JADX INFO: renamed from: b */
    public static final Object m1094b(C0178cj c0178cj, C0178cj c0178cj2, InterfaceC0304ha interfaceC0304ha) throws Throwable {
        Object c0647tt;
        Object objM1027aa;
        c0178cj.m1510am();
        try {
            AbstractC0199dd.m1117b(interfaceC0304ha);
            c0647tt = interfaceC0304ha.invoke(c0178cj2, c0178cj);
        } catch (Throwable th) {
            c0647tt = new C0647tt(th, false);
        }
        EnumC0781ys enumC0781ys = EnumC0781ys.f1859a;
        if (c0647tt == enumC0781ys || (objM1027aa = c0178cj.m1027aa(c0647tt)) == AbstractC0745xj.f1805b) {
            return enumC0781ys;
        }
        if (objM1027aa instanceof C0647tt) {
            throw ((C0647tt) objM1027aa).f1565c;
        }
        return AbstractC0745xj.m1873j(objM1027aa);
    }
}
