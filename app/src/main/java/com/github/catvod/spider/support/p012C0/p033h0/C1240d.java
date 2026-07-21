package com.github.catvod.spider.support.p012C0.p033h0;

import com.github.catvod.spider.support.p012C0.p026c0.C1053l;
import com.github.catvod.spider.support.p012C0.p027d.C1064d;
import com.github.catvod.spider.support.p012C0.p029e0.C1211g;
import com.github.catvod.spider.support.p012C0.p040x.C1264b;

/* JADX INFO: renamed from: com.github.catvod.spider.support.C0.h0.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1240d {

    /* JADX INFO: renamed from: a */
    private C1211g f2921a;

    /* JADX INFO: renamed from: b */
    private boolean f2922b = false;

    /* JADX INFO: renamed from: c */
    private C1240d f2923c;

    private C1240d(C1053l c1053l) {
        C1211g c1211g = new C1211g();
        this.f2921a = c1211g;
        c1211g.add(c1053l);
    }

    private C1240d(C1211g c1211g) {
        C1211g c1211g2 = new C1211g();
        this.f2921a = c1211g2;
        c1211g2.addAll(c1211g);
    }

    /* JADX INFO: renamed from: b */
    public static C1240d m3059b(C1053l c1053l) {
        return new C1240d(c1053l);
    }

    /* JADX INFO: renamed from: c */
    public static C1240d m3060c(C1211g c1211g) {
        return new C1240d(c1211g);
    }

    /* JADX INFO: renamed from: d */
    public static C1240d m3061d(C1240d c1240d) {
        C1240d c1240d2 = new C1240d(c1240d.f2921a);
        c1240d2.f2923c = c1240d;
        return c1240d2;
    }

    /* JADX INFO: renamed from: a */
    public final C1211g m3062a() {
        return this.f2921a;
    }

    /* JADX INFO: renamed from: e */
    public final C1240d m3063e() {
        return this.f2923c;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3064f() {
        return this.f2922b;
    }

    /* JADX INFO: renamed from: g */
    public final void m3065g() {
        this.f2922b = false;
    }

    /* JADX INFO: renamed from: h */
    final void m3066h() {
        this.f2922b = true;
    }

    /* JADX INFO: renamed from: i */
    public final void m3067i(C1211g c1211g) {
        this.f2921a = c1211g;
    }

    /* JADX INFO: renamed from: j */
    public final C1240d m3068j(C1240d c1240d) {
        this.f2923c = c1240d;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final C1053l m3069k() {
        if (this.f2921a.size() != 1) {
            StringBuilder sbM2774b = C1064d.m2774b("current context is more than one el,total = ");
            sbM2774b.append(this.f2921a.size());
            throw new C1264b(sbM2774b.toString());
        }
        C1211g c1211g = this.f2921a;
        if (c1211g.isEmpty()) {
            return null;
        }
        return c1211g.get(0);
    }
}
