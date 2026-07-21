package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.mg */
/* JADX INFO: loaded from: classes.dex */
public final class C0445mg extends EnumC0416le {
    public C0445mg() {
        super("InFrameset", 19);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        if (EnumC0416le.m1371ab(abstractC0680uz)) {
            c0801zl.m1932bc((C0343im) abstractC0680uz);
        } else if (abstractC0680uz.m1740j()) {
            c0801zl.m1934be((C0300gx) abstractC0680uz);
        } else {
            if (abstractC0680uz.m1741k()) {
                c0801zl.m1922as(this);
                return false;
            }
            if (abstractC0680uz.m1744n()) {
                C0708w c0708w = (C0708w) abstractC0680uz;
                String str = c0708w.f1730d;
                str.getClass();
                switch (str) {
                    case "frameset":
                        c0801zl.m1935bf(c0708w);
                        break;
                    case "html":
                        return EnumC0416le.f1134i.mo1058a(c0708w, c0801zl);
                    case "frame":
                        c0801zl.m1936bg(c0708w);
                        break;
                    case "noframes":
                        return EnumC0416le.f1131f.mo1058a(c0708w, c0801zl);
                    default:
                        c0801zl.m1922as(this);
                        return false;
                }
            } else if (abstractC0680uz.m1743m() && ((C0667um) abstractC0680uz).f1730d.equals("frameset")) {
                if (c0801zl.m1920aq("html")) {
                    c0801zl.m1922as(this);
                    return false;
                }
                c0801zl.m1942bm();
                if (!c0801zl.m1920aq("frameset")) {
                    c0801zl.f1902v = EnumC0416le.f1148w;
                }
            } else {
                if (!abstractC0680uz.m1742l()) {
                    c0801zl.m1922as(this);
                    return false;
                }
                if (!c0801zl.m1920aq("html")) {
                    c0801zl.m1922as(this);
                }
            }
        }
        return true;
    }
}
