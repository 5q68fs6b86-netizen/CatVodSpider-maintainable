package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.yx */
/* JADX INFO: loaded from: classes.dex */
public final class C0786yx extends EnumC0709wa {
    public C0786yx() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        if (c0606sf.m1665ad("--")) {
            c0316hm.f914p.mo904a();
            c0316hm.m1291al(EnumC0709wa.f1672au);
        } else {
            if (c0606sf.m1666ae("DOCTYPE")) {
                c0316hm.m1291al(EnumC0709wa.f1678ba);
                return;
            }
            if (c0606sf.m1665ad("[CDATA[")) {
                c0316hm.m1280aa();
                c0316hm.m1291al(EnumC0709wa.f1694bq);
            } else {
                c0316hm.m1289aj(this);
                c0316hm.f914p.mo904a();
                c0316hm.m1291al(EnumC0709wa.f1670as);
            }
        }
    }
}
