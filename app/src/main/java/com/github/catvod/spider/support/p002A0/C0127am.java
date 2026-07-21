package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.am */
/* JADX INFO: loaded from: classes.dex */
public final class C0127am extends EnumC0709wa {
    public C0127am() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        if (!c0606sf.m1669ah()) {
            c0316hm.m1283ad("</");
            c0316hm.m1291al(EnumC0709wa.f1719x);
            return;
        }
        c0316hm.m1295z(false);
        AbstractC0719wk abstractC0719wk = c0316hm.f911m;
        char cM1662aa = c0606sf.m1662aa();
        abstractC0719wk.getClass();
        abstractC0719wk.m1810y(String.valueOf(cM1662aa));
        c0316hm.f908j.append(c0606sf.m1662aa());
        c0316hm.m1292w(EnumC0709wa.f1654ac);
    }
}
