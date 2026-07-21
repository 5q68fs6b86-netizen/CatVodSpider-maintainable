package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.vc */
/* JADX INFO: loaded from: classes.dex */
public final class C0684vc extends EnumC0709wa {
    public C0684vc() {
        super("ScriptDataEscaped", 21);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        if (c0606sf.m1663ab()) {
            c0316hm.m1288ai(this);
            c0316hm.m1291al(EnumC0709wa.f1698c);
            return;
        }
        char cM1662aa = c0606sf.m1662aa();
        if (cM1662aa == 0) {
            c0316hm.m1289aj(this);
            c0606sf.m1676q();
            c0316hm.m1281ab((char) 65533);
        } else if (cM1662aa == '-') {
            c0316hm.m1281ab('-');
            c0316hm.m1292w(EnumC0709wa.f1720y);
        } else if (cM1662aa != '<') {
            c0316hm.m1283ad(c0606sf.m1684y('-', '<', 0));
        } else {
            c0316hm.m1292w(EnumC0709wa.f1652aa);
        }
    }
}
