package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.df */
/* JADX INFO: loaded from: classes.dex */
public final enum C0201df extends EnumC0709wa {
    public C0201df() {
        super("Doctype", 50);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        char cM1679t = c0606sf.m1679t();
        C0660uf c0660uf = EnumC0709wa.f1679bb;
        if (cM1679t == '\t' || cM1679t == '\n' || cM1679t == '\f' || cM1679t == '\r' || cM1679t == ' ') {
            c0316hm.m1291al(c0660uf);
            return;
        }
        if (cM1679t != '>') {
            if (cM1679t != 65535) {
                c0316hm.m1289aj(this);
                c0316hm.m1291al(c0660uf);
                return;
            }
            c0316hm.m1288ai(this);
        }
        c0316hm.m1289aj(this);
        C0476nk c0476nk = c0316hm.f913o;
        c0476nk.mo904a();
        c0476nk.f1284f = true;
        c0316hm.m1286ag();
        c0316hm.m1291al(EnumC0709wa.f1698c);
    }
}
