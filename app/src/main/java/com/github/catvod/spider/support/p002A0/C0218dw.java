package com.github.catvod.spider.support.p002A0;

/* JADX INFO: renamed from: com.github.catvod.spider.support.A0.dw */
/* JADX INFO: loaded from: classes.dex */
public class C0218dw extends AbstractC0213dr {

    /* JADX INFO: renamed from: a */
    public final int f755a;

    /* JADX INFO: renamed from: e */
    public final int f756e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f757f;

    public C0218dw(int i, int i2, int i3) {
        this.f757f = i3;
        this.f755a = i;
        this.f756e = i2;
    }

    @Override // com.github.catvod.spider.support.p002A0.AbstractC0213dr
    /* JADX INFO: renamed from: c */
    public final boolean mo1020c(C0226ed c0226ed, C0226ed c0226ed2) {
        int iM1160ab;
        C0226ed c0226ed3 = (C0226ed) c0226ed2.f846ap;
        if (c0226ed3 == null || (c0226ed3 instanceof C0235em)) {
            return false;
        }
        switch (this.f757f) {
            case 0:
                iM1160ab = c0226ed2.m1160ab() + 1;
                break;
            case 1:
                C0226ed c0226ed4 = (C0226ed) c0226ed2.f846ap;
                iM1160ab = c0226ed4 == null ? 0 : c0226ed4.m1181z().size() - c0226ed2.m1160ab();
                break;
            case 2:
                iM1160ab = 0;
                if (((C0226ed) c0226ed2.f846ap) != null) {
                    for (C0226ed c0226edM1164af = c0226ed2; c0226edM1164af != null; c0226edM1164af = c0226edM1164af.m1164af()) {
                        if (c0226edM1164af.f771g.f590c.equals(c0226ed2.f771g.f590c)) {
                            iM1160ab++;
                        }
                    }
                }
                break;
            default:
                C0226ed c0226ed5 = (C0226ed) c0226ed2.f846ap;
                iM1160ab = 0;
                if (c0226ed5 != null) {
                    int size = c0226ed5.f773i.size();
                    int i = 0;
                    while (iM1160ab < size) {
                        AbstractC0272fw abstractC0272fw = (AbstractC0272fw) c0226ed5.mo1175q().get(iM1160ab);
                        if (abstractC0272fw.mo1177t().equals(c0226ed2.f771g.f590c)) {
                            i++;
                        }
                        if (abstractC0272fw == c0226ed2) {
                            iM1160ab = i;
                        } else {
                            iM1160ab++;
                        }
                        break;
                    }
                    iM1160ab = i;
                }
                break;
        }
        int i2 = this.f756e;
        int i3 = this.f755a;
        if (i3 == 0) {
            return iM1160ab == i2;
        }
        int i4 = iM1160ab - i2;
        return i4 * i3 >= 0 && i4 % i3 == 0;
    }

    /* JADX INFO: renamed from: g */
    public final String m1144g() {
        switch (this.f757f) {
            case 0:
                return "nth-child";
            case 1:
                return "nth-last-child";
            case 2:
                return "nth-last-of-type";
            default:
                return "nth-of-type";
        }
    }

    public String toString() {
        int i = this.f756e;
        int i2 = this.f755a;
        if (i2 == 0) {
            return String.format(":%s(%d)", m1144g(), Integer.valueOf(i));
        }
        return i == 0 ? String.format(":%s(%dn)", m1144g(), Integer.valueOf(i2)) : String.format(":%s(%dn%+d)", m1144g(), Integer.valueOf(i2), Integer.valueOf(i));
    }
}
