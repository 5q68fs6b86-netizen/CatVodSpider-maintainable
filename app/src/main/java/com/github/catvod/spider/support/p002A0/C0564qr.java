package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.qr */
/* JADX INFO: loaded from: classes.dex */
public final class C0564qr extends EnumC0416le {
    public C0564qr() {
        super("InColumnGroup", 11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        if (EnumC0416le.m1371ab(abstractC0680uz)) {
            c0801zl.m1932bc((C0343im) abstractC0680uz);
            return true;
        }
        int iM1764h = AbstractC0710wb.m1764h(abstractC0680uz.f1590g);
        if (iM1764h != 0) {
            C0284gh c0284gh = EnumC0416le.f1131f;
            if (iM1764h == 1) {
                C0708w c0708w = (C0708w) abstractC0680uz;
                String str = c0708w.f1730d;
                str.getClass();
                switch (str) {
                    case "template":
                        c0284gh.mo1058a(abstractC0680uz, c0801zl);
                        break;
                    case "col":
                        c0801zl.m1936bg(c0708w);
                        break;
                    case "html":
                        return EnumC0416le.f1134i.mo1058a(abstractC0680uz, c0801zl);
                    default:
                        return m1596b(abstractC0680uz, c0801zl);
                }
            } else if (iM1764h == 2) {
                String str2 = ((C0667um) abstractC0680uz).f1730d;
                str2.getClass();
                if (str2.equals("template")) {
                    c0284gh.mo1058a(abstractC0680uz, c0801zl);
                } else {
                    if (!str2.equals("colgroup")) {
                        return m1596b(abstractC0680uz, c0801zl);
                    }
                    if (!c0801zl.m1920aq(str2)) {
                        c0801zl.m1922as(this);
                        return false;
                    }
                    c0801zl.m1942bm();
                    c0801zl.f1902v = EnumC0416le.f1136k;
                }
            } else {
                if (iM1764h != 3) {
                    if (iM1764h == 5 && c0801zl.m1920aq("html")) {
                        return true;
                    }
                    return m1596b(abstractC0680uz, c0801zl);
                }
                c0801zl.m1934be((C0300gx) abstractC0680uz);
            }
        } else {
            c0801zl.m1922as(this);
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1596b(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        if (!c0801zl.m1920aq("colgroup")) {
            c0801zl.m1922as(this);
            return false;
        }
        c0801zl.m1942bm();
        c0801zl.f1902v = EnumC0416le.f1136k;
        c0801zl.m1945bp(abstractC0680uz);
        return true;
    }
}
