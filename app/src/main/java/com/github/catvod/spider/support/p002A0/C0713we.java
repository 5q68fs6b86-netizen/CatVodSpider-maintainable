package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.we */
/* JADX INFO: loaded from: classes.dex */
public final class C0713we extends EnumC0709wa {
    public C0713we() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        char cM1679t = c0606sf.m1679t();
        if (cM1679t == '!') {
            c0316hm.m1283ad("<!");
            c0316hm.m1291al(EnumC0709wa.f1717v);
            return;
        }
        if (cM1679t == '/') {
            c0316hm.m1280aa();
            c0316hm.m1291al(EnumC0709wa.f1715t);
        } else if (cM1679t != 65535) {
            c0316hm.m1283ad("<");
            c0606sf.m1675an();
            c0316hm.m1291al(EnumC0709wa.f1703h);
        } else {
            c0316hm.m1283ad("<");
            c0316hm.m1288ai(this);
            c0316hm.m1291al(EnumC0709wa.f1698c);
        }
    }
}
