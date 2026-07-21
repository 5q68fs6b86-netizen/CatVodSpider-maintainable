package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.cp */
/* JADX INFO: loaded from: classes.dex */
public static final class C0184cp extends EnumC0709wa {
    public C0184cp() {
        super("Data", 0);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        char cM1662aa = c0606sf.m1662aa();
        if (cM1662aa == 0) {
            c0316hm.m1289aj(this);
            c0316hm.m1281ab(c0606sf.m1679t());
        } else {
            if (cM1662aa == '&') {
                c0316hm.m1292w(EnumC0709wa.f1699d);
                return;
            }
            if (cM1662aa == '<') {
                c0316hm.m1292w(EnumC0709wa.f1705j);
            } else if (cM1662aa != 65535) {
                c0316hm.m1283ad(c0606sf.m1681v());
            } else {
                c0316hm.m1282ac(new aaw());
            }
        }
    }
}
