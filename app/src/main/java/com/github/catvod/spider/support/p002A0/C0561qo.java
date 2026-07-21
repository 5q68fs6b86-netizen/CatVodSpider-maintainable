package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.qo */
/* JADX INFO: loaded from: classes.dex */
public final enum C0561qo extends EnumC0416le {
    public C0561qo() {
        super("InTableText", 9);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        if (abstractC0680uz.f1590g == 5) {
            C0343im c0343im = (C0343im) abstractC0680uz;
            if (c0343im.f1013b.equals(EnumC0416le.f1127aa)) {
                c0801zl.m1922as(this);
                return false;
            }
            c0801zl.f1886ac.add(c0343im.clone());
            return true;
        }
        if (c0801zl.f1886ac.size() > 0) {
            AbstractC0680uz abstractC0680uz2 = c0801zl.f1897q;
            for (C0343im c0343im2 : c0801zl.f1886ac) {
                c0801zl.f1897q = c0343im2;
                if (EnumC0416le.m1371ab(c0343im2)) {
                    c0801zl.m1932bc(c0343im2);
                } else {
                    c0801zl.m1922as(this);
                    boolean zM1847i = AbstractC0727ws.m1847i(c0801zl.m1919ap().f771g.f590c, AbstractC0702vu.f1609ab);
                    C0155bn c0155bn = EnumC0416le.f1134i;
                    if (zM1847i) {
                        c0801zl.f1889af = true;
                        c0155bn.mo1058a(c0343im2, c0801zl);
                        c0801zl.f1889af = false;
                    } else {
                        c0155bn.mo1058a(c0343im2, c0801zl);
                    }
                }
            }
            c0801zl.f1897q = abstractC0680uz2;
            c0801zl.f1886ac.clear();
        }
        c0801zl.f1902v = c0801zl.f1903w;
        return c0801zl.m1945bp(abstractC0680uz);
    }
}
