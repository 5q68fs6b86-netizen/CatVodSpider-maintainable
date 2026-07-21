package com.github.catvod.spider.support.p044FM.p066V;

import com.base.model.proto.DramaDetailProto;
import com.github.catvod.spider.support.p044FM.p045A.AbstractC1275a;
import com.github.catvod.spider.support.p044FM.p045A.C1286l;
import com.github.catvod.spider.support.p044FM.p045A.C1290p;
import com.github.catvod.spider.support.p044FM.p046B.InterfaceC1292b;
import com.github.catvod.spider.support.p044FM.p047C.C1305h;
import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p057M.C1547c;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p057M.C1563s;
import com.github.catvod.spider.support.p044FM.p065U.C1629A;
import com.github.catvod.spider.support.p044FM.p065U.C1630B;
import com.github.catvod.spider.support.p044FM.p065U.C1631C;
import com.github.catvod.spider.support.p044FM.p065U.C1636c;
import com.github.catvod.spider.support.p044FM.p065U.C1637d;
import com.github.catvod.spider.support.p044FM.p065U.C1638e;
import com.github.catvod.spider.support.p044FM.p065U.C1639f;
import com.github.catvod.spider.support.p044FM.p065U.C1640g;
import com.github.catvod.spider.support.p044FM.p065U.C1641h;
import com.github.catvod.spider.support.p044FM.p065U.C1642i;
import com.github.catvod.spider.support.p044FM.p065U.C1643j;
import com.github.catvod.spider.support.p044FM.p065U.C1644k;
import com.github.catvod.spider.support.p044FM.p065U.C1645l;
import com.github.catvod.spider.support.p044FM.p065U.C1646m;
import com.github.catvod.spider.support.p044FM.p065U.C1647n;
import com.github.catvod.spider.support.p044FM.p065U.C1648o;
import com.github.catvod.spider.support.p044FM.p065U.C1649p;
import com.github.catvod.spider.support.p044FM.p065U.C1650q;
import com.github.catvod.spider.support.p044FM.p065U.C1651r;
import com.github.catvod.spider.support.p044FM.p065U.C1652s;
import com.github.catvod.spider.support.p044FM.p065U.C1653t;
import com.github.catvod.spider.support.p044FM.p065U.C1654u;
import com.github.catvod.spider.support.p044FM.p065U.C1655v;
import com.github.catvod.spider.support.p044FM.p065U.C1656w;
import com.github.catvod.spider.support.p044FM.p065U.C1657x;
import com.github.catvod.spider.support.p044FM.p065U.C1658y;
import com.github.catvod.spider.support.p044FM.p065U.C1659z;
import com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E;
import com.github.catvod.spider.support.p044FM.p070Z.C1709d;
import com.github.catvod.spider.support.p044FM.p070Z.C1710e;
import com.github.catvod.spider.support.p044FM.p072a0.C1712a;
import com.github.catvod.spider.support.p044FM.p074b0.C1758c;
import com.github.catvod.spider.support.p044FM.p098x.InterfaceC1919E;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p066V.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1666g extends AbstractC1275a implements InterfaceC1633E<C1665f> {

    /* JADX INFO: renamed from: a */
    private Stack<C1664e> f3743a;

    /* JADX INFO: renamed from: b */
    private C1664e f3744b;

    public C1666g(C1551g c1551g) {
        C1758c.m4167d(C1666g.class);
        this.f3743a = new Stack<>();
        this.f3744b = C1664e.m3958c(c1551g);
        Stack<C1664e> stack = this.f3743a;
        C1664e c1664eM3958c = C1664e.m3958c(c1551g);
        c1664eM3958c.m3966j(this.f3744b);
        stack.push(c1664eM3958c);
    }

    /* JADX INFO: renamed from: G */
    private C1664e m3987G() {
        return this.f3743a.peek();
    }

    /* JADX INFO: renamed from: H */
    private void m3988H(C1551g c1551g) {
        this.f3743a.peek().m3965i(c1551g);
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: A */
    public final C1665f mo3862A(C1645l c1645l) {
        return (C1665f) ((C1656w) c1645l.m4710j(C1656w.class)).mo3232b(this);
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: B */
    public final C1665f mo3863B(C1646m c1646m) {
        return (C1665f) ((c1646m.m3943m() == null || c1646m.m3943m().m4637f()) ? (C1637d) c1646m.m4710j(C1637d.class) : c1646m.m3943m()).mo3232b(this);
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: C */
    public final C1665f mo3864C(C1643j c1643j) {
        return (C1665f) ((C1655v) c1643j.m4710j(C1655v.class)).mo3232b(this);
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: D */
    public final C1665f mo3865D(C1657x c1657x) {
        C1665f c1665f;
        List listM4711k = c1657x.m4711k(C1638e.class);
        if (listM4711k.size() == 1) {
            return (C1665f) ((InterfaceC1292b) listM4711k.get(0)).mo3232b(this);
        }
        if (listM4711k.size() != 2) {
            StringBuilder sbM3589b = C1434P.m3589b("error equalityExpr near:");
            sbM3589b.append(c1657x.getText());
            throw new C1710e(sbM3589b.toString());
        }
        C1665f c1665f2 = (C1665f) ((InterfaceC1292b) listM4711k.get(0)).mo3232b(this);
        C1665f c1665f3 = (C1665f) ((InterfaceC1292b) listM4711k.get(1)).mo3232b(this);
        switch (c1657x.f3734g.getType()) {
            case 24:
                c1665f = new C1665f(Boolean.valueOf(c1665f2.compareTo(c1665f3) < 0));
                break;
            case 25:
                c1665f = new C1665f(Boolean.valueOf(c1665f2.compareTo(c1665f3) > 0));
                break;
            case 26:
                c1665f = new C1665f(Boolean.valueOf(c1665f2.compareTo(c1665f3) <= 0));
                break;
            case 27:
                c1665f = new C1665f(Boolean.valueOf(c1665f2.compareTo(c1665f3) >= 0));
                break;
            case 28:
            case 29:
            default:
                StringBuilder sbM3589b2 = C1434P.m3589b("unknown operator");
                sbM3589b2.append(c1657x.f3734g.getText());
                throw new C1710e(sbM3589b2.toString());
            case 30:
                c1665f = new C1665f(Boolean.valueOf(c1665f2.m3974g().startsWith(c1665f3.m3974g())));
                break;
            case 31:
                c1665f = new C1665f(Boolean.valueOf(c1665f2.m3974g().endsWith(c1665f3.m3974g())));
                break;
            case DramaDetailProto.DramaDetailBean.FAVORITE_FIELD_NUMBER /* 32 */:
                c1665f = new C1665f(Boolean.valueOf(c1665f2.m3974g().contains(c1665f3.m3974g())));
                break;
            case 33:
                c1665f = new C1665f(Boolean.valueOf(c1665f2.m3974g().matches(c1665f3.m3974g())));
                break;
            case 34:
                c1665f = new C1665f(Boolean.valueOf(!c1665f2.m3974g().matches(c1665f3.m3974g())));
                break;
        }
        return c1665f;
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: b */
    public final C1665f mo3866b(C1636c c1636c) {
        if (!"..".equals(c1636c.getText())) {
            return new C1665f(m3987G().m3960a());
        }
        HashSet hashSet = new HashSet();
        C1551g c1551g = new C1551g();
        Iterator<C1393m> it = m3987G().m3960a().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().m3473k0());
        }
        c1551g.addAll(hashSet);
        return new C1665f(c1551g);
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: c */
    public final C1665f mo3867c(C1638e c1638e) {
        List listM4711k = c1638e.m4711k(C1648o.class);
        if (listM4711k.size() == 1) {
            return (C1665f) ((InterfaceC1292b) listM4711k.get(0)).mo3232b(this);
        }
        Double dM3970c = ((C1665f) ((InterfaceC1292b) listM4711k.get(0)).mo3232b(this)).m3970c();
        String text = null;
        for (int i = 1; i < c1638e.mo3234d(); i++) {
            InterfaceC1292b interfaceC1292bMo3233c = c1638e.mo3233c(i);
            if (interfaceC1292bMo3233c instanceof C1648o) {
                C1665f c1665f = (C1665f) interfaceC1292bMo3233c.mo3232b(this);
                if (Marker.ANY_NON_NULL_MARKER.equals(text)) {
                    dM3970c = Double.valueOf(c1665f.m3970c().doubleValue() + dM3970c.doubleValue());
                } else {
                    if (!"-".equals(text)) {
                        StringBuilder sbM3589b = C1434P.m3589b("syntax error, ");
                        sbM3589b.append(c1638e.getText());
                        throw new C1710e(sbM3589b.toString());
                    }
                    dM3970c = Double.valueOf(dM3970c.doubleValue() - c1665f.m3970c().doubleValue());
                }
            } else {
                text = interfaceC1292bMo3233c.getText();
            }
        }
        return new C1665f(dM3970c);
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: d */
    public final C1665f mo3868d(C1658y c1658y) {
        C1665f c1665f = null;
        for (int i = 0; i < c1658y.mo3234d(); i++) {
            InterfaceC1292b interfaceC1292bMo3233c = c1658y.mo3233c(i);
            if (interfaceC1292bMo3233c instanceof C1659z) {
                c1665f = (C1665f) interfaceC1292bMo3233c.mo3232b(this);
                if (c1665f.m3981n()) {
                    m3988H(c1665f.m3971d());
                }
            } else if ("//".equals(interfaceC1292bMo3233c.getText())) {
                m3987G().m3964h();
            } else {
                m3987G().m3963g();
            }
        }
        return c1665f;
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: e */
    public final C1665f mo3869e(C1653t c1653t) {
        InterfaceC1292b interfaceC1292bM3947m;
        if (c1653t.m3947m() == null || c1653t.m3947m().m4637f()) {
            InterfaceC1919E interfaceC1919E = c1653t.f3733g;
            if (interfaceC1919E == null) {
                interfaceC1292bM3947m = (C1643j) c1653t.m4710j(C1643j.class);
            } else {
                if ("//".equals(interfaceC1919E.getText())) {
                    m3987G().m3964h();
                }
                interfaceC1292bM3947m = (C1658y) c1653t.m4710j(C1658y.class);
            }
        } else {
            interfaceC1292bM3947m = c1653t.m3947m();
        }
        return (C1665f) interfaceC1292bM3947m.mo3232b(this);
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: h */
    public final C1665f mo3870h(C1640g c1640g) {
        if (c1640g.m4712l(7) != null) {
            return C1712a.m3996c(c1640g.m4712l(7).getText()).mo3954a(m3987G().m3960a());
        }
        if (!"@".equals(c1640g.getText())) {
            return null;
        }
        C1665f c1665f = new C1665f(null);
        c1665f.m3975h();
        return c1665f;
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: i */
    public final C1665f mo3871i(C1648o c1648o) {
        if (c1648o.m3944m() == null || c1648o.m3944m().m4637f()) {
            return (C1665f) ((C1629A) c1648o.m4710j(C1629A.class)).mo3232b(this);
        }
        C1665f c1665f = (C1665f) ((C1629A) c1648o.m4710j(C1629A.class)).mo3232b(this);
        C1665f c1665f2 = (C1665f) c1648o.m3944m().mo3232b(this);
        switch (c1648o.f3732g.getType()) {
            case 17:
                return new C1665f(Double.valueOf(c1665f2.m3970c().doubleValue() * c1665f.m3970c().doubleValue()));
            case 18:
                return new C1665f(Double.valueOf(c1665f.m3970c().doubleValue() / c1665f2.m3970c().doubleValue()));
            case 19:
                return new C1665f(Double.valueOf(c1665f.m3970c().doubleValue() % c1665f2.m3970c().doubleValue()));
            default:
                StringBuilder sbM3589b = C1434P.m3589b("syntax error, ");
                sbM3589b.append(c1648o.getText());
                throw new C1710e(sbM3589b.toString());
        }
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: j */
    public final C1665f mo3872j(C1649p c1649p) {
        C1665f c1665f = c1649p.m4712l(7) != null ? new C1665f(c1649p.m4712l(7).getText()) : new C1665f(c1649p.m4712l(41).getText());
        c1665f.m3977j();
        return c1665f;
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: k */
    public final C1665f mo3873k(C1647n c1647n) {
        return (C1665f) ((C1642i) c1647n.m4710j(C1642i.class)).mo3232b(this);
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: l */
    public final C1665f mo3874l(C1642i c1642i) {
        return (C1665f) ((C1652s) c1642i.m4710j(C1652s.class)).mo3232b(this);
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: m */
    public final C1665f mo3875m(C1650q c1650q) {
        InterfaceC1292b interfaceC1292bM3945m;
        if (Marker.ANY_MARKER.equals(c1650q.getText())) {
            C1665f c1665f = new C1665f(Marker.ANY_MARKER);
            c1665f.m3977j();
            return c1665f;
        }
        if (c1650q.m3946n() != null && !c1650q.m3946n().m4637f()) {
            interfaceC1292bM3945m = c1650q.m3946n();
        } else {
            if (c1650q.m3945m() == null || c1650q.m3945m().m4637f()) {
                return null;
            }
            interfaceC1292bM3945m = c1650q.m3945m();
        }
        return (C1665f) interfaceC1292bM3945m.mo3232b(this);
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: n */
    public final C1665f mo3876n(C1655v c1655v) {
        C1665f c1665f;
        InterfaceC1292b interfaceC1292bM3949n;
        if (c1655v.m3948m() != null && !c1655v.m3948m().m4637f()) {
            interfaceC1292bM3949n = c1655v.m3948m();
        } else {
            if (c1655v.m3949n() == null || c1655v.m3949n().m4637f()) {
                if (c1655v.m4712l(39) != null) {
                    c1665f = new C1665f(c1655v.m4712l(39).getText());
                    c1665f.m3977j();
                } else {
                    if (c1655v.m4712l(6) == null) {
                        StringBuilder sbM3589b = C1434P.m3589b("not support variableReference:");
                        sbM3589b.append(c1655v.getText());
                        throw new C1710e(sbM3589b.toString());
                    }
                    String text = c1655v.m4712l(6).getText();
                    c1665f = new C1665f(text == null ? null : Double.valueOf(text));
                }
                return c1665f;
            }
            interfaceC1292bM3949n = c1655v.m3949n();
        }
        return (C1665f) interfaceC1292bM3949n.mo3232b(this);
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: o */
    public final C1665f mo3877o(C1654u c1654u) {
        long j;
        C1551g c1551g = new C1551g();
        for (C1393m c1393m : m3987G().m3960a()) {
            Stack<C1664e> stack = this.f3743a;
            C1664e c1664eM3957b = C1664e.m3957b(c1393m);
            c1664eM3957b.m3966j(m3987G());
            stack.push(c1664eM3957b);
            C1665f c1665f = (C1665f) ((C1642i) c1654u.m4710j(C1642i.class)).mo3232b(this);
            this.f3743a.pop();
            if (c1665f.m3984q()) {
                long jLongValue = c1665f.m3973f().longValue();
                if (jLongValue < 0) {
                    String strM3483t0 = c1393m.m3483t0();
                    if (strM3483t0 == "JX_TEXT" || (strM3483t0 != null && strM3483t0.equals("JX_TEXT"))) {
                        String strMo3511c = c1393m.mo3511c("EL_SAME_TAG_ALL_NUM");
                        jLongValue = ((long) (C1305h.m3248b(strMo3511c) ? -1 : Integer.parseInt(strMo3511c))) + jLongValue + 1;
                        j = 0;
                    } else {
                        C1664e c1664eM3987G = m3987G();
                        C1551g c1551g2 = new C1551g();
                        C1393m c1393mM3473k0 = c1393m.m3473k0();
                        String strM3483t1 = c1393m.m3483t0();
                        c1393mM3473k0.getClass();
                        C1377c.m3358e(strM3483t1);
                        for (C1393m c1393m2 : C1547c.m3782a(new C1563s(C1286l.m3220e(strM3483t1), 1), c1393mM3473k0)) {
                            if (c1664eM3987G.m3960a().contains(c1393m2)) {
                                c1551g2.add(c1393m2);
                            }
                        }
                        jLongValue = ((long) c1551g2.size()) + jLongValue + 1;
                        j = 0;
                    }
                    if (jLongValue < j) {
                        jLongValue = 1;
                    }
                }
                String strM3483t2 = c1393m.m3483t0();
                if (strM3483t2 == "JX_TEXT" || (strM3483t2 != null && strM3483t2.equals("JX_TEXT"))) {
                    String strMo3511c2 = c1393m.mo3511c("EL_SAME_TAG_INDEX");
                    if (jLongValue == (C1305h.m3248b(strMo3511c2) ? -1 : Integer.parseInt(strMo3511c2))) {
                        c1551g.add(c1393m);
                    }
                } else if (jLongValue == C1290p.m3227b(c1393m, m3987G())) {
                    c1551g.add(c1393m);
                }
            } else if (c1665f.m3979l()) {
                if (c1665f.m3968a().booleanValue()) {
                    c1551g.add(c1393m);
                }
            } else if (c1665f.m3985r()) {
                if (C1305h.m3250d(c1665f.m3974g())) {
                    c1551g.add(c1393m);
                }
            } else if (!c1665f.m3981n()) {
                if (!c1665f.m3983p()) {
                    throw new C1710e("unknown expr val:" + c1665f);
                }
                if (c1665f.m3972e().size() > 0) {
                    c1551g.add(c1393m);
                }
            } else if (c1665f.m3971d().size() > 0) {
                c1551g.add(c1393m);
            }
        }
        return new C1665f(c1551g);
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: p */
    public final C1665f mo3878p(C1639f c1639f) {
        List listM4711k = c1639f.m4711k(C1641h.class);
        if (listM4711k.size() <= 1) {
            return (C1665f) ((InterfaceC1292b) listM4711k.get(0)).mo3232b(this);
        }
        Boolean boolM3968a = ((C1665f) ((InterfaceC1292b) listM4711k.get(0)).mo3232b(this)).m3968a();
        for (int i = 1; i < listM4711k.size(); i++) {
            boolM3968a = Boolean.valueOf(boolM3968a.booleanValue() & ((C1665f) ((InterfaceC1292b) listM4711k.get(i)).mo3232b(this)).m3968a().booleanValue());
        }
        return new C1665f(boolM3968a);
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x0212 A[LOOP:6: B:87:0x020c->B:89:0x0212, LOOP_END] */
    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: q */
    public final C1665f mo3879q(C1659z c1659z) {
        boolean z;
        C1665f c1665f;
        Iterator<C1654u> it;
        C1551g c1551gM3971d;
        C1665f c1665f2;
        if (c1659z.m3950m() != null && !c1659z.m3950m().m4637f()) {
            return (C1665f) c1659z.m3950m().mo3232b(this);
        }
        boolean z2 = false;
        if (c1659z.m3951n() == null || c1659z.m3951n().m4637f() || (c1665f2 = (C1665f) c1659z.m3951n().mo3232b(this)) == null) {
            z = false;
        } else {
            if (c1665f2.m3981n()) {
                m3988H(c1665f2.m3971d());
            } else if (c1665f2.m3978k()) {
                z = true;
                z2 = true;
            }
            z = true;
        }
        if (c1659z.m3952o() == null || c1659z.m3952o().m4637f()) {
            if (c1659z.m3953p() != null && c1659z.m3953p().size() > 0) {
                it = c1659z.m3953p().iterator();
                while (it.hasNext()) {
                    m3988H(((C1665f) it.next().mo3232b(this)).m3971d());
                }
            }
            c1665f = new C1665f(m3987G().m3960a());
        } else {
            C1665f c1665f3 = (C1665f) c1659z.m3952o().mo3232b(this);
            if (z2) {
                C1551g c1551gM3960a = m3987G().m3960a();
                String strM3974g = c1665f3.m3974g();
                if (m3987G().m3962f()) {
                    if (c1551gM3960a.size() == 1) {
                        C1551g c1551gM3478o0 = m3987G().m3967k().m3478o0("[" + strM3974g + "]");
                        LinkedList linkedList = new LinkedList();
                        Iterator<C1393m> it2 = c1551gM3478o0.iterator();
                        while (it2.hasNext()) {
                            linkedList.add(it2.next().mo3511c(strM3974g));
                        }
                        return new C1665f(linkedList);
                    }
                    C1551g c1551g = new C1551g();
                    Iterator<C1393m> it3 = c1551gM3960a.iterator();
                    while (it3.hasNext()) {
                        c1551g.addAll(it3.next().m3478o0("[" + strM3974g + "]"));
                    }
                    LinkedList linkedList2 = new LinkedList();
                    Iterator<C1393m> it4 = c1551g.iterator();
                    while (it4.hasNext()) {
                        linkedList2.add(it4.next().mo3511c(strM3974g));
                    }
                    c1665f = new C1665f(linkedList2);
                } else {
                    if (c1551gM3960a.size() != 1) {
                        LinkedList linkedList3 = new LinkedList();
                        Iterator<C1393m> it5 = c1551gM3960a.iterator();
                        while (it5.hasNext()) {
                            linkedList3.add(it5.next().mo3511c(strM3974g));
                        }
                        return new C1665f(linkedList3);
                    }
                    c1665f = new C1665f(m3987G().m3967k().mo3511c(strM3974g));
                }
            } else {
                if (c1665f3.m3982o()) {
                    String strM3974g2 = c1665f3.m3974g();
                    C1551g c1551gM3960a2 = m3987G().m3960a();
                    if (m3987G().m3962f()) {
                        c1551gM3971d = c1551gM3960a2.m3791h(strM3974g2);
                    } else {
                        C1551g c1551g2 = new C1551g();
                        for (C1393m c1393m : m3987G().m3960a()) {
                            if (!z) {
                                for (C1393m c1393m2 : c1393m.m3456V()) {
                                    if (c1393m2.mo3405s().equals(strM3974g2) || Marker.ANY_MARKER.equals(strM3974g2)) {
                                        c1551g2.add(c1393m2);
                                    }
                                }
                            } else if (c1393m.mo3405s().equals(strM3974g2) || Marker.ANY_MARKER.equals(strM3974g2)) {
                                c1551g2.add(c1393m);
                            }
                        }
                        m3988H(c1551g2);
                    }
                    if (c1659z.m3953p() != null) {
                        it = c1659z.m3953p().iterator();
                        while (it.hasNext()) {
                            m3988H(((C1665f) it.next().mo3232b(this)).m3971d());
                        }
                    }
                    c1665f = new C1665f(m3987G().m3960a());
                } else {
                    if (!c1665f3.m3981n()) {
                        return c1665f3;
                    }
                    c1551gM3971d = c1665f3.m3971d();
                }
                m3988H(c1551gM3971d);
                if (c1659z.m3953p() != null) {
                    it = c1659z.m3953p().iterator();
                    while (it.hasNext()) {
                        m3988H(((C1665f) it.next().mo3232b(this)).m3971d());
                    }
                }
                c1665f = new C1665f(m3987G().m3960a());
            }
        }
        return c1665f;
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: r */
    public final C1665f mo3880r(C1652s c1652s) {
        List listM4711k = c1652s.m4711k(C1639f.class);
        if (listM4711k.size() <= 1) {
            return (C1665f) ((InterfaceC1292b) listM4711k.get(0)).mo3232b(this);
        }
        Boolean boolM3968a = ((C1665f) ((InterfaceC1292b) listM4711k.get(0)).mo3232b(this)).m3968a();
        for (int i = 1; i < listM4711k.size(); i++) {
            boolM3968a = Boolean.valueOf(boolM3968a.booleanValue() | ((C1665f) ((InterfaceC1292b) listM4711k.get(i)).mo3232b(this)).m3968a().booleanValue());
        }
        return new C1665f(boolM3968a);
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: s */
    public final C1665f mo3881s(C1637d c1637d) {
        Stack<C1664e> stack = this.f3743a;
        C1664e c1664eM3958c = C1664e.m3958c(this.f3744b.m3960a());
        c1664eM3958c.m3966j(m3987G());
        stack.push(c1664eM3958c);
        String text = c1637d.f3729g.getText();
        if (text == "//" || (text != null && text.equals("//"))) {
            m3987G().m3964h();
        }
        C1665f c1665f = (C1665f) ((C1658y) c1637d.m4710j(C1658y.class)).mo3232b(this);
        this.f3743a.pop();
        return c1665f;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.github.catvod.spider.support.p044FM.p066V.f, java.lang.Object] */
    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: t */
    public final C1665f mo3882t(C1631C c1631c) {
        return mo3185g(c1631c);
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: u */
    public final C1665f mo3883u(C1644k c1644k) {
        LinkedList linkedList = new LinkedList();
        C1665f c1665f = (C1665f) ((C1645l) c1644k.m4710j(C1645l.class)).mo3232b(this);
        for (C1642i c1642i : c1644k.m4711k(C1642i.class)) {
            this.f3743a.push(C1664e.m3959d(m3987G()));
            linkedList.add(c1642i.mo3232b(this));
            this.f3743a.pop();
        }
        return C1712a.m3994a(c1665f.m3974g()).mo3955a(m3987G(), linkedList);
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: v */
    public final C1665f mo3884v(C1630B c1630b) {
        C1665f c1665f;
        C1393m c1393m;
        if (c1630b.m3833m() == null && !c1630b.m3833m().m4637f()) {
            return (C1665f) ((C1630B) c1630b.m4710j(C1630B.class)).mo3232b(this);
        }
        C1665f c1665f2 = (C1665f) c1630b.m3833m().mo3232b(this);
        if (c1630b.f3717g != null) {
            this.f3743a.push(C1664e.m3959d(m3987G().m3961e()));
            C1665f c1665f3 = (C1665f) ((C1630B) c1630b.m4710j(C1630B.class)).mo3232b(this);
            this.f3743a.pop();
            if (!c1665f2.m3981n()) {
                if (c1665f2.m3985r()) {
                    if (c1665f3.m3981n()) {
                        c1393m = new C1393m("V");
                        c1393m.m3451P(c1665f2.m3974g());
                        c1665f3.m3971d().add(c1393m);
                        return c1665f3;
                    }
                    c1665f = new C1665f(c1665f2.m3974g() + c1665f3.m3974g());
                    return c1665f;
                }
                if (c1665f2.m3979l()) {
                    if (c1665f3.m3979l()) {
                        c1665f = new C1665f(Boolean.valueOf(c1665f3.m3968a().booleanValue() | c1665f2.m3968a().booleanValue()));
                    } else {
                        if (c1665f3.m3981n()) {
                            c1393m = new C1393m("V");
                            c1393m.m3451P(c1665f2.m3974g());
                            c1665f3.m3971d().add(c1393m);
                            return c1665f3;
                        }
                        if (!c1665f3.m3985r()) {
                            StringBuilder sbM3589b = C1434P.m3589b("can not merge val1=");
                            sbM3589b.append(c1665f2.m3968a());
                            sbM3589b.append(",val2=");
                            sbM3589b.append(c1665f3.m3974g());
                            throw new C1709d(sbM3589b.toString());
                        }
                        c1665f = new C1665f(c1665f2.m3968a() + c1665f3.m3974g());
                    }
                    return c1665f;
                }
                if (!c1665f2.m3984q()) {
                    LinkedList linkedList = new LinkedList();
                    if (C1305h.m3250d(c1665f2.m3974g())) {
                        linkedList.add(c1665f2.m3974g());
                    }
                    if (C1305h.m3250d(c1665f3.m3974g())) {
                        linkedList.add(c1665f3.m3974g());
                    }
                    c1665f = new C1665f(C1305h.m3251e(linkedList, ","));
                } else {
                    if (!c1665f3.m3985r()) {
                        if (c1665f3.m3981n()) {
                            c1393m = new C1393m("V");
                            c1393m.m3451P(c1665f2.m3974g());
                            c1665f3.m3971d().add(c1393m);
                            return c1665f3;
                        }
                        StringBuilder sbM3589b2 = C1434P.m3589b("can not merge val1=");
                        sbM3589b2.append(c1665f2.m3970c());
                        sbM3589b2.append(",val2=");
                        sbM3589b2.append(c1665f3.m3974g());
                        throw new C1709d(sbM3589b2.toString());
                    }
                    c1665f = new C1665f(c1665f2.m3970c() + c1665f3.m3974g());
                }
                return c1665f;
            }
            if (c1665f3.m3981n()) {
                c1665f2.m3971d().addAll(c1665f3.m3971d());
            } else {
                C1393m c1393m2 = new C1393m("V");
                c1393m2.m3451P(c1665f3.m3974g());
                c1665f2.m3971d().add(c1393m2);
            }
        }
        return c1665f2;
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: w */
    public final C1665f mo3885w(C1629A c1629a) {
        C1665f c1665f = (C1665f) ((C1630B) c1629a.m4710j(C1630B.class)).mo3232b(this);
        return c1629a.f3716g == null ? c1665f : new C1665f(Double.valueOf(-c1665f.m3970c().doubleValue()));
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: x */
    public final C1665f mo3886x(C1656w c1656w) {
        List listM4711k = c1656w.m4711k(C1649p.class);
        if (listM4711k == null) {
            return null;
        }
        if (listM4711k.size() <= 1) {
            return (C1665f) ((InterfaceC1292b) listM4711k.get(0)).mo3232b(this);
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = listM4711k.iterator();
        while (it.hasNext()) {
            C1665f c1665f = (C1665f) ((C1649p) it.next()).mo3232b(this);
            if (c1665f != null) {
                linkedList.add(c1665f.m3974g());
            }
        }
        return new C1665f(C1305h.m3251e(linkedList, ":"));
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: y */
    public final C1665f mo3887y(C1641h c1641h) {
        C1665f c1665f;
        List listM4711k = c1641h.m4711k(C1657x.class);
        boolean z = true;
        boolean z2 = false;
        if (listM4711k.size() == 1) {
            return (C1665f) ((InterfaceC1292b) listM4711k.get(0)).mo3232b(this);
        }
        if (listM4711k.size() != 2) {
            StringBuilder sbM3589b = C1434P.m3589b("error equalityExpr near:");
            sbM3589b.append(c1641h.getText());
            throw new C1710e(sbM3589b.toString());
        }
        C1665f c1665f2 = (C1665f) ((InterfaceC1292b) listM4711k.get(0)).mo3232b(this);
        C1665f c1665f3 = (C1665f) ((InterfaceC1292b) listM4711k.get(1)).mo3232b(this);
        if ("=".equals(c1641h.f3731g.getText())) {
            if (c1665f2.m3986s().equals(c1665f3.m3986s())) {
                if (c1665f2 != c1665f3 && !c1665f2.equals(c1665f3)) {
                    z = false;
                }
                c1665f = new C1665f(Boolean.valueOf(z));
            } else {
                String strM3974g = c1665f2.m3974g();
                String strM3974g2 = c1665f3.m3974g();
                if (strM3974g != strM3974g2 && (strM3974g == null || !strM3974g.equals(strM3974g2))) {
                    z = false;
                }
                c1665f = new C1665f(Boolean.valueOf(z));
            }
        } else if (c1665f2.m3986s().equals(c1665f3.m3986s())) {
            c1665f = new C1665f(Boolean.valueOf(!(c1665f2 == c1665f3 || c1665f2.equals(c1665f3))));
        } else {
            String strM3974g3 = c1665f2.m3974g();
            String strM3974g4 = c1665f3.m3974g();
            if (strM3974g3 == strM3974g4 || (strM3974g3 != null && strM3974g3.equals(strM3974g4))) {
                z2 = true;
            }
            c1665f = new C1665f(Boolean.valueOf(!z2));
        }
        return c1665f;
    }

    @Override // com.github.catvod.spider.support.p044FM.p065U.InterfaceC1633E
    /* JADX INFO: renamed from: z */
    public final C1665f mo3888z(C1651r c1651r) {
        if (((C1650q) c1651r.m4710j(C1650q.class)) != null) {
            return (C1665f) ((C1650q) c1651r.m4710j(C1650q.class)).mo3232b(this);
        }
        if (c1651r.m4712l(5) != null) {
            return C1712a.m3995b(c1651r.m4712l(5).getText()).mo3956a(m3987G());
        }
        return null;
    }
}
