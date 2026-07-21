package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.cs */
/* JADX INFO: loaded from: classes.dex */
public static final class C0187cs extends EnumC0416le {
    public C0187cs() {
        super("AfterAfterBody", 21);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        if (abstractC0680uz.m1740j()) {
            c0801zl.m1934be((C0300gx) abstractC0680uz);
            return true;
        }
        if (abstractC0680uz.m1741k() || (abstractC0680uz.m1744n() && ((C0708w) abstractC0680uz).f1730d.equals("html"))) {
            return EnumC0416le.f1134i.mo1058a(abstractC0680uz, c0801zl);
        }
        if (EnumC0416le.m1371ab(abstractC0680uz)) {
            c0801zl.m1933bd((C0343im) abstractC0680uz, c0801zl.f1894n);
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
