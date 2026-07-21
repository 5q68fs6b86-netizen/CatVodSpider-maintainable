package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.mk */
/* JADX INFO: loaded from: classes.dex */
public final class C0449mk extends EnumC0709wa {
    public C0449mk() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        if (c0606sf.m1663ab()) {
            c0316hm.m1288ai(this);
            c0316hm.m1291al(EnumC0709wa.f1698c);
            return;
        }
        char cM1679t = c0606sf.m1679t();
        C0684vc c0684vc = EnumC0709wa.f1719x;
        if (cM1679t == 0) {
            c0316hm.m1289aj(this);
            c0316hm.m1281ab((char) 65533);
            c0316hm.m1291al(c0684vc);
        } else if (cM1679t == '-') {
            c0316hm.m1281ab(cM1679t);
            c0316hm.m1291al(EnumC0709wa.f1721z);
        } else if (cM1679t == '<') {
            c0316hm.m1291al(EnumC0709wa.f1652aa);
        } else {
            c0316hm.m1281ab(cM1679t);
            c0316hm.m1291al(c0684vc);
        }
    }
}
