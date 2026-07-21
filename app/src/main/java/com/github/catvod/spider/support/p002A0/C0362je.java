package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.je */
/* JADX INFO: loaded from: classes.dex */
public final enum C0362je extends EnumC0709wa {
    public C0362je() {
        super("RCDATAEndTagName", 12);
    }

    /* JADX INFO: renamed from: b */
    public static void m1323b(C0316hm c0316hm, C0606sf c0606sf) {
        c0316hm.m1283ad("</");
        c0316hm.m1284ae(c0316hm.f908j);
        c0606sf.m1675an();
        c0316hm.m1291al(EnumC0709wa.f1700e);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        if (c0606sf.m1669ah()) {
            String strM1682w = c0606sf.m1682w();
            c0316hm.f911m.m1810y(strM1682w);
            c0316hm.f908j.append(strM1682w);
            return;
        }
        char cM1679t = c0606sf.m1679t();
        if (cM1679t == '\t' || cM1679t == '\n' || cM1679t == '\f' || cM1679t == '\r' || cM1679t == ' ') {
            if (c0316hm.m1290ak()) {
                c0316hm.m1291al(EnumC0709wa.f1661aj);
                return;
            } else {
                m1323b(c0316hm, c0606sf);
                return;
            }
        }
        if (cM1679t == '/') {
            if (c0316hm.m1290ak()) {
                c0316hm.m1291al(EnumC0709wa.f1669ar);
                return;
            } else {
                m1323b(c0316hm, c0606sf);
                return;
            }
        }
        if (cM1679t != '>') {
            m1323b(c0316hm, c0606sf);
        } else if (!c0316hm.m1290ak()) {
            m1323b(c0316hm, c0606sf);
        } else {
            c0316hm.m1287ah();
            c0316hm.m1291al(EnumC0709wa.f1698c);
        }
    }
}
