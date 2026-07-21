package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ij */
/* JADX INFO: loaded from: classes.dex */
public final class C0340ij extends EnumC0416le {
    public C0340ij() {
        super("AfterHead", 5);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        if (EnumC0416le.m1371ab(abstractC0680uz)) {
            c0801zl.m1932bc((C0343im) abstractC0680uz);
        } else if (abstractC0680uz.m1740j()) {
            c0801zl.m1934be((C0300gx) abstractC0680uz);
        } else if (abstractC0680uz.m1741k()) {
            c0801zl.m1922as(this);
        } else {
            boolean zM1744n = abstractC0680uz.m1744n();
            C0284gh c0284gh = EnumC0416le.f1131f;
            if (zM1744n) {
                C0708w c0708w = (C0708w) abstractC0680uz;
                String str = c0708w.f1730d;
                boolean zEquals = str.equals("html");
                C0155bn c0155bn = EnumC0416le.f1134i;
                if (zEquals) {
                    return c0155bn.mo1058a(abstractC0680uz, c0801zl);
                }
                if (str.equals("body")) {
                    c0801zl.m1935bf(c0708w);
                    c0801zl.f1888ae = false;
                    c0801zl.f1902v = c0155bn;
                } else if (str.equals("frameset")) {
                    c0801zl.m1935bf(c0708w);
                    c0801zl.f1902v = EnumC0416le.f1147v;
                } else if (AbstractC0727ws.m1847i(str, AbstractC0702vu.f1627g)) {
                    c0801zl.m1922as(this);
                    C0226ed c0226ed = c0801zl.f1905y;
                    c0801zl.f1895o.add(c0226ed);
                    c0284gh.mo1058a(abstractC0680uz, c0801zl);
                    c0801zl.m1951bv(c0226ed);
                } else {
                    if (str.equals("head")) {
                        c0801zl.m1922as(this);
                        return false;
                    }
                    c0801zl.m1947br("body");
                    c0801zl.f1888ae = true;
                    c0801zl.m1945bp(abstractC0680uz);
                }
            } else if (abstractC0680uz.m1743m()) {
                String str2 = ((C0667um) abstractC0680uz).f1730d;
                if (AbstractC0727ws.m1847i(str2, AbstractC0702vu.f1624d)) {
                    c0801zl.m1947br("body");
                    c0801zl.f1888ae = true;
                    c0801zl.m1945bp(abstractC0680uz);
                } else {
                    if (!str2.equals("template")) {
                        c0801zl.m1922as(this);
                        return false;
                    }
                    c0284gh.mo1058a(abstractC0680uz, c0801zl);
                }
            } else {
                c0801zl.m1947br("body");
                c0801zl.f1888ae = true;
                c0801zl.m1945bp(abstractC0680uz);
            }
        }
        return true;
    }
}
