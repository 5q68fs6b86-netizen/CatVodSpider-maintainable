package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ka */
/* JADX INFO: loaded from: classes.dex */
public final enum C0385ka extends EnumC0709wa {
    public C0385ka() {
        super("CharacterReferenceInRcdata", 3);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        C0377jt c0377jt = EnumC0709wa.f1700e;
        int[] iArrM1294y = c0316hm.m1294y(null, false);
        if (iArrM1294y == null) {
            c0316hm.m1281ab('&');
        } else {
            c0316hm.m1283ad(new String(iArrM1294y, 0, iArrM1294y.length));
        }
        c0316hm.m1291al(c0377jt);
    }
}
