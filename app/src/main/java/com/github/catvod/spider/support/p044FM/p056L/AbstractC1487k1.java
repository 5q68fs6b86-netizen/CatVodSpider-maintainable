package com.github.catvod.spider.support.p044FM.p056L;

import com.github.catvod.spider.support.p044FM.p053I.C1377c;
import com.github.catvod.spider.support.p044FM.p055K.C1383c;
import com.github.catvod.spider.support.p044FM.p055K.C1388h;
import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.L.k1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1487k1 {

    /* JADX INFO: renamed from: a */
    protected C1414F f3468a;

    /* JADX INFO: renamed from: b */
    C1455a f3469b;

    /* JADX INFO: renamed from: c */
    C1441T f3470c;

    /* JADX INFO: renamed from: d */
    protected C1388h f3471d;

    /* JADX INFO: renamed from: e */
    protected ArrayList<C1393m> f3472e;

    /* JADX INFO: renamed from: f */
    protected String f3473f;

    /* JADX INFO: renamed from: g */
    protected AbstractC1436Q f3474g;

    /* JADX INFO: renamed from: h */
    protected C1412E f3475h;

    /* JADX INFO: renamed from: i */
    protected Map<String, C1416G> f3476i;

    /* JADX INFO: renamed from: j */
    private C1430N f3477j = new C1430N();

    /* JADX INFO: renamed from: k */
    private C1428M f3478k = new C1428M();

    AbstractC1487k1() {
    }

    /* JADX INFO: renamed from: a */
    protected final C1393m m3755a() {
        int size = this.f3472e.size();
        return size > 0 ? this.f3472e.get(size - 1) : this.f3471d;
    }

    /* JADX INFO: renamed from: b */
    protected final boolean m3756b(String str) {
        C1393m c1393mM3755a;
        return (this.f3472e.size() == 0 || (c1393mM3755a = m3755a()) == null || !c1393mM3755a.m3469i0().equals(str)) ? false : true;
    }

    /* JADX INFO: renamed from: c */
    abstract C1412E mo3710c();

    @ParametersAreNonnullByDefault
    /* JADX INFO: renamed from: d */
    protected void mo3712d(Reader reader, String str, C1414F c1414f) {
        C1377c.m3361h(str, "baseUri");
        C1377c.m3360g(c1414f);
        C1388h c1388h = new C1388h(str);
        this.f3471d = c1388h;
        c1388h.m3425B0(c1414f);
        this.f3468a = c1414f;
        this.f3475h = c1414f.m3549f();
        C1455a c1455a = new C1455a(reader, 32768);
        this.f3469b = c1455a;
        c1455a.m3656O(c1414f.m3547c());
        this.f3474g = null;
        this.f3470c = new C1441T(this.f3469b, c1414f.m3545a());
        this.f3472e = new ArrayList<>(32);
        this.f3476i = new HashMap();
        this.f3473f = str;
    }

    /* JADX INFO: renamed from: e */
    protected boolean mo3714e(String str) {
        return false;
    }

    @ParametersAreNonnullByDefault
    /* JADX INFO: renamed from: f */
    final C1388h m3757f(Reader reader, String str, C1414F c1414f) {
        AbstractC1436Q abstractC1436QM3635u;
        mo3712d(reader, str, c1414f);
        C1441T c1441t = this.f3470c;
        do {
            abstractC1436QM3635u = c1441t.m3635u();
            mo3717g(abstractC1436QM3635u);
            abstractC1436QM3635u.mo3564h();
        } while (abstractC1436QM3635u.f3337a != 6);
        this.f3469b.m3660d();
        this.f3469b = null;
        this.f3470c = null;
        this.f3472e = null;
        this.f3476i = null;
        return this.f3471d;
    }

    /* JADX INFO: renamed from: g */
    protected abstract boolean mo3717g(AbstractC1436Q abstractC1436Q);

    /* JADX INFO: renamed from: h */
    protected final boolean m3758h(String str) {
        AbstractC1436Q abstractC1436Q = this.f3474g;
        C1428M c1428m = this.f3478k;
        if (abstractC1436Q == c1428m) {
            C1428M c1428m2 = new C1428M();
            c1428m2.m3584v(str);
            return mo3717g(c1428m2);
        }
        c1428m.mo3564h();
        c1428m.m3584v(str);
        return mo3717g(c1428m);
    }

    /* JADX INFO: renamed from: i */
    public boolean m3759i(C1383c c1383c) {
        String str;
        C1430N c1430n = this.f3477j;
        if (this.f3474g == c1430n) {
            c1430n = new C1430N();
            c1430n.f3326d = "input";
            c1430n.f3336n = c1383c;
            str = "input";
        } else {
            c1430n.mo3564h();
            c1430n.f3326d = "input";
            c1430n.f3336n = c1383c;
            str = "input";
        }
        c1430n.f3327e = str;
        return mo3717g(c1430n);
    }

    /* JADX INFO: renamed from: j */
    protected final boolean m3760j(String str) {
        C1430N c1430n = this.f3477j;
        if (this.f3474g == c1430n) {
            c1430n = new C1430N();
        } else {
            c1430n.mo3564h();
        }
        c1430n.m3584v(str);
        return mo3717g(c1430n);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.FM.L.G>] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.HashMap, java.util.Map<java.lang.String, com.github.catvod.spider.support.FM.L.G>] */
    /* JADX INFO: renamed from: k */
    protected final C1416G m3761k(String str, C1412E c1412e) {
        C1416G c1416g = (C1416G) this.f3476i.get(str);
        if (c1416g != null) {
            return c1416g;
        }
        C1416G c1416gM3552m = C1416G.m3552m(str, c1412e);
        this.f3476i.put(str, c1416gM3552m);
        return c1416gM3552m;
    }
}
