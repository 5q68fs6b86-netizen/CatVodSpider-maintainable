package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p002A0.ba */
/* JADX INFO: loaded from: classes.dex */
public final class C0142ba extends EnumC0709wa {
    public C0142ba() {
        super("EndTagOpen", 8);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        boolean zM1663ab = c0606sf.m1663ab();
        C0184cp c0184cp = EnumC0709wa.f1698c;
        if (zM1663ab) {
            c0316hm.m1288ai(this);
            c0316hm.m1283ad("</");
            c0316hm.m1291al(c0184cp);
        } else if (c0606sf.m1669ah()) {
            c0316hm.m1295z(false);
            c0316hm.m1291al(EnumC0709wa.f1707l);
        } else {
            if (c0606sf.m1667af('>')) {
                c0316hm.m1289aj(this);
                c0316hm.m1292w(c0184cp);
                return;
            }
            c0316hm.m1289aj(this);
            C0300gx c0300gx = c0316hm.f914p;
            c0300gx.mo904a();
            c0300gx.m1261d('/');
            c0316hm.m1291al(EnumC0709wa.f1670as);
        }
    }
}
