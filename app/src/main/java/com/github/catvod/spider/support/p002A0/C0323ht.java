package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ht */
/* JADX INFO: loaded from: classes.dex */
public final class C0323ht extends EnumC0709wa {
    public C0323ht() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        char cM1679t = c0606sf.m1679t();
        C0651tx c0651tx = EnumC0709wa.f1661aj;
        if (cM1679t == '\t' || cM1679t == '\n' || cM1679t == '\f' || cM1679t == '\r' || cM1679t == ' ') {
            c0316hm.m1291al(c0651tx);
            return;
        }
        if (cM1679t == '/') {
            c0316hm.m1291al(EnumC0709wa.f1669ar);
            return;
        }
        C0184cp c0184cp = EnumC0709wa.f1698c;
        if (cM1679t == '>') {
            c0316hm.m1287ah();
            c0316hm.m1291al(c0184cp);
        } else if (cM1679t == 65535) {
            c0316hm.m1288ai(this);
            c0316hm.m1291al(c0184cp);
        } else {
            c0606sf.m1675an();
            c0316hm.m1289aj(this);
            c0316hm.m1291al(c0651tx);
        }
    }
}
