package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.mw */
/* JADX INFO: loaded from: classes.dex */
public static final class C0461mw extends EnumC0416le {
    public C0461mw() {
        super("InTable", 8);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        if (abstractC0680uz.m1739i() && AbstractC0727ws.m1847i(c0801zl.m1919ap().f771g.f590c, AbstractC0702vu.f1609ab)) {
            c0801zl.f1886ac.clear();
            c0801zl.f1903w = c0801zl.f1902v;
            c0801zl.f1902v = EnumC0416le.f1137l;
            return c0801zl.m1945bp(abstractC0680uz);
        }
        if (abstractC0680uz.m1740j()) {
            c0801zl.m1934be((C0300gx) abstractC0680uz);
            return true;
        }
        if (abstractC0680uz.m1741k()) {
            c0801zl.m1922as(this);
            return false;
        }
        boolean zM1744n = abstractC0680uz.m1744n();
        C0284gh c0284gh = EnumC0416le.f1131f;
        if (!zM1744n) {
            if (!abstractC0680uz.m1743m()) {
                if (!abstractC0680uz.m1742l()) {
                    m1440b(abstractC0680uz, c0801zl);
                    return true;
                }
                if (c0801zl.m1920aq("html")) {
                    c0801zl.m1922as(this);
                }
                return true;
            }
            String str = ((C0667um) abstractC0680uz).f1730d;
            if (str.equals("table")) {
                if (!c0801zl.m1931bb(str)) {
                    c0801zl.m1922as(this);
                    return false;
                }
                c0801zl.m1943bn("table");
                c0801zl.m1953bx();
            } else {
                if (AbstractC0727ws.m1847i(str, AbstractC0702vu.f1608aa)) {
                    c0801zl.m1922as(this);
                    return false;
                }
                if (!str.equals("template")) {
                    m1440b(abstractC0680uz, c0801zl);
                    return true;
                }
                c0284gh.mo1058a(abstractC0680uz, c0801zl);
            }
            return true;
        }
        C0708w c0708w = (C0708w) abstractC0680uz;
        String str2 = c0708w.f1730d;
        if (str2.equals("caption")) {
            c0801zl.m1916am();
            c0801zl.f1884aa.add(null);
            c0801zl.m1935bf(c0708w);
            c0801zl.f1902v = EnumC0416le.f1138m;
        } else if (str2.equals("colgroup")) {
            c0801zl.m1916am();
            c0801zl.m1935bf(c0708w);
            c0801zl.f1902v = EnumC0416le.f1139n;
        } else {
            if (str2.equals("col")) {
                c0801zl.m1916am();
                c0801zl.m1947br("colgroup");
                return c0801zl.m1945bp(abstractC0680uz);
            }
            if (AbstractC0727ws.m1847i(str2, AbstractC0702vu.f1640t)) {
                c0801zl.m1916am();
                c0801zl.m1935bf(c0708w);
                c0801zl.f1902v = EnumC0416le.f1140o;
            } else {
                if (AbstractC0727ws.m1847i(str2, AbstractC0702vu.f1641u)) {
                    c0801zl.m1916am();
                    c0801zl.m1947br("tbody");
                    return c0801zl.m1945bp(abstractC0680uz);
                }
                if (str2.equals("table")) {
                    c0801zl.m1922as(this);
                    if (!c0801zl.m1931bb(str2)) {
                        return false;
                    }
                    c0801zl.m1943bn(str2);
                    if (c0801zl.m1953bx()) {
                        return c0801zl.m1945bp(abstractC0680uz);
                    }
                    c0801zl.m1935bf(c0708w);
                    return true;
                }
                if (AbstractC0727ws.m1847i(str2, AbstractC0702vu.f1642v)) {
                    return c0284gh.mo1058a(abstractC0680uz, c0801zl);
                }
                if (str2.equals("input")) {
                    C0554qh c0554qh = c0708w.f1732f;
                    if (c0554qh == null || !c0554qh.m1588h("type").equalsIgnoreCase("hidden")) {
                        m1440b(abstractC0680uz, c0801zl);
                        return true;
                    }
                    c0801zl.m1936bg(c0708w);
                } else {
                    if (!str2.equals("form")) {
                        m1440b(abstractC0680uz, c0801zl);
                        return true;
                    }
                    c0801zl.m1922as(this);
                    if (c0801zl.f1906z != null || c0801zl.m1940bk("template")) {
                        return false;
                    }
                    c0801zl.m1938bi(c0708w, false, false);
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m1440b(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        c0801zl.m1922as(this);
        c0801zl.f1889af = true;
        EnumC0416le.f1134i.mo1058a(abstractC0680uz, c0801zl);
        c0801zl.f1889af = false;
    }
}
