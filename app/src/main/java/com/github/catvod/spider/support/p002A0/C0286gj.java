package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.gj */
/* JADX INFO: loaded from: classes.dex */
public final class C0286gj extends EnumC0416le {
    public C0286gj() {
        super("InCaption", 10);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        boolean zM1743m = abstractC0680uz.m1743m();
        C0461mw c0461mw = EnumC0416le.f1136k;
        if (zM1743m && ((C0667um) abstractC0680uz).f1730d.equals("caption")) {
            if (!c0801zl.m1931bb("caption")) {
                c0801zl.m1922as(this);
                return false;
            }
            c0801zl.m1924au(false);
            if (!c0801zl.m1920aq("caption")) {
                c0801zl.m1922as(this);
            }
            c0801zl.m1943bn("caption");
            c0801zl.m1914ak();
            c0801zl.f1902v = c0461mw;
            return true;
        }
        if ((!abstractC0680uz.m1744n() || !AbstractC0727ws.m1847i(((C0708w) abstractC0680uz).f1730d, AbstractC0702vu.f1646z)) && (!abstractC0680uz.m1743m() || !((C0667um) abstractC0680uz).f1730d.equals("table"))) {
            if (!abstractC0680uz.m1743m() || !AbstractC0727ws.m1847i(((C0667um) abstractC0680uz).f1730d, AbstractC0702vu.f1618ak)) {
                return EnumC0416le.f1134i.mo1058a(abstractC0680uz, c0801zl);
            }
            c0801zl.m1922as(this);
            return false;
        }
        if (!c0801zl.m1931bb("caption")) {
            c0801zl.m1922as(this);
            return false;
        }
        c0801zl.m1924au(false);
        if (!c0801zl.m1920aq("caption")) {
            c0801zl.m1922as(this);
        }
        c0801zl.m1943bn("caption");
        c0801zl.m1914ak();
        c0801zl.f1902v = c0461mw;
        c0461mw.mo1058a(abstractC0680uz, c0801zl);
        return true;
    }
}
