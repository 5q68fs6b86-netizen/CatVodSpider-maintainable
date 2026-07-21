package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.dh */
/* JADX INFO: loaded from: classes.dex */
public final class C0203dh extends EnumC0709wa {
    public C0203dh() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        int iM1672ak = c0606sf.m1672ak();
        String strM1685z = c0606sf.m1685z(EnumC0709wa.f1696bs);
        if (strM1685z.length() > 0) {
            c0316hm.f911m.m1808w(strM1685z, iM1672ak, c0606sf.m1672ak());
        }
        int iM1672ak2 = c0606sf.m1672ak();
        char cM1679t = c0606sf.m1679t();
        if (cM1679t == 0) {
            c0316hm.m1289aj(this);
            c0316hm.f911m.m1807v((char) 65533, iM1672ak2, c0606sf.m1672ak());
            return;
        }
        if (cM1679t != ' ') {
            if (cM1679t != '\"' && cM1679t != '`') {
                C0184cp c0184cp = EnumC0709wa.f1698c;
                if (cM1679t == 65535) {
                    c0316hm.m1288ai(this);
                    c0316hm.m1291al(c0184cp);
                    return;
                }
                if (cM1679t != '\t' && cM1679t != '\n' && cM1679t != '\f' && cM1679t != '\r') {
                    if (cM1679t == '&') {
                        int[] iArrM1294y = c0316hm.m1294y('>', true);
                        if (iArrM1294y != null) {
                            c0316hm.f911m.m1809x(iArrM1294y, iM1672ak2, c0606sf.m1672ak());
                            return;
                        } else {
                            c0316hm.f911m.m1807v('&', iM1672ak2, c0606sf.m1672ak());
                            return;
                        }
                    }
                    if (cM1679t != '\'') {
                        switch (cM1679t) {
                            case '<':
                            case '=':
                                break;
                            case '>':
                                c0316hm.m1287ah();
                                c0316hm.m1291al(c0184cp);
                                break;
                            default:
                                c0316hm.f911m.m1807v(cM1679t, iM1672ak2, c0606sf.m1672ak());
                                break;
                        }
                        return;
                    }
                }
            }
            c0316hm.m1289aj(this);
            c0316hm.f911m.m1807v(cM1679t, iM1672ak2, c0606sf.m1672ak());
            return;
        }
        c0316hm.m1291al(EnumC0709wa.f1661aj);
    }
}
