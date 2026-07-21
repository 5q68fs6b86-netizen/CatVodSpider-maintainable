package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.uf */
/* JADX INFO: loaded from: classes.dex */
public final class C0660uf extends EnumC0709wa {
    public C0660uf() {
        super("BeforeDoctypeName", 51);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        boolean zM1669ah = c0606sf.m1669ah();
        abg abgVar = EnumC0709wa.f1680bc;
        if (zM1669ah) {
            c0316hm.f913o.mo904a();
            c0316hm.m1291al(abgVar);
            return;
        }
        char cM1679t = c0606sf.m1679t();
        if (cM1679t == 0) {
            c0316hm.m1289aj(this);
            C0476nk c0476nk = c0316hm.f913o;
            c0476nk.mo904a();
            c0476nk.f1280b.append((char) 65533);
            c0316hm.m1291al(abgVar);
            return;
        }
        if (cM1679t != ' ') {
            if (cM1679t == 65535) {
                c0316hm.m1288ai(this);
                C0476nk c0476nk2 = c0316hm.f913o;
                c0476nk2.mo904a();
                c0476nk2.f1284f = true;
                c0316hm.m1286ag();
                c0316hm.m1291al(EnumC0709wa.f1698c);
                return;
            }
            if (cM1679t == '\t' || cM1679t == '\n' || cM1679t == '\f' || cM1679t == '\r') {
                return;
            }
            c0316hm.f913o.mo904a();
            c0316hm.f913o.f1280b.append(cM1679t);
            c0316hm.m1291al(abgVar);
        }
    }
}
