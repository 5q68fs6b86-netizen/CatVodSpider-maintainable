package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p098x.C1932g;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.e */
/* JADX INFO: loaded from: classes.dex */
final enum C1467e extends EnumC1406B {
    C1467e() {
        super("InColumnGroup", 11, null);
    }

    /* JADX INFO: renamed from: e */
    private boolean m3747e(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        if (!c1458b.m3756b("colgroup")) {
            c1458b.m3738t(this);
            return false;
        }
        c1458b.m3709b0();
        c1458b.m3741u0(EnumC1406B.f3273i);
        c1458b.mo3717g(abstractC1436Q);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x008c  */
    @Override // com.github.catvod.spider.support.p044FM.p056L.EnumC1406B
    /* JADX INFO: renamed from: d */
    final boolean mo3535d(AbstractC1436Q abstractC1436Q, C1458b c1458b) {
        C1507u c1507u = EnumC1406B.f3268d;
        if (EnumC1406B.m3532a(abstractC1436Q)) {
            c1458b.m3694K((C1420I) abstractC1436Q);
            return true;
        }
        int iM4675a = C1932g.m4675a(abstractC1436Q.f3337a);
        if (iM4675a != 0) {
            byte b = 0;
            if (iM4675a == 1) {
                C1430N c1430n = (C1430N) abstractC1436Q;
                String str = c1430n.f3327e;
                str.getClass();
                int iHashCode = str.hashCode();
                if (iHashCode != -1321546630) {
                    if (iHashCode != 98688) {
                        if (iHashCode == 3213227 && str.equals("html")) {
                            b = 2;
                        } else {
                            b = -1;
                        }
                    } else if (str.equals("col")) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                } else if (!str.equals("template")) {
                    b = -1;
                }
                if (b == 0) {
                    c1458b.m3716f0(abstractC1436Q, c1507u);
                } else {
                    if (b != 1) {
                        return b != 2 ? m3747e(abstractC1436Q, c1458b) : c1458b.m3716f0(abstractC1436Q, EnumC1406B.f3271g);
                    }
                    c1458b.m3696M(c1430n);
                }
            } else if (iM4675a == 2) {
                String str2 = ((C1428M) abstractC1436Q).f3327e;
                str2.getClass();
                if (str2.equals("template")) {
                    c1458b.m3716f0(abstractC1436Q, c1507u);
                } else {
                    if (!str2.equals("colgroup")) {
                        return m3747e(abstractC1436Q, c1458b);
                    }
                    if (!c1458b.m3756b(str2)) {
                        c1458b.m3738t(this);
                        return false;
                    }
                    c1458b.m3709b0();
                    c1458b.m3741u0(EnumC1406B.f3273i);
                }
            } else {
                if (iM4675a != 3) {
                    if (iM4675a == 5 && c1458b.m3756b("html")) {
                        return true;
                    }
                    return m3747e(abstractC1436Q, c1458b);
                }
                c1458b.m3695L((C1422J) abstractC1436Q);
            }
        } else {
            c1458b.m3738t(this);
        }
        return true;
    }
}
