package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.gh */
/* JADX INFO: loaded from: classes.dex */
public final class C0284gh extends EnumC0416le {
    public C0284gh() {
        super("InHead", 3);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        if (EnumC0416le.m1371ab(abstractC0680uz)) {
            c0801zl.m1932bc((C0343im) abstractC0680uz);
            return true;
        }
        int iM1764h = AbstractC0710wb.m1764h(abstractC0680uz.f1590g);
        if (iM1764h == 0) {
            c0801zl.m1922as(this);
            return false;
        }
        if (iM1764h == 1) {
            C0708w c0708w = (C0708w) abstractC0680uz;
            String str = c0708w.f1730d;
            if (str.equals("html")) {
                return EnumC0416le.f1134i.mo1058a(abstractC0680uz, c0801zl);
            }
            if (AbstractC0727ws.m1847i(str, AbstractC0702vu.f1607a)) {
                C0226ed c0226edM1936bg = c0801zl.m1936bg(c0708w);
                if (str.equals("base") && c0226edM1936bg.m1229av("href") && !c0801zl.f1904x) {
                    String strMo1226as = c0226edM1936bg.mo1226as("href");
                    if (strMo1226as.length() != 0) {
                        c0801zl.f1896p = strMo1226as;
                        c0801zl.f1904x = true;
                        C0235em c0235em = c0801zl.f1894n;
                        c0235em.getClass();
                        c0235em.m1159aa(strMo1226as);
                    }
                }
            } else if (str.equals("meta")) {
                c0801zl.m1936bg(c0708w);
            } else {
                boolean zEquals = str.equals("title");
                C0263fn c0263fn = EnumC0416le.f1135j;
                if (zEquals) {
                    c0801zl.f1893m.m1291al(EnumC0709wa.f1700e);
                    c0801zl.f1903w = c0801zl.f1902v;
                    c0801zl.f1902v = c0263fn;
                    c0801zl.m1935bf(c0708w);
                } else if (AbstractC0727ws.m1847i(str, AbstractC0702vu.f1622b)) {
                    EnumC0416le.m1372ac(c0708w, c0801zl);
                } else if (str.equals("noscript")) {
                    c0801zl.m1935bf(c0708w);
                    c0801zl.f1902v = EnumC0416le.f1132g;
                } else if (str.equals("script")) {
                    c0801zl.f1893m.m1291al(EnumC0709wa.f1703h);
                    c0801zl.f1903w = c0801zl.f1902v;
                    c0801zl.f1902v = c0263fn;
                    c0801zl.m1935bf(c0708w);
                } else {
                    if (str.equals("head")) {
                        c0801zl.m1922as(this);
                        return false;
                    }
                    if (!str.equals("template")) {
                        c0801zl.m1946bq("head");
                        return c0801zl.m1945bp(abstractC0680uz);
                    }
                    c0801zl.m1935bf(c0708w);
                    c0801zl.f1884aa.add(null);
                    c0801zl.f1888ae = false;
                    C0185cq c0185cq = EnumC0416le.f1145t;
                    c0801zl.f1902v = c0185cq;
                    c0801zl.m1948bs(c0185cq);
                }
            }
        } else if (iM1764h == 2) {
            String str2 = ((C0667um) abstractC0680uz).f1730d;
            if (str2.equals("head")) {
                c0801zl.m1942bm();
                c0801zl.f1902v = EnumC0416le.f1133h;
            } else {
                if (AbstractC0727ws.m1847i(str2, AbstractC0702vu.f1623c)) {
                    c0801zl.m1946bq("head");
                    return c0801zl.m1945bp(abstractC0680uz);
                }
                if (!str2.equals("template")) {
                    c0801zl.m1922as(this);
                    return false;
                }
                if (c0801zl.m1940bk(str2)) {
                    c0801zl.m1924au(true);
                    if (!c0801zl.m1920aq(str2)) {
                        c0801zl.m1922as(this);
                    }
                    c0801zl.m1943bn(str2);
                    c0801zl.m1914ak();
                    c0801zl.m1944bo();
                    c0801zl.m1953bx();
                } else {
                    c0801zl.m1922as(this);
                }
            }
        } else {
            if (iM1764h != 3) {
                c0801zl.m1946bq("head");
                return c0801zl.m1945bp(abstractC0680uz);
            }
            c0801zl.m1934be((C0300gx) abstractC0680uz);
        }
        return true;
    }
}
