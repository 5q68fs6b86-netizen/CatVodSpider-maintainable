package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.dk */
/* JADX INFO: loaded from: classes.dex */
public final class C0206dk extends EnumC0416le {
    public C0206dk() {
        super("InTableBody", 12);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        int iM1764h = AbstractC0710wb.m1764h(abstractC0680uz.f1590g);
        C0461mw c0461mw = EnumC0416le.f1136k;
        if (iM1764h == 1) {
            C0708w c0708w = (C0708w) abstractC0680uz;
            String str = c0708w.f1730d;
            if (!str.equals("tr")) {
                if (!AbstractC0727ws.m1847i(str, AbstractC0702vu.f1643w)) {
                    return AbstractC0727ws.m1847i(str, AbstractC0702vu.f1610ac) ? m1127b(abstractC0680uz, c0801zl) : c0461mw.mo1058a(abstractC0680uz, c0801zl);
                }
                c0801zl.m1922as(this);
                c0801zl.m1947br("tr");
                return c0801zl.m1945bp(c0708w);
            }
            c0801zl.m1915al("tbody", "tfoot", "thead", "template");
            c0801zl.m1935bf(c0708w);
            c0801zl.f1902v = EnumC0416le.f1141p;
        } else {
            if (iM1764h != 2) {
                return c0461mw.mo1058a(abstractC0680uz, c0801zl);
            }
            String str2 = ((C0667um) abstractC0680uz).f1730d;
            if (!AbstractC0727ws.m1847i(str2, AbstractC0702vu.f1616ai)) {
                if (str2.equals("table")) {
                    return m1127b(abstractC0680uz, c0801zl);
                }
                if (!AbstractC0727ws.m1847i(str2, AbstractC0702vu.f1611ad)) {
                    return c0461mw.mo1058a(abstractC0680uz, c0801zl);
                }
                c0801zl.m1922as(this);
                return false;
            }
            if (!c0801zl.m1931bb(str2)) {
                c0801zl.m1922as(this);
                return false;
            }
            c0801zl.m1915al("tbody", "tfoot", "thead", "template");
            c0801zl.m1942bm();
            c0801zl.f1902v = c0461mw;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1127b(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        if (!c0801zl.m1931bb("tbody") && !c0801zl.m1931bb("thead") && !c0801zl.m1928ay("tfoot")) {
            c0801zl.m1922as(this);
            return false;
        }
        c0801zl.m1915al("tbody", "tfoot", "thead", "template");
        c0801zl.m1946bq(c0801zl.m1919ap().f771g.f590c);
        return c0801zl.m1945bp(abstractC0680uz);
    }
}
