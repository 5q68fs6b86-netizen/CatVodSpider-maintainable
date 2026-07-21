package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.gu */
/* JADX INFO: loaded from: classes.dex */
public final class C0297gu extends EnumC0709wa {
    public C0297gu() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        if (c0606sf.m1669ah()) {
            c0316hm.m1280aa();
            c0316hm.f908j.append(c0606sf.m1662aa());
            c0316hm.m1283ad("<");
            c0316hm.m1281ab(c0606sf.m1662aa());
            c0316hm.m1292w(EnumC0709wa.f1655ad);
            return;
        }
        if (c0606sf.m1667af('/')) {
            c0316hm.m1280aa();
            c0316hm.m1292w(EnumC0709wa.f1653ab);
        } else {
            c0316hm.m1281ab('<');
            c0316hm.m1291al(EnumC0709wa.f1719x);
        }
    }
}
