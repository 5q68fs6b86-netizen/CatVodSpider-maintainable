package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.lz */
/* JADX INFO: loaded from: classes.dex */
public static final class C0437lz extends EnumC0709wa {
    public C0437lz() {
        super("DoctypePublicIdentifier_doubleQuoted", 56);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        char cM1679t = c0606sf.m1679t();
        if (cM1679t == 0) {
            c0316hm.m1289aj(this);
            c0316hm.f913o.f1282d.append((char) 65533);
            return;
        }
        if (cM1679t == '\"') {
            c0316hm.m1291al(EnumC0709wa.f1686bi);
            return;
        }
        C0184cp c0184cp = EnumC0709wa.f1698c;
        if (cM1679t == '>') {
            c0316hm.m1289aj(this);
            c0316hm.f913o.f1284f = true;
            c0316hm.m1286ag();
            c0316hm.m1291al(c0184cp);
            return;
        }
        if (cM1679t != 65535) {
            c0316hm.f913o.f1282d.append(cM1679t);
            return;
        }
        c0316hm.m1288ai(this);
        c0316hm.f913o.f1284f = true;
        c0316hm.m1286ag();
        c0316hm.m1291al(c0184cp);
    }
}
