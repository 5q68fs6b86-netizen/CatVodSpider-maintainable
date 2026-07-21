package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.uy */
/* JADX INFO: loaded from: classes.dex */
public final class C0679uy extends EnumC0709wa {
    public C0679uy() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        char cM1679t = c0606sf.m1679t();
        C0374jq c0374jq = EnumC0709wa.f1656ae;
        if (cM1679t == 0) {
            c0316hm.m1289aj(this);
            c0316hm.m1281ab((char) 65533);
            c0316hm.m1291al(c0374jq);
            return;
        }
        if (cM1679t == '-') {
            c0316hm.m1281ab(cM1679t);
            return;
        }
        if (cM1679t == '<') {
            c0316hm.m1281ab(cM1679t);
            c0316hm.m1291al(EnumC0709wa.f1659ah);
        } else if (cM1679t == '>') {
            c0316hm.m1281ab(cM1679t);
            c0316hm.m1291al(EnumC0709wa.f1703h);
        } else if (cM1679t != 65535) {
            c0316hm.m1281ab(cM1679t);
            c0316hm.m1291al(c0374jq);
        } else {
            c0316hm.m1288ai(this);
            c0316hm.m1291al(EnumC0709wa.f1698c);
        }
    }
}
