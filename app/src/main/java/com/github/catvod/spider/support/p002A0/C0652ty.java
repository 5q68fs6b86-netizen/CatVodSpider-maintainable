package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.ty */
/* JADX INFO: loaded from: classes.dex */
public static final class C0652ty extends EnumC0709wa {
    public C0652ty() {
        super("AfterDoctypeName", 53);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        boolean zM1663ab = c0606sf.m1663ab();
        C0184cp c0184cp = EnumC0709wa.f1698c;
        if (zM1663ab) {
            c0316hm.m1288ai(this);
            c0316hm.f913o.f1284f = true;
            c0316hm.m1286ag();
            c0316hm.m1291al(c0184cp);
            return;
        }
        if (c0606sf.m1668ag('\t', '\n', '\r', '\f', ' ')) {
            c0606sf.m1676q();
            return;
        }
        if (c0606sf.m1667af('>')) {
            c0316hm.m1286ag();
            c0316hm.m1292w(c0184cp);
            return;
        }
        if (c0606sf.m1666ae("PUBLIC")) {
            c0316hm.f913o.f1281c = "PUBLIC";
            c0316hm.m1291al(EnumC0709wa.f1682be);
        } else if (c0606sf.m1666ae("SYSTEM")) {
            c0316hm.f913o.f1281c = "SYSTEM";
            c0316hm.m1291al(EnumC0709wa.f1688bk);
        } else {
            c0316hm.m1289aj(this);
            c0316hm.f913o.f1284f = true;
            c0316hm.m1292w(EnumC0709wa.f1693bp);
        }
    }
}
