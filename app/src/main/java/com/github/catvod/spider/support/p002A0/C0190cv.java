package com.github.catvod.spider.support.p002A0;

import java.util.Locale;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.cv */
/* JADX INFO: loaded from: classes.dex */
public static final class C0190cv extends EnumC0709wa {
    public C0190cv() {
        super("RcdataLessthanSign", 10);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:28:0x006d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0070  */
    @Override // com.github.catvod.spider.support.p002A0.EnumC0709wa
    /* JADX INFO: renamed from: a */
    public final void mo870a(C0316hm c0316hm, C0606sf c0606sf) {
        Locale locale;
        int iM1671aj;
        if (c0606sf.m1667af('/')) {
            c0316hm.m1280aa();
            c0316hm.m1292w(EnumC0709wa.f1709n);
            return;
        }
        if (c0606sf.f1483k && c0606sf.m1669ah() && c0316hm.f915q != null) {
            if (c0316hm.f916r == null) {
                c0316hm.f916r = "</" + c0316hm.f915q;
            }
            String str = c0316hm.f916r;
            boolean z = true;
            if (str.equals(c0606sf.f1486n)) {
                int i = c0606sf.f1487o;
                if (i == -1) {
                    z = false;
                } else if (i < c0606sf.f1478f) {
                    c0606sf.f1486n = str;
                    locale = Locale.ENGLISH;
                    iM1671aj = c0606sf.m1671aj(str.toLowerCase(locale));
                    if (iM1671aj > -1) {
                        c0606sf.f1487o = c0606sf.f1478f + iM1671aj;
                    } else {
                        int iM1671aj2 = c0606sf.m1671aj(str.toUpperCase(locale));
                        if (iM1671aj2 > -1) {
                        }
                        c0606sf.f1487o = z ? c0606sf.f1478f + iM1671aj2 : -1;
                    }
                }
            } else {
                c0606sf.f1486n = str;
                locale = Locale.ENGLISH;
                iM1671aj = c0606sf.m1671aj(str.toLowerCase(locale));
                if (iM1671aj > -1) {
                    c0606sf.f1487o = c0606sf.f1478f + iM1671aj;
                } else {
                    int iM1671aj3 = c0606sf.m1671aj(str.toUpperCase(locale));
                    z = iM1671aj3 > -1;
                    c0606sf.f1487o = z ? c0606sf.f1478f + iM1671aj3 : -1;
                }
            }
            if (!z) {
                AbstractC0719wk abstractC0719wkM1295z = c0316hm.m1295z(false);
                abstractC0719wkM1295z.m1804ab(c0316hm.f915q);
                c0316hm.f911m = abstractC0719wkM1295z;
                c0316hm.m1287ah();
                c0316hm.m1291al(EnumC0709wa.f1705j);
                return;
            }
        }
        c0316hm.m1283ad("<");
        c0316hm.m1291al(EnumC0709wa.f1700e);
    }
}
