package com.github.catvod.spider.support.p135u;

import com.github.catvod.spider.support.p134t.C2332y;
import com.github.catvod.spider.support.p137w.C2407i;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: com.github.catvod.spider.support.u.a */
/* JADX INFO: loaded from: classes.dex */
public final class C2359a {

    /* JADX INFO: renamed from: a */
    public final List<AbstractC2375i> f5835a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List<AbstractC2386r> f5836b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public C2357Y[] f5837c;

    /* JADX INFO: renamed from: d */
    public C2358Z[] f5838d;

    /* JADX INFO: renamed from: e */
    public final int f5839e;

    /* JADX INFO: renamed from: f */
    public final int f5840f;

    /* JADX INFO: renamed from: g */
    public int[] f5841g;

    /* JADX INFO: renamed from: h */
    public InterfaceC2392x[] f5842h;

    /* JADX INFO: renamed from: i */
    public final List<C2374h0> f5843i;

    public C2359a(int i, int i2) {
        new LinkedHashMap();
        this.f5843i = new ArrayList();
        this.f5839e = i;
        this.f5840f = i2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.i>] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.i>] */
    /* JADX INFO: renamed from: a */
    public final void m6344a(AbstractC2375i abstractC2375i) {
        if (abstractC2375i != null) {
            abstractC2375i.f5883a = this;
            abstractC2375i.f5884b = this.f5835a.size();
        }
        this.f5835a.add(abstractC2375i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.r>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.r>] */
    /* JADX INFO: renamed from: b */
    public final AbstractC2386r m6345b(int i) {
        if (this.f5836b.isEmpty()) {
            return null;
        }
        return (AbstractC2386r) this.f5836b.get(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.i>] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.i>] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.i>] */
    /* JADX INFO: renamed from: c */
    public final C2407i m6346c(int i, C2332y c2332y) {
        if (i < 0 || i >= this.f5835a.size()) {
            throw new IllegalArgumentException("Invalid state number.");
        }
        C2407i c2407iM6348e = m6348e((AbstractC2375i) this.f5835a.get(i));
        if (!c2407iM6348e.m6419d(-2)) {
            return c2407iM6348e;
        }
        C2407i c2407i = new C2407i(new int[0]);
        c2407i.m6418c(c2407iM6348e);
        c2407i.m6422h();
        while (c2332y != null && c2332y.f5801b >= 0 && c2407iM6348e.m6419d(-2)) {
            c2407iM6348e = m6348e(((C2360a0) ((AbstractC2375i) this.f5835a.get(c2332y.f5801b)).m6374d(0)).f5845c);
            c2407i.m6418c(c2407iM6348e);
            c2407i.m6422h();
            c2332y = c2332y.f5800a;
        }
        if (c2407iM6348e.m6419d(-2)) {
            c2407i.m6416a(-1);
        }
        return c2407i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<com.github.catvod.spider.support.u.r>] */
    /* JADX INFO: renamed from: d */
    public final int m6347d() {
        return this.f5836b.size();
    }

    /* JADX INFO: renamed from: e */
    public final C2407i m6348e(AbstractC2375i abstractC2375i) {
        C2407i c2407i = abstractC2375i.f5888f;
        if (c2407i != null) {
            return c2407i;
        }
        C2407i c2407iM6349f = m6349f(abstractC2375i, null);
        abstractC2375i.f5888f = c2407iM6349f;
        c2407iM6349f.m6423i();
        return abstractC2375i.f5888f;
    }

    /* JADX INFO: renamed from: f */
    public final C2407i m6349f(AbstractC2375i abstractC2375i, C2332y c2332y) {
        C2389u c2389u = new C2389u(this);
        C2407i c2407i = new C2407i(new int[0]);
        c2389u.m6376a(abstractC2375i, c2332y != null ? AbstractC2351S.m6329a(abstractC2375i.f5883a, c2332y) : null, c2407i, new HashSet(), new BitSet());
        return c2407i;
    }
}
