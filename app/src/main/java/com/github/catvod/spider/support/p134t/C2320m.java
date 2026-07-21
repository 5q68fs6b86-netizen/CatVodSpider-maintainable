package com.github.catvod.spider.support.p134t;

import com.github.catvod.spider.support.p105K.C2071d;
import com.github.catvod.spider.support.p116a.C2137a;
import com.github.catvod.spider.support.p117b.C2185u;
import com.github.catvod.spider.support.p135u.AbstractC2375i;
import com.github.catvod.spider.support.p135u.C2346M;
import com.github.catvod.spider.support.p135u.C2359a;
import com.github.catvod.spider.support.p135u.C2360a0;
import com.github.catvod.spider.support.p137w.C2407i;
import com.github.catvod.spider.support.p137w.C2409k;
import java.io.PrintStream;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p134t.m */
/* JADX INFO: loaded from: classes.dex */
public class C2320m {

    /* JADX INFO: renamed from: a */
    protected boolean f5760a = false;

    /* JADX INFO: renamed from: b */
    protected int f5761b = -1;

    /* JADX INFO: renamed from: c */
    protected C2407i f5762c;

    /* JADX INFO: renamed from: d */
    protected C2328u f5763d;

    /* JADX INFO: renamed from: e */
    protected int f5764e;

    /* JADX INFO: renamed from: a */
    protected final void m6263a(AbstractC2327t abstractC2327t, C2407i c2407i) {
        InterfaceC2304C interfaceC2304C = abstractC2327t.f5780e;
        while (true) {
            int iMo6233g = interfaceC2304C.mo6233g(1);
            if (iMo6233g == -1 || c2407i.m6419d(iMo6233g)) {
                return;
            }
            abstractC2327t.m6277i();
            interfaceC2304C = abstractC2327t.f5780e;
        }
    }

    /* JADX INFO: renamed from: b */
    protected final String m6264b(String str) {
        return C2185u.m5754a("'", str.replace("\n", "\\n").replace("\r", "\\r").replace("\t", "\\t"), "'");
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX INFO: renamed from: c */
    protected final C2407i m6265c(AbstractC2327t abstractC2327t) {
        C2359a c2359a = ((C2346M) abstractC2327t.f5797b).f5881a;
        C2407i c2407i = new C2407i(new int[0]);
        for (C2332y c2332y = abstractC2327t.f5782g; c2332y != null; c2332y = c2332y.f5800a) {
            int i = c2332y.f5801b;
            if (i < 0) {
                break;
            }
            c2407i.m6418c(c2359a.m6348e(((C2360a0) ((AbstractC2375i) c2359a.f5835a.get(i)).m6374d(0)).f5845c));
        }
        c2407i.m6422h();
        return c2407i;
    }

    /* JADX INFO: renamed from: d */
    protected final C2407i m6266d(AbstractC2327t abstractC2327t) {
        abstractC2327t.getClass();
        return C2071d.f4953q.m6346c(abstractC2327t.m6301f(), abstractC2327t.f5782g);
    }

    /* JADX INFO: renamed from: e */
    protected final String m6267e(InterfaceC2333z interfaceC2333z) {
        if (interfaceC2333z == null) {
            return "<no token>";
        }
        String text = interfaceC2333z.getText();
        if (text == null) {
            if (interfaceC2333z.getType() == -1) {
                text = "<EOF>";
            } else {
                StringBuilder sbM5396a = C2137a.m5396a("<");
                sbM5396a.append(interfaceC2333z.getType());
                sbM5396a.append(">");
                text = sbM5396a.toString();
            }
        }
        return m6264b(text);
    }

    /* JADX INFO: renamed from: f */
    public void mo5360f(AbstractC2327t abstractC2327t, C2330w c2330w) {
        C2407i c2407i;
        if (this.f5761b == abstractC2327t.f5780e.mo6234h() && (c2407i = this.f5762c) != null && c2407i.m6419d(abstractC2327t.m6301f())) {
            abstractC2327t.m6277i();
        }
        this.f5761b = abstractC2327t.f5780e.mo6234h();
        if (this.f5762c == null) {
            this.f5762c = new C2407i(new int[0]);
        }
        this.f5762c.m6416a(abstractC2327t.m6301f());
        m6263a(abstractC2327t, m6265c(abstractC2327t));
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX INFO: renamed from: g */
    public InterfaceC2333z mo5361g(AbstractC2327t abstractC2327t) {
        String string;
        InterfaceC2333z interfaceC2333zM6271k = m6271k(abstractC2327t);
        if (interfaceC2333zM6271k != null) {
            abstractC2327t.m6277i();
            return interfaceC2333zM6271k;
        }
        boolean z = true;
        if (!((C2346M) abstractC2327t.f5797b).f5881a.m6349f(((AbstractC2375i) ((C2346M) abstractC2327t.f5797b).f5881a.f5835a.get(abstractC2327t.m6301f())).m6374d(0).f5889a, abstractC2327t.f5782g).m6419d(abstractC2327t.f5780e.mo6233g(1))) {
            z = false;
        } else if (!this.f5760a) {
            this.f5760a = true;
            InterfaceC2333z interfaceC2333zM6282n = abstractC2327t.m6282n();
            C2407i c2407iM6266d = m6266d(abstractC2327t);
            StringBuilder sbM5396a = C2137a.m5396a("missing ");
            sbM5396a.append(c2407iM6266d.m6425l(C2071d.f4951o));
            sbM5396a.append(" at ");
            sbM5396a.append(m6267e(interfaceC2333zM6282n));
            abstractC2327t.m6285q(interfaceC2333zM6282n, sbM5396a.toString(), null);
        }
        if (!z) {
            if (this.f5763d == null) {
                throw new C2322o(abstractC2327t);
            }
            throw new C2322o(abstractC2327t, this.f5764e, this.f5763d);
        }
        InterfaceC2333z interfaceC2333zM6282n2 = abstractC2327t.m6282n();
        C2407i c2407iM6266d2 = m6266d(abstractC2327t);
        int iM6420e = !c2407iM6266d2.m6421f() ? c2407iM6266d2.m6420e() : 0;
        if (iM6420e == -1) {
            string = "<missing EOF>";
        } else {
            StringBuilder sbM5396a2 = C2137a.m5396a("<missing ");
            sbM5396a2.append(C2071d.f4951o.m6223a(iM6420e));
            sbM5396a2.append(">");
            string = sbM5396a2.toString();
        }
        String str = string;
        InterfaceC2333z interfaceC2333zMo6222f = abstractC2327t.f5780e.mo6222f(-1);
        if (interfaceC2333zM6282n2.getType() == -1 && interfaceC2333zMo6222f != null) {
            interfaceC2333zM6282n2 = interfaceC2333zMo6222f;
        }
        return ((C2317j) abstractC2327t.f5780e.mo6221b().mo6219b()).m6261a(new C2409k(interfaceC2333zM6282n2.mo6258b(), interfaceC2333zM6282n2.mo6258b().getInputStream()), iM6420e, str, 0, -1, -1, interfaceC2333zM6282n2.getLine(), interfaceC2333zM6282n2.mo6257a());
    }

    /* JADX INFO: renamed from: h */
    public final void m6268h(AbstractC2327t abstractC2327t, C2330w c2330w) {
        String strMo6220a;
        if (this.f5760a) {
            return;
        }
        this.f5760a = true;
        if (c2330w instanceof C2326s) {
            C2326s c2326s = (C2326s) c2330w;
            InterfaceC2304C interfaceC2304C = abstractC2327t.f5780e;
            if (interfaceC2304C != null) {
                strMo6220a = c2326s.m6275f().getType() == -1 ? "<EOF>" : interfaceC2304C.mo6220a(c2326s.m6275f(), c2326s.m6296c());
            } else {
                strMo6220a = "<unknown input>";
            }
            StringBuilder sbM5396a = C2137a.m5396a("no viable alternative at input ");
            sbM5396a.append(m6264b(strMo6220a));
            abstractC2327t.m6285q(c2326s.m6296c(), sbM5396a.toString(), c2326s);
            return;
        }
        if (c2330w instanceof C2322o) {
            C2330w c2330w2 = (C2322o) c2330w;
            StringBuilder sbM5396a2 = C2137a.m5396a("mismatched input ");
            sbM5396a2.append(m6267e(c2330w2.m6296c()));
            sbM5396a2.append(" expecting ");
            C2407i c2407iM6294a = c2330w2.m6294a();
            ((C2071d) abstractC2327t).getClass();
            sbM5396a2.append(c2407iM6294a.m6425l(C2071d.f4951o));
            abstractC2327t.m6285q(c2330w2.m6296c(), sbM5396a2.toString(), c2330w2);
            return;
        }
        if (!(c2330w instanceof C2321n)) {
            PrintStream printStream = System.err;
            StringBuilder sbM5396a3 = C2137a.m5396a("unknown recognition error type: ");
            sbM5396a3.append(c2330w.getClass().getName());
            printStream.println(sbM5396a3.toString());
            abstractC2327t.m6285q(c2330w.m6296c(), c2330w.getMessage(), c2330w);
            return;
        }
        C2330w c2330w3 = (C2321n) c2330w;
        ((C2071d) abstractC2327t).getClass();
        abstractC2327t.m6285q(c2330w3.m6296c(), "rule " + C2071d.f4950n[abstractC2327t.f5782g.mo5282e()] + " " + c2330w3.getMessage(), c2330w3);
    }

    /* JADX INFO: renamed from: i */
    public final void m6269i() {
        this.f5760a = false;
        this.f5762c = null;
        this.f5761b = -1;
    }

    /* JADX INFO: renamed from: j */
    protected final void m6270j(AbstractC2327t abstractC2327t) {
        if (this.f5760a) {
            return;
        }
        this.f5760a = true;
        InterfaceC2333z interfaceC2333zM6282n = abstractC2327t.m6282n();
        abstractC2327t.m6285q(interfaceC2333zM6282n, "extraneous input " + m6267e(interfaceC2333zM6282n) + " expecting " + m6266d(abstractC2327t).m6425l(C2071d.f4951o), null);
    }

    /* JADX INFO: renamed from: k */
    protected final InterfaceC2333z m6271k(AbstractC2327t abstractC2327t) {
        if (!m6266d(abstractC2327t).m6419d(abstractC2327t.f5780e.mo6233g(2))) {
            return null;
        }
        m6270j(abstractC2327t);
        abstractC2327t.m6277i();
        InterfaceC2333z interfaceC2333zM6282n = abstractC2327t.m6282n();
        m6269i();
        return interfaceC2333zM6282n;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p135u.i>] */
    /* JADX INFO: renamed from: l */
    public final void m6272l(AbstractC2327t abstractC2327t) {
        AbstractC2375i abstractC2375i = (AbstractC2375i) ((C2346M) abstractC2327t.f5797b).f5881a.f5835a.get(abstractC2327t.m6301f());
        if (this.f5760a) {
            return;
        }
        int iMo6233g = abstractC2327t.f5780e.mo6233g(1);
        C2359a c2359a = C2071d.f4953q;
        C2407i c2407iM6348e = c2359a.m6348e(abstractC2375i);
        if (c2407iM6348e.m6419d(iMo6233g)) {
            this.f5763d = null;
            this.f5764e = -1;
            return;
        }
        if (c2407iM6348e.m6419d(-2)) {
            if (this.f5763d == null) {
                this.f5763d = abstractC2327t.f5782g;
                this.f5764e = abstractC2327t.m6301f();
                return;
            }
            return;
        }
        int iMo6308c = abstractC2375i.mo6308c();
        if (iMo6308c != 3 && iMo6308c != 4 && iMo6308c != 5) {
            switch (iMo6308c) {
                case 9:
                case 11:
                    m6270j(abstractC2327t);
                    C2407i c2407iM6346c = c2359a.m6346c(abstractC2327t.m6301f(), abstractC2327t.f5782g);
                    C2407i c2407iM6265c = m6265c(abstractC2327t);
                    C2407i c2407i = new C2407i(new int[0]);
                    c2407i.m6418c(c2407iM6346c);
                    c2407i.m6418c(c2407iM6265c);
                    m6263a(abstractC2327t, c2407i);
                    return;
                case 10:
                    break;
                default:
                    return;
            }
        }
        if (m6271k(abstractC2327t) == null) {
            throw new C2322o(abstractC2327t);
        }
    }
}
