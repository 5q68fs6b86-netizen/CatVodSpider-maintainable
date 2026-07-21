package com.github.catvod.spider.support.p044FM.p098x;

import com.github.catvod.spider.support.p044FM.p045A.C1285k;
import com.github.catvod.spider.support.p044FM.p045A.C1288n;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p065U.C1632D;
import com.github.catvod.spider.support.p044FM.p099y.AbstractC2001m;
import com.github.catvod.spider.support.p044FM.p099y.C1969S;
import com.github.catvod.spider.support.p044FM.p099y.C1977a;
import com.github.catvod.spider.support.p044FM.p099y.C1988f0;
import java.io.PrintStream;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.x.p */
/* JADX INFO: loaded from: classes.dex */
public class C1941p {

    /* JADX INFO: renamed from: a */
    protected boolean f4431a = false;

    /* JADX INFO: renamed from: b */
    protected int f4432b = -1;

    /* JADX INFO: renamed from: c */
    protected C1285k f4433c;

    /* JADX INFO: renamed from: d */
    protected C1950y f4434d;

    /* JADX INFO: renamed from: e */
    protected int f4435e;

    /* JADX INFO: renamed from: a */
    protected final void m4685a(AbstractC1949x abstractC1949x, C1285k c1285k) {
        InterfaceC1922H interfaceC1922H = abstractC1949x.f4451e;
        while (true) {
            int iMo4659h = interfaceC1922H.mo4659h(1);
            if (iMo4659h == -1 || c1285k.m3209d(iMo4659h)) {
                return;
            }
            abstractC1949x.m4698j();
            interfaceC1922H = abstractC1949x.f4451e;
        }
    }

    /* JADX INFO: renamed from: b */
    protected final String m4686b(String str) {
        return "'" + str.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t") + "'";
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.y.m>] */
    /* JADX INFO: renamed from: c */
    protected final C1285k m4687c(AbstractC1949x abstractC1949x) {
        C1977a c1977a = ((C1969S) abstractC1949x.f4391b).f4557a;
        C1285k c1285k = new C1285k(new int[0]);
        for (C1918D c1918d = abstractC1949x.f4453g; c1918d != null; c1918d = c1918d.f4394a) {
            int i = c1918d.f4395b;
            if (i < 0) {
                break;
            }
            c1285k.m3208c(c1977a.m4763e(((C1988f0) ((AbstractC2001m) c1977a.f4513a.get(i)).m4789d(0)).f4542c));
        }
        c1285k.m3212h();
        return c1285k;
    }

    /* JADX INFO: renamed from: d */
    protected final C1285k m4688d(AbstractC1949x abstractC1949x) {
        abstractC1949x.getClass();
        return C1632D.f3723q.m4761c(abstractC1949x.m4634g(), abstractC1949x.f4453g);
    }

    /* JADX INFO: renamed from: e */
    protected final String m4689e(InterfaceC1919E interfaceC1919E) {
        if (interfaceC1919E == null) {
            return "<no token>";
        }
        String text = interfaceC1919E.getText();
        if (text == null) {
            if (interfaceC1919E.getType() == -1) {
                text = "<EOF>";
            } else {
                StringBuilder sbM3589b = C1434P.m3589b("<");
                sbM3589b.append(interfaceC1919E.getType());
                sbM3589b.append(">");
                text = sbM3589b.toString();
            }
        }
        return m4686b(text);
    }

    /* JADX INFO: renamed from: f */
    public void mo3990f(AbstractC1949x abstractC1949x, C1915A c1915a) {
        C1285k c1285k;
        if (this.f4432b == abstractC1949x.f4451e.mo4660i() && (c1285k = this.f4433c) != null && c1285k.m3209d(abstractC1949x.m4634g())) {
            abstractC1949x.m4698j();
        }
        this.f4432b = abstractC1949x.f4451e.mo4660i();
        if (this.f4433c == null) {
            this.f4433c = new C1285k(new int[0]);
        }
        this.f4433c.m3206a(abstractC1949x.m4634g());
        m4685a(abstractC1949x, m4687c(abstractC1949x));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.y.m>] */
    /* JADX INFO: renamed from: g */
    public InterfaceC1919E mo3991g(AbstractC1949x abstractC1949x) {
        String string;
        InterfaceC1919E interfaceC1919EM4693k = m4693k(abstractC1949x);
        if (interfaceC1919EM4693k != null) {
            abstractC1949x.m4698j();
            return interfaceC1919EM4693k;
        }
        boolean z = true;
        if (!((C1969S) abstractC1949x.f4391b).f4557a.m4764f(((AbstractC2001m) ((C1969S) abstractC1949x.f4391b).f4557a.f4513a.get(abstractC1949x.m4634g())).m4789d(0).f4577a, abstractC1949x.f4453g).m3209d(abstractC1949x.f4451e.mo4659h(1))) {
            z = false;
        } else if (!this.f4431a) {
            this.f4431a = true;
            InterfaceC1919E interfaceC1919EM4703o = abstractC1949x.m4703o();
            C1285k c1285kM4688d = m4688d(abstractC1949x);
            StringBuilder sbM3589b = C1434P.m3589b("missing ");
            sbM3589b.append(c1285kM4688d.m3215l(C1632D.f3721o));
            sbM3589b.append(" at ");
            sbM3589b.append(m4689e(interfaceC1919EM4703o));
            abstractC1949x.m4706r(interfaceC1919EM4703o, sbM3589b.toString(), null);
        }
        if (!z) {
            if (this.f4434d == null) {
                throw new C1943r(abstractC1949x);
            }
            throw new C1943r(abstractC1949x, this.f4435e, this.f4434d);
        }
        InterfaceC1919E interfaceC1919EM4703o2 = abstractC1949x.m4703o();
        C1285k c1285kM4688d2 = m4688d(abstractC1949x);
        int iM3210e = !c1285kM4688d2.m3211f() ? c1285kM4688d2.m3210e() : 0;
        if (iM3210e == -1) {
            string = "<missing EOF>";
        } else {
            StringBuilder sbM3589b2 = C1434P.m3589b("<missing ");
            sbM3589b2.append(C1632D.f3721o.m4648a(iM3210e));
            sbM3589b2.append(">");
            string = sbM3589b2.toString();
        }
        String str = string;
        InterfaceC1919E interfaceC1919EMo4647g = abstractC1949x.f4451e.mo4647g(-1);
        if (interfaceC1919EM4703o2.getType() == -1 && interfaceC1919EMo4647g != null) {
            interfaceC1919EM4703o2 = interfaceC1919EMo4647g;
        }
        return ((C1930e) abstractC1949x.f4451e.mo4645b().mo4644c()).m4669a(new C1288n(interfaceC1919EM4703o2.mo4639b(), interfaceC1919EM4703o2.mo4639b().mo4643b()), iM3210e, str, 0, -1, -1, interfaceC1919EM4703o2.getLine(), interfaceC1919EM4703o2.mo4638a());
    }

    /* JADX INFO: renamed from: h */
    public final void m4690h(AbstractC1949x abstractC1949x, C1915A c1915a) {
        String strMo4646c;
        if (this.f4431a) {
            return;
        }
        this.f4431a = true;
        if (c1915a instanceof C1947v) {
            C1947v c1947v = (C1947v) c1915a;
            InterfaceC1922H interfaceC1922H = abstractC1949x.f4451e;
            if (interfaceC1922H != null) {
                strMo4646c = c1947v.m4697f().getType() == -1 ? "<EOF>" : interfaceC1922H.mo4646c(c1947v.m4697f(), c1947v.m4629c());
            } else {
                strMo4646c = "<unknown input>";
            }
            StringBuilder sbM3589b = C1434P.m3589b("no viable alternative at input ");
            sbM3589b.append(m4686b(strMo4646c));
            abstractC1949x.m4706r(c1947v.m4629c(), sbM3589b.toString(), c1947v);
            return;
        }
        if (c1915a instanceof C1943r) {
            C1915A c1915a2 = (C1943r) c1915a;
            StringBuilder sbM3589b2 = C1434P.m3589b("mismatched input ");
            sbM3589b2.append(m4689e(c1915a2.m4629c()));
            sbM3589b2.append(" expecting ");
            C1285k c1285kM4627a = c1915a2.m4627a();
            ((C1632D) abstractC1949x).getClass();
            sbM3589b2.append(c1285kM4627a.m3215l(C1632D.f3721o));
            abstractC1949x.m4706r(c1915a2.m4629c(), sbM3589b2.toString(), c1915a2);
            return;
        }
        if (!(c1915a instanceof C1942q)) {
            PrintStream printStream = System.err;
            StringBuilder sbM3589b3 = C1434P.m3589b("unknown recognition error type: ");
            sbM3589b3.append(c1915a.getClass().getName());
            printStream.println(sbM3589b3.toString());
            abstractC1949x.m4706r(c1915a.m4629c(), c1915a.getMessage(), c1915a);
            return;
        }
        C1915A c1915a3 = (C1942q) c1915a;
        ((C1632D) abstractC1949x).getClass();
        abstractC1949x.m4706r(c1915a3.m4629c(), "rule " + C1632D.f3720n[abstractC1949x.f4453g.mo3830e()] + " " + c1915a3.getMessage(), c1915a3);
    }

    /* JADX INFO: renamed from: i */
    public final void m4691i() {
        this.f4431a = false;
        this.f4433c = null;
        this.f4432b = -1;
    }

    /* JADX INFO: renamed from: j */
    protected final void m4692j(AbstractC1949x abstractC1949x) {
        if (this.f4431a) {
            return;
        }
        this.f4431a = true;
        InterfaceC1919E interfaceC1919EM4703o = abstractC1949x.m4703o();
        abstractC1949x.m4706r(interfaceC1919EM4703o, "extraneous input " + m4689e(interfaceC1919EM4703o) + " expecting " + m4688d(abstractC1949x).m3215l(C1632D.f3721o), null);
    }

    /* JADX INFO: renamed from: k */
    protected final InterfaceC1919E m4693k(AbstractC1949x abstractC1949x) {
        if (!m4688d(abstractC1949x).m3209d(abstractC1949x.f4451e.mo4659h(2))) {
            return null;
        }
        m4692j(abstractC1949x);
        abstractC1949x.m4698j();
        InterfaceC1919E interfaceC1919EM4703o = abstractC1949x.m4703o();
        m4691i();
        return interfaceC1919EM4703o;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.y.m>] */
    /* JADX INFO: renamed from: l */
    public final void m4694l(AbstractC1949x abstractC1949x) {
        AbstractC2001m abstractC2001m = (AbstractC2001m) ((C1969S) abstractC1949x.f4391b).f4557a.f4513a.get(abstractC1949x.m4634g());
        if (this.f4431a) {
            return;
        }
        int iMo4659h = abstractC1949x.f4451e.mo4659h(1);
        C1977a c1977a = C1632D.f3723q;
        C1285k c1285kM4763e = c1977a.m4763e(abstractC2001m);
        if (c1285kM4763e.m3209d(iMo4659h)) {
            this.f4434d = null;
            this.f4435e = -1;
            return;
        }
        if (c1285kM4763e.m3209d(-2)) {
            if (this.f4434d == null) {
                this.f4434d = abstractC1949x.f4453g;
                this.f4435e = abstractC1949x.m4634g();
                return;
            }
            return;
        }
        int iMo4730c = abstractC2001m.mo4730c();
        if (iMo4730c != 3 && iMo4730c != 4 && iMo4730c != 5) {
            switch (iMo4730c) {
                case 9:
                case 11:
                    m4692j(abstractC1949x);
                    C1285k c1285kM4761c = c1977a.m4761c(abstractC1949x.m4634g(), abstractC1949x.f4453g);
                    C1285k c1285kM4687c = m4687c(abstractC1949x);
                    C1285k c1285k = new C1285k(new int[0]);
                    c1285k.m3208c(c1285kM4761c);
                    c1285k.m3208c(c1285kM4687c);
                    m4685a(abstractC1949x, c1285k);
                    return;
                case 10:
                    break;
                default:
                    return;
            }
        }
        if (m4693k(abstractC1949x) == null) {
            throw new C1943r(abstractC1949x);
        }
    }
}
