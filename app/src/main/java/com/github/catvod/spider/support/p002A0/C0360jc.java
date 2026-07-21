package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.jc */
/* JADX INFO: loaded from: classes.dex */
public static final class C0360jc extends EnumC0709wa {
    public C0360jc() {
        super("BogusDoctype", 65);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        char cM1679t = c0606sf.m1679t();
        C0184cp c0184cp = EnumC0709wa.f1698c;
        if (cM1679t == '>') {
            c0316hm.m1286ag();
            c0316hm.m1291al(c0184cp);
        } else {
            if (cM1679t != 65535) {
                return;
            }
            c0316hm.m1286ag();
            c0316hm.m1291al(c0184cp);
        }
    }
}
