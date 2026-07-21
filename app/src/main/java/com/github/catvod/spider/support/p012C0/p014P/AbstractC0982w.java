package com.github.catvod.spider.support.p012C0.p014P;

import com.github.catvod.spider.support.C0.P.o;
import com.github.catvod.spider.support.C0.P.v;
import com.github.catvod.spider.support.p012C0.p015Q.C0988S;
import com.github.catvod.spider.support.p012C0.p017S.C1001h;
import com.github.catvod.spider.support.p012C0.p018T.C1005a;
import com.github.catvod.spider.support.p012C0.p018T.C1010g;
import com.github.catvod.spider.support.p012C0.p018T.InterfaceC1007c;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.P.w */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0982w extends AbstractC0967B<InterfaceC0969D, C0988S> {

    /* JADX INFO: renamed from: d */
    protected o f2381d = new o();

    /* JADX INFO: renamed from: e */
    protected InterfaceC0970G f2382e;

    /* JADX INFO: renamed from: f */
    protected final C1001h f2383f;

    /* JADX INFO: renamed from: g */
    protected C0983x f2384g;

    /* JADX INFO: renamed from: h */
    protected boolean f2385h;

    /* JADX INFO: renamed from: i */
    private v f2386i;

    /* JADX INFO: renamed from: j */
    protected List<InterfaceC1007c> f2387j;

    /* JADX INFO: renamed from: k */
    protected boolean f2388k;

    static {
        new WeakHashMap();
    }

    public AbstractC0982w(InterfaceC0970G interfaceC0970G) {
        C1001h c1001h = new C1001h();
        this.f2383f = c1001h;
        c1001h.a(0);
        this.f2385h = true;
        this.f2382e = null;
        o oVar = this.f2381d;
        oVar.a = false;
        oVar.c = null;
        oVar.b = -1;
        this.f2384g = null;
        this.f2388k = false;
        m2446u(this.f2386i);
        this.f2386i = null;
        c1001h.b();
        c1001h.a(0);
        ATNInterpreter atninterpreter = this.f2350b;
        if (atninterpreter != 0) {
            atninterpreter.mo2463a();
        }
        this.f2382e = interfaceC0970G;
    }

    @Override // com.github.catvod.spider.support.p012C0.p014P.AbstractC0967B
    /* JADX INFO: renamed from: j */
    public final boolean mo2387j(int i) {
        C1001h c1001h = this.f2383f;
        return i >= c1001h.c(c1001h.f() + (-1));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.T.c>] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.T.c>] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.T.c>] */
    /* JADX INFO: renamed from: l */
    public final InterfaceC0969D m2437l() {
        InterfaceC0969D interfaceC0969DM2442q = m2442q();
        if (interfaceC0969DM2442q.m2399e() != -1) {
            this.f2382e.mo2423j();
        }
        Object r0 = this.f2387j;
        boolean z = (r0 == 0 || r0.isEmpty()) ? false : true;
        if (this.f2385h || z) {
            if (this.f2381d.a) {
                C0983x c0983x = this.f2384g;
                C1005a c1005a = new C1005a(interfaceC0969DM2442q);
                c0983x.getClass();
                c0983x.m2448h(c1005a);
                Object r1 = this.f2387j;
                if (r1 != 0) {
                    Iterator it = r1.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1007c) it.next()).m2534a();
                    }
                }
            } else {
                C0983x c0983x2 = this.f2384g;
                C1010g c1010g = new C1010g(interfaceC0969DM2442q);
                c0983x2.getClass();
                c0983x2.m2448h(c1010g);
                Object r2 = this.f2387j;
                if (r2 != 0) {
                    Iterator it2 = r2.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1007c) it2.next()).m2535b(c1010g);
                    }
                }
            }
        }
        return interfaceC0969DM2442q;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.T.b>] */
    /* JADX INFO: renamed from: m */
    public final void m2438m(C0983x c0983x) {
        C0983x c0983x2;
        C0983x c0983x3;
        if (this.f2385h && (c0983x2 = this.f2384g) != c0983x && (c0983x3 = (C0983x) c0983x2.f2353a) != null) {
            Object r1 = c0983x3.f2389d;
            if (r1 != 0) {
                r1.remove(r1.size() - 1);
            }
            c0983x3.m2448h(c0983x);
        }
        this.f2384g = c0983x;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.T.c>] */
    /* JADX INFO: renamed from: n */
    public final void m2439n(C0983x c0983x, int i) {
        m2388k(i);
        this.f2384g = c0983x;
        c0983x.f2390e = this.f2382e.m2403e(1);
        if (this.f2385h) {
            C0983x c0983x2 = this.f2384g;
            C0983x c0983x3 = (C0983x) c0983x2.f2353a;
            if (c0983x3 != null) {
                c0983x3.m2448h(c0983x2);
            }
        }
        Object r0 = this.f2387j;
        if (r0 != 0) {
            for (InterfaceC1007c interfaceC1007c : r0) {
                interfaceC1007c.m2536h(this.f2384g);
                this.f2384g.m2449i(interfaceC1007c);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.T.c>] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.T.c>] */
    /* JADX INFO: renamed from: o */
    public final void m2440o() {
        C0983x c0983x;
        InterfaceC0969D interfaceC0969DM2403e;
        if (this.f2388k) {
            c0983x = this.f2384g;
            interfaceC0969DM2403e = this.f2382e.m2403e(1);
        } else {
            c0983x = this.f2384g;
            interfaceC0969DM2403e = this.f2382e.m2403e(-1);
        }
        c0983x.f2391f = interfaceC0969DM2403e;
        Object r0 = this.f2387j;
        if (r0 != 0) {
            for (int size = r0.size() - 1; size >= 0; size--) {
                InterfaceC1007c interfaceC1007c = (InterfaceC1007c) this.f2387j.get(size);
                this.f2384g.m2450j(interfaceC1007c);
                interfaceC1007c.m2533S(this.f2384g);
            }
        }
        m2388k(this.f2384g.f2354b);
        this.f2384g = (C0983x) this.f2384g.f2353a;
    }

    /* JADX INFO: renamed from: p */
    public final C0983x m2441p() {
        return this.f2384g;
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC0969D m2442q() {
        return this.f2382e.m2403e(1);
    }

    /* JADX INFO: renamed from: r */
    public final int m2443r() {
        if (this.f2383f.d()) {
            return -1;
        }
        C1001h c1001h = this.f2383f;
        return c1001h.c(c1001h.f() - 1);
    }

    /* JADX INFO: renamed from: s */
    public final InterfaceC0969D m2444s(int i) {
        InterfaceC0969D interfaceC0969DM2442q = m2442q();
        if (interfaceC0969DM2442q.m2399e() == i) {
            if (i == -1) {
                this.f2388k = true;
            }
            this.f2381d.i();
            m2437l();
        } else {
            interfaceC0969DM2442q = this.f2381d.g(this);
            if (this.f2385h && interfaceC0969DM2442q.m2400g() == -1) {
                C0983x c0983x = this.f2384g;
                C1005a c1005a = new C1005a(interfaceC0969DM2442q);
                c0983x.getClass();
                c0983x.m2448h(c1005a);
            }
        }
        return interfaceC0969DM2442q;
    }

    /* JADX INFO: renamed from: t */
    public final void m2445t(InterfaceC0969D interfaceC0969D, String str, C0985z c0985z) {
        ((C0984y) m2384g()).m2454a(this, interfaceC0969D, interfaceC0969D.m2398d(), interfaceC0969D.m2395a(), str, c0985z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.T.c>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.C0.T.c>] */
    /* JADX INFO: renamed from: u */
    public final void m2446u(InterfaceC1007c interfaceC1007c) {
        Object r0 = this.f2387j;
        if (r0 != 0 && r0.remove(interfaceC1007c) && this.f2387j.isEmpty()) {
            this.f2387j = null;
        }
    }

    /* JADX INFO: renamed from: v */
    public final void m2447v(o oVar) {
        this.f2381d = oVar;
    }
}
