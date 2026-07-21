package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.gi */
/* JADX INFO: loaded from: classes.dex */
public static final class C0285gi extends EnumC0709wa {
    public C0285gi() {
        super("TagName", 9);
    }

    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        char c;
        c0606sf.m1677r();
        int i = c0606sf.f1478f;
        int i2 = c0606sf.f1479g;
        char[] cArr = c0606sf.f1477e;
        int i3 = i;
        while (i3 < i2 && (c = cArr[i3]) != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ' && c != '/' && c != '>') {
            i3++;
        }
        c0606sf.f1478f = i3;
        c0316hm.f911m.m1810y(i3 > i ? C0606sf.m1661p(c0606sf.f1477e, c0606sf.f1475c, i, i3 - i) : "");
        char cM1679t = c0606sf.m1679t();
        if (cM1679t == 0) {
            c0316hm.f911m.m1810y(EnumC0709wa.f1697bt);
            return;
        }
        if (cM1679t != ' ') {
            if (cM1679t == '/') {
                c0316hm.m1291al(EnumC0709wa.f1669ar);
                return;
            }
            C0184cp c0184cp = EnumC0709wa.f1698c;
            if (cM1679t == '>') {
                c0316hm.m1287ah();
                c0316hm.m1291al(c0184cp);
                return;
            }
            if (cM1679t == 65535) {
                c0316hm.m1288ai(this);
                c0316hm.m1291al(c0184cp);
                return;
            } else if (cM1679t != '\t' && cM1679t != '\n' && cM1679t != '\f' && cM1679t != '\r') {
                AbstractC0719wk abstractC0719wk = c0316hm.f911m;
                abstractC0719wk.getClass();
                abstractC0719wk.m1810y(String.valueOf(cM1679t));
                return;
            }
        }
        c0316hm.m1291al(EnumC0709wa.f1661aj);
    }
}
