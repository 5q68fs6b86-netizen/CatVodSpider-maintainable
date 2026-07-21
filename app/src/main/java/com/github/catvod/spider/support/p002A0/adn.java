package com.github.catvod.spider.support.p002A0;

/* JADX INFO: loaded from: classes.dex */
public final enum adn extends EnumC0709wa {
    public adn() {
        super("AttributeValue_doubleQuoted", 37);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        int iM1672ak = c0606sf.m1672ak();
        String strM1680u = c0606sf.m1680u(false);
        if (strM1680u.length() > 0) {
            c0316hm.f911m.m1808w(strM1680u, iM1672ak, c0606sf.m1672ak());
        } else {
            c0316hm.f911m.f1739u = true;
        }
        int iM1672ak2 = c0606sf.m1672ak();
        char cM1679t = c0606sf.m1679t();
        if (cM1679t == 0) {
            c0316hm.m1289aj(this);
            c0316hm.f911m.m1807v((char) 65533, iM1672ak2, c0606sf.m1672ak());
            return;
        }
        if (cM1679t == '\"') {
            c0316hm.m1291al(EnumC0709wa.f1668aq);
            return;
        }
        if (cM1679t != '&') {
            if (cM1679t != 65535) {
                c0316hm.f911m.m1807v(cM1679t, iM1672ak2, c0606sf.m1672ak());
                return;
            } else {
                c0316hm.m1288ai(this);
                c0316hm.m1291al(EnumC0709wa.f1698c);
                return;
            }
        }
        int[] iArrM1294y = c0316hm.m1294y('\"', true);
        if (iArrM1294y != null) {
            c0316hm.f911m.m1809x(iArrM1294y, iM1672ak2, c0606sf.m1672ak());
        } else {
            c0316hm.f911m.m1807v('&', iM1672ak2, c0606sf.m1672ak());
        }
    }
}
