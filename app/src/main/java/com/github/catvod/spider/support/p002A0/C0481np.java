package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.np */
/* JADX INFO: loaded from: classes.dex */
public final enum C0481np extends EnumC0416le {
    public C0481np() {
        super("BeforeHtml", 1);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        if (abstractC0680uz.m1741k()) {
            c0801zl.m1922as(this);
            return false;
        }
        if (abstractC0680uz.m1740j()) {
            c0801zl.m1934be((C0300gx) abstractC0680uz);
            return true;
        }
        if (EnumC0416le.m1371ab(abstractC0680uz)) {
            c0801zl.m1932bc((C0343im) abstractC0680uz);
            return true;
        }
        boolean zM1744n = abstractC0680uz.m1744n();
        C0567qu c0567qu = EnumC0416le.f1130e;
        if (zM1744n) {
            C0708w c0708w = (C0708w) abstractC0680uz;
            if (c0708w.f1730d.equals("html")) {
                c0801zl.m1935bf(c0708w);
                c0801zl.f1902v = c0567qu;
                return true;
            }
        }
        if (abstractC0680uz.m1743m() && AbstractC0727ws.m1847i(((C0667um) abstractC0680uz).f1730d, AbstractC0702vu.f1625e)) {
            c0801zl.m1947br("html");
            c0801zl.f1902v = c0567qu;
            return c0801zl.m1945bp(abstractC0680uz);
        }
        if (abstractC0680uz.m1743m()) {
            c0801zl.m1922as(this);
            return false;
        }
        c0801zl.m1947br("html");
        c0801zl.f1902v = c0567qu;
        return c0801zl.m1945bp(abstractC0680uz);
    }
}
