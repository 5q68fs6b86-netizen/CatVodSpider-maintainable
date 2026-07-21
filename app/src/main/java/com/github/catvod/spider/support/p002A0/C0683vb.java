package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.vb */
/* JADX INFO: loaded from: classes.dex */
public static final class C0683vb extends EnumC0709wa {
    public C0683vb() {
        super("CommentStartDash", 45);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        char cM1679t = c0606sf.m1679t();
        C0507oo c0507oo = EnumC0709wa.f1674aw;
        if (cM1679t == 0) {
            c0316hm.m1289aj(this);
            c0316hm.f914p.m1261d((char) 65533);
            c0316hm.m1291al(c0507oo);
            return;
        }
        if (cM1679t == '-') {
            c0316hm.m1291al(EnumC0709wa.f1676ay);
            return;
        }
        C0184cp c0184cp = EnumC0709wa.f1698c;
        if (cM1679t == '>') {
            c0316hm.m1289aj(this);
            c0316hm.m1285af();
            c0316hm.m1291al(c0184cp);
        } else if (cM1679t != 65535) {
            c0316hm.f914p.m1261d(cM1679t);
            c0316hm.m1291al(c0507oo);
        } else {
            c0316hm.m1288ai(this);
            c0316hm.m1285af();
            c0316hm.m1291al(c0184cp);
        }
    }
}
