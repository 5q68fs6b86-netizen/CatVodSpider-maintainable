package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.zj */
/* JADX INFO: loaded from: classes.dex */
public final class C0799zj extends EnumC0416le {
    public C0799zj() {
        super("InRow", 13);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        boolean zM1744n = abstractC0680uz.m1744n();
        C0461mw c0461mw = EnumC0416le.f1136k;
        C0206dk c0206dk = EnumC0416le.f1140o;
        if (zM1744n) {
            C0708w c0708w = (C0708w) abstractC0680uz;
            String str = c0708w.f1730d;
            if (AbstractC0727ws.m1847i(str, AbstractC0702vu.f1643w)) {
                c0801zl.m1917an();
                c0801zl.m1935bf(c0708w);
                c0801zl.f1902v = EnumC0416le.f1142q;
                c0801zl.f1884aa.add(null);
                return true;
            }
            if (!AbstractC0727ws.m1847i(str, AbstractC0702vu.f1612ae)) {
                return c0461mw.mo1058a(abstractC0680uz, c0801zl);
            }
            if (!c0801zl.m1931bb("tr")) {
                c0801zl.m1922as(this);
                return false;
            }
            c0801zl.m1917an();
            c0801zl.m1942bm();
            c0801zl.f1902v = c0206dk;
            return c0801zl.m1945bp(abstractC0680uz);
        }
        if (!abstractC0680uz.m1743m()) {
            return c0461mw.mo1058a(abstractC0680uz, c0801zl);
        }
        String str2 = ((C0667um) abstractC0680uz).f1730d;
        if (str2.equals("tr")) {
            if (!c0801zl.m1931bb(str2)) {
                c0801zl.m1922as(this);
                return false;
            }
            c0801zl.m1917an();
            c0801zl.m1942bm();
            c0801zl.f1902v = c0206dk;
            return true;
        }
        if (str2.equals("table")) {
            if (!c0801zl.m1931bb("tr")) {
                c0801zl.m1922as(this);
                return false;
            }
            c0801zl.m1917an();
            c0801zl.m1942bm();
            c0801zl.f1902v = c0206dk;
            return c0801zl.m1945bp(abstractC0680uz);
        }
        if (!AbstractC0727ws.m1847i(str2, AbstractC0702vu.f1640t)) {
            if (!AbstractC0727ws.m1847i(str2, AbstractC0702vu.f1613af)) {
                return c0461mw.mo1058a(abstractC0680uz, c0801zl);
            }
            c0801zl.m1922as(this);
            return false;
        }
        if (!c0801zl.m1931bb(str2)) {
            c0801zl.m1922as(this);
            return false;
        }
        if (!c0801zl.m1931bb("tr")) {
            return false;
        }
        c0801zl.m1917an();
        c0801zl.m1942bm();
        c0801zl.f1902v = c0206dk;
        return c0801zl.m1945bp(abstractC0680uz);
    }
}
