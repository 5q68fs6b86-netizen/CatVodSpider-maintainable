package com.github.catvod.spider.support.p106L;

import com.github.catvod.spider.support.p101G.C2037i;
import com.github.catvod.spider.support.p103I.C2060c;
import com.github.catvod.spider.support.p110P.C2122e;
import com.github.catvod.spider.support.p116a.C2137a;

/* JADX INFO: renamed from: com.github.catvod.spider.support.L.e */
/* JADX INFO: loaded from: classes.dex */
public final class C2077e {

    /* JADX INFO: renamed from: a */
    private C2060c f4964a;

    /* JADX INFO: renamed from: b */
    private boolean f4965b = false;

    /* JADX INFO: renamed from: c */
    private C2077e f4966c;

    private C2077e(C2037i c2037i) {
        C2060c c2060c = new C2060c();
        this.f4964a = c2060c;
        c2060c.add(c2037i);
    }

    private C2077e(C2060c c2060c) {
        C2060c c2060c2 = new C2060c();
        this.f4964a = c2060c2;
        c2060c2.addAll(c2060c);
    }

    /* JADX INFO: renamed from: b */
    public static C2077e m5326b(C2037i c2037i) {
        return new C2077e(c2037i);
    }

    /* JADX INFO: renamed from: c */
    public static C2077e m5327c(C2060c c2060c) {
        return new C2077e(c2060c);
    }

    /* JADX INFO: renamed from: d */
    public static C2077e m5328d(C2077e c2077e) {
        C2077e c2077e2 = new C2077e(c2077e.f4964a);
        c2077e2.f4966c = c2077e;
        return c2077e2;
    }

    /* JADX INFO: renamed from: a */
    public final C2060c m5329a() {
        return this.f4964a;
    }

    /* JADX INFO: renamed from: e */
    public final C2077e m5330e() {
        return this.f4966c;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m5331f() {
        return this.f4965b;
    }

    /* JADX INFO: renamed from: g */
    public final void m5332g() {
        this.f4965b = false;
    }

    /* JADX INFO: renamed from: h */
    final void m5333h() {
        this.f4965b = true;
    }

    /* JADX INFO: renamed from: i */
    public final void m5334i(C2060c c2060c) {
        this.f4964a = c2060c;
    }

    /* JADX INFO: renamed from: j */
    public final C2077e m5335j(C2077e c2077e) {
        this.f4966c = c2077e;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final C2037i m5336k() {
        if (this.f4964a.size() == 1) {
            return this.f4964a.m5180b();
        }
        StringBuilder sbM5396a = C2137a.m5396a("current context is more than one el,total = ");
        sbM5396a.append(this.f4964a.size());
        throw new C2122e(sbM5396a.toString());
    }
}
