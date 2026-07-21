package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.vt */
/* JADX INFO: loaded from: classes.dex */
public final class C0701vt extends EnumC0416le {
    public C0701vt() {
        super("AfterBody", 18);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        C0226ed c0226edM1926aw = c0801zl.m1926aw("html");
        boolean zM1371ab = EnumC0416le.m1371ab(abstractC0680uz);
        C0155bn c0155bn = EnumC0416le.f1134i;
        if (zM1371ab) {
            if (c0226edM1926aw != null) {
                c0801zl.m1933bd((C0343im) abstractC0680uz, c0226edM1926aw);
                return true;
            }
            c0155bn.mo1058a(abstractC0680uz, c0801zl);
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
            return c0155bn.mo1058a(abstractC0680uz, c0801zl);
        }
        if (abstractC0680uz.m1743m() && ((C0667um) abstractC0680uz).f1730d.equals("html")) {
            c0801zl.f1902v = EnumC0416le.f1149x;
            return true;
        }
        if (abstractC0680uz.m1742l()) {
            return true;
        }
        c0801zl.m1922as(this);
        c0801zl.m1952bw();
        return c0801zl.m1945bp(abstractC0680uz);
    }
}
