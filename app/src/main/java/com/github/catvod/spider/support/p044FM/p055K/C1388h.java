package com.github.catvod.spider.support.p044FM.p055K;

import com.github.catvod.spider.support.p044FM.p056L.C1412E;
import com.github.catvod.spider.support.p044FM.p056L.C1414F;
import com.github.catvod.spider.support.p044FM.p056L.C1416G;
import com.github.catvod.spider.support.p044FM.p056L.C1458b;
import com.github.catvod.spider.support.p044FM.p057M.C1563s;
import java.util.Iterator;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.K.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1388h extends C1393m {

    /* JADX INFO: renamed from: j */
    private C1387g f3197j;

    /* JADX INFO: renamed from: k */
    private C1414F f3198k;

    /* JADX INFO: renamed from: l */
    private int f3199l;

    static {
        new C1563s("title", 1);
    }

    public C1388h(String str) {
        super(C1416G.m3552m("#root", C1412E.f3294c), str, null);
        this.f3197j = new C1387g();
        this.f3199l = 1;
        this.f3198k = new C1414F(new C1458b());
    }

    /* JADX INFO: renamed from: A0 */
    public final C1387g m3424A0() {
        return this.f3197j;
    }

    /* JADX INFO: renamed from: B0 */
    public final C1388h m3425B0(C1414F c1414f) {
        this.f3198k = c1414f;
        return this;
    }

    /* JADX INFO: renamed from: C0 */
    public final C1414F m3426C0() {
        return this.f3198k;
    }

    /* JADX INFO: renamed from: D0 */
    public final C1388h m3427D0() {
        this.f3199l = 2;
        return this;
    }

    /* JADX INFO: renamed from: E0 */
    public final int m3428E0() {
        return this.f3199l;
    }

    /* JADX INFO: renamed from: F0 */
    public final C1388h m3429F0() {
        C1388h c1388h = new C1388h(mo3465e());
        C1383c c1383c = this.f3208g;
        if (c1383c != null) {
            c1388h.f3208g = c1383c.clone();
        }
        c1388h.f3197j = this.f3197j.clone();
        return c1388h;
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.C1393m, com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: s */
    public final String mo3405s() {
        return "#document";
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: t */
    public final String mo3431t() {
        return m3462c0();
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.C1393m
    /* JADX INFO: renamed from: u0 */
    public final C1393m mo3432u0(String str) {
        m3433y0().mo3432u0(str);
        return this;
    }

    /* JADX INFO: renamed from: y0 */
    public final C1393m m3433y0() {
        C1393m c1393mM3450N;
        Iterator<C1393m> it = m3455U().iterator();
        do {
            if (!it.hasNext()) {
                c1393mM3450N = m3450N("html");
                break;
            }
            c1393mM3450N = it.next();
        } while (!c1393mM3450N.m3469i0().equals("html"));
        for (C1393m c1393m : c1393mM3450N.m3455U()) {
            if ("body".equals(c1393m.m3469i0()) || "frameset".equals(c1393m.m3469i0())) {
                return c1393m;
            }
        }
        return c1393mM3450N.m3450N("body");
    }

    @Override // com.github.catvod.spider.support.p044FM.p055K.C1393m, com.github.catvod.spider.support.p044FM.p055K.AbstractC1399s
    /* JADX INFO: renamed from: z0, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C1388h mo3404i() {
        C1388h c1388h = (C1388h) super.mo3404i();
        c1388h.f3197j = this.f3197j.clone();
        return c1388h;
    }
}
