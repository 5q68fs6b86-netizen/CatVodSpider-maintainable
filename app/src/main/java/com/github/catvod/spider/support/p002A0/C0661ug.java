package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ug */
/* JADX INFO: loaded from: classes.dex */
public final enum C0661ug extends EnumC0709wa {
    public C0661ug() {
        super("PLAINTEXT", 6);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        char cM1662aa = c0606sf.m1662aa();
        if (cM1662aa == 0) {
            c0316hm.m1289aj(this);
            c0606sf.m1676q();
            c0316hm.m1281ab((char) 65533);
        } else if (cM1662aa != 65535) {
            c0316hm.m1283ad(c0606sf.m1683x((char) 0));
        } else {
            c0316hm.m1282ac(new aaw());
        }
    }
}
