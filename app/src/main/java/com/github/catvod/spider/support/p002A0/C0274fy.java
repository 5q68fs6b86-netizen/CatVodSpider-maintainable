package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.fy */
/* JADX INFO: loaded from: classes.dex */
public final class C0274fy extends EnumC0416le {
    public C0274fy() {
        super("Initial", 0);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0416le
    /* JADX INFO: renamed from: a */
    public final boolean mo1058a(AbstractC0680uz abstractC0680uz, C0801zl c0801zl) {
        if (EnumC0416le.m1371ab(abstractC0680uz)) {
            return true;
        }
        if (abstractC0680uz.m1740j()) {
            c0801zl.m1934be((C0300gx) abstractC0680uz);
        } else {
            boolean zM1741k = abstractC0680uz.m1741k();
            C0481np c0481np = EnumC0416le.f1129d;
            if (!zM1741k) {
                c0801zl.f1894n.f785am = 2;
                c0801zl.f1902v = c0481np;
                return c0801zl.m1945bp(abstractC0680uz);
            }
            C0476nk c0476nk = (C0476nk) abstractC0680uz;
            C0707vz c0707vz = c0801zl.f1898r;
            String string = c0476nk.f1280b.toString();
            c0707vz.getClass();
            String strTrim = string.trim();
            if (!c0707vz.f1650c) {
                strTrim = AbstractC0552qf.m1581c(strTrim);
            }
            String string2 = c0476nk.f1282d.toString();
            String string3 = c0476nk.f1283e.toString();
            C0236en c0236en = new C0236en(strTrim);
            AbstractC0711wc.m1770e(string2);
            AbstractC0711wc.m1770e(string3);
            c0236en.m1731e("#doctype", strTrim);
            c0236en.m1731e("publicId", string2);
            c0236en.m1731e("systemId", string3);
            if (c0236en.m1193a("publicId")) {
                c0236en.m1731e("pubSysKey", "PUBLIC");
            } else if (c0236en.m1193a("systemId")) {
                c0236en.m1731e("pubSysKey", "SYSTEM");
            }
            String str = c0476nk.f1281c;
            if (str != null) {
                c0236en.m1731e("pubSysKey", str);
            }
            c0801zl.f1894n.m1180y(c0236en);
            if (c0476nk.f1284f || !c0236en.mo1228au("#doctype").equals("html") || c0236en.mo1228au("publicId").equalsIgnoreCase("HTML")) {
                c0801zl.f1894n.f785am = 2;
            }
            c0801zl.f1902v = c0481np;
        }
        return true;
    }
}
