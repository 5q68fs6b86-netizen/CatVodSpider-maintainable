package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.cq */
/* JADX INFO: loaded from: classes.dex */
public final class C0185cq extends EnumC0416le {
    public C0185cq() {
        super("InTemplate", 17);
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00e4  */
    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        int iM1764h = AbstractC0710wb.m1764h(abstractC0680uz.f1590g);
        C0155bn c0155bn = EnumC0416le.f1134i;
        if (iM1764h != 0) {
            C0284gh c0284gh = EnumC0416le.f1131f;
            if (iM1764h == 1) {
                String str = ((C0708w) abstractC0680uz).f1730d;
                if (!AbstractC0727ws.m1847i(str, AbstractC0702vu.f1619al)) {
                    if (AbstractC0727ws.m1847i(str, AbstractC0702vu.f1620am)) {
                        c0801zl.m1944bo();
                        C0461mw c0461mw = EnumC0416le.f1136k;
                        c0801zl.m1948bs(c0461mw);
                        c0801zl.f1902v = c0461mw;
                        return c0801zl.m1945bp(abstractC0680uz);
                    }
                    if (str.equals("col")) {
                        c0801zl.m1944bo();
                        C0564qr c0564qr = EnumC0416le.f1139n;
                        c0801zl.m1948bs(c0564qr);
                        c0801zl.f1902v = c0564qr;
                        return c0801zl.m1945bp(abstractC0680uz);
                    }
                    if (str.equals("tr")) {
                        c0801zl.m1944bo();
                        C0206dk c0206dk = EnumC0416le.f1140o;
                        c0801zl.m1948bs(c0206dk);
                        c0801zl.f1902v = c0206dk;
                        return c0801zl.m1945bp(abstractC0680uz);
                    }
                    if (!str.equals("td") && !str.equals("th")) {
                        c0801zl.m1944bo();
                        c0801zl.m1948bs(c0155bn);
                        c0801zl.f1902v = c0155bn;
                        return c0801zl.m1945bp(abstractC0680uz);
                    }
                    c0801zl.m1944bo();
                    C0799zj c0799zj = EnumC0416le.f1141p;
                    c0801zl.m1948bs(c0799zj);
                    c0801zl.f1902v = c0799zj;
                    return c0801zl.m1945bp(abstractC0680uz);
                }
                c0284gh.mo1058a(abstractC0680uz, c0801zl);
            } else if (iM1764h != 2) {
                if (iM1764h != 3 && iM1764h != 4) {
                    if (iM1764h != 5 || !c0801zl.m1940bk("template")) {
                        return true;
                    }
                    c0801zl.m1922as(this);
                    c0801zl.m1943bn("template");
                    c0801zl.m1914ak();
                    c0801zl.m1944bo();
                    c0801zl.m1953bx();
                    if (c0801zl.f1902v == EnumC0416le.f1145t || c0801zl.f1885ab.size() >= 12) {
                        return true;
                    }
                    return c0801zl.m1945bp(abstractC0680uz);
                }
                c0155bn.mo1058a(abstractC0680uz, c0801zl);
            } else {
                if (!((C0667um) abstractC0680uz).f1730d.equals("template")) {
                    c0801zl.m1922as(this);
                    return false;
                }
                c0284gh.mo1058a(abstractC0680uz, c0801zl);
            }
        } else {
            c0155bn.mo1058a(abstractC0680uz, c0801zl);
        }
        return true;
    }
}
