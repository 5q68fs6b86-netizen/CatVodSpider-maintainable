package com.github.catvod.spider.support.p044FM.p066V;

import com.github.catvod.spider.support.p044FM.p055K.C1393m;
import com.github.catvod.spider.support.p044FM.p056L.C1434P;
import com.github.catvod.spider.support.p044FM.p057M.C1551g;
import com.github.catvod.spider.support.p044FM.p070Z.C1710e;

/* JADX INFO: renamed from: com.github.catvod.spider.support.p044FM.p066V.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1664e {

    /* JADX INFO: renamed from: a */
    private C1551g f3737a;

    /* JADX INFO: renamed from: b */
    private boolean f3738b = false;

    /* JADX INFO: renamed from: c */
    private C1664e f3739c;

    private C1664e(C1393m c1393m) {
        C1551g c1551g = new C1551g();
        this.f3737a = c1551g;
        c1551g.add(c1393m);
    }

    private C1664e(C1551g c1551g) {
        C1551g c1551g2 = new C1551g();
        this.f3737a = c1551g2;
        c1551g2.addAll(c1551g);
    }

    /* JADX INFO: renamed from: b */
    public static C1664e m3957b(C1393m c1393m) {
        return new C1664e(c1393m);
    }

    /* JADX INFO: renamed from: c */
    public static C1664e m3958c(C1551g c1551g) {
        return new C1664e(c1551g);
    }

    /* JADX INFO: renamed from: d */
    public static C1664e m3959d(C1664e c1664e) {
        C1664e c1664e2 = new C1664e(c1664e.f3737a);
        c1664e2.f3739c = c1664e;
        return c1664e2;
    }

    /* JADX INFO: renamed from: a */
    public final C1551g m3960a() {
        return this.f3737a;
    }

    /* JADX INFO: renamed from: e */
    public final C1664e m3961e() {
        return this.f3739c;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m3962f() {
        return this.f3738b;
    }

    /* JADX INFO: renamed from: g */
    public final void m3963g() {
        this.f3738b = false;
    }

    /* JADX INFO: renamed from: h */
    final void m3964h() {
        this.f3738b = true;
    }

    /* JADX INFO: renamed from: i */
    public final void m3965i(C1551g c1551g) {
        this.f3737a = c1551g;
    }

    /* JADX INFO: renamed from: j */
    public final C1664e m3966j(C1664e c1664e) {
        this.f3739c = c1664e;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final C1393m m3967k() {
        if (this.f3737a.size() == 1) {
            return this.f3737a.m3788e();
        }
        StringBuilder sbM3589b = C1434P.m3589b("current context is more than one el,total = ");
        sbM3589b.append(this.f3737a.size());
        throw new C1710e(sbM3589b.toString());
    }
}
