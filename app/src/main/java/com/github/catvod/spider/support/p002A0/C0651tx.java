package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.tx */
/* JADX INFO: loaded from: classes.dex */
public final class C0651tx extends EnumC0709wa {
    public C0651tx() {
        super("BeforeAttributeName", 33);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        char cM1679t = c0606sf.m1679t();
        aan aanVar = EnumC0709wa.f1662ak;
        if (cM1679t == 0) {
            c0606sf.m1675an();
            c0316hm.m1289aj(this);
            c0316hm.f911m.m1805ac();
            c0316hm.m1291al(aanVar);
            return;
        }
        if (cM1679t != ' ') {
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
                if (cM1679t == '\t' || cM1679t == '\n' || cM1679t == '\f' || cM1679t == '\r') {
                    return;
                }
                if (cM1679t != '=') {
                    if (cM1679t == '>') {
                        c0316hm.m1287ah();
                        c0316hm.m1291al(c0184cp);
                        return;
                    } else {
                        c0316hm.f911m.m1805ac();
                        c0606sf.m1675an();
                        c0316hm.m1291al(aanVar);
                        return;
                    }
                }
            }
            c0316hm.m1289aj(this);
            c0316hm.f911m.m1805ac();
            AbstractC0719wk abstractC0719wk = c0316hm.f911m;
            abstractC0719wk.m1811z(c0606sf.m1672ak() - 1, c0606sf.m1672ak());
            abstractC0719wk.f1734p.append(cM1679t);
            c0316hm.m1291al(aanVar);
        }
    }
}
