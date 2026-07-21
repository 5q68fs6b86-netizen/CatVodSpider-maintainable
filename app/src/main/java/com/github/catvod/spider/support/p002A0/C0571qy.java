package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.qy */
/* JADX INFO: loaded from: classes.dex */
public final class C0571qy extends EnumC0709wa {
    public C0571qy() {
        super("CdataSection", 66);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        String strM1661p;
        int iM1671aj = c0606sf.m1671aj("]]>");
        if (iM1671aj != -1) {
            strM1661p = C0606sf.m1661p(c0606sf.f1477e, c0606sf.f1475c, c0606sf.f1478f, iM1671aj);
            c0606sf.f1478f += iM1671aj;
        } else {
            int i = c0606sf.f1479g;
            int i2 = c0606sf.f1478f;
            if (i - i2 < 3) {
                c0606sf.m1677r();
                char[] cArr = c0606sf.f1477e;
                String[] strArr = c0606sf.f1475c;
                int i3 = c0606sf.f1478f;
                strM1661p = C0606sf.m1661p(cArr, strArr, i3, c0606sf.f1479g - i3);
                c0606sf.f1478f = c0606sf.f1479g;
            } else {
                int i4 = i - 2;
                strM1661p = C0606sf.m1661p(c0606sf.f1477e, c0606sf.f1475c, i2, i4 - i2);
                c0606sf.f1478f = i4;
            }
        }
        c0316hm.f908j.append(strM1661p);
        if (c0606sf.m1665ad("]]>") || c0606sf.m1663ab()) {
            String string = c0316hm.f908j.toString();
            C0222e c0222e = new C0222e(5);
            c0222e.f1013b = string;
            c0316hm.m1282ac(c0222e);
            c0316hm.m1291al(EnumC0709wa.f1698c);
        }
    }
}
