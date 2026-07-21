package com.github.catvod.spider.support.p002A0;

/* JADX INFO: loaded from: classes.dex */
public final class aan extends EnumC0709wa {
    public aan() {
        super("AttributeName", 34);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        int iM1672ak = c0606sf.m1672ak();
        String strM1685z = c0606sf.m1685z(EnumC0709wa.f1695br);
        AbstractC0719wk abstractC0719wk = c0316hm.f911m;
        int iM1672ak2 = c0606sf.m1672ak();
        abstractC0719wk.getClass();
        String strReplace = strM1685z.replace((char) 0, (char) 65533);
        abstractC0719wk.m1811z(iM1672ak, iM1672ak2);
        StringBuilder sb = abstractC0719wk.f1734p;
        if (sb.length() == 0) {
            abstractC0719wk.f1733o = strReplace;
        } else {
            sb.append(strReplace);
        }
        int iM1672ak3 = c0606sf.m1672ak();
        char cM1679t = c0606sf.m1679t();
        if (cM1679t == '\t' || cM1679t == '\n' || cM1679t == '\f' || cM1679t == '\r' || cM1679t == ' ') {
            c0316hm.m1291al(EnumC0709wa.f1663al);
            return;
        }
        if (cM1679t != '\"' && cM1679t != '\'') {
            if (cM1679t == '/') {
                c0316hm.m1291al(EnumC0709wa.f1669ar);
                return;
            }
            C0184cp c0184cp = EnumC0709wa.f1698c;
            if (cM1679t == 65535) {
                c0316hm.m1288ai(this);
                c0316hm.m1291al(c0184cp);
                return;
            }
            switch (cM1679t) {
                case '<':
                    break;
                case '=':
                    c0316hm.m1291al(EnumC0709wa.f1664am);
                    break;
                case '>':
                    c0316hm.m1287ah();
                    c0316hm.m1291al(c0184cp);
                    break;
                default:
                    AbstractC0719wk abstractC0719wk2 = c0316hm.f911m;
                    abstractC0719wk2.m1811z(iM1672ak3, c0606sf.m1672ak());
                    abstractC0719wk2.f1734p.append(cM1679t);
                    break;
            }
            return;
        }
        c0316hm.m1289aj(this);
        AbstractC0719wk abstractC0719wk3 = c0316hm.f911m;
        abstractC0719wk3.m1811z(iM1672ak3, c0606sf.m1672ak());
        abstractC0719wk3.f1734p.append(cM1679t);
    }
}
