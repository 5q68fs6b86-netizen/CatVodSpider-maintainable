package com.github.catvod.spider.support.p002A0;

import com.google.protobuf.DescriptorProtos;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class aci {

    /* JADX INFO: renamed from: a */
    public boolean f556a = false;

    /* JADX INFO: renamed from: b */
    public int f557b = -1;

    /* JADX INFO: renamed from: c */
    public C0339ii f558c;

    /* JADX INFO: renamed from: d */
    public C0579rf f559d;

    /* JADX INFO: renamed from: e */
    public int f560e;

    /* JADX INFO: renamed from: f */
    public static void m936f(AbstractC0209dn abstractC0209dn, C0339ii c0339ii) {
        int iMo1697e = abstractC0209dn.f736b.mo1697e(1);
        while (iMo1697e != -1 && !c0339ii.m1305f(iMo1697e)) {
            abstractC0209dn.m1129h();
            iMo1697e = abstractC0209dn.f736b.mo1697e(1);
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m937g(String str) {
        return "'" + str.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t") + "'";
    }

    /* JADX INFO: renamed from: h */
    public static C0339ii m938h(AbstractC0209dn abstractC0209dn) {
        C0367jj c0367jj = ((C0504ol) abstractC0209dn.f1571r).f1124p;
        C0339ii c0339ii = new C0339ii(new int[0]);
        for (C0579rf c0579rf = abstractC0209dn.f738d; c0579rf != null; c0579rf = c0579rf.f1435e) {
            int i = c0579rf.f1436f;
            if (i < 0) {
                break;
            }
            c0339ii.m1304e(c0367jj.m1326l(((abw) ((AbstractC0428lq) c0367jj.f1037a.get(i)).m1406k(0)).f541f));
        }
        c0339ii.m1307h();
        return c0339ii;
    }

    /* JADX INFO: renamed from: i */
    public static String m939i(C0642to c0642to) {
        if (c0642to == null) {
            return "<no token>";
        }
        String strM1720j = c0642to.m1720j();
        if (strM1720j == null) {
            int i = c0642to.f1544a;
            if (i == -1) {
                strM1720j = "<EOF>";
            } else {
                strM1720j = "<" + i + ">";
            }
        }
        return m937g(strM1720j);
    }

    /* JADX INFO: renamed from: j */
    public final void m940j() {
        this.f556a = false;
        this.f558c = null;
        this.f557b = -1;
    }

    /* JADX INFO: renamed from: k */
    public void mo941k(AbstractC0209dn abstractC0209dn, AbstractC0346ip abstractC0346ip) {
        C0339ii c0339ii;
        if (this.f557b == abstractC0209dn.f736b.f1555c && (c0339ii = this.f558c) != null && c0339ii.m1305f(abstractC0209dn.f1572s)) {
            abstractC0209dn.m1129h();
        }
        this.f557b = abstractC0209dn.f736b.f1555c;
        if (this.f558c == null) {
            this.f558c = new C0339ii(new int[0]);
        }
        this.f558c.m1302c(abstractC0209dn.f1572s);
        m936f(abstractC0209dn, m938h(abstractC0209dn));
    }

    /* JADX INFO: renamed from: l */
    public C0642to mo942l(C0720wl c0720wl) {
        String str;
        C0642to c0642toM945o = m945o(c0720wl);
        if (c0642toM945o != null) {
            c0720wl.m1129h();
            return c0642toM945o;
        }
        int i = 0;
        if (!((C0504ol) c0720wl.f1571r).f1124p.m1327m(((AbstractC0428lq) ((C0504ol) c0720wl.f1571r).f1124p.f1037a.get(c0720wl.f1572s)).m1406k(0).f1292g, c0720wl.f738d).m1305f(c0720wl.f736b.mo1697e(1))) {
            if (this.f559d == null) {
                throw new C0179ck(c0720wl);
            }
            int i2 = this.f560e;
            C0179ck c0179ck = new C0179ck(c0720wl, c0720wl.f736b, this.f559d);
            c0179ck.f1021e = i2;
            c0179ck.f1020d = c0720wl.m1133l();
            throw c0179ck;
        }
        if (!this.f556a) {
            this.f556a = true;
            C0642to c0642toM1133l = c0720wl.m1133l();
            c0720wl.m1136o(c0642toM1133l, "missing " + c0720wl.m1134m().m1309j(C0720wl.f1742w) + " at " + m939i(c0642toM1133l), null);
        }
        C0642to c0642toM1133l2 = c0720wl.m1133l();
        C0339ii c0339iiM1134m = c0720wl.m1134m();
        if (!c0339iiM1134m.m1306g()) {
            if (c0339iiM1134m.m1306g()) {
                throw new RuntimeException("set is empty");
            }
            i = ((C0145bd) c0339iiM1134m.f1008a.get(0)).f684b;
        }
        if (i == -1) {
            str = "<missing EOF>";
        } else {
            str = "<missing " + C0720wl.f1742w.m1296f(i) + ">";
        }
        String str2 = str;
        C0642to c0642toM1721f = c0720wl.f736b.m1721f(-1);
        if (c0642toM1133l2.f1544a == -1 && c0642toM1721f != null) {
            c0642toM1133l2 = c0642toM1721f;
        }
        C0372jo c0372jo = c0720wl.f736b.f1553a.f511h;
        Object obj = c0642toM1133l2.f1548e.f447a;
        return c0372jo.m1339n(new aam((InterfaceC0358ja) obj, ((abh) ((InterfaceC0358ja) obj)).f509f), i, str2, 0, -1, -1, c0642toM1133l2.f1545b, c0642toM1133l2.f1546c);
    }

    /* JADX INFO: renamed from: m */
    public final void m943m(AbstractC0209dn abstractC0209dn, AbstractC0346ip abstractC0346ip) {
        String str;
        if (this.f556a) {
            return;
        }
        this.f556a = true;
        if (!(abstractC0346ip instanceof C0390kf)) {
            if (!(abstractC0346ip instanceof C0179ck)) {
                System.err.println("unknown recognition error type: ".concat(abstractC0346ip.getClass().getName()));
                abstractC0209dn.m1136o(abstractC0346ip.f1020d, abstractC0346ip.getMessage(), abstractC0346ip);
                return;
            }
            AbstractC0346ip abstractC0346ip2 = (C0179ck) abstractC0346ip;
            StringBuilder sb = new StringBuilder("mismatched input ");
            sb.append(m939i(abstractC0346ip2.f1020d));
            sb.append(" expecting ");
            AbstractC0664uj abstractC0664uj = abstractC0346ip2.f1017a;
            C0339ii c0339iiM1325k = abstractC0664uj != null ? abstractC0664uj.mo1729t().m1325k(abstractC0346ip2.f1021e, abstractC0346ip2.f1018b) : null;
            ((C0720wl) abstractC0209dn).getClass();
            sb.append(c0339iiM1325k.m1309j(C0720wl.f1742w));
            abstractC0209dn.m1136o(abstractC0346ip2.f1020d, sb.toString(), abstractC0346ip2);
            return;
        }
        C0390kf c0390kf = (C0390kf) abstractC0346ip;
        C0643tp c0643tp = abstractC0209dn.f736b;
        if (c0643tp != null) {
            C0642to c0642to = c0390kf.f1096f;
            if (c0642to.f1544a == -1) {
                str = "<EOF>";
            } else {
                C0642to c0642to2 = c0390kf.f1020d;
                String string = "";
                if (c0642to != null && c0642to2 != null) {
                    C0145bd c0145bdM1022d = C0145bd.m1022d(c0642to.f1550g, c0642to2.f1550g);
                    int i = c0145bdM1022d.f684b;
                    int size = c0145bdM1022d.f685c;
                    if (i >= 0 && size >= 0) {
                        if (c0643tp.f1555c == -1) {
                            c0643tp.m1726k(0);
                            c0643tp.f1555c = c0643tp.m1724i(0);
                        }
                        while (c0643tp.m1723h(DescriptorProtos.Edition.EDITION_2023_VALUE) >= 1000) {
                        }
                        ArrayList arrayList = c0643tp.f1554b;
                        if (size >= arrayList.size()) {
                            size = arrayList.size() - 1;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        while (i <= size) {
                            C0642to c0642to3 = (C0642to) arrayList.get(i);
                            if (c0642to3.f1544a == -1) {
                                break;
                            }
                            sb2.append(c0642to3.m1720j());
                            i++;
                        }
                        string = sb2.toString();
                    }
                }
                str = string;
            }
        } else {
            str = "<unknown input>";
        }
        abstractC0209dn.m1136o(c0390kf.f1020d, "no viable alternative at input " + m937g(str), c0390kf);
    }

    /* JADX INFO: renamed from: n */
    public final void m944n(AbstractC0209dn abstractC0209dn) {
        if (this.f556a) {
            return;
        }
        this.f556a = true;
        C0642to c0642toM1133l = abstractC0209dn.m1133l();
        abstractC0209dn.m1136o(c0642toM1133l, "extraneous input " + m939i(c0642toM1133l) + " expecting " + abstractC0209dn.m1134m().m1309j(C0720wl.f1742w), null);
    }

    /* JADX INFO: renamed from: o */
    public final C0642to m945o(AbstractC0209dn abstractC0209dn) {
        if (!abstractC0209dn.m1134m().m1305f(abstractC0209dn.f736b.mo1697e(2))) {
            return null;
        }
        m944n(abstractC0209dn);
        abstractC0209dn.m1129h();
        C0642to c0642toM1133l = abstractC0209dn.m1133l();
        m940j();
        return c0642toM1133l;
    }

    /* JADX INFO: renamed from: p */
    public final void m946p(AbstractC0209dn abstractC0209dn) {
        AbstractC0428lq abstractC0428lq = (AbstractC0428lq) ((C0504ol) abstractC0209dn.f1571r).f1124p.f1037a.get(abstractC0209dn.f1572s);
        if (this.f556a) {
            return;
        }
        int iMo1697e = abstractC0209dn.f736b.mo1697e(1);
        C0339ii c0339iiM1326l = C0720wl.f1744y.m1326l(abstractC0428lq);
        if (c0339iiM1326l.m1305f(iMo1697e)) {
            this.f559d = null;
            this.f560e = -1;
            return;
        }
        if (c0339iiM1326l.m1305f(-2)) {
            if (this.f559d == null) {
                this.f559d = abstractC0209dn.f738d;
                this.f560e = abstractC0209dn.f1572s;
                return;
            }
            return;
        }
        int iMo897a = abstractC0428lq.mo897a();
        if (iMo897a != 3 && iMo897a != 4 && iMo897a != 5) {
            switch (iMo897a) {
                case 9:
                case 11:
                    m944n(abstractC0209dn);
                    C0339ii c0339iiM1134m = abstractC0209dn.m1134m();
                    C0339ii c0339iiM938h = m938h(abstractC0209dn);
                    C0339ii c0339ii = new C0339ii(new int[0]);
                    c0339ii.m1304e(c0339iiM1134m);
                    c0339ii.m1304e(c0339iiM938h);
                    m936f(abstractC0209dn, c0339ii);
                    return;
                case 10:
                    break;
                default:
                    return;
            }
        }
        if (m945o(abstractC0209dn) == null) {
            throw new C0179ck(abstractC0209dn);
        }
    }
}
