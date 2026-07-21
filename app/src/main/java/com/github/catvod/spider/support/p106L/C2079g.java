package com.github.catvod.spider.support.p106L;

import com.base.model.proto.DramaDetailProto;
import com.github.catvod.spider.support.p042E.C1271c;
import com.github.catvod.spider.support.p043F.C1273a;
import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p103I.AbstractC2061d;
import com.github.catvod.spider.support.p103I.C2058a;
import com.github.catvod.spider.support.p103I.C2060c;
import com.github.catvod.spider.support.p103I.C2063f;
import com.github.catvod.spider.support.p105K.C2068a;
import com.github.catvod.spider.support.p105K.C2071d;
import com.github.catvod.spider.support.p110P.C2121d;
import com.github.catvod.spider.support.p110P.C2122e;
import com.github.catvod.spider.support.p111Q.C2123a;
import com.github.catvod.spider.support.p112R.C2126c;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p128m.C2261d;
import com.github.catvod.spider.support.p134t.InterfaceC2333z;
import com.github.catvod.spider.support.p138x.InterfaceC2412b;
import com.github.catvod.spider.support.p139y.C2423f;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import org.slf4j.Marker;

/* JADX INFO: renamed from: com.github.catvod.spider.support.L.g */
/* JADX INFO: loaded from: classes.dex */
public final class C2079g extends C2068a<C2078f> {

    /* JADX INFO: renamed from: a */
    private Stack<C2077e> f4970a;

    /* JADX INFO: renamed from: b */
    private C2077e f4971b;

    public C2079g(C2060c c2060c) {
        C2126c.m5370d(C2079g.class);
        this.f4970a = new Stack<>();
        this.f4971b = C2077e.m5327c(c2060c);
        Stack<C2077e> stack = this.f4970a;
        C2077e c2077eM5327c = C2077e.m5327c(c2060c);
        c2077eM5327c.m5335j(this.f4971b);
        stack.push(c2077eM5327c);
    }

    /* JADX INFO: renamed from: G */
    private C2077e m5356G() {
        return this.f4970a.peek();
    }

    /* JADX INFO: renamed from: H */
    private void m5357H(C2060c c2060c) {
        this.f4970a.peek().m5334i(c2060c);
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: B */
    public final Object mo5297B(C2071d.u uVar) {
        List listM6292k = uVar.m6292k(C2071d.n.class);
        if (listM6292k == null) {
            return null;
        }
        if (listM6292k.size() <= 1) {
            return (C2078f) ((InterfaceC2412b) listM6292k.get(0)).mo5281a(this);
        }
        LinkedList linkedList = new LinkedList();
        Iterator it = listM6292k.iterator();
        while (it.hasNext()) {
            C2078f c2078f = (C2078f) ((C2071d.n) it.next()).mo5281a(this);
            if (c2078f != null) {
                linkedList.add(c2078f.m5343g());
            }
        }
        return new C2078f(C2423f.m6441e(linkedList, ":"));
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: C */
    public final Object mo5298C(C2071d.m mVar) {
        if (mVar.m5286m() == null || mVar.m5286m().m6303f()) {
            return (C2078f) ((C2071d.y) mVar.m6291j(C2071d.y.class)).mo5281a(this);
        }
        C2078f c2078f = (C2078f) ((C2071d.y) mVar.m6291j(C2071d.y.class)).mo5281a(this);
        C2078f c2078f2 = (C2078f) mVar.m5286m().mo5281a(this);
        switch (mVar.f4957g.getType()) {
            case 17:
                return new C2078f(Double.valueOf(c2078f2.m5339c().doubleValue() * c2078f.m5339c().doubleValue()));
            case 18:
                return new C2078f(Double.valueOf(c2078f.m5339c().doubleValue() / c2078f2.m5339c().doubleValue()));
            case 19:
                return new C2078f(Double.valueOf(c2078f.m5339c().doubleValue() % c2078f2.m5339c().doubleValue()));
            default:
                StringBuilder sbM5396a = C2137a.m5396a("syntax error, ");
                sbM5396a.append(mVar.getText());
                throw new C2122e(sbM5396a.toString());
        }
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: D */
    public final Object mo5299D(C2071d.f fVar) {
        C2078f c2078f;
        List listM6292k = fVar.m6292k(C2071d.v.class);
        boolean z = true;
        boolean z2 = false;
        if (listM6292k.size() == 1) {
            return (C2078f) ((InterfaceC2412b) listM6292k.get(0)).mo5281a(this);
        }
        if (listM6292k.size() != 2) {
            StringBuilder sbM5396a = C2137a.m5396a("error equalityExpr near:");
            sbM5396a.append(fVar.getText());
            throw new C2122e(sbM5396a.toString());
        }
        C2078f c2078f2 = (C2078f) ((InterfaceC2412b) listM6292k.get(0)).mo5281a(this);
        C2078f c2078f3 = (C2078f) ((InterfaceC2412b) listM6292k.get(1)).mo5281a(this);
        if ("=".equals(fVar.f4956g.getText())) {
            if (c2078f2.m5355s().equals(c2078f3.m5355s())) {
                if (c2078f2 != c2078f3 && !c2078f2.equals(c2078f3)) {
                    z = false;
                }
                c2078f = new C2078f(Boolean.valueOf(z));
            } else {
                String strM5343g = c2078f2.m5343g();
                String strM5343g2 = c2078f3.m5343g();
                if (strM5343g != strM5343g2 && (strM5343g == null || !strM5343g.equals(strM5343g2))) {
                    z = false;
                }
                c2078f = new C2078f(Boolean.valueOf(z));
            }
        } else if (c2078f2.m5355s().equals(c2078f3.m5355s())) {
            c2078f = new C2078f(Boolean.valueOf(!(c2078f2 == c2078f3 || c2078f2.equals(c2078f3))));
        } else {
            String strM5343g3 = c2078f2.m5343g();
            String strM5343g4 = c2078f3.m5343g();
            if (strM5343g3 == strM5343g4 || (strM5343g3 != null && strM5343g3.equals(strM5343g4))) {
                z2 = true;
            }
            c2078f = new C2078f(Boolean.valueOf(!z2));
        }
        return c2078f;
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: b */
    public final Object mo5300b(C2071d.w wVar) {
        C2078f c2078f = null;
        for (int i = 0; i < wVar.mo6289d(); i++) {
            InterfaceC2412b interfaceC2412bMo6288c = wVar.mo6288c(i);
            if (interfaceC2412bMo6288c instanceof C2071d.x) {
                c2078f = (C2078f) interfaceC2412bMo6288c.mo5281a(this);
                if (c2078f.m5350n()) {
                    m5357H(c2078f.m5340d());
                }
            } else if ("//".equals(interfaceC2412bMo6288c.getText())) {
                m5356G().m5333h();
            } else {
                m5356G().m5332g();
            }
        }
        return c2078f;
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: c */
    public final Object mo5301c(C2071d.g gVar) {
        return (C2078f) ((C2071d.q) gVar.m6291j(C2071d.q.class)).mo5281a(this);
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: d */
    public final Object mo5302d(C2071d.n nVar) {
        C2078f c2078f = nVar.m6293l(7) != null ? new C2078f(nVar.m6293l(7).getText()) : new C2078f(nVar.m6293l(41).getText());
        c2078f.m5346j();
        return c2078f;
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: e */
    public final Object mo5303e(C2071d.s sVar) {
        long size;
        C2060c c2060c = new C2060c();
        for (C2037i c2037i : m5356G().m5329a()) {
            Stack<C2077e> stack = this.f4970a;
            C2077e c2077eM5326b = C2077e.m5326b(c2037i);
            c2077eM5326b.m5335j(m5356G());
            stack.push(c2077eM5326b);
            C2078f c2078f = (C2078f) ((C2071d.g) sVar.m6291j(C2071d.g.class)).mo5281a(this);
            this.f4970a.pop();
            if (c2078f.m5353q()) {
                long jLongValue = c2078f.m5342f().longValue();
                if (jLongValue < 0) {
                    String strM4901r0 = c2037i.m4901r0();
                    if (strM4901r0 == "JX_TEXT" || (strM4901r0 != null && strM4901r0.equals("JX_TEXT"))) {
                        String strMo4929d = c2037i.mo4929d("EL_SAME_TAG_ALL_NUM");
                        size = C2423f.m6438b(strMo4929d) ? -1 : Integer.parseInt(strMo4929d);
                    } else {
                        C2077e c2077eM5356G = m5356G();
                        C2060c c2060c2 = new C2060c();
                        C2037i c2037iM4890j0 = c2037i.m4890j0();
                        String strM4901r1 = c2037i.m4901r0();
                        c2037iM4890j0.getClass();
                        C1271c.m3155e(strM4901r1);
                        for (C2037i c2037i2 : C2058a.m5174a(new AbstractC2061d.N(C1273a.m3166f(strM4901r1)), c2037iM4890j0)) {
                            if (c2077eM5356G.m5329a().contains(c2037i2)) {
                                c2060c2.add(c2037i2);
                            }
                        }
                        size = c2060c2.size();
                    }
                    jLongValue = size + jLongValue + 1;
                    if (jLongValue < 0) {
                        jLongValue = 1;
                    }
                }
                String strM4901r2 = c2037i.m4901r0();
                if (strM4901r2 == "JX_TEXT" || (strM4901r2 != null && strM4901r2.equals("JX_TEXT"))) {
                    String strMo4929d2 = c2037i.mo4929d("EL_SAME_TAG_INDEX");
                    if (jLongValue == (C2423f.m6438b(strMo4929d2) ? -1 : Integer.parseInt(strMo4929d2))) {
                        c2060c.add(c2037i);
                    }
                } else if (jLongValue == C2261d.m6142b(c2037i, m5356G())) {
                    c2060c.add(c2037i);
                }
            } else if (c2078f.m5348l()) {
                if (c2078f.m5337a().booleanValue()) {
                    c2060c.add(c2037i);
                }
            } else if (c2078f.m5354r()) {
                if (C2423f.m6440d(c2078f.m5343g())) {
                    c2060c.add(c2037i);
                }
            } else if (!c2078f.m5350n()) {
                if (!c2078f.m5352p()) {
                    throw new C2122e("unknown expr val:" + c2078f);
                }
                if (c2078f.m5341e().size() > 0) {
                    c2060c.add(c2037i);
                }
            } else if (c2078f.m5340d().size() > 0) {
                c2060c.add(c2037i);
            }
        }
        return new C2078f(c2060c);
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: f */
    public final Object mo5304f(C2071d.c cVar) {
        List listM6292k = cVar.m6292k(C2071d.m.class);
        if (listM6292k.size() == 1) {
            return (C2078f) ((InterfaceC2412b) listM6292k.get(0)).mo5281a(this);
        }
        Double dM5339c = ((C2078f) ((InterfaceC2412b) listM6292k.get(0)).mo5281a(this)).m5339c();
        String text = null;
        for (int i = 1; i < cVar.mo6289d(); i++) {
            InterfaceC2412b interfaceC2412bMo6288c = cVar.mo6288c(i);
            if (interfaceC2412bMo6288c instanceof C2071d.m) {
                C2078f c2078f = (C2078f) interfaceC2412bMo6288c.mo5281a(this);
                if (Marker.ANY_NON_NULL_MARKER.equals(text)) {
                    dM5339c = Double.valueOf(c2078f.m5339c().doubleValue() + dM5339c.doubleValue());
                } else {
                    if (!"-".equals(text)) {
                        StringBuilder sbM5396a = C2137a.m5396a("syntax error, ");
                        sbM5396a.append(cVar.getText());
                        throw new C2122e(sbM5396a.toString());
                    }
                    dM5339c = Double.valueOf(dM5339c.doubleValue() - c2078f.m5339c().doubleValue());
                }
            } else {
                text = interfaceC2412bMo6288c.getText();
            }
        }
        return new C2078f(dM5339c);
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: g */
    public final Object mo5305g(C2071d.h hVar) {
        return (C2078f) ((C2071d.t) hVar.m6291j(C2071d.t.class)).mo5281a(this);
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: h */
    public final Object mo5306h(C2071d.p pVar) {
        if (((C2071d.o) pVar.m6291j(C2071d.o.class)) != null) {
            return (C2078f) ((C2071d.o) pVar.m6291j(C2071d.o.class)).mo5281a(this);
        }
        if (pVar.m6293l(5) != null) {
            return C2123a.m5364b(pVar.m6293l(5).getText()).mo5325a(m5356G());
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x025c A[LOOP:8: B:95:0x0256->B:97:0x025c, LOOP_END] */
    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: j */
    public final Object mo5307j(C2071d.x xVar) {
        boolean z;
        C2078f c2078f;
        Iterator<C2071d.s> it;
        C2078f c2078f2;
        if (xVar.m5292m() != null && !xVar.m5292m().m6303f()) {
            return (C2078f) xVar.m5292m().mo5281a(this);
        }
        boolean z2 = false;
        if (xVar.m5293n() == null || xVar.m5293n().m6303f() || (c2078f2 = (C2078f) xVar.m5293n().mo5281a(this)) == null) {
            z = false;
        } else {
            if (c2078f2.m5350n()) {
                m5357H(c2078f2.m5340d());
            } else if (c2078f2.m5347k()) {
                z = true;
                z2 = true;
            }
            z = true;
        }
        if (xVar.m5294o() == null || xVar.m5294o().m6303f()) {
            if (xVar.m5295p() != null && xVar.m5295p().size() > 0) {
                it = xVar.m5295p().iterator();
                while (it.hasNext()) {
                    m5357H(((C2078f) it.next().mo5281a(this)).m5340d());
                }
            }
            c2078f = new C2078f(m5356G().m5329a());
        } else {
            C2078f c2078f3 = (C2078f) xVar.m5294o().mo5281a(this);
            if (z2) {
                C2060c c2060cM5329a = m5356G().m5329a();
                String strM5343g = c2078f3.m5343g();
                if (m5356G().m5331f()) {
                    if (c2060cM5329a.size() == 1) {
                        C2060c c2060cM4896n0 = m5356G().m5336k().m4896n0("[" + strM5343g + "]");
                        LinkedList linkedList = new LinkedList();
                        Iterator<C2037i> it2 = c2060cM4896n0.iterator();
                        while (it2.hasNext()) {
                            linkedList.add(it2.next().mo4929d(strM5343g));
                        }
                        return new C2078f(linkedList);
                    }
                    C2060c c2060c = new C2060c();
                    Iterator<C2037i> it3 = c2060cM5329a.iterator();
                    while (it3.hasNext()) {
                        c2060c.addAll(it3.next().m4896n0("[" + strM5343g + "]"));
                    }
                    LinkedList linkedList2 = new LinkedList();
                    Iterator<C2037i> it4 = c2060c.iterator();
                    while (it4.hasNext()) {
                        linkedList2.add(it4.next().mo4929d(strM5343g));
                    }
                    c2078f = new C2078f(linkedList2);
                } else {
                    if (c2060cM5329a.size() != 1) {
                        LinkedList linkedList3 = new LinkedList();
                        Iterator<C2037i> it5 = c2060cM5329a.iterator();
                        while (it5.hasNext()) {
                            linkedList3.add(it5.next().mo4929d(strM5343g));
                        }
                        return new C2078f(linkedList3);
                    }
                    c2078f = new C2078f(m5356G().m5336k().mo4929d(strM5343g));
                }
            } else {
                if (c2078f3.m5351o()) {
                    String strM5343g2 = c2078f3.m5343g();
                    C2060c c2060cM5329a2 = m5356G().m5329a();
                    if (m5356G().m5331f()) {
                        c2060cM5329a2.getClass();
                        C1271c.m3155e(strM5343g2);
                        AbstractC2061d abstractC2061dM5192j = C2063f.m5192j(strM5343g2);
                        C2060c c2060c2 = new C2060c();
                        IdentityHashMap identityHashMap = new IdentityHashMap();
                        for (C2037i c2037i : c2060cM5329a2) {
                            C1271c.m3157g(abstractC2061dM5192j);
                            C1271c.m3157g(c2037i);
                            for (C2037i c2037i2 : C2058a.m5174a(abstractC2061dM5192j, c2037i)) {
                                if (identityHashMap.put(c2037i2, Boolean.TRUE) == null) {
                                    c2060c2.add(c2037i2);
                                }
                            }
                        }
                        m5357H(c2060c2);
                    } else {
                        C2060c c2060c3 = new C2060c();
                        for (C2037i c2037i3 : m5356G().m5329a()) {
                            if (!z) {
                                for (C2037i c2037i4 : c2037i3.m4876V()) {
                                    if (c2037i4.mo4832t().equals(strM5343g2) || Marker.ANY_MARKER.equals(strM5343g2)) {
                                        c2060c3.add(c2037i4);
                                    }
                                }
                            } else if (c2037i3.mo4832t().equals(strM5343g2) || Marker.ANY_MARKER.equals(strM5343g2)) {
                                c2060c3.add(c2037i3);
                            }
                        }
                        m5357H(c2060c3);
                    }
                } else {
                    if (!c2078f3.m5350n()) {
                        return c2078f3;
                    }
                    m5357H(c2078f3.m5340d());
                }
                if (xVar.m5295p() != null) {
                    it = xVar.m5295p().iterator();
                    while (it.hasNext()) {
                        m5357H(((C2078f) it.next().mo5281a(this)).m5340d());
                    }
                }
                c2078f = new C2078f(m5356G().m5329a());
            }
        }
        return c2078f;
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: k */
    public final Object mo5308k(C2071d.i iVar) {
        LinkedList linkedList = new LinkedList();
        C2078f c2078f = (C2078f) ((C2071d.j) iVar.m6291j(C2071d.j.class)).mo5281a(this);
        for (C2071d.g gVar : iVar.m6292k(C2071d.g.class)) {
            this.f4970a.push(C2077e.m5328d(m5356G()));
            linkedList.add(gVar.mo5281a(this));
            this.f4970a.pop();
        }
        return C2123a.m5363a(c2078f.m5343g()).mo5324a(m5356G(), linkedList);
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: l */
    public final Object mo5309l(C2071d.t tVar) {
        C2078f c2078f;
        InterfaceC2412b interfaceC2412bM5291n;
        if (tVar.m5290m() != null && !tVar.m5290m().m6303f()) {
            interfaceC2412bM5291n = tVar.m5290m();
        } else {
            if (tVar.m5291n() == null || tVar.m5291n().m6303f()) {
                if (tVar.m6293l(39) != null) {
                    c2078f = new C2078f(tVar.m6293l(39).getText());
                    c2078f.m5346j();
                } else {
                    if (tVar.m6293l(6) == null) {
                        StringBuilder sbM5396a = C2137a.m5396a("not support variableReference:");
                        sbM5396a.append(tVar.getText());
                        throw new C2122e(sbM5396a.toString());
                    }
                    String text = tVar.m6293l(6).getText();
                    c2078f = new C2078f(text == null ? null : Double.valueOf(text));
                }
                return c2078f;
            }
            interfaceC2412bM5291n = tVar.m5291n();
        }
        return (C2078f) interfaceC2412bM5291n.mo5281a(this);
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: n */
    public final Object mo5310n(C2071d.z zVar) {
        C2078f c2078f;
        C2037i c2037i;
        if (zVar.m5296m() == null && !zVar.m5296m().m6303f()) {
            return (C2078f) ((C2071d.z) zVar.m6291j(C2071d.z.class)).mo5281a(this);
        }
        C2078f c2078f2 = (C2078f) zVar.m5296m().mo5281a(this);
        if (zVar.f4962g != null) {
            this.f4970a.push(C2077e.m5328d(m5356G().m5330e()));
            C2078f c2078f3 = (C2078f) ((C2071d.z) zVar.m6291j(C2071d.z.class)).mo5281a(this);
            this.f4970a.pop();
            if (!c2078f2.m5350n()) {
                if (c2078f2.m5354r()) {
                    if (c2078f3.m5350n()) {
                        c2037i = new C2037i("V");
                        c2037i.m4872Q(c2078f2.m5343g());
                        c2078f3.m5340d().add(c2037i);
                        return c2078f3;
                    }
                    c2078f = new C2078f(c2078f2.m5343g() + c2078f3.m5343g());
                    return c2078f;
                }
                if (c2078f2.m5348l()) {
                    if (c2078f3.m5348l()) {
                        c2078f = new C2078f(Boolean.valueOf(c2078f3.m5337a().booleanValue() | c2078f2.m5337a().booleanValue()));
                    } else {
                        if (c2078f3.m5350n()) {
                            c2037i = new C2037i("V");
                            c2037i.m4872Q(c2078f2.m5343g());
                            c2078f3.m5340d().add(c2037i);
                            return c2078f3;
                        }
                        if (!c2078f3.m5354r()) {
                            StringBuilder sbM5396a = C2137a.m5396a("can not merge val1=");
                            sbM5396a.append(c2078f2.m5337a());
                            sbM5396a.append(",val2=");
                            sbM5396a.append(c2078f3.m5343g());
                            throw new C2121d(sbM5396a.toString());
                        }
                        c2078f = new C2078f(c2078f2.m5337a() + c2078f3.m5343g());
                    }
                    return c2078f;
                }
                if (!c2078f2.m5353q()) {
                    LinkedList linkedList = new LinkedList();
                    if (C2423f.m6440d(c2078f2.m5343g())) {
                        linkedList.add(c2078f2.m5343g());
                    }
                    if (C2423f.m6440d(c2078f3.m5343g())) {
                        linkedList.add(c2078f3.m5343g());
                    }
                    c2078f = new C2078f(C2423f.m6441e(linkedList, ","));
                } else {
                    if (!c2078f3.m5354r()) {
                        if (c2078f3.m5350n()) {
                            c2037i = new C2037i("V");
                            c2037i.m4872Q(c2078f2.m5343g());
                            c2078f3.m5340d().add(c2037i);
                            return c2078f3;
                        }
                        StringBuilder sbM5396a2 = C2137a.m5396a("can not merge val1=");
                        sbM5396a2.append(c2078f2.m5339c());
                        sbM5396a2.append(",val2=");
                        sbM5396a2.append(c2078f3.m5343g());
                        throw new C2121d(sbM5396a2.toString());
                    }
                    c2078f = new C2078f(c2078f2.m5339c() + c2078f3.m5343g());
                }
                return c2078f;
            }
            if (c2078f3.m5350n()) {
                c2078f2.m5340d().addAll(c2078f3.m5340d());
            } else {
                C2037i c2037i2 = new C2037i("V");
                c2037i2.m4872Q(c2078f3.m5343g());
                c2078f2.m5340d().add(c2037i2);
            }
        }
        return c2078f2;
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: o */
    public final Object mo5311o(C2071d.y yVar) {
        C2078f c2078f = (C2078f) ((C2071d.z) yVar.m6291j(C2071d.z.class)).mo5281a(this);
        return yVar.f4961g == null ? c2078f : new C2078f(Double.valueOf(-c2078f.m5339c().doubleValue()));
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: p */
    public final Object mo5312p(C2071d.q qVar) {
        List listM6292k = qVar.m6292k(C2071d.d.class);
        if (listM6292k.size() <= 1) {
            return (C2078f) ((InterfaceC2412b) listM6292k.get(0)).mo5281a(this);
        }
        Boolean boolM5337a = ((C2078f) ((InterfaceC2412b) listM6292k.get(0)).mo5281a(this)).m5337a();
        for (int i = 1; i < listM6292k.size(); i++) {
            boolM5337a = Boolean.valueOf(boolM5337a.booleanValue() | ((C2078f) ((InterfaceC2412b) listM6292k.get(i)).mo5281a(this)).m5337a().booleanValue());
        }
        return new C2078f(boolM5337a);
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: q */
    public final Object mo5313q(C2071d.b bVar) {
        Stack<C2077e> stack = this.f4970a;
        C2077e c2077eM5327c = C2077e.m5327c(this.f4971b.m5329a());
        c2077eM5327c.m5335j(m5356G());
        stack.push(c2077eM5327c);
        String text = bVar.f4954g.getText();
        if (text == "//" || (text != null && text.equals("//"))) {
            m5356G().m5333h();
        }
        C2078f c2078f = (C2078f) ((C2071d.w) bVar.m6291j(C2071d.w.class)).mo5281a(this);
        this.f4970a.pop();
        return c2078f;
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: r */
    public final Object mo5314r(C2071d.e eVar) {
        if (eVar.m6293l(7) != null) {
            return C2123a.m5365c(eVar.m6293l(7).getText()).mo5323a(m5356G().m5329a());
        }
        if (!"@".equals(eVar.getText())) {
            return null;
        }
        C2078f c2078f = new C2078f(null);
        c2078f.m5344h();
        return c2078f;
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: s */
    public final Object mo5315s(C2071d.r rVar) {
        InterfaceC2412b interfaceC2412bM5289m;
        if (rVar.m5289m() == null || rVar.m5289m().m6303f()) {
            InterfaceC2333z interfaceC2333z = rVar.f4958g;
            if (interfaceC2333z == null) {
                interfaceC2412bM5289m = (C2071d.h) rVar.m6291j(C2071d.h.class);
            } else {
                if ("//".equals(interfaceC2333z.getText())) {
                    m5356G().m5333h();
                }
                interfaceC2412bM5289m = (C2071d.w) rVar.m6291j(C2071d.w.class);
            }
        } else {
            interfaceC2412bM5289m = rVar.m5289m();
        }
        return (C2078f) interfaceC2412bM5289m.mo5281a(this);
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: t */
    public final Object mo5316t(C2071d.l lVar) {
        return (C2078f) ((C2071d.g) lVar.m6291j(C2071d.g.class)).mo5281a(this);
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: u */
    public final Object mo5317u(C2071d.d dVar) {
        List listM6292k = dVar.m6292k(C2071d.f.class);
        if (listM6292k.size() <= 1) {
            return (C2078f) ((InterfaceC2412b) listM6292k.get(0)).mo5281a(this);
        }
        Boolean boolM5337a = ((C2078f) ((InterfaceC2412b) listM6292k.get(0)).mo5281a(this)).m5337a();
        for (int i = 1; i < listM6292k.size(); i++) {
            boolM5337a = Boolean.valueOf(boolM5337a.booleanValue() & ((C2078f) ((InterfaceC2412b) listM6292k.get(i)).mo5281a(this)).m5337a().booleanValue());
        }
        return new C2078f(boolM5337a);
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: v */
    public final Object mo5318v(C2071d.k kVar) {
        return (C2078f) ((kVar.m5285m() == null || kVar.m5285m().m6303f()) ? (C2071d.b) kVar.m6291j(C2071d.b.class) : kVar.m5285m()).mo5281a(this);
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: w */
    public final Object mo5319w(C2071d.j jVar) {
        return (C2078f) ((C2071d.u) jVar.m6291j(C2071d.u.class)).mo5281a(this);
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: x */
    public final Object mo5320x(C2071d.C2702a c2702a) {
        if (!"..".equals(c2702a.getText())) {
            return new C2078f(m5356G().m5329a());
        }
        HashSet hashSet = new HashSet();
        C2060c c2060c = new C2060c();
        Iterator<C2037i> it = m5356G().m5329a().iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().m4890j0());
        }
        c2060c.addAll(hashSet);
        return new C2078f(c2060c);
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: y */
    public final Object mo5321y(C2071d.o oVar) {
        InterfaceC2412b interfaceC2412bM5287m;
        if (Marker.ANY_MARKER.equals(oVar.getText())) {
            C2078f c2078f = new C2078f(Marker.ANY_MARKER);
            c2078f.m5346j();
            return c2078f;
        }
        if (oVar.m5288n() != null && !oVar.m5288n().m6303f()) {
            interfaceC2412bM5287m = oVar.m5288n();
        } else {
            if (oVar.m5287m() == null || oVar.m5287m().m6303f()) {
                return null;
            }
            interfaceC2412bM5287m = oVar.m5287m();
        }
        return (C2078f) interfaceC2412bM5287m.mo5281a(this);
    }

    @Override // com.github.catvod.spider.support.p105K.InterfaceC2072e
    /* JADX INFO: renamed from: z */
    public final Object mo5322z(C2071d.v vVar) {
        C2078f c2078f;
        List listM6292k = vVar.m6292k(C2071d.c.class);
        if (listM6292k.size() == 1) {
            return (C2078f) ((InterfaceC2412b) listM6292k.get(0)).mo5281a(this);
        }
        if (listM6292k.size() != 2) {
            StringBuilder sbM5396a = C2137a.m5396a("error equalityExpr near:");
            sbM5396a.append(vVar.getText());
            throw new C2122e(sbM5396a.toString());
        }
        C2078f c2078f2 = (C2078f) ((InterfaceC2412b) listM6292k.get(0)).mo5281a(this);
        C2078f c2078f3 = (C2078f) ((InterfaceC2412b) listM6292k.get(1)).mo5281a(this);
        switch (vVar.f4959g.getType()) {
            case 24:
                c2078f = new C2078f(Boolean.valueOf(c2078f2.compareTo(c2078f3) < 0));
                break;
            case 25:
                c2078f = new C2078f(Boolean.valueOf(c2078f2.compareTo(c2078f3) > 0));
                break;
            case 26:
                c2078f = new C2078f(Boolean.valueOf(c2078f2.compareTo(c2078f3) <= 0));
                break;
            case 27:
                c2078f = new C2078f(Boolean.valueOf(c2078f2.compareTo(c2078f3) >= 0));
                break;
            case 28:
            case 29:
            default:
                StringBuilder sbM5396a2 = C2137a.m5396a("unknown operator");
                sbM5396a2.append(vVar.f4959g.getText());
                throw new C2122e(sbM5396a2.toString());
            case 30:
                c2078f = new C2078f(Boolean.valueOf(c2078f2.m5343g().startsWith(c2078f3.m5343g())));
                break;
            case 31:
                c2078f = new C2078f(Boolean.valueOf(c2078f2.m5343g().endsWith(c2078f3.m5343g())));
                break;
            case DramaDetailProto.DramaDetailBean.FAVORITE_FIELD_NUMBER /* 32 */:
                c2078f = new C2078f(Boolean.valueOf(c2078f2.m5343g().contains(c2078f3.m5343g())));
                break;
            case 33:
                c2078f = new C2078f(Boolean.valueOf(c2078f2.m5343g().matches(c2078f3.m5343g())));
                break;
            case 34:
                c2078f = new C2078f(Boolean.valueOf(!c2078f2.m5343g().matches(c2078f3.m5343g())));
                break;
        }
        return c2078f;
    }
}
