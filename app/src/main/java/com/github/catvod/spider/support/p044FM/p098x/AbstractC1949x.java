package com.github.catvod.spider.support.p044FM.p098x;

import com.github.catvod.spider.support.p044FM.p045A.C1283i;
import com.github.catvod.spider.support.p044FM.p046B.C1291a;
import com.github.catvod.spider.support.p044FM.p046B.C1297g;
import com.github.catvod.spider.support.p044FM.p046B.InterfaceC1293c;
import com.github.catvod.spider.support.p044FM.p099y.C1969S;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.github.catvod.spider.support.FM.x.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1949x extends AbstractC1917C<InterfaceC1919E, C1969S> {

    /* JADX INFO: renamed from: d */
    protected C1941p f4450d = new C1941p();

    /* JADX INFO: renamed from: e */
    protected InterfaceC1922H f4451e;

    /* JADX INFO: renamed from: f */
    protected final C1283i f4452f;

    /* JADX INFO: renamed from: g */
    protected C1950y f4453g;

    /* JADX INFO: renamed from: h */
    protected boolean f4454h;

    /* JADX INFO: renamed from: i */
    private C1948w f4455i;

    /* JADX INFO: renamed from: j */
    protected List<InterfaceC1293c> f4456j;

    /* JADX INFO: renamed from: k */
    protected boolean f4457k;

    static {
        new WeakHashMap();
    }

    public AbstractC1949x(InterfaceC1922H interfaceC1922H) {
        C1283i c1283i = new C1283i();
        this.f4452f = c1283i;
        c1283i.m3195a(0);
        this.f4454h = true;
        this.f4451e = null;
        C1941p c1941p = this.f4450d;
        c1941p.f4431a = false;
        c1941p.f4433c = null;
        c1941p.f4432b = -1;
        this.f4453g = null;
        this.f4457k = false;
        m4707s(this.f4455i);
        this.f4455i = null;
        c1283i.m3196b();
        c1283i.m3195a(0);
        ATNInterpreter atninterpreter = this.f4391b;
        if (atninterpreter != 0) {
            atninterpreter.mo4713a();
        }
        this.f4451e = interfaceC1922H;
    }

    @Override // com.github.catvod.spider.support.p044FM.p098x.AbstractC1917C
    /* JADX INFO: renamed from: h */
    public final boolean mo4635h(int i) {
        C1283i c1283i = this.f4452f;
        return i >= c1283i.m3197c(c1283i.m3200f() + (-1));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.B.c>] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.B.c>] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.B.c>] */
    /* JADX INFO: renamed from: j */
    public final InterfaceC1919E m4698j() {
        InterfaceC1919E interfaceC1919EM4703o = m4703o();
        if (interfaceC1919EM4703o.getType() != -1) {
            this.f4451e.mo4661j();
        }
        Object r1 = this.f4456j;
        boolean z = (r1 == 0 || r1.isEmpty()) ? false : true;
        if (this.f4454h || z) {
            if (this.f4450d.f4431a) {
                C1950y c1950y = this.f4453g;
                C1291a c1291a = new C1291a(interfaceC1919EM4703o);
                c1950y.getClass();
                c1950y.m4709g(c1291a);
                Object r2 = this.f4456j;
                if (r2 != 0) {
                    Iterator it = r2.iterator();
                    while (it.hasNext()) {
                        ((InterfaceC1293c) it.next()).m3237a();
                    }
                }
            } else {
                C1950y c1950y2 = this.f4453g;
                C1297g c1297g = new C1297g(interfaceC1919EM4703o);
                c1950y2.getClass();
                c1950y2.m4709g(c1297g);
                Object r3 = this.f4456j;
                if (r3 != 0) {
                    Iterator it2 = r3.iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1293c) it2.next()).m3235R(c1297g);
                    }
                }
            }
        }
        return interfaceC1919EM4703o;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.B.b>] */
    /* JADX INFO: renamed from: k */
    public final void m4699k(C1950y c1950y) {
        C1950y c1950y2;
        C1950y c1950y3;
        if (this.f4454h && (c1950y2 = this.f4453g) != c1950y && (c1950y3 = (C1950y) c1950y2.f4394a) != null) {
            Object r1 = c1950y3.f4458d;
            if (r1 != 0) {
                r1.remove(r1.size() - 1);
            }
            c1950y3.m4709g(c1950y);
        }
        this.f4453g = c1950y;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.B.c>] */
    /* JADX INFO: renamed from: l */
    public final void m4700l(C1950y c1950y, int i) {
        m4636i(i);
        this.f4453g = c1950y;
        c1950y.f4459e = this.f4451e.mo4647g(1);
        if (this.f4454h) {
            C1950y c1950y2 = this.f4453g;
            C1950y c1950y3 = (C1950y) c1950y2.f4394a;
            if (c1950y3 != null) {
                c1950y3.m4709g(c1950y2);
            }
        }
        Object r2 = this.f4456j;
        if (r2 != 0) {
            for (InterfaceC1293c interfaceC1293c : r2) {
                interfaceC1293c.m3238c(this.f4453g);
                this.f4453g.mo3831h(interfaceC1293c);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.B.c>] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.B.c>] */
    /* JADX INFO: renamed from: m */
    public final void m4701m() {
        C1950y c1950y;
        InterfaceC1919E interfaceC1919EMo4647g;
        if (this.f4457k) {
            c1950y = this.f4453g;
            interfaceC1919EMo4647g = this.f4451e.mo4647g(1);
        } else {
            c1950y = this.f4453g;
            interfaceC1919EMo4647g = this.f4451e.mo4647g(-1);
        }
        c1950y.f4460f = interfaceC1919EMo4647g;
        Object r0 = this.f4456j;
        if (r0 != 0) {
            for (int size = r0.size() - 1; size >= 0; size--) {
                InterfaceC1293c interfaceC1293c = (InterfaceC1293c) this.f4456j.get(size);
                this.f4453g.mo3832i(interfaceC1293c);
                interfaceC1293c.m3236X(this.f4453g);
            }
        }
        m4636i(this.f4453g.f4395b);
        this.f4453g = (C1950y) this.f4453g.f4394a;
    }

    /* JADX INFO: renamed from: n */
    public final C1950y m4702n() {
        return this.f4453g;
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC1919E m4703o() {
        return this.f4451e.mo4647g(1);
    }

    /* JADX INFO: renamed from: p */
    public final int m4704p() {
        if (this.f4452f.m3198d()) {
            return -1;
        }
        C1283i c1283i = this.f4452f;
        return c1283i.m3197c(c1283i.m3200f() - 1);
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC1919E m4705q(int i) {
        InterfaceC1919E interfaceC1919EM4703o = m4703o();
        if (interfaceC1919EM4703o.getType() == i) {
            if (i == -1) {
                this.f4457k = true;
            }
            this.f4450d.m4691i();
            m4698j();
        } else {
            interfaceC1919EM4703o = this.f4450d.mo3991g(this);
            if (this.f4454h && interfaceC1919EM4703o.mo4640c() == -1) {
                C1950y c1950y = this.f4453g;
                C1291a c1291a = new C1291a(interfaceC1919EM4703o);
                c1950y.getClass();
                c1950y.m4709g(c1291a);
            }
        }
        return interfaceC1919EM4703o;
    }

    /* JADX INFO: renamed from: r */
    public final void m4706r(InterfaceC1919E interfaceC1919E, String str, C1915A c1915a) {
        ((C1951z) m4632e()).mo4653b(this, interfaceC1919E, interfaceC1919E.getLine(), interfaceC1919E.mo4638a(), str, c1915a);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.B.c>] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.FM.B.c>] */
    /* JADX INFO: renamed from: s */
    public final void m4707s(InterfaceC1293c interfaceC1293c) {
        Object r0 = this.f4456j;
        if (r0 != 0 && r0.remove(interfaceC1293c) && this.f4456j.isEmpty()) {
            this.f4456j = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m4708t(C1941p c1941p) {
        this.f4450d = c1941p;
    }
}
