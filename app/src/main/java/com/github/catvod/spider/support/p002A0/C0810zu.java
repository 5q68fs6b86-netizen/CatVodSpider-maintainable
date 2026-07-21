package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.zu */
/* JADX INFO: loaded from: classes.dex */
public static final class C0810zu extends EnumC0416le {
    public C0810zu() {
        super("InHeadNoscript", 4);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        if (abstractC0680uz.m1741k()) {
            c0801zl.m1922as(this);
        } else {
            if (abstractC0680uz.m1744n() && ((C0708w) abstractC0680uz).f1730d.equals("html")) {
                return EnumC0416le.f1134i.mo1058a(abstractC0680uz, c0801zl);
            }
            boolean zM1743m = abstractC0680uz.m1743m();
            C0284gh c0284gh = EnumC0416le.f1131f;
            if (!zM1743m || !((C0667um) abstractC0680uz).f1730d.equals("noscript")) {
                if (EnumC0416le.m1371ab(abstractC0680uz) || abstractC0680uz.m1740j() || (abstractC0680uz.m1744n() && AbstractC0727ws.m1847i(((C0708w) abstractC0680uz).f1730d, AbstractC0702vu.f1626f))) {
                    return c0284gh.mo1058a(abstractC0680uz, c0801zl);
                }
                if (abstractC0680uz.m1743m() && ((C0667um) abstractC0680uz).f1730d.equals("br")) {
                    c0801zl.m1922as(this);
                    C0343im c0343im = new C0343im(5);
                    c0343im.f1013b = abstractC0680uz.toString();
                    c0801zl.m1932bc(c0343im);
                    return true;
                }
                if ((abstractC0680uz.m1744n() && AbstractC0727ws.m1847i(((C0708w) abstractC0680uz).f1730d, AbstractC0702vu.f1617aj)) || abstractC0680uz.m1743m()) {
                    c0801zl.m1922as(this);
                    return false;
                }
                c0801zl.m1922as(this);
                C0343im c0343im2 = new C0343im(5);
                c0343im2.f1013b = abstractC0680uz.toString();
                c0801zl.m1932bc(c0343im2);
                return true;
            }
            c0801zl.m1942bm();
            c0801zl.f1902v = c0284gh;
        }
        return true;
    }
}
