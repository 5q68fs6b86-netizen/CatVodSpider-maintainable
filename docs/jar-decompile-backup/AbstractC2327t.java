package com.github.catvod.spider.support.p134t;

import com.github.catvod.spider.support.p135u.C2346M;
import com.github.catvod.spider.support.p137w.C2405g;
import com.github.catvod.spider.support.p138x.C2411a;
import com.github.catvod.spider.support.p138x.C2417g;
import com.github.catvod.spider.support.p138x.InterfaceC2413c;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p134t.t */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2327t extends AbstractC2331x<InterfaceC2333z, C2346M> {

    /* JADX INFO: renamed from: d */
    protected C2320m f5779d = new C2320m();

    /* JADX INFO: renamed from: e */
    protected InterfaceC2304C f5780e;

    /* JADX INFO: renamed from: f */
    protected final C2405g f5781f;

    /* JADX INFO: renamed from: g */
    protected C2328u f5782g;

    /* JADX INFO: renamed from: h */
    protected boolean f5783h;

    /* JADX INFO: renamed from: i */
    private a f5784i;

    /* JADX INFO: renamed from: j */
    protected List<InterfaceC2413c> f5785j;

    /* JADX INFO: renamed from: k */
    protected boolean f5786k;

    /* JADX INFO: renamed from: com.github.catvod.spider.support.p134t.t$a */
    public class a implements InterfaceC2413c {
    }

    static {
        new WeakHashMap();
    }

    public AbstractC2327t(InterfaceC2304C interfaceC2304C) {
        C2405g c2405g = new C2405g();
        this.f5781f = c2405g;
        c2405g.m6405a(0);
        this.f5783h = true;
        this.f5780e = null;
        C2320m c2320m = this.f5779d;
        c2320m.f5760a = false;
        c2320m.f5762c = null;
        c2320m.f5761b = -1;
        this.f5782g = null;
        this.f5786k = false;
        m6286r(this.f5784i);
        this.f5784i = null;
        c2405g.m6406b();
        c2405g.m6405a(0);
        ATNInterpreter atninterpreter = this.f5797b;
        if (atninterpreter != 0) {
            atninterpreter.mo6312a();
        }
        this.f5780e = interfaceC2304C;
    }

    @Override // com.github.catvod.spider.support.p134t.AbstractC2331x
    /* JADX INFO: renamed from: g */
    public final boolean mo6276g(int i) {
        C2405g c2405g = this.f5781f;
        return i >= c2405g.m6407c(c2405g.m6410f() + (-1));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p138x.c>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p138x.c>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p138x.c>] */
    /* JADX INFO: renamed from: i */
    public final InterfaceC2333z m6277i() {
        InterfaceC2333z interfaceC2333zM6282n = m6282n();
        if (interfaceC2333zM6282n.getType() != -1) {
            this.f5780e.mo6235i();
        }
        Object r1 = this.f5785j;
        boolean z = (r1 == 0 || r1.isEmpty()) ? false : true;
        if (this.f5783h || z) {
            if (this.f5779d.f5760a) {
                C2328u c2328u = this.f5782g;
                C2411a c2411a = new C2411a(interfaceC2333zM6282n);
                c2328u.getClass();
                c2328u.m6290g(c2411a);
                Object r2 = this.f5785j;
                if (r2 != 0) {
                    Iterator it = r2.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC2413c) it.next()).m6428a();
                    }
                }
            } else {
                C2328u c2328u2 = this.f5782g;
                C2417g c2417g = new C2417g(interfaceC2333zM6282n);
                c2328u2.getClass();
                c2328u2.m6290g(c2417g);
                Object r3 = this.f5785j;
                if (r3 != 0) {
                    Iterator it2 = r3.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC2413c) it2.next()).m6427Z(c2417g);
                    }
                }
            }
        }
        return interfaceC2333zM6282n;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p138x.b>] */
    /* JADX INFO: renamed from: j */
    public final void m6278j(C2328u c2328u) {
        C2328u c2328u2;
        C2328u c2328u3;
        if (this.f5783h && (c2328u2 = this.f5782g) != c2328u && (c2328u3 = (C2328u) c2328u2.f5800a) != null) {
            Object r1 = c2328u3.f5787d;
            if (r1 != 0) {
                r1.remove(r1.size() - 1);
            }
            c2328u3.m6290g(c2328u);
        }
        this.f5782g = c2328u;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p138x.c>] */
    /* JADX INFO: renamed from: k */
    public final void m6279k(C2328u c2328u, int i) {
        m6302h(i);
        this.f5782g = c2328u;
        c2328u.f5788e = this.f5780e.mo6222f(1);
        if (this.f5783h) {
            C2328u c2328u2 = this.f5782g;
            C2328u c2328u3 = (C2328u) c2328u2.f5800a;
            if (c2328u3 != null) {
                c2328u3.m6290g(c2328u2);
            }
        }
        Object r2 = this.f5785j;
        if (r2 != 0) {
            for (InterfaceC2413c interfaceC2413c : r2) {
                interfaceC2413c.m6426V(this.f5782g);
                this.f5782g.mo5283h(interfaceC2413c);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p138x.c>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p138x.c>] */
    /* JADX INFO: renamed from: l */
    public final void m6280l() {
        C2328u c2328u;
        InterfaceC2333z interfaceC2333zMo6222f;
        if (this.f5786k) {
            c2328u = this.f5782g;
            interfaceC2333zMo6222f = this.f5780e.mo6222f(1);
        } else {
            c2328u = this.f5782g;
            interfaceC2333zMo6222f = this.f5780e.mo6222f(-1);
        }
        c2328u.f5789f = interfaceC2333zMo6222f;
        Object r0 = this.f5785j;
        if (r0 != 0) {
            for (int size = r0.size() - 1; size >= 0; size--) {
                InterfaceC2413c interfaceC2413c = (InterfaceC2413c) this.f5785j.get(size);
                this.f5782g.mo5284i(interfaceC2413c);
                interfaceC2413c.m6429e0(this.f5782g);
            }
        }
        m6302h(this.f5782g.f5801b);
        this.f5782g = (C2328u) this.f5782g.f5800a;
    }

    /* JADX INFO: renamed from: m */
    public final C2328u m6281m() {
        return this.f5782g;
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC2333z m6282n() {
        return this.f5780e.mo6222f(1);
    }

    /* JADX INFO: renamed from: o */
    public final int m6283o() {
        if (this.f5781f.m6408d()) {
            return -1;
        }
        C2405g c2405g = this.f5781f;
        return c2405g.m6407c(c2405g.m6410f() - 1);
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC2333z m6284p(int i) {
        InterfaceC2333z interfaceC2333zM6282n = m6282n();
        if (interfaceC2333zM6282n.getType() == i) {
            if (i == -1) {
                this.f5786k = true;
            }
            this.f5779d.m6269i();
            m6277i();
        } else {
            interfaceC2333zM6282n = this.f5779d.mo5361g(this);
            if (this.f5783h && interfaceC2333zM6282n.mo6259c() == -1) {
                C2328u c2328u = this.f5782g;
                C2411a c2411a = new C2411a(interfaceC2333zM6282n);
                c2328u.getClass();
                c2328u.m6290g(c2411a);
            }
        }
        return interfaceC2333zM6282n;
    }

    /* JADX INFO: renamed from: q */
    public final void m6285q(InterfaceC2333z interfaceC2333z, String str, C2330w c2330w) {
        ((C2329v) m6299d()).mo6230d(this, interfaceC2333z, interfaceC2333z.getLine(), interfaceC2333z.mo6257a(), str, c2330w);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p138x.c>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.p138x.c>] */
    /* JADX INFO: renamed from: r */
    public final void m6286r(InterfaceC2413c interfaceC2413c) {
        Object r0 = this.f5785j;
        if (r0 != 0 && r0.remove(interfaceC2413c) && this.f5785j.isEmpty()) {
            this.f5785j = null;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m6287s(C2320m c2320m) {
        this.f5779d = c2320m;
    }
}
