package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.va */
/* JADX INFO: loaded from: classes.dex */
public final class C0682va extends EnumC0709wa {
    public C0682va() {
        super("TagOpen", 7);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        char cM1662aa = c0606sf.m1662aa();
        if (cM1662aa == '!') {
            c0316hm.m1292w(EnumC0709wa.f1671at);
            return;
        }
        if (cM1662aa == '/') {
            c0316hm.m1292w(EnumC0709wa.f1706k);
            return;
        }
        if (cM1662aa == '?') {
            c0316hm.f914p.mo904a();
            c0316hm.m1291al(EnumC0709wa.f1670as);
        } else if (c0606sf.m1669ah()) {
            c0316hm.m1295z(true);
            c0316hm.m1291al(EnumC0709wa.f1707l);
        } else {
            c0316hm.m1289aj(this);
            c0316hm.m1281ab('<');
            c0316hm.m1291al(EnumC0709wa.f1698c);
        }
    }
}
