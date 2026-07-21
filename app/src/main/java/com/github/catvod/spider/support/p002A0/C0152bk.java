package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.bk */
/* JADX INFO: loaded from: classes.dex */
public static final class C0152bk extends EnumC0709wa {
    public C0152bk() {
        super("AfterDoctypePublicKeyword", 54);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        char cM1679t = c0606sf.m1679t();
        if (cM1679t == '\t' || cM1679t == '\n' || cM1679t == '\f' || cM1679t == '\r' || cM1679t == ' ') {
            c0316hm.m1291al(EnumC0709wa.f1683bf);
            return;
        }
        if (cM1679t == '\"') {
            c0316hm.m1289aj(this);
            c0316hm.m1291al(EnumC0709wa.f1684bg);
            return;
        }
        if (cM1679t == '\'') {
            c0316hm.m1289aj(this);
            c0316hm.m1291al(EnumC0709wa.f1685bh);
            return;
        }
        C0184cp c0184cp = EnumC0709wa.f1698c;
        if (cM1679t == '>') {
            c0316hm.m1289aj(this);
            c0316hm.f913o.f1284f = true;
            c0316hm.m1286ag();
            c0316hm.m1291al(c0184cp);
            return;
        }
        if (cM1679t != 65535) {
            c0316hm.m1289aj(this);
            c0316hm.f913o.f1284f = true;
            c0316hm.m1291al(EnumC0709wa.f1693bp);
        } else {
            c0316hm.m1288ai(this);
            c0316hm.f913o.f1284f = true;
            c0316hm.m1286ag();
            c0316hm.m1291al(c0184cp);
        }
    }
}
