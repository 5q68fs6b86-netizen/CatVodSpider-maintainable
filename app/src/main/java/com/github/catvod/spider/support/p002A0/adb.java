package com.github.catvod.spider.support.p002A0;

/* JADX INFO: loaded from: classes.dex */
public static final class adb extends EnumC0709wa {
    public adb() {
        super("SelfClosingStartTag", 41);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        char cM1679t = c0606sf.m1679t();
        C0184cp c0184cp = EnumC0709wa.f1698c;
        if (cM1679t == '>') {
            c0316hm.f911m.f1731e = true;
            c0316hm.m1287ah();
            c0316hm.m1291al(c0184cp);
        } else if (cM1679t == 65535) {
            c0316hm.m1288ai(this);
            c0316hm.m1291al(c0184cp);
        } else {
            c0606sf.m1675an();
            c0316hm.m1289aj(this);
            c0316hm.m1291al(EnumC0709wa.f1661aj);
        }
    }
}
