package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.vh */
/* JADX INFO: loaded from: classes.dex */
public final enum C0689vh extends EnumC0709wa {
    public C0689vh() {
        super("BeforeAttributeValue", 36);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        char cM1679t = c0606sf.m1679t();
        C0203dh c0203dh = EnumC0709wa.f1667ap;
        if (cM1679t == 0) {
            c0316hm.m1289aj(this);
            c0316hm.f911m.m1807v((char) 65533, c0606sf.m1672ak() - 1, c0606sf.m1672ak());
            c0316hm.m1291al(c0203dh);
            return;
        }
        if (cM1679t != ' ') {
            if (cM1679t == '\"') {
                c0316hm.m1291al(EnumC0709wa.f1665an);
                return;
            }
            if (cM1679t != '`') {
                C0184cp c0184cp = EnumC0709wa.f1698c;
                if (cM1679t == 65535) {
                    c0316hm.m1288ai(this);
                    c0316hm.m1287ah();
                    c0316hm.m1291al(c0184cp);
                    return;
                }
                if (cM1679t == '\t' || cM1679t == '\n' || cM1679t == '\f' || cM1679t == '\r') {
                    return;
                }
                if (cM1679t == '&') {
                    c0606sf.m1675an();
                    c0316hm.m1291al(c0203dh);
                    return;
                }
                if (cM1679t == '\'') {
                    c0316hm.m1291al(EnumC0709wa.f1666ao);
                    return;
                }
                switch (cM1679t) {
                    case '<':
                    case '=':
                        break;
                    case '>':
                        c0316hm.m1289aj(this);
                        c0316hm.m1287ah();
                        c0316hm.m1291al(c0184cp);
                        break;
                    default:
                        c0606sf.m1675an();
                        c0316hm.m1291al(c0203dh);
                        break;
                }
                return;
            }
            c0316hm.m1289aj(this);
            c0316hm.f911m.m1807v(cM1679t, c0606sf.m1672ak() - 1, c0606sf.m1672ak());
            c0316hm.m1291al(c0203dh);
        }
    }
}
