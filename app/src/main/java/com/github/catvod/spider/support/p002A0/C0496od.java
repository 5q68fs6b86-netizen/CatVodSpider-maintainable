package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.od */
/* JADX INFO: loaded from: classes.dex */
public final class C0496od extends EnumC0416le {
    public C0496od() {
        super("AfterFrameset", 20);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        if (EnumC0416le.m1371ab(abstractC0680uz)) {
            c0801zl.m1932bc((C0343im) abstractC0680uz);
            return true;
        }
        if (abstractC0680uz.m1740j()) {
            c0801zl.m1934be((C0300gx) abstractC0680uz);
            return true;
        }
        if (abstractC0680uz.m1741k()) {
            c0801zl.m1922as(this);
            return false;
        }
        if (abstractC0680uz.m1744n() && ((C0708w) abstractC0680uz).f1730d.equals("html")) {
            return EnumC0416le.f1134i.mo1058a(abstractC0680uz, c0801zl);
        }
        if (abstractC0680uz.m1743m() && ((C0667um) abstractC0680uz).f1730d.equals("html")) {
            c0801zl.f1902v = EnumC0416le.f1150y;
            return true;
        }
        if (abstractC0680uz.m1744n() && ((C0708w) abstractC0680uz).f1730d.equals("noframes")) {
            return EnumC0416le.f1131f.mo1058a(abstractC0680uz, c0801zl);
        }
        if (abstractC0680uz.m1742l()) {
            return true;
        }
        c0801zl.m1922as(this);
        return false;
    }
}
